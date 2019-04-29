using Capstone.Model;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Xml;

namespace PermissionChecker.Extensions
{
    /// <summary>
    /// Represents extension methods for generating graph state from AndroidManfiest.xml nodes.
    /// </summary>
    public static class GraphMLExtensions
    {
        public static bool OnlyDangerousAPI { get; set; } = true;

        private static List<string> DangerousPermissions { get; } =
            File.ReadAllLines("dangerous.txt")
            .Select(d => d.Trim())
            .ToList();

        public static void AddHasPermission(this GraphML graph, Vertex manifest, XmlNode node)
        {
            var name = node.AndroidName();
            if (OnlyDangerousAPI)
            {
                if (DangerousPermissions.Contains(name) == false)
                {
                    return;
                }
            }

            var perm = graph.GetOrCreateVertex(
                id: $"perm__{name}",
                create: () => Vertex.Create(
                    id: $"perm__{name}",
                    properties: new
                    {
                        node_type = "enabled_permission"
                    }));

            graph.Graph.Children.Add(Edge.Create(
                source: manifest,
                target: perm,
                new
                {
                    enabled = bool.TrueString
                }));
        }

        public static void AddUseLibrary(this GraphML graph, Vertex manifest, XmlNode node)
        {
            var perm = graph.GetOrCreateVertex(
                id: $"lib__{node.Attributes["android:name"].Value}",
                create: () => Vertex.Create(
                    id: $"lib__{node.Attributes["android:name"].Value}",
                    properties: new
                    {
                        node_type = "uses_library"
                    }));

            graph.Graph.Children.Add(Edge.Create(
                source: manifest,
                target: perm,
                new
                {
                    enabled = bool.TrueString
                }));
        }

        public static void AddUsesFeature(this GraphML graph, Vertex manifest, XmlNode node)
        {
            var name = node.Attributes["android:name"]?.Value;
            if (string.IsNullOrWhiteSpace(name))
            {
                return;
            }

            var perm = graph.GetOrCreateVertex(
                id: $"feature__{name}",
                create: () => Vertex.Create(
                    id: $"feature__{name}",
                    properties: new
                    {
                        node_type = "uses_feature"
                    }));

            graph.Graph.Children.Add(Edge.Create(
                source: manifest,
                target: perm,
                new
                {
                    enabled = bool.TrueString
                }));
        }

        public static void AddService(this GraphML graph, Vertex manifest, XmlNode serviceNode)
        {
            var vertex = AddNode(graph, manifest, serviceNode, "service");
            vertex?.Labels.AddRange(GraphElementLabel.CreateLabels(new
            {
                is_background = "true"
            }));
        }


        public static void AddProvider(this GraphML graph, Vertex manifest, XmlNode provider)
        {
            AddNode(graph, manifest, provider, "provider");
        }

        public static void AddReceiver(this GraphML graph, Vertex manifest, XmlNode receiver)
        {
            var vertex = AddNode(graph, manifest, receiver, "receiver");
            vertex?.Labels.AddRange(GraphElementLabel.CreateLabels(new
            {
                is_background = "true"
            }));
        }

        private static Vertex AddNode(this GraphML graph, Vertex manifest, XmlNode manifestChildNode, string nodeType)
        {
            if (manifestChildNode.IsExported() == false) return null;

            var permissions = GetPermissions(manifestChildNode);
            if (permissions.Count > 0 && OnlyDangerousAPI)
            {
                return null;
            }

            var service = graph.GetOrCreateVertex(
                id: $"{nodeType}__{manifestChildNode.AndroidName()}",
                create: () => Vertex.Create(
                    id: $"{nodeType}__{manifestChildNode.AndroidName()}",
                    properties: new
                    {
                        node_type = nodeType,
                        filtered = Convert.ToString(permissions.Count != 0)
                    }));

            graph.Graph.Children.Add(Edge.Create(
                source: manifest,
                target: service,
                properties: new
                {
                    edge_type = "defines"
                }));

            foreach (var permission in permissions)
            {
                var permissionNode = graph.GetOrCreateVertex(
                    id: $"perm__{permission}",
                    create: () => Vertex.Create(
                        id: $"perm__{permission}",
                        properties: new
                        {
                            node_type = "filter_permission"
                        }));

                graph.Graph.Children.Add(Edge.Create(
                    source: service,
                    target: permissionNode,
                    properties: new
                    {
                        edge_type = "requires"
                    }));
            }

            return service;
        }

        private static List<string> GetPermissions(XmlNode serviceNode)
        {
            var list = new List<string>();
            foreach (XmlAttribute attribute in serviceNode.Attributes)
            {
                if (string.Equals(attribute.LocalName, "permission", StringComparison.OrdinalIgnoreCase))
                {
                    list.Add(attribute.Value);
                }
            }

            return list;
        }


        private static bool IsExported(this XmlNode node)
        {
            var exported = node.Attributes["android:exported"];
            if (bool.TryParse(exported?.Value, out bool result))
            {
                return result;
            }

            return false;
        }

        private static string AndroidName(this XmlNode node)
        {
            return node.Attributes["android:name"].Value;
        }
    }
}

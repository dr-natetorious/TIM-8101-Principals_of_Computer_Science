using Capstone.Model;
using PermissionChecker.Extensions;
using System;
using System.IO;
using System.Xml;

namespace PermissionChecker
{
    /// <summary>
    /// Represents a utility for parsing AndroidManifest.xml files into a <see cref="GraphML"/> document.
    /// 
    /// 1. All files in a directory will be imported
    /// 2. If the object is secured it will not be added to the graph
    /// 3. By default only dangerous permissioned objects are imported <see cref="GraphMLExtensions.OnlyDangerousAPI"/> flag.
    /// </summary>
    class Program
    {
        static readonly DirectoryInfo directory = new DirectoryInfo(@"s:\personal\apk-download\manifests");

        static void Main(string[] args)
        {
            var graphml = new GraphML();
            graphml.Graph.EdgeDefault = GraphNode.EdgeMode.undirected;
            graphml.Keys.AddRange(new[]
            {
                MetadataKey.CreateForNode("node_type"),
                MetadataKey.CreateForNode("filtered"),
                MetadataKey.CreateForEdge("enabled"),
                MetadataKey.CreateForEdge("edge_type"),
                MetadataKey.CreateForNode("is_background")
            });

            var files = directory.GetFiles("AndroidManifest.xml", SearchOption.AllDirectories);
            foreach (var file in files)
            {
                Console.WriteLine();
                Console.WriteLine(file.FullName);
                ParseManifestXml(file, graphml);
            }

            File.WriteAllText(
                path: "manifests.graphml",
                contents: graphml.PrintXML());
        }

        static void ParseManifestXml(FileInfo file, GraphML gml)
        {
            var xml = new XmlDocument();
            try
            {
                xml.LoadXml(File.ReadAllText(file.FullName));
            }
            catch (XmlException)
            {
                Console.WriteLine(
                    $"Unable to parse {file.FullName}, skipping...");
                return;
            }

            var manifest = Vertex.Create(
                id: file.FullName
                        .Replace(directory.FullName, string.Empty)
                        .Replace(Convert.ToString(Path.DirectorySeparatorChar), "_")
                        .Replace(Convert.ToString(Path.AltDirectorySeparatorChar), "_"),
                properties: new
                {
                    node_type = "manifest"
                });

            gml.Graph.Children.Add(manifest);

            foreach (XmlNode child in xml.DocumentElement.ChildNodes)
            {
                Console.Write(".");
                switch (child.LocalName)
                {
                    case "permission":
                    case "uses-permission":
                        gml.AddHasPermission(manifest, child);
                        break;

                    case "application":
                        ParseApplication(child, manifest, gml);
                        break;

                    case "uses-feature":
                        gml.AddUsesFeature(manifest, child);
                        break;

                    case "uses-library":
                        gml.AddUseLibrary(manifest, child);
                        break;

                    case "meta-data":
                    case "supports-screens":
                    case "compatible-screens":
                    case "#text":
                        break;

                    case "uses-permission-sdk-23":
                    case "uses-configuration":
                    case "original-package":
                    case "instrumentation":
                    case "tool-api-level":
                        break;

                    default:
                        Console.WriteLine($"Ignoring root > {child.LocalName}");
                        break;
                }
            }
        }

        static void ParseApplication(XmlNode applicationNode, Vertex manifest, GraphML gml)
        {
            foreach (XmlNode child in applicationNode.ChildNodes)
            {
                switch (child.LocalName)
                {
                    case "permission":
                        gml.AddHasPermission(manifest, child);
                        break;

                    case "uses-library":
                        gml.AddUseLibrary(manifest, child);
                        break;

                    case "service":
                        gml.AddService(manifest, child);
                        break;

                    case "provider":
                        gml.AddProvider(manifest, child);
                        break;

                    case "receiver":
                        gml.AddReceiver(manifest, child);
                        break;

                    case "meta-data":
                    case "activity":
                    case "activity-alias":
                    case "supports-screens":
                    case "#text":
                        break;

                    case "uses-feature":
                        gml.AddUsesFeature(manifest, child);
                        break;

                    default:
                        Console.WriteLine(
                            $"Ignoring application > {child.LocalName}...");
                        break;
                }
            }
        }
    }
}

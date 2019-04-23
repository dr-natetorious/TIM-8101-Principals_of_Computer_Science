using System;
using System.Collections.Generic;
using System.Xml;
using System.Xml.Serialization;

namespace Capstone.Model
{
    public class GraphML
    {
        public class GraphNode
        {
            [XmlAttribute("id")]
            public string Id { get; set; }

            [XmlAttribute("edgedefault")]
            public EdgeMode EdgeDefault { get; set; } = EdgeMode.directed;

            public enum EdgeMode
            {
                directed,
                undirected
            }

            public List<GraphElement> Children { get; set; } = new List<GraphElement>();

            public void AppendXml(XmlElement rootNode)
            {
                var node = rootNode.OwnerDocument.CreateElement("graph");
                rootNode.AppendChild(node);

                var att = node.OwnerDocument.CreateAttribute("id");
                att.Value = this.Id;
                node.Attributes.Append(att);

                att = node.OwnerDocument.CreateAttribute("edgedefault");
                att.Value = Convert.ToString(this.EdgeDefault);
                node.Attributes.Append(att);

                foreach (var child in this.Children)
                {
                    child.AppendXml(node);
                }
            }
        }
        public List<MetadataKey> Keys { get; set; } = new List<MetadataKey>();

        public GraphNode Graph { get; set; } = new GraphNode { Id = "G" };

        public XmlDocument GetXmlDocument()
        {
            var xml = new XmlDocument();
            var rootNode = xml.CreateElement("graphml");
            xml.AppendChild(rootNode);

            foreach (var key in this.Keys)
            {
                key.AppendXml(rootNode);
            }

            this.Graph.AppendXml(rootNode);

            return xml;
        }
    }
}

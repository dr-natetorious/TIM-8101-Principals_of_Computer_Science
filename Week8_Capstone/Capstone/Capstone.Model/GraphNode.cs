using System;
using System.Collections.Generic;
using System.Xml;

namespace Capstone.Model
{
    /// <summary>
    /// Represents the &lt;graph/&gt; element.
    /// </summary>
    public class GraphNode
    {
        public string Id { get; set; }

        public EdgeMode EdgeDefault { get; set; } = EdgeMode.directed;

        public enum EdgeMode
        {
            directed,
            undirected
        }

        /// <summary>
        /// The <see cref="Vertex"/> and <see cref="Edge"/> contained within the graph.
        /// </summary>
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
}

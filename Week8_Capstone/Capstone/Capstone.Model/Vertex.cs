using System.Xml;
using System.Xml.Serialization;

namespace Capstone.Model
{
    public class Vertex : GraphElement
    {
        public string Id { get; set; }

        public static Vertex Create(string id, object properties = null)
        {
            return new Vertex
            {
                Id = id,
                Labels = GraphElementLabel.CreateLabels(properties)
            };
        }

        public override void AppendXml(XmlElement parentNode)
        {
            var node = parentNode.OwnerDocument.CreateElement("node");
            parentNode.AppendChild(node);

            var att = parentNode.OwnerDocument.CreateAttribute("id");
            att.Value = this.Id;
            node.Attributes.Append(att);

            foreach (var label in this.Labels)
            {
                label.AppendXml(node);
            }
        }
    }
}

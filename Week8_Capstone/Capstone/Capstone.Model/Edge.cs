using System;
using System.Collections.Generic;
using System.Text;
using System.Xml;
using System.Xml.Serialization;

namespace Capstone.Model
{
    public class Edge : GraphElement
    {
        public string Id { get; set; }

        public Vertex Source { get; set; }

        public Vertex Target { get; set; }

        public static Edge Create(Vertex source, Vertex target, object properties = null, string id = null)
        {
            return new Edge
            {
                Id = id ?? "e_" + Guid.NewGuid().ToString("n"),
                Source = source,
                Target = target,
                Labels = GraphElementLabel.CreateLabels(properties)
            };
        }

        public override void AppendXml(XmlElement parentNode)
        {
            var node = parentNode.OwnerDocument.CreateElement("edge");
            parentNode.AppendChild(node);

            var att = parentNode.OwnerDocument.CreateAttribute("id");
            att.Value = this.Id;
            node.Attributes.Append(att);

            att = parentNode.OwnerDocument.CreateAttribute("source");
            att.Value = this.Source.Id;
            node.Attributes.Append(att);

            att = parentNode.OwnerDocument.CreateAttribute("target");
            att.Value = this.Target.Id;
            node.Attributes.Append(att);

            foreach (var label in this.Labels)
            {
                label.AppendXml(node);
            }
        }
    }
}

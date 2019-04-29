using System;
using System.Xml;

namespace Capstone.Model
{
    /// <summary>
    /// Represents a declared property of the <see cref="GraphML"/> document.
    /// 
    /// 1. These must be registered with the <see cref="GraphML.Keys"/>.
    /// 2. Afterwards they can be referenced as <see cref="GraphElement.Labels"/>.
    /// </summary>
    public class MetadataKey
    {
        public static MetadataKey CreateForNode(string name, string type= "string")
        {
            return new MetadataKey
            {
                Id = name,
                Name = name,
                For = Target.node,
                Type = type
            };
        }

        public static MetadataKey CreateForEdge(string name, string type = "string")
        {
            return new MetadataKey
            {
                Id = name,
                Name = name,
                For = Target.edge,
                Type = type
            };
        }

        public string Id { get; set; }

        public Target For { get; set; }

        public string Name { get; set; }

        public string Type { get; set; } = "string";

        public enum Target
        {
            node,
            edge
        }

        public void AppendXml(XmlElement parentNode)
        {
            var keyNode = parentNode.OwnerDocument.CreateElement("key");
            parentNode.AppendChild(keyNode);

            var att = parentNode.OwnerDocument.CreateAttribute("id");
            att.Value = this.Id;
            keyNode.Attributes.Append(att);

            att = parentNode.OwnerDocument.CreateAttribute("for");
            att.Value = Convert.ToString(this.For);
            keyNode.Attributes.Append(att);

            att = parentNode.OwnerDocument.CreateAttribute("attr.name");
            att.Value = Convert.ToString(this.Name);
            keyNode.Attributes.Append(att);

            att = parentNode.OwnerDocument.CreateAttribute("attr.type");
            att.Value = Convert.ToString(this.Type);
            keyNode.Attributes.Append(att);
        }
    }
}

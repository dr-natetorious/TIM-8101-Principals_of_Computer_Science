using System;
using System.Collections.Generic;
using System.Xml;

namespace Capstone.Model
{
    /// <summary>
    /// Represents metadata to be attached to either a <see cref="Vertex"/> or <see cref="Edge"/>.
    /// 
    /// The <see cref="Key"/> needs to be registered in the <see cref="GraphML.Keys"/> to be used.
    /// </summary>
    public sealed class GraphElementLabel
    {
        public string Key { get; set; }

        public string Value { get; set; }

        public void AppendXml(XmlElement parentNode)
        {
            var node = parentNode.OwnerDocument.CreateElement("data");
            parentNode.AppendChild(node);

            var att = parentNode.OwnerDocument.CreateAttribute("key");
            att.Value = this.Key;
            node.Attributes.Append(att);

            var innerText = parentNode.OwnerDocument.CreateTextNode(this.Value);
            node.AppendChild(innerText);
        }

        public static List<GraphElementLabel> CreateLabels(object obj)
        {
            var list = new List<GraphElementLabel>();
            if (obj == null)
            {
                return list;
            }

            foreach (var p in obj.GetType().GetProperties())
            {
                if (p.CanRead == false)
                {
                    continue;
                }

                list.Add(new GraphElementLabel
                {
                    Key = p.Name,
                    Value = Convert.ToString(p.GetValue(obj))
                });
            }

            return list;
        }
    }
}

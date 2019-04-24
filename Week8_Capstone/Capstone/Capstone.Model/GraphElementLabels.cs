using System;
using System.Collections.Generic;
using System.Text;
using System.Xml;
using System.Xml.Serialization;

namespace Capstone.Model
{
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

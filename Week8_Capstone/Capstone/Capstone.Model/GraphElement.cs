using System;
using System.Collections.Generic;
using System.Text;
using System.Xml;
using System.Xml.Schema;
using System.Xml.Serialization;

namespace Capstone.Model
{
    public abstract class GraphElement
    {
        public List<GraphElementLabel> Labels { get; set; } = new List<GraphElementLabel>();

        public abstract void AppendXml(XmlElement parentNode);
    }
}

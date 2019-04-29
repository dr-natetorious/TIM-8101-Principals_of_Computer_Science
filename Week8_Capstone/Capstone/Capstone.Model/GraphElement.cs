using System.Collections.Generic;
using System.Xml;

namespace Capstone.Model
{
    /// <summary>
    /// Represents the base class for node and edge elements.
    /// </summary>
    public abstract class GraphElement
    {
        public List<GraphElementLabel> Labels { get; set; } = new List<GraphElementLabel>();

        public abstract void AppendXml(XmlElement parentNode);
    }
}

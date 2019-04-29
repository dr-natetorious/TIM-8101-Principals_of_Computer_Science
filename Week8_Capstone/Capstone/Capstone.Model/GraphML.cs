using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Xml;

namespace Capstone.Model
{
    /// <summary>
    /// Represents a GraphML document.
    /// </summary>
    public class GraphML
    {
        /// <summary>
        /// Gets or sets the metadata keys edges and nodes in the graph.
        /// </summary>
        public List<MetadataKey> Keys { get; set; } = new List<MetadataKey>
        {
            MetadataKey.CreateForNode("labelV"),
            MetadataKey.CreateForEdge("labelE")
        };

        /// <summary>
        /// Gets or sets the graph structure for this document.
        /// </summary>
        public GraphNode Graph { get; set; } = new GraphNode { Id = "G" };

        /// <summary>
        /// Fetches an existing vertex or creates it if needed.
        /// </summary>
        /// <param name="id">The identity of the vertex</param>
        /// <param name="create">Callback to create the vertex</param>
        /// <returns>The desired vertex</returns>
        public Vertex GetOrCreateVertex(string id, Func<Vertex> create)
        {
            var existing = this.Graph.Children.OfType<Vertex>().SingleOrDefault(
                v => string.Equals(v.Id, id, StringComparison.OrdinalIgnoreCase));

            if (existing != null)
            {
                return existing;
            }

            var node = create();
            node.Id = node.Id ?? id;
            this.Graph.Children.Add(node);
            return node;
        }

        /// <summary>
        /// Serialize this document into xml.
        /// </summary>
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

        /// <summary>
        /// Gets a well formatted version of the Xml.
        /// </summary>
        public string PrintXML()
        {
            using (var memoryStream = new MemoryStream())
            using (var writer = new XmlTextWriter(memoryStream, Encoding.UTF8))
            {
                var document = GetXmlDocument();

                writer.Formatting = Formatting.Indented;

                // Write the XML into a formatting XmlTextWriter
                document.WriteContentTo(writer);
                writer.Flush();
                memoryStream.Flush();

                // Have to rewind the MemoryStream in order to read
                // its contents.
                memoryStream.Position = 0;

                // Read MemoryStream contents into a StreamReader.
                using (var reader = new StreamReader(memoryStream))
                {
                    // Extract the text from the StreamReader.
                    string formattedXml = reader.ReadToEnd();
                    return formattedXml;
                }
            }
        }
    }
}

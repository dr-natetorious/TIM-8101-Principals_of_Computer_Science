using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Xml;

namespace Capstone.Model
{
    public class GraphML
    {        
        public List<MetadataKey> Keys { get; set; } = new List<MetadataKey>();

        public GraphNode Graph { get; set; } = new GraphNode { Id = "G" };

        public Vertex GetOrCreateVertex(string id, Func<Vertex> create)
        {
            var existing = this.Graph.Children.OfType<Vertex>().SingleOrDefault(
                v => string.Equals(v.Id, id, StringComparison.OrdinalIgnoreCase));

            if (existing != null)
            {
                return existing;
            }

            var node = create();
            this.Graph.Children.Add(node);
            return node;
        }

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

using Neptune.Model;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

namespace Neptune.Writers
{
    class GremlinWriter
    {
        private readonly DirectoryInfo outputDirectory;

        public GremlinWriter(DirectoryInfo outputDirectory)
        {
            this.outputDirectory = outputDirectory;
            this.outputDirectory.Create();
        }

        public void Write(List<EgoNetwork> networks, string name)
        {
            var outFile = Path.Combine(outputDirectory.FullName, name + ".gremlin");
            using (var sw = new StreamWriter(File.OpenWrite(outFile), Encoding.UTF8))
            {
                sw.WriteLine("graph = TinkerGraph.open()");
                sw.WriteLine("g = graph.traversal()");

                // Create all of the verticies...
                foreach (var network in networks)
                {
                    sw.WriteLine($"// Add Ego: {network.EgoNodeName}....");
                    sw.WriteLine(
                        $@"ego_{network.EgoNodeName} = graph.addVertex(id, '{network.EgoNodeName}');");

                    foreach (var feature in network.EgoFeatures)
                    {
                        sw.WriteLine(
                            $"ego_{network.EgoNodeName}.property('{feature}', true);");
                    }
                }

                // Create the graph...
                foreach (var network in networks)
                {
                    foreach (var edge in network.Edges)
                    {
                        sw.WriteLine(
                            $@"
                            // edge: {edge.EdgeId}
                            v_from = graph.vertices('{edge.From}');
                            if (v_from == null) {{ v_from = graph.addVertex(id, '{edge.From}'); }}
                            v_to = g.vertices('{edge.To}');
                            if (v_to == null) {{ v_to = graph.addVertex(id, '{edge.From}'); }}
                            
                            e = v_from.addEdge('{edge.Label}', v_to, id, '{edge.EdgeId}', 'weight', {edge.Weight});
                            "
                            .Replace("\t", string.Empty)
                            .Replace("\r\n", "\n"));
                    }
                }
            }
        }
    }
}

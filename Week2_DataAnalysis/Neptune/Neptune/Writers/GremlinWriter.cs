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
            var outFile = new FileInfo(
                Path.Combine(outputDirectory.FullName, name + ".gremlin"));
            if (outFile.Exists)
            {
                outFile.Delete();
            }

            using (var sw = new StreamWriter(outFile.OpenWrite(), Encoding.UTF8))
            {
                sw.WriteLine("graph = TinkerGraph.open()");
                sw.WriteLine("g = graph.traversal()");

                // Create all of the verticies...
                foreach (var vertice in EgoNetwork.GetAllVertices(networks))
                {
                    sw.WriteLine(
                        $"v_{vertice} = graph.addVertex(id, '{vertice}');");
                }
                sw.WriteLine();

                // Add Ego Properties
                foreach (var network in networks)
                {
                    sw.WriteLine(
                        $@"ego_{network.EgoNodeName} = v_{network.EgoNodeName};");

                    foreach (var feature in network.EgoFeatures)
                    {
                        sw.WriteLine(
                            $"ego_{network.EgoNodeName}.property('{feature}', true);");
                    }
                }

                // Create the graph...
                foreach (var edge in networks.SelectMany(n => n.Edges))
                {
                    sw.WriteLine(
                        $"e_{edge.EdgeId} = ");
                    sw.WriteLine(
                        $"    v_{edge.From}.addEdge('{edge.Label}', v_{edge.To}, id, '{edge.EdgeId}', 'weight', {edge.Weight});");
                }
            }
        }
    }
}

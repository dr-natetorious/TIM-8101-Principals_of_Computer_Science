using ByteCodeMapper.Model;
using Capstone.Model;
using System;
using System.IO;

namespace ByteCodeMapper
{
    class Program
    {
        static void Main(string[] args)
        {
            //// CreateTestGraph();

            var graphML = new GraphML();
            var mapper = new JavaMapper(graphML);

            foreach (var file in new DirectoryInfo(
                @"S:\personal\ncu\TIM-8101-Principals_of_Computer_Science\Week8_Capstone\Artifacts\bytecode")
                .GetFiles("*.java", SearchOption.AllDirectories))
            {
                Console.WriteLine($"Parsing: {file.FullName}...");
                var classDefinition = ClassDefinition.Read(
                    new StreamReader(file.OpenRead()));

                if (classDefinition == null)
                {
                    Console.WriteLine("\t No definition was extracted.");
                    continue;
                }

                mapper.Append(classDefinition);
            }

            //Console.Write(graphML.PrintXML());
            File.WriteAllText(
                path: @"c:\temp\fullapp.graphml",
                contents: graphML.PrintXML());
        }

        static void CreateTestGraph()
        { 
            var graphml = new GraphML();
            graphml.Keys.AddRange(new[]
            {
                MetadataKey.CreateForNode("label"),
                MetadataKey.CreateForNode("taco"),
                MetadataKey.CreateForEdge("parent"),
                MetadataKey.CreateForEdge("reference_type")
            });

            var apkNode = Vertex.Create("root", new { label = "apk", taco ="beef" });
            var thing1 = Vertex.Create("thing1", new { label = "class", taco = "chiken" });
            var thing2 = Vertex.Create("thing2", new { label = "class", taco = "pork" });

            graphml.Graph.Children.AddRange(new[] { apkNode, thing1, thing2 });
            graphml.Graph.Children.Add(Edge.Create(apkNode, thing1, new { reference_type = "contains" }));
            graphml.Graph.Children.Add(Edge.Create(thing1, thing2, new { reference_type = "calls" }));

            //Console.Write(xml);
            File.WriteAllText(
                path: @"c:\temp\test.graphml",
                contents: graphml.PrintXML());
        }
    }
}

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
            var classDefinition = new ClassDefinition(new StreamReader(File.OpenRead(
                @"S:\personal\ncu\TIM-8101-Principals_of_Computer_Science\Week8_Capstone\Artifacts\bytecode\ryey\easer\core\EHService.java")));

            var graphML = new GraphML();
            var mapper = new JavaMapper(graphML);
            mapper.Append(classDefinition);

            Console.Write(graphML.PrintXML());
        }

        static void CreateTestGraph()
        { 
            var graphml = new GraphML();
            graphml.Keys.AddRange(new[]
            {
                MetadataKey.CreateForNode("label"),
                MetadataKey.CreateForEdge("parent"),
                MetadataKey.CreateForEdge("reference_type")
            });

            var apkNode = Vertex.Create("root", new { label = "apk" });
            var thing1 = Vertex.Create("thing1", new { label = "class" });
            var thing2 = Vertex.Create("thing2", new { label = "class" });

            graphml.Graph.Children.AddRange(new[] { apkNode, thing1, thing2 });
            graphml.Graph.Children.Add(Edge.Create(apkNode, thing1, new { reference_type = "contains" }));
            graphml.Graph.Children.Add(Edge.Create(thing1, thing2, new { reference_type = "calls" }));

            var xml = graphml.GetXmlDocument().OuterXml;
            Console.Write(xml);
        }
    }
}

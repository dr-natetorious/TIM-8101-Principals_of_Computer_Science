using Neptune.Model;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace Neptune
{
    internal class Program
    {
        private static readonly DirectoryInfo basePath = new DirectoryInfo(
            @"s:\personal\ncu\TIM-8101-Principals_of_Computer_Science\Week2_DataAnalysis\facebook");

        static void Main(string[] args)
        {
            // For each feature set...
            foreach (var featureNameFile in basePath.GetFiles("*.featnames"))
            {
                // Determine the ego node name and features...
                var egoNode = Path.GetFileNameWithoutExtension(featureNameFile.Name);
                var features = GetFeatureNames(featureNameFile);

                // Load the edge information...
                var edgeFile = new FileInfo(Path.ChangeExtension(featureNameFile.FullName, ".feat"));
                var edges = GetEdges(egoNode, edgeFile, features);

                // Determine the ego features
                var egoFile = new FileInfo(Path.ChangeExtension(featureNameFile.FullName, ".egofeat"));
                var egoFeatures = GetEgoFeatures(egoFile, features);
            }
        }

        static List<string> GetFeatureNames(FileInfo file)
        {
            var list = new List<string>();
            foreach (var line in File.ReadLines(file.FullName))
            {
                var components = line.Split(new[] { ' ' }, 2);
                var feature =
                    components.Last()
                        .Replace("anonymized feature ", string.Empty)
                        .Replace(";", "_")
                        .Replace(" ", string.Empty);

                list.Add($"{feature}:boolean");
            }

            return list;
        }

        static List<Edge> GetEdges(string egoNode, FileInfo file, List<string> features)
        {
            var list = new List<Edge>();
            foreach (var line in File.ReadAllLines(file.FullName))
            {
                var cells = line.Split(' ');
                var peerNode = cells[0];

                // cells start at 1 and features start at 0
                for (var ix =1; ix< cells.Length; ix++)
                {
                    if (int.Parse(cells[ix]) == 1)
                    {
                        list.Add(new Edge
                        {
                            From = egoNode,
                            To = peerNode,
                            Label = features[ix - 1]
                        });
                    }
                }
            }

            return list;
        }

        static List<string> GetEgoFeatures(FileInfo file, List<string> features)
        {
            var list = new List<string>();
            foreach (var line in File.ReadAllLines(file.FullName))
            {
                var cells = line.Split(' ');
                for (var ix =0; ix < cells.Length; ix++)
                {
                    if (int.Parse(cells[ix]) == 1)
                    {
                        list.Add(features[ix]);
                    }
                }
            }

            return list;
        }
    }
}

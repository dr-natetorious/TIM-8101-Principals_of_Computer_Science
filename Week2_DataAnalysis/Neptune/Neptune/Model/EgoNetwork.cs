using System;
using System.Collections.Generic;
using System.Text;

namespace Neptune.Model
{
    public class EgoNetwork
    {
        public string EgoNodeName { get; set; }

        public List<string> NetworkFeatures { get; set; } = new List<string>();

        public List<Edge> Edges { get; set; } = new List<Edge>();

        public List<string> EgoFeatures { get; set; } = new List<string>();

        public static List<string> GetAllVertices(IEnumerable<EgoNetwork> networks)
        {
            var list = new List<string>();
            foreach (var network in networks)
            {
                if (list.Contains(network.EgoNodeName) == false)
                {
                    list.Add(network.EgoNodeName);
                }

                foreach (var edge in network.Edges)
                {
                    if (list.Contains(edge.To) == false)
                    {
                        list.Add(edge.To);
                    }

                    if (list.Contains(edge.From) == false)
                    {
                        list.Add(edge.From);
                    }
                }
            }

            return list;
        }
    }
}

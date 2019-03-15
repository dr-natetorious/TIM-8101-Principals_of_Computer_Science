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
    }
}

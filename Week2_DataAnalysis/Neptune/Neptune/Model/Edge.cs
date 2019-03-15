using System;
using System.Collections.Generic;
using System.Text;

namespace Neptune.Model
{
    public sealed class Edge
    {
        private static int _instanceCounter = 0;
        public string EdgeId { get; set; } = $"e{++_instanceCounter}";

        public string From { get; set; }

        public string To { get; set; }

        public string Label { get; set; }

        public double Weight { get; set; } = 1;

        public override string ToString()
        {
            return $@"""{EdgeId}"",""{From}"",""{To}"",""{Label}"", {Weight}";
        }
    }
}

using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace ByteCodeMapper.Model
{
    public class MethodDeclaration
    {
        public string Name { get; set; }

        public List<string> Arguments { get; set; } = new List<string>();

        public IReadOnlyList<string> Assembly { get; set; } = new List<string>();

        public MethodDeclaration(string declaration, StreamReader reader)
        {
            this.Name = declaration;
            this.ReadToEnd(reader);
        }

        private void ReadToEnd(StreamReader reader)
        {
            var list = new List<string>();
            string line;
            while ((line = reader.ReadLine()) != null)
            {
                if (string.IsNullOrWhiteSpace(line))
                {
                    break;
                }

                list.Add(line.Trim());
            }

            this.Assembly = list;
        }
    }
}

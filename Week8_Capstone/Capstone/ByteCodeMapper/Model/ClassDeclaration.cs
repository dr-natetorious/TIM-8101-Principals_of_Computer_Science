using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace ByteCodeMapper.Model
{
    public class ClassDeclaration
    {
        public string Name { get; set; }

        public string Extends { get; set; }

        public List<string> Implements { get; set; } = new List<string>();

        public List<MethodDeclaration> Methods { get; set; } = new List<MethodDeclaration>();

        public ClassDeclaration(string declaration)
        {
            throw new NotImplementedException();
        }

        public ClassDeclaration(StreamReader reader)
        {
            var line = string.Empty;
            var previousLine = string.Empty;
            ClassDeclaration classDefinition = null;
            while ((line = reader.ReadLine()?.Trim()) != null)
            {
                var lineType = GetLineType(line);
                if (lineType == LineType.Ignore)
                {
                    continue;
                }

                switch (lineType)
                {
                    case LineType.BeginClassDefinition:
                        classDefinition = new ClassDeclaration(line);
                        break;

                    case LineType.BeginMethod:
                        classDefinition.Methods.Add(new MethodDeclaration(
                            declaration: previousLine,
                            reader: reader));
                        break;
                }

                previousLine = line;
            }
        }


        private LineType GetLineType(string line)
        {
            if (line.EndsWith("{"))
            {
                return LineType.BeginClassDefinition;
            }
            else if (line.StartsWith("Code:"))
            {
                return LineType.BeginMethod;
            }
            else
            {
                return LineType.Ignore;
            }
        }

        private enum LineType
        {
            BeginClassDefinition,
            BeginMethod,
            Ignore
        }
    }
}

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

namespace ByteCodeMapper.Model
{
    public class ClassDefinition
    {
        public string Name { get; set; }

        public string Extends { get; set; }

        public List<string> Implements { get; set; } = new List<string>();

        public List<MethodDefinition> Methods { get; set; } = new List<MethodDefinition>();

        public ClassDefinition(string declaration)
        {
            var tokens = declaration.Trim().Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries)
                .SkipWhile(t => t != "class" && t != "interface")
                .Skip(1);

            this.Name = tokens.First();

            this.Extends = tokens
                .SkipWhile(t => t != "extends")
                .Skip(1)
                .FirstOrDefault();

            this.Implements = tokens
                .SkipWhile(t => t != "implements")
                .Skip(1)
                .TakeWhile(t => t != "extends" || t != "{")
                .ToList();
        }

        public static ClassDefinition Read(StreamReader reader)
        {
            var line = string.Empty;
            var previousLine = string.Empty;
            ClassDefinition classDeclaration = null;
            while ((line = reader.ReadLine()?.Trim()) != null)
            {
                if (string.IsNullOrWhiteSpace(line))
                {
                    continue;
                }

                switch (GetLineType(line))
                {
                    case LineType.BeginClassDefinition:
                        classDeclaration = new ClassDefinition(line);
                        break;

                    case LineType.BeginMethod:
                        classDeclaration.Methods.Add(new MethodDefinition(
                            classDefinition: classDeclaration,
                            declaration: previousLine,
                            reader: reader));
                        break;

                    case LineType.Ignore:
                        break;
                }

                previousLine = line;
            }

            return classDeclaration;
        }


        private static LineType GetLineType(string line)
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

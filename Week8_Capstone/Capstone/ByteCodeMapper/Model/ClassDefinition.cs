using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace ByteCodeMapper.Model
{
    /// <summary>
    /// Represents a class definition for a Java class.
    /// </summary>
    /// <remarks>
    /// Files are assumed to be generated as:
    /// 
    ///     javap -s -p -c foo.class > foo.java
    /// </remarks>
    public class ClassDefinition
    {
        public string Name { get; set; }

        public string Extends { get; set; }

        public List<string> Implements { get; set; } = new List<string>();

        public List<MethodDefinition> Methods { get; set; } = new List<MethodDefinition>();

        /// <summary>
        /// Initializes the class definition using the declaration from Java Assembly file.
        /// </summary>
        /// <param name="declaration">Example: <value>public class org.smssecure.smssecure.sms.MessageSender</value>.</param>
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

        /// <summary>
        /// Reads an entire Java Assembly file and parses it accordingly.
        /// </summary>
        /// <param name="reader">An open stream reader to be used./param>
        /// <returns>The Parsed file or null if the file was empty.</returns>
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

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace ByteCodeMapper.Model
{
    public class MethodDefinition
    {
        private readonly ClassDefinition classDefinition;

        public string Name { get; set; }

#if ARG_SUPPORT
        public List<string> Arguments { get; set; } = new List<string>();
#endif
        public IReadOnlyList<string> Assembly { get; set; }

        public MethodDefinition(ClassDefinition classDefinition, string declaration, StreamReader reader)
        {
            this.classDefinition = classDefinition
                ?? throw new ArgumentNullException(nameof(ClassDefinition));

            this.Name = GetMethodName(
                declaration ?? throw new ArgumentNullException(nameof(declaration)));

            this.ReadToEnd(
                reader ?? throw new ArgumentNullException(nameof(reader)));
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

        public string GetMethodName(string line)
        {
            line = line.Trim().Split(';').First();

            if (line == "static {}")
            {
                return $"{this.classDefinition.Name}.ctr";
            }

            var tokens = line.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

            var modifiers = tokens.TakeWhile(t => t.Contains("(", StringComparison.OrdinalIgnoreCase) == false).ToArray();
            var signature = string.Join(" ", tokens.Skip(modifiers.Length));

            var signatureComponents = signature.Split(new[] { '(' }, 2);
            var methodName = signatureComponents[0];

#if ARG_SUPPORT
            // TODO: Add support for getting arguments here...
            var arguments = "(" + signatureComponents[1];
#endif
            if (methodName == this.classDefinition.Name)
            {
                methodName = ".ctr";
            }

            return $"{this.classDefinition.Name}.{methodName}";
        }

        public List<string> GetMethodsInvocations()
        {
            var list = new List<string>();
            foreach (var statement in this.Assembly)
            {
                if (statement.Contains("// Method ") == false)
                {
                    continue;
                }

                var methodName = statement.Substring(statement.IndexOf("// Method ") + 10).Trim();
                methodName = methodName.Replace("\"<init>\"", ".ctr");
                methodName = methodName.Split(new[] { ':' }, 2)[0];
                methodName = methodName.Replace("/", ".");

                if (methodName.Contains(".") == false)
                {
                    methodName = $"{this.classDefinition.Extends ?? this.classDefinition.Name}.{methodName}";
                }

                list.Add(methodName);
            }

            return list.Distinct().ToList();
        }

        public override string ToString()
        {
            return this.Name ?? "no name available.";
        }
    }
}

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

namespace ByteCodeMapper.Model
{
    public class MethodDefinition
    {
        private readonly ClassDefinition classDefinition;

        public string Name { get; set; }

#if ARG_SUPPORT
        public List<string> Arguments { get; set; } = new List<string>();
#endif
        public IReadOnlyList<string> Assembly { get; set; } = new List<string>();

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
            var tokens = line.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

            var modifiers = tokens.TakeWhile(t => t.Contains("(", StringComparison.OrdinalIgnoreCase) == false);
            var signature = string.Join(" ", tokens);

            var signatureComponents = signature.Split(new[] { '(' }, 2);
            var methodName = signatureComponents[0];

#if ARG_SUPPORT
            // TODO: Add support for getting arguments here...
            var arguments = "(" + signatureComponents[1];
#endif

            return $"{this.classDefinition.Name}.{methodName}";
        }
    }
}

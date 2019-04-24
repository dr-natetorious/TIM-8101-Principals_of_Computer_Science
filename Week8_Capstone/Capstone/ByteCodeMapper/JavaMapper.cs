using Capstone.Model;
using System;
using System.IO;
using System.Collections.Generic;
using System.Text;
using ByteCodeMapper.Model;

namespace ByteCodeMapper
{
    public class JavaMapper
    {
        private readonly GraphML graphML;

        public JavaMapper(GraphML graphML)
        {
            this.graphML = graphML
                ?? throw new ArgumentNullException(nameof(graphML));
        }

        public void Append(ClassDefinition classDeclaration)
        {
            var classNode = 
                this.graphML.GetOrCreateVertex(
                    id: classDeclaration.Name,
                    create: () => Vertex.Create(
                        id: classDeclaration.Name,
                        properties: new
                        {
                            label = "class",
                        }));

            if (string.IsNullOrWhiteSpace(classDeclaration.Extends) == false)
            {
                var extendsNode = 
                    this.graphML.GetOrCreateVertex(
                        id: classDeclaration.Extends,
                        create: () => Vertex.Create(
                            id: classDeclaration.Extends,
                            properties: new
                            {
                                label = "class",
                            }));

                this.graphML.Graph.Children.Add(
                    Edge.Create(classNode, extendsNode, new
                    {
                        label = "extends"
                    }));
            }

            foreach (var implements in classDeclaration.Implements)
            {
                var implementsNode =
                   this.graphML.GetOrCreateVertex(
                       id: implements,
                       create: () => Vertex.Create(
                           id: implements,
                           properties: new
                           {
                               label = "class",
                           }));

                this.graphML.Graph.Children.Add(
                    Edge.Create(classNode, implementsNode, new
                    {
                        label = "implements"
                    }));
            }

            foreach (var method in classDeclaration.Methods)
            {
                Append(classNode, method);
            }
        }

        private void Append(Vertex classNode, MethodDefinition method)
        {
            var methodNode = Vertex.Create(method.Name, new
            {
                label = "method"
            });

        }
    }
}

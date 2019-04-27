using Capstone.Model;
using System;
using ByteCodeMapper.Model;
using System.Linq;

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
                            node_type = "class",
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
                                node_type = "class",
                            }));

                this.graphML.Graph.Children.Add(
                    Edge.Create(classNode, extendsNode, new
                    {
                        reference_type = "extends"
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
                               node_type = "class",
                           }));

                this.graphML.Graph.Children.Add(
                    Edge.Create(classNode, implementsNode, new
                    {
                        reference_type = "implements"
                    }));
            }

            foreach (var method in classDeclaration.Methods)
            {
                Append(classNode, method);
            }
        }

        private void Append(Vertex classNode, MethodDefinition method)
        {
            var invocations = method.GetMethodsInvocations();

            var methodNode = 
                this.graphML.GetOrCreateVertex(
                id: method.Name,
                create: () => Vertex.Create(
                    id: method.Name,
                    properties: new
                    {
                        node_type = "method",
                    }));

            this.graphML.Graph.Children.Add(
                    Edge.Create(classNode, methodNode, new
                    {
                        reference_type = "member"
                    }));

            this.graphML.Graph.Children.Add(
                    Edge.Create(methodNode, classNode, new
                    {
                        reference_type = "declared_by"
                    }));

            foreach (var invocation in invocations)
            {
                var targetNode =
                    this.graphML.GetOrCreateVertex(
                    id: invocation,
                    create: () => Vertex.Create(
                        id: invocation,
                        properties: new
                        {
                            node_type = "method",
                        }));

                this.graphML.Graph.Children.Add(
                    Edge.Create(methodNode, targetNode, new
                    {
                        reference_type = "invokes"
                    }));

                this.graphML.Graph.Children.Add(
                    Edge.Create(classNode, targetNode, new
                    {
                        called_with = method.Name
                    }));
            }
        }
    }
}

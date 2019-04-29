using Capstone.Model;
using System;
using ByteCodeMapper.Model;

namespace ByteCodeMapper
{
    /// <summary>
    /// Represents a dumb parser for Java Assembly files
    /// </summary>
    public class JavaMapper
    {
        private readonly GraphML graphML;

        public JavaMapper(GraphML graphML)
        {
            this.graphML = graphML
                ?? throw new ArgumentNullException(nameof(graphML));
        }

        /// <summary>
        /// Appends the <paramref name="classDeclaration"/> to the <see cref="graphML"/> document.
        /// </summary>
        /// <param name="classDeclaration">The class to be imported.</param>
        public void Append(ClassDefinition classDeclaration)
        {
            // Fetch the node if it already exists...
            var classNode = 
                this.graphML.GetOrCreateVertex(
                    id: classDeclaration.Name,
                    create: () => Vertex.Create(
                        id: classDeclaration.Name,
                        properties: new
                        {
                            node_type = "class",
                        }));

            // Add the relationship for inheritence...
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

            // Add any relationships for interface declarations...
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

            // Map any methods of this class...
            foreach (var method in classDeclaration.Methods)
            {
                Append(classNode, method);
            }
        }

        /// <summary>
        /// Appends the <paramref name="method"/> to the <see cref="graphML"/> document.
        /// </summary>
        /// <param name="classNode">The declaring class.</param>
        /// <param name="method">The method to be attached</param>
        private void Append(Vertex classNode, MethodDefinition method)
        {
            // Get all the invocations...
            var invocations = method.GetMethodsInvocations();

            // Add the method as a child of the classNode...
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

            // Add all invocations that this method will call...
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

using Elasticsearch.Net;
using Newtonsoft.Json;
using System;
using System.IO;
using System.Net.Http;
using System.Threading.Tasks;
using System.Xml;

namespace LoadManifestFiles
{
    class Program
    {
        static void Main(string[] args) => MainAsync().Wait();

        static async Task MainAsync()
        {
            var directory = new DirectoryInfo(
                @"s:\personal\apk-download\manifests");

            var client = new ElasticLowLevelClient();
            var http = new HttpClient();

            var files = directory.GetFiles("AndroidManifest.xml", SearchOption.AllDirectories);
            foreach (var file in files)
            {
                try
                {
                    var json = GetJsonFromManifest(directory, file);
                    var response = await http.PostAsync("http://localhost:9200/", new StringContent(json));
                    Console.WriteLine(response);
                }
                catch (XmlException)
                {
                    // Ignore these..
                }
                catch (Exception error)
                {
                    Console.WriteLine(error.Message);
                }
            }
        }


        static string GetJsonFromManifest(DirectoryInfo basePath, FileInfo file)
        {
            using (var reader = file.OpenText())
            {
                var xml = new XmlDocument();
                var text = reader.ReadToEnd();
                try
                {
                    xml.LoadXml(text);
                }
                catch (XmlException)
                {
                    Console.WriteLine(
                        $"Unable to process {file.Name}...");
                    throw;
                }

                var fileNode = xml.CreateElement("file");
                var att = xml.CreateAttribute("location");
                att.Value = file.FullName.Replace(basePath.FullName, string.Empty);
                fileNode.Attributes.Append(att);
                xml.DocumentElement.AppendChild(fileNode);

                var json = JsonConvert.SerializeXmlNode(xml);
                return json;
            }
        }
    }
}

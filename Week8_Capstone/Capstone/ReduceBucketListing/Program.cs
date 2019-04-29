using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace ReduceBucketListing
{
    /// <summary>
    /// Represents a throw away utility for analyzing the massive results of 
    /// 
    ///     aws s3 ls --recursive s3://apk.natetorio.us/incoming
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            using (var writer = new StreamWriter(File.OpenWrite("reduced-ref.csv")))
            {
                using (var reader = new StreamReader(File.OpenRead(@"s:\apk-bucket.txt")))
                {
                    string line;
                    var lastPackage = string.Empty;
                    var list = new List<string>();
                    while ((line = reader.ReadLine()) != null)
                    {
                        if (line.Contains("bytecode") == false)
                        {
                            continue;
                        }

                        var tokens = line.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
                        if (tokens.Length < 4) continue;

                        var path = tokens[3].Split('/');
                        var apkPath = path[0];
                        var refName = path[2];
                        var nspace = string.Join(", ", path.Skip(2).TakeWhile(t => Path.HasExtension(t) == false));

                        if (apkPath != lastPackage)
                        {
                            if (list.Count > 0)
                            {
                                writer.Write(string.Join(Environment.NewLine, list.Distinct()));
                                list.Clear();
                            }
                        }

                        lastPackage = apkPath;
                        ////list.Add($"{apkPath}, {nspace}");
                        list.Add($"{apkPath}, {refName}");
                    }

                    writer.Write(string.Join(Environment.NewLine, list.Distinct()));
                }
            }
        }
    }
}

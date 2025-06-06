// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Kusto.Outputs
{

    [OutputType]
    public sealed class ClusterLanguageExtension
    {
        public readonly string Image;
        /// <summary>
        /// The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private ClusterLanguageExtension(
            string image,

            string name)
        {
            Image = image;
            Name = name;
        }
    }
}

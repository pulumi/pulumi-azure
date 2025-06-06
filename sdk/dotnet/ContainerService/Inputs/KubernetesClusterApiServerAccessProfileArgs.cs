// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterApiServerAccessProfileArgs : global::Pulumi.ResourceArgs
    {
        [Input("authorizedIpRanges")]
        private InputList<string>? _authorizedIpRanges;

        /// <summary>
        /// Set of authorized IP ranges to allow access to API server, e.g. ["198.51.100.0/24"].
        /// </summary>
        public InputList<string> AuthorizedIpRanges
        {
            get => _authorizedIpRanges ?? (_authorizedIpRanges = new InputList<string>());
            set => _authorizedIpRanges = value;
        }

        public KubernetesClusterApiServerAccessProfileArgs()
        {
        }
        public static new KubernetesClusterApiServerAccessProfileArgs Empty => new KubernetesClusterApiServerAccessProfileArgs();
    }
}

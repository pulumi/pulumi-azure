// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.RedHatOpenShift.Outputs
{

    [OutputType]
    public sealed class ClusterServicePrincipal
    {
        /// <summary>
        /// The Client ID for the Service Principal.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The Client Secret for the Service Principal.
        /// 
        /// &gt; **Note:** Currently a service principal cannot be associated with more than one ARO clusters on the Azure subscription.
        /// </summary>
        public readonly string ClientSecret;

        [OutputConstructor]
        private ClusterServicePrincipal(
            string clientId,

            string clientSecret)
        {
            ClientId = clientId;
            ClientSecret = clientSecret;
        }
    }
}

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class GetAppTemplateTcpScaleRuleResult
    {
        public readonly ImmutableArray<Outputs.GetAppTemplateTcpScaleRuleAuthenticationResult> Authentications;
        public readonly string ConcurrentRequests;
        /// <summary>
        /// The name of the Container App.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetAppTemplateTcpScaleRuleResult(
            ImmutableArray<Outputs.GetAppTemplateTcpScaleRuleAuthenticationResult> authentications,

            string concurrentRequests,

            string name)
        {
            Authentications = authentications;
            ConcurrentRequests = concurrentRequests;
            Name = name;
        }
    }
}

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Nginx.Inputs
{

    public sealed class DeploymentWebApplicationFirewallStatusBotSignaturesPackageGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("revisionDatetime")]
        public Input<string>? RevisionDatetime { get; set; }

        [Input("version")]
        public Input<string>? Version { get; set; }

        public DeploymentWebApplicationFirewallStatusBotSignaturesPackageGetArgs()
        {
        }
        public static new DeploymentWebApplicationFirewallStatusBotSignaturesPackageGetArgs Empty => new DeploymentWebApplicationFirewallStatusBotSignaturesPackageGetArgs();
    }
}

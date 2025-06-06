// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ArcKubernetes.Inputs
{

    public sealed class ProvisionedClusterIdentityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Principal ID associated with this Managed Service Identity.
        /// </summary>
        [Input("principalId")]
        public Input<string>? PrincipalId { get; set; }

        /// <summary>
        /// The Tenant ID associated with this Managed Service Identity.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        /// <summary>
        /// The type of the Managed Identity. The only possible value is `SystemAssigned`. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ProvisionedClusterIdentityArgs()
        {
        }
        public static new ProvisionedClusterIdentityArgs Empty => new ProvisionedClusterIdentityArgs();
    }
}

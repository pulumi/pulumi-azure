// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.IotCentral.Inputs
{

    public sealed class ApplicationIdentityGetArgs : global::Pulumi.ResourceArgs
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
        /// Specifies the type of Managed Service Identity that should be configured on this IoT Central Application. The only possible value is `SystemAssigned`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ApplicationIdentityGetArgs()
        {
        }
        public static new ApplicationIdentityGetArgs Empty => new ApplicationIdentityGetArgs();
    }
}

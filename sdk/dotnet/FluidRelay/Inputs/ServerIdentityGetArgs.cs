// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.FluidRelay.Inputs
{

    public sealed class ServerIdentityGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("identityIds")]
        private InputList<string>? _identityIds;

        /// <summary>
        /// Specifies a list of User Assigned Managed Identity IDs to be assigned to this Fluid Relay Service.
        /// </summary>
        public InputList<string> IdentityIds
        {
            get => _identityIds ?? (_identityIds = new InputList<string>());
            set => _identityIds = value;
        }

        /// <summary>
        /// The Principal ID for the Service Principal associated with the Identity of this Fluid Relay Server.
        /// </summary>
        [Input("principalId")]
        public Input<string>? PrincipalId { get; set; }

        /// <summary>
        /// The Tenant ID for the Service Principal associated with the Identity of this Fluid Relay Server.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        /// <summary>
        /// Specifies the type of Managed Service Identity that should be configured on this Fluid Relay Service. Possible values are `SystemAssigned`,`UserAssigned` and `SystemAssigned, UserAssigned`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ServerIdentityGetArgs()
        {
        }
        public static new ServerIdentityGetArgs Empty => new ServerIdentityGetArgs();
    }
}

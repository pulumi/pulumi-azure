// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Outputs
{

    [OutputType]
    public sealed class NetworkPacketCoreControlPlaneIdentity
    {
        /// <summary>
        /// A list of the IDs for User Assigned Managed Identity resources to be assigned.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private NetworkPacketCoreControlPlaneIdentity(
            ImmutableArray<string> identityIds,

            string type)
        {
            IdentityIds = identityIds;
            Type = type;
        }
    }
}
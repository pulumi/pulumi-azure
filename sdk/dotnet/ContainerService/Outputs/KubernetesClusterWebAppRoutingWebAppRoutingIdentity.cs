// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class KubernetesClusterWebAppRoutingWebAppRoutingIdentity
    {
        /// <summary>
        /// The Client ID of the user-defined Managed Identity used for Web App Routing.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// The Object ID of the user-defined Managed Identity used for Web App Routing
        /// </summary>
        public readonly string? ObjectId;
        /// <summary>
        /// The ID of the User Assigned Identity used for Web App Routing.
        /// </summary>
        public readonly string? UserAssignedIdentityId;

        [OutputConstructor]
        private KubernetesClusterWebAppRoutingWebAppRoutingIdentity(
            string? clientId,

            string? objectId,

            string? userAssignedIdentityId)
        {
            ClientId = clientId;
            ObjectId = objectId;
            UserAssignedIdentityId = userAssignedIdentityId;
        }
    }
}

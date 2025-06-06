// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ArcKubernetes.Inputs
{

    public sealed class ProvisionedClusterAzureActiveDirectoryGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("adminGroupObjectIds")]
        private InputList<string>? _adminGroupObjectIds;

        /// <summary>
        /// A list of IDs of Microsoft Entra ID Groups. All members of the specified Microsoft Entra ID Groups have the cluster administrator access to the Kubernetes cluster.
        /// </summary>
        public InputList<string> AdminGroupObjectIds
        {
            get => _adminGroupObjectIds ?? (_adminGroupObjectIds = new InputList<string>());
            set => _adminGroupObjectIds = value;
        }

        /// <summary>
        /// Whether to enable Azure RBAC for Kubernetes authorization. Defaults to `false`.
        /// </summary>
        [Input("azureRbacEnabled")]
        public Input<bool>? AzureRbacEnabled { get; set; }

        /// <summary>
        /// The Tenant ID to use for authentication. If not specified, the Tenant of the Arc Kubernetes Cluster will be used.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public ProvisionedClusterAzureActiveDirectoryGetArgs()
        {
        }
        public static new ProvisionedClusterAzureActiveDirectoryGetArgs Empty => new ProvisionedClusterAzureActiveDirectoryGetArgs();
    }
}

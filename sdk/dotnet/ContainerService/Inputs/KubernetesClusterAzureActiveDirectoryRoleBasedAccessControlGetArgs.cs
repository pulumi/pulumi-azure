// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterAzureActiveDirectoryRoleBasedAccessControlGetArgs : Pulumi.ResourceArgs
    {
        [Input("adminGroupObjectIds")]
        private InputList<string>? _adminGroupObjectIds;

        /// <summary>
        /// A list of Object IDs of Azure Active Directory Groups which should have Admin Role on the Cluster.
        /// </summary>
        public InputList<string> AdminGroupObjectIds
        {
            get => _adminGroupObjectIds ?? (_adminGroupObjectIds = new InputList<string>());
            set => _adminGroupObjectIds = value;
        }

        /// <summary>
        /// Is Role Based Access Control based on Azure AD enabled?
        /// </summary>
        [Input("azureRbacEnabled")]
        public Input<bool>? AzureRbacEnabled { get; set; }

        /// <summary>
        /// The Client ID of an Azure Active Directory Application.
        /// </summary>
        [Input("clientAppId")]
        public Input<string>? ClientAppId { get; set; }

        /// <summary>
        /// Is the Azure Active Directory integration Managed, meaning that Azure will create/manage the Service Principal used for integration.
        /// </summary>
        [Input("managed")]
        public Input<bool>? Managed { get; set; }

        /// <summary>
        /// The Server ID of an Azure Active Directory Application.
        /// </summary>
        [Input("serverAppId")]
        public Input<string>? ServerAppId { get; set; }

        /// <summary>
        /// The Server Secret of an Azure Active Directory Application.
        /// </summary>
        [Input("serverAppSecret")]
        public Input<string>? ServerAppSecret { get; set; }

        /// <summary>
        /// The Tenant ID used for Azure Active Directory Application. If this isn't specified the Tenant ID of the current Subscription is used.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public KubernetesClusterAzureActiveDirectoryRoleBasedAccessControlGetArgs()
        {
        }
    }
}
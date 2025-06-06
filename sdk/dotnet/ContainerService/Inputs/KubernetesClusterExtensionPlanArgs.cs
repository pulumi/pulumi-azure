// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterExtensionPlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the plan from the marketplace. Changing this forces a new Kubernetes Cluster Extension to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the product of the plan from the marketplace. Changing this forces a new Kubernetes Cluster Extension to be created.
        /// </summary>
        [Input("product", required: true)]
        public Input<string> Product { get; set; } = null!;

        /// <summary>
        /// Specifies the promotion code to use with the plan. Changing this forces a new Kubernetes Cluster Extension to be created.
        /// </summary>
        [Input("promotionCode")]
        public Input<string>? PromotionCode { get; set; }

        /// <summary>
        /// Specifies the publisher of the plan. Changing this forces a new Kubernetes Cluster Extension to be created.
        /// </summary>
        [Input("publisher", required: true)]
        public Input<string> Publisher { get; set; } = null!;

        /// <summary>
        /// Specifies the version of the plan from the marketplace. Changing this forces a new Kubernetes Cluster Extension to be created.
        /// 
        /// &gt; **Note:** When `plan` is specified, legal terms must be accepted for this item on this subscription before creating the Kubernetes Cluster Extension. The `azure.marketplace.Agreement` resource or AZ CLI tool can be used to do this.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public KubernetesClusterExtensionPlanArgs()
        {
        }
        public static new KubernetesClusterExtensionPlanArgs Empty => new KubernetesClusterExtensionPlanArgs();
    }
}

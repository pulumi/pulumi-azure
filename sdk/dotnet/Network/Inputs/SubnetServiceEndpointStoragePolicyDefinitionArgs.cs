// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class SubnetServiceEndpointStoragePolicyDefinitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of this Subnet Service Endpoint Storage Policy Definition.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name which should be used for this Subnet Service Endpoint Storage Policy Definition.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The type of service resources. Valid values are `Microsoft.Storage` or `Global`. When the `service_resources` property contains resource IDs, this property must be `Microsoft.Storage`. When the `service_resources` property contains Aliases, this property must be `Global`. Defaults to `Microsoft.Storage`.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        [Input("serviceResources", required: true)]
        private InputList<string>? _serviceResources;

        /// <summary>
        /// Specifies a list of resources or aliases that this Subnet Service Endpoint Storage Policy Definition applies to.
        /// 
        /// &gt; **Note:** The `service_resources` property must contain either Aliases or Resource IDs, but not both.
        /// </summary>
        public InputList<string> ServiceResources
        {
            get => _serviceResources ?? (_serviceResources = new InputList<string>());
            set => _serviceResources = value;
        }

        public SubnetServiceEndpointStoragePolicyDefinitionArgs()
        {
        }
        public static new SubnetServiceEndpointStoragePolicyDefinitionArgs Empty => new SubnetServiceEndpointStoragePolicyDefinitionArgs();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PrivateLink.Inputs
{

    public sealed class EndpointIpConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Name of the IP Configuration. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the static IP address within the private endpoint's subnet to be used. Changing this forces a new resource to be created.
        /// </summary>
        [Input("privateIpAddress", required: true)]
        public Input<string> PrivateIpAddress { get; set; } = null!;

        /// <summary>
        /// Specifies the subresource this IP address applies to. `subresource_names` corresponds to `group_id` and in this context is also used for `member_name`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("subresourceName", required: true)]
        public Input<string> SubresourceName { get; set; } = null!;

        public EndpointIpConfigurationArgs()
        {
        }
        public static new EndpointIpConfigurationArgs Empty => new EndpointIpConfigurationArgs();
    }
}
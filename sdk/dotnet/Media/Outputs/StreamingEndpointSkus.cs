// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Outputs
{

    [OutputType]
    public sealed class StreamingEndpointSkus
    {
        /// <summary>
        /// The sku capacity of Streaming Endpoint.
        /// </summary>
        public readonly int? Capacity;
        /// <summary>
        /// The name which should be used for this Streaming Endpoint maximum length is `24`. Changing this forces a new Streaming Endpoint to be created.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private StreamingEndpointSkus(
            int? capacity,

            string? name)
        {
            Capacity = capacity;
            Name = name;
        }
    }
}
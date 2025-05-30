// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Search.Inputs
{

    public sealed class ServiceQueryKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The value of this Query Key.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The Name which should be used for this Search Service. Changing this forces a new Search Service to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ServiceQueryKeyArgs()
        {
        }
        public static new ServiceQueryKeyArgs Empty => new ServiceQueryKeyArgs();
    }
}

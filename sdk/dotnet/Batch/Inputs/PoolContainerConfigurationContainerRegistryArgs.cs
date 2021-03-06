// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Inputs
{

    public sealed class PoolContainerConfigurationContainerRegistryArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The password to log into the registry server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        /// <summary>
        /// The container registry URL. The default is "docker.io". Changing this forces a new resource to be created.
        /// </summary>
        [Input("registryServer", required: true)]
        public Input<string> RegistryServer { get; set; } = null!;

        /// <summary>
        /// The user name to log into the registry server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public PoolContainerConfigurationContainerRegistryArgs()
        {
        }
    }
}

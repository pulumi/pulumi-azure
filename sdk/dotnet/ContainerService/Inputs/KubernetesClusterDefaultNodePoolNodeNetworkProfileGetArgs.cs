// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterDefaultNodePoolNodeNetworkProfileGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedHostPorts")]
        private InputList<Inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileAllowedHostPortGetArgs>? _allowedHostPorts;

        /// <summary>
        /// One or more `allowed_host_ports` blocks as defined below.
        /// </summary>
        public InputList<Inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileAllowedHostPortGetArgs> AllowedHostPorts
        {
            get => _allowedHostPorts ?? (_allowedHostPorts = new InputList<Inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileAllowedHostPortGetArgs>());
            set => _allowedHostPorts = value;
        }

        [Input("applicationSecurityGroupIds")]
        private InputList<string>? _applicationSecurityGroupIds;

        /// <summary>
        /// A list of Application Security Group IDs which should be associated with this Node Pool.
        /// </summary>
        public InputList<string> ApplicationSecurityGroupIds
        {
            get => _applicationSecurityGroupIds ?? (_applicationSecurityGroupIds = new InputList<string>());
            set => _applicationSecurityGroupIds = value;
        }

        [Input("nodePublicIpTags")]
        private InputMap<string>? _nodePublicIpTags;

        /// <summary>
        /// Specifies a mapping of tags to the instance-level public IPs. Changing this forces a new resource to be created.
        /// </summary>
        public InputMap<string> NodePublicIpTags
        {
            get => _nodePublicIpTags ?? (_nodePublicIpTags = new InputMap<string>());
            set => _nodePublicIpTags = value;
        }

        public KubernetesClusterDefaultNodePoolNodeNetworkProfileGetArgs()
        {
        }
        public static new KubernetesClusterDefaultNodePoolNodeNetworkProfileGetArgs Empty => new KubernetesClusterDefaultNodePoolNodeNetworkProfileGetArgs();
    }
}

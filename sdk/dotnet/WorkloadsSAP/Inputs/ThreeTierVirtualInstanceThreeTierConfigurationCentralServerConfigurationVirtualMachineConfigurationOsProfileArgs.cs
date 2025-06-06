// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WorkloadsSAP.Inputs
{

    public sealed class ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationOsProfileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the administrator account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("adminUsername", required: true)]
        public Input<string> AdminUsername { get; set; } = null!;

        [Input("sshPrivateKey", required: true)]
        private Input<string>? _sshPrivateKey;

        /// <summary>
        /// The SSH public key that is used to authenticate with the Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        public Input<string>? SshPrivateKey
        {
            get => _sshPrivateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sshPrivateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The SSH private key that is used to authenticate with the Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sshPublicKey", required: true)]
        public Input<string> SshPublicKey { get; set; } = null!;

        public ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationOsProfileArgs()
        {
        }
        public static new ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationOsProfileArgs Empty => new ThreeTierVirtualInstanceThreeTierConfigurationCentralServerConfigurationVirtualMachineConfigurationOsProfileArgs();
    }
}

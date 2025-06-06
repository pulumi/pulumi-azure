// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class VirtualMachineOsProfileArgs : global::Pulumi.ResourceArgs
    {
        [Input("adminPassword")]
        private Input<string>? _adminPassword;

        /// <summary>
        /// (Optional for Windows, Optional for Linux) The password associated with the local administrator account.
        /// 
        /// &gt; **NOTE:** If using Linux, it may be preferable to use SSH Key authentication (available in the `os_profile_linux_config` block) instead of password authentication.
        /// </summary>
        public Input<string>? AdminPassword
        {
            get => _adminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the name of the local administrator account.
        /// </summary>
        [Input("adminUsername", required: true)]
        public Input<string> AdminUsername { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        [Input("computerName", required: true)]
        public Input<string> ComputerName { get; set; } = null!;

        /// <summary>
        /// Specifies custom data to supply to the machine. On Linux-based systems, this can be used as a cloud-init script. On other systems, this will be copied as a file on disk. Internally, this provider will base64 encode this value before sending it to the API. The maximum length of the binary array is 65535 bytes. Changing this forces a new resource to be created.
        /// </summary>
        [Input("customData")]
        public Input<string>? CustomData { get; set; }

        public VirtualMachineOsProfileArgs()
        {
        }
        public static new VirtualMachineOsProfileArgs Empty => new VirtualMachineOsProfileArgs();
    }
}

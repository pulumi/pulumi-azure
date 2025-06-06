// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class VirtualMachineOsProfileLinuxConfigSshKey
    {
        /// <summary>
        /// The Public SSH Key which should be written to the `path` defined above.
        /// 
        /// &gt; **Note:** Azure only supports RSA SSH2 key signatures of at least 2048 bits in length
        /// </summary>
        public readonly string KeyData;
        /// <summary>
        /// The path of the destination file on the virtual machine
        /// 
        /// &gt; **NOTE:** Due to a limitation in the Azure VM Agent the only allowed `path` is `/home/{username}/.ssh/authorized_keys`.
        /// </summary>
        public readonly string Path;

        [OutputConstructor]
        private VirtualMachineOsProfileLinuxConfigSshKey(
            string keyData,

            string path)
        {
            KeyData = keyData;
            Path = path;
        }
    }
}

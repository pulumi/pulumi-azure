// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class VirtualNetworkEncryption
    {
        /// <summary>
        /// Specifies if the encrypted Virtual Network allows VM that does not support encryption. Possible values are `DropUnencrypted` and `AllowUnencrypted`.
        /// 
        /// &gt; **Note:** Currently `AllowUnencrypted` is the only supported value for the `enforcement` property as `DropUnencrypted` is not yet in public preview or general availability. Please see the [official documentation](https://learn.microsoft.com/en-us/azure/virtual-network/virtual-network-encryption-overview#limitations) for more information.
        /// </summary>
        public readonly string Enforcement;

        [OutputConstructor]
        private VirtualNetworkEncryption(string enforcement)
        {
            Enforcement = enforcement;
        }
    }
}

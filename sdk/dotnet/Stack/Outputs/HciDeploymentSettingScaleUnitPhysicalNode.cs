// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Stack.Outputs
{

    [OutputType]
    public sealed class HciDeploymentSettingScaleUnitPhysicalNode
    {
        /// <summary>
        /// Specifies the IPv4 address assigned to each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
        /// </summary>
        public readonly string Ipv4Address;
        /// <summary>
        /// The NETBIOS name of each physical server on your Azure Stack HCI cluster. Changing this forces a new Stack HCI Deployment Setting to be created.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private HciDeploymentSettingScaleUnitPhysicalNode(
            string ipv4Address,

            string name)
        {
            Ipv4Address = ipv4Address;
            Name = name;
        }
    }
}

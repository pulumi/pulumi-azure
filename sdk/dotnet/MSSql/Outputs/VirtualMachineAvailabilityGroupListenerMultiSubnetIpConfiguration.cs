// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Outputs
{

    [OutputType]
    public sealed class VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfiguration
    {
        /// <summary>
        /// The private IP Address of the listener. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string PrivateIpAddress;
        /// <summary>
        /// The ID of the Sql Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string SqlVirtualMachineId;
        /// <summary>
        /// The ID of the Subnet to create the listener. Changing this forces a new resource to be created.
        /// 
        /// &gt; **NOTE:** `sql_virtual_machine_id` should match with the SQL Virtual Machines specified in `replica`.
        /// </summary>
        public readonly string SubnetId;

        [OutputConstructor]
        private VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfiguration(
            string privateIpAddress,

            string sqlVirtualMachineId,

            string subnetId)
        {
            PrivateIpAddress = privateIpAddress;
            SqlVirtualMachineId = sqlVirtualMachineId;
            SubnetId = subnetId;
        }
    }
}
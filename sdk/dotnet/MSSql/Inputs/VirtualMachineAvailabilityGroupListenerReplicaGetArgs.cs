// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Inputs
{

    public sealed class VirtualMachineAvailabilityGroupListenerReplicaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The replica commit mode for the availability group. Possible values are `Synchronous_Commit` and `Asynchronous_Commit`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("commit", required: true)]
        public Input<string> Commit { get; set; } = null!;

        /// <summary>
        /// The replica failover mode for the availability group. Possible values are `Manual` and `Automatic`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("failoverMode", required: true)]
        public Input<string> FailoverMode { get; set; } = null!;

        /// <summary>
        /// The replica readable secondary mode for the availability group. Possible values are `No`, `Read_Only` and `All`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("readableSecondary", required: true)]
        public Input<string> ReadableSecondary { get; set; } = null!;

        /// <summary>
        /// The replica role for the availability group. Possible values are `Primary` and `Secondary`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        /// <summary>
        /// The ID of the SQL Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sqlVirtualMachineId", required: true)]
        public Input<string> SqlVirtualMachineId { get; set; } = null!;

        public VirtualMachineAvailabilityGroupListenerReplicaGetArgs()
        {
        }
        public static new VirtualMachineAvailabilityGroupListenerReplicaGetArgs Empty => new VirtualMachineAvailabilityGroupListenerReplicaGetArgs();
    }
}
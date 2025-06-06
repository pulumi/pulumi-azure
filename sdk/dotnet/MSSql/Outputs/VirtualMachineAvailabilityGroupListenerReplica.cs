// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Outputs
{

    [OutputType]
    public sealed class VirtualMachineAvailabilityGroupListenerReplica
    {
        /// <summary>
        /// The replica commit mode for the availability group. Possible values are `Synchronous_Commit` and `Asynchronous_Commit`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string Commit;
        /// <summary>
        /// The replica failover mode for the availability group. Possible values are `Manual` and `Automatic`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string FailoverMode;
        /// <summary>
        /// The replica readable secondary mode for the availability group. Possible values are `No`, `Read_Only` and `All`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string ReadableSecondary;
        /// <summary>
        /// The replica role for the availability group. Possible values are `Primary` and `Secondary`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string Role;
        /// <summary>
        /// The ID of the SQL Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string SqlVirtualMachineId;

        [OutputConstructor]
        private VirtualMachineAvailabilityGroupListenerReplica(
            string commit,

            string failoverMode,

            string readableSecondary,

            string role,

            string sqlVirtualMachineId)
        {
            Commit = commit;
            FailoverMode = failoverMode;
            ReadableSecondary = readableSecondary;
            Role = role;
            SqlVirtualMachineId = sqlVirtualMachineId;
        }
    }
}

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery.Inputs
{

    public sealed class ReplicationRecoveryPlanAzureToAzureSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Edge Zone within the Azure Region where the VM exists. Changing this forces a new Site Recovery Replication Recovery Plan to be created.
        /// </summary>
        [Input("primaryEdgeZone")]
        public Input<string>? PrimaryEdgeZone { get; set; }

        /// <summary>
        /// The Availability Zone in which the VM is located. Changing this forces a new Site Recovery Replication Recovery Plan to be created.
        /// </summary>
        [Input("primaryZone")]
        public Input<string>? PrimaryZone { get; set; }

        /// <summary>
        /// The Edge Zone within the Azure Region where the VM is recovered. Changing this forces a new Site Recovery Replication Recovery Plan to be created.
        /// 
        /// &gt; **Note:** `primary_edge_zone` and `recovery_edge_zone` must be specified together.
        /// </summary>
        [Input("recoveryEdgeZone")]
        public Input<string>? RecoveryEdgeZone { get; set; }

        /// <summary>
        /// The Availability Zone in which the VM is recovered. Changing this forces a new Site Recovery Replication Recovery Plan to be created.
        /// 
        /// &gt; **Note:** `primary_zone` and `recovery_zone` must be specified together.
        /// </summary>
        [Input("recoveryZone")]
        public Input<string>? RecoveryZone { get; set; }

        public ReplicationRecoveryPlanAzureToAzureSettingsArgs()
        {
        }
        public static new ReplicationRecoveryPlanAzureToAzureSettingsArgs Empty => new ReplicationRecoveryPlanAzureToAzureSettingsArgs();
    }
}

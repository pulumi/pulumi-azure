// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataBricks.Outputs
{

    [OutputType]
    public sealed class WorkspaceEnhancedSecurityCompliance
    {
        /// <summary>
        /// Enables automatic cluster updates for this workspace. Defaults to `false`.
        /// </summary>
        public readonly bool? AutomaticClusterUpdateEnabled;
        /// <summary>
        /// Enables compliance security profile for this workspace. Defaults to `false`.
        /// 
        /// &gt; **Note:** Changing the value of `compliance_security_profile_enabled` from `true` to `false` forces a replacement of the Databricks workspace.
        /// 
        /// &gt; **Note:** The attributes `automatic_cluster_update_enabled` and `enhanced_security_monitoring_enabled` must be set to `true` in order to set `compliance_security_profile_enabled` to `true`.
        /// </summary>
        public readonly bool? ComplianceSecurityProfileEnabled;
        /// <summary>
        /// A list of standards to enforce on this workspace. Possible values include `HIPAA` and `PCI_DSS`.
        /// 
        /// &gt; **Note:** `compliance_security_profile_enabled` must be set to `true` in order to use `compliance_security_profile_standards`.
        /// 
        /// &gt; **Note:** Removing a standard from the `compliance_security_profile_standards` list forces a replacement of the Databricks workspace.
        /// </summary>
        public readonly ImmutableArray<string> ComplianceSecurityProfileStandards;
        /// <summary>
        /// Enables enhanced security monitoring for this workspace. Defaults to `false`.
        /// </summary>
        public readonly bool? EnhancedSecurityMonitoringEnabled;

        [OutputConstructor]
        private WorkspaceEnhancedSecurityCompliance(
            bool? automaticClusterUpdateEnabled,

            bool? complianceSecurityProfileEnabled,

            ImmutableArray<string> complianceSecurityProfileStandards,

            bool? enhancedSecurityMonitoringEnabled)
        {
            AutomaticClusterUpdateEnabled = automaticClusterUpdateEnabled;
            ComplianceSecurityProfileEnabled = complianceSecurityProfileEnabled;
            ComplianceSecurityProfileStandards = complianceSecurityProfileStandards;
            EnhancedSecurityMonitoringEnabled = enhancedSecurityMonitoringEnabled;
        }
    }
}

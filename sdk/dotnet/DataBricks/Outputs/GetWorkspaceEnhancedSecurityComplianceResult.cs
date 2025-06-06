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
    public sealed class GetWorkspaceEnhancedSecurityComplianceResult
    {
        /// <summary>
        /// Whether automatic cluster updates for this workspace is enabled.
        /// </summary>
        public readonly bool AutomaticClusterUpdateEnabled;
        /// <summary>
        /// Whether compliance security profile for this workspace is enabled.
        /// </summary>
        public readonly bool ComplianceSecurityProfileEnabled;
        /// <summary>
        /// A list of standards enforced on this workspace.
        /// </summary>
        public readonly ImmutableArray<string> ComplianceSecurityProfileStandards;
        /// <summary>
        /// Whether enhanced security monitoring for this workspace is enabled.
        /// </summary>
        public readonly bool EnhancedSecurityMonitoringEnabled;

        [OutputConstructor]
        private GetWorkspaceEnhancedSecurityComplianceResult(
            bool automaticClusterUpdateEnabled,

            bool complianceSecurityProfileEnabled,

            ImmutableArray<string> complianceSecurityProfileStandards,

            bool enhancedSecurityMonitoringEnabled)
        {
            AutomaticClusterUpdateEnabled = automaticClusterUpdateEnabled;
            ComplianceSecurityProfileEnabled = complianceSecurityProfileEnabled;
            ComplianceSecurityProfileStandards = complianceSecurityProfileStandards;
            EnhancedSecurityMonitoringEnabled = enhancedSecurityMonitoringEnabled;
        }
    }
}

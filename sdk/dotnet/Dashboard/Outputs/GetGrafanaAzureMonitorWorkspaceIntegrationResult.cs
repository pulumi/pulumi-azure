// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Dashboard.Outputs
{

    [OutputType]
    public sealed class GetGrafanaAzureMonitorWorkspaceIntegrationResult
    {
        public readonly string ResourceId;

        [OutputConstructor]
        private GetGrafanaAzureMonitorWorkspaceIntegrationResult(string resourceId)
        {
            ResourceId = resourceId;
        }
    }
}

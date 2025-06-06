// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Nginx.Outputs
{

    [OutputType]
    public sealed class GetDeploymentWebApplicationFirewallStatusComponentVersionResult
    {
        public readonly string WafEngineVersion;
        public readonly string WafNginxVersion;

        [OutputConstructor]
        private GetDeploymentWebApplicationFirewallStatusComponentVersionResult(
            string wafEngineVersion,

            string wafNginxVersion)
        {
            WafEngineVersion = wafEngineVersion;
            WafNginxVersion = wafNginxVersion;
        }
    }
}

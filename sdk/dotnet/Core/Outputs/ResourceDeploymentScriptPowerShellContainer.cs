// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Outputs
{

    [OutputType]
    public sealed class ResourceDeploymentScriptPowerShellContainer
    {
        /// <summary>
        /// Container group name, if not specified then the name will get auto-generated. For more information, please refer to the [Container Configuration](https://learn.microsoft.com/en-us/rest/api/resources/deployment-scripts/create?tabs=HTTP#containerconfiguration) documentation.
        /// </summary>
        public readonly string? ContainerGroupName;

        [OutputConstructor]
        private ResourceDeploymentScriptPowerShellContainer(string? containerGroupName)
        {
            ContainerGroupName = containerGroupName;
        }
    }
}

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
    public sealed class GetDeploymentLoggingStorageAccountResult
    {
        public readonly string ContainerName;
        /// <summary>
        /// The name of this NGINX Deployment.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetDeploymentLoggingStorageAccountResult(
            string containerName,

            string name)
        {
            ContainerName = containerName;
            Name = name;
        }
    }
}

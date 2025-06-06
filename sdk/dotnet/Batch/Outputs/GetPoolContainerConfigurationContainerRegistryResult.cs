// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Outputs
{

    [OutputType]
    public sealed class GetPoolContainerConfigurationContainerRegistryResult
    {
        /// <summary>
        /// The password for the user account.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The container registry URL. The default is "docker.io".
        /// </summary>
        public readonly string RegistryServer;
        /// <summary>
        /// The reference to the user assigned identity to use to access an Azure Container Registry instead of username and password.
        /// </summary>
        public readonly string UserAssignedIdentityId;
        /// <summary>
        /// The user to use for authentication against the CIFS file system.
        /// </summary>
        public readonly string UserName;

        [OutputConstructor]
        private GetPoolContainerConfigurationContainerRegistryResult(
            string password,

            string registryServer,

            string userAssignedIdentityId,

            string userName)
        {
            Password = password;
            RegistryServer = registryServer;
            UserAssignedIdentityId = userAssignedIdentityId;
            UserName = userName;
        }
    }
}

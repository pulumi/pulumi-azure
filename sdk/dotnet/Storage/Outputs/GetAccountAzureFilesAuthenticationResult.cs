// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Outputs
{

    [OutputType]
    public sealed class GetAccountAzureFilesAuthenticationResult
    {
        /// <summary>
        /// An `active_directory` block as documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccountAzureFilesAuthenticationActiveDirectoryResult> ActiveDirectories;
        /// <summary>
        /// The directory service used for this Storage Account.
        /// </summary>
        public readonly string DirectoryType;

        [OutputConstructor]
        private GetAccountAzureFilesAuthenticationResult(
            ImmutableArray<Outputs.GetAccountAzureFilesAuthenticationActiveDirectoryResult> activeDirectories,

            string directoryType)
        {
            ActiveDirectories = activeDirectories;
            DirectoryType = directoryType;
        }
    }
}
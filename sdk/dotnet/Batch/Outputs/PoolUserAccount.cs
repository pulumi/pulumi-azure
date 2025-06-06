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
    public sealed class PoolUserAccount
    {
        /// <summary>
        /// The elevation level of the user account. "NonAdmin" - The auto user is a standard user without elevated access. "Admin" - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
        /// </summary>
        public readonly string ElevationLevel;
        /// <summary>
        /// The `linux_user_configuration` block defined below is a linux-specific user configuration for the user account. This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
        /// </summary>
        public readonly ImmutableArray<Outputs.PoolUserAccountLinuxUserConfiguration> LinuxUserConfigurations;
        /// <summary>
        /// The name of the user account.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The password for the user account.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The `windows_user_configuration` block defined below is a windows-specific user configuration for the user account. This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
        /// </summary>
        public readonly ImmutableArray<Outputs.PoolUserAccountWindowsUserConfiguration> WindowsUserConfigurations;

        [OutputConstructor]
        private PoolUserAccount(
            string elevationLevel,

            ImmutableArray<Outputs.PoolUserAccountLinuxUserConfiguration> linuxUserConfigurations,

            string name,

            string password,

            ImmutableArray<Outputs.PoolUserAccountWindowsUserConfiguration> windowsUserConfigurations)
        {
            ElevationLevel = elevationLevel;
            LinuxUserConfigurations = linuxUserConfigurations;
            Name = name;
            Password = password;
            WindowsUserConfigurations = windowsUserConfigurations;
        }
    }
}

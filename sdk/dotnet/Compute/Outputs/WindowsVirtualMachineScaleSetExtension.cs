// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class WindowsVirtualMachineScaleSetExtension
    {
        /// <summary>
        /// Should the latest version of the Extension be used at Deployment Time, if one is available? This won't auto-update the extension on existing installation. Defaults to `true`.
        /// </summary>
        public readonly bool? AutoUpgradeMinorVersion;
        /// <summary>
        /// Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension?
        /// </summary>
        public readonly bool? AutomaticUpgradeEnabled;
        /// <summary>
        /// A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn't changed.
        /// </summary>
        public readonly string? ForceUpdateTag;
        /// <summary>
        /// The name for the Virtual Machine Scale Set Extension.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
        /// 
        /// &gt; **Note:** Keys within the `protected_settings` block are notoriously case-sensitive, where the casing required (e.g. TitleCase vs snakeCase) depends on the Extension being used. Please refer to the documentation for the specific Virtual Machine Extension you're looking to use for more information.
        /// </summary>
        public readonly string? ProtectedSettings;
        /// <summary>
        /// A `protected_settings_from_key_vault` block as defined below.
        /// 
        /// &gt; **Note:** `protected_settings_from_key_vault` cannot be used with `protected_settings`
        /// </summary>
        public readonly Outputs.WindowsVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVault? ProtectedSettingsFromKeyVault;
        /// <summary>
        /// An ordered list of Extension names which this should be provisioned after.
        /// </summary>
        public readonly ImmutableArray<string> ProvisionAfterExtensions;
        /// <summary>
        /// Specifies the Publisher of the Extension.
        /// </summary>
        public readonly string Publisher;
        /// <summary>
        /// A JSON String which specifies Settings for the Extension.
        /// 
        /// &gt; **Note:** Keys within the `settings` block are notoriously case-sensitive, where the casing required (e.g. TitleCase vs snakeCase) depends on the Extension being used. Please refer to the documentation for the specific Virtual Machine Extension you're looking to use for more information.
        /// </summary>
        public readonly string? Settings;
        /// <summary>
        /// Specifies the Type of the Extension.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Specifies the version of the extension to use, available versions can be found using the Azure CLI.
        /// </summary>
        public readonly string TypeHandlerVersion;

        [OutputConstructor]
        private WindowsVirtualMachineScaleSetExtension(
            bool? autoUpgradeMinorVersion,

            bool? automaticUpgradeEnabled,

            string? forceUpdateTag,

            string name,

            string? protectedSettings,

            Outputs.WindowsVirtualMachineScaleSetExtensionProtectedSettingsFromKeyVault? protectedSettingsFromKeyVault,

            ImmutableArray<string> provisionAfterExtensions,

            string publisher,

            string? settings,

            string type,

            string typeHandlerVersion)
        {
            AutoUpgradeMinorVersion = autoUpgradeMinorVersion;
            AutomaticUpgradeEnabled = automaticUpgradeEnabled;
            ForceUpdateTag = forceUpdateTag;
            Name = name;
            ProtectedSettings = protectedSettings;
            ProtectedSettingsFromKeyVault = protectedSettingsFromKeyVault;
            ProvisionAfterExtensions = provisionAfterExtensions;
            Publisher = publisher;
            Settings = settings;
            Type = type;
            TypeHandlerVersion = typeHandlerVersion;
        }
    }
}

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Azure
{
    public static class Config
    {
        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("azure");

        private static readonly __Value<string?> _adoPipelineServiceConnectionId = new __Value<string?>(() => __config.Get("adoPipelineServiceConnectionId"));
        /// <summary>
        /// The Azure DevOps Pipeline Service Connection ID.
        /// </summary>
        public static string? AdoPipelineServiceConnectionId
        {
            get => _adoPipelineServiceConnectionId.Get();
            set => _adoPipelineServiceConnectionId.Set(value);
        }

        private static readonly __Value<ImmutableArray<string>> _auxiliaryTenantIds = new __Value<ImmutableArray<string>>(() => __config.GetObject<ImmutableArray<string>>("auxiliaryTenantIds"));
        public static ImmutableArray<string> AuxiliaryTenantIds
        {
            get => _auxiliaryTenantIds.Get();
            set => _auxiliaryTenantIds.Set(value);
        }

        private static readonly __Value<string?> _clientCertificate = new __Value<string?>(() => __config.Get("clientCertificate"));
        /// <summary>
        /// Base64 encoded PKCS#12 certificate bundle to use when authenticating as a Service Principal using a Client Certificate
        /// </summary>
        public static string? ClientCertificate
        {
            get => _clientCertificate.Get();
            set => _clientCertificate.Set(value);
        }

        private static readonly __Value<string?> _clientCertificatePassword = new __Value<string?>(() => __config.Get("clientCertificatePassword"));
        /// <summary>
        /// The password associated with the Client Certificate. For use when authenticating as a Service Principal using a Client
        /// Certificate
        /// </summary>
        public static string? ClientCertificatePassword
        {
            get => _clientCertificatePassword.Get();
            set => _clientCertificatePassword.Set(value);
        }

        private static readonly __Value<string?> _clientCertificatePath = new __Value<string?>(() => __config.Get("clientCertificatePath"));
        /// <summary>
        /// The path to the Client Certificate associated with the Service Principal for use when authenticating as a Service
        /// Principal using a Client Certificate.
        /// </summary>
        public static string? ClientCertificatePath
        {
            get => _clientCertificatePath.Get();
            set => _clientCertificatePath.Set(value);
        }

        private static readonly __Value<string?> _clientId = new __Value<string?>(() => __config.Get("clientId"));
        /// <summary>
        /// The Client ID which should be used.
        /// </summary>
        public static string? ClientId
        {
            get => _clientId.Get();
            set => _clientId.Set(value);
        }

        private static readonly __Value<string?> _clientIdFilePath = new __Value<string?>(() => __config.Get("clientIdFilePath"));
        /// <summary>
        /// The path to a file containing the Client ID which should be used.
        /// </summary>
        public static string? ClientIdFilePath
        {
            get => _clientIdFilePath.Get();
            set => _clientIdFilePath.Set(value);
        }

        private static readonly __Value<string?> _clientSecret = new __Value<string?>(() => __config.Get("clientSecret"));
        /// <summary>
        /// The Client Secret which should be used. For use When authenticating as a Service Principal using a Client Secret.
        /// </summary>
        public static string? ClientSecret
        {
            get => _clientSecret.Get();
            set => _clientSecret.Set(value);
        }

        private static readonly __Value<string?> _clientSecretFilePath = new __Value<string?>(() => __config.Get("clientSecretFilePath"));
        /// <summary>
        /// The path to a file containing the Client Secret which should be used. For use When authenticating as a Service Principal
        /// using a Client Secret.
        /// </summary>
        public static string? ClientSecretFilePath
        {
            get => _clientSecretFilePath.Get();
            set => _clientSecretFilePath.Set(value);
        }

        private static readonly __Value<bool?> _disableCorrelationRequestId = new __Value<bool?>(() => __config.GetBoolean("disableCorrelationRequestId"));
        /// <summary>
        /// This will disable the x-ms-correlation-request-id header.
        /// </summary>
        public static bool? DisableCorrelationRequestId
        {
            get => _disableCorrelationRequestId.Get();
            set => _disableCorrelationRequestId.Set(value);
        }

        private static readonly __Value<bool?> _disableTerraformPartnerId = new __Value<bool?>(() => __config.GetBoolean("disableTerraformPartnerId"));
        public static bool? DisableTerraformPartnerId
        {
            get => _disableTerraformPartnerId.Get();
            set => _disableTerraformPartnerId.Set(value);
        }

        private static readonly __Value<string?> _environment = new __Value<string?>(() => __config.Get("environment") ?? Utilities.GetEnv("AZURE_ENVIRONMENT", "ARM_ENVIRONMENT") ?? "public");
        /// <summary>
        /// The Cloud Environment which should be used. Possible values are public, usgovernment, and china. Defaults to public. Not
        /// used and should not be specified when `metadata_host` is specified.
        /// </summary>
        public static string? Environment
        {
            get => _environment.Get();
            set => _environment.Set(value);
        }

        private static readonly __Value<Pulumi.Azure.Config.Types.Features?> _features = new __Value<Pulumi.Azure.Config.Types.Features?>(() => __config.GetObject<Pulumi.Azure.Config.Types.Features>("features"));
        public static Pulumi.Azure.Config.Types.Features? Features
        {
            get => _features.Get();
            set => _features.Set(value);
        }

        private static readonly __Value<string?> _location = new __Value<string?>(() => __config.Get("location") ?? Utilities.GetEnv("ARM_LOCATION"));
        public static string? Location
        {
            get => _location.Get();
            set => _location.Set(value);
        }

        private static readonly __Value<string?> _metadataHost = new __Value<string?>(() => __config.Get("metadataHost") ?? Utilities.GetEnv("ARM_METADATA_HOSTNAME"));
        /// <summary>
        /// The Hostname which should be used for the Azure Metadata Service.
        /// </summary>
        public static string? MetadataHost
        {
            get => _metadataHost.Get();
            set => _metadataHost.Set(value);
        }

        private static readonly __Value<string?> _msiEndpoint = new __Value<string?>(() => __config.Get("msiEndpoint"));
        /// <summary>
        /// The path to a custom endpoint for Managed Service Identity - in most circumstances this should be detected
        /// automatically.
        /// </summary>
        public static string? MsiEndpoint
        {
            get => _msiEndpoint.Get();
            set => _msiEndpoint.Set(value);
        }

        private static readonly __Value<string?> _oidcRequestToken = new __Value<string?>(() => __config.Get("oidcRequestToken"));
        /// <summary>
        /// The bearer token for the request to the OIDC provider. For use when authenticating as a Service Principal using OpenID
        /// Connect.
        /// </summary>
        public static string? OidcRequestToken
        {
            get => _oidcRequestToken.Get();
            set => _oidcRequestToken.Set(value);
        }

        private static readonly __Value<string?> _oidcRequestUrl = new __Value<string?>(() => __config.Get("oidcRequestUrl"));
        /// <summary>
        /// The URL for the OIDC provider from which to request an ID token. For use when authenticating as a Service Principal
        /// using OpenID Connect.
        /// </summary>
        public static string? OidcRequestUrl
        {
            get => _oidcRequestUrl.Get();
            set => _oidcRequestUrl.Set(value);
        }

        private static readonly __Value<string?> _oidcToken = new __Value<string?>(() => __config.Get("oidcToken"));
        /// <summary>
        /// The OIDC ID token for use when authenticating as a Service Principal using OpenID Connect.
        /// </summary>
        public static string? OidcToken
        {
            get => _oidcToken.Get();
            set => _oidcToken.Set(value);
        }

        private static readonly __Value<string?> _oidcTokenFilePath = new __Value<string?>(() => __config.Get("oidcTokenFilePath"));
        /// <summary>
        /// The path to a file containing an OIDC ID token for use when authenticating as a Service Principal using OpenID Connect.
        /// </summary>
        public static string? OidcTokenFilePath
        {
            get => _oidcTokenFilePath.Get();
            set => _oidcTokenFilePath.Set(value);
        }

        private static readonly __Value<string?> _partnerId = new __Value<string?>(() => __config.Get("partnerId"));
        /// <summary>
        /// A GUID/UUID that is registered with Microsoft to facilitate partner resource usage attribution.
        /// </summary>
        public static string? PartnerId
        {
            get => _partnerId.Get();
            set => _partnerId.Set(value);
        }

        private static readonly __Value<string?> _resourceProviderRegistrations = new __Value<string?>(() => __config.Get("resourceProviderRegistrations"));
        /// <summary>
        /// The set of Resource Providers which should be automatically registered for the subscription.
        /// </summary>
        public static string? ResourceProviderRegistrations
        {
            get => _resourceProviderRegistrations.Get();
            set => _resourceProviderRegistrations.Set(value);
        }

        private static readonly __Value<ImmutableArray<string>> _resourceProvidersToRegisters = new __Value<ImmutableArray<string>>(() => __config.GetObject<ImmutableArray<string>>("resourceProvidersToRegisters"));
        /// <summary>
        /// A list of Resource Providers to explicitly register for the subscription, in addition to those specified by the
        /// `resource_provider_registrations` property.
        /// </summary>
        public static ImmutableArray<string> ResourceProvidersToRegisters
        {
            get => _resourceProvidersToRegisters.Get();
            set => _resourceProvidersToRegisters.Set(value);
        }

        private static readonly __Value<bool?> _skipProviderRegistration = new __Value<bool?>(() => __config.GetBoolean("skipProviderRegistration") ?? Utilities.GetEnvBoolean("ARM_SKIP_PROVIDER_REGISTRATION") ?? false);
        /// <summary>
        /// Should the AzureRM Provider skip registering all of the Resource Providers that it supports, if they're not already
        /// registered?
        /// </summary>
        public static bool? SkipProviderRegistration
        {
            get => _skipProviderRegistration.Get();
            set => _skipProviderRegistration.Set(value);
        }

        private static readonly __Value<bool?> _storageUseAzuread = new __Value<bool?>(() => __config.GetBoolean("storageUseAzuread") ?? Utilities.GetEnvBoolean("ARM_STORAGE_USE_AZUREAD") ?? false);
        /// <summary>
        /// Should the AzureRM Provider use Azure AD Authentication when accessing the Storage Data Plane APIs?
        /// </summary>
        public static bool? StorageUseAzuread
        {
            get => _storageUseAzuread.Get();
            set => _storageUseAzuread.Set(value);
        }

        private static readonly __Value<string?> _subscriptionId = new __Value<string?>(() => __config.Get("subscriptionId") ?? Utilities.GetEnv("ARM_SUBSCRIPTION_ID") ?? "");
        /// <summary>
        /// The Subscription ID which should be used.
        /// </summary>
        public static string? SubscriptionId
        {
            get => _subscriptionId.Get();
            set => _subscriptionId.Set(value);
        }

        private static readonly __Value<string?> _tenantId = new __Value<string?>(() => __config.Get("tenantId"));
        /// <summary>
        /// The Tenant ID which should be used.
        /// </summary>
        public static string? TenantId
        {
            get => _tenantId.Get();
            set => _tenantId.Set(value);
        }

        private static readonly __Value<bool?> _useAksWorkloadIdentity = new __Value<bool?>(() => __config.GetBoolean("useAksWorkloadIdentity"));
        /// <summary>
        /// Allow Azure AKS Workload Identity to be used for Authentication.
        /// </summary>
        public static bool? UseAksWorkloadIdentity
        {
            get => _useAksWorkloadIdentity.Get();
            set => _useAksWorkloadIdentity.Set(value);
        }

        private static readonly __Value<bool?> _useCli = new __Value<bool?>(() => __config.GetBoolean("useCli"));
        /// <summary>
        /// Allow Azure CLI to be used for Authentication.
        /// </summary>
        public static bool? UseCli
        {
            get => _useCli.Get();
            set => _useCli.Set(value);
        }

        private static readonly __Value<bool?> _useMsi = new __Value<bool?>(() => __config.GetBoolean("useMsi"));
        /// <summary>
        /// Allow Managed Service Identity to be used for Authentication.
        /// </summary>
        public static bool? UseMsi
        {
            get => _useMsi.Get();
            set => _useMsi.Set(value);
        }

        private static readonly __Value<bool?> _useOidc = new __Value<bool?>(() => __config.GetBoolean("useOidc"));
        /// <summary>
        /// Allow OpenID Connect to be used for authentication
        /// </summary>
        public static bool? UseOidc
        {
            get => _useOidc.Get();
            set => _useOidc.Set(value);
        }

        public static class Types
        {

             public class Features
             {
                public Pulumi.Azure.Config.Types.FeaturesApiManagement? ApiManagement { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesAppConfiguration? AppConfiguration { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesApplicationInsights? ApplicationInsights { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesCognitiveAccount? CognitiveAccount { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesDatabricksWorkspace? DatabricksWorkspace { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesKeyVault? KeyVault { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesLogAnalyticsWorkspace? LogAnalyticsWorkspace { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesMachineLearning? MachineLearning { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesManagedDisk? ManagedDisk { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesNetapp? Netapp { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesPostgresqlFlexibleServer? PostgresqlFlexibleServer { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesRecoveryService? RecoveryService { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesRecoveryServicesVaults? RecoveryServicesVaults { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesResourceGroup? ResourceGroup { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesStorage? Storage { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesSubscription? Subscription { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesTemplateDeployment? TemplateDeployment { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesVirtualMachine? VirtualMachine { get; set; } = null!;
                public Pulumi.Azure.Config.Types.FeaturesVirtualMachineScaleSet? VirtualMachineScaleSet { get; set; } = null!;
            }

             public class FeaturesApiManagement
             {
                public bool? PurgeSoftDeleteOnDestroy { get; set; }
                public bool? RecoverSoftDeleted { get; set; }
            }

             public class FeaturesAppConfiguration
             {
                public bool? PurgeSoftDeleteOnDestroy { get; set; }
                public bool? RecoverSoftDeleted { get; set; }
            }

             public class FeaturesApplicationInsights
             {
                public bool? DisableGeneratedRule { get; set; }
            }

             public class FeaturesCognitiveAccount
             {
                public bool? PurgeSoftDeleteOnDestroy { get; set; }
            }

             public class FeaturesDatabricksWorkspace
             {
            /// <summary>
            /// When enabled, the managed resource group that contains the Unity Catalog data will be forcibly deleted when the workspace is destroyed, regardless of contents.
            /// </summary>
                public bool? ForceDelete { get; set; }
            }

             public class FeaturesKeyVault
             {
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.KeyVault` resources will be permanently deleted (e.g purged), when destroyed
            /// </summary>
                public bool? PurgeSoftDeleteOnDestroy { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.Certificate` resources will be permanently deleted (e.g purged), when destroyed
            /// </summary>
                public bool? PurgeSoftDeletedCertificatesOnDestroy { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.ManagedHardwareSecurityModuleKey` resources will be permanently deleted (e.g purged), when destroyed
            /// </summary>
                public bool? PurgeSoftDeletedHardwareSecurityModuleKeysOnDestroy { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.ManagedHardwareSecurityModule` resources will be permanently deleted (e.g purged), when destroyed
            /// </summary>
                public bool? PurgeSoftDeletedHardwareSecurityModulesOnDestroy { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.Key` resources will be permanently deleted (e.g purged), when destroyed
            /// </summary>
                public bool? PurgeSoftDeletedKeysOnDestroy { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.Secret` resources will be permanently deleted (e.g purged), when destroyed
            /// </summary>
                public bool? PurgeSoftDeletedSecretsOnDestroy { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.Certificate` resources will be restored, instead of creating new ones
            /// </summary>
                public bool? RecoverSoftDeletedCertificates { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.ManagedHardwareSecurityModuleKey` resources will be restored, instead of creating new ones
            /// </summary>
                public bool? RecoverSoftDeletedHardwareSecurityModuleKeys { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.KeyVault` resources will be restored, instead of creating new ones
            /// </summary>
                public bool? RecoverSoftDeletedKeyVaults { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.Key` resources will be restored, instead of creating new ones
            /// </summary>
                public bool? RecoverSoftDeletedKeys { get; set; }
            /// <summary>
            /// When enabled soft-deleted `azure.keyvault.Secret` resources will be restored, instead of creating new ones
            /// </summary>
                public bool? RecoverSoftDeletedSecrets { get; set; }
            }

             public class FeaturesLogAnalyticsWorkspace
             {
                public bool? PermanentlyDeleteOnDestroy { get; set; }
            }

             public class FeaturesMachineLearning
             {
                public bool? PurgeSoftDeletedWorkspaceOnDestroy { get; set; }
            }

             public class FeaturesManagedDisk
             {
                public bool? ExpandWithoutDowntime { get; set; }
            }

             public class FeaturesNetapp
             {
            /// <summary>
            /// When enabled, backups will be deleted when the `azure.netapp.BackupVault` resource is destroyed
            /// </summary>
                public bool? DeleteBackupsOnBackupVaultDestroy { get; set; }
            /// <summary>
            /// When enabled, the volume will not be destroyed, safeguarding from severe data loss
            /// </summary>
                public bool? PreventVolumeDestruction { get; set; }
            }

             public class FeaturesPostgresqlFlexibleServer
             {
                public bool? RestartServerOnConfigurationValueChange { get; set; }
            }

             public class FeaturesRecoveryService
             {
                public bool? PurgeProtectedItemsFromVaultOnDestroy { get; set; }
                public bool? VmBackupStopProtectionAndRetainDataOnDestroy { get; set; }
                public bool? VmBackupSuspendProtectionAndRetainDataOnDestroy { get; set; }
            }

             public class FeaturesRecoveryServicesVaults
             {
                public bool? RecoverSoftDeletedBackupProtectedVm { get; set; }
            }

             public class FeaturesResourceGroup
             {
                public bool? PreventDeletionIfContainsResources { get; set; }
            }

             public class FeaturesStorage
             {
                public bool? DataPlaneAvailable { get; set; }
            }

             public class FeaturesSubscription
             {
                public bool? PreventCancellationOnDestroy { get; set; }
            }

             public class FeaturesTemplateDeployment
             {
                public bool DeleteNestedItemsDuringDeletion { get; set; }
            }

             public class FeaturesVirtualMachine
             {
                public bool? DeleteOsDiskOnDeletion { get; set; }
                public bool? DetachImplicitDataDiskOnDeletion { get; set; }
                public bool? GracefulShutdown { get; set; }
                public bool? SkipShutdownAndForceDelete { get; set; }
            }

             public class FeaturesVirtualMachineScaleSet
             {
                public bool? ForceDelete { get; set; }
                public bool? ReimageOnManualUpgrade { get; set; }
                public bool? RollInstancesWhenRequired { get; set; }
                public bool? ScaleToZeroBeforeDeletion { get; set; }
            }
        }
    }
}

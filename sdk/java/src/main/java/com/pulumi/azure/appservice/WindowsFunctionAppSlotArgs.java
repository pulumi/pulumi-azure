// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotAuthSettingsArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotBackupArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotConnectionStringArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotIdentityArgs;
import com.pulumi.azure.appservice.inputs.WindowsFunctionAppSlotSiteConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFunctionAppSlotArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFunctionAppSlotArgs Empty = new WindowsFunctionAppSlotArgs();

    /**
     * A map of key-value pairs for [App Settings](https://docs.microsoft.com/azure/azure-functions/functions-app-settings) and custom values.
     * 
     */
    @Import(name="appSettings")
    private @Nullable Output<Map<String,String>> appSettings;

    /**
     * @return A map of key-value pairs for [App Settings](https://docs.microsoft.com/azure/azure-functions/functions-app-settings) and custom values.
     * 
     */
    public Optional<Output<Map<String,String>>> appSettings() {
        return Optional.ofNullable(this.appSettings);
    }

    /**
     * an `auth_settings` block as detailed below.
     * 
     */
    @Import(name="authSettings")
    private @Nullable Output<WindowsFunctionAppSlotAuthSettingsArgs> authSettings;

    /**
     * @return an `auth_settings` block as detailed below.
     * 
     */
    public Optional<Output<WindowsFunctionAppSlotAuthSettingsArgs>> authSettings() {
        return Optional.ofNullable(this.authSettings);
    }

    /**
     * a `backup` block as detailed below.
     * 
     */
    @Import(name="backup")
    private @Nullable Output<WindowsFunctionAppSlotBackupArgs> backup;

    /**
     * @return a `backup` block as detailed below.
     * 
     */
    public Optional<Output<WindowsFunctionAppSlotBackupArgs>> backup() {
        return Optional.ofNullable(this.backup);
    }

    /**
     * Should built-in logging be enabled. Configures `AzureWebJobsDashboard` app setting based on the configured storage setting.
     * 
     */
    @Import(name="builtinLoggingEnabled")
    private @Nullable Output<Boolean> builtinLoggingEnabled;

    /**
     * @return Should built-in logging be enabled. Configures `AzureWebJobsDashboard` app setting based on the configured storage setting.
     * 
     */
    public Optional<Output<Boolean>> builtinLoggingEnabled() {
        return Optional.ofNullable(this.builtinLoggingEnabled);
    }

    /**
     * Should the Function App Slot use Client Certificates.
     * 
     */
    @Import(name="clientCertificateEnabled")
    private @Nullable Output<Boolean> clientCertificateEnabled;

    /**
     * @return Should the Function App Slot use Client Certificates.
     * 
     */
    public Optional<Output<Boolean>> clientCertificateEnabled() {
        return Optional.ofNullable(this.clientCertificateEnabled);
    }

    /**
     * The mode of the Function App Slot&#39;s client certificates requirement for incoming requests. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`.
     * 
     */
    @Import(name="clientCertificateMode")
    private @Nullable Output<String> clientCertificateMode;

    /**
     * @return The mode of the Function App Slot&#39;s client certificates requirement for incoming requests. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`.
     * 
     */
    public Optional<Output<String>> clientCertificateMode() {
        return Optional.ofNullable(this.clientCertificateMode);
    }

    /**
     * a `connection_string` block as detailed below.
     * 
     */
    @Import(name="connectionStrings")
    private @Nullable Output<List<WindowsFunctionAppSlotConnectionStringArgs>> connectionStrings;

    /**
     * @return a `connection_string` block as detailed below.
     * 
     */
    public Optional<Output<List<WindowsFunctionAppSlotConnectionStringArgs>>> connectionStrings() {
        return Optional.ofNullable(this.connectionStrings);
    }

    /**
     * Force disable the content share settings.
     * 
     */
    @Import(name="contentShareForceDisabled")
    private @Nullable Output<Boolean> contentShareForceDisabled;

    /**
     * @return Force disable the content share settings.
     * 
     */
    public Optional<Output<Boolean>> contentShareForceDisabled() {
        return Optional.ofNullable(this.contentShareForceDisabled);
    }

    /**
     * The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps in Consumption Plans.
     * 
     */
    @Import(name="dailyMemoryTimeQuota")
    private @Nullable Output<Integer> dailyMemoryTimeQuota;

    /**
     * @return The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps in Consumption Plans.
     * 
     */
    public Optional<Output<Integer>> dailyMemoryTimeQuota() {
        return Optional.ofNullable(this.dailyMemoryTimeQuota);
    }

    /**
     * Is the Windows Function App Slot enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the Windows Function App Slot enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name of the Windows Function App this Slot is a member of. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="functionAppId", required=true)
    private Output<String> functionAppId;

    /**
     * @return The name of the Windows Function App this Slot is a member of. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> functionAppId() {
        return this.functionAppId;
    }

    /**
     * The runtime version associated with the Function App Slot.
     * 
     */
    @Import(name="functionsExtensionVersion")
    private @Nullable Output<String> functionsExtensionVersion;

    /**
     * @return The runtime version associated with the Function App Slot.
     * 
     */
    public Optional<Output<String>> functionsExtensionVersion() {
        return Optional.ofNullable(this.functionsExtensionVersion);
    }

    /**
     * Can the Function App Slot only be accessed via HTTPS?
     * 
     */
    @Import(name="httpsOnly")
    private @Nullable Output<Boolean> httpsOnly;

    /**
     * @return Can the Function App Slot only be accessed via HTTPS?
     * 
     */
    public Optional<Output<Boolean>> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }

    /**
     * an `identity` block as detailed below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<WindowsFunctionAppSlotIdentityArgs> identity;

    /**
     * @return an `identity` block as detailed below.
     * 
     */
    public Optional<Output<WindowsFunctionAppSlotIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
     * 
     */
    @Import(name="keyVaultReferenceIdentityId")
    private @Nullable Output<String> keyVaultReferenceIdentityId;

    /**
     * @return The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
     * 
     */
    public Optional<Output<String>> keyVaultReferenceIdentityId() {
        return Optional.ofNullable(this.keyVaultReferenceIdentityId);
    }

    /**
     * Specifies the name of the Windows Function App Slot. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Windows Function App Slot. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * a `site_config` block as detailed below.
     * 
     */
    @Import(name="siteConfig", required=true)
    private Output<WindowsFunctionAppSlotSiteConfigArgs> siteConfig;

    /**
     * @return a `site_config` block as detailed below.
     * 
     */
    public Output<WindowsFunctionAppSlotSiteConfigArgs> siteConfig() {
        return this.siteConfig;
    }

    /**
     * The access key which will be used to access the storage account for the Function App Slot.
     * 
     */
    @Import(name="storageAccountAccessKey")
    private @Nullable Output<String> storageAccountAccessKey;

    /**
     * @return The access key which will be used to access the storage account for the Function App Slot.
     * 
     */
    public Optional<Output<String>> storageAccountAccessKey() {
        return Optional.ofNullable(this.storageAccountAccessKey);
    }

    /**
     * The backend storage account name which will be used by this Function App Slot.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    /**
     * @return The backend storage account name which will be used by this Function App Slot.
     * 
     */
    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    /**
     * The Key Vault Secret ID, optionally including version, that contains the Connection String to connect to the storage account for this Function App Slot.
     * 
     */
    @Import(name="storageKeyVaultSecretId")
    private @Nullable Output<String> storageKeyVaultSecretId;

    /**
     * @return The Key Vault Secret ID, optionally including version, that contains the Connection String to connect to the storage account for this Function App Slot.
     * 
     */
    public Optional<Output<String>> storageKeyVaultSecretId() {
        return Optional.ofNullable(this.storageKeyVaultSecretId);
    }

    /**
     * Should the Function App Slot use its Managed Identity to access storage.
     * 
     */
    @Import(name="storageUsesManagedIdentity")
    private @Nullable Output<Boolean> storageUsesManagedIdentity;

    /**
     * @return Should the Function App Slot use its Managed Identity to access storage.
     * 
     */
    public Optional<Output<Boolean>> storageUsesManagedIdentity() {
        return Optional.ofNullable(this.storageUsesManagedIdentity);
    }

    /**
     * A mapping of tags which should be assigned to the Windows Function App Slot.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Windows Function App Slot.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The subnet id which will be used by this Function App Slot for [regional virtual network integration](https://docs.microsoft.com/en-us/azure/app-service/overview-vnet-integration#regional-virtual-network-integration).
     * 
     */
    @Import(name="virtualNetworkSubnetId")
    private @Nullable Output<String> virtualNetworkSubnetId;

    /**
     * @return The subnet id which will be used by this Function App Slot for [regional virtual network integration](https://docs.microsoft.com/en-us/azure/app-service/overview-vnet-integration#regional-virtual-network-integration).
     * 
     */
    public Optional<Output<String>> virtualNetworkSubnetId() {
        return Optional.ofNullable(this.virtualNetworkSubnetId);
    }

    private WindowsFunctionAppSlotArgs() {}

    private WindowsFunctionAppSlotArgs(WindowsFunctionAppSlotArgs $) {
        this.appSettings = $.appSettings;
        this.authSettings = $.authSettings;
        this.backup = $.backup;
        this.builtinLoggingEnabled = $.builtinLoggingEnabled;
        this.clientCertificateEnabled = $.clientCertificateEnabled;
        this.clientCertificateMode = $.clientCertificateMode;
        this.connectionStrings = $.connectionStrings;
        this.contentShareForceDisabled = $.contentShareForceDisabled;
        this.dailyMemoryTimeQuota = $.dailyMemoryTimeQuota;
        this.enabled = $.enabled;
        this.functionAppId = $.functionAppId;
        this.functionsExtensionVersion = $.functionsExtensionVersion;
        this.httpsOnly = $.httpsOnly;
        this.identity = $.identity;
        this.keyVaultReferenceIdentityId = $.keyVaultReferenceIdentityId;
        this.name = $.name;
        this.siteConfig = $.siteConfig;
        this.storageAccountAccessKey = $.storageAccountAccessKey;
        this.storageAccountName = $.storageAccountName;
        this.storageKeyVaultSecretId = $.storageKeyVaultSecretId;
        this.storageUsesManagedIdentity = $.storageUsesManagedIdentity;
        this.tags = $.tags;
        this.virtualNetworkSubnetId = $.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFunctionAppSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFunctionAppSlotArgs $;

        public Builder() {
            $ = new WindowsFunctionAppSlotArgs();
        }

        public Builder(WindowsFunctionAppSlotArgs defaults) {
            $ = new WindowsFunctionAppSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appSettings A map of key-value pairs for [App Settings](https://docs.microsoft.com/azure/azure-functions/functions-app-settings) and custom values.
         * 
         * @return builder
         * 
         */
        public Builder appSettings(@Nullable Output<Map<String,String>> appSettings) {
            $.appSettings = appSettings;
            return this;
        }

        /**
         * @param appSettings A map of key-value pairs for [App Settings](https://docs.microsoft.com/azure/azure-functions/functions-app-settings) and custom values.
         * 
         * @return builder
         * 
         */
        public Builder appSettings(Map<String,String> appSettings) {
            return appSettings(Output.of(appSettings));
        }

        /**
         * @param authSettings an `auth_settings` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder authSettings(@Nullable Output<WindowsFunctionAppSlotAuthSettingsArgs> authSettings) {
            $.authSettings = authSettings;
            return this;
        }

        /**
         * @param authSettings an `auth_settings` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder authSettings(WindowsFunctionAppSlotAuthSettingsArgs authSettings) {
            return authSettings(Output.of(authSettings));
        }

        /**
         * @param backup a `backup` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder backup(@Nullable Output<WindowsFunctionAppSlotBackupArgs> backup) {
            $.backup = backup;
            return this;
        }

        /**
         * @param backup a `backup` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder backup(WindowsFunctionAppSlotBackupArgs backup) {
            return backup(Output.of(backup));
        }

        /**
         * @param builtinLoggingEnabled Should built-in logging be enabled. Configures `AzureWebJobsDashboard` app setting based on the configured storage setting.
         * 
         * @return builder
         * 
         */
        public Builder builtinLoggingEnabled(@Nullable Output<Boolean> builtinLoggingEnabled) {
            $.builtinLoggingEnabled = builtinLoggingEnabled;
            return this;
        }

        /**
         * @param builtinLoggingEnabled Should built-in logging be enabled. Configures `AzureWebJobsDashboard` app setting based on the configured storage setting.
         * 
         * @return builder
         * 
         */
        public Builder builtinLoggingEnabled(Boolean builtinLoggingEnabled) {
            return builtinLoggingEnabled(Output.of(builtinLoggingEnabled));
        }

        /**
         * @param clientCertificateEnabled Should the Function App Slot use Client Certificates.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateEnabled(@Nullable Output<Boolean> clientCertificateEnabled) {
            $.clientCertificateEnabled = clientCertificateEnabled;
            return this;
        }

        /**
         * @param clientCertificateEnabled Should the Function App Slot use Client Certificates.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateEnabled(Boolean clientCertificateEnabled) {
            return clientCertificateEnabled(Output.of(clientCertificateEnabled));
        }

        /**
         * @param clientCertificateMode The mode of the Function App Slot&#39;s client certificates requirement for incoming requests. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateMode(@Nullable Output<String> clientCertificateMode) {
            $.clientCertificateMode = clientCertificateMode;
            return this;
        }

        /**
         * @param clientCertificateMode The mode of the Function App Slot&#39;s client certificates requirement for incoming requests. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateMode(String clientCertificateMode) {
            return clientCertificateMode(Output.of(clientCertificateMode));
        }

        /**
         * @param connectionStrings a `connection_string` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(@Nullable Output<List<WindowsFunctionAppSlotConnectionStringArgs>> connectionStrings) {
            $.connectionStrings = connectionStrings;
            return this;
        }

        /**
         * @param connectionStrings a `connection_string` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(List<WindowsFunctionAppSlotConnectionStringArgs> connectionStrings) {
            return connectionStrings(Output.of(connectionStrings));
        }

        /**
         * @param connectionStrings a `connection_string` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder connectionStrings(WindowsFunctionAppSlotConnectionStringArgs... connectionStrings) {
            return connectionStrings(List.of(connectionStrings));
        }

        /**
         * @param contentShareForceDisabled Force disable the content share settings.
         * 
         * @return builder
         * 
         */
        public Builder contentShareForceDisabled(@Nullable Output<Boolean> contentShareForceDisabled) {
            $.contentShareForceDisabled = contentShareForceDisabled;
            return this;
        }

        /**
         * @param contentShareForceDisabled Force disable the content share settings.
         * 
         * @return builder
         * 
         */
        public Builder contentShareForceDisabled(Boolean contentShareForceDisabled) {
            return contentShareForceDisabled(Output.of(contentShareForceDisabled));
        }

        /**
         * @param dailyMemoryTimeQuota The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps in Consumption Plans.
         * 
         * @return builder
         * 
         */
        public Builder dailyMemoryTimeQuota(@Nullable Output<Integer> dailyMemoryTimeQuota) {
            $.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
            return this;
        }

        /**
         * @param dailyMemoryTimeQuota The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps in Consumption Plans.
         * 
         * @return builder
         * 
         */
        public Builder dailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
            return dailyMemoryTimeQuota(Output.of(dailyMemoryTimeQuota));
        }

        /**
         * @param enabled Is the Windows Function App Slot enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the Windows Function App Slot enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param functionAppId The name of the Windows Function App this Slot is a member of. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder functionAppId(Output<String> functionAppId) {
            $.functionAppId = functionAppId;
            return this;
        }

        /**
         * @param functionAppId The name of the Windows Function App this Slot is a member of. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder functionAppId(String functionAppId) {
            return functionAppId(Output.of(functionAppId));
        }

        /**
         * @param functionsExtensionVersion The runtime version associated with the Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder functionsExtensionVersion(@Nullable Output<String> functionsExtensionVersion) {
            $.functionsExtensionVersion = functionsExtensionVersion;
            return this;
        }

        /**
         * @param functionsExtensionVersion The runtime version associated with the Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder functionsExtensionVersion(String functionsExtensionVersion) {
            return functionsExtensionVersion(Output.of(functionsExtensionVersion));
        }

        /**
         * @param httpsOnly Can the Function App Slot only be accessed via HTTPS?
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        /**
         * @param httpsOnly Can the Function App Slot only be accessed via HTTPS?
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(Boolean httpsOnly) {
            return httpsOnly(Output.of(httpsOnly));
        }

        /**
         * @param identity an `identity` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<WindowsFunctionAppSlotIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity an `identity` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder identity(WindowsFunctionAppSlotIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param keyVaultReferenceIdentityId The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
         * 
         * @return builder
         * 
         */
        public Builder keyVaultReferenceIdentityId(@Nullable Output<String> keyVaultReferenceIdentityId) {
            $.keyVaultReferenceIdentityId = keyVaultReferenceIdentityId;
            return this;
        }

        /**
         * @param keyVaultReferenceIdentityId The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity)
         * 
         * @return builder
         * 
         */
        public Builder keyVaultReferenceIdentityId(String keyVaultReferenceIdentityId) {
            return keyVaultReferenceIdentityId(Output.of(keyVaultReferenceIdentityId));
        }

        /**
         * @param name Specifies the name of the Windows Function App Slot. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Windows Function App Slot. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param siteConfig a `site_config` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder siteConfig(Output<WindowsFunctionAppSlotSiteConfigArgs> siteConfig) {
            $.siteConfig = siteConfig;
            return this;
        }

        /**
         * @param siteConfig a `site_config` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder siteConfig(WindowsFunctionAppSlotSiteConfigArgs siteConfig) {
            return siteConfig(Output.of(siteConfig));
        }

        /**
         * @param storageAccountAccessKey The access key which will be used to access the storage account for the Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountAccessKey(@Nullable Output<String> storageAccountAccessKey) {
            $.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }

        /**
         * @param storageAccountAccessKey The access key which will be used to access the storage account for the Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountAccessKey(String storageAccountAccessKey) {
            return storageAccountAccessKey(Output.of(storageAccountAccessKey));
        }

        /**
         * @param storageAccountName The backend storage account name which will be used by this Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The backend storage account name which will be used by this Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        /**
         * @param storageKeyVaultSecretId The Key Vault Secret ID, optionally including version, that contains the Connection String to connect to the storage account for this Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder storageKeyVaultSecretId(@Nullable Output<String> storageKeyVaultSecretId) {
            $.storageKeyVaultSecretId = storageKeyVaultSecretId;
            return this;
        }

        /**
         * @param storageKeyVaultSecretId The Key Vault Secret ID, optionally including version, that contains the Connection String to connect to the storage account for this Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder storageKeyVaultSecretId(String storageKeyVaultSecretId) {
            return storageKeyVaultSecretId(Output.of(storageKeyVaultSecretId));
        }

        /**
         * @param storageUsesManagedIdentity Should the Function App Slot use its Managed Identity to access storage.
         * 
         * @return builder
         * 
         */
        public Builder storageUsesManagedIdentity(@Nullable Output<Boolean> storageUsesManagedIdentity) {
            $.storageUsesManagedIdentity = storageUsesManagedIdentity;
            return this;
        }

        /**
         * @param storageUsesManagedIdentity Should the Function App Slot use its Managed Identity to access storage.
         * 
         * @return builder
         * 
         */
        public Builder storageUsesManagedIdentity(Boolean storageUsesManagedIdentity) {
            return storageUsesManagedIdentity(Output.of(storageUsesManagedIdentity));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Windows Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Windows Function App Slot.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualNetworkSubnetId The subnet id which will be used by this Function App Slot for [regional virtual network integration](https://docs.microsoft.com/en-us/azure/app-service/overview-vnet-integration#regional-virtual-network-integration).
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetId(@Nullable Output<String> virtualNetworkSubnetId) {
            $.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }

        /**
         * @param virtualNetworkSubnetId The subnet id which will be used by this Function App Slot for [regional virtual network integration](https://docs.microsoft.com/en-us/azure/app-service/overview-vnet-integration#regional-virtual-network-integration).
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            return virtualNetworkSubnetId(Output.of(virtualNetworkSubnetId));
        }

        public WindowsFunctionAppSlotArgs build() {
            $.functionAppId = Objects.requireNonNull($.functionAppId, "expected parameter 'functionAppId' to be non-null");
            $.siteConfig = Objects.requireNonNull($.siteConfig, "expected parameter 'siteConfig' to be non-null");
            return $;
        }
    }

}
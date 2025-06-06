// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.azure.mssql.inputs.ManagedInstanceAzureActiveDirectoryAdministratorArgs;
import com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceState Empty = new ManagedInstanceState();

    /**
     * The administrator login name for the new SQL Managed Instance. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="administratorLogin")
    private @Nullable Output<String> administratorLogin;

    /**
     * @return The administrator login name for the new SQL Managed Instance. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> administratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }

    /**
     * The password associated with the `administrator_login` user. Needs to comply with Azure&#39;s [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx)
     * 
     */
    @Import(name="administratorLoginPassword")
    private @Nullable Output<String> administratorLoginPassword;

    /**
     * @return The password associated with the `administrator_login` user. Needs to comply with Azure&#39;s [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx)
     * 
     */
    public Optional<Output<String>> administratorLoginPassword() {
        return Optional.ofNullable(this.administratorLoginPassword);
    }

    /**
     * An `azure_active_directory_administrator` block as defined below.
     * 
     */
    @Import(name="azureActiveDirectoryAdministrator")
    private @Nullable Output<ManagedInstanceAzureActiveDirectoryAdministratorArgs> azureActiveDirectoryAdministrator;

    /**
     * @return An `azure_active_directory_administrator` block as defined below.
     * 
     */
    public Optional<Output<ManagedInstanceAzureActiveDirectoryAdministratorArgs>> azureActiveDirectoryAdministrator() {
        return Optional.ofNullable(this.azureActiveDirectoryAdministrator);
    }

    /**
     * Specifies how the SQL Managed Instance will be collated. Default value is `SQL_Latin1_General_CP1_CI_AS`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="collation")
    private @Nullable Output<String> collation;

    /**
     * @return Specifies how the SQL Managed Instance will be collated. Default value is `SQL_Latin1_General_CP1_CI_AS`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> collation() {
        return Optional.ofNullable(this.collation);
    }

    /**
     * Specifies the internal format of the SQL Managed Instance databases specific to the SQL engine version. Possible values are `AlwaysUpToDate` and `SQLServer2022`. Defaults to `SQLServer2022`.
     * 
     * &gt; **Note:** Changing `database_format` from `AlwaysUpToDate` to `SQLServer2022` forces a new SQL Managed Instance to be created.
     * 
     */
    @Import(name="databaseFormat")
    private @Nullable Output<String> databaseFormat;

    /**
     * @return Specifies the internal format of the SQL Managed Instance databases specific to the SQL engine version. Possible values are `AlwaysUpToDate` and `SQLServer2022`. Defaults to `SQLServer2022`.
     * 
     * &gt; **Note:** Changing `database_format` from `AlwaysUpToDate` to `SQLServer2022` forces a new SQL Managed Instance to be created.
     * 
     */
    public Optional<Output<String>> databaseFormat() {
        return Optional.ofNullable(this.databaseFormat);
    }

    /**
     * The Dns Zone where the SQL Managed Instance is located.
     * 
     */
    @Import(name="dnsZone")
    private @Nullable Output<String> dnsZone;

    /**
     * @return The Dns Zone where the SQL Managed Instance is located.
     * 
     */
    public Optional<Output<String>> dnsZone() {
        return Optional.ofNullable(this.dnsZone);
    }

    /**
     * The ID of the SQL Managed Instance which will share the DNS zone. This is a prerequisite for creating an `azurerm_sql_managed_instance_failover_group`. Setting this after creation forces a new resource to be created.
     * 
     */
    @Import(name="dnsZonePartnerId")
    private @Nullable Output<String> dnsZonePartnerId;

    /**
     * @return The ID of the SQL Managed Instance which will share the DNS zone. This is a prerequisite for creating an `azurerm_sql_managed_instance_failover_group`. Setting this after creation forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> dnsZonePartnerId() {
        return Optional.ofNullable(this.dnsZonePartnerId);
    }

    /**
     * The fully qualified domain name of the Azure Managed SQL Instance
     * 
     */
    @Import(name="fqdn")
    private @Nullable Output<String> fqdn;

    /**
     * @return The fully qualified domain name of the Azure Managed SQL Instance
     * 
     */
    public Optional<Output<String>> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }

    /**
     * Specifies the hybrid secondary usage for disaster recovery of the SQL Managed Instance. Possible values are `Active` and `Passive`. Defaults to `Active`.
     * 
     */
    @Import(name="hybridSecondaryUsage")
    private @Nullable Output<String> hybridSecondaryUsage;

    /**
     * @return Specifies the hybrid secondary usage for disaster recovery of the SQL Managed Instance. Possible values are `Active` and `Passive`. Defaults to `Active`.
     * 
     */
    public Optional<Output<String>> hybridSecondaryUsage() {
        return Optional.ofNullable(this.hybridSecondaryUsage);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ManagedInstanceIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<ManagedInstanceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * What type of license the Managed Instance will use. Possible values are `LicenseIncluded` and `BasePrice`.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return What type of license the Managed Instance will use. Possible values are `LicenseIncluded` and `BasePrice`.
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Public Maintenance Configuration window to apply to the SQL Managed Instance. Valid values include `SQL_Default` or an Azure Location in the format `SQL_{Location}_MI_{Size}`(for example `SQL_EastUS_MI_1`). Defaults to `SQL_Default`.
     * 
     */
    @Import(name="maintenanceConfigurationName")
    private @Nullable Output<String> maintenanceConfigurationName;

    /**
     * @return The name of the Public Maintenance Configuration window to apply to the SQL Managed Instance. Valid values include `SQL_Default` or an Azure Location in the format `SQL_{Location}_MI_{Size}`(for example `SQL_EastUS_MI_1`). Defaults to `SQL_Default`.
     * 
     */
    public Optional<Output<String>> maintenanceConfigurationName() {
        return Optional.ofNullable(this.maintenanceConfigurationName);
    }

    /**
     * The Minimum TLS Version. Default value is `1.2` Valid values include `1.0`, `1.1`, `1.2`.
     * 
     * &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
     * 
     */
    @Import(name="minimumTlsVersion")
    private @Nullable Output<String> minimumTlsVersion;

    /**
     * @return The Minimum TLS Version. Default value is `1.2` Valid values include `1.0`, `1.1`, `1.2`.
     * 
     * &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
     * 
     */
    public Optional<Output<String>> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }

    /**
     * The name of the SQL Managed Instance. This needs to be globally unique within Azure. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the SQL Managed Instance. This needs to be globally unique within Azure. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies how the SQL Managed Instance will be accessed. Default value is `Default`. Valid values include `Default`, `Proxy`, and `Redirect`.
     * 
     */
    @Import(name="proxyOverride")
    private @Nullable Output<String> proxyOverride;

    /**
     * @return Specifies how the SQL Managed Instance will be accessed. Default value is `Default`. Valid values include `Default`, `Proxy`, and `Redirect`.
     * 
     */
    public Optional<Output<String>> proxyOverride() {
        return Optional.ofNullable(this.proxyOverride);
    }

    /**
     * Is the public data endpoint enabled? Default value is `false`.
     * 
     */
    @Import(name="publicDataEndpointEnabled")
    private @Nullable Output<Boolean> publicDataEndpointEnabled;

    /**
     * @return Is the public data endpoint enabled? Default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> publicDataEndpointEnabled() {
        return Optional.ofNullable(this.publicDataEndpointEnabled);
    }

    /**
     * The name of the resource group in which to create the SQL Managed Instance. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the SQL Managed Instance. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The service principal type. The only possible value is `SystemAssigned`.
     * 
     */
    @Import(name="servicePrincipalType")
    private @Nullable Output<String> servicePrincipalType;

    /**
     * @return The service principal type. The only possible value is `SystemAssigned`.
     * 
     */
    public Optional<Output<String>> servicePrincipalType() {
        return Optional.ofNullable(this.servicePrincipalType);
    }

    /**
     * Specifies the SKU Name for the SQL Managed Instance. Valid values include `GP_Gen4`, `GP_Gen5`, `GP_Gen8IM`, `GP_Gen8IH`, `BC_Gen4`, `BC_Gen5`, `BC_Gen8IM` or `BC_Gen8IH`.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return Specifies the SKU Name for the SQL Managed Instance. Valid values include `GP_Gen4`, `GP_Gen5`, `GP_Gen8IM`, `GP_Gen8IH`, `BC_Gen4`, `BC_Gen5`, `BC_Gen8IM` or `BC_Gen8IH`.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * Specifies the storage account type used to store backups for this database. Possible values are `GRS`, `GZRS`, `LRS`, and `ZRS`. Defaults to `GRS`.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable Output<String> storageAccountType;

    /**
     * @return Specifies the storage account type used to store backups for this database. Possible values are `GRS`, `GZRS`, `LRS`, and `ZRS`. Defaults to `GRS`.
     * 
     */
    public Optional<Output<String>> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    /**
     * Maximum storage space for the SQL Managed instance. This should be a multiple of 32 (GB).
     * 
     */
    @Import(name="storageSizeInGb")
    private @Nullable Output<Integer> storageSizeInGb;

    /**
     * @return Maximum storage space for the SQL Managed instance. This should be a multiple of 32 (GB).
     * 
     */
    public Optional<Output<Integer>> storageSizeInGb() {
        return Optional.ofNullable(this.storageSizeInGb);
    }

    /**
     * The subnet resource id that the SQL Managed Instance will be associated with.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The subnet resource id that the SQL Managed Instance will be associated with.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The TimeZone ID that the SQL Managed Instance will be operating in. Default value is `UTC`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="timezoneId")
    private @Nullable Output<String> timezoneId;

    /**
     * @return The TimeZone ID that the SQL Managed Instance will be operating in. Default value is `UTC`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> timezoneId() {
        return Optional.ofNullable(this.timezoneId);
    }

    /**
     * Number of cores that should be assigned to the SQL Managed Instance. Values can be `8`, `16`, or `24` for Gen4 SKUs, or `4`, `6`, `8`, `10`, `12`, `16`, `20`, `24`, `32`, `40`, `48`, `56`, `64`, `80`, `96` or `128` for Gen5 SKUs.
     * 
     */
    @Import(name="vcores")
    private @Nullable Output<Integer> vcores;

    /**
     * @return Number of cores that should be assigned to the SQL Managed Instance. Values can be `8`, `16`, or `24` for Gen4 SKUs, or `4`, `6`, `8`, `10`, `12`, `16`, `20`, `24`, `32`, `40`, `48`, `56`, `64`, `80`, `96` or `128` for Gen5 SKUs.
     * 
     */
    public Optional<Output<Integer>> vcores() {
        return Optional.ofNullable(this.vcores);
    }

    /**
     * Specifies whether or not the SQL Managed Instance is zone redundant. Defaults to `false`.
     * 
     */
    @Import(name="zoneRedundantEnabled")
    private @Nullable Output<Boolean> zoneRedundantEnabled;

    /**
     * @return Specifies whether or not the SQL Managed Instance is zone redundant. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> zoneRedundantEnabled() {
        return Optional.ofNullable(this.zoneRedundantEnabled);
    }

    private ManagedInstanceState() {}

    private ManagedInstanceState(ManagedInstanceState $) {
        this.administratorLogin = $.administratorLogin;
        this.administratorLoginPassword = $.administratorLoginPassword;
        this.azureActiveDirectoryAdministrator = $.azureActiveDirectoryAdministrator;
        this.collation = $.collation;
        this.databaseFormat = $.databaseFormat;
        this.dnsZone = $.dnsZone;
        this.dnsZonePartnerId = $.dnsZonePartnerId;
        this.fqdn = $.fqdn;
        this.hybridSecondaryUsage = $.hybridSecondaryUsage;
        this.identity = $.identity;
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.maintenanceConfigurationName = $.maintenanceConfigurationName;
        this.minimumTlsVersion = $.minimumTlsVersion;
        this.name = $.name;
        this.proxyOverride = $.proxyOverride;
        this.publicDataEndpointEnabled = $.publicDataEndpointEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.servicePrincipalType = $.servicePrincipalType;
        this.skuName = $.skuName;
        this.storageAccountType = $.storageAccountType;
        this.storageSizeInGb = $.storageSizeInGb;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.timezoneId = $.timezoneId;
        this.vcores = $.vcores;
        this.zoneRedundantEnabled = $.zoneRedundantEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceState $;

        public Builder() {
            $ = new ManagedInstanceState();
        }

        public Builder(ManagedInstanceState defaults) {
            $ = new ManagedInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorLogin The administrator login name for the new SQL Managed Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(@Nullable Output<String> administratorLogin) {
            $.administratorLogin = administratorLogin;
            return this;
        }

        /**
         * @param administratorLogin The administrator login name for the new SQL Managed Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(String administratorLogin) {
            return administratorLogin(Output.of(administratorLogin));
        }

        /**
         * @param administratorLoginPassword The password associated with the `administrator_login` user. Needs to comply with Azure&#39;s [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx)
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(@Nullable Output<String> administratorLoginPassword) {
            $.administratorLoginPassword = administratorLoginPassword;
            return this;
        }

        /**
         * @param administratorLoginPassword The password associated with the `administrator_login` user. Needs to comply with Azure&#39;s [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx)
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(String administratorLoginPassword) {
            return administratorLoginPassword(Output.of(administratorLoginPassword));
        }

        /**
         * @param azureActiveDirectoryAdministrator An `azure_active_directory_administrator` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectoryAdministrator(@Nullable Output<ManagedInstanceAzureActiveDirectoryAdministratorArgs> azureActiveDirectoryAdministrator) {
            $.azureActiveDirectoryAdministrator = azureActiveDirectoryAdministrator;
            return this;
        }

        /**
         * @param azureActiveDirectoryAdministrator An `azure_active_directory_administrator` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectoryAdministrator(ManagedInstanceAzureActiveDirectoryAdministratorArgs azureActiveDirectoryAdministrator) {
            return azureActiveDirectoryAdministrator(Output.of(azureActiveDirectoryAdministrator));
        }

        /**
         * @param collation Specifies how the SQL Managed Instance will be collated. Default value is `SQL_Latin1_General_CP1_CI_AS`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder collation(@Nullable Output<String> collation) {
            $.collation = collation;
            return this;
        }

        /**
         * @param collation Specifies how the SQL Managed Instance will be collated. Default value is `SQL_Latin1_General_CP1_CI_AS`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder collation(String collation) {
            return collation(Output.of(collation));
        }

        /**
         * @param databaseFormat Specifies the internal format of the SQL Managed Instance databases specific to the SQL engine version. Possible values are `AlwaysUpToDate` and `SQLServer2022`. Defaults to `SQLServer2022`.
         * 
         * &gt; **Note:** Changing `database_format` from `AlwaysUpToDate` to `SQLServer2022` forces a new SQL Managed Instance to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseFormat(@Nullable Output<String> databaseFormat) {
            $.databaseFormat = databaseFormat;
            return this;
        }

        /**
         * @param databaseFormat Specifies the internal format of the SQL Managed Instance databases specific to the SQL engine version. Possible values are `AlwaysUpToDate` and `SQLServer2022`. Defaults to `SQLServer2022`.
         * 
         * &gt; **Note:** Changing `database_format` from `AlwaysUpToDate` to `SQLServer2022` forces a new SQL Managed Instance to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseFormat(String databaseFormat) {
            return databaseFormat(Output.of(databaseFormat));
        }

        /**
         * @param dnsZone The Dns Zone where the SQL Managed Instance is located.
         * 
         * @return builder
         * 
         */
        public Builder dnsZone(@Nullable Output<String> dnsZone) {
            $.dnsZone = dnsZone;
            return this;
        }

        /**
         * @param dnsZone The Dns Zone where the SQL Managed Instance is located.
         * 
         * @return builder
         * 
         */
        public Builder dnsZone(String dnsZone) {
            return dnsZone(Output.of(dnsZone));
        }

        /**
         * @param dnsZonePartnerId The ID of the SQL Managed Instance which will share the DNS zone. This is a prerequisite for creating an `azurerm_sql_managed_instance_failover_group`. Setting this after creation forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dnsZonePartnerId(@Nullable Output<String> dnsZonePartnerId) {
            $.dnsZonePartnerId = dnsZonePartnerId;
            return this;
        }

        /**
         * @param dnsZonePartnerId The ID of the SQL Managed Instance which will share the DNS zone. This is a prerequisite for creating an `azurerm_sql_managed_instance_failover_group`. Setting this after creation forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dnsZonePartnerId(String dnsZonePartnerId) {
            return dnsZonePartnerId(Output.of(dnsZonePartnerId));
        }

        /**
         * @param fqdn The fully qualified domain name of the Azure Managed SQL Instance
         * 
         * @return builder
         * 
         */
        public Builder fqdn(@Nullable Output<String> fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        /**
         * @param fqdn The fully qualified domain name of the Azure Managed SQL Instance
         * 
         * @return builder
         * 
         */
        public Builder fqdn(String fqdn) {
            return fqdn(Output.of(fqdn));
        }

        /**
         * @param hybridSecondaryUsage Specifies the hybrid secondary usage for disaster recovery of the SQL Managed Instance. Possible values are `Active` and `Passive`. Defaults to `Active`.
         * 
         * @return builder
         * 
         */
        public Builder hybridSecondaryUsage(@Nullable Output<String> hybridSecondaryUsage) {
            $.hybridSecondaryUsage = hybridSecondaryUsage;
            return this;
        }

        /**
         * @param hybridSecondaryUsage Specifies the hybrid secondary usage for disaster recovery of the SQL Managed Instance. Possible values are `Active` and `Passive`. Defaults to `Active`.
         * 
         * @return builder
         * 
         */
        public Builder hybridSecondaryUsage(String hybridSecondaryUsage) {
            return hybridSecondaryUsage(Output.of(hybridSecondaryUsage));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ManagedInstanceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(ManagedInstanceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param licenseType What type of license the Managed Instance will use. Possible values are `LicenseIncluded` and `BasePrice`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType What type of license the Managed Instance will use. Possible values are `LicenseIncluded` and `BasePrice`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maintenanceConfigurationName The name of the Public Maintenance Configuration window to apply to the SQL Managed Instance. Valid values include `SQL_Default` or an Azure Location in the format `SQL_{Location}_MI_{Size}`(for example `SQL_EastUS_MI_1`). Defaults to `SQL_Default`.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceConfigurationName(@Nullable Output<String> maintenanceConfigurationName) {
            $.maintenanceConfigurationName = maintenanceConfigurationName;
            return this;
        }

        /**
         * @param maintenanceConfigurationName The name of the Public Maintenance Configuration window to apply to the SQL Managed Instance. Valid values include `SQL_Default` or an Azure Location in the format `SQL_{Location}_MI_{Size}`(for example `SQL_EastUS_MI_1`). Defaults to `SQL_Default`.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceConfigurationName(String maintenanceConfigurationName) {
            return maintenanceConfigurationName(Output.of(maintenanceConfigurationName));
        }

        /**
         * @param minimumTlsVersion The Minimum TLS Version. Default value is `1.2` Valid values include `1.0`, `1.1`, `1.2`.
         * 
         * &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(@Nullable Output<String> minimumTlsVersion) {
            $.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        /**
         * @param minimumTlsVersion The Minimum TLS Version. Default value is `1.2` Valid values include `1.0`, `1.1`, `1.2`.
         * 
         * &gt; **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(String minimumTlsVersion) {
            return minimumTlsVersion(Output.of(minimumTlsVersion));
        }

        /**
         * @param name The name of the SQL Managed Instance. This needs to be globally unique within Azure. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SQL Managed Instance. This needs to be globally unique within Azure. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param proxyOverride Specifies how the SQL Managed Instance will be accessed. Default value is `Default`. Valid values include `Default`, `Proxy`, and `Redirect`.
         * 
         * @return builder
         * 
         */
        public Builder proxyOverride(@Nullable Output<String> proxyOverride) {
            $.proxyOverride = proxyOverride;
            return this;
        }

        /**
         * @param proxyOverride Specifies how the SQL Managed Instance will be accessed. Default value is `Default`. Valid values include `Default`, `Proxy`, and `Redirect`.
         * 
         * @return builder
         * 
         */
        public Builder proxyOverride(String proxyOverride) {
            return proxyOverride(Output.of(proxyOverride));
        }

        /**
         * @param publicDataEndpointEnabled Is the public data endpoint enabled? Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder publicDataEndpointEnabled(@Nullable Output<Boolean> publicDataEndpointEnabled) {
            $.publicDataEndpointEnabled = publicDataEndpointEnabled;
            return this;
        }

        /**
         * @param publicDataEndpointEnabled Is the public data endpoint enabled? Default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder publicDataEndpointEnabled(Boolean publicDataEndpointEnabled) {
            return publicDataEndpointEnabled(Output.of(publicDataEndpointEnabled));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the SQL Managed Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the SQL Managed Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param servicePrincipalType The service principal type. The only possible value is `SystemAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalType(@Nullable Output<String> servicePrincipalType) {
            $.servicePrincipalType = servicePrincipalType;
            return this;
        }

        /**
         * @param servicePrincipalType The service principal type. The only possible value is `SystemAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalType(String servicePrincipalType) {
            return servicePrincipalType(Output.of(servicePrincipalType));
        }

        /**
         * @param skuName Specifies the SKU Name for the SQL Managed Instance. Valid values include `GP_Gen4`, `GP_Gen5`, `GP_Gen8IM`, `GP_Gen8IH`, `BC_Gen4`, `BC_Gen5`, `BC_Gen8IM` or `BC_Gen8IH`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName Specifies the SKU Name for the SQL Managed Instance. Valid values include `GP_Gen4`, `GP_Gen5`, `GP_Gen8IM`, `GP_Gen8IH`, `BC_Gen4`, `BC_Gen5`, `BC_Gen8IM` or `BC_Gen8IH`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param storageAccountType Specifies the storage account type used to store backups for this database. Possible values are `GRS`, `GZRS`, `LRS`, and `ZRS`. Defaults to `GRS`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(@Nullable Output<String> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        /**
         * @param storageAccountType Specifies the storage account type used to store backups for this database. Possible values are `GRS`, `GZRS`, `LRS`, and `ZRS`. Defaults to `GRS`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(String storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
        }

        /**
         * @param storageSizeInGb Maximum storage space for the SQL Managed instance. This should be a multiple of 32 (GB).
         * 
         * @return builder
         * 
         */
        public Builder storageSizeInGb(@Nullable Output<Integer> storageSizeInGb) {
            $.storageSizeInGb = storageSizeInGb;
            return this;
        }

        /**
         * @param storageSizeInGb Maximum storage space for the SQL Managed instance. This should be a multiple of 32 (GB).
         * 
         * @return builder
         * 
         */
        public Builder storageSizeInGb(Integer storageSizeInGb) {
            return storageSizeInGb(Output.of(storageSizeInGb));
        }

        /**
         * @param subnetId The subnet resource id that the SQL Managed Instance will be associated with.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The subnet resource id that the SQL Managed Instance will be associated with.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param timezoneId The TimeZone ID that the SQL Managed Instance will be operating in. Default value is `UTC`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder timezoneId(@Nullable Output<String> timezoneId) {
            $.timezoneId = timezoneId;
            return this;
        }

        /**
         * @param timezoneId The TimeZone ID that the SQL Managed Instance will be operating in. Default value is `UTC`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder timezoneId(String timezoneId) {
            return timezoneId(Output.of(timezoneId));
        }

        /**
         * @param vcores Number of cores that should be assigned to the SQL Managed Instance. Values can be `8`, `16`, or `24` for Gen4 SKUs, or `4`, `6`, `8`, `10`, `12`, `16`, `20`, `24`, `32`, `40`, `48`, `56`, `64`, `80`, `96` or `128` for Gen5 SKUs.
         * 
         * @return builder
         * 
         */
        public Builder vcores(@Nullable Output<Integer> vcores) {
            $.vcores = vcores;
            return this;
        }

        /**
         * @param vcores Number of cores that should be assigned to the SQL Managed Instance. Values can be `8`, `16`, or `24` for Gen4 SKUs, or `4`, `6`, `8`, `10`, `12`, `16`, `20`, `24`, `32`, `40`, `48`, `56`, `64`, `80`, `96` or `128` for Gen5 SKUs.
         * 
         * @return builder
         * 
         */
        public Builder vcores(Integer vcores) {
            return vcores(Output.of(vcores));
        }

        /**
         * @param zoneRedundantEnabled Specifies whether or not the SQL Managed Instance is zone redundant. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundantEnabled(@Nullable Output<Boolean> zoneRedundantEnabled) {
            $.zoneRedundantEnabled = zoneRedundantEnabled;
            return this;
        }

        /**
         * @param zoneRedundantEnabled Specifies whether or not the SQL Managed Instance is zone redundant. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundantEnabled(Boolean zoneRedundantEnabled) {
            return zoneRedundantEnabled(Output.of(zoneRedundantEnabled));
        }

        public ManagedInstanceState build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql;

import com.pulumi.azure.postgresql.inputs.FlexibleServerHighAvailabilityArgs;
import com.pulumi.azure.postgresql.inputs.FlexibleServerMaintenanceWindowArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleServerArgs Empty = new FlexibleServerArgs();

    /**
     * The Administrator login for the PostgreSQL Flexible Server. Required when `create_mode` is `Default`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="administratorLogin")
    private @Nullable Output<String> administratorLogin;

    /**
     * @return The Administrator login for the PostgreSQL Flexible Server. Required when `create_mode` is `Default`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<String>> administratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }

    /**
     * The Password associated with the `administrator_login` for the PostgreSQL Flexible Server. Required when `create_mode` is `Default`.
     * 
     */
    @Import(name="administratorPassword")
    private @Nullable Output<String> administratorPassword;

    /**
     * @return The Password associated with the `administrator_login` for the PostgreSQL Flexible Server. Required when `create_mode` is `Default`.
     * 
     */
    public Optional<Output<String>> administratorPassword() {
        return Optional.ofNullable(this.administratorPassword);
    }

    /**
     * The backup retention days for the PostgreSQL Flexible Server. Possible values are between `7` and `35` days.
     * 
     */
    @Import(name="backupRetentionDays")
    private @Nullable Output<Integer> backupRetentionDays;

    /**
     * @return The backup retention days for the PostgreSQL Flexible Server. Possible values are between `7` and `35` days.
     * 
     */
    public Optional<Output<Integer>> backupRetentionDays() {
        return Optional.ofNullable(this.backupRetentionDays);
    }

    /**
     * The creation mode which can be used to restore or replicate existing servers. Possible values are `Default` and `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="createMode")
    private @Nullable Output<String> createMode;

    /**
     * @return The creation mode which can be used to restore or replicate existing servers. Possible values are `Default` and `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<String>> createMode() {
        return Optional.ofNullable(this.createMode);
    }

    /**
     * The ID of the virtual network subnet to create the PostgreSQL Flexible Server. The provided subnet should not have any other resource deployed in it and this subnet will be delegated to the PostgreSQL Flexible Server, if not already delegated. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="delegatedSubnetId")
    private @Nullable Output<String> delegatedSubnetId;

    /**
     * @return The ID of the virtual network subnet to create the PostgreSQL Flexible Server. The provided subnet should not have any other resource deployed in it and this subnet will be delegated to the PostgreSQL Flexible Server, if not already delegated. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<String>> delegatedSubnetId() {
        return Optional.ofNullable(this.delegatedSubnetId);
    }

    /**
     * Is Geo-Redundant backup enabled on the PostgreSQL Flexible Server. Defaults to `false`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="geoRedundantBackupEnabled")
    private @Nullable Output<Boolean> geoRedundantBackupEnabled;

    /**
     * @return Is Geo-Redundant backup enabled on the PostgreSQL Flexible Server. Defaults to `false`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<Boolean>> geoRedundantBackupEnabled() {
        return Optional.ofNullable(this.geoRedundantBackupEnabled);
    }

    /**
     * A `high_availability` block as defined below.
     * 
     */
    @Import(name="highAvailability")
    private @Nullable Output<FlexibleServerHighAvailabilityArgs> highAvailability;

    /**
     * @return A `high_availability` block as defined below.
     * 
     */
    public Optional<Output<FlexibleServerHighAvailabilityArgs>> highAvailability() {
        return Optional.ofNullable(this.highAvailability);
    }

    /**
     * The Azure Region where the PostgreSQL Flexible Server should exist. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the PostgreSQL Flexible Server should exist. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A `maintenance_window` block as defined below.
     * 
     */
    @Import(name="maintenanceWindow")
    private @Nullable Output<FlexibleServerMaintenanceWindowArgs> maintenanceWindow;

    /**
     * @return A `maintenance_window` block as defined below.
     * 
     */
    public Optional<Output<FlexibleServerMaintenanceWindowArgs>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * The name which should be used for this PostgreSQL Flexible Server. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this PostgreSQL Flexible Server. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The point in time to restore from `creation_source_server_id` when `create_mode` is `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="pointInTimeRestoreTimeInUtc")
    private @Nullable Output<String> pointInTimeRestoreTimeInUtc;

    /**
     * @return The point in time to restore from `creation_source_server_id` when `create_mode` is `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<String>> pointInTimeRestoreTimeInUtc() {
        return Optional.ofNullable(this.pointInTimeRestoreTimeInUtc);
    }

    /**
     * The ID of the private DNS zone to create the PostgreSQL Flexible Server. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="privateDnsZoneId")
    private @Nullable Output<String> privateDnsZoneId;

    /**
     * @return The ID of the private DNS zone to create the PostgreSQL Flexible Server. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<String>> privateDnsZoneId() {
        return Optional.ofNullable(this.privateDnsZoneId);
    }

    /**
     * The name of the Resource Group where the PostgreSQL Flexible Server should exist. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the PostgreSQL Flexible Server should exist. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU Name for the PostgreSQL Flexible Server. The name of the SKU, follows the `tier` + `name` pattern (e.g. `B_Standard_B1ms`, `GP_Standard_D2s_v3`, `MO_Standard_E4s_v3`).
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return The SKU Name for the PostgreSQL Flexible Server. The name of the SKU, follows the `tier` + `name` pattern (e.g. `B_Standard_B1ms`, `GP_Standard_D2s_v3`, `MO_Standard_E4s_v3`).
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * The resource ID of the source PostgreSQL Flexible Server to be restored. Required when `create_mode` is `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="sourceServerId")
    private @Nullable Output<String> sourceServerId;

    /**
     * @return The resource ID of the source PostgreSQL Flexible Server to be restored. Required when `create_mode` is `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<String>> sourceServerId() {
        return Optional.ofNullable(this.sourceServerId);
    }

    /**
     * The max storage allowed for the PostgreSQL Flexible Server. Possible values are `32768`, `65536`, `131072`, `262144`, `524288`, `1048576`, `2097152`, `4194304`, `8388608`, `16777216`, and `33554432`.
     * 
     */
    @Import(name="storageMb")
    private @Nullable Output<Integer> storageMb;

    /**
     * @return The max storage allowed for the PostgreSQL Flexible Server. Possible values are `32768`, `65536`, `131072`, `262144`, `524288`, `1048576`, `2097152`, `4194304`, `8388608`, `16777216`, and `33554432`.
     * 
     */
    public Optional<Output<Integer>> storageMb() {
        return Optional.ofNullable(this.storageMb);
    }

    /**
     * A mapping of tags which should be assigned to the PostgreSQL Flexible Server.
     * *
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the PostgreSQL Flexible Server.
     * *
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The version of PostgreSQL Flexible Server to use. Possible values are `11`,`12`, `13` and `14`. Required when `create_mode` is `Default`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of PostgreSQL Flexible Server to use. Possible values are `11`,`12`, `13` and `14`. Required when `create_mode` is `Default`. Changing this forces a new PostgreSQL Flexible Server to be created.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * Specifies the Availability Zone in which the PostgreSQL Flexible Server should be located.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return Specifies the Availability Zone in which the PostgreSQL Flexible Server should be located.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private FlexibleServerArgs() {}

    private FlexibleServerArgs(FlexibleServerArgs $) {
        this.administratorLogin = $.administratorLogin;
        this.administratorPassword = $.administratorPassword;
        this.backupRetentionDays = $.backupRetentionDays;
        this.createMode = $.createMode;
        this.delegatedSubnetId = $.delegatedSubnetId;
        this.geoRedundantBackupEnabled = $.geoRedundantBackupEnabled;
        this.highAvailability = $.highAvailability;
        this.location = $.location;
        this.maintenanceWindow = $.maintenanceWindow;
        this.name = $.name;
        this.pointInTimeRestoreTimeInUtc = $.pointInTimeRestoreTimeInUtc;
        this.privateDnsZoneId = $.privateDnsZoneId;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.sourceServerId = $.sourceServerId;
        this.storageMb = $.storageMb;
        this.tags = $.tags;
        this.version = $.version;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleServerArgs $;

        public Builder() {
            $ = new FlexibleServerArgs();
        }

        public Builder(FlexibleServerArgs defaults) {
            $ = new FlexibleServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorLogin The Administrator login for the PostgreSQL Flexible Server. Required when `create_mode` is `Default`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(@Nullable Output<String> administratorLogin) {
            $.administratorLogin = administratorLogin;
            return this;
        }

        /**
         * @param administratorLogin The Administrator login for the PostgreSQL Flexible Server. Required when `create_mode` is `Default`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(String administratorLogin) {
            return administratorLogin(Output.of(administratorLogin));
        }

        /**
         * @param administratorPassword The Password associated with the `administrator_login` for the PostgreSQL Flexible Server. Required when `create_mode` is `Default`.
         * 
         * @return builder
         * 
         */
        public Builder administratorPassword(@Nullable Output<String> administratorPassword) {
            $.administratorPassword = administratorPassword;
            return this;
        }

        /**
         * @param administratorPassword The Password associated with the `administrator_login` for the PostgreSQL Flexible Server. Required when `create_mode` is `Default`.
         * 
         * @return builder
         * 
         */
        public Builder administratorPassword(String administratorPassword) {
            return administratorPassword(Output.of(administratorPassword));
        }

        /**
         * @param backupRetentionDays The backup retention days for the PostgreSQL Flexible Server. Possible values are between `7` and `35` days.
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionDays(@Nullable Output<Integer> backupRetentionDays) {
            $.backupRetentionDays = backupRetentionDays;
            return this;
        }

        /**
         * @param backupRetentionDays The backup retention days for the PostgreSQL Flexible Server. Possible values are between `7` and `35` days.
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionDays(Integer backupRetentionDays) {
            return backupRetentionDays(Output.of(backupRetentionDays));
        }

        /**
         * @param createMode The creation mode which can be used to restore or replicate existing servers. Possible values are `Default` and `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder createMode(@Nullable Output<String> createMode) {
            $.createMode = createMode;
            return this;
        }

        /**
         * @param createMode The creation mode which can be used to restore or replicate existing servers. Possible values are `Default` and `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder createMode(String createMode) {
            return createMode(Output.of(createMode));
        }

        /**
         * @param delegatedSubnetId The ID of the virtual network subnet to create the PostgreSQL Flexible Server. The provided subnet should not have any other resource deployed in it and this subnet will be delegated to the PostgreSQL Flexible Server, if not already delegated. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder delegatedSubnetId(@Nullable Output<String> delegatedSubnetId) {
            $.delegatedSubnetId = delegatedSubnetId;
            return this;
        }

        /**
         * @param delegatedSubnetId The ID of the virtual network subnet to create the PostgreSQL Flexible Server. The provided subnet should not have any other resource deployed in it and this subnet will be delegated to the PostgreSQL Flexible Server, if not already delegated. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder delegatedSubnetId(String delegatedSubnetId) {
            return delegatedSubnetId(Output.of(delegatedSubnetId));
        }

        /**
         * @param geoRedundantBackupEnabled Is Geo-Redundant backup enabled on the PostgreSQL Flexible Server. Defaults to `false`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder geoRedundantBackupEnabled(@Nullable Output<Boolean> geoRedundantBackupEnabled) {
            $.geoRedundantBackupEnabled = geoRedundantBackupEnabled;
            return this;
        }

        /**
         * @param geoRedundantBackupEnabled Is Geo-Redundant backup enabled on the PostgreSQL Flexible Server. Defaults to `false`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder geoRedundantBackupEnabled(Boolean geoRedundantBackupEnabled) {
            return geoRedundantBackupEnabled(Output.of(geoRedundantBackupEnabled));
        }

        /**
         * @param highAvailability A `high_availability` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder highAvailability(@Nullable Output<FlexibleServerHighAvailabilityArgs> highAvailability) {
            $.highAvailability = highAvailability;
            return this;
        }

        /**
         * @param highAvailability A `high_availability` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder highAvailability(FlexibleServerHighAvailabilityArgs highAvailability) {
            return highAvailability(Output.of(highAvailability));
        }

        /**
         * @param location The Azure Region where the PostgreSQL Flexible Server should exist. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the PostgreSQL Flexible Server should exist. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maintenanceWindow A `maintenance_window` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(@Nullable Output<FlexibleServerMaintenanceWindowArgs> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * @param maintenanceWindow A `maintenance_window` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(FlexibleServerMaintenanceWindowArgs maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        /**
         * @param name The name which should be used for this PostgreSQL Flexible Server. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this PostgreSQL Flexible Server. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pointInTimeRestoreTimeInUtc The point in time to restore from `creation_source_server_id` when `create_mode` is `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder pointInTimeRestoreTimeInUtc(@Nullable Output<String> pointInTimeRestoreTimeInUtc) {
            $.pointInTimeRestoreTimeInUtc = pointInTimeRestoreTimeInUtc;
            return this;
        }

        /**
         * @param pointInTimeRestoreTimeInUtc The point in time to restore from `creation_source_server_id` when `create_mode` is `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder pointInTimeRestoreTimeInUtc(String pointInTimeRestoreTimeInUtc) {
            return pointInTimeRestoreTimeInUtc(Output.of(pointInTimeRestoreTimeInUtc));
        }

        /**
         * @param privateDnsZoneId The ID of the private DNS zone to create the PostgreSQL Flexible Server. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsZoneId(@Nullable Output<String> privateDnsZoneId) {
            $.privateDnsZoneId = privateDnsZoneId;
            return this;
        }

        /**
         * @param privateDnsZoneId The ID of the private DNS zone to create the PostgreSQL Flexible Server. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsZoneId(String privateDnsZoneId) {
            return privateDnsZoneId(Output.of(privateDnsZoneId));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the PostgreSQL Flexible Server should exist. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the PostgreSQL Flexible Server should exist. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The SKU Name for the PostgreSQL Flexible Server. The name of the SKU, follows the `tier` + `name` pattern (e.g. `B_Standard_B1ms`, `GP_Standard_D2s_v3`, `MO_Standard_E4s_v3`).
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The SKU Name for the PostgreSQL Flexible Server. The name of the SKU, follows the `tier` + `name` pattern (e.g. `B_Standard_B1ms`, `GP_Standard_D2s_v3`, `MO_Standard_E4s_v3`).
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param sourceServerId The resource ID of the source PostgreSQL Flexible Server to be restored. Required when `create_mode` is `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceServerId(@Nullable Output<String> sourceServerId) {
            $.sourceServerId = sourceServerId;
            return this;
        }

        /**
         * @param sourceServerId The resource ID of the source PostgreSQL Flexible Server to be restored. Required when `create_mode` is `PointInTimeRestore`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceServerId(String sourceServerId) {
            return sourceServerId(Output.of(sourceServerId));
        }

        /**
         * @param storageMb The max storage allowed for the PostgreSQL Flexible Server. Possible values are `32768`, `65536`, `131072`, `262144`, `524288`, `1048576`, `2097152`, `4194304`, `8388608`, `16777216`, and `33554432`.
         * 
         * @return builder
         * 
         */
        public Builder storageMb(@Nullable Output<Integer> storageMb) {
            $.storageMb = storageMb;
            return this;
        }

        /**
         * @param storageMb The max storage allowed for the PostgreSQL Flexible Server. Possible values are `32768`, `65536`, `131072`, `262144`, `524288`, `1048576`, `2097152`, `4194304`, `8388608`, `16777216`, and `33554432`.
         * 
         * @return builder
         * 
         */
        public Builder storageMb(Integer storageMb) {
            return storageMb(Output.of(storageMb));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the PostgreSQL Flexible Server.
         * *
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the PostgreSQL Flexible Server.
         * *
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param version The version of PostgreSQL Flexible Server to use. Possible values are `11`,`12`, `13` and `14`. Required when `create_mode` is `Default`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of PostgreSQL Flexible Server to use. Possible values are `11`,`12`, `13` and `14`. Required when `create_mode` is `Default`. Changing this forces a new PostgreSQL Flexible Server to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param zone Specifies the Availability Zone in which the PostgreSQL Flexible Server should be located.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone Specifies the Availability Zone in which the PostgreSQL Flexible Server should be located.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public FlexibleServerArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
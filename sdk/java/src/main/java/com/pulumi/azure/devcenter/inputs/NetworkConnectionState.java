// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devcenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkConnectionState Empty = new NetworkConnectionState();

    /**
     * The Azure Active Directory Join type. Possible values are `AzureADJoin` and `HybridAzureADJoin`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="domainJoinType")
    private @Nullable Output<String> domainJoinType;

    /**
     * @return The Azure Active Directory Join type. Possible values are `AzureADJoin` and `HybridAzureADJoin`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> domainJoinType() {
        return Optional.ofNullable(this.domainJoinType);
    }

    /**
     * The name of the Azure Active Directory domain.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The name of the Azure Active Directory domain.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The password for the account used to join domain.
     * 
     */
    @Import(name="domainPassword")
    private @Nullable Output<String> domainPassword;

    /**
     * @return The password for the account used to join domain.
     * 
     */
    public Optional<Output<String>> domainPassword() {
        return Optional.ofNullable(this.domainPassword);
    }

    /**
     * The username of the Azure Active Directory account (user or service account) that has permissions to create computer objects in Active Directory.
     * 
     */
    @Import(name="domainUsername")
    private @Nullable Output<String> domainUsername;

    /**
     * @return The username of the Azure Active Directory account (user or service account) that has permissions to create computer objects in Active Directory.
     * 
     */
    public Optional<Output<String>> domainUsername() {
        return Optional.ofNullable(this.domainUsername);
    }

    /**
     * The Azure Region where the Dev Center Network Connection should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Dev Center Network Connection should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of this Dev Center Network Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of this Dev Center Network Connection. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Azure Active Directory domain Organization Unit (OU).
     * 
     */
    @Import(name="organizationUnit")
    private @Nullable Output<String> organizationUnit;

    /**
     * @return The Azure Active Directory domain Organization Unit (OU).
     * 
     */
    public Optional<Output<String>> organizationUnit() {
        return Optional.ofNullable(this.organizationUnit);
    }

    /**
     * Specifies the name of the Resource Group within which this Dev Center Network Connection should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group within which this Dev Center Network Connection should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The ID of the Subnet that is used to attach Virtual Machines.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet that is used to attach Virtual Machines.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * A mapping of tags which should be assigned to the Dev Center Network Connection.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Dev Center Network Connection.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkConnectionState() {}

    private NetworkConnectionState(NetworkConnectionState $) {
        this.domainJoinType = $.domainJoinType;
        this.domainName = $.domainName;
        this.domainPassword = $.domainPassword;
        this.domainUsername = $.domainUsername;
        this.location = $.location;
        this.name = $.name;
        this.organizationUnit = $.organizationUnit;
        this.resourceGroupName = $.resourceGroupName;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkConnectionState $;

        public Builder() {
            $ = new NetworkConnectionState();
        }

        public Builder(NetworkConnectionState defaults) {
            $ = new NetworkConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainJoinType The Azure Active Directory Join type. Possible values are `AzureADJoin` and `HybridAzureADJoin`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder domainJoinType(@Nullable Output<String> domainJoinType) {
            $.domainJoinType = domainJoinType;
            return this;
        }

        /**
         * @param domainJoinType The Azure Active Directory Join type. Possible values are `AzureADJoin` and `HybridAzureADJoin`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder domainJoinType(String domainJoinType) {
            return domainJoinType(Output.of(domainJoinType));
        }

        /**
         * @param domainName The name of the Azure Active Directory domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The name of the Azure Active Directory domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param domainPassword The password for the account used to join domain.
         * 
         * @return builder
         * 
         */
        public Builder domainPassword(@Nullable Output<String> domainPassword) {
            $.domainPassword = domainPassword;
            return this;
        }

        /**
         * @param domainPassword The password for the account used to join domain.
         * 
         * @return builder
         * 
         */
        public Builder domainPassword(String domainPassword) {
            return domainPassword(Output.of(domainPassword));
        }

        /**
         * @param domainUsername The username of the Azure Active Directory account (user or service account) that has permissions to create computer objects in Active Directory.
         * 
         * @return builder
         * 
         */
        public Builder domainUsername(@Nullable Output<String> domainUsername) {
            $.domainUsername = domainUsername;
            return this;
        }

        /**
         * @param domainUsername The username of the Azure Active Directory account (user or service account) that has permissions to create computer objects in Active Directory.
         * 
         * @return builder
         * 
         */
        public Builder domainUsername(String domainUsername) {
            return domainUsername(Output.of(domainUsername));
        }

        /**
         * @param location The Azure Region where the Dev Center Network Connection should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Dev Center Network Connection should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of this Dev Center Network Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of this Dev Center Network Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationUnit The Azure Active Directory domain Organization Unit (OU).
         * 
         * @return builder
         * 
         */
        public Builder organizationUnit(@Nullable Output<String> organizationUnit) {
            $.organizationUnit = organizationUnit;
            return this;
        }

        /**
         * @param organizationUnit The Azure Active Directory domain Organization Unit (OU).
         * 
         * @return builder
         * 
         */
        public Builder organizationUnit(String organizationUnit) {
            return organizationUnit(Output.of(organizationUnit));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group within which this Dev Center Network Connection should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group within which this Dev Center Network Connection should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subnetId The ID of the Subnet that is used to attach Virtual Machines.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet that is used to attach Virtual Machines.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Dev Center Network Connection.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Dev Center Network Connection.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkConnectionState build() {
            return $;
        }
    }

}

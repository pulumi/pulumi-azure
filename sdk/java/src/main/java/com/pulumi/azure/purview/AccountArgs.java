// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.purview;

import com.pulumi.azure.purview.inputs.AccountIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity", required=true)
    private Output<AccountIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<AccountIdentityArgs> identity() {
        return this.identity;
    }

    /**
     * The Azure Region where the Purview Account should exist. Changing this forces a new Purview Account to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Purview Account should exist. Changing this forces a new Purview Account to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for the new Resource Group where Purview Account creates the managed resources. Changing this forces a new Purview Account to be created.
     * 
     */
    @Import(name="managedResourceGroupName")
    private @Nullable Output<String> managedResourceGroupName;

    /**
     * @return The name which should be used for the new Resource Group where Purview Account creates the managed resources. Changing this forces a new Purview Account to be created.
     * 
     */
    public Optional<Output<String>> managedResourceGroupName() {
        return Optional.ofNullable(this.managedResourceGroupName);
    }

    /**
     * The name which should be used for this Purview Account. Changing this forces a new Purview Account to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Purview Account. Changing this forces a new Purview Account to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Should the Purview Account be visible to the public network? Defaults to `true`.
     * 
     */
    @Import(name="publicNetworkEnabled")
    private @Nullable Output<Boolean> publicNetworkEnabled;

    /**
     * @return Should the Purview Account be visible to the public network? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkEnabled() {
        return Optional.ofNullable(this.publicNetworkEnabled);
    }

    /**
     * The name of the Resource Group where the Purview Account should exist. Changing this forces a new Purview Account to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Purview Account should exist. Changing this forces a new Purview Account to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags which should be assigned to the Purview Account.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Purview Account.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.identity = $.identity;
        this.location = $.location;
        this.managedResourceGroupName = $.managedResourceGroupName;
        this.name = $.name;
        this.publicNetworkEnabled = $.publicNetworkEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(Output<AccountIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(AccountIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The Azure Region where the Purview Account should exist. Changing this forces a new Purview Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Purview Account should exist. Changing this forces a new Purview Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedResourceGroupName The name which should be used for the new Resource Group where Purview Account creates the managed resources. Changing this forces a new Purview Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupName(@Nullable Output<String> managedResourceGroupName) {
            $.managedResourceGroupName = managedResourceGroupName;
            return this;
        }

        /**
         * @param managedResourceGroupName The name which should be used for the new Resource Group where Purview Account creates the managed resources. Changing this forces a new Purview Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedResourceGroupName(String managedResourceGroupName) {
            return managedResourceGroupName(Output.of(managedResourceGroupName));
        }

        /**
         * @param name The name which should be used for this Purview Account. Changing this forces a new Purview Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Purview Account. Changing this forces a new Purview Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicNetworkEnabled Should the Purview Account be visible to the public network? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkEnabled(@Nullable Output<Boolean> publicNetworkEnabled) {
            $.publicNetworkEnabled = publicNetworkEnabled;
            return this;
        }

        /**
         * @param publicNetworkEnabled Should the Purview Account be visible to the public network? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkEnabled(Boolean publicNetworkEnabled) {
            return publicNetworkEnabled(Output.of(publicNetworkEnabled));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Purview Account should exist. Changing this forces a new Purview Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Purview Account should exist. Changing this forces a new Purview Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Purview Account.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Purview Account.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AccountArgs build() {
            $.identity = Objects.requireNonNull($.identity, "expected parameter 'identity' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
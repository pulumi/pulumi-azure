// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.eventhub.inputs.NamespaceCustomerManagedKeyArgs;
import com.pulumi.azure.eventhub.inputs.NamespaceIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceArgs Empty = new NamespaceArgs();

    /**
     * Specifies the capacity. When `sku` is `Premium`, capacity can be `1`, `2`, `4`, `8` or `16`. When `sku` is `Basic` or `Standard`, capacity can be `0` only.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return Specifies the capacity. When `sku` is `Premium`, capacity can be `1`, `2`, `4`, `8` or `16`. When `sku` is `Basic` or `Standard`, capacity can be `0` only.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * An `customer_managed_key` block as defined below.
     * 
     */
    @Import(name="customerManagedKey")
    private @Nullable Output<NamespaceCustomerManagedKeyArgs> customerManagedKey;

    /**
     * @return An `customer_managed_key` block as defined below.
     * 
     */
    public Optional<Output<NamespaceCustomerManagedKeyArgs>> customerManagedKey() {
        return Optional.ofNullable(this.customerManagedKey);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<NamespaceIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<NamespaceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Whether or not SAS authentication is enabled for the Service Bus namespace. Defaults to `true`.
     * 
     */
    @Import(name="localAuthEnabled")
    private @Nullable Output<Boolean> localAuthEnabled;

    /**
     * @return Whether or not SAS authentication is enabled for the Service Bus namespace. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> localAuthEnabled() {
        return Optional.ofNullable(this.localAuthEnabled);
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
     * Specifies the name of the ServiceBus Namespace resource . Changing this forces a
     * new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Namespace resource . Changing this forces a
     * new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to
     * create the namespace.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to
     * create the namespace.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Defines which tier to use. Options are `Basic`, `Standard` or `Premium`. Please note that setting this field to `Premium` will force the creation of a new resource.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return Defines which tier to use. Options are `Basic`, `Standard` or `Premium`. Please note that setting this field to `Premium` will force the creation of a new resource.
     * 
     */
    public Output<String> sku() {
        return this.sku;
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
     * Whether or not this resource is zone redundant. `sku` needs to be `Premium`. Defaults to `false`.
     * 
     */
    @Import(name="zoneRedundant")
    private @Nullable Output<Boolean> zoneRedundant;

    /**
     * @return Whether or not this resource is zone redundant. `sku` needs to be `Premium`. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> zoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    private NamespaceArgs() {}

    private NamespaceArgs(NamespaceArgs $) {
        this.capacity = $.capacity;
        this.customerManagedKey = $.customerManagedKey;
        this.identity = $.identity;
        this.localAuthEnabled = $.localAuthEnabled;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
        this.zoneRedundant = $.zoneRedundant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceArgs $;

        public Builder() {
            $ = new NamespaceArgs();
        }

        public Builder(NamespaceArgs defaults) {
            $ = new NamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity Specifies the capacity. When `sku` is `Premium`, capacity can be `1`, `2`, `4`, `8` or `16`. When `sku` is `Basic` or `Standard`, capacity can be `0` only.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity Specifies the capacity. When `sku` is `Premium`, capacity can be `1`, `2`, `4`, `8` or `16`. When `sku` is `Basic` or `Standard`, capacity can be `0` only.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param customerManagedKey An `customer_managed_key` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedKey(@Nullable Output<NamespaceCustomerManagedKeyArgs> customerManagedKey) {
            $.customerManagedKey = customerManagedKey;
            return this;
        }

        /**
         * @param customerManagedKey An `customer_managed_key` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedKey(NamespaceCustomerManagedKeyArgs customerManagedKey) {
            return customerManagedKey(Output.of(customerManagedKey));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<NamespaceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(NamespaceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param localAuthEnabled Whether or not SAS authentication is enabled for the Service Bus namespace. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder localAuthEnabled(@Nullable Output<Boolean> localAuthEnabled) {
            $.localAuthEnabled = localAuthEnabled;
            return this;
        }

        /**
         * @param localAuthEnabled Whether or not SAS authentication is enabled for the Service Bus namespace. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder localAuthEnabled(Boolean localAuthEnabled) {
            return localAuthEnabled(Output.of(localAuthEnabled));
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
         * @param name Specifies the name of the ServiceBus Namespace resource . Changing this forces a
         * new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the ServiceBus Namespace resource . Changing this forces a
         * new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the namespace.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the namespace.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku Defines which tier to use. Options are `Basic`, `Standard` or `Premium`. Please note that setting this field to `Premium` will force the creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Defines which tier to use. Options are `Basic`, `Standard` or `Premium`. Please note that setting this field to `Premium` will force the creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
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
         * @param zoneRedundant Whether or not this resource is zone redundant. `sku` needs to be `Premium`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundant(@Nullable Output<Boolean> zoneRedundant) {
            $.zoneRedundant = zoneRedundant;
            return this;
        }

        /**
         * @param zoneRedundant Whether or not this resource is zone redundant. `sku` needs to be `Premium`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder zoneRedundant(Boolean zoneRedundant) {
            return zoneRedundant(Output.of(zoneRedundant));
        }

        public NamespaceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
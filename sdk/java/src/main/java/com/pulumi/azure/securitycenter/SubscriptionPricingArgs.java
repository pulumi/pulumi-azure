// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionPricingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionPricingArgs Empty = new SubscriptionPricingArgs();

    /**
     * The resource type this setting affects. Possible values are `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `OpenSourceRelationalDatabases`, `Containers` and `Dns`. Defaults to `VirtualMachines`.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The resource type this setting affects. Possible values are `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `OpenSourceRelationalDatabases`, `Containers` and `Dns`. Defaults to `VirtualMachines`.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * The pricing tier to use. Possible values are `Free` and `Standard`.
     * 
     */
    @Import(name="tier", required=true)
    private Output<String> tier;

    /**
     * @return The pricing tier to use. Possible values are `Free` and `Standard`.
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }

    private SubscriptionPricingArgs() {}

    private SubscriptionPricingArgs(SubscriptionPricingArgs $) {
        this.resourceType = $.resourceType;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionPricingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionPricingArgs $;

        public Builder() {
            $ = new SubscriptionPricingArgs();
        }

        public Builder(SubscriptionPricingArgs defaults) {
            $ = new SubscriptionPricingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceType The resource type this setting affects. Possible values are `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `OpenSourceRelationalDatabases`, `Containers` and `Dns`. Defaults to `VirtualMachines`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The resource type this setting affects. Possible values are `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `OpenSourceRelationalDatabases`, `Containers` and `Dns`. Defaults to `VirtualMachines`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param tier The pricing tier to use. Possible values are `Free` and `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder tier(Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The pricing tier to use. Possible values are `Free` and `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public SubscriptionPricingArgs build() {
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            return $;
        }
    }

}
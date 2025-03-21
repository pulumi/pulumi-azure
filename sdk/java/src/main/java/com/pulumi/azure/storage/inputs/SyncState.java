// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyncState extends com.pulumi.resources.ResourceArgs {

    public static final SyncState Empty = new SyncState();

    /**
     * Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`. Defaults to `AllowAllTraffic`.
     * 
     */
    @Import(name="incomingTrafficPolicy")
    private @Nullable Output<String> incomingTrafficPolicy;

    /**
     * @return Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`. Defaults to `AllowAllTraffic`.
     * 
     */
    public Optional<Output<String>> incomingTrafficPolicy() {
        return Optional.ofNullable(this.incomingTrafficPolicy);
    }

    /**
     * The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of registered servers owned by this Storage Sync.
     * 
     */
    @Import(name="registeredServers")
    private @Nullable Output<List<String>> registeredServers;

    /**
     * @return A list of registered servers owned by this Storage Sync.
     * 
     */
    public Optional<Output<List<String>>> registeredServers() {
        return Optional.ofNullable(this.registeredServers);
    }

    /**
     * The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags which should be assigned to the Storage Sync.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Storage Sync.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SyncState() {}

    private SyncState(SyncState $) {
        this.incomingTrafficPolicy = $.incomingTrafficPolicy;
        this.location = $.location;
        this.name = $.name;
        this.registeredServers = $.registeredServers;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyncState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyncState $;

        public Builder() {
            $ = new SyncState();
        }

        public Builder(SyncState defaults) {
            $ = new SyncState(Objects.requireNonNull(defaults));
        }

        /**
         * @param incomingTrafficPolicy Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`. Defaults to `AllowAllTraffic`.
         * 
         * @return builder
         * 
         */
        public Builder incomingTrafficPolicy(@Nullable Output<String> incomingTrafficPolicy) {
            $.incomingTrafficPolicy = incomingTrafficPolicy;
            return this;
        }

        /**
         * @param incomingTrafficPolicy Incoming traffic policy. Possible values are `AllowAllTraffic` and `AllowVirtualNetworksOnly`. Defaults to `AllowAllTraffic`.
         * 
         * @return builder
         * 
         */
        public Builder incomingTrafficPolicy(String incomingTrafficPolicy) {
            return incomingTrafficPolicy(Output.of(incomingTrafficPolicy));
        }

        /**
         * @param location The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Storage Sync. Changing this forces a new Storage Sync to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param registeredServers A list of registered servers owned by this Storage Sync.
         * 
         * @return builder
         * 
         */
        public Builder registeredServers(@Nullable Output<List<String>> registeredServers) {
            $.registeredServers = registeredServers;
            return this;
        }

        /**
         * @param registeredServers A list of registered servers owned by this Storage Sync.
         * 
         * @return builder
         * 
         */
        public Builder registeredServers(List<String> registeredServers) {
            return registeredServers(Output.of(registeredServers));
        }

        /**
         * @param registeredServers A list of registered servers owned by this Storage Sync.
         * 
         * @return builder
         * 
         */
        public Builder registeredServers(String... registeredServers) {
            return registeredServers(List.of(registeredServers));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Storage Sync should exist. Changing this forces a new Storage Sync to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Storage Sync.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Storage Sync.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SyncState build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.network.inputs.NetworkManagerScopeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkManagerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkManagerArgs Empty = new NetworkManagerArgs();

    /**
     * A description of the Network Manager.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the Network Manager.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the Azure Region where the Network Manager should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Network Manager should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name which should be used for this Network Manager. Changing this forces a new Network Manager to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Network Manager. Changing this forces a new Network Manager to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the Resource Group where the Network Manager should exist. Changing this forces a new Network Manager to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Network Manager should exist. Changing this forces a new Network Manager to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `scope` block as defined below.
     * 
     */
    @Import(name="scope", required=true)
    private Output<NetworkManagerScopeArgs> scope;

    /**
     * @return A `scope` block as defined below.
     * 
     */
    public Output<NetworkManagerScopeArgs> scope() {
        return this.scope;
    }

    /**
     * A list of configuration deployment types. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`, which specify whether Connectivity Configuration, Security Admin Configuration or Routing Configuration are allowed for the Network Manager.
     * 
     */
    @Import(name="scopeAccesses")
    private @Nullable Output<List<String>> scopeAccesses;

    /**
     * @return A list of configuration deployment types. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`, which specify whether Connectivity Configuration, Security Admin Configuration or Routing Configuration are allowed for the Network Manager.
     * 
     */
    public Optional<Output<List<String>>> scopeAccesses() {
        return Optional.ofNullable(this.scopeAccesses);
    }

    /**
     * A mapping of tags which should be assigned to the Network Manager.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Network Manager.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkManagerArgs() {}

    private NetworkManagerArgs(NetworkManagerArgs $) {
        this.description = $.description;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scope = $.scope;
        this.scopeAccesses = $.scopeAccesses;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkManagerArgs $;

        public Builder() {
            $ = new NetworkManagerArgs();
        }

        public Builder(NetworkManagerArgs defaults) {
            $ = new NetworkManagerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param location Specifies the Azure Region where the Network Manager should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Network Manager should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name which should be used for this Network Manager. Changing this forces a new Network Manager to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Network Manager. Changing this forces a new Network Manager to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Network Manager should exist. Changing this forces a new Network Manager to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Network Manager should exist. Changing this forces a new Network Manager to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scope A `scope` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<NetworkManagerScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope A `scope` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder scope(NetworkManagerScopeArgs scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param scopeAccesses A list of configuration deployment types. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`, which specify whether Connectivity Configuration, Security Admin Configuration or Routing Configuration are allowed for the Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccesses(@Nullable Output<List<String>> scopeAccesses) {
            $.scopeAccesses = scopeAccesses;
            return this;
        }

        /**
         * @param scopeAccesses A list of configuration deployment types. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`, which specify whether Connectivity Configuration, Security Admin Configuration or Routing Configuration are allowed for the Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccesses(List<String> scopeAccesses) {
            return scopeAccesses(Output.of(scopeAccesses));
        }

        /**
         * @param scopeAccesses A list of configuration deployment types. Possible values are `Connectivity`, `SecurityAdmin` and `Routing`, which specify whether Connectivity Configuration, Security Admin Configuration or Routing Configuration are allowed for the Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder scopeAccesses(String... scopeAccesses) {
            return scopeAccesses(List.of(scopeAccesses));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Network Manager.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkManagerArgs build() {
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("NetworkManagerArgs", "resourceGroupName");
            }
            if ($.scope == null) {
                throw new MissingRequiredPropertyException("NetworkManagerArgs", "scope");
            }
            return $;
        }
    }

}

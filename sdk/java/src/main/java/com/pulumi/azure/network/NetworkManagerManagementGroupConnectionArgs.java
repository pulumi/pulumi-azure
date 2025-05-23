// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkManagerManagementGroupConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkManagerManagementGroupConnectionArgs Empty = new NetworkManagerManagementGroupConnectionArgs();

    /**
     * A description of the Network Manager Management Group Connection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the Network Manager Management Group Connection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private Output<String> managementGroupId;

    /**
     * @return Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="networkManagerId", required=true)
    private Output<String> networkManagerId;

    /**
     * @return Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> networkManagerId() {
        return this.networkManagerId;
    }

    private NetworkManagerManagementGroupConnectionArgs() {}

    private NetworkManagerManagementGroupConnectionArgs(NetworkManagerManagementGroupConnectionArgs $) {
        this.description = $.description;
        this.managementGroupId = $.managementGroupId;
        this.name = $.name;
        this.networkManagerId = $.networkManagerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkManagerManagementGroupConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkManagerManagementGroupConnectionArgs $;

        public Builder() {
            $ = new NetworkManagerManagementGroupConnectionArgs();
        }

        public Builder(NetworkManagerManagementGroupConnectionArgs defaults) {
            $ = new NetworkManagerManagementGroupConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the Network Manager Management Group Connection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Network Manager Management Group Connection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param managementGroupId Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        /**
         * @param managementGroupId Specifies the ID of the target Management Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        /**
         * @param name Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Network Manager Management Group Connection. Changing this forces a new Network Manager Management Group Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkManagerId Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(Output<String> networkManagerId) {
            $.networkManagerId = networkManagerId;
            return this;
        }

        /**
         * @param networkManagerId Specifies the ID of the Network Manager which the Management Group is connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerId(String networkManagerId) {
            return networkManagerId(Output.of(networkManagerId));
        }

        public NetworkManagerManagementGroupConnectionArgs build() {
            if ($.managementGroupId == null) {
                throw new MissingRequiredPropertyException("NetworkManagerManagementGroupConnectionArgs", "managementGroupId");
            }
            if ($.networkManagerId == null) {
                throw new MissingRequiredPropertyException("NetworkManagerManagementGroupConnectionArgs", "networkManagerId");
            }
            return $;
        }
    }

}

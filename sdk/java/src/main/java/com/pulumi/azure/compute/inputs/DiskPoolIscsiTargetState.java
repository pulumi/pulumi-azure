// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskPoolIscsiTargetState extends com.pulumi.resources.ResourceArgs {

    public static final DiskPoolIscsiTargetState Empty = new DiskPoolIscsiTargetState();

    /**
     * Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
     * 
     */
    @Import(name="aclMode")
    private @Nullable Output<String> aclMode;

    /**
     * @return Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
     * 
     */
    public Optional<Output<String>> aclMode() {
        return Optional.ofNullable(this.aclMode);
    }

    /**
     * The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
     * 
     */
    @Import(name="disksPoolId")
    private @Nullable Output<String> disksPoolId;

    /**
     * @return The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
     * 
     */
    public Optional<Output<String>> disksPoolId() {
        return Optional.ofNullable(this.disksPoolId);
    }

    /**
     * List of private IPv4 addresses to connect to the iSCSI Target.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<List<String>> endpoints;

    /**
     * @return List of private IPv4 addresses to connect to the iSCSI Target.
     * 
     */
    public Optional<Output<List<String>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The port used by iSCSI Target portal group.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port used by iSCSI Target portal group.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.&lt;abc&gt;.&lt;pqr&gt;[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
     * 
     */
    @Import(name="targetIqn")
    private @Nullable Output<String> targetIqn;

    /**
     * @return ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.&lt;abc&gt;.&lt;pqr&gt;[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
     * 
     */
    public Optional<Output<String>> targetIqn() {
        return Optional.ofNullable(this.targetIqn);
    }

    private DiskPoolIscsiTargetState() {}

    private DiskPoolIscsiTargetState(DiskPoolIscsiTargetState $) {
        this.aclMode = $.aclMode;
        this.disksPoolId = $.disksPoolId;
        this.endpoints = $.endpoints;
        this.name = $.name;
        this.port = $.port;
        this.targetIqn = $.targetIqn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskPoolIscsiTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskPoolIscsiTargetState $;

        public Builder() {
            $ = new DiskPoolIscsiTargetState();
        }

        public Builder(DiskPoolIscsiTargetState defaults) {
            $ = new DiskPoolIscsiTargetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclMode Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder aclMode(@Nullable Output<String> aclMode) {
            $.aclMode = aclMode;
            return this;
        }

        /**
         * @param aclMode Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder aclMode(String aclMode) {
            return aclMode(Output.of(aclMode));
        }

        /**
         * @param disksPoolId The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder disksPoolId(@Nullable Output<String> disksPoolId) {
            $.disksPoolId = disksPoolId;
            return this;
        }

        /**
         * @param disksPoolId The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder disksPoolId(String disksPoolId) {
            return disksPoolId(Output.of(disksPoolId));
        }

        /**
         * @param endpoints List of private IPv4 addresses to connect to the iSCSI Target.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<List<String>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints List of private IPv4 addresses to connect to the iSCSI Target.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(List<String> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpoints List of private IPv4 addresses to connect to the iSCSI Target.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(String... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param name The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port used by iSCSI Target portal group.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port used by iSCSI Target portal group.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param targetIqn ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.&lt;abc&gt;.&lt;pqr&gt;[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetIqn(@Nullable Output<String> targetIqn) {
            $.targetIqn = targetIqn;
            return this;
        }

        /**
         * @param targetIqn ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.&lt;abc&gt;.&lt;pqr&gt;[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetIqn(String targetIqn) {
            return targetIqn(Output.of(targetIqn));
        }

        public DiskPoolIscsiTargetState build() {
            return $;
        }
    }

}

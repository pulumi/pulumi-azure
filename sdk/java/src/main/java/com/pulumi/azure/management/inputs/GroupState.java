// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * A friendly name for this Management Group. If not specified, this will be the same as the `name`.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A friendly name for this Management Group. If not specified, this will be the same as the `name`.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Parent Management Group. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="parentManagementGroupId")
    private @Nullable Output<String> parentManagementGroupId;

    /**
     * @return The ID of the Parent Management Group. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> parentManagementGroupId() {
        return Optional.ofNullable(this.parentManagementGroupId);
    }

    /**
     * A list of Subscription GUIDs which should be assigned to the Management Group.
     * 
     */
    @Import(name="subscriptionIds")
    private @Nullable Output<List<String>> subscriptionIds;

    /**
     * @return A list of Subscription GUIDs which should be assigned to the Management Group.
     * 
     */
    public Optional<Output<List<String>>> subscriptionIds() {
        return Optional.ofNullable(this.subscriptionIds);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.displayName = $.displayName;
        this.name = $.name;
        this.parentManagementGroupId = $.parentManagementGroupId;
        this.subscriptionIds = $.subscriptionIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A friendly name for this Management Group. If not specified, this will be the same as the `name`.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A friendly name for this Management Group. If not specified, this will be the same as the `name`.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name or UUID for this Management Group, which needs to be unique across your tenant. A new UUID will be generated if not provided. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentManagementGroupId The ID of the Parent Management Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder parentManagementGroupId(@Nullable Output<String> parentManagementGroupId) {
            $.parentManagementGroupId = parentManagementGroupId;
            return this;
        }

        /**
         * @param parentManagementGroupId The ID of the Parent Management Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder parentManagementGroupId(String parentManagementGroupId) {
            return parentManagementGroupId(Output.of(parentManagementGroupId));
        }

        /**
         * @param subscriptionIds A list of Subscription GUIDs which should be assigned to the Management Group.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionIds(@Nullable Output<List<String>> subscriptionIds) {
            $.subscriptionIds = subscriptionIds;
            return this;
        }

        /**
         * @param subscriptionIds A list of Subscription GUIDs which should be assigned to the Management Group.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionIds(List<String> subscriptionIds) {
            return subscriptionIds(Output.of(subscriptionIds));
        }

        /**
         * @param subscriptionIds A list of Subscription GUIDs which should be assigned to the Management Group.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionIds(String... subscriptionIds) {
            return subscriptionIds(List.of(subscriptionIds));
        }

        public GroupState build() {
            return $;
        }
    }

}
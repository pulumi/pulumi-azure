// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyDefintionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyDefintionArgs Empty = new GetPolicyDefintionArgs();

    /**
     * Specifies the display name of the Policy Definition. Conflicts with `name`.
     * 
     * &gt; **Note:** Looking up policies by `display_name` is not recommended by the Azure Policy team as the property is not unique nor immutable. As such errors may occur when there are multiple policy definitions with same display name or the display name is changed. To avoid these types of errors you may wish to use the `name` property instead.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Specifies the display name of the Policy Definition. Conflicts with `name`.
     * 
     * &gt; **Note:** Looking up policies by `display_name` is not recommended by the Azure Policy team as the property is not unique nor immutable. As such errors may occur when there are multiple policy definitions with same display name or the display name is changed. To avoid these types of errors you may wish to use the `name` property instead.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Only retrieve Policy Definitions from this Management Group.
     * 
     */
    @Import(name="managementGroupName")
    private @Nullable Output<String> managementGroupName;

    /**
     * @return Only retrieve Policy Definitions from this Management Group.
     * 
     */
    public Optional<Output<String>> managementGroupName() {
        return Optional.ofNullable(this.managementGroupName);
    }

    /**
     * Specifies the name of the Policy Definition. Conflicts with `display_name`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Policy Definition. Conflicts with `display_name`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetPolicyDefintionArgs() {}

    private GetPolicyDefintionArgs(GetPolicyDefintionArgs $) {
        this.displayName = $.displayName;
        this.managementGroupName = $.managementGroupName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDefintionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDefintionArgs $;

        public Builder() {
            $ = new GetPolicyDefintionArgs();
        }

        public Builder(GetPolicyDefintionArgs defaults) {
            $ = new GetPolicyDefintionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Specifies the display name of the Policy Definition. Conflicts with `name`.
         * 
         * &gt; **Note:** Looking up policies by `display_name` is not recommended by the Azure Policy team as the property is not unique nor immutable. As such errors may occur when there are multiple policy definitions with same display name or the display name is changed. To avoid these types of errors you may wish to use the `name` property instead.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Specifies the display name of the Policy Definition. Conflicts with `name`.
         * 
         * &gt; **Note:** Looking up policies by `display_name` is not recommended by the Azure Policy team as the property is not unique nor immutable. As such errors may occur when there are multiple policy definitions with same display name or the display name is changed. To avoid these types of errors you may wish to use the `name` property instead.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param managementGroupName Only retrieve Policy Definitions from this Management Group.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupName(@Nullable Output<String> managementGroupName) {
            $.managementGroupName = managementGroupName;
            return this;
        }

        /**
         * @param managementGroupName Only retrieve Policy Definitions from this Management Group.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupName(String managementGroupName) {
            return managementGroupName(Output.of(managementGroupName));
        }

        /**
         * @param name Specifies the name of the Policy Definition. Conflicts with `display_name`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Policy Definition. Conflicts with `display_name`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetPolicyDefintionArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppFlexConsumptionAlwaysReadyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppFlexConsumptionAlwaysReadyArgs Empty = new AppFlexConsumptionAlwaysReadyArgs();

    /**
     * The instance count of the `always_ready` of the  Function App. The minimum number is `0`. The total number of `instance_count` should not exceed the `maximum_instance_count`.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return The instance count of the `always_ready` of the  Function App. The minimum number is `0`. The total number of `instance_count` should not exceed the `maximum_instance_count`.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * The name of the `always_ready` of the Function App.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the `always_ready` of the Function App.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private AppFlexConsumptionAlwaysReadyArgs() {}

    private AppFlexConsumptionAlwaysReadyArgs(AppFlexConsumptionAlwaysReadyArgs $) {
        this.instanceCount = $.instanceCount;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppFlexConsumptionAlwaysReadyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppFlexConsumptionAlwaysReadyArgs $;

        public Builder() {
            $ = new AppFlexConsumptionAlwaysReadyArgs();
        }

        public Builder(AppFlexConsumptionAlwaysReadyArgs defaults) {
            $ = new AppFlexConsumptionAlwaysReadyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceCount The instance count of the `always_ready` of the  Function App. The minimum number is `0`. The total number of `instance_count` should not exceed the `maximum_instance_count`.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount The instance count of the `always_ready` of the  Function App. The minimum number is `0`. The total number of `instance_count` should not exceed the `maximum_instance_count`.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param name The name of the `always_ready` of the Function App.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the `always_ready` of the Function App.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AppFlexConsumptionAlwaysReadyArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AppFlexConsumptionAlwaysReadyArgs", "name");
            }
            return $;
        }
    }

}

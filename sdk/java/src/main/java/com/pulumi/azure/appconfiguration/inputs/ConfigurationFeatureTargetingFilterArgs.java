// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.inputs;

import com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationFeatureTargetingFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationFeatureTargetingFilterArgs Empty = new ConfigurationFeatureTargetingFilterArgs();

    /**
     * A number representing the percentage of the entire user base.
     * 
     */
    @Import(name="defaultRolloutPercentage", required=true)
    private Output<Integer> defaultRolloutPercentage;

    /**
     * @return A number representing the percentage of the entire user base.
     * 
     */
    public Output<Integer> defaultRolloutPercentage() {
        return this.defaultRolloutPercentage;
    }

    /**
     * One or more blocks of type `groups` as defined below.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<ConfigurationFeatureTargetingFilterGroupArgs>> groups;

    /**
     * @return One or more blocks of type `groups` as defined below.
     * 
     */
    public Optional<Output<List<ConfigurationFeatureTargetingFilterGroupArgs>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * A list of users to target for this feature.
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<String>> users;

    /**
     * @return A list of users to target for this feature.
     * 
     */
    public Optional<Output<List<String>>> users() {
        return Optional.ofNullable(this.users);
    }

    private ConfigurationFeatureTargetingFilterArgs() {}

    private ConfigurationFeatureTargetingFilterArgs(ConfigurationFeatureTargetingFilterArgs $) {
        this.defaultRolloutPercentage = $.defaultRolloutPercentage;
        this.groups = $.groups;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationFeatureTargetingFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationFeatureTargetingFilterArgs $;

        public Builder() {
            $ = new ConfigurationFeatureTargetingFilterArgs();
        }

        public Builder(ConfigurationFeatureTargetingFilterArgs defaults) {
            $ = new ConfigurationFeatureTargetingFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRolloutPercentage A number representing the percentage of the entire user base.
         * 
         * @return builder
         * 
         */
        public Builder defaultRolloutPercentage(Output<Integer> defaultRolloutPercentage) {
            $.defaultRolloutPercentage = defaultRolloutPercentage;
            return this;
        }

        /**
         * @param defaultRolloutPercentage A number representing the percentage of the entire user base.
         * 
         * @return builder
         * 
         */
        public Builder defaultRolloutPercentage(Integer defaultRolloutPercentage) {
            return defaultRolloutPercentage(Output.of(defaultRolloutPercentage));
        }

        /**
         * @param groups One or more blocks of type `groups` as defined below.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<ConfigurationFeatureTargetingFilterGroupArgs>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups One or more blocks of type `groups` as defined below.
         * 
         * @return builder
         * 
         */
        public Builder groups(List<ConfigurationFeatureTargetingFilterGroupArgs> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups One or more blocks of type `groups` as defined below.
         * 
         * @return builder
         * 
         */
        public Builder groups(ConfigurationFeatureTargetingFilterGroupArgs... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param users A list of users to target for this feature.
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<String>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users A list of users to target for this feature.
         * 
         * @return builder
         * 
         */
        public Builder users(List<String> users) {
            return users(Output.of(users));
        }

        /**
         * @param users A list of users to target for this feature.
         * 
         * @return builder
         * 
         */
        public Builder users(String... users) {
            return users(List.of(users));
        }

        public ConfigurationFeatureTargetingFilterArgs build() {
            $.defaultRolloutPercentage = Objects.requireNonNull($.defaultRolloutPercentage, "expected parameter 'defaultRolloutPercentage' to be non-null");
            return $;
        }
    }

}
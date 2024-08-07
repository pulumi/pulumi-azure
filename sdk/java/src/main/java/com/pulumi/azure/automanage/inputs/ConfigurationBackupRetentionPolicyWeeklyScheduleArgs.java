// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automanage.inputs;

import com.pulumi.azure.automanage.inputs.ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationBackupRetentionPolicyWeeklyScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationBackupRetentionPolicyWeeklyScheduleArgs Empty = new ConfigurationBackupRetentionPolicyWeeklyScheduleArgs();

    /**
     * A `retention_duration` block as defined below.
     * 
     */
    @Import(name="retentionDuration")
    private @Nullable Output<ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDurationArgs> retentionDuration;

    /**
     * @return A `retention_duration` block as defined below.
     * 
     */
    public Optional<Output<ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDurationArgs>> retentionDuration() {
        return Optional.ofNullable(this.retentionDuration);
    }

    /**
     * The retention times of the backup policy.
     * 
     */
    @Import(name="retentionTimes")
    private @Nullable Output<List<String>> retentionTimes;

    /**
     * @return The retention times of the backup policy.
     * 
     */
    public Optional<Output<List<String>>> retentionTimes() {
        return Optional.ofNullable(this.retentionTimes);
    }

    private ConfigurationBackupRetentionPolicyWeeklyScheduleArgs() {}

    private ConfigurationBackupRetentionPolicyWeeklyScheduleArgs(ConfigurationBackupRetentionPolicyWeeklyScheduleArgs $) {
        this.retentionDuration = $.retentionDuration;
        this.retentionTimes = $.retentionTimes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationBackupRetentionPolicyWeeklyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationBackupRetentionPolicyWeeklyScheduleArgs $;

        public Builder() {
            $ = new ConfigurationBackupRetentionPolicyWeeklyScheduleArgs();
        }

        public Builder(ConfigurationBackupRetentionPolicyWeeklyScheduleArgs defaults) {
            $ = new ConfigurationBackupRetentionPolicyWeeklyScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retentionDuration A `retention_duration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionDuration(@Nullable Output<ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDurationArgs> retentionDuration) {
            $.retentionDuration = retentionDuration;
            return this;
        }

        /**
         * @param retentionDuration A `retention_duration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionDuration(ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDurationArgs retentionDuration) {
            return retentionDuration(Output.of(retentionDuration));
        }

        /**
         * @param retentionTimes The retention times of the backup policy.
         * 
         * @return builder
         * 
         */
        public Builder retentionTimes(@Nullable Output<List<String>> retentionTimes) {
            $.retentionTimes = retentionTimes;
            return this;
        }

        /**
         * @param retentionTimes The retention times of the backup policy.
         * 
         * @return builder
         * 
         */
        public Builder retentionTimes(List<String> retentionTimes) {
            return retentionTimes(Output.of(retentionTimes));
        }

        /**
         * @param retentionTimes The retention times of the backup policy.
         * 
         * @return builder
         * 
         */
        public Builder retentionTimes(String... retentionTimes) {
            return retentionTimes(List.of(retentionTimes));
        }

        public ConfigurationBackupRetentionPolicyWeeklyScheduleArgs build() {
            return $;
        }
    }

}

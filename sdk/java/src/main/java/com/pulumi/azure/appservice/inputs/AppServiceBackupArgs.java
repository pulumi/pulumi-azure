// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.AppServiceBackupScheduleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppServiceBackupArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppServiceBackupArgs Empty = new AppServiceBackupArgs();

    /**
     * Is this Backup enabled?
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is this Backup enabled?
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the name for this Backup.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name for this Backup.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A `schedule` block as defined below.
     * 
     */
    @Import(name="schedule", required=true)
    private Output<AppServiceBackupScheduleArgs> schedule;

    /**
     * @return A `schedule` block as defined below.
     * 
     */
    public Output<AppServiceBackupScheduleArgs> schedule() {
        return this.schedule;
    }

    /**
     * The SAS URL to a Storage Container where Backups should be saved.
     * 
     */
    @Import(name="storageAccountUrl", required=true)
    private Output<String> storageAccountUrl;

    /**
     * @return The SAS URL to a Storage Container where Backups should be saved.
     * 
     */
    public Output<String> storageAccountUrl() {
        return this.storageAccountUrl;
    }

    private AppServiceBackupArgs() {}

    private AppServiceBackupArgs(AppServiceBackupArgs $) {
        this.enabled = $.enabled;
        this.name = $.name;
        this.schedule = $.schedule;
        this.storageAccountUrl = $.storageAccountUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppServiceBackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppServiceBackupArgs $;

        public Builder() {
            $ = new AppServiceBackupArgs();
        }

        public Builder(AppServiceBackupArgs defaults) {
            $ = new AppServiceBackupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Is this Backup enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is this Backup enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Specifies the name for this Backup.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name for this Backup.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedule A `schedule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(Output<AppServiceBackupScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule A `schedule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(AppServiceBackupScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param storageAccountUrl The SAS URL to a Storage Container where Backups should be saved.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountUrl(Output<String> storageAccountUrl) {
            $.storageAccountUrl = storageAccountUrl;
            return this;
        }

        /**
         * @param storageAccountUrl The SAS URL to a Storage Container where Backups should be saved.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountUrl(String storageAccountUrl) {
            return storageAccountUrl(Output.of(storageAccountUrl));
        }

        public AppServiceBackupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            $.storageAccountUrl = Objects.requireNonNull($.storageAccountUrl, "expected parameter 'storageAccountUrl' to be non-null");
            return $;
        }
    }

}
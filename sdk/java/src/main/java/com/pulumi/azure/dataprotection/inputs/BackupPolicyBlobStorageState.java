// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.inputs;

import com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPolicyBlobStorageState extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyBlobStorageState Empty = new BackupPolicyBlobStorageState();

    /**
     * Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    @Import(name="backupRepeatingTimeIntervals")
    private @Nullable Output<List<String>> backupRepeatingTimeIntervals;

    /**
     * @return Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    public Optional<Output<List<String>>> backupRepeatingTimeIntervals() {
        return Optional.ofNullable(this.backupRepeatingTimeIntervals);
    }

    /**
     * The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The duration of operational default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    @Import(name="operationalDefaultRetentionDuration")
    private @Nullable Output<String> operationalDefaultRetentionDuration;

    /**
     * @return The duration of operational default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    public Optional<Output<String>> operationalDefaultRetentionDuration() {
        return Optional.ofNullable(this.operationalDefaultRetentionDuration);
    }

    /**
     * One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     * &gt; **Note:** Setting `retention_rule` also requires setting `vault_default_retention_duration`.
     * 
     */
    @Import(name="retentionRules")
    private @Nullable Output<List<BackupPolicyBlobStorageRetentionRuleArgs>> retentionRules;

    /**
     * @return One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     * &gt; **Note:** Setting `retention_rule` also requires setting `vault_default_retention_duration`.
     * 
     */
    public Optional<Output<List<BackupPolicyBlobStorageRetentionRuleArgs>>> retentionRules() {
        return Optional.ofNullable(this.retentionRules);
    }

    /**
     * Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    /**
     * The duration of vault default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     * &gt; **Note:** Setting `vault_default_retention_duration` also requires setting `backup_repeating_time_intervals`. At least one of `operational_default_retention_duration` or `vault_default_retention_duration` must be specified.
     * 
     */
    @Import(name="vaultDefaultRetentionDuration")
    private @Nullable Output<String> vaultDefaultRetentionDuration;

    /**
     * @return The duration of vault default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     * &gt; **Note:** Setting `vault_default_retention_duration` also requires setting `backup_repeating_time_intervals`. At least one of `operational_default_retention_duration` or `vault_default_retention_duration` must be specified.
     * 
     */
    public Optional<Output<String>> vaultDefaultRetentionDuration() {
        return Optional.ofNullable(this.vaultDefaultRetentionDuration);
    }

    /**
     * The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    @Import(name="vaultId")
    private @Nullable Output<String> vaultId;

    /**
     * @return The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     */
    public Optional<Output<String>> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    private BackupPolicyBlobStorageState() {}

    private BackupPolicyBlobStorageState(BackupPolicyBlobStorageState $) {
        this.backupRepeatingTimeIntervals = $.backupRepeatingTimeIntervals;
        this.name = $.name;
        this.operationalDefaultRetentionDuration = $.operationalDefaultRetentionDuration;
        this.retentionRules = $.retentionRules;
        this.timeZone = $.timeZone;
        this.vaultDefaultRetentionDuration = $.vaultDefaultRetentionDuration;
        this.vaultId = $.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyBlobStorageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyBlobStorageState $;

        public Builder() {
            $ = new BackupPolicyBlobStorageState();
        }

        public Builder(BackupPolicyBlobStorageState defaults) {
            $ = new BackupPolicyBlobStorageState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupRepeatingTimeIntervals Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder backupRepeatingTimeIntervals(@Nullable Output<List<String>> backupRepeatingTimeIntervals) {
            $.backupRepeatingTimeIntervals = backupRepeatingTimeIntervals;
            return this;
        }

        /**
         * @param backupRepeatingTimeIntervals Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder backupRepeatingTimeIntervals(List<String> backupRepeatingTimeIntervals) {
            return backupRepeatingTimeIntervals(Output.of(backupRepeatingTimeIntervals));
        }

        /**
         * @param backupRepeatingTimeIntervals Specifies a list of repeating time interval. It should follow `ISO 8601` repeating time interval. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder backupRepeatingTimeIntervals(String... backupRepeatingTimeIntervals) {
            return backupRepeatingTimeIntervals(List.of(backupRepeatingTimeIntervals));
        }

        /**
         * @param name The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Backup Policy Blob Storage. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operationalDefaultRetentionDuration The duration of operational default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder operationalDefaultRetentionDuration(@Nullable Output<String> operationalDefaultRetentionDuration) {
            $.operationalDefaultRetentionDuration = operationalDefaultRetentionDuration;
            return this;
        }

        /**
         * @param operationalDefaultRetentionDuration The duration of operational default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder operationalDefaultRetentionDuration(String operationalDefaultRetentionDuration) {
            return operationalDefaultRetentionDuration(Output.of(operationalDefaultRetentionDuration));
        }

        /**
         * @param retentionRules One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * &gt; **Note:** Setting `retention_rule` also requires setting `vault_default_retention_duration`.
         * 
         * @return builder
         * 
         */
        public Builder retentionRules(@Nullable Output<List<BackupPolicyBlobStorageRetentionRuleArgs>> retentionRules) {
            $.retentionRules = retentionRules;
            return this;
        }

        /**
         * @param retentionRules One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * &gt; **Note:** Setting `retention_rule` also requires setting `vault_default_retention_duration`.
         * 
         * @return builder
         * 
         */
        public Builder retentionRules(List<BackupPolicyBlobStorageRetentionRuleArgs> retentionRules) {
            return retentionRules(Output.of(retentionRules));
        }

        /**
         * @param retentionRules One or more `retention_rule` blocks as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * &gt; **Note:** Setting `retention_rule` also requires setting `vault_default_retention_duration`.
         * 
         * @return builder
         * 
         */
        public Builder retentionRules(BackupPolicyBlobStorageRetentionRuleArgs... retentionRules) {
            return retentionRules(List.of(retentionRules));
        }

        /**
         * @param timeZone Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Specifies the Time Zone which should be used by the backup schedule. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        /**
         * @param vaultDefaultRetentionDuration The duration of vault default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * &gt; **Note:** Setting `vault_default_retention_duration` also requires setting `backup_repeating_time_intervals`. At least one of `operational_default_retention_duration` or `vault_default_retention_duration` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder vaultDefaultRetentionDuration(@Nullable Output<String> vaultDefaultRetentionDuration) {
            $.vaultDefaultRetentionDuration = vaultDefaultRetentionDuration;
            return this;
        }

        /**
         * @param vaultDefaultRetentionDuration The duration of vault default retention rule. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * &gt; **Note:** Setting `vault_default_retention_duration` also requires setting `backup_repeating_time_intervals`. At least one of `operational_default_retention_duration` or `vault_default_retention_duration` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder vaultDefaultRetentionDuration(String vaultDefaultRetentionDuration) {
            return vaultDefaultRetentionDuration(Output.of(vaultDefaultRetentionDuration));
        }

        /**
         * @param vaultId The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(@Nullable Output<String> vaultId) {
            $.vaultId = vaultId;
            return this;
        }

        /**
         * @param vaultId The ID of the Backup Vault within which the Backup Policy Blob Storage should exist. Changing this forces a new Backup Policy Blob Storage to be created.
         * 
         * @return builder
         * 
         */
        public Builder vaultId(String vaultId) {
            return vaultId(Output.of(vaultId));
        }

        public BackupPolicyBlobStorageState build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs Empty = new BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs();

    /**
     * The type of data store. The only possible value is `VaultStore`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="dataStoreType", required=true)
    private Output<String> dataStoreType;

    /**
     * @return The type of data store. The only possible value is `VaultStore`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> dataStoreType() {
        return this.dataStoreType;
    }

    /**
     * The retention duration up to which the backups are to be retained in the data stores. It should follow `ISO 8601` duration format. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return The retention duration up to which the backups are to be retained in the data stores. It should follow `ISO 8601` duration format. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    private BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs() {}

    private BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs(BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs $) {
        this.dataStoreType = $.dataStoreType;
        this.duration = $.duration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs $;

        public Builder() {
            $ = new BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs();
        }

        public Builder(BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs defaults) {
            $ = new BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataStoreType The type of data store. The only possible value is `VaultStore`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataStoreType(Output<String> dataStoreType) {
            $.dataStoreType = dataStoreType;
            return this;
        }

        /**
         * @param dataStoreType The type of data store. The only possible value is `VaultStore`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataStoreType(String dataStoreType) {
            return dataStoreType(Output.of(dataStoreType));
        }

        /**
         * @param duration The retention duration up to which the backups are to be retained in the data stores. It should follow `ISO 8601` duration format. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The retention duration up to which the backups are to be retained in the data stores. It should follow `ISO 8601` duration format. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        public BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs build() {
            if ($.dataStoreType == null) {
                throw new MissingRequiredPropertyException("BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs", "dataStoreType");
            }
            if ($.duration == null) {
                throw new MissingRequiredPropertyException("BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs", "duration");
            }
            return $;
        }
    }

}

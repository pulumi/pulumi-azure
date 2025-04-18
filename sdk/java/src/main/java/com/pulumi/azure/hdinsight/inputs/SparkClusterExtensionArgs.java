// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SparkClusterExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkClusterExtensionArgs Empty = new SparkClusterExtensionArgs();

    /**
     * The workspace ID of the log analytics extension.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The workspace ID of the log analytics extension.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * The workspace key of the log analytics extension.
     * 
     */
    @Import(name="primaryKey", required=true)
    private Output<String> primaryKey;

    /**
     * @return The workspace key of the log analytics extension.
     * 
     */
    public Output<String> primaryKey() {
        return this.primaryKey;
    }

    private SparkClusterExtensionArgs() {}

    private SparkClusterExtensionArgs(SparkClusterExtensionArgs $) {
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.primaryKey = $.primaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkClusterExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkClusterExtensionArgs $;

        public Builder() {
            $ = new SparkClusterExtensionArgs();
        }

        public Builder(SparkClusterExtensionArgs defaults) {
            $ = new SparkClusterExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logAnalyticsWorkspaceId The workspace ID of the log analytics extension.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The workspace ID of the log analytics extension.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param primaryKey The workspace key of the log analytics extension.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(Output<String> primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        /**
         * @param primaryKey The workspace key of the log analytics extension.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(String primaryKey) {
            return primaryKey(Output.of(primaryKey));
        }

        public SparkClusterExtensionArgs build() {
            if ($.logAnalyticsWorkspaceId == null) {
                throw new MissingRequiredPropertyException("SparkClusterExtensionArgs", "logAnalyticsWorkspaceId");
            }
            if ($.primaryKey == null) {
                throw new MissingRequiredPropertyException("SparkClusterExtensionArgs", "primaryKey");
            }
            return $;
        }
    }

}

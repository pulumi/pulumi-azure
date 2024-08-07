// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataConnectorAwsCloudTrailState extends com.pulumi.resources.ResourceArgs {

    public static final DataConnectorAwsCloudTrailState Empty = new DataConnectorAwsCloudTrailState();

    /**
     * The ARN of the AWS CloudTrail role, which is connected to this AWS CloudTrail Data Connector.
     * 
     */
    @Import(name="awsRoleArn")
    private @Nullable Output<String> awsRoleArn;

    /**
     * @return The ARN of the AWS CloudTrail role, which is connected to this AWS CloudTrail Data Connector.
     * 
     */
    public Optional<Output<String>> awsRoleArn() {
        return Optional.ofNullable(this.awsRoleArn);
    }

    /**
     * The ID of the Log Analytics Workspace that this AWS CloudTrail Data Connector resides in. Changing this forces a new AWS CloudTrail Data Connector to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId")
    private @Nullable Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this AWS CloudTrail Data Connector resides in. Changing this forces a new AWS CloudTrail Data Connector to be created.
     * 
     */
    public Optional<Output<String>> logAnalyticsWorkspaceId() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceId);
    }

    /**
     * The name which should be used for this AWS CloudTrail Data Connector. Changing this forces a new AWS CloudTrail Data Connector to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this AWS CloudTrail Data Connector. Changing this forces a new AWS CloudTrail Data Connector to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DataConnectorAwsCloudTrailState() {}

    private DataConnectorAwsCloudTrailState(DataConnectorAwsCloudTrailState $) {
        this.awsRoleArn = $.awsRoleArn;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataConnectorAwsCloudTrailState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataConnectorAwsCloudTrailState $;

        public Builder() {
            $ = new DataConnectorAwsCloudTrailState();
        }

        public Builder(DataConnectorAwsCloudTrailState defaults) {
            $ = new DataConnectorAwsCloudTrailState(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsRoleArn The ARN of the AWS CloudTrail role, which is connected to this AWS CloudTrail Data Connector.
         * 
         * @return builder
         * 
         */
        public Builder awsRoleArn(@Nullable Output<String> awsRoleArn) {
            $.awsRoleArn = awsRoleArn;
            return this;
        }

        /**
         * @param awsRoleArn The ARN of the AWS CloudTrail role, which is connected to this AWS CloudTrail Data Connector.
         * 
         * @return builder
         * 
         */
        public Builder awsRoleArn(String awsRoleArn) {
            return awsRoleArn(Output.of(awsRoleArn));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace that this AWS CloudTrail Data Connector resides in. Changing this forces a new AWS CloudTrail Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(@Nullable Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace that this AWS CloudTrail Data Connector resides in. Changing this forces a new AWS CloudTrail Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param name The name which should be used for this AWS CloudTrail Data Connector. Changing this forces a new AWS CloudTrail Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this AWS CloudTrail Data Connector. Changing this forces a new AWS CloudTrail Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DataConnectorAwsCloudTrailState build() {
            return $;
        }
    }

}

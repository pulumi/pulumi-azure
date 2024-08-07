// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataConnectorAwsS3State extends com.pulumi.resources.ResourceArgs {

    public static final DataConnectorAwsS3State Empty = new DataConnectorAwsS3State();

    /**
     * The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
     * 
     */
    @Import(name="awsRoleArn")
    private @Nullable Output<String> awsRoleArn;

    /**
     * @return The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
     * 
     */
    public Optional<Output<String>> awsRoleArn() {
        return Optional.ofNullable(this.awsRoleArn);
    }

    /**
     * The name of the Log Analytics table that will store the ingested data.
     * 
     */
    @Import(name="destinationTable")
    private @Nullable Output<String> destinationTable;

    /**
     * @return The name of the Log Analytics table that will store the ingested data.
     * 
     */
    public Optional<Output<String>> destinationTable() {
        return Optional.ofNullable(this.destinationTable);
    }

    /**
     * The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId")
    private @Nullable Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    public Optional<Output<String>> logAnalyticsWorkspaceId() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceId);
    }

    /**
     * The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
     * 
     */
    @Import(name="sqsUrls")
    private @Nullable Output<List<String>> sqsUrls;

    /**
     * @return Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
     * 
     */
    public Optional<Output<List<String>>> sqsUrls() {
        return Optional.ofNullable(this.sqsUrls);
    }

    private DataConnectorAwsS3State() {}

    private DataConnectorAwsS3State(DataConnectorAwsS3State $) {
        this.awsRoleArn = $.awsRoleArn;
        this.destinationTable = $.destinationTable;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.name = $.name;
        this.sqsUrls = $.sqsUrls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataConnectorAwsS3State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataConnectorAwsS3State $;

        public Builder() {
            $ = new DataConnectorAwsS3State();
        }

        public Builder(DataConnectorAwsS3State defaults) {
            $ = new DataConnectorAwsS3State(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsRoleArn The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
         * 
         * @return builder
         * 
         */
        public Builder awsRoleArn(@Nullable Output<String> awsRoleArn) {
            $.awsRoleArn = awsRoleArn;
            return this;
        }

        /**
         * @param awsRoleArn The ARN of the AWS role, which is connected to this AWS CloudTrail Data Connector. See the [Azure document](https://docs.microsoft.com/azure/sentinel/connect-aws?tabs=s3#create-an-aws-assumed-role-and-grant-access-to-the-aws-sentinel-account) for details.
         * 
         * @return builder
         * 
         */
        public Builder awsRoleArn(String awsRoleArn) {
            return awsRoleArn(Output.of(awsRoleArn));
        }

        /**
         * @param destinationTable The name of the Log Analytics table that will store the ingested data.
         * 
         * @return builder
         * 
         */
        public Builder destinationTable(@Nullable Output<String> destinationTable) {
            $.destinationTable = destinationTable;
            return this;
        }

        /**
         * @param destinationTable The name of the Log Analytics table that will store the ingested data.
         * 
         * @return builder
         * 
         */
        public Builder destinationTable(String destinationTable) {
            return destinationTable(Output.of(destinationTable));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(@Nullable Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace that this AWS S3 Data Connector resides in. Changing this forces a new AWS S3 Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param name The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this AWS S3 Data Connector. Changing this forces a new AWS S3 Data Connector to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sqsUrls Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
         * 
         * @return builder
         * 
         */
        public Builder sqsUrls(@Nullable Output<List<String>> sqsUrls) {
            $.sqsUrls = sqsUrls;
            return this;
        }

        /**
         * @param sqsUrls Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
         * 
         * @return builder
         * 
         */
        public Builder sqsUrls(List<String> sqsUrls) {
            return sqsUrls(Output.of(sqsUrls));
        }

        /**
         * @param sqsUrls Specifies a list of AWS SQS urls for the AWS S3 Data Connector.
         * 
         * @return builder
         * 
         */
        public Builder sqsUrls(String... sqsUrls) {
            return sqsUrls(List.of(sqsUrls));
        }

        public DataConnectorAwsS3State build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTargetGroupJobTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTargetGroupJobTargetArgs Empty = new JobTargetGroupJobTargetArgs();

    /**
     * The name of the MS SQL Database.
     * 
     * &gt; **Note:** This cannot be set in combination with `elastic_pool_name`.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return The name of the MS SQL Database.
     * 
     * &gt; **Note:** This cannot be set in combination with `elastic_pool_name`.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * The name of the MS SQL Elastic Pool.
     * 
     * &gt; **Note:** This cannot be set in combination with `database_name`.
     * 
     */
    @Import(name="elasticPoolName")
    private @Nullable Output<String> elasticPoolName;

    /**
     * @return The name of the MS SQL Elastic Pool.
     * 
     * &gt; **Note:** This cannot be set in combination with `database_name`.
     * 
     */
    public Optional<Output<String>> elasticPoolName() {
        return Optional.ofNullable(this.elasticPoolName);
    }

    /**
     * The ID of the job credential to use during execution of jobs.
     * 
     * &gt; **Note:** This is required when `membership_type` is `Include`, unless `database_name` is set.
     * 
     */
    @Import(name="jobCredentialId")
    private @Nullable Output<String> jobCredentialId;

    /**
     * @return The ID of the job credential to use during execution of jobs.
     * 
     * &gt; **Note:** This is required when `membership_type` is `Include`, unless `database_name` is set.
     * 
     */
    public Optional<Output<String>> jobCredentialId() {
        return Optional.ofNullable(this.jobCredentialId);
    }

    /**
     * The membership type for this job target. Possible values are `Include` and `Exclude`. Defaults to `Include`.
     * 
     */
    @Import(name="membershipType")
    private @Nullable Output<String> membershipType;

    /**
     * @return The membership type for this job target. Possible values are `Include` and `Exclude`. Defaults to `Include`.
     * 
     */
    public Optional<Output<String>> membershipType() {
        return Optional.ofNullable(this.membershipType);
    }

    /**
     * The name of the MS SQL Server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the MS SQL Server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The job target type. This value is computed based on `server_name`, `database_name`, and `elastic_pool_name`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The job target type. This value is computed based on `server_name`, `database_name`, and `elastic_pool_name`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private JobTargetGroupJobTargetArgs() {}

    private JobTargetGroupJobTargetArgs(JobTargetGroupJobTargetArgs $) {
        this.databaseName = $.databaseName;
        this.elasticPoolName = $.elasticPoolName;
        this.jobCredentialId = $.jobCredentialId;
        this.membershipType = $.membershipType;
        this.serverName = $.serverName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTargetGroupJobTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTargetGroupJobTargetArgs $;

        public Builder() {
            $ = new JobTargetGroupJobTargetArgs();
        }

        public Builder(JobTargetGroupJobTargetArgs defaults) {
            $ = new JobTargetGroupJobTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the MS SQL Database.
         * 
         * &gt; **Note:** This cannot be set in combination with `elastic_pool_name`.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the MS SQL Database.
         * 
         * &gt; **Note:** This cannot be set in combination with `elastic_pool_name`.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param elasticPoolName The name of the MS SQL Elastic Pool.
         * 
         * &gt; **Note:** This cannot be set in combination with `database_name`.
         * 
         * @return builder
         * 
         */
        public Builder elasticPoolName(@Nullable Output<String> elasticPoolName) {
            $.elasticPoolName = elasticPoolName;
            return this;
        }

        /**
         * @param elasticPoolName The name of the MS SQL Elastic Pool.
         * 
         * &gt; **Note:** This cannot be set in combination with `database_name`.
         * 
         * @return builder
         * 
         */
        public Builder elasticPoolName(String elasticPoolName) {
            return elasticPoolName(Output.of(elasticPoolName));
        }

        /**
         * @param jobCredentialId The ID of the job credential to use during execution of jobs.
         * 
         * &gt; **Note:** This is required when `membership_type` is `Include`, unless `database_name` is set.
         * 
         * @return builder
         * 
         */
        public Builder jobCredentialId(@Nullable Output<String> jobCredentialId) {
            $.jobCredentialId = jobCredentialId;
            return this;
        }

        /**
         * @param jobCredentialId The ID of the job credential to use during execution of jobs.
         * 
         * &gt; **Note:** This is required when `membership_type` is `Include`, unless `database_name` is set.
         * 
         * @return builder
         * 
         */
        public Builder jobCredentialId(String jobCredentialId) {
            return jobCredentialId(Output.of(jobCredentialId));
        }

        /**
         * @param membershipType The membership type for this job target. Possible values are `Include` and `Exclude`. Defaults to `Include`.
         * 
         * @return builder
         * 
         */
        public Builder membershipType(@Nullable Output<String> membershipType) {
            $.membershipType = membershipType;
            return this;
        }

        /**
         * @param membershipType The membership type for this job target. Possible values are `Include` and `Exclude`. Defaults to `Include`.
         * 
         * @return builder
         * 
         */
        public Builder membershipType(String membershipType) {
            return membershipType(Output.of(membershipType));
        }

        /**
         * @param serverName The name of the MS SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the MS SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param type The job target type. This value is computed based on `server_name`, `database_name`, and `elastic_pool_name`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The job target type. This value is computed based on `server_name`, `database_name`, and `elastic_pool_name`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public JobTargetGroupJobTargetArgs build() {
            if ($.serverName == null) {
                throw new MissingRequiredPropertyException("JobTargetGroupJobTargetArgs", "serverName");
            }
            return $;
        }
    }

}

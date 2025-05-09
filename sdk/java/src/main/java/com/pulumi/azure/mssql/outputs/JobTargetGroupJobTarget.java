// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTargetGroupJobTarget {
    /**
     * @return The name of the MS SQL Database.
     * 
     * &gt; **Note:** This cannot be set in combination with `elastic_pool_name`.
     * 
     */
    private @Nullable String databaseName;
    /**
     * @return The name of the MS SQL Elastic Pool.
     * 
     * &gt; **Note:** This cannot be set in combination with `database_name`.
     * 
     */
    private @Nullable String elasticPoolName;
    /**
     * @return The ID of the job credential to use during execution of jobs.
     * 
     * &gt; **Note:** This is required when `membership_type` is `Include`, unless `database_name` is set.
     * 
     */
    private @Nullable String jobCredentialId;
    /**
     * @return The membership type for this job target. Possible values are `Include` and `Exclude`. Defaults to `Include`.
     * 
     */
    private @Nullable String membershipType;
    /**
     * @return The name of the MS SQL Server.
     * 
     */
    private String serverName;
    /**
     * @return The job target type. This value is computed based on `server_name`, `database_name`, and `elastic_pool_name`.
     * 
     */
    private @Nullable String type;

    private JobTargetGroupJobTarget() {}
    /**
     * @return The name of the MS SQL Database.
     * 
     * &gt; **Note:** This cannot be set in combination with `elastic_pool_name`.
     * 
     */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * @return The name of the MS SQL Elastic Pool.
     * 
     * &gt; **Note:** This cannot be set in combination with `database_name`.
     * 
     */
    public Optional<String> elasticPoolName() {
        return Optional.ofNullable(this.elasticPoolName);
    }
    /**
     * @return The ID of the job credential to use during execution of jobs.
     * 
     * &gt; **Note:** This is required when `membership_type` is `Include`, unless `database_name` is set.
     * 
     */
    public Optional<String> jobCredentialId() {
        return Optional.ofNullable(this.jobCredentialId);
    }
    /**
     * @return The membership type for this job target. Possible values are `Include` and `Exclude`. Defaults to `Include`.
     * 
     */
    public Optional<String> membershipType() {
        return Optional.ofNullable(this.membershipType);
    }
    /**
     * @return The name of the MS SQL Server.
     * 
     */
    public String serverName() {
        return this.serverName;
    }
    /**
     * @return The job target type. This value is computed based on `server_name`, `database_name`, and `elastic_pool_name`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTargetGroupJobTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String elasticPoolName;
        private @Nullable String jobCredentialId;
        private @Nullable String membershipType;
        private String serverName;
        private @Nullable String type;
        public Builder() {}
        public Builder(JobTargetGroupJobTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.elasticPoolName = defaults.elasticPoolName;
    	      this.jobCredentialId = defaults.jobCredentialId;
    	      this.membershipType = defaults.membershipType;
    	      this.serverName = defaults.serverName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder databaseName(@Nullable String databaseName) {

            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder elasticPoolName(@Nullable String elasticPoolName) {

            this.elasticPoolName = elasticPoolName;
            return this;
        }
        @CustomType.Setter
        public Builder jobCredentialId(@Nullable String jobCredentialId) {

            this.jobCredentialId = jobCredentialId;
            return this;
        }
        @CustomType.Setter
        public Builder membershipType(@Nullable String membershipType) {

            this.membershipType = membershipType;
            return this;
        }
        @CustomType.Setter
        public Builder serverName(String serverName) {
            if (serverName == null) {
              throw new MissingRequiredPropertyException("JobTargetGroupJobTarget", "serverName");
            }
            this.serverName = serverName;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public JobTargetGroupJobTarget build() {
            final var _resultValue = new JobTargetGroupJobTarget();
            _resultValue.databaseName = databaseName;
            _resultValue.elasticPoolName = elasticPoolName;
            _resultValue.jobCredentialId = jobCredentialId;
            _resultValue.membershipType = membershipType;
            _resultValue.serverName = serverName;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

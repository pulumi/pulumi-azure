// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.azure.containerapp.outputs.JobEventTriggerConfigScaleRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobEventTriggerConfigScale {
    /**
     * @return Maximum number of job executions that are created for a trigger.
     * 
     */
    private @Nullable Integer maxExecutions;
    /**
     * @return Minimum number of job executions that are created for a trigger.
     * 
     */
    private @Nullable Integer minExecutions;
    /**
     * @return Interval to check each event source in seconds.
     * 
     */
    private @Nullable Integer pollingIntervalInSeconds;
    /**
     * @return A `rules` block as defined below.
     * 
     */
    private @Nullable List<JobEventTriggerConfigScaleRule> rules;

    private JobEventTriggerConfigScale() {}
    /**
     * @return Maximum number of job executions that are created for a trigger.
     * 
     */
    public Optional<Integer> maxExecutions() {
        return Optional.ofNullable(this.maxExecutions);
    }
    /**
     * @return Minimum number of job executions that are created for a trigger.
     * 
     */
    public Optional<Integer> minExecutions() {
        return Optional.ofNullable(this.minExecutions);
    }
    /**
     * @return Interval to check each event source in seconds.
     * 
     */
    public Optional<Integer> pollingIntervalInSeconds() {
        return Optional.ofNullable(this.pollingIntervalInSeconds);
    }
    /**
     * @return A `rules` block as defined below.
     * 
     */
    public List<JobEventTriggerConfigScaleRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobEventTriggerConfigScale defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxExecutions;
        private @Nullable Integer minExecutions;
        private @Nullable Integer pollingIntervalInSeconds;
        private @Nullable List<JobEventTriggerConfigScaleRule> rules;
        public Builder() {}
        public Builder(JobEventTriggerConfigScale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxExecutions = defaults.maxExecutions;
    	      this.minExecutions = defaults.minExecutions;
    	      this.pollingIntervalInSeconds = defaults.pollingIntervalInSeconds;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder maxExecutions(@Nullable Integer maxExecutions) {

            this.maxExecutions = maxExecutions;
            return this;
        }
        @CustomType.Setter
        public Builder minExecutions(@Nullable Integer minExecutions) {

            this.minExecutions = minExecutions;
            return this;
        }
        @CustomType.Setter
        public Builder pollingIntervalInSeconds(@Nullable Integer pollingIntervalInSeconds) {

            this.pollingIntervalInSeconds = pollingIntervalInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<JobEventTriggerConfigScaleRule> rules) {

            this.rules = rules;
            return this;
        }
        public Builder rules(JobEventTriggerConfigScaleRule... rules) {
            return rules(List.of(rules));
        }
        public JobEventTriggerConfigScale build() {
            final var _resultValue = new JobEventTriggerConfigScale();
            _resultValue.maxExecutions = maxExecutions;
            _resultValue.minExecutions = minExecutions;
            _resultValue.pollingIntervalInSeconds = pollingIntervalInSeconds;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}

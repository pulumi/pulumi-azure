// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SparkClusterRolesWorkerNodeAutoscaleRecurrenceSchedule {
    /**
     * @return The days of the week to perform autoscale.
     * 
     */
    private List<String> days;
    /**
     * @return The number of worker nodes to autoscale at the specified time.
     * 
     */
    private Integer targetInstanceCount;
    /**
     * @return The time of day to perform the autoscale in 24hour format.
     * 
     */
    private String time;

    private SparkClusterRolesWorkerNodeAutoscaleRecurrenceSchedule() {}
    /**
     * @return The days of the week to perform autoscale.
     * 
     */
    public List<String> days() {
        return this.days;
    }
    /**
     * @return The number of worker nodes to autoscale at the specified time.
     * 
     */
    public Integer targetInstanceCount() {
        return this.targetInstanceCount;
    }
    /**
     * @return The time of day to perform the autoscale in 24hour format.
     * 
     */
    public String time() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkClusterRolesWorkerNodeAutoscaleRecurrenceSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> days;
        private Integer targetInstanceCount;
        private String time;
        public Builder() {}
        public Builder(SparkClusterRolesWorkerNodeAutoscaleRecurrenceSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.targetInstanceCount = defaults.targetInstanceCount;
    	      this.time = defaults.time;
        }

        @CustomType.Setter
        public Builder days(List<String> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder days(String... days) {
            return days(List.of(days));
        }
        @CustomType.Setter
        public Builder targetInstanceCount(Integer targetInstanceCount) {
            this.targetInstanceCount = Objects.requireNonNull(targetInstanceCount);
            return this;
        }
        @CustomType.Setter
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public SparkClusterRolesWorkerNodeAutoscaleRecurrenceSchedule build() {
            final var o = new SparkClusterRolesWorkerNodeAutoscaleRecurrenceSchedule();
            o.days = days;
            o.targetInstanceCount = targetInstanceCount;
            o.time = time;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSnapshotPolicyDailySchedule {
    /**
     * @return Hour of the day that the snapshots will be created.
     * 
     */
    private Integer hour;
    /**
     * @return Minute of the hour that the snapshots will be created.
     * 
     */
    private Integer minute;
    /**
     * @return How many hourly snapshots to keep.
     * 
     */
    private Integer snapshotsToKeep;

    private GetSnapshotPolicyDailySchedule() {}
    /**
     * @return Hour of the day that the snapshots will be created.
     * 
     */
    public Integer hour() {
        return this.hour;
    }
    /**
     * @return Minute of the hour that the snapshots will be created.
     * 
     */
    public Integer minute() {
        return this.minute;
    }
    /**
     * @return How many hourly snapshots to keep.
     * 
     */
    public Integer snapshotsToKeep() {
        return this.snapshotsToKeep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotPolicyDailySchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer hour;
        private Integer minute;
        private Integer snapshotsToKeep;
        public Builder() {}
        public Builder(GetSnapshotPolicyDailySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hour = defaults.hour;
    	      this.minute = defaults.minute;
    	      this.snapshotsToKeep = defaults.snapshotsToKeep;
        }

        @CustomType.Setter
        public Builder hour(Integer hour) {
            this.hour = Objects.requireNonNull(hour);
            return this;
        }
        @CustomType.Setter
        public Builder minute(Integer minute) {
            this.minute = Objects.requireNonNull(minute);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotsToKeep(Integer snapshotsToKeep) {
            this.snapshotsToKeep = Objects.requireNonNull(snapshotsToKeep);
            return this;
        }
        public GetSnapshotPolicyDailySchedule build() {
            final var o = new GetSnapshotPolicyDailySchedule();
            o.hour = hour;
            o.minute = minute;
            o.snapshotsToKeep = snapshotsToKeep;
            return o;
        }
    }
}
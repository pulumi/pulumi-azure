// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SnapshotPolicyWeeklyScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotPolicyWeeklyScheduleArgs Empty = new SnapshotPolicyWeeklyScheduleArgs();

    /**
     * List of the week days using English names when the snapshots will be created.
     * 
     */
    @Import(name="daysOfWeeks", required=true)
    private Output<List<String>> daysOfWeeks;

    /**
     * @return List of the week days using English names when the snapshots will be created.
     * 
     */
    public Output<List<String>> daysOfWeeks() {
        return this.daysOfWeeks;
    }

    /**
     * Hour of the day that the snapshots will be created, valid range is from 0 to 23.
     * 
     */
    @Import(name="hour", required=true)
    private Output<Integer> hour;

    /**
     * @return Hour of the day that the snapshots will be created, valid range is from 0 to 23.
     * 
     */
    public Output<Integer> hour() {
        return this.hour;
    }

    /**
     * Minute of the hour that the snapshots will be created, valid range is from 0 to 59.
     * 
     */
    @Import(name="minute", required=true)
    private Output<Integer> minute;

    /**
     * @return Minute of the hour that the snapshots will be created, valid range is from 0 to 59.
     * 
     */
    public Output<Integer> minute() {
        return this.minute;
    }

    /**
     * How many hourly snapshots to keep, valid range is from 0 to 255.
     * 
     */
    @Import(name="snapshotsToKeep", required=true)
    private Output<Integer> snapshotsToKeep;

    /**
     * @return How many hourly snapshots to keep, valid range is from 0 to 255.
     * 
     */
    public Output<Integer> snapshotsToKeep() {
        return this.snapshotsToKeep;
    }

    private SnapshotPolicyWeeklyScheduleArgs() {}

    private SnapshotPolicyWeeklyScheduleArgs(SnapshotPolicyWeeklyScheduleArgs $) {
        this.daysOfWeeks = $.daysOfWeeks;
        this.hour = $.hour;
        this.minute = $.minute;
        this.snapshotsToKeep = $.snapshotsToKeep;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotPolicyWeeklyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotPolicyWeeklyScheduleArgs $;

        public Builder() {
            $ = new SnapshotPolicyWeeklyScheduleArgs();
        }

        public Builder(SnapshotPolicyWeeklyScheduleArgs defaults) {
            $ = new SnapshotPolicyWeeklyScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysOfWeeks List of the week days using English names when the snapshots will be created.
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(Output<List<String>> daysOfWeeks) {
            $.daysOfWeeks = daysOfWeeks;
            return this;
        }

        /**
         * @param daysOfWeeks List of the week days using English names when the snapshots will be created.
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(List<String> daysOfWeeks) {
            return daysOfWeeks(Output.of(daysOfWeeks));
        }

        /**
         * @param daysOfWeeks List of the week days using English names when the snapshots will be created.
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(String... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }

        /**
         * @param hour Hour of the day that the snapshots will be created, valid range is from 0 to 23.
         * 
         * @return builder
         * 
         */
        public Builder hour(Output<Integer> hour) {
            $.hour = hour;
            return this;
        }

        /**
         * @param hour Hour of the day that the snapshots will be created, valid range is from 0 to 23.
         * 
         * @return builder
         * 
         */
        public Builder hour(Integer hour) {
            return hour(Output.of(hour));
        }

        /**
         * @param minute Minute of the hour that the snapshots will be created, valid range is from 0 to 59.
         * 
         * @return builder
         * 
         */
        public Builder minute(Output<Integer> minute) {
            $.minute = minute;
            return this;
        }

        /**
         * @param minute Minute of the hour that the snapshots will be created, valid range is from 0 to 59.
         * 
         * @return builder
         * 
         */
        public Builder minute(Integer minute) {
            return minute(Output.of(minute));
        }

        /**
         * @param snapshotsToKeep How many hourly snapshots to keep, valid range is from 0 to 255.
         * 
         * @return builder
         * 
         */
        public Builder snapshotsToKeep(Output<Integer> snapshotsToKeep) {
            $.snapshotsToKeep = snapshotsToKeep;
            return this;
        }

        /**
         * @param snapshotsToKeep How many hourly snapshots to keep, valid range is from 0 to 255.
         * 
         * @return builder
         * 
         */
        public Builder snapshotsToKeep(Integer snapshotsToKeep) {
            return snapshotsToKeep(Output.of(snapshotsToKeep));
        }

        public SnapshotPolicyWeeklyScheduleArgs build() {
            if ($.daysOfWeeks == null) {
                throw new MissingRequiredPropertyException("SnapshotPolicyWeeklyScheduleArgs", "daysOfWeeks");
            }
            if ($.hour == null) {
                throw new MissingRequiredPropertyException("SnapshotPolicyWeeklyScheduleArgs", "hour");
            }
            if ($.minute == null) {
                throw new MissingRequiredPropertyException("SnapshotPolicyWeeklyScheduleArgs", "minute");
            }
            if ($.snapshotsToKeep == null) {
                throw new MissingRequiredPropertyException("SnapshotPolicyWeeklyScheduleArgs", "snapshotsToKeep");
            }
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerRecurrenceScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerRecurrenceScheduleArgs Empty = new TriggerRecurrenceScheduleArgs();

    /**
     * Specifies a list of hours when the trigger should run. Valid values are between 0 and 23.
     * 
     */
    @Import(name="atTheseHours")
    private @Nullable Output<List<Integer>> atTheseHours;

    /**
     * @return Specifies a list of hours when the trigger should run. Valid values are between 0 and 23.
     * 
     */
    public Optional<Output<List<Integer>>> atTheseHours() {
        return Optional.ofNullable(this.atTheseHours);
    }

    /**
     * Specifies a list of minutes when the trigger should run. Valid values are between 0 and 59.
     * 
     */
    @Import(name="atTheseMinutes")
    private @Nullable Output<List<Integer>> atTheseMinutes;

    /**
     * @return Specifies a list of minutes when the trigger should run. Valid values are between 0 and 59.
     * 
     */
    public Optional<Output<List<Integer>>> atTheseMinutes() {
        return Optional.ofNullable(this.atTheseMinutes);
    }

    /**
     * Specifies a list of days when the trigger should run. Valid values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`.
     * 
     */
    @Import(name="onTheseDays")
    private @Nullable Output<List<String>> onTheseDays;

    /**
     * @return Specifies a list of days when the trigger should run. Valid values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`.
     * 
     */
    public Optional<Output<List<String>>> onTheseDays() {
        return Optional.ofNullable(this.onTheseDays);
    }

    private TriggerRecurrenceScheduleArgs() {}

    private TriggerRecurrenceScheduleArgs(TriggerRecurrenceScheduleArgs $) {
        this.atTheseHours = $.atTheseHours;
        this.atTheseMinutes = $.atTheseMinutes;
        this.onTheseDays = $.onTheseDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerRecurrenceScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerRecurrenceScheduleArgs $;

        public Builder() {
            $ = new TriggerRecurrenceScheduleArgs();
        }

        public Builder(TriggerRecurrenceScheduleArgs defaults) {
            $ = new TriggerRecurrenceScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param atTheseHours Specifies a list of hours when the trigger should run. Valid values are between 0 and 23.
         * 
         * @return builder
         * 
         */
        public Builder atTheseHours(@Nullable Output<List<Integer>> atTheseHours) {
            $.atTheseHours = atTheseHours;
            return this;
        }

        /**
         * @param atTheseHours Specifies a list of hours when the trigger should run. Valid values are between 0 and 23.
         * 
         * @return builder
         * 
         */
        public Builder atTheseHours(List<Integer> atTheseHours) {
            return atTheseHours(Output.of(atTheseHours));
        }

        /**
         * @param atTheseHours Specifies a list of hours when the trigger should run. Valid values are between 0 and 23.
         * 
         * @return builder
         * 
         */
        public Builder atTheseHours(Integer... atTheseHours) {
            return atTheseHours(List.of(atTheseHours));
        }

        /**
         * @param atTheseMinutes Specifies a list of minutes when the trigger should run. Valid values are between 0 and 59.
         * 
         * @return builder
         * 
         */
        public Builder atTheseMinutes(@Nullable Output<List<Integer>> atTheseMinutes) {
            $.atTheseMinutes = atTheseMinutes;
            return this;
        }

        /**
         * @param atTheseMinutes Specifies a list of minutes when the trigger should run. Valid values are between 0 and 59.
         * 
         * @return builder
         * 
         */
        public Builder atTheseMinutes(List<Integer> atTheseMinutes) {
            return atTheseMinutes(Output.of(atTheseMinutes));
        }

        /**
         * @param atTheseMinutes Specifies a list of minutes when the trigger should run. Valid values are between 0 and 59.
         * 
         * @return builder
         * 
         */
        public Builder atTheseMinutes(Integer... atTheseMinutes) {
            return atTheseMinutes(List.of(atTheseMinutes));
        }

        /**
         * @param onTheseDays Specifies a list of days when the trigger should run. Valid values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`.
         * 
         * @return builder
         * 
         */
        public Builder onTheseDays(@Nullable Output<List<String>> onTheseDays) {
            $.onTheseDays = onTheseDays;
            return this;
        }

        /**
         * @param onTheseDays Specifies a list of days when the trigger should run. Valid values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`.
         * 
         * @return builder
         * 
         */
        public Builder onTheseDays(List<String> onTheseDays) {
            return onTheseDays(Output.of(onTheseDays));
        }

        /**
         * @param onTheseDays Specifies a list of days when the trigger should run. Valid values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`.
         * 
         * @return builder
         * 
         */
        public Builder onTheseDays(String... onTheseDays) {
            return onTheseDays(List.of(onTheseDays));
        }

        public TriggerRecurrenceScheduleArgs build() {
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.azure.datafactory.inputs.TriggerScheduleScheduleMonthlyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerScheduleScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerScheduleScheduleArgs Empty = new TriggerScheduleScheduleArgs();

    /**
     * Day(s) of the month on which the trigger is scheduled. This value can be specified with a monthly frequency only.
     * 
     */
    @Import(name="daysOfMonths")
    private @Nullable Output<List<Integer>> daysOfMonths;

    /**
     * @return Day(s) of the month on which the trigger is scheduled. This value can be specified with a monthly frequency only.
     * 
     */
    public Optional<Output<List<Integer>>> daysOfMonths() {
        return Optional.ofNullable(this.daysOfMonths);
    }

    /**
     * Days of the week on which the trigger is scheduled. This value can be specified only with a weekly frequency.
     * 
     */
    @Import(name="daysOfWeeks")
    private @Nullable Output<List<String>> daysOfWeeks;

    /**
     * @return Days of the week on which the trigger is scheduled. This value can be specified only with a weekly frequency.
     * 
     */
    public Optional<Output<List<String>>> daysOfWeeks() {
        return Optional.ofNullable(this.daysOfWeeks);
    }

    /**
     * Hours of the day on which the trigger is scheduled.
     * 
     */
    @Import(name="hours")
    private @Nullable Output<List<Integer>> hours;

    /**
     * @return Hours of the day on which the trigger is scheduled.
     * 
     */
    public Optional<Output<List<Integer>>> hours() {
        return Optional.ofNullable(this.hours);
    }

    /**
     * Minutes of the hour on which the trigger is scheduled.
     * 
     */
    @Import(name="minutes")
    private @Nullable Output<List<Integer>> minutes;

    /**
     * @return Minutes of the hour on which the trigger is scheduled.
     * 
     */
    public Optional<Output<List<Integer>>> minutes() {
        return Optional.ofNullable(this.minutes);
    }

    /**
     * A `monthly` block as documented below, which specifies the days of the month on which the trigger is scheduled. The value can be specified only with a monthly frequency.
     * 
     */
    @Import(name="monthlies")
    private @Nullable Output<List<TriggerScheduleScheduleMonthlyArgs>> monthlies;

    /**
     * @return A `monthly` block as documented below, which specifies the days of the month on which the trigger is scheduled. The value can be specified only with a monthly frequency.
     * 
     */
    public Optional<Output<List<TriggerScheduleScheduleMonthlyArgs>>> monthlies() {
        return Optional.ofNullable(this.monthlies);
    }

    private TriggerScheduleScheduleArgs() {}

    private TriggerScheduleScheduleArgs(TriggerScheduleScheduleArgs $) {
        this.daysOfMonths = $.daysOfMonths;
        this.daysOfWeeks = $.daysOfWeeks;
        this.hours = $.hours;
        this.minutes = $.minutes;
        this.monthlies = $.monthlies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerScheduleScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerScheduleScheduleArgs $;

        public Builder() {
            $ = new TriggerScheduleScheduleArgs();
        }

        public Builder(TriggerScheduleScheduleArgs defaults) {
            $ = new TriggerScheduleScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysOfMonths Day(s) of the month on which the trigger is scheduled. This value can be specified with a monthly frequency only.
         * 
         * @return builder
         * 
         */
        public Builder daysOfMonths(@Nullable Output<List<Integer>> daysOfMonths) {
            $.daysOfMonths = daysOfMonths;
            return this;
        }

        /**
         * @param daysOfMonths Day(s) of the month on which the trigger is scheduled. This value can be specified with a monthly frequency only.
         * 
         * @return builder
         * 
         */
        public Builder daysOfMonths(List<Integer> daysOfMonths) {
            return daysOfMonths(Output.of(daysOfMonths));
        }

        /**
         * @param daysOfMonths Day(s) of the month on which the trigger is scheduled. This value can be specified with a monthly frequency only.
         * 
         * @return builder
         * 
         */
        public Builder daysOfMonths(Integer... daysOfMonths) {
            return daysOfMonths(List.of(daysOfMonths));
        }

        /**
         * @param daysOfWeeks Days of the week on which the trigger is scheduled. This value can be specified only with a weekly frequency.
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(@Nullable Output<List<String>> daysOfWeeks) {
            $.daysOfWeeks = daysOfWeeks;
            return this;
        }

        /**
         * @param daysOfWeeks Days of the week on which the trigger is scheduled. This value can be specified only with a weekly frequency.
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(List<String> daysOfWeeks) {
            return daysOfWeeks(Output.of(daysOfWeeks));
        }

        /**
         * @param daysOfWeeks Days of the week on which the trigger is scheduled. This value can be specified only with a weekly frequency.
         * 
         * @return builder
         * 
         */
        public Builder daysOfWeeks(String... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }

        /**
         * @param hours Hours of the day on which the trigger is scheduled.
         * 
         * @return builder
         * 
         */
        public Builder hours(@Nullable Output<List<Integer>> hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param hours Hours of the day on which the trigger is scheduled.
         * 
         * @return builder
         * 
         */
        public Builder hours(List<Integer> hours) {
            return hours(Output.of(hours));
        }

        /**
         * @param hours Hours of the day on which the trigger is scheduled.
         * 
         * @return builder
         * 
         */
        public Builder hours(Integer... hours) {
            return hours(List.of(hours));
        }

        /**
         * @param minutes Minutes of the hour on which the trigger is scheduled.
         * 
         * @return builder
         * 
         */
        public Builder minutes(@Nullable Output<List<Integer>> minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param minutes Minutes of the hour on which the trigger is scheduled.
         * 
         * @return builder
         * 
         */
        public Builder minutes(List<Integer> minutes) {
            return minutes(Output.of(minutes));
        }

        /**
         * @param minutes Minutes of the hour on which the trigger is scheduled.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer... minutes) {
            return minutes(List.of(minutes));
        }

        /**
         * @param monthlies A `monthly` block as documented below, which specifies the days of the month on which the trigger is scheduled. The value can be specified only with a monthly frequency.
         * 
         * @return builder
         * 
         */
        public Builder monthlies(@Nullable Output<List<TriggerScheduleScheduleMonthlyArgs>> monthlies) {
            $.monthlies = monthlies;
            return this;
        }

        /**
         * @param monthlies A `monthly` block as documented below, which specifies the days of the month on which the trigger is scheduled. The value can be specified only with a monthly frequency.
         * 
         * @return builder
         * 
         */
        public Builder monthlies(List<TriggerScheduleScheduleMonthlyArgs> monthlies) {
            return monthlies(Output.of(monthlies));
        }

        /**
         * @param monthlies A `monthly` block as documented below, which specifies the days of the month on which the trigger is scheduled. The value can be specified only with a monthly frequency.
         * 
         * @return builder
         * 
         */
        public Builder monthlies(TriggerScheduleScheduleMonthlyArgs... monthlies) {
            return monthlies(List.of(monthlies));
        }

        public TriggerScheduleScheduleArgs build() {
            return $;
        }
    }

}
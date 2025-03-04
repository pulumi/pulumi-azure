// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerScheduleScheduleMonthlyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerScheduleScheduleMonthlyArgs Empty = new TriggerScheduleScheduleMonthlyArgs();

    /**
     * The occurrence of the specified day during the month. For example, a `monthly` property with `weekday` and `week` values of `Sunday, -1` means the last Sunday of the month.
     * 
     */
    @Import(name="week")
    private @Nullable Output<Integer> week;

    /**
     * @return The occurrence of the specified day during the month. For example, a `monthly` property with `weekday` and `week` values of `Sunday, -1` means the last Sunday of the month.
     * 
     */
    public Optional<Output<Integer>> week() {
        return Optional.ofNullable(this.week);
    }

    /**
     * The day of the week on which the trigger runs. For example, a `monthly` property with a `weekday` value of `Sunday` means every Sunday of the month.
     * 
     */
    @Import(name="weekday", required=true)
    private Output<String> weekday;

    /**
     * @return The day of the week on which the trigger runs. For example, a `monthly` property with a `weekday` value of `Sunday` means every Sunday of the month.
     * 
     */
    public Output<String> weekday() {
        return this.weekday;
    }

    private TriggerScheduleScheduleMonthlyArgs() {}

    private TriggerScheduleScheduleMonthlyArgs(TriggerScheduleScheduleMonthlyArgs $) {
        this.week = $.week;
        this.weekday = $.weekday;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerScheduleScheduleMonthlyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerScheduleScheduleMonthlyArgs $;

        public Builder() {
            $ = new TriggerScheduleScheduleMonthlyArgs();
        }

        public Builder(TriggerScheduleScheduleMonthlyArgs defaults) {
            $ = new TriggerScheduleScheduleMonthlyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param week The occurrence of the specified day during the month. For example, a `monthly` property with `weekday` and `week` values of `Sunday, -1` means the last Sunday of the month.
         * 
         * @return builder
         * 
         */
        public Builder week(@Nullable Output<Integer> week) {
            $.week = week;
            return this;
        }

        /**
         * @param week The occurrence of the specified day during the month. For example, a `monthly` property with `weekday` and `week` values of `Sunday, -1` means the last Sunday of the month.
         * 
         * @return builder
         * 
         */
        public Builder week(Integer week) {
            return week(Output.of(week));
        }

        /**
         * @param weekday The day of the week on which the trigger runs. For example, a `monthly` property with a `weekday` value of `Sunday` means every Sunday of the month.
         * 
         * @return builder
         * 
         */
        public Builder weekday(Output<String> weekday) {
            $.weekday = weekday;
            return this;
        }

        /**
         * @param weekday The day of the week on which the trigger runs. For example, a `monthly` property with a `weekday` value of `Sunday` means every Sunday of the month.
         * 
         * @return builder
         * 
         */
        public Builder weekday(String weekday) {
            return weekday(Output.of(weekday));
        }

        public TriggerScheduleScheduleMonthlyArgs build() {
            if ($.weekday == null) {
                throw new MissingRequiredPropertyException("TriggerScheduleScheduleMonthlyArgs", "weekday");
            }
            return $;
        }
    }

}

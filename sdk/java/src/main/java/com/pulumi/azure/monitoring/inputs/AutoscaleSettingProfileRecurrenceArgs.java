// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscaleSettingProfileRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscaleSettingProfileRecurrenceArgs Empty = new AutoscaleSettingProfileRecurrenceArgs();

    /**
     * A list of days that this profile takes effect on. Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
     * 
     */
    @Import(name="days", required=true)
    private Output<List<String>> days;

    /**
     * @return A list of days that this profile takes effect on. Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
     * 
     */
    public Output<List<String>> days() {
        return this.days;
    }

    /**
     * A list containing a single item, which specifies the Hour interval at which this recurrence should be triggered (in 24-hour time). Possible values are from `0` to `23`.
     * 
     */
    @Import(name="hours", required=true)
    private Output<Integer> hours;

    /**
     * @return A list containing a single item, which specifies the Hour interval at which this recurrence should be triggered (in 24-hour time). Possible values are from `0` to `23`.
     * 
     */
    public Output<Integer> hours() {
        return this.hours;
    }

    /**
     * A list containing a single item which specifies the Minute interval at which this recurrence should be triggered.
     * 
     */
    @Import(name="minutes", required=true)
    private Output<Integer> minutes;

    /**
     * @return A list containing a single item which specifies the Minute interval at which this recurrence should be triggered.
     * 
     */
    public Output<Integer> minutes() {
        return this.minutes;
    }

    /**
     * The Time Zone used for the `hours` field. A list of [possible values can be found here](https://msdn.microsoft.com/en-us/library/azure/dn931928.aspx). Defaults to `UTC`.
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return The Time Zone used for the `hours` field. A list of [possible values can be found here](https://msdn.microsoft.com/en-us/library/azure/dn931928.aspx). Defaults to `UTC`.
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    private AutoscaleSettingProfileRecurrenceArgs() {}

    private AutoscaleSettingProfileRecurrenceArgs(AutoscaleSettingProfileRecurrenceArgs $) {
        this.days = $.days;
        this.hours = $.hours;
        this.minutes = $.minutes;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscaleSettingProfileRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscaleSettingProfileRecurrenceArgs $;

        public Builder() {
            $ = new AutoscaleSettingProfileRecurrenceArgs();
        }

        public Builder(AutoscaleSettingProfileRecurrenceArgs defaults) {
            $ = new AutoscaleSettingProfileRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days A list of days that this profile takes effect on. Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
         * 
         * @return builder
         * 
         */
        public Builder days(Output<List<String>> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days A list of days that this profile takes effect on. Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
         * 
         * @return builder
         * 
         */
        public Builder days(List<String> days) {
            return days(Output.of(days));
        }

        /**
         * @param days A list of days that this profile takes effect on. Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
         * 
         * @return builder
         * 
         */
        public Builder days(String... days) {
            return days(List.of(days));
        }

        /**
         * @param hours A list containing a single item, which specifies the Hour interval at which this recurrence should be triggered (in 24-hour time). Possible values are from `0` to `23`.
         * 
         * @return builder
         * 
         */
        public Builder hours(Output<Integer> hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param hours A list containing a single item, which specifies the Hour interval at which this recurrence should be triggered (in 24-hour time). Possible values are from `0` to `23`.
         * 
         * @return builder
         * 
         */
        public Builder hours(Integer hours) {
            return hours(Output.of(hours));
        }

        /**
         * @param minutes A list containing a single item which specifies the Minute interval at which this recurrence should be triggered.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        /**
         * @param minutes A list containing a single item which specifies the Minute interval at which this recurrence should be triggered.
         * 
         * @return builder
         * 
         */
        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        /**
         * @param timezone The Time Zone used for the `hours` field. A list of [possible values can be found here](https://msdn.microsoft.com/en-us/library/azure/dn931928.aspx). Defaults to `UTC`.
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone The Time Zone used for the `hours` field. A list of [possible values can be found here](https://msdn.microsoft.com/en-us/library/azure/dn931928.aspx). Defaults to `UTC`.
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public AutoscaleSettingProfileRecurrenceArgs build() {
            $.days = Objects.requireNonNull($.days, "expected parameter 'days' to be non-null");
            $.hours = Objects.requireNonNull($.hours, "expected parameter 'hours' to be non-null");
            $.minutes = Objects.requireNonNull($.minutes, "expected parameter 'minutes' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.desktopvirtualization.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHostPoolScheduledAgentUpdateSchedule {
    /**
     * @return The day of the week on which agent updates should be performed.
     * 
     */
    private String dayOfWeek;
    /**
     * @return The hour of day the update window should start.
     * 
     */
    private Integer hourOfDay;

    private GetHostPoolScheduledAgentUpdateSchedule() {}
    /**
     * @return The day of the week on which agent updates should be performed.
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * @return The hour of day the update window should start.
     * 
     */
    public Integer hourOfDay() {
        return this.hourOfDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostPoolScheduledAgentUpdateSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dayOfWeek;
        private Integer hourOfDay;
        public Builder() {}
        public Builder(GetHostPoolScheduledAgentUpdateSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.hourOfDay = defaults.hourOfDay;
        }

        @CustomType.Setter
        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        @CustomType.Setter
        public Builder hourOfDay(Integer hourOfDay) {
            this.hourOfDay = Objects.requireNonNull(hourOfDay);
            return this;
        }
        public GetHostPoolScheduledAgentUpdateSchedule build() {
            final var o = new GetHostPoolScheduledAgentUpdateSchedule();
            o.dayOfWeek = dayOfWeek;
            o.hourOfDay = hourOfDay;
            return o;
        }
    }
}
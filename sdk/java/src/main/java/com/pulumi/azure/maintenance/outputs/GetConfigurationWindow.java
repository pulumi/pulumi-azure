// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maintenance.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConfigurationWindow {
    /**
     * @return The duration of the maintenance window.
     * 
     */
    private String duration;
    /**
     * @return Effective expiration date of the maintenance window.
     * 
     */
    private String expirationDateTime;
    private String recurEvery;
    /**
     * @return Effective start date of the maintenance window.
     * 
     */
    private String startDateTime;
    /**
     * @return The time zone for the maintenance window.
     * 
     */
    private String timeZone;

    private GetConfigurationWindow() {}
    /**
     * @return The duration of the maintenance window.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Effective expiration date of the maintenance window.
     * 
     */
    public String expirationDateTime() {
        return this.expirationDateTime;
    }
    public String recurEvery() {
        return this.recurEvery;
    }
    /**
     * @return Effective start date of the maintenance window.
     * 
     */
    public String startDateTime() {
        return this.startDateTime;
    }
    /**
     * @return The time zone for the maintenance window.
     * 
     */
    public String timeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String duration;
        private String expirationDateTime;
        private String recurEvery;
        private String startDateTime;
        private String timeZone;
        public Builder() {}
        public Builder(GetConfigurationWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.expirationDateTime = defaults.expirationDateTime;
    	      this.recurEvery = defaults.recurEvery;
    	      this.startDateTime = defaults.startDateTime;
    	      this.timeZone = defaults.timeZone;
        }

        @CustomType.Setter
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        @CustomType.Setter
        public Builder expirationDateTime(String expirationDateTime) {
            this.expirationDateTime = Objects.requireNonNull(expirationDateTime);
            return this;
        }
        @CustomType.Setter
        public Builder recurEvery(String recurEvery) {
            this.recurEvery = Objects.requireNonNull(recurEvery);
            return this;
        }
        @CustomType.Setter
        public Builder startDateTime(String startDateTime) {
            this.startDateTime = Objects.requireNonNull(startDateTime);
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public GetConfigurationWindow build() {
            final var o = new GetConfigurationWindow();
            o.duration = duration;
            o.expirationDateTime = expirationDateTime;
            o.recurEvery = recurEvery;
            o.startDateTime = startDateTime;
            o.timeZone = timeZone;
            return o;
        }
    }
}
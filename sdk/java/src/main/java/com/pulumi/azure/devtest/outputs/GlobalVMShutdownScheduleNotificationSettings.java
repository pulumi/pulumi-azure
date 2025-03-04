// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlobalVMShutdownScheduleNotificationSettings {
    /**
     * @return E-mail address to which the notification will be sent.
     * 
     */
    private @Nullable String email;
    /**
     * @return Whether to enable pre-shutdown notifications. Possible values are `true` and `false`.
     * 
     */
    private Boolean enabled;
    /**
     * @return Time in minutes between 15 and 120 before a shutdown event at which a notification will be sent. Defaults to `30`.
     * 
     */
    private @Nullable Integer timeInMinutes;
    /**
     * @return The webhook URL to which the notification will be sent.
     * 
     */
    private @Nullable String webhookUrl;

    private GlobalVMShutdownScheduleNotificationSettings() {}
    /**
     * @return E-mail address to which the notification will be sent.
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return Whether to enable pre-shutdown notifications. Possible values are `true` and `false`.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Time in minutes between 15 and 120 before a shutdown event at which a notification will be sent. Defaults to `30`.
     * 
     */
    public Optional<Integer> timeInMinutes() {
        return Optional.ofNullable(this.timeInMinutes);
    }
    /**
     * @return The webhook URL to which the notification will be sent.
     * 
     */
    public Optional<String> webhookUrl() {
        return Optional.ofNullable(this.webhookUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalVMShutdownScheduleNotificationSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String email;
        private Boolean enabled;
        private @Nullable Integer timeInMinutes;
        private @Nullable String webhookUrl;
        public Builder() {}
        public Builder(GlobalVMShutdownScheduleNotificationSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.enabled = defaults.enabled;
    	      this.timeInMinutes = defaults.timeInMinutes;
    	      this.webhookUrl = defaults.webhookUrl;
        }

        @CustomType.Setter
        public Builder email(@Nullable String email) {

            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GlobalVMShutdownScheduleNotificationSettings", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder timeInMinutes(@Nullable Integer timeInMinutes) {

            this.timeInMinutes = timeInMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder webhookUrl(@Nullable String webhookUrl) {

            this.webhookUrl = webhookUrl;
            return this;
        }
        public GlobalVMShutdownScheduleNotificationSettings build() {
            final var _resultValue = new GlobalVMShutdownScheduleNotificationSettings();
            _resultValue.email = email;
            _resultValue.enabled = enabled;
            _resultValue.timeInMinutes = timeInMinutes;
            _resultValue.webhookUrl = webhookUrl;
            return _resultValue;
        }
    }
}

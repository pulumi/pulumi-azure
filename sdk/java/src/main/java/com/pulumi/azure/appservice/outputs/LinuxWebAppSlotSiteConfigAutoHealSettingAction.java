// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppSlotSiteConfigAutoHealSettingAction {
    /**
     * @return Predefined action to be taken to an Auto Heal trigger. Possible values include: `Recycle`.
     * 
     */
    private String actionType;
    /**
     * @return The minimum amount of time in `hh:mm:ss` the Linux Web App must have been running before the defined action will be run in the event of a trigger.
     * 
     */
    private @Nullable String minimumProcessExecutionTime;

    private LinuxWebAppSlotSiteConfigAutoHealSettingAction() {}
    /**
     * @return Predefined action to be taken to an Auto Heal trigger. Possible values include: `Recycle`.
     * 
     */
    public String actionType() {
        return this.actionType;
    }
    /**
     * @return The minimum amount of time in `hh:mm:ss` the Linux Web App must have been running before the defined action will be run in the event of a trigger.
     * 
     */
    public Optional<String> minimumProcessExecutionTime() {
        return Optional.ofNullable(this.minimumProcessExecutionTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppSlotSiteConfigAutoHealSettingAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String actionType;
        private @Nullable String minimumProcessExecutionTime;
        public Builder() {}
        public Builder(LinuxWebAppSlotSiteConfigAutoHealSettingAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.minimumProcessExecutionTime = defaults.minimumProcessExecutionTime;
        }

        @CustomType.Setter
        public Builder actionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }
        @CustomType.Setter
        public Builder minimumProcessExecutionTime(@Nullable String minimumProcessExecutionTime) {
            this.minimumProcessExecutionTime = minimumProcessExecutionTime;
            return this;
        }
        public LinuxWebAppSlotSiteConfigAutoHealSettingAction build() {
            final var o = new LinuxWebAppSlotSiteConfigAutoHealSettingAction();
            o.actionType = actionType;
            o.minimumProcessExecutionTime = minimumProcessExecutionTime;
            return o;
        }
    }
}
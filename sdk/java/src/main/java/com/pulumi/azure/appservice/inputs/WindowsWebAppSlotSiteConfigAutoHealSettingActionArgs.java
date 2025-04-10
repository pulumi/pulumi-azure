// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs Empty = new WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs();

    /**
     * Predefined action to be taken to an Auto Heal trigger. Possible values are `CustomAction`, `LogEvent` and `Recycle`.
     * 
     */
    @Import(name="actionType", required=true)
    private Output<String> actionType;

    /**
     * @return Predefined action to be taken to an Auto Heal trigger. Possible values are `CustomAction`, `LogEvent` and `Recycle`.
     * 
     */
    public Output<String> actionType() {
        return this.actionType;
    }

    /**
     * A `custom_action` block as defined below.
     * 
     */
    @Import(name="customAction")
    private @Nullable Output<WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomActionArgs> customAction;

    /**
     * @return A `custom_action` block as defined below.
     * 
     */
    public Optional<Output<WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomActionArgs>> customAction() {
        return Optional.ofNullable(this.customAction);
    }

    /**
     * The minimum amount of time in `hh:mm:ss` the Windows Web App Slot must have been running before the defined action will be run in the event of a trigger.
     * 
     */
    @Import(name="minimumProcessExecutionTime")
    private @Nullable Output<String> minimumProcessExecutionTime;

    /**
     * @return The minimum amount of time in `hh:mm:ss` the Windows Web App Slot must have been running before the defined action will be run in the event of a trigger.
     * 
     */
    public Optional<Output<String>> minimumProcessExecutionTime() {
        return Optional.ofNullable(this.minimumProcessExecutionTime);
    }

    private WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs() {}

    private WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs(WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs $) {
        this.actionType = $.actionType;
        this.customAction = $.customAction;
        this.minimumProcessExecutionTime = $.minimumProcessExecutionTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs $;

        public Builder() {
            $ = new WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs();
        }

        public Builder(WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs defaults) {
            $ = new WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType Predefined action to be taken to an Auto Heal trigger. Possible values are `CustomAction`, `LogEvent` and `Recycle`.
         * 
         * @return builder
         * 
         */
        public Builder actionType(Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType Predefined action to be taken to an Auto Heal trigger. Possible values are `CustomAction`, `LogEvent` and `Recycle`.
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        /**
         * @param customAction A `custom_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customAction(@Nullable Output<WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomActionArgs> customAction) {
            $.customAction = customAction;
            return this;
        }

        /**
         * @param customAction A `custom_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customAction(WindowsWebAppSlotSiteConfigAutoHealSettingActionCustomActionArgs customAction) {
            return customAction(Output.of(customAction));
        }

        /**
         * @param minimumProcessExecutionTime The minimum amount of time in `hh:mm:ss` the Windows Web App Slot must have been running before the defined action will be run in the event of a trigger.
         * 
         * @return builder
         * 
         */
        public Builder minimumProcessExecutionTime(@Nullable Output<String> minimumProcessExecutionTime) {
            $.minimumProcessExecutionTime = minimumProcessExecutionTime;
            return this;
        }

        /**
         * @param minimumProcessExecutionTime The minimum amount of time in `hh:mm:ss` the Windows Web App Slot must have been running before the defined action will be run in the event of a trigger.
         * 
         * @return builder
         * 
         */
        public Builder minimumProcessExecutionTime(String minimumProcessExecutionTime) {
            return minimumProcessExecutionTime(Output.of(minimumProcessExecutionTime));
        }

        public WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs build() {
            if ($.actionType == null) {
                throw new MissingRequiredPropertyException("WindowsWebAppSlotSiteConfigAutoHealSettingActionArgs", "actionType");
            }
            return $;
        }
    }

}

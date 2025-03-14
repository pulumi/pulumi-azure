// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerCustomState extends com.pulumi.resources.ResourceArgs {

    public static final TriggerCustomState Empty = new TriggerCustomState();

    /**
     * Specifies the JSON Blob defining the Body of this Custom Trigger.
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return Specifies the JSON Blob defining the Body of this Custom Trigger.
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * The URL of the Trigger within the Logic App Workflow. For use with certain resources like monitor_action_group and security_center_automation.
     * 
     */
    @Import(name="callbackUrl")
    private @Nullable Output<String> callbackUrl;

    /**
     * @return The URL of the Trigger within the Logic App Workflow. For use with certain resources like monitor_action_group and security_center_automation.
     * 
     */
    public Optional<Output<String>> callbackUrl() {
        return Optional.ofNullable(this.callbackUrl);
    }

    /**
     * Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="logicAppId")
    private @Nullable Output<String> logicAppId;

    /**
     * @return Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> logicAppId() {
        return Optional.ofNullable(this.logicAppId);
    }

    /**
     * Specifies the name of the HTTP Trigger to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** This name must be unique across all Triggers within the Logic App Workflow.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the HTTP Trigger to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** This name must be unique across all Triggers within the Logic App Workflow.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private TriggerCustomState() {}

    private TriggerCustomState(TriggerCustomState $) {
        this.body = $.body;
        this.callbackUrl = $.callbackUrl;
        this.logicAppId = $.logicAppId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerCustomState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerCustomState $;

        public Builder() {
            $ = new TriggerCustomState();
        }

        public Builder(TriggerCustomState defaults) {
            $ = new TriggerCustomState(Objects.requireNonNull(defaults));
        }

        /**
         * @param body Specifies the JSON Blob defining the Body of this Custom Trigger.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Specifies the JSON Blob defining the Body of this Custom Trigger.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param callbackUrl The URL of the Trigger within the Logic App Workflow. For use with certain resources like monitor_action_group and security_center_automation.
         * 
         * @return builder
         * 
         */
        public Builder callbackUrl(@Nullable Output<String> callbackUrl) {
            $.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * @param callbackUrl The URL of the Trigger within the Logic App Workflow. For use with certain resources like monitor_action_group and security_center_automation.
         * 
         * @return builder
         * 
         */
        public Builder callbackUrl(String callbackUrl) {
            return callbackUrl(Output.of(callbackUrl));
        }

        /**
         * @param logicAppId Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logicAppId(@Nullable Output<String> logicAppId) {
            $.logicAppId = logicAppId;
            return this;
        }

        /**
         * @param logicAppId Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logicAppId(String logicAppId) {
            return logicAppId(Output.of(logicAppId));
        }

        /**
         * @param name Specifies the name of the HTTP Trigger to be created within the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * &gt; **NOTE:** This name must be unique across all Triggers within the Logic App Workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the HTTP Trigger to be created within the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * &gt; **NOTE:** This name must be unique across all Triggers within the Logic App Workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TriggerCustomState build() {
            return $;
        }
    }

}

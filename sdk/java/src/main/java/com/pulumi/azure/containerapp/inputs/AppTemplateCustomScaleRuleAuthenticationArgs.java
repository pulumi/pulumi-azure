// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AppTemplateCustomScaleRuleAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppTemplateCustomScaleRuleAuthenticationArgs Empty = new AppTemplateCustomScaleRuleAuthenticationArgs();

    /**
     * The name of the Container App Secret to use for this Scale Rule Authentication.
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return The name of the Container App Secret to use for this Scale Rule Authentication.
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    /**
     * The Trigger Parameter name to use the supply the value retrieved from the `secret_name`.
     * 
     */
    @Import(name="triggerParameter", required=true)
    private Output<String> triggerParameter;

    /**
     * @return The Trigger Parameter name to use the supply the value retrieved from the `secret_name`.
     * 
     */
    public Output<String> triggerParameter() {
        return this.triggerParameter;
    }

    private AppTemplateCustomScaleRuleAuthenticationArgs() {}

    private AppTemplateCustomScaleRuleAuthenticationArgs(AppTemplateCustomScaleRuleAuthenticationArgs $) {
        this.secretName = $.secretName;
        this.triggerParameter = $.triggerParameter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppTemplateCustomScaleRuleAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppTemplateCustomScaleRuleAuthenticationArgs $;

        public Builder() {
            $ = new AppTemplateCustomScaleRuleAuthenticationArgs();
        }

        public Builder(AppTemplateCustomScaleRuleAuthenticationArgs defaults) {
            $ = new AppTemplateCustomScaleRuleAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretName The name of the Container App Secret to use for this Scale Rule Authentication.
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName The name of the Container App Secret to use for this Scale Rule Authentication.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param triggerParameter The Trigger Parameter name to use the supply the value retrieved from the `secret_name`.
         * 
         * @return builder
         * 
         */
        public Builder triggerParameter(Output<String> triggerParameter) {
            $.triggerParameter = triggerParameter;
            return this;
        }

        /**
         * @param triggerParameter The Trigger Parameter name to use the supply the value retrieved from the `secret_name`.
         * 
         * @return builder
         * 
         */
        public Builder triggerParameter(String triggerParameter) {
            return triggerParameter(Output.of(triggerParameter));
        }

        public AppTemplateCustomScaleRuleAuthenticationArgs build() {
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            $.triggerParameter = Objects.requireNonNull($.triggerParameter, "expected parameter 'triggerParameter' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertRuleAnomalyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertRuleAnomalyPlainArgs Empty = new GetAlertRuleAnomalyPlainArgs();

    /**
     * The display name of this Sentinel Alert Rule Template. Either `display_name` or `name` have to be specified.
     * 
     * &gt; **Note:** One of `name` or `display_name` must be specified.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return The display name of this Sentinel Alert Rule Template. Either `display_name` or `name` have to be specified.
     * 
     * &gt; **Note:** One of `name` or `display_name` must be specified.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the Log Analytics Workspace.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private String logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace.
     * 
     */
    public String logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * The guid of this Sentinel Alert Rule Template. Either `display_name` or `name` have to be specified.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The guid of this Sentinel Alert Rule Template. Either `display_name` or `name` have to be specified.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetAlertRuleAnomalyPlainArgs() {}

    private GetAlertRuleAnomalyPlainArgs(GetAlertRuleAnomalyPlainArgs $) {
        this.displayName = $.displayName;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertRuleAnomalyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertRuleAnomalyPlainArgs $;

        public Builder() {
            $ = new GetAlertRuleAnomalyPlainArgs();
        }

        public Builder(GetAlertRuleAnomalyPlainArgs defaults) {
            $ = new GetAlertRuleAnomalyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The display name of this Sentinel Alert Rule Template. Either `display_name` or `name` have to be specified.
         * 
         * &gt; **Note:** One of `name` or `display_name` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param name The guid of this Sentinel Alert Rule Template. Either `display_name` or `name` have to be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetAlertRuleAnomalyPlainArgs build() {
            if ($.logAnalyticsWorkspaceId == null) {
                throw new MissingRequiredPropertyException("GetAlertRuleAnomalyPlainArgs", "logAnalyticsWorkspaceId");
            }
            return $;
        }
    }

}

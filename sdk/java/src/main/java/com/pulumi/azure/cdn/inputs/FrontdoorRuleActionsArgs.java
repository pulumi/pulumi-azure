// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRequestHeaderActionArgs;
import com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsResponseHeaderActionArgs;
import com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsRouteConfigurationOverrideActionArgs;
import com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRedirectActionArgs;
import com.pulumi.azure.cdn.inputs.FrontdoorRuleActionsUrlRewriteActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontdoorRuleActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorRuleActionsArgs Empty = new FrontdoorRuleActionsArgs();

    /**
     * A `request_header_action` block as defined below.
     * 
     */
    @Import(name="requestHeaderActions")
    private @Nullable Output<List<FrontdoorRuleActionsRequestHeaderActionArgs>> requestHeaderActions;

    /**
     * @return A `request_header_action` block as defined below.
     * 
     */
    public Optional<Output<List<FrontdoorRuleActionsRequestHeaderActionArgs>>> requestHeaderActions() {
        return Optional.ofNullable(this.requestHeaderActions);
    }

    /**
     * A `response_header_action` block as defined below.
     * 
     */
    @Import(name="responseHeaderActions")
    private @Nullable Output<List<FrontdoorRuleActionsResponseHeaderActionArgs>> responseHeaderActions;

    /**
     * @return A `response_header_action` block as defined below.
     * 
     */
    public Optional<Output<List<FrontdoorRuleActionsResponseHeaderActionArgs>>> responseHeaderActions() {
        return Optional.ofNullable(this.responseHeaderActions);
    }

    /**
     * A `route_configuration_override_action` block as defined below.
     * 
     */
    @Import(name="routeConfigurationOverrideAction")
    private @Nullable Output<FrontdoorRuleActionsRouteConfigurationOverrideActionArgs> routeConfigurationOverrideAction;

    /**
     * @return A `route_configuration_override_action` block as defined below.
     * 
     */
    public Optional<Output<FrontdoorRuleActionsRouteConfigurationOverrideActionArgs>> routeConfigurationOverrideAction() {
        return Optional.ofNullable(this.routeConfigurationOverrideAction);
    }

    /**
     * A `url_redirect_action` block as defined below. You may **not** have a `url_redirect_action` **and** a `url_rewrite_action` defined in the same `actions` block.
     * 
     */
    @Import(name="urlRedirectAction")
    private @Nullable Output<FrontdoorRuleActionsUrlRedirectActionArgs> urlRedirectAction;

    /**
     * @return A `url_redirect_action` block as defined below. You may **not** have a `url_redirect_action` **and** a `url_rewrite_action` defined in the same `actions` block.
     * 
     */
    public Optional<Output<FrontdoorRuleActionsUrlRedirectActionArgs>> urlRedirectAction() {
        return Optional.ofNullable(this.urlRedirectAction);
    }

    /**
     * A `url_rewrite_action` block as defined below. You may **not** have a `url_rewrite_action` **and** a `url_redirect_action` defined in the same `actions` block.
     * 
     */
    @Import(name="urlRewriteAction")
    private @Nullable Output<FrontdoorRuleActionsUrlRewriteActionArgs> urlRewriteAction;

    /**
     * @return A `url_rewrite_action` block as defined below. You may **not** have a `url_rewrite_action` **and** a `url_redirect_action` defined in the same `actions` block.
     * 
     */
    public Optional<Output<FrontdoorRuleActionsUrlRewriteActionArgs>> urlRewriteAction() {
        return Optional.ofNullable(this.urlRewriteAction);
    }

    private FrontdoorRuleActionsArgs() {}

    private FrontdoorRuleActionsArgs(FrontdoorRuleActionsArgs $) {
        this.requestHeaderActions = $.requestHeaderActions;
        this.responseHeaderActions = $.responseHeaderActions;
        this.routeConfigurationOverrideAction = $.routeConfigurationOverrideAction;
        this.urlRedirectAction = $.urlRedirectAction;
        this.urlRewriteAction = $.urlRewriteAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorRuleActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorRuleActionsArgs $;

        public Builder() {
            $ = new FrontdoorRuleActionsArgs();
        }

        public Builder(FrontdoorRuleActionsArgs defaults) {
            $ = new FrontdoorRuleActionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param requestHeaderActions A `request_header_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaderActions(@Nullable Output<List<FrontdoorRuleActionsRequestHeaderActionArgs>> requestHeaderActions) {
            $.requestHeaderActions = requestHeaderActions;
            return this;
        }

        /**
         * @param requestHeaderActions A `request_header_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaderActions(List<FrontdoorRuleActionsRequestHeaderActionArgs> requestHeaderActions) {
            return requestHeaderActions(Output.of(requestHeaderActions));
        }

        /**
         * @param requestHeaderActions A `request_header_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder requestHeaderActions(FrontdoorRuleActionsRequestHeaderActionArgs... requestHeaderActions) {
            return requestHeaderActions(List.of(requestHeaderActions));
        }

        /**
         * @param responseHeaderActions A `response_header_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaderActions(@Nullable Output<List<FrontdoorRuleActionsResponseHeaderActionArgs>> responseHeaderActions) {
            $.responseHeaderActions = responseHeaderActions;
            return this;
        }

        /**
         * @param responseHeaderActions A `response_header_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaderActions(List<FrontdoorRuleActionsResponseHeaderActionArgs> responseHeaderActions) {
            return responseHeaderActions(Output.of(responseHeaderActions));
        }

        /**
         * @param responseHeaderActions A `response_header_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaderActions(FrontdoorRuleActionsResponseHeaderActionArgs... responseHeaderActions) {
            return responseHeaderActions(List.of(responseHeaderActions));
        }

        /**
         * @param routeConfigurationOverrideAction A `route_configuration_override_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder routeConfigurationOverrideAction(@Nullable Output<FrontdoorRuleActionsRouteConfigurationOverrideActionArgs> routeConfigurationOverrideAction) {
            $.routeConfigurationOverrideAction = routeConfigurationOverrideAction;
            return this;
        }

        /**
         * @param routeConfigurationOverrideAction A `route_configuration_override_action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder routeConfigurationOverrideAction(FrontdoorRuleActionsRouteConfigurationOverrideActionArgs routeConfigurationOverrideAction) {
            return routeConfigurationOverrideAction(Output.of(routeConfigurationOverrideAction));
        }

        /**
         * @param urlRedirectAction A `url_redirect_action` block as defined below. You may **not** have a `url_redirect_action` **and** a `url_rewrite_action` defined in the same `actions` block.
         * 
         * @return builder
         * 
         */
        public Builder urlRedirectAction(@Nullable Output<FrontdoorRuleActionsUrlRedirectActionArgs> urlRedirectAction) {
            $.urlRedirectAction = urlRedirectAction;
            return this;
        }

        /**
         * @param urlRedirectAction A `url_redirect_action` block as defined below. You may **not** have a `url_redirect_action` **and** a `url_rewrite_action` defined in the same `actions` block.
         * 
         * @return builder
         * 
         */
        public Builder urlRedirectAction(FrontdoorRuleActionsUrlRedirectActionArgs urlRedirectAction) {
            return urlRedirectAction(Output.of(urlRedirectAction));
        }

        /**
         * @param urlRewriteAction A `url_rewrite_action` block as defined below. You may **not** have a `url_rewrite_action` **and** a `url_redirect_action` defined in the same `actions` block.
         * 
         * @return builder
         * 
         */
        public Builder urlRewriteAction(@Nullable Output<FrontdoorRuleActionsUrlRewriteActionArgs> urlRewriteAction) {
            $.urlRewriteAction = urlRewriteAction;
            return this;
        }

        /**
         * @param urlRewriteAction A `url_rewrite_action` block as defined below. You may **not** have a `url_rewrite_action` **and** a `url_redirect_action` defined in the same `actions` block.
         * 
         * @return builder
         * 
         */
        public Builder urlRewriteAction(FrontdoorRuleActionsUrlRewriteActionArgs urlRewriteAction) {
            return urlRewriteAction(Output.of(urlRewriteAction));
        }

        public FrontdoorRuleActionsArgs build() {
            return $;
        }
    }

}

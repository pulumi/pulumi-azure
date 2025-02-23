// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.azure.cdn.outputs.EndpointGlobalDeliveryRuleCacheExpirationAction;
import com.pulumi.azure.cdn.outputs.EndpointGlobalDeliveryRuleCacheKeyQueryStringAction;
import com.pulumi.azure.cdn.outputs.EndpointGlobalDeliveryRuleModifyRequestHeaderAction;
import com.pulumi.azure.cdn.outputs.EndpointGlobalDeliveryRuleModifyResponseHeaderAction;
import com.pulumi.azure.cdn.outputs.EndpointGlobalDeliveryRuleUrlRedirectAction;
import com.pulumi.azure.cdn.outputs.EndpointGlobalDeliveryRuleUrlRewriteAction;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointGlobalDeliveryRule {
    /**
     * @return A `cache_expiration_action` block as defined above.
     * 
     */
    private @Nullable EndpointGlobalDeliveryRuleCacheExpirationAction cacheExpirationAction;
    /**
     * @return A `cache_key_query_string_action` block as defined above.
     * 
     */
    private @Nullable EndpointGlobalDeliveryRuleCacheKeyQueryStringAction cacheKeyQueryStringAction;
    /**
     * @return A `modify_request_header_action` block as defined below.
     * 
     */
    private @Nullable List<EndpointGlobalDeliveryRuleModifyRequestHeaderAction> modifyRequestHeaderActions;
    /**
     * @return A `modify_response_header_action` block as defined below.
     * 
     */
    private @Nullable List<EndpointGlobalDeliveryRuleModifyResponseHeaderAction> modifyResponseHeaderActions;
    /**
     * @return A `url_redirect_action` block as defined below.
     * 
     */
    private @Nullable EndpointGlobalDeliveryRuleUrlRedirectAction urlRedirectAction;
    /**
     * @return A `url_rewrite_action` block as defined below.
     * 
     */
    private @Nullable EndpointGlobalDeliveryRuleUrlRewriteAction urlRewriteAction;

    private EndpointGlobalDeliveryRule() {}
    /**
     * @return A `cache_expiration_action` block as defined above.
     * 
     */
    public Optional<EndpointGlobalDeliveryRuleCacheExpirationAction> cacheExpirationAction() {
        return Optional.ofNullable(this.cacheExpirationAction);
    }
    /**
     * @return A `cache_key_query_string_action` block as defined above.
     * 
     */
    public Optional<EndpointGlobalDeliveryRuleCacheKeyQueryStringAction> cacheKeyQueryStringAction() {
        return Optional.ofNullable(this.cacheKeyQueryStringAction);
    }
    /**
     * @return A `modify_request_header_action` block as defined below.
     * 
     */
    public List<EndpointGlobalDeliveryRuleModifyRequestHeaderAction> modifyRequestHeaderActions() {
        return this.modifyRequestHeaderActions == null ? List.of() : this.modifyRequestHeaderActions;
    }
    /**
     * @return A `modify_response_header_action` block as defined below.
     * 
     */
    public List<EndpointGlobalDeliveryRuleModifyResponseHeaderAction> modifyResponseHeaderActions() {
        return this.modifyResponseHeaderActions == null ? List.of() : this.modifyResponseHeaderActions;
    }
    /**
     * @return A `url_redirect_action` block as defined below.
     * 
     */
    public Optional<EndpointGlobalDeliveryRuleUrlRedirectAction> urlRedirectAction() {
        return Optional.ofNullable(this.urlRedirectAction);
    }
    /**
     * @return A `url_rewrite_action` block as defined below.
     * 
     */
    public Optional<EndpointGlobalDeliveryRuleUrlRewriteAction> urlRewriteAction() {
        return Optional.ofNullable(this.urlRewriteAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGlobalDeliveryRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable EndpointGlobalDeliveryRuleCacheExpirationAction cacheExpirationAction;
        private @Nullable EndpointGlobalDeliveryRuleCacheKeyQueryStringAction cacheKeyQueryStringAction;
        private @Nullable List<EndpointGlobalDeliveryRuleModifyRequestHeaderAction> modifyRequestHeaderActions;
        private @Nullable List<EndpointGlobalDeliveryRuleModifyResponseHeaderAction> modifyResponseHeaderActions;
        private @Nullable EndpointGlobalDeliveryRuleUrlRedirectAction urlRedirectAction;
        private @Nullable EndpointGlobalDeliveryRuleUrlRewriteAction urlRewriteAction;
        public Builder() {}
        public Builder(EndpointGlobalDeliveryRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheExpirationAction = defaults.cacheExpirationAction;
    	      this.cacheKeyQueryStringAction = defaults.cacheKeyQueryStringAction;
    	      this.modifyRequestHeaderActions = defaults.modifyRequestHeaderActions;
    	      this.modifyResponseHeaderActions = defaults.modifyResponseHeaderActions;
    	      this.urlRedirectAction = defaults.urlRedirectAction;
    	      this.urlRewriteAction = defaults.urlRewriteAction;
        }

        @CustomType.Setter
        public Builder cacheExpirationAction(@Nullable EndpointGlobalDeliveryRuleCacheExpirationAction cacheExpirationAction) {

            this.cacheExpirationAction = cacheExpirationAction;
            return this;
        }
        @CustomType.Setter
        public Builder cacheKeyQueryStringAction(@Nullable EndpointGlobalDeliveryRuleCacheKeyQueryStringAction cacheKeyQueryStringAction) {

            this.cacheKeyQueryStringAction = cacheKeyQueryStringAction;
            return this;
        }
        @CustomType.Setter
        public Builder modifyRequestHeaderActions(@Nullable List<EndpointGlobalDeliveryRuleModifyRequestHeaderAction> modifyRequestHeaderActions) {

            this.modifyRequestHeaderActions = modifyRequestHeaderActions;
            return this;
        }
        public Builder modifyRequestHeaderActions(EndpointGlobalDeliveryRuleModifyRequestHeaderAction... modifyRequestHeaderActions) {
            return modifyRequestHeaderActions(List.of(modifyRequestHeaderActions));
        }
        @CustomType.Setter
        public Builder modifyResponseHeaderActions(@Nullable List<EndpointGlobalDeliveryRuleModifyResponseHeaderAction> modifyResponseHeaderActions) {

            this.modifyResponseHeaderActions = modifyResponseHeaderActions;
            return this;
        }
        public Builder modifyResponseHeaderActions(EndpointGlobalDeliveryRuleModifyResponseHeaderAction... modifyResponseHeaderActions) {
            return modifyResponseHeaderActions(List.of(modifyResponseHeaderActions));
        }
        @CustomType.Setter
        public Builder urlRedirectAction(@Nullable EndpointGlobalDeliveryRuleUrlRedirectAction urlRedirectAction) {

            this.urlRedirectAction = urlRedirectAction;
            return this;
        }
        @CustomType.Setter
        public Builder urlRewriteAction(@Nullable EndpointGlobalDeliveryRuleUrlRewriteAction urlRewriteAction) {

            this.urlRewriteAction = urlRewriteAction;
            return this;
        }
        public EndpointGlobalDeliveryRule build() {
            final var _resultValue = new EndpointGlobalDeliveryRule();
            _resultValue.cacheExpirationAction = cacheExpirationAction;
            _resultValue.cacheKeyQueryStringAction = cacheKeyQueryStringAction;
            _resultValue.modifyRequestHeaderActions = modifyRequestHeaderActions;
            _resultValue.modifyResponseHeaderActions = modifyResponseHeaderActions;
            _resultValue.urlRedirectAction = urlRedirectAction;
            _resultValue.urlRewriteAction = urlRewriteAction;
            return _resultValue;
        }
    }
}

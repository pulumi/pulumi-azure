// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayUrlPathMapPathRule {
    /**
     * @return The ID of the associated Backend Address Pool.
     * 
     */
    private @Nullable String backendAddressPoolId;
    /**
     * @return The Name of the Backend Address Pool to use for this Path Rule. Cannot be set if `redirect_configuration_name` is set.
     * 
     */
    private @Nullable String backendAddressPoolName;
    /**
     * @return The ID of the associated Backend HTTP Settings Configuration.
     * 
     */
    private @Nullable String backendHttpSettingsId;
    /**
     * @return The Name of the Backend HTTP Settings Collection to use for this Path Rule. Cannot be set if `redirect_configuration_name` is set.
     * 
     */
    private @Nullable String backendHttpSettingsName;
    /**
     * @return The ID of the Web Application Firewall Policy which should be used as a HTTP Listener.
     * 
     */
    private @Nullable String firewallPolicyId;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private @Nullable String id;
    /**
     * @return The Name of the Path Rule.
     * 
     */
    private String name;
    /**
     * @return A list of Paths used in this Path Rule.
     * 
     */
    private List<String> paths;
    /**
     * @return The ID of the associated Redirect Configuration.
     * 
     */
    private @Nullable String redirectConfigurationId;
    /**
     * @return The Name of a Redirect Configuration to use for this Path Rule. Cannot be set if `backend_address_pool_name` or `backend_http_settings_name` is set.
     * 
     */
    private @Nullable String redirectConfigurationName;
    /**
     * @return The ID of the associated Rewrite Rule Set.
     * 
     */
    private @Nullable String rewriteRuleSetId;
    /**
     * @return The Name of the Rewrite Rule Set which should be used for this URL Path Map. Only valid for v2 SKUs.
     * 
     */
    private @Nullable String rewriteRuleSetName;

    private ApplicationGatewayUrlPathMapPathRule() {}
    /**
     * @return The ID of the associated Backend Address Pool.
     * 
     */
    public Optional<String> backendAddressPoolId() {
        return Optional.ofNullable(this.backendAddressPoolId);
    }
    /**
     * @return The Name of the Backend Address Pool to use for this Path Rule. Cannot be set if `redirect_configuration_name` is set.
     * 
     */
    public Optional<String> backendAddressPoolName() {
        return Optional.ofNullable(this.backendAddressPoolName);
    }
    /**
     * @return The ID of the associated Backend HTTP Settings Configuration.
     * 
     */
    public Optional<String> backendHttpSettingsId() {
        return Optional.ofNullable(this.backendHttpSettingsId);
    }
    /**
     * @return The Name of the Backend HTTP Settings Collection to use for this Path Rule. Cannot be set if `redirect_configuration_name` is set.
     * 
     */
    public Optional<String> backendHttpSettingsName() {
        return Optional.ofNullable(this.backendHttpSettingsName);
    }
    /**
     * @return The ID of the Web Application Firewall Policy which should be used as a HTTP Listener.
     * 
     */
    public Optional<String> firewallPolicyId() {
        return Optional.ofNullable(this.firewallPolicyId);
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The Name of the Path Rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of Paths used in this Path Rule.
     * 
     */
    public List<String> paths() {
        return this.paths;
    }
    /**
     * @return The ID of the associated Redirect Configuration.
     * 
     */
    public Optional<String> redirectConfigurationId() {
        return Optional.ofNullable(this.redirectConfigurationId);
    }
    /**
     * @return The Name of a Redirect Configuration to use for this Path Rule. Cannot be set if `backend_address_pool_name` or `backend_http_settings_name` is set.
     * 
     */
    public Optional<String> redirectConfigurationName() {
        return Optional.ofNullable(this.redirectConfigurationName);
    }
    /**
     * @return The ID of the associated Rewrite Rule Set.
     * 
     */
    public Optional<String> rewriteRuleSetId() {
        return Optional.ofNullable(this.rewriteRuleSetId);
    }
    /**
     * @return The Name of the Rewrite Rule Set which should be used for this URL Path Map. Only valid for v2 SKUs.
     * 
     */
    public Optional<String> rewriteRuleSetName() {
        return Optional.ofNullable(this.rewriteRuleSetName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayUrlPathMapPathRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String backendAddressPoolId;
        private @Nullable String backendAddressPoolName;
        private @Nullable String backendHttpSettingsId;
        private @Nullable String backendHttpSettingsName;
        private @Nullable String firewallPolicyId;
        private @Nullable String id;
        private String name;
        private List<String> paths;
        private @Nullable String redirectConfigurationId;
        private @Nullable String redirectConfigurationName;
        private @Nullable String rewriteRuleSetId;
        private @Nullable String rewriteRuleSetName;
        public Builder() {}
        public Builder(ApplicationGatewayUrlPathMapPathRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPoolId = defaults.backendAddressPoolId;
    	      this.backendAddressPoolName = defaults.backendAddressPoolName;
    	      this.backendHttpSettingsId = defaults.backendHttpSettingsId;
    	      this.backendHttpSettingsName = defaults.backendHttpSettingsName;
    	      this.firewallPolicyId = defaults.firewallPolicyId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.paths = defaults.paths;
    	      this.redirectConfigurationId = defaults.redirectConfigurationId;
    	      this.redirectConfigurationName = defaults.redirectConfigurationName;
    	      this.rewriteRuleSetId = defaults.rewriteRuleSetId;
    	      this.rewriteRuleSetName = defaults.rewriteRuleSetName;
        }

        @CustomType.Setter
        public Builder backendAddressPoolId(@Nullable String backendAddressPoolId) {
            this.backendAddressPoolId = backendAddressPoolId;
            return this;
        }
        @CustomType.Setter
        public Builder backendAddressPoolName(@Nullable String backendAddressPoolName) {
            this.backendAddressPoolName = backendAddressPoolName;
            return this;
        }
        @CustomType.Setter
        public Builder backendHttpSettingsId(@Nullable String backendHttpSettingsId) {
            this.backendHttpSettingsId = backendHttpSettingsId;
            return this;
        }
        @CustomType.Setter
        public Builder backendHttpSettingsName(@Nullable String backendHttpSettingsName) {
            this.backendHttpSettingsName = backendHttpSettingsName;
            return this;
        }
        @CustomType.Setter
        public Builder firewallPolicyId(@Nullable String firewallPolicyId) {
            this.firewallPolicyId = firewallPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder paths(List<String> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        @CustomType.Setter
        public Builder redirectConfigurationId(@Nullable String redirectConfigurationId) {
            this.redirectConfigurationId = redirectConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder redirectConfigurationName(@Nullable String redirectConfigurationName) {
            this.redirectConfigurationName = redirectConfigurationName;
            return this;
        }
        @CustomType.Setter
        public Builder rewriteRuleSetId(@Nullable String rewriteRuleSetId) {
            this.rewriteRuleSetId = rewriteRuleSetId;
            return this;
        }
        @CustomType.Setter
        public Builder rewriteRuleSetName(@Nullable String rewriteRuleSetName) {
            this.rewriteRuleSetName = rewriteRuleSetName;
            return this;
        }
        public ApplicationGatewayUrlPathMapPathRule build() {
            final var o = new ApplicationGatewayUrlPathMapPathRule();
            o.backendAddressPoolId = backendAddressPoolId;
            o.backendAddressPoolName = backendAddressPoolName;
            o.backendHttpSettingsId = backendHttpSettingsId;
            o.backendHttpSettingsName = backendHttpSettingsName;
            o.firewallPolicyId = firewallPolicyId;
            o.id = id;
            o.name = name;
            o.paths = paths;
            o.redirectConfigurationId = redirectConfigurationId;
            o.redirectConfigurationName = redirectConfigurationName;
            o.rewriteRuleSetId = rewriteRuleSetId;
            o.rewriteRuleSetName = rewriteRuleSetName;
            return o;
        }
    }
}
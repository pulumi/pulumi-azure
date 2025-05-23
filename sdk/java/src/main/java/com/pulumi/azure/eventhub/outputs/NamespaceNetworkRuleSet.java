// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.azure.eventhub.outputs.NamespaceNetworkRuleSetNetworkRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NamespaceNetworkRuleSet {
    /**
     * @return Specifies the default action for the Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Allow`.
     * 
     */
    private @Nullable String defaultAction;
    /**
     * @return One or more IP Addresses, or CIDR Blocks which should be able to access the Service Bus Namespace.
     * 
     */
    private @Nullable List<String> ipRules;
    /**
     * @return One or more `network_rules` blocks as defined below.
     * 
     */
    private @Nullable List<NamespaceNetworkRuleSetNetworkRule> networkRules;
    /**
     * @return Whether to allow traffic over public network. Possible values are `true` and `false`. Defaults to `true`.
     * 
     * &gt; **Note:** To disable public network access, you must also configure the property `public_network_access_enabled`.
     * 
     */
    private @Nullable Boolean publicNetworkAccessEnabled;
    /**
     * @return Are Azure Services that are known and trusted for this resource type are allowed to bypass firewall configuration? See [Trusted Microsoft Services](https://github.com/MicrosoftDocs/azure-docs/blob/master/articles/service-bus-messaging/includes/service-bus-trusted-services.md)
     * 
     */
    private @Nullable Boolean trustedServicesAllowed;

    private NamespaceNetworkRuleSet() {}
    /**
     * @return Specifies the default action for the Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Allow`.
     * 
     */
    public Optional<String> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }
    /**
     * @return One or more IP Addresses, or CIDR Blocks which should be able to access the Service Bus Namespace.
     * 
     */
    public List<String> ipRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }
    /**
     * @return One or more `network_rules` blocks as defined below.
     * 
     */
    public List<NamespaceNetworkRuleSetNetworkRule> networkRules() {
        return this.networkRules == null ? List.of() : this.networkRules;
    }
    /**
     * @return Whether to allow traffic over public network. Possible values are `true` and `false`. Defaults to `true`.
     * 
     * &gt; **Note:** To disable public network access, you must also configure the property `public_network_access_enabled`.
     * 
     */
    public Optional<Boolean> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }
    /**
     * @return Are Azure Services that are known and trusted for this resource type are allowed to bypass firewall configuration? See [Trusted Microsoft Services](https://github.com/MicrosoftDocs/azure-docs/blob/master/articles/service-bus-messaging/includes/service-bus-trusted-services.md)
     * 
     */
    public Optional<Boolean> trustedServicesAllowed() {
        return Optional.ofNullable(this.trustedServicesAllowed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceNetworkRuleSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String defaultAction;
        private @Nullable List<String> ipRules;
        private @Nullable List<NamespaceNetworkRuleSetNetworkRule> networkRules;
        private @Nullable Boolean publicNetworkAccessEnabled;
        private @Nullable Boolean trustedServicesAllowed;
        public Builder() {}
        public Builder(NamespaceNetworkRuleSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.networkRules = defaults.networkRules;
    	      this.publicNetworkAccessEnabled = defaults.publicNetworkAccessEnabled;
    	      this.trustedServicesAllowed = defaults.trustedServicesAllowed;
        }

        @CustomType.Setter
        public Builder defaultAction(@Nullable String defaultAction) {

            this.defaultAction = defaultAction;
            return this;
        }
        @CustomType.Setter
        public Builder ipRules(@Nullable List<String> ipRules) {

            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(String... ipRules) {
            return ipRules(List.of(ipRules));
        }
        @CustomType.Setter
        public Builder networkRules(@Nullable List<NamespaceNetworkRuleSetNetworkRule> networkRules) {

            this.networkRules = networkRules;
            return this;
        }
        public Builder networkRules(NamespaceNetworkRuleSetNetworkRule... networkRules) {
            return networkRules(List.of(networkRules));
        }
        @CustomType.Setter
        public Builder publicNetworkAccessEnabled(@Nullable Boolean publicNetworkAccessEnabled) {

            this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder trustedServicesAllowed(@Nullable Boolean trustedServicesAllowed) {

            this.trustedServicesAllowed = trustedServicesAllowed;
            return this;
        }
        public NamespaceNetworkRuleSet build() {
            final var _resultValue = new NamespaceNetworkRuleSet();
            _resultValue.defaultAction = defaultAction;
            _resultValue.ipRules = ipRules;
            _resultValue.networkRules = networkRules;
            _resultValue.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            _resultValue.trustedServicesAllowed = trustedServicesAllowed;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallNetworkRuleCollectionRule {
    /**
     * @return Specifies a description for the rule.
     * 
     */
    private @Nullable String description;
    /**
     * @return Either a list of destination IP addresses and/or IP ranges, or a list of destination [Service Tags](https://docs.microsoft.com/azure/virtual-network/service-tags-overview#available-service-tags).
     * 
     */
    private @Nullable List<String> destinationAddresses;
    /**
     * @return A list of destination FQDNS for the rule.
     * 
     * &gt; **Note:** [You must enable DNS Proxy to use FQDNs in your network rules](https://docs.microsoft.com/azure/firewall/fqdn-filtering-network-rules).
     * 
     * &gt; **Note:** At least one of `destination_addresses`, `destination_ip_groups` and `destination_fqdns` must be specified for a rule.
     * 
     */
    private @Nullable List<String> destinationFqdns;
    /**
     * @return A list of destination IP Group IDs for the rule.
     * 
     */
    private @Nullable List<String> destinationIpGroups;
    /**
     * @return A list of destination ports.
     * 
     */
    private List<String> destinationPorts;
    /**
     * @return Specifies the name of the rule.
     * 
     */
    private String name;
    /**
     * @return A list of protocols. Possible values are `Any`, `ICMP`, `TCP` and `UDP`.
     * 
     */
    private List<String> protocols;
    /**
     * @return A list of source IP addresses and/or IP ranges.
     * 
     */
    private @Nullable List<String> sourceAddresses;
    /**
     * @return A list of IP Group IDs for the rule.
     * 
     * &gt; **Note:** At least one of `source_addresses` and `source_ip_groups` must be specified for a rule.
     * 
     */
    private @Nullable List<String> sourceIpGroups;

    private FirewallNetworkRuleCollectionRule() {}
    /**
     * @return Specifies a description for the rule.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Either a list of destination IP addresses and/or IP ranges, or a list of destination [Service Tags](https://docs.microsoft.com/azure/virtual-network/service-tags-overview#available-service-tags).
     * 
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    /**
     * @return A list of destination FQDNS for the rule.
     * 
     * &gt; **Note:** [You must enable DNS Proxy to use FQDNs in your network rules](https://docs.microsoft.com/azure/firewall/fqdn-filtering-network-rules).
     * 
     * &gt; **Note:** At least one of `destination_addresses`, `destination_ip_groups` and `destination_fqdns` must be specified for a rule.
     * 
     */
    public List<String> destinationFqdns() {
        return this.destinationFqdns == null ? List.of() : this.destinationFqdns;
    }
    /**
     * @return A list of destination IP Group IDs for the rule.
     * 
     */
    public List<String> destinationIpGroups() {
        return this.destinationIpGroups == null ? List.of() : this.destinationIpGroups;
    }
    /**
     * @return A list of destination ports.
     * 
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }
    /**
     * @return Specifies the name of the rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of protocols. Possible values are `Any`, `ICMP`, `TCP` and `UDP`.
     * 
     */
    public List<String> protocols() {
        return this.protocols;
    }
    /**
     * @return A list of source IP addresses and/or IP ranges.
     * 
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    /**
     * @return A list of IP Group IDs for the rule.
     * 
     * &gt; **Note:** At least one of `source_addresses` and `source_ip_groups` must be specified for a rule.
     * 
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallNetworkRuleCollectionRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationFqdns;
        private @Nullable List<String> destinationIpGroups;
        private List<String> destinationPorts;
        private String name;
        private List<String> protocols;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;
        public Builder() {}
        public Builder(FirewallNetworkRuleCollectionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationFqdns = defaults.destinationFqdns;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {

            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        @CustomType.Setter
        public Builder destinationFqdns(@Nullable List<String> destinationFqdns) {

            this.destinationFqdns = destinationFqdns;
            return this;
        }
        public Builder destinationFqdns(String... destinationFqdns) {
            return destinationFqdns(List.of(destinationFqdns));
        }
        @CustomType.Setter
        public Builder destinationIpGroups(@Nullable List<String> destinationIpGroups) {

            this.destinationIpGroups = destinationIpGroups;
            return this;
        }
        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
        }
        @CustomType.Setter
        public Builder destinationPorts(List<String> destinationPorts) {
            if (destinationPorts == null) {
              throw new MissingRequiredPropertyException("FirewallNetworkRuleCollectionRule", "destinationPorts");
            }
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("FirewallNetworkRuleCollectionRule", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder protocols(List<String> protocols) {
            if (protocols == null) {
              throw new MissingRequiredPropertyException("FirewallNetworkRuleCollectionRule", "protocols");
            }
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        @CustomType.Setter
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {

            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        @CustomType.Setter
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {

            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }
        public FirewallNetworkRuleCollectionRule build() {
            final var _resultValue = new FirewallNetworkRuleCollectionRule();
            _resultValue.description = description;
            _resultValue.destinationAddresses = destinationAddresses;
            _resultValue.destinationFqdns = destinationFqdns;
            _resultValue.destinationIpGroups = destinationIpGroups;
            _resultValue.destinationPorts = destinationPorts;
            _resultValue.name = name;
            _resultValue.protocols = protocols;
            _resultValue.sourceAddresses = sourceAddresses;
            _resultValue.sourceIpGroups = sourceIpGroups;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetFirewallPolicyDn;
import com.pulumi.azure.network.outputs.GetFirewallPolicyThreatIntelligenceAllowlist;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFirewallPolicyResult {
    private String basePolicyId;
    private List<String> childPolicies;
    private List<GetFirewallPolicyDn> dns;
    private List<String> firewalls;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String location;
    private String name;
    private String resourceGroupName;
    private List<String> ruleCollectionGroups;
    /**
     * @return A mapping of tags assigned to the Firewall Policy.
     * 
     */
    private Map<String,String> tags;
    private List<GetFirewallPolicyThreatIntelligenceAllowlist> threatIntelligenceAllowlists;
    private String threatIntelligenceMode;

    private GetFirewallPolicyResult() {}
    public String basePolicyId() {
        return this.basePolicyId;
    }
    public List<String> childPolicies() {
        return this.childPolicies;
    }
    public List<GetFirewallPolicyDn> dns() {
        return this.dns;
    }
    public List<String> firewalls() {
        return this.firewalls;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public List<String> ruleCollectionGroups() {
        return this.ruleCollectionGroups;
    }
    /**
     * @return A mapping of tags assigned to the Firewall Policy.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    public List<GetFirewallPolicyThreatIntelligenceAllowlist> threatIntelligenceAllowlists() {
        return this.threatIntelligenceAllowlists;
    }
    public String threatIntelligenceMode() {
        return this.threatIntelligenceMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String basePolicyId;
        private List<String> childPolicies;
        private List<GetFirewallPolicyDn> dns;
        private List<String> firewalls;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private List<String> ruleCollectionGroups;
        private Map<String,String> tags;
        private List<GetFirewallPolicyThreatIntelligenceAllowlist> threatIntelligenceAllowlists;
        private String threatIntelligenceMode;
        public Builder() {}
        public Builder(GetFirewallPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePolicyId = defaults.basePolicyId;
    	      this.childPolicies = defaults.childPolicies;
    	      this.dns = defaults.dns;
    	      this.firewalls = defaults.firewalls;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionGroups = defaults.ruleCollectionGroups;
    	      this.tags = defaults.tags;
    	      this.threatIntelligenceAllowlists = defaults.threatIntelligenceAllowlists;
    	      this.threatIntelligenceMode = defaults.threatIntelligenceMode;
        }

        @CustomType.Setter
        public Builder basePolicyId(String basePolicyId) {
            if (basePolicyId == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "basePolicyId");
            }
            this.basePolicyId = basePolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder childPolicies(List<String> childPolicies) {
            if (childPolicies == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "childPolicies");
            }
            this.childPolicies = childPolicies;
            return this;
        }
        public Builder childPolicies(String... childPolicies) {
            return childPolicies(List.of(childPolicies));
        }
        @CustomType.Setter
        public Builder dns(List<GetFirewallPolicyDn> dns) {
            if (dns == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "dns");
            }
            this.dns = dns;
            return this;
        }
        public Builder dns(GetFirewallPolicyDn... dns) {
            return dns(List.of(dns));
        }
        @CustomType.Setter
        public Builder firewalls(List<String> firewalls) {
            if (firewalls == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "firewalls");
            }
            this.firewalls = firewalls;
            return this;
        }
        public Builder firewalls(String... firewalls) {
            return firewalls(List.of(firewalls));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder ruleCollectionGroups(List<String> ruleCollectionGroups) {
            if (ruleCollectionGroups == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "ruleCollectionGroups");
            }
            this.ruleCollectionGroups = ruleCollectionGroups;
            return this;
        }
        public Builder ruleCollectionGroups(String... ruleCollectionGroups) {
            return ruleCollectionGroups(List.of(ruleCollectionGroups));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder threatIntelligenceAllowlists(List<GetFirewallPolicyThreatIntelligenceAllowlist> threatIntelligenceAllowlists) {
            if (threatIntelligenceAllowlists == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "threatIntelligenceAllowlists");
            }
            this.threatIntelligenceAllowlists = threatIntelligenceAllowlists;
            return this;
        }
        public Builder threatIntelligenceAllowlists(GetFirewallPolicyThreatIntelligenceAllowlist... threatIntelligenceAllowlists) {
            return threatIntelligenceAllowlists(List.of(threatIntelligenceAllowlists));
        }
        @CustomType.Setter
        public Builder threatIntelligenceMode(String threatIntelligenceMode) {
            if (threatIntelligenceMode == null) {
              throw new MissingRequiredPropertyException("GetFirewallPolicyResult", "threatIntelligenceMode");
            }
            this.threatIntelligenceMode = threatIntelligenceMode;
            return this;
        }
        public GetFirewallPolicyResult build() {
            final var _resultValue = new GetFirewallPolicyResult();
            _resultValue.basePolicyId = basePolicyId;
            _resultValue.childPolicies = childPolicies;
            _resultValue.dns = dns;
            _resultValue.firewalls = firewalls;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.ruleCollectionGroups = ruleCollectionGroups;
            _resultValue.tags = tags;
            _resultValue.threatIntelligenceAllowlists = threatIntelligenceAllowlists;
            _resultValue.threatIntelligenceMode = threatIntelligenceMode;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.KubernetesClusterNodePoolNodeNetworkProfileAllowedHostPort;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterNodePoolNodeNetworkProfile {
    /**
     * @return One or more `allowed_host_ports` blocks as defined below.
     * 
     */
    private @Nullable List<KubernetesClusterNodePoolNodeNetworkProfileAllowedHostPort> allowedHostPorts;
    /**
     * @return A list of Application Security Group IDs which should be associated with this Node Pool.
     * 
     */
    private @Nullable List<String> applicationSecurityGroupIds;
    /**
     * @return Specifies a mapping of tags to the instance-level public IPs. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** To set the application security group, you must allow at least one host port. Without this, the configuration will fail silently. [Learn More](https://learn.microsoft.com/en-us/azure/aks/use-node-public-ips#allow-host-port-connections-and-add-node-pools-to-application-security-groups).
     * 
     */
    private @Nullable Map<String,String> nodePublicIpTags;

    private KubernetesClusterNodePoolNodeNetworkProfile() {}
    /**
     * @return One or more `allowed_host_ports` blocks as defined below.
     * 
     */
    public List<KubernetesClusterNodePoolNodeNetworkProfileAllowedHostPort> allowedHostPorts() {
        return this.allowedHostPorts == null ? List.of() : this.allowedHostPorts;
    }
    /**
     * @return A list of Application Security Group IDs which should be associated with this Node Pool.
     * 
     */
    public List<String> applicationSecurityGroupIds() {
        return this.applicationSecurityGroupIds == null ? List.of() : this.applicationSecurityGroupIds;
    }
    /**
     * @return Specifies a mapping of tags to the instance-level public IPs. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** To set the application security group, you must allow at least one host port. Without this, the configuration will fail silently. [Learn More](https://learn.microsoft.com/en-us/azure/aks/use-node-public-ips#allow-host-port-connections-and-add-node-pools-to-application-security-groups).
     * 
     */
    public Map<String,String> nodePublicIpTags() {
        return this.nodePublicIpTags == null ? Map.of() : this.nodePublicIpTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterNodePoolNodeNetworkProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<KubernetesClusterNodePoolNodeNetworkProfileAllowedHostPort> allowedHostPorts;
        private @Nullable List<String> applicationSecurityGroupIds;
        private @Nullable Map<String,String> nodePublicIpTags;
        public Builder() {}
        public Builder(KubernetesClusterNodePoolNodeNetworkProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHostPorts = defaults.allowedHostPorts;
    	      this.applicationSecurityGroupIds = defaults.applicationSecurityGroupIds;
    	      this.nodePublicIpTags = defaults.nodePublicIpTags;
        }

        @CustomType.Setter
        public Builder allowedHostPorts(@Nullable List<KubernetesClusterNodePoolNodeNetworkProfileAllowedHostPort> allowedHostPorts) {

            this.allowedHostPorts = allowedHostPorts;
            return this;
        }
        public Builder allowedHostPorts(KubernetesClusterNodePoolNodeNetworkProfileAllowedHostPort... allowedHostPorts) {
            return allowedHostPorts(List.of(allowedHostPorts));
        }
        @CustomType.Setter
        public Builder applicationSecurityGroupIds(@Nullable List<String> applicationSecurityGroupIds) {

            this.applicationSecurityGroupIds = applicationSecurityGroupIds;
            return this;
        }
        public Builder applicationSecurityGroupIds(String... applicationSecurityGroupIds) {
            return applicationSecurityGroupIds(List.of(applicationSecurityGroupIds));
        }
        @CustomType.Setter
        public Builder nodePublicIpTags(@Nullable Map<String,String> nodePublicIpTags) {

            this.nodePublicIpTags = nodePublicIpTags;
            return this;
        }
        public KubernetesClusterNodePoolNodeNetworkProfile build() {
            final var _resultValue = new KubernetesClusterNodePoolNodeNetworkProfile();
            _resultValue.allowedHostPorts = allowedHostPorts;
            _resultValue.applicationSecurityGroupIds = applicationSecurityGroupIds;
            _resultValue.nodePublicIpTags = nodePublicIpTags;
            return _resultValue;
        }
    }
}

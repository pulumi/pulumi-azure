// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress {
    private @Nullable String domainNameLabel;
    private @Nullable Integer idleTimeoutInMinutes;
    private @Nullable List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags;
    /**
     * @return The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    private String name;
    private @Nullable String publicIpPrefixId;

    private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress() {}
    public Optional<String> domainNameLabel() {
        return Optional.ofNullable(this.domainNameLabel);
    }
    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    public List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags() {
        return this.ipTags == null ? List.of() : this.ipTags;
    }
    /**
     * @return The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> publicIpPrefixId() {
        return Optional.ofNullable(this.publicIpPrefixId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String domainNameLabel;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags;
        private String name;
        private @Nullable String publicIpPrefixId;
        public Builder() {}
        public Builder(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipTags = defaults.ipTags;
    	      this.name = defaults.name;
    	      this.publicIpPrefixId = defaults.publicIpPrefixId;
        }

        @CustomType.Setter
        public Builder domainNameLabel(@Nullable String domainNameLabel) {
            this.domainNameLabel = domainNameLabel;
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder ipTags(@Nullable List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags) {
            this.ipTags = ipTags;
            return this;
        }
        public Builder ipTags(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag... ipTags) {
            return ipTags(List.of(ipTags));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpPrefixId(@Nullable String publicIpPrefixId) {
            this.publicIpPrefixId = publicIpPrefixId;
            return this;
        }
        public OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress build() {
            final var o = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress();
            o.domainNameLabel = domainNameLabel;
            o.idleTimeoutInMinutes = idleTimeoutInMinutes;
            o.ipTags = ipTags;
            o.name = name;
            o.publicIpPrefixId = publicIpPrefixId;
            return o;
        }
    }
}
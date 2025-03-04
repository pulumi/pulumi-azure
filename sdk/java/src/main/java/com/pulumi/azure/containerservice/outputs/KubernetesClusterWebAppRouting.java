// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.KubernetesClusterWebAppRoutingWebAppRoutingIdentity;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterWebAppRouting {
    /**
     * @return Specifies the list of the DNS Zone IDs in which DNS entries are created for applications deployed to the cluster when Web App Routing is enabled. If not using Bring-Your-Own DNS zones this property should be set to an empty list.
     * 
     */
    private List<String> dnsZoneIds;
    /**
     * @return A `web_app_routing_identity` block is exported. The exported attributes are defined below.
     * 
     */
    private @Nullable List<KubernetesClusterWebAppRoutingWebAppRoutingIdentity> webAppRoutingIdentities;

    private KubernetesClusterWebAppRouting() {}
    /**
     * @return Specifies the list of the DNS Zone IDs in which DNS entries are created for applications deployed to the cluster when Web App Routing is enabled. If not using Bring-Your-Own DNS zones this property should be set to an empty list.
     * 
     */
    public List<String> dnsZoneIds() {
        return this.dnsZoneIds;
    }
    /**
     * @return A `web_app_routing_identity` block is exported. The exported attributes are defined below.
     * 
     */
    public List<KubernetesClusterWebAppRoutingWebAppRoutingIdentity> webAppRoutingIdentities() {
        return this.webAppRoutingIdentities == null ? List.of() : this.webAppRoutingIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterWebAppRouting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> dnsZoneIds;
        private @Nullable List<KubernetesClusterWebAppRoutingWebAppRoutingIdentity> webAppRoutingIdentities;
        public Builder() {}
        public Builder(KubernetesClusterWebAppRouting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsZoneIds = defaults.dnsZoneIds;
    	      this.webAppRoutingIdentities = defaults.webAppRoutingIdentities;
        }

        @CustomType.Setter
        public Builder dnsZoneIds(List<String> dnsZoneIds) {
            if (dnsZoneIds == null) {
              throw new MissingRequiredPropertyException("KubernetesClusterWebAppRouting", "dnsZoneIds");
            }
            this.dnsZoneIds = dnsZoneIds;
            return this;
        }
        public Builder dnsZoneIds(String... dnsZoneIds) {
            return dnsZoneIds(List.of(dnsZoneIds));
        }
        @CustomType.Setter
        public Builder webAppRoutingIdentities(@Nullable List<KubernetesClusterWebAppRoutingWebAppRoutingIdentity> webAppRoutingIdentities) {

            this.webAppRoutingIdentities = webAppRoutingIdentities;
            return this;
        }
        public Builder webAppRoutingIdentities(KubernetesClusterWebAppRoutingWebAppRoutingIdentity... webAppRoutingIdentities) {
            return webAppRoutingIdentities(List.of(webAppRoutingIdentities));
        }
        public KubernetesClusterWebAppRouting build() {
            final var _resultValue = new KubernetesClusterWebAppRouting();
            _resultValue.dnsZoneIds = dnsZoneIds;
            _resultValue.webAppRoutingIdentities = webAppRoutingIdentities;
            return _resultValue;
        }
    }
}

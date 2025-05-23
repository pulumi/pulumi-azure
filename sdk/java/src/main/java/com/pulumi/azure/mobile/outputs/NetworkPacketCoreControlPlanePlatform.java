// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkPacketCoreControlPlanePlatform {
    /**
     * @return The ID of the Azure Arc connected cluster where the packet core is deployed.
     * 
     */
    private @Nullable String arcKubernetesClusterId;
    /**
     * @return The ID of the Azure Arc custom location where the packet core is deployed.
     * 
     * &gt; **Note:** At least one of `edge_device_id`, `arc_kubernetes_cluster_id`, `stack_hci_cluster_id` and `custom_location_id` should be specified. If multiple are set, they must be consistent with each other.
     * 
     */
    private @Nullable String customLocationId;
    /**
     * @return The ID of the Azure Stack Edge device where the packet core is deployed. If the device is part of a fault-tolerant pair, either device in the pair can be specified.
     * 
     */
    private @Nullable String edgeDeviceId;
    /**
     * @return The ID of the Azure Stack HCI cluster where the packet core is deployed.
     * 
     */
    private @Nullable String stackHciClusterId;
    /**
     * @return Specifies the platform type where the packet core is deployed. Possible values are `AKS-HCI`, `3P-AZURE-STACK-HCI` and `BaseVM`.
     * 
     */
    private String type;

    private NetworkPacketCoreControlPlanePlatform() {}
    /**
     * @return The ID of the Azure Arc connected cluster where the packet core is deployed.
     * 
     */
    public Optional<String> arcKubernetesClusterId() {
        return Optional.ofNullable(this.arcKubernetesClusterId);
    }
    /**
     * @return The ID of the Azure Arc custom location where the packet core is deployed.
     * 
     * &gt; **Note:** At least one of `edge_device_id`, `arc_kubernetes_cluster_id`, `stack_hci_cluster_id` and `custom_location_id` should be specified. If multiple are set, they must be consistent with each other.
     * 
     */
    public Optional<String> customLocationId() {
        return Optional.ofNullable(this.customLocationId);
    }
    /**
     * @return The ID of the Azure Stack Edge device where the packet core is deployed. If the device is part of a fault-tolerant pair, either device in the pair can be specified.
     * 
     */
    public Optional<String> edgeDeviceId() {
        return Optional.ofNullable(this.edgeDeviceId);
    }
    /**
     * @return The ID of the Azure Stack HCI cluster where the packet core is deployed.
     * 
     */
    public Optional<String> stackHciClusterId() {
        return Optional.ofNullable(this.stackHciClusterId);
    }
    /**
     * @return Specifies the platform type where the packet core is deployed. Possible values are `AKS-HCI`, `3P-AZURE-STACK-HCI` and `BaseVM`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPacketCoreControlPlanePlatform defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arcKubernetesClusterId;
        private @Nullable String customLocationId;
        private @Nullable String edgeDeviceId;
        private @Nullable String stackHciClusterId;
        private String type;
        public Builder() {}
        public Builder(NetworkPacketCoreControlPlanePlatform defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arcKubernetesClusterId = defaults.arcKubernetesClusterId;
    	      this.customLocationId = defaults.customLocationId;
    	      this.edgeDeviceId = defaults.edgeDeviceId;
    	      this.stackHciClusterId = defaults.stackHciClusterId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder arcKubernetesClusterId(@Nullable String arcKubernetesClusterId) {

            this.arcKubernetesClusterId = arcKubernetesClusterId;
            return this;
        }
        @CustomType.Setter
        public Builder customLocationId(@Nullable String customLocationId) {

            this.customLocationId = customLocationId;
            return this;
        }
        @CustomType.Setter
        public Builder edgeDeviceId(@Nullable String edgeDeviceId) {

            this.edgeDeviceId = edgeDeviceId;
            return this;
        }
        @CustomType.Setter
        public Builder stackHciClusterId(@Nullable String stackHciClusterId) {

            this.stackHciClusterId = stackHciClusterId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("NetworkPacketCoreControlPlanePlatform", "type");
            }
            this.type = type;
            return this;
        }
        public NetworkPacketCoreControlPlanePlatform build() {
            final var _resultValue = new NetworkPacketCoreControlPlanePlatform();
            _resultValue.arcKubernetesClusterId = arcKubernetesClusterId;
            _resultValue.customLocationId = customLocationId;
            _resultValue.edgeDeviceId = edgeDeviceId;
            _resultValue.stackHciClusterId = stackHciClusterId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}

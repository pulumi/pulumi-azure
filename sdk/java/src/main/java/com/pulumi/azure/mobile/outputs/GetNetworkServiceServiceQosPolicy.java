// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.outputs;

import com.pulumi.azure.mobile.outputs.GetNetworkServiceServiceQosPolicyMaximumBitRate;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkServiceServiceQosPolicy {
    /**
     * @return QoS Flow allocation and retention priority (ARP) level.
     * 
     */
    private Integer allocationAndRetentionPriorityLevel;
    /**
     * @return A `maximum_bit_rate` block as defined below. The Maximum Bit Rate (MBR) for all service data flows that use this PCC Rule or Service.
     * 
     */
    private List<GetNetworkServiceServiceQosPolicyMaximumBitRate> maximumBitRates;
    /**
     * @return The Preemption Capability of a QoS Flow controls whether it can preempt another QoS Flow with a lower priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
     * 
     */
    private String preemptionCapability;
    /**
     * @return The Preemption Vulnerability of a QoS Flow controls whether it can be preempted by QoS Flow with a higher priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
     * 
     */
    private String preemptionVulnerability;
    /**
     * @return The QoS Indicator (5QI for 5G network /QCI for 4G net work) value identifies a set of QoS characteristics that control QoS forwarding treatment for QoS flows or EPS bearers.
     * 
     */
    private Integer qosIndicator;

    private GetNetworkServiceServiceQosPolicy() {}
    /**
     * @return QoS Flow allocation and retention priority (ARP) level.
     * 
     */
    public Integer allocationAndRetentionPriorityLevel() {
        return this.allocationAndRetentionPriorityLevel;
    }
    /**
     * @return A `maximum_bit_rate` block as defined below. The Maximum Bit Rate (MBR) for all service data flows that use this PCC Rule or Service.
     * 
     */
    public List<GetNetworkServiceServiceQosPolicyMaximumBitRate> maximumBitRates() {
        return this.maximumBitRates;
    }
    /**
     * @return The Preemption Capability of a QoS Flow controls whether it can preempt another QoS Flow with a lower priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
     * 
     */
    public String preemptionCapability() {
        return this.preemptionCapability;
    }
    /**
     * @return The Preemption Vulnerability of a QoS Flow controls whether it can be preempted by QoS Flow with a higher priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
     * 
     */
    public String preemptionVulnerability() {
        return this.preemptionVulnerability;
    }
    /**
     * @return The QoS Indicator (5QI for 5G network /QCI for 4G net work) value identifies a set of QoS characteristics that control QoS forwarding treatment for QoS flows or EPS bearers.
     * 
     */
    public Integer qosIndicator() {
        return this.qosIndicator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkServiceServiceQosPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer allocationAndRetentionPriorityLevel;
        private List<GetNetworkServiceServiceQosPolicyMaximumBitRate> maximumBitRates;
        private String preemptionCapability;
        private String preemptionVulnerability;
        private Integer qosIndicator;
        public Builder() {}
        public Builder(GetNetworkServiceServiceQosPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationAndRetentionPriorityLevel = defaults.allocationAndRetentionPriorityLevel;
    	      this.maximumBitRates = defaults.maximumBitRates;
    	      this.preemptionCapability = defaults.preemptionCapability;
    	      this.preemptionVulnerability = defaults.preemptionVulnerability;
    	      this.qosIndicator = defaults.qosIndicator;
        }

        @CustomType.Setter
        public Builder allocationAndRetentionPriorityLevel(Integer allocationAndRetentionPriorityLevel) {
            if (allocationAndRetentionPriorityLevel == null) {
              throw new MissingRequiredPropertyException("GetNetworkServiceServiceQosPolicy", "allocationAndRetentionPriorityLevel");
            }
            this.allocationAndRetentionPriorityLevel = allocationAndRetentionPriorityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder maximumBitRates(List<GetNetworkServiceServiceQosPolicyMaximumBitRate> maximumBitRates) {
            if (maximumBitRates == null) {
              throw new MissingRequiredPropertyException("GetNetworkServiceServiceQosPolicy", "maximumBitRates");
            }
            this.maximumBitRates = maximumBitRates;
            return this;
        }
        public Builder maximumBitRates(GetNetworkServiceServiceQosPolicyMaximumBitRate... maximumBitRates) {
            return maximumBitRates(List.of(maximumBitRates));
        }
        @CustomType.Setter
        public Builder preemptionCapability(String preemptionCapability) {
            if (preemptionCapability == null) {
              throw new MissingRequiredPropertyException("GetNetworkServiceServiceQosPolicy", "preemptionCapability");
            }
            this.preemptionCapability = preemptionCapability;
            return this;
        }
        @CustomType.Setter
        public Builder preemptionVulnerability(String preemptionVulnerability) {
            if (preemptionVulnerability == null) {
              throw new MissingRequiredPropertyException("GetNetworkServiceServiceQosPolicy", "preemptionVulnerability");
            }
            this.preemptionVulnerability = preemptionVulnerability;
            return this;
        }
        @CustomType.Setter
        public Builder qosIndicator(Integer qosIndicator) {
            if (qosIndicator == null) {
              throw new MissingRequiredPropertyException("GetNetworkServiceServiceQosPolicy", "qosIndicator");
            }
            this.qosIndicator = qosIndicator;
            return this;
        }
        public GetNetworkServiceServiceQosPolicy build() {
            final var _resultValue = new GetNetworkServiceServiceQosPolicy();
            _resultValue.allocationAndRetentionPriorityLevel = allocationAndRetentionPriorityLevel;
            _resultValue.maximumBitRates = maximumBitRates;
            _resultValue.preemptionCapability = preemptionCapability;
            _resultValue.preemptionVulnerability = preemptionVulnerability;
            _resultValue.qosIndicator = qosIndicator;
            return _resultValue;
        }
    }
}

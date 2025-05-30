// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.azure.containerservice.inputs.KubernetesClusterOmsAgentOmsAgentIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterOmsAgentArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterOmsAgentArgs Empty = new KubernetesClusterOmsAgentArgs();

    /**
     * The ID of the Log Analytics Workspace which the OMS Agent should send data to.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace which the OMS Agent should send data to.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * Is managed identity authentication for monitoring enabled?
     * 
     */
    @Import(name="msiAuthForMonitoringEnabled")
    private @Nullable Output<Boolean> msiAuthForMonitoringEnabled;

    /**
     * @return Is managed identity authentication for monitoring enabled?
     * 
     */
    public Optional<Output<Boolean>> msiAuthForMonitoringEnabled() {
        return Optional.ofNullable(this.msiAuthForMonitoringEnabled);
    }

    /**
     * An `oms_agent_identity` block is exported. The exported attributes are defined below.
     * 
     */
    @Import(name="omsAgentIdentities")
    private @Nullable Output<List<KubernetesClusterOmsAgentOmsAgentIdentityArgs>> omsAgentIdentities;

    /**
     * @return An `oms_agent_identity` block is exported. The exported attributes are defined below.
     * 
     */
    public Optional<Output<List<KubernetesClusterOmsAgentOmsAgentIdentityArgs>>> omsAgentIdentities() {
        return Optional.ofNullable(this.omsAgentIdentities);
    }

    private KubernetesClusterOmsAgentArgs() {}

    private KubernetesClusterOmsAgentArgs(KubernetesClusterOmsAgentArgs $) {
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.msiAuthForMonitoringEnabled = $.msiAuthForMonitoringEnabled;
        this.omsAgentIdentities = $.omsAgentIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterOmsAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterOmsAgentArgs $;

        public Builder() {
            $ = new KubernetesClusterOmsAgentArgs();
        }

        public Builder(KubernetesClusterOmsAgentArgs defaults) {
            $ = new KubernetesClusterOmsAgentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace which the OMS Agent should send data to.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace which the OMS Agent should send data to.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param msiAuthForMonitoringEnabled Is managed identity authentication for monitoring enabled?
         * 
         * @return builder
         * 
         */
        public Builder msiAuthForMonitoringEnabled(@Nullable Output<Boolean> msiAuthForMonitoringEnabled) {
            $.msiAuthForMonitoringEnabled = msiAuthForMonitoringEnabled;
            return this;
        }

        /**
         * @param msiAuthForMonitoringEnabled Is managed identity authentication for monitoring enabled?
         * 
         * @return builder
         * 
         */
        public Builder msiAuthForMonitoringEnabled(Boolean msiAuthForMonitoringEnabled) {
            return msiAuthForMonitoringEnabled(Output.of(msiAuthForMonitoringEnabled));
        }

        /**
         * @param omsAgentIdentities An `oms_agent_identity` block is exported. The exported attributes are defined below.
         * 
         * @return builder
         * 
         */
        public Builder omsAgentIdentities(@Nullable Output<List<KubernetesClusterOmsAgentOmsAgentIdentityArgs>> omsAgentIdentities) {
            $.omsAgentIdentities = omsAgentIdentities;
            return this;
        }

        /**
         * @param omsAgentIdentities An `oms_agent_identity` block is exported. The exported attributes are defined below.
         * 
         * @return builder
         * 
         */
        public Builder omsAgentIdentities(List<KubernetesClusterOmsAgentOmsAgentIdentityArgs> omsAgentIdentities) {
            return omsAgentIdentities(Output.of(omsAgentIdentities));
        }

        /**
         * @param omsAgentIdentities An `oms_agent_identity` block is exported. The exported attributes are defined below.
         * 
         * @return builder
         * 
         */
        public Builder omsAgentIdentities(KubernetesClusterOmsAgentOmsAgentIdentityArgs... omsAgentIdentities) {
            return omsAgentIdentities(List.of(omsAgentIdentities));
        }

        public KubernetesClusterOmsAgentArgs build() {
            if ($.logAnalyticsWorkspaceId == null) {
                throw new MissingRequiredPropertyException("KubernetesClusterOmsAgentArgs", "logAnalyticsWorkspaceId");
            }
            return $;
        }
    }

}

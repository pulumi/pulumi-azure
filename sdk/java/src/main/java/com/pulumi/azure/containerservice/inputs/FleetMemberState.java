// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetMemberState extends com.pulumi.resources.ResourceArgs {

    public static final FleetMemberState Empty = new FleetMemberState();

    /**
     * The group this member belongs to for multi-cluster update management.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return The group this member belongs to for multi-cluster update management.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * The ARM resource ID of the cluster that joins the Fleet. Changing this forces a new Kubernetes Fleet Member to be created.
     * 
     */
    @Import(name="kubernetesClusterId")
    private @Nullable Output<String> kubernetesClusterId;

    /**
     * @return The ARM resource ID of the cluster that joins the Fleet. Changing this forces a new Kubernetes Fleet Member to be created.
     * 
     */
    public Optional<Output<String>> kubernetesClusterId() {
        return Optional.ofNullable(this.kubernetesClusterId);
    }

    /**
     * Specifies the Kubernetes Fleet Id within which this Kubernetes Fleet Member should exist. Changing this forces a new Kubernetes Fleet Member to be created.
     * 
     */
    @Import(name="kubernetesFleetId")
    private @Nullable Output<String> kubernetesFleetId;

    /**
     * @return Specifies the Kubernetes Fleet Id within which this Kubernetes Fleet Member should exist. Changing this forces a new Kubernetes Fleet Member to be created.
     * 
     */
    public Optional<Output<String>> kubernetesFleetId() {
        return Optional.ofNullable(this.kubernetesFleetId);
    }

    /**
     * Specifies the name of this Kubernetes Fleet Member. Changing this forces a new Kubernetes Fleet Member to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of this Kubernetes Fleet Member. Changing this forces a new Kubernetes Fleet Member to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FleetMemberState() {}

    private FleetMemberState(FleetMemberState $) {
        this.group = $.group;
        this.kubernetesClusterId = $.kubernetesClusterId;
        this.kubernetesFleetId = $.kubernetesFleetId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetMemberState $;

        public Builder() {
            $ = new FleetMemberState();
        }

        public Builder(FleetMemberState defaults) {
            $ = new FleetMemberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param group The group this member belongs to for multi-cluster update management.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The group this member belongs to for multi-cluster update management.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param kubernetesClusterId The ARM resource ID of the cluster that joins the Fleet. Changing this forces a new Kubernetes Fleet Member to be created.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterId(@Nullable Output<String> kubernetesClusterId) {
            $.kubernetesClusterId = kubernetesClusterId;
            return this;
        }

        /**
         * @param kubernetesClusterId The ARM resource ID of the cluster that joins the Fleet. Changing this forces a new Kubernetes Fleet Member to be created.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterId(String kubernetesClusterId) {
            return kubernetesClusterId(Output.of(kubernetesClusterId));
        }

        /**
         * @param kubernetesFleetId Specifies the Kubernetes Fleet Id within which this Kubernetes Fleet Member should exist. Changing this forces a new Kubernetes Fleet Member to be created.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesFleetId(@Nullable Output<String> kubernetesFleetId) {
            $.kubernetesFleetId = kubernetesFleetId;
            return this;
        }

        /**
         * @param kubernetesFleetId Specifies the Kubernetes Fleet Id within which this Kubernetes Fleet Member should exist. Changing this forces a new Kubernetes Fleet Member to be created.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesFleetId(String kubernetesFleetId) {
            return kubernetesFleetId(Output.of(kubernetesFleetId));
        }

        /**
         * @param name Specifies the name of this Kubernetes Fleet Member. Changing this forces a new Kubernetes Fleet Member to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of this Kubernetes Fleet Member. Changing this forces a new Kubernetes Fleet Member to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FleetMemberState build() {
            return $;
        }
    }

}

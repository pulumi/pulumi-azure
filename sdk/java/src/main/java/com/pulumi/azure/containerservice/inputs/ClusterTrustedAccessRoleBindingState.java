// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterTrustedAccessRoleBindingState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTrustedAccessRoleBindingState Empty = new ClusterTrustedAccessRoleBindingState();

    /**
     * Specifies the Kubernetes Cluster Id within which this Kubernetes Cluster Trusted Access Role Binding should exist. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    @Import(name="kubernetesClusterId")
    private @Nullable Output<String> kubernetesClusterId;

    /**
     * @return Specifies the Kubernetes Cluster Id within which this Kubernetes Cluster Trusted Access Role Binding should exist. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    public Optional<Output<String>> kubernetesClusterId() {
        return Optional.ofNullable(this.kubernetesClusterId);
    }

    /**
     * Specifies the name of this Kubernetes Cluster Trusted Access Role Binding. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of this Kubernetes Cluster Trusted Access Role Binding. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of roles to bind, each item is a resource type qualified role name.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return A list of roles to bind, each item is a resource type qualified role name.
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * The ARM resource ID of source resource that trusted access is configured for. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    @Import(name="sourceResourceId")
    private @Nullable Output<String> sourceResourceId;

    /**
     * @return The ARM resource ID of source resource that trusted access is configured for. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
     * 
     */
    public Optional<Output<String>> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    private ClusterTrustedAccessRoleBindingState() {}

    private ClusterTrustedAccessRoleBindingState(ClusterTrustedAccessRoleBindingState $) {
        this.kubernetesClusterId = $.kubernetesClusterId;
        this.name = $.name;
        this.roles = $.roles;
        this.sourceResourceId = $.sourceResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTrustedAccessRoleBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTrustedAccessRoleBindingState $;

        public Builder() {
            $ = new ClusterTrustedAccessRoleBindingState();
        }

        public Builder(ClusterTrustedAccessRoleBindingState defaults) {
            $ = new ClusterTrustedAccessRoleBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param kubernetesClusterId Specifies the Kubernetes Cluster Id within which this Kubernetes Cluster Trusted Access Role Binding should exist. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterId(@Nullable Output<String> kubernetesClusterId) {
            $.kubernetesClusterId = kubernetesClusterId;
            return this;
        }

        /**
         * @param kubernetesClusterId Specifies the Kubernetes Cluster Id within which this Kubernetes Cluster Trusted Access Role Binding should exist. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterId(String kubernetesClusterId) {
            return kubernetesClusterId(Output.of(kubernetesClusterId));
        }

        /**
         * @param name Specifies the name of this Kubernetes Cluster Trusted Access Role Binding. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of this Kubernetes Cluster Trusted Access Role Binding. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roles A list of roles to bind, each item is a resource type qualified role name.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles A list of roles to bind, each item is a resource type qualified role name.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles A list of roles to bind, each item is a resource type qualified role name.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param sourceResourceId The ARM resource ID of source resource that trusted access is configured for. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            $.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * @param sourceResourceId The ARM resource ID of source resource that trusted access is configured for. Changing this forces a new Kubernetes Cluster Trusted Access Role Binding to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceResourceId(String sourceResourceId) {
            return sourceResourceId(Output.of(sourceResourceId));
        }

        public ClusterTrustedAccessRoleBindingState build() {
            return $;
        }
    }

}

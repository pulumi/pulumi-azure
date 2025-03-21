// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterPrincipalAssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterPrincipalAssignmentState Empty = new ClusterPrincipalAssignmentState();

    /**
     * The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The object id of the principal. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The object id of the principal. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The name of the principal.
     * 
     */
    @Import(name="principalName")
    private @Nullable Output<String> principalName;

    /**
     * @return The name of the principal.
     * 
     */
    public Optional<Output<String>> principalName() {
        return Optional.ofNullable(this.principalName);
    }

    /**
     * The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="principalType")
    private @Nullable Output<String> principalType;

    /**
     * @return The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> principalType() {
        return Optional.ofNullable(this.principalType);
    }

    /**
     * The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The tenant id in which the principal resides. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenant id in which the principal resides. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The name of the tenant.
     * 
     */
    @Import(name="tenantName")
    private @Nullable Output<String> tenantName;

    /**
     * @return The name of the tenant.
     * 
     */
    public Optional<Output<String>> tenantName() {
        return Optional.ofNullable(this.tenantName);
    }

    private ClusterPrincipalAssignmentState() {}

    private ClusterPrincipalAssignmentState(ClusterPrincipalAssignmentState $) {
        this.clusterName = $.clusterName;
        this.name = $.name;
        this.principalId = $.principalId;
        this.principalName = $.principalName;
        this.principalType = $.principalType;
        this.resourceGroupName = $.resourceGroupName;
        this.role = $.role;
        this.tenantId = $.tenantId;
        this.tenantName = $.tenantName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterPrincipalAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterPrincipalAssignmentState $;

        public Builder() {
            $ = new ClusterPrincipalAssignmentState();
        }

        public Builder(ClusterPrincipalAssignmentState defaults) {
            $ = new ClusterPrincipalAssignmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param name The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Kusto cluster principal assignment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param principalId The object id of the principal. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The object id of the principal. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param principalName The name of the principal.
         * 
         * @return builder
         * 
         */
        public Builder principalName(@Nullable Output<String> principalName) {
            $.principalName = principalName;
            return this;
        }

        /**
         * @param principalName The name of the principal.
         * 
         * @return builder
         * 
         */
        public Builder principalName(String principalName) {
            return principalName(Output.of(principalName));
        }

        /**
         * @param principalType The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder principalType(@Nullable Output<String> principalType) {
            $.principalType = principalType;
            return this;
        }

        /**
         * @param principalType The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder principalType(String principalType) {
            return principalType(Output.of(principalType));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param role The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param tenantId The tenant id in which the principal resides. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant id in which the principal resides. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param tenantName The name of the tenant.
         * 
         * @return builder
         * 
         */
        public Builder tenantName(@Nullable Output<String> tenantName) {
            $.tenantName = tenantName;
            return this;
        }

        /**
         * @param tenantName The name of the tenant.
         * 
         * @return builder
         * 
         */
        public Builder tenantName(String tenantName) {
            return tenantName(Output.of(tenantName));
        }

        public ClusterPrincipalAssignmentState build() {
            return $;
        }
    }

}

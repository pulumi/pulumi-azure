// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterPrincipalAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterPrincipalAssignmentArgs Empty = new ClusterPrincipalAssignmentArgs();

    /**
     * The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
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
    @Import(name="principalId", required=true)
    private Output<String> principalId;

    /**
     * @return The object id of the principal. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }

    /**
     * The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="principalType", required=true)
    private Output<String> principalType;

    /**
     * @return The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> principalType() {
        return this.principalType;
    }

    /**
     * The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The cluster role assigned to the principal. Valid values include `AllDatabasesAdmin`, `AllDatabasesViewer`, and `AllDatabasesMonitor`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * The tenant id in which the principal resides. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return The tenant id in which the principal resides. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    private ClusterPrincipalAssignmentArgs() {}

    private ClusterPrincipalAssignmentArgs(ClusterPrincipalAssignmentArgs $) {
        this.clusterName = $.clusterName;
        this.name = $.name;
        this.principalId = $.principalId;
        this.principalType = $.principalType;
        this.resourceGroupName = $.resourceGroupName;
        this.role = $.role;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterPrincipalAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterPrincipalAssignmentArgs $;

        public Builder() {
            $ = new ClusterPrincipalAssignmentArgs();
        }

        public Builder(ClusterPrincipalAssignmentArgs defaults) {
            $ = new ClusterPrincipalAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
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
        public Builder principalId(Output<String> principalId) {
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
         * @param principalType The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder principalType(Output<String> principalType) {
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
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
        public Builder role(Output<String> role) {
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
        public Builder tenantId(Output<String> tenantId) {
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

        public ClusterPrincipalAssignmentArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("ClusterPrincipalAssignmentArgs", "clusterName");
            }
            if ($.principalId == null) {
                throw new MissingRequiredPropertyException("ClusterPrincipalAssignmentArgs", "principalId");
            }
            if ($.principalType == null) {
                throw new MissingRequiredPropertyException("ClusterPrincipalAssignmentArgs", "principalType");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("ClusterPrincipalAssignmentArgs", "resourceGroupName");
            }
            if ($.role == null) {
                throw new MissingRequiredPropertyException("ClusterPrincipalAssignmentArgs", "role");
            }
            if ($.tenantId == null) {
                throw new MissingRequiredPropertyException("ClusterPrincipalAssignmentArgs", "tenantId");
            }
            return $;
        }
    }

}

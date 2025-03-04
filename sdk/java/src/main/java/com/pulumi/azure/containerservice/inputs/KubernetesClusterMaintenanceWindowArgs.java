// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAllowedArgs;
import com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNotAllowedArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterMaintenanceWindowArgs Empty = new KubernetesClusterMaintenanceWindowArgs();

    /**
     * One or more `allowed` blocks as defined below.
     * 
     */
    @Import(name="alloweds")
    private @Nullable Output<List<KubernetesClusterMaintenanceWindowAllowedArgs>> alloweds;

    /**
     * @return One or more `allowed` blocks as defined below.
     * 
     */
    public Optional<Output<List<KubernetesClusterMaintenanceWindowAllowedArgs>>> alloweds() {
        return Optional.ofNullable(this.alloweds);
    }

    /**
     * One or more `not_allowed` block as defined below.
     * 
     */
    @Import(name="notAlloweds")
    private @Nullable Output<List<KubernetesClusterMaintenanceWindowNotAllowedArgs>> notAlloweds;

    /**
     * @return One or more `not_allowed` block as defined below.
     * 
     */
    public Optional<Output<List<KubernetesClusterMaintenanceWindowNotAllowedArgs>>> notAlloweds() {
        return Optional.ofNullable(this.notAlloweds);
    }

    private KubernetesClusterMaintenanceWindowArgs() {}

    private KubernetesClusterMaintenanceWindowArgs(KubernetesClusterMaintenanceWindowArgs $) {
        this.alloweds = $.alloweds;
        this.notAlloweds = $.notAlloweds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterMaintenanceWindowArgs $;

        public Builder() {
            $ = new KubernetesClusterMaintenanceWindowArgs();
        }

        public Builder(KubernetesClusterMaintenanceWindowArgs defaults) {
            $ = new KubernetesClusterMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alloweds One or more `allowed` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alloweds(@Nullable Output<List<KubernetesClusterMaintenanceWindowAllowedArgs>> alloweds) {
            $.alloweds = alloweds;
            return this;
        }

        /**
         * @param alloweds One or more `allowed` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alloweds(List<KubernetesClusterMaintenanceWindowAllowedArgs> alloweds) {
            return alloweds(Output.of(alloweds));
        }

        /**
         * @param alloweds One or more `allowed` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder alloweds(KubernetesClusterMaintenanceWindowAllowedArgs... alloweds) {
            return alloweds(List.of(alloweds));
        }

        /**
         * @param notAlloweds One or more `not_allowed` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder notAlloweds(@Nullable Output<List<KubernetesClusterMaintenanceWindowNotAllowedArgs>> notAlloweds) {
            $.notAlloweds = notAlloweds;
            return this;
        }

        /**
         * @param notAlloweds One or more `not_allowed` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder notAlloweds(List<KubernetesClusterMaintenanceWindowNotAllowedArgs> notAlloweds) {
            return notAlloweds(Output.of(notAlloweds));
        }

        /**
         * @param notAlloweds One or more `not_allowed` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder notAlloweds(KubernetesClusterMaintenanceWindowNotAllowedArgs... notAlloweds) {
            return notAlloweds(List.of(notAlloweds));
        }

        public KubernetesClusterMaintenanceWindowArgs build() {
            return $;
        }
    }

}

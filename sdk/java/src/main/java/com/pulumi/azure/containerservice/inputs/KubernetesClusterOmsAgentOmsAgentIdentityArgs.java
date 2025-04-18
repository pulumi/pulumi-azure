// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterOmsAgentOmsAgentIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterOmsAgentOmsAgentIdentityArgs Empty = new KubernetesClusterOmsAgentOmsAgentIdentityArgs();

    /**
     * The Client ID of the user-defined Managed Identity used for Web App Routing.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The Client ID of the user-defined Managed Identity used for Web App Routing.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The Object ID of the user-defined Managed Identity used for Web App Routing
     * 
     */
    @Import(name="objectId")
    private @Nullable Output<String> objectId;

    /**
     * @return The Object ID of the user-defined Managed Identity used for Web App Routing
     * 
     */
    public Optional<Output<String>> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * The ID of the User Assigned Identity used for Web App Routing.
     * 
     */
    @Import(name="userAssignedIdentityId")
    private @Nullable Output<String> userAssignedIdentityId;

    /**
     * @return The ID of the User Assigned Identity used for Web App Routing.
     * 
     */
    public Optional<Output<String>> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    private KubernetesClusterOmsAgentOmsAgentIdentityArgs() {}

    private KubernetesClusterOmsAgentOmsAgentIdentityArgs(KubernetesClusterOmsAgentOmsAgentIdentityArgs $) {
        this.clientId = $.clientId;
        this.objectId = $.objectId;
        this.userAssignedIdentityId = $.userAssignedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterOmsAgentOmsAgentIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterOmsAgentOmsAgentIdentityArgs $;

        public Builder() {
            $ = new KubernetesClusterOmsAgentOmsAgentIdentityArgs();
        }

        public Builder(KubernetesClusterOmsAgentOmsAgentIdentityArgs defaults) {
            $ = new KubernetesClusterOmsAgentOmsAgentIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The Client ID of the user-defined Managed Identity used for Web App Routing.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The Client ID of the user-defined Managed Identity used for Web App Routing.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param objectId The Object ID of the user-defined Managed Identity used for Web App Routing
         * 
         * @return builder
         * 
         */
        public Builder objectId(@Nullable Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId The Object ID of the user-defined Managed Identity used for Web App Routing
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param userAssignedIdentityId The ID of the User Assigned Identity used for Web App Routing.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(@Nullable Output<String> userAssignedIdentityId) {
            $.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }

        /**
         * @param userAssignedIdentityId The ID of the User Assigned Identity used for Web App Routing.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(String userAssignedIdentityId) {
            return userAssignedIdentityId(Output.of(userAssignedIdentityId));
        }

        public KubernetesClusterOmsAgentOmsAgentIdentityArgs build() {
            return $;
        }
    }

}

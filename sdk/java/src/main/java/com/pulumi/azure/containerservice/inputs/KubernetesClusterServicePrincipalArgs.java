// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class KubernetesClusterServicePrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterServicePrincipalArgs Empty = new KubernetesClusterServicePrincipalArgs();

    /**
     * The Client ID for the Service Principal.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The Client ID for the Service Principal.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The Client Secret for the Service Principal.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The Client Secret for the Service Principal.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    private KubernetesClusterServicePrincipalArgs() {}

    private KubernetesClusterServicePrincipalArgs(KubernetesClusterServicePrincipalArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterServicePrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterServicePrincipalArgs $;

        public Builder() {
            $ = new KubernetesClusterServicePrincipalArgs();
        }

        public Builder(KubernetesClusterServicePrincipalArgs defaults) {
            $ = new KubernetesClusterServicePrincipalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The Client ID for the Service Principal.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The Client ID for the Service Principal.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The Client Secret for the Service Principal.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The Client Secret for the Service Principal.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public KubernetesClusterServicePrincipalArgs build() {
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("KubernetesClusterServicePrincipalArgs", "clientId");
            }
            if ($.clientSecret == null) {
                throw new MissingRequiredPropertyException("KubernetesClusterServicePrincipalArgs", "clientSecret");
            }
            return $;
        }
    }

}

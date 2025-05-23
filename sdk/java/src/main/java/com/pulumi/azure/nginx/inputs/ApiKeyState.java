// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.nginx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiKeyState extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyState Empty = new ApiKeyState();

    /**
     * The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
     * 
     */
    @Import(name="endDateTime")
    private @Nullable Output<String> endDateTime;

    /**
     * @return The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
     * 
     */
    public Optional<Output<String>> endDateTime() {
        return Optional.ofNullable(this.endDateTime);
    }

    /**
     * The first three characters of the secret text to help identify it in use.
     * 
     */
    @Import(name="hint")
    private @Nullable Output<String> hint;

    /**
     * @return The first three characters of the secret text to help identify it in use.
     * 
     */
    public Optional<Output<String>> hint() {
        return Optional.ofNullable(this.hint);
    }

    /**
     * The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="nginxDeploymentId")
    private @Nullable Output<String> nginxDeploymentId;

    /**
     * @return The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> nginxDeploymentId() {
        return Optional.ofNullable(this.nginxDeploymentId);
    }

    /**
     * The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
     * 
     */
    @Import(name="secretText")
    private @Nullable Output<String> secretText;

    /**
     * @return The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
     * 
     */
    public Optional<Output<String>> secretText() {
        return Optional.ofNullable(this.secretText);
    }

    private ApiKeyState() {}

    private ApiKeyState(ApiKeyState $) {
        this.endDateTime = $.endDateTime;
        this.hint = $.hint;
        this.name = $.name;
        this.nginxDeploymentId = $.nginxDeploymentId;
        this.secretText = $.secretText;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyState $;

        public Builder() {
            $ = new ApiKeyState();
        }

        public Builder(ApiKeyState defaults) {
            $ = new ApiKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endDateTime The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
         * 
         * @return builder
         * 
         */
        public Builder endDateTime(@Nullable Output<String> endDateTime) {
            $.endDateTime = endDateTime;
            return this;
        }

        /**
         * @param endDateTime The RFC3339 formatted date-time after which this Dataplane API Key is no longer valid. The maximum value is now+2y.
         * 
         * @return builder
         * 
         */
        public Builder endDateTime(String endDateTime) {
            return endDateTime(Output.of(endDateTime));
        }

        /**
         * @param hint The first three characters of the secret text to help identify it in use.
         * 
         * @return builder
         * 
         */
        public Builder hint(@Nullable Output<String> hint) {
            $.hint = hint;
            return this;
        }

        /**
         * @param hint The first three characters of the secret text to help identify it in use.
         * 
         * @return builder
         * 
         */
        public Builder hint(String hint) {
            return hint(Output.of(hint));
        }

        /**
         * @param name The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the NGINX Dataplane API Key. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nginxDeploymentId The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder nginxDeploymentId(@Nullable Output<String> nginxDeploymentId) {
            $.nginxDeploymentId = nginxDeploymentId;
            return this;
        }

        /**
         * @param nginxDeploymentId The ID of the NGINX Deployment that the API key is associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder nginxDeploymentId(String nginxDeploymentId) {
            return nginxDeploymentId(Output.of(nginxDeploymentId));
        }

        /**
         * @param secretText The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
         * 
         * @return builder
         * 
         */
        public Builder secretText(@Nullable Output<String> secretText) {
            $.secretText = secretText;
            return this;
        }

        /**
         * @param secretText The value used as the Dataplane API Key. The API key requirements can be found in the [NGINXaaS Documentation](https://docs.nginx.com/nginxaas/azure/quickstart/loadbalancer-kubernetes/#create-an-nginxaas-data-plane-api-key).
         * 
         * @return builder
         * 
         */
        public Builder secretText(String secretText) {
            return secretText(Output.of(secretText));
        }

        public ApiKeyState build() {
            return $;
        }
    }

}

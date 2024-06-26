// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class IdentityProviderMicrosoftArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityProviderMicrosoftArgs Empty = new IdentityProviderMicrosoftArgs();

    /**
     * The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private Output<String> apiManagementName;

    /**
     * @return The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * Client Id of the Azure AD Application.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return Client Id of the Azure AD Application.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Client secret of the Azure AD Application.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return Client secret of the Azure AD Application.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private IdentityProviderMicrosoftArgs() {}

    private IdentityProviderMicrosoftArgs(IdentityProviderMicrosoftArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityProviderMicrosoftArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityProviderMicrosoftArgs $;

        public Builder() {
            $ = new IdentityProviderMicrosoftArgs();
        }

        public Builder(IdentityProviderMicrosoftArgs defaults) {
            $ = new IdentityProviderMicrosoftArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The Name of the API Management Service where this Microsoft Identity Provider should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param clientId Client Id of the Azure AD Application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client Id of the Azure AD Application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Client secret of the Azure AD Application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Client secret of the Azure AD Application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public IdentityProviderMicrosoftArgs build() {
            if ($.apiManagementName == null) {
                throw new MissingRequiredPropertyException("IdentityProviderMicrosoftArgs", "apiManagementName");
            }
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("IdentityProviderMicrosoftArgs", "clientId");
            }
            if ($.clientSecret == null) {
                throw new MissingRequiredPropertyException("IdentityProviderMicrosoftArgs", "clientSecret");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("IdentityProviderMicrosoftArgs", "resourceGroupName");
            }
            return $;
        }
    }

}

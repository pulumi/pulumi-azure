// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiOperationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiOperationPolicyArgs Empty = new ApiOperationPolicyArgs();

    /**
     * The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * The name of the API within the API Management Service where the Operation exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiName", required=true)
    private Output<String> apiName;

    /**
     * @return The name of the API within the API Management Service where the Operation exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiName() {
        return this.apiName;
    }

    /**
     * The operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="operationId", required=true)
    private Output<String> operationId;

    /**
     * @return The operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> operationId() {
        return this.operationId;
    }

    /**
     * The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The XML Content for this Policy.
     * 
     */
    @Import(name="xmlContent")
    private @Nullable Output<String> xmlContent;

    /**
     * @return The XML Content for this Policy.
     * 
     */
    public Optional<Output<String>> xmlContent() {
        return Optional.ofNullable(this.xmlContent);
    }

    /**
     * A link to a Policy XML Document, which must be publicly available.
     * 
     */
    @Import(name="xmlLink")
    private @Nullable Output<String> xmlLink;

    /**
     * @return A link to a Policy XML Document, which must be publicly available.
     * 
     */
    public Optional<Output<String>> xmlLink() {
        return Optional.ofNullable(this.xmlLink);
    }

    private ApiOperationPolicyArgs() {}

    private ApiOperationPolicyArgs(ApiOperationPolicyArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.apiName = $.apiName;
        this.operationId = $.operationId;
        this.resourceGroupName = $.resourceGroupName;
        this.xmlContent = $.xmlContent;
        this.xmlLink = $.xmlLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiOperationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiOperationPolicyArgs $;

        public Builder() {
            $ = new ApiOperationPolicyArgs();
        }

        public Builder(ApiOperationPolicyArgs defaults) {
            $ = new ApiOperationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The name of the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param apiName The name of the API within the API Management Service where the Operation exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiName(Output<String> apiName) {
            $.apiName = apiName;
            return this;
        }

        /**
         * @param apiName The name of the API within the API Management Service where the Operation exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiName(String apiName) {
            return apiName(Output.of(apiName));
        }

        /**
         * @param operationId The operation identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder operationId(Output<String> operationId) {
            $.operationId = operationId;
            return this;
        }

        /**
         * @param operationId The operation identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder operationId(String operationId) {
            return operationId(Output.of(operationId));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param xmlContent The XML Content for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder xmlContent(@Nullable Output<String> xmlContent) {
            $.xmlContent = xmlContent;
            return this;
        }

        /**
         * @param xmlContent The XML Content for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder xmlContent(String xmlContent) {
            return xmlContent(Output.of(xmlContent));
        }

        /**
         * @param xmlLink A link to a Policy XML Document, which must be publicly available.
         * 
         * @return builder
         * 
         */
        public Builder xmlLink(@Nullable Output<String> xmlLink) {
            $.xmlLink = xmlLink;
            return this;
        }

        /**
         * @param xmlLink A link to a Policy XML Document, which must be publicly available.
         * 
         * @return builder
         * 
         */
        public Builder xmlLink(String xmlLink) {
            return xmlLink(Output.of(xmlLink));
        }

        public ApiOperationPolicyArgs build() {
            $.apiManagementName = Objects.requireNonNull($.apiManagementName, "expected parameter 'apiManagementName' to be non-null");
            $.apiName = Objects.requireNonNull($.apiName, "expected parameter 'apiName' to be non-null");
            $.operationId = Objects.requireNonNull($.operationId, "expected parameter 'operationId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
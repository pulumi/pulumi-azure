// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiTagState extends com.pulumi.resources.ResourceArgs {

    public static final ApiTagState Empty = new ApiTagState();

    /**
     * The ID of the API Management API. Changing this forces a new API Management API Tag to be created.
     * 
     */
    @Import(name="apiId")
    private @Nullable Output<String> apiId;

    /**
     * @return The ID of the API Management API. Changing this forces a new API Management API Tag to be created.
     * 
     */
    public Optional<Output<String>> apiId() {
        return Optional.ofNullable(this.apiId);
    }

    /**
     * The name of the tag. It must be known in the API Management instance. Changing this forces a new API Management API Tag to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the tag. It must be known in the API Management instance. Changing this forces a new API Management API Tag to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApiTagState() {}

    private ApiTagState(ApiTagState $) {
        this.apiId = $.apiId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiTagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiTagState $;

        public Builder() {
            $ = new ApiTagState();
        }

        public Builder(ApiTagState defaults) {
            $ = new ApiTagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The ID of the API Management API. Changing this forces a new API Management API Tag to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiId(@Nullable Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId The ID of the API Management API. Changing this forces a new API Management API Tag to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param name The name of the tag. It must be known in the API Management instance. Changing this forces a new API Management API Tag to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the tag. It must be known in the API Management instance. Changing this forces a new API Management API Tag to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApiTagState build() {
            return $;
        }
    }

}

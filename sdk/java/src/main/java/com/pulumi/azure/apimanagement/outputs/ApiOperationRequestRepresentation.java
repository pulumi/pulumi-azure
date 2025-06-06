// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ApiOperationRequestRepresentationExample;
import com.pulumi.azure.apimanagement.outputs.ApiOperationRequestRepresentationFormParameter;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiOperationRequestRepresentation {
    /**
     * @return The Content Type of this representation, such as `application/json`.
     * 
     */
    private String contentType;
    /**
     * @return One or more `example` blocks as defined above.
     * 
     */
    private @Nullable List<ApiOperationRequestRepresentationExample> examples;
    /**
     * @return One or more `form_parameter` block as defined above.
     * 
     * &gt; **Note:** This is Required when `content_type` is set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * 
     */
    private @Nullable List<ApiOperationRequestRepresentationFormParameter> formParameters;
    /**
     * @return The ID of an API Management Schema which represents this Response.
     * 
     * &gt; **Note:** This can only be specified when `content_type` is not set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * 
     */
    private @Nullable String schemaId;
    /**
     * @return The Type Name defined by the Schema.
     * 
     * &gt; **Note:** This can only be specified when `content_type` is not set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * 
     */
    private @Nullable String typeName;

    private ApiOperationRequestRepresentation() {}
    /**
     * @return The Content Type of this representation, such as `application/json`.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return One or more `example` blocks as defined above.
     * 
     */
    public List<ApiOperationRequestRepresentationExample> examples() {
        return this.examples == null ? List.of() : this.examples;
    }
    /**
     * @return One or more `form_parameter` block as defined above.
     * 
     * &gt; **Note:** This is Required when `content_type` is set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * 
     */
    public List<ApiOperationRequestRepresentationFormParameter> formParameters() {
        return this.formParameters == null ? List.of() : this.formParameters;
    }
    /**
     * @return The ID of an API Management Schema which represents this Response.
     * 
     * &gt; **Note:** This can only be specified when `content_type` is not set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * 
     */
    public Optional<String> schemaId() {
        return Optional.ofNullable(this.schemaId);
    }
    /**
     * @return The Type Name defined by the Schema.
     * 
     * &gt; **Note:** This can only be specified when `content_type` is not set to `application/x-www-form-urlencoded` or `multipart/form-data`.
     * 
     */
    public Optional<String> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOperationRequestRepresentation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contentType;
        private @Nullable List<ApiOperationRequestRepresentationExample> examples;
        private @Nullable List<ApiOperationRequestRepresentationFormParameter> formParameters;
        private @Nullable String schemaId;
        private @Nullable String typeName;
        public Builder() {}
        public Builder(ApiOperationRequestRepresentation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.examples = defaults.examples;
    	      this.formParameters = defaults.formParameters;
    	      this.schemaId = defaults.schemaId;
    	      this.typeName = defaults.typeName;
        }

        @CustomType.Setter
        public Builder contentType(String contentType) {
            if (contentType == null) {
              throw new MissingRequiredPropertyException("ApiOperationRequestRepresentation", "contentType");
            }
            this.contentType = contentType;
            return this;
        }
        @CustomType.Setter
        public Builder examples(@Nullable List<ApiOperationRequestRepresentationExample> examples) {

            this.examples = examples;
            return this;
        }
        public Builder examples(ApiOperationRequestRepresentationExample... examples) {
            return examples(List.of(examples));
        }
        @CustomType.Setter
        public Builder formParameters(@Nullable List<ApiOperationRequestRepresentationFormParameter> formParameters) {

            this.formParameters = formParameters;
            return this;
        }
        public Builder formParameters(ApiOperationRequestRepresentationFormParameter... formParameters) {
            return formParameters(List.of(formParameters));
        }
        @CustomType.Setter
        public Builder schemaId(@Nullable String schemaId) {

            this.schemaId = schemaId;
            return this;
        }
        @CustomType.Setter
        public Builder typeName(@Nullable String typeName) {

            this.typeName = typeName;
            return this;
        }
        public ApiOperationRequestRepresentation build() {
            final var _resultValue = new ApiOperationRequestRepresentation();
            _resultValue.contentType = contentType;
            _resultValue.examples = examples;
            _resultValue.formParameters = formParameters;
            _resultValue.schemaId = schemaId;
            _resultValue.typeName = typeName;
            return _resultValue;
        }
    }
}

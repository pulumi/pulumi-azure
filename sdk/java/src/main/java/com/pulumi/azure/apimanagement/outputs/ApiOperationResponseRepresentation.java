// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ApiOperationResponseRepresentationExample;
import com.pulumi.azure.apimanagement.outputs.ApiOperationResponseRepresentationFormParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiOperationResponseRepresentation {
    /**
     * @return The Content Type of this representation, such as `application/json`.
     * 
     */
    private String contentType;
    /**
     * @return One or more `example` blocks as defined above.
     * 
     */
    private @Nullable List<ApiOperationResponseRepresentationExample> examples;
    /**
     * @return One or more `form_parameter` block as defined above.
     * 
     */
    private @Nullable List<ApiOperationResponseRepresentationFormParameter> formParameters;
    /**
     * @return The ID of an API Management Schema which represents this Response.
     * 
     */
    private @Nullable String schemaId;
    /**
     * @return The Type Name defined by the Schema.
     * 
     */
    private @Nullable String typeName;

    private ApiOperationResponseRepresentation() {}
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
    public List<ApiOperationResponseRepresentationExample> examples() {
        return this.examples == null ? List.of() : this.examples;
    }
    /**
     * @return One or more `form_parameter` block as defined above.
     * 
     */
    public List<ApiOperationResponseRepresentationFormParameter> formParameters() {
        return this.formParameters == null ? List.of() : this.formParameters;
    }
    /**
     * @return The ID of an API Management Schema which represents this Response.
     * 
     */
    public Optional<String> schemaId() {
        return Optional.ofNullable(this.schemaId);
    }
    /**
     * @return The Type Name defined by the Schema.
     * 
     */
    public Optional<String> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOperationResponseRepresentation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contentType;
        private @Nullable List<ApiOperationResponseRepresentationExample> examples;
        private @Nullable List<ApiOperationResponseRepresentationFormParameter> formParameters;
        private @Nullable String schemaId;
        private @Nullable String typeName;
        public Builder() {}
        public Builder(ApiOperationResponseRepresentation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.examples = defaults.examples;
    	      this.formParameters = defaults.formParameters;
    	      this.schemaId = defaults.schemaId;
    	      this.typeName = defaults.typeName;
        }

        @CustomType.Setter
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        @CustomType.Setter
        public Builder examples(@Nullable List<ApiOperationResponseRepresentationExample> examples) {
            this.examples = examples;
            return this;
        }
        public Builder examples(ApiOperationResponseRepresentationExample... examples) {
            return examples(List.of(examples));
        }
        @CustomType.Setter
        public Builder formParameters(@Nullable List<ApiOperationResponseRepresentationFormParameter> formParameters) {
            this.formParameters = formParameters;
            return this;
        }
        public Builder formParameters(ApiOperationResponseRepresentationFormParameter... formParameters) {
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
        public ApiOperationResponseRepresentation build() {
            final var o = new ApiOperationResponseRepresentation();
            o.contentType = contentType;
            o.examples = examples;
            o.formParameters = formParameters;
            o.schemaId = schemaId;
            o.typeName = typeName;
            return o;
        }
    }
}
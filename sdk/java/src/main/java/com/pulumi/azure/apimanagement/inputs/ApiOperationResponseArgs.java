// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.ApiOperationResponseHeaderArgs;
import com.pulumi.azure.apimanagement.inputs.ApiOperationResponseRepresentationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiOperationResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiOperationResponseArgs Empty = new ApiOperationResponseArgs();

    /**
     * A description of the HTTP Response, which may include HTML tags.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the HTTP Response, which may include HTML tags.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * One or more `header` blocks as defined above.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<ApiOperationResponseHeaderArgs>> headers;

    /**
     * @return One or more `header` blocks as defined above.
     * 
     */
    public Optional<Output<List<ApiOperationResponseHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * One or more `representation` blocks as defined above.
     * 
     */
    @Import(name="representations")
    private @Nullable Output<List<ApiOperationResponseRepresentationArgs>> representations;

    /**
     * @return One or more `representation` blocks as defined above.
     * 
     */
    public Optional<Output<List<ApiOperationResponseRepresentationArgs>>> representations() {
        return Optional.ofNullable(this.representations);
    }

    /**
     * The HTTP Status Code.
     * 
     */
    @Import(name="statusCode", required=true)
    private Output<Integer> statusCode;

    /**
     * @return The HTTP Status Code.
     * 
     */
    public Output<Integer> statusCode() {
        return this.statusCode;
    }

    private ApiOperationResponseArgs() {}

    private ApiOperationResponseArgs(ApiOperationResponseArgs $) {
        this.description = $.description;
        this.headers = $.headers;
        this.representations = $.representations;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiOperationResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiOperationResponseArgs $;

        public Builder() {
            $ = new ApiOperationResponseArgs();
        }

        public Builder(ApiOperationResponseArgs defaults) {
            $ = new ApiOperationResponseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the HTTP Response, which may include HTML tags.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the HTTP Response, which may include HTML tags.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param headers One or more `header` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<ApiOperationResponseHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers One or more `header` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<ApiOperationResponseHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers One or more `header` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder headers(ApiOperationResponseHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param representations One or more `representation` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder representations(@Nullable Output<List<ApiOperationResponseRepresentationArgs>> representations) {
            $.representations = representations;
            return this;
        }

        /**
         * @param representations One or more `representation` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder representations(List<ApiOperationResponseRepresentationArgs> representations) {
            return representations(Output.of(representations));
        }

        /**
         * @param representations One or more `representation` blocks as defined above.
         * 
         * @return builder
         * 
         */
        public Builder representations(ApiOperationResponseRepresentationArgs... representations) {
            return representations(List.of(representations));
        }

        /**
         * @param statusCode The HTTP Status Code.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(Output<Integer> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode The HTTP Status Code.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(Integer statusCode) {
            return statusCode(Output.of(statusCode));
        }

        public ApiOperationResponseArgs build() {
            if ($.statusCode == null) {
                throw new MissingRequiredPropertyException("ApiOperationResponseArgs", "statusCode");
            }
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingHeaderArgs;
import com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiDiagnosticFrontendRequestDataMaskingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiDiagnosticFrontendRequestDataMaskingArgs Empty = new ApiDiagnosticFrontendRequestDataMaskingArgs();

    /**
     * A `headers` block as defined below.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<ApiDiagnosticFrontendRequestDataMaskingHeaderArgs>> headers;

    /**
     * @return A `headers` block as defined below.
     * 
     */
    public Optional<Output<List<ApiDiagnosticFrontendRequestDataMaskingHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * A `query_params` block as defined below.
     * 
     */
    @Import(name="queryParams")
    private @Nullable Output<List<ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs>> queryParams;

    /**
     * @return A `query_params` block as defined below.
     * 
     */
    public Optional<Output<List<ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs>>> queryParams() {
        return Optional.ofNullable(this.queryParams);
    }

    private ApiDiagnosticFrontendRequestDataMaskingArgs() {}

    private ApiDiagnosticFrontendRequestDataMaskingArgs(ApiDiagnosticFrontendRequestDataMaskingArgs $) {
        this.headers = $.headers;
        this.queryParams = $.queryParams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiDiagnosticFrontendRequestDataMaskingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiDiagnosticFrontendRequestDataMaskingArgs $;

        public Builder() {
            $ = new ApiDiagnosticFrontendRequestDataMaskingArgs();
        }

        public Builder(ApiDiagnosticFrontendRequestDataMaskingArgs defaults) {
            $ = new ApiDiagnosticFrontendRequestDataMaskingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headers A `headers` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<ApiDiagnosticFrontendRequestDataMaskingHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers A `headers` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<ApiDiagnosticFrontendRequestDataMaskingHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers A `headers` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder headers(ApiDiagnosticFrontendRequestDataMaskingHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param queryParams A `query_params` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(@Nullable Output<List<ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs>> queryParams) {
            $.queryParams = queryParams;
            return this;
        }

        /**
         * @param queryParams A `query_params` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(List<ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs> queryParams) {
            return queryParams(Output.of(queryParams));
        }

        /**
         * @param queryParams A `query_params` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs... queryParams) {
            return queryParams(List.of(queryParams));
        }

        public ApiDiagnosticFrontendRequestDataMaskingArgs build() {
            return $;
        }
    }

}

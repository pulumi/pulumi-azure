// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingHeaderArgs;
import com.pulumi.azure.apimanagement.inputs.ApiDiagnosticBackendRequestDataMaskingQueryParamArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiDiagnosticBackendRequestDataMaskingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiDiagnosticBackendRequestDataMaskingArgs Empty = new ApiDiagnosticBackendRequestDataMaskingArgs();

    /**
     * A `headers` block as defined below.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<ApiDiagnosticBackendRequestDataMaskingHeaderArgs>> headers;

    /**
     * @return A `headers` block as defined below.
     * 
     */
    public Optional<Output<List<ApiDiagnosticBackendRequestDataMaskingHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * A `query_params` block as defined below.
     * 
     */
    @Import(name="queryParams")
    private @Nullable Output<List<ApiDiagnosticBackendRequestDataMaskingQueryParamArgs>> queryParams;

    /**
     * @return A `query_params` block as defined below.
     * 
     */
    public Optional<Output<List<ApiDiagnosticBackendRequestDataMaskingQueryParamArgs>>> queryParams() {
        return Optional.ofNullable(this.queryParams);
    }

    private ApiDiagnosticBackendRequestDataMaskingArgs() {}

    private ApiDiagnosticBackendRequestDataMaskingArgs(ApiDiagnosticBackendRequestDataMaskingArgs $) {
        this.headers = $.headers;
        this.queryParams = $.queryParams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiDiagnosticBackendRequestDataMaskingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiDiagnosticBackendRequestDataMaskingArgs $;

        public Builder() {
            $ = new ApiDiagnosticBackendRequestDataMaskingArgs();
        }

        public Builder(ApiDiagnosticBackendRequestDataMaskingArgs defaults) {
            $ = new ApiDiagnosticBackendRequestDataMaskingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headers A `headers` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<ApiDiagnosticBackendRequestDataMaskingHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers A `headers` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<ApiDiagnosticBackendRequestDataMaskingHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers A `headers` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder headers(ApiDiagnosticBackendRequestDataMaskingHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param queryParams A `query_params` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(@Nullable Output<List<ApiDiagnosticBackendRequestDataMaskingQueryParamArgs>> queryParams) {
            $.queryParams = queryParams;
            return this;
        }

        /**
         * @param queryParams A `query_params` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(List<ApiDiagnosticBackendRequestDataMaskingQueryParamArgs> queryParams) {
            return queryParams(Output.of(queryParams));
        }

        /**
         * @param queryParams A `query_params` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(ApiDiagnosticBackendRequestDataMaskingQueryParamArgs... queryParams) {
            return queryParams(List.of(queryParams));
        }

        public ApiDiagnosticBackendRequestDataMaskingArgs build() {
            return $;
        }
    }

}
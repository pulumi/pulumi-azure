// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.ApiDiagnosticFrontendResponseDataMaskingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiDiagnosticFrontendResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiDiagnosticFrontendResponseArgs Empty = new ApiDiagnosticFrontendResponseArgs();

    /**
     * Number of payload bytes to log (up to 8192).
     * 
     */
    @Import(name="bodyBytes")
    private @Nullable Output<Integer> bodyBytes;

    /**
     * @return Number of payload bytes to log (up to 8192).
     * 
     */
    public Optional<Output<Integer>> bodyBytes() {
        return Optional.ofNullable(this.bodyBytes);
    }

    /**
     * A `data_masking` block as defined below.
     * 
     */
    @Import(name="dataMasking")
    private @Nullable Output<ApiDiagnosticFrontendResponseDataMaskingArgs> dataMasking;

    /**
     * @return A `data_masking` block as defined below.
     * 
     */
    public Optional<Output<ApiDiagnosticFrontendResponseDataMaskingArgs>> dataMasking() {
        return Optional.ofNullable(this.dataMasking);
    }

    /**
     * Specifies a list of headers to log.
     * 
     */
    @Import(name="headersToLogs")
    private @Nullable Output<List<String>> headersToLogs;

    /**
     * @return Specifies a list of headers to log.
     * 
     */
    public Optional<Output<List<String>>> headersToLogs() {
        return Optional.ofNullable(this.headersToLogs);
    }

    private ApiDiagnosticFrontendResponseArgs() {}

    private ApiDiagnosticFrontendResponseArgs(ApiDiagnosticFrontendResponseArgs $) {
        this.bodyBytes = $.bodyBytes;
        this.dataMasking = $.dataMasking;
        this.headersToLogs = $.headersToLogs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiDiagnosticFrontendResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiDiagnosticFrontendResponseArgs $;

        public Builder() {
            $ = new ApiDiagnosticFrontendResponseArgs();
        }

        public Builder(ApiDiagnosticFrontendResponseArgs defaults) {
            $ = new ApiDiagnosticFrontendResponseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bodyBytes Number of payload bytes to log (up to 8192).
         * 
         * @return builder
         * 
         */
        public Builder bodyBytes(@Nullable Output<Integer> bodyBytes) {
            $.bodyBytes = bodyBytes;
            return this;
        }

        /**
         * @param bodyBytes Number of payload bytes to log (up to 8192).
         * 
         * @return builder
         * 
         */
        public Builder bodyBytes(Integer bodyBytes) {
            return bodyBytes(Output.of(bodyBytes));
        }

        /**
         * @param dataMasking A `data_masking` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dataMasking(@Nullable Output<ApiDiagnosticFrontendResponseDataMaskingArgs> dataMasking) {
            $.dataMasking = dataMasking;
            return this;
        }

        /**
         * @param dataMasking A `data_masking` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dataMasking(ApiDiagnosticFrontendResponseDataMaskingArgs dataMasking) {
            return dataMasking(Output.of(dataMasking));
        }

        /**
         * @param headersToLogs Specifies a list of headers to log.
         * 
         * @return builder
         * 
         */
        public Builder headersToLogs(@Nullable Output<List<String>> headersToLogs) {
            $.headersToLogs = headersToLogs;
            return this;
        }

        /**
         * @param headersToLogs Specifies a list of headers to log.
         * 
         * @return builder
         * 
         */
        public Builder headersToLogs(List<String> headersToLogs) {
            return headersToLogs(Output.of(headersToLogs));
        }

        /**
         * @param headersToLogs Specifies a list of headers to log.
         * 
         * @return builder
         * 
         */
        public Builder headersToLogs(String... headersToLogs) {
            return headersToLogs(List.of(headersToLogs));
        }

        public ApiDiagnosticFrontendResponseArgs build() {
            return $;
        }
    }

}
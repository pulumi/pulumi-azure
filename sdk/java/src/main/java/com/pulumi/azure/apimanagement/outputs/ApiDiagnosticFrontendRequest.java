// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticFrontendRequestDataMasking;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiDiagnosticFrontendRequest {
    /**
     * @return Number of payload bytes to log (up to 8192).
     * 
     */
    private @Nullable Integer bodyBytes;
    /**
     * @return A `data_masking` block as defined below.
     * 
     */
    private @Nullable ApiDiagnosticFrontendRequestDataMasking dataMasking;
    /**
     * @return Specifies a list of headers to log.
     * 
     */
    private @Nullable List<String> headersToLogs;

    private ApiDiagnosticFrontendRequest() {}
    /**
     * @return Number of payload bytes to log (up to 8192).
     * 
     */
    public Optional<Integer> bodyBytes() {
        return Optional.ofNullable(this.bodyBytes);
    }
    /**
     * @return A `data_masking` block as defined below.
     * 
     */
    public Optional<ApiDiagnosticFrontendRequestDataMasking> dataMasking() {
        return Optional.ofNullable(this.dataMasking);
    }
    /**
     * @return Specifies a list of headers to log.
     * 
     */
    public List<String> headersToLogs() {
        return this.headersToLogs == null ? List.of() : this.headersToLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDiagnosticFrontendRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer bodyBytes;
        private @Nullable ApiDiagnosticFrontendRequestDataMasking dataMasking;
        private @Nullable List<String> headersToLogs;
        public Builder() {}
        public Builder(ApiDiagnosticFrontendRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodyBytes = defaults.bodyBytes;
    	      this.dataMasking = defaults.dataMasking;
    	      this.headersToLogs = defaults.headersToLogs;
        }

        @CustomType.Setter
        public Builder bodyBytes(@Nullable Integer bodyBytes) {
            this.bodyBytes = bodyBytes;
            return this;
        }
        @CustomType.Setter
        public Builder dataMasking(@Nullable ApiDiagnosticFrontendRequestDataMasking dataMasking) {
            this.dataMasking = dataMasking;
            return this;
        }
        @CustomType.Setter
        public Builder headersToLogs(@Nullable List<String> headersToLogs) {
            this.headersToLogs = headersToLogs;
            return this;
        }
        public Builder headersToLogs(String... headersToLogs) {
            return headersToLogs(List.of(headersToLogs));
        }
        public ApiDiagnosticFrontendRequest build() {
            final var o = new ApiDiagnosticFrontendRequest();
            o.bodyBytes = bodyBytes;
            o.dataMasking = dataMasking;
            o.headersToLogs = headersToLogs;
            return o;
        }
    }
}
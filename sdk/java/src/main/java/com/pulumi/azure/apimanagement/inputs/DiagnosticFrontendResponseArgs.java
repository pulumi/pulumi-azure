// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiagnosticFrontendResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticFrontendResponseArgs Empty = new DiagnosticFrontendResponseArgs();

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
    private @Nullable Output<DiagnosticFrontendResponseDataMaskingArgs> dataMasking;

    /**
     * @return A `data_masking` block as defined below.
     * 
     */
    public Optional<Output<DiagnosticFrontendResponseDataMaskingArgs>> dataMasking() {
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

    private DiagnosticFrontendResponseArgs() {}

    private DiagnosticFrontendResponseArgs(DiagnosticFrontendResponseArgs $) {
        this.bodyBytes = $.bodyBytes;
        this.dataMasking = $.dataMasking;
        this.headersToLogs = $.headersToLogs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticFrontendResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticFrontendResponseArgs $;

        public Builder() {
            $ = new DiagnosticFrontendResponseArgs();
        }

        public Builder(DiagnosticFrontendResponseArgs defaults) {
            $ = new DiagnosticFrontendResponseArgs(Objects.requireNonNull(defaults));
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
        public Builder dataMasking(@Nullable Output<DiagnosticFrontendResponseDataMaskingArgs> dataMasking) {
            $.dataMasking = dataMasking;
            return this;
        }

        /**
         * @param dataMasking A `data_masking` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder dataMasking(DiagnosticFrontendResponseDataMaskingArgs dataMasking) {
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

        public DiagnosticFrontendResponseArgs build() {
            return $;
        }
    }

}

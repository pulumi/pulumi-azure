// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs Empty = new StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs();

    /**
     * Label can be used to specify Content Key when creating a Streaming Locator. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return Label can be used to specify Content Key when creating a Streaming Locator. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Policy used by Default Key. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return Policy used by Default Key. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    private StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs() {}

    private StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs(StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs $) {
        this.label = $.label;
        this.policyName = $.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs $;

        public Builder() {
            $ = new StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs();
        }

        public Builder(StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs defaults) {
            $ = new StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label Label can be used to specify Content Key when creating a Streaming Locator. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Label can be used to specify Content Key when creating a Streaming Locator. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param policyName Policy used by Default Key. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Policy used by Default Key. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        public StreamingPolicyCommonEncryptionCencDefaultContentKeyArgs build() {
            return $;
        }
    }

}
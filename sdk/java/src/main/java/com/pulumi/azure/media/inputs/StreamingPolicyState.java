// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.azure.media.inputs.StreamingPolicyCommonEncryptionCbcsArgs;
import com.pulumi.azure.media.inputs.StreamingPolicyCommonEncryptionCencArgs;
import com.pulumi.azure.media.inputs.StreamingPolicyNoEncryptionEnabledProtocolsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyState Empty = new StreamingPolicyState();

    /**
     * A `common_encryption_cbcs` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="commonEncryptionCbcs")
    private @Nullable Output<StreamingPolicyCommonEncryptionCbcsArgs> commonEncryptionCbcs;

    /**
     * @return A `common_encryption_cbcs` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<StreamingPolicyCommonEncryptionCbcsArgs>> commonEncryptionCbcs() {
        return Optional.ofNullable(this.commonEncryptionCbcs);
    }

    /**
     * A `common_encryption_cenc` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="commonEncryptionCenc")
    private @Nullable Output<StreamingPolicyCommonEncryptionCencArgs> commonEncryptionCenc;

    /**
     * @return A `common_encryption_cenc` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<StreamingPolicyCommonEncryptionCencArgs>> commonEncryptionCenc() {
        return Optional.ofNullable(this.commonEncryptionCenc);
    }

    /**
     * Default Content Key used by current Streaming Policy. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="defaultContentKeyPolicyName")
    private @Nullable Output<String> defaultContentKeyPolicyName;

    /**
     * @return Default Content Key used by current Streaming Policy. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<String>> defaultContentKeyPolicyName() {
        return Optional.ofNullable(this.defaultContentKeyPolicyName);
    }

    /**
     * The Media Services account name. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="mediaServicesAccountName")
    private @Nullable Output<String> mediaServicesAccountName;

    /**
     * @return The Media Services account name. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<String>> mediaServicesAccountName() {
        return Optional.ofNullable(this.mediaServicesAccountName);
    }

    /**
     * The name which should be used for this Streaming Policy. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Streaming Policy. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `no_encryption_enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="noEncryptionEnabledProtocols")
    private @Nullable Output<StreamingPolicyNoEncryptionEnabledProtocolsArgs> noEncryptionEnabledProtocols;

    /**
     * @return A `no_encryption_enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<StreamingPolicyNoEncryptionEnabledProtocolsArgs>> noEncryptionEnabledProtocols() {
        return Optional.ofNullable(this.noEncryptionEnabledProtocols);
    }

    /**
     * The name of the Resource Group where the Streaming Policy should exist. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Streaming Policy should exist. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private StreamingPolicyState() {}

    private StreamingPolicyState(StreamingPolicyState $) {
        this.commonEncryptionCbcs = $.commonEncryptionCbcs;
        this.commonEncryptionCenc = $.commonEncryptionCenc;
        this.defaultContentKeyPolicyName = $.defaultContentKeyPolicyName;
        this.mediaServicesAccountName = $.mediaServicesAccountName;
        this.name = $.name;
        this.noEncryptionEnabledProtocols = $.noEncryptionEnabledProtocols;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingPolicyState $;

        public Builder() {
            $ = new StreamingPolicyState();
        }

        public Builder(StreamingPolicyState defaults) {
            $ = new StreamingPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param commonEncryptionCbcs A `common_encryption_cbcs` block as defined below. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder commonEncryptionCbcs(@Nullable Output<StreamingPolicyCommonEncryptionCbcsArgs> commonEncryptionCbcs) {
            $.commonEncryptionCbcs = commonEncryptionCbcs;
            return this;
        }

        /**
         * @param commonEncryptionCbcs A `common_encryption_cbcs` block as defined below. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder commonEncryptionCbcs(StreamingPolicyCommonEncryptionCbcsArgs commonEncryptionCbcs) {
            return commonEncryptionCbcs(Output.of(commonEncryptionCbcs));
        }

        /**
         * @param commonEncryptionCenc A `common_encryption_cenc` block as defined below. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder commonEncryptionCenc(@Nullable Output<StreamingPolicyCommonEncryptionCencArgs> commonEncryptionCenc) {
            $.commonEncryptionCenc = commonEncryptionCenc;
            return this;
        }

        /**
         * @param commonEncryptionCenc A `common_encryption_cenc` block as defined below. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder commonEncryptionCenc(StreamingPolicyCommonEncryptionCencArgs commonEncryptionCenc) {
            return commonEncryptionCenc(Output.of(commonEncryptionCenc));
        }

        /**
         * @param defaultContentKeyPolicyName Default Content Key used by current Streaming Policy. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder defaultContentKeyPolicyName(@Nullable Output<String> defaultContentKeyPolicyName) {
            $.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
            return this;
        }

        /**
         * @param defaultContentKeyPolicyName Default Content Key used by current Streaming Policy. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder defaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
            return defaultContentKeyPolicyName(Output.of(defaultContentKeyPolicyName));
        }

        /**
         * @param mediaServicesAccountName The Media Services account name. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder mediaServicesAccountName(@Nullable Output<String> mediaServicesAccountName) {
            $.mediaServicesAccountName = mediaServicesAccountName;
            return this;
        }

        /**
         * @param mediaServicesAccountName The Media Services account name. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder mediaServicesAccountName(String mediaServicesAccountName) {
            return mediaServicesAccountName(Output.of(mediaServicesAccountName));
        }

        /**
         * @param name The name which should be used for this Streaming Policy. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Streaming Policy. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param noEncryptionEnabledProtocols A `no_encryption_enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder noEncryptionEnabledProtocols(@Nullable Output<StreamingPolicyNoEncryptionEnabledProtocolsArgs> noEncryptionEnabledProtocols) {
            $.noEncryptionEnabledProtocols = noEncryptionEnabledProtocols;
            return this;
        }

        /**
         * @param noEncryptionEnabledProtocols A `no_encryption_enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder noEncryptionEnabledProtocols(StreamingPolicyNoEncryptionEnabledProtocolsArgs noEncryptionEnabledProtocols) {
            return noEncryptionEnabledProtocols(Output.of(noEncryptionEnabledProtocols));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Streaming Policy should exist. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Streaming Policy should exist. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public StreamingPolicyState build() {
            return $;
        }
    }

}
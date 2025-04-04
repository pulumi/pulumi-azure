// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentDaprComponentMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentDaprComponentMetadataArgs Empty = new EnvironmentDaprComponentMetadataArgs();

    /**
     * The name of the Metadata configuration item.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Metadata configuration item.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of a secret specified in the `secrets` block that contains the value for this metadata configuration item.
     * 
     */
    @Import(name="secretName")
    private @Nullable Output<String> secretName;

    /**
     * @return The name of a secret specified in the `secrets` block that contains the value for this metadata configuration item.
     * 
     */
    public Optional<Output<String>> secretName() {
        return Optional.ofNullable(this.secretName);
    }

    /**
     * The value for this metadata configuration item.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value for this metadata configuration item.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private EnvironmentDaprComponentMetadataArgs() {}

    private EnvironmentDaprComponentMetadataArgs(EnvironmentDaprComponentMetadataArgs $) {
        this.name = $.name;
        this.secretName = $.secretName;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentDaprComponentMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentDaprComponentMetadataArgs $;

        public Builder() {
            $ = new EnvironmentDaprComponentMetadataArgs();
        }

        public Builder(EnvironmentDaprComponentMetadataArgs defaults) {
            $ = new EnvironmentDaprComponentMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Metadata configuration item.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Metadata configuration item.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secretName The name of a secret specified in the `secrets` block that contains the value for this metadata configuration item.
         * 
         * @return builder
         * 
         */
        public Builder secretName(@Nullable Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName The name of a secret specified in the `secrets` block that contains the value for this metadata configuration item.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param value The value for this metadata configuration item.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value for this metadata configuration item.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EnvironmentDaprComponentMetadataArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("EnvironmentDaprComponentMetadataArgs", "name");
            }
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RunCommandErrorBlobManagedIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final RunCommandErrorBlobManagedIdentityArgs Empty = new RunCommandErrorBlobManagedIdentityArgs();

    /**
     * The client ID of the managed identity.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The client ID of the managed identity.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The object ID of the managed identity.
     * 
     */
    @Import(name="objectId")
    private @Nullable Output<String> objectId;

    /**
     * @return The object ID of the managed identity.
     * 
     */
    public Optional<Output<String>> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    private RunCommandErrorBlobManagedIdentityArgs() {}

    private RunCommandErrorBlobManagedIdentityArgs(RunCommandErrorBlobManagedIdentityArgs $) {
        this.clientId = $.clientId;
        this.objectId = $.objectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RunCommandErrorBlobManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RunCommandErrorBlobManagedIdentityArgs $;

        public Builder() {
            $ = new RunCommandErrorBlobManagedIdentityArgs();
        }

        public Builder(RunCommandErrorBlobManagedIdentityArgs defaults) {
            $ = new RunCommandErrorBlobManagedIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The client ID of the managed identity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client ID of the managed identity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param objectId The object ID of the managed identity.
         * 
         * @return builder
         * 
         */
        public Builder objectId(@Nullable Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId The object ID of the managed identity.
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        public RunCommandErrorBlobManagedIdentityArgs build() {
            return $;
        }
    }

}

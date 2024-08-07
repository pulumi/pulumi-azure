// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsAzureBlobStorageArgs;
import com.pulumi.azure.appservice.inputs.SlotLogsHttpLogsFileSystemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlotLogsHttpLogsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlotLogsHttpLogsArgs Empty = new SlotLogsHttpLogsArgs();

    /**
     * An `azure_blob_storage` block as defined below.
     * 
     */
    @Import(name="azureBlobStorage")
    private @Nullable Output<SlotLogsHttpLogsAzureBlobStorageArgs> azureBlobStorage;

    /**
     * @return An `azure_blob_storage` block as defined below.
     * 
     */
    public Optional<Output<SlotLogsHttpLogsAzureBlobStorageArgs>> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }

    /**
     * A `file_system` block as defined below.
     * 
     */
    @Import(name="fileSystem")
    private @Nullable Output<SlotLogsHttpLogsFileSystemArgs> fileSystem;

    /**
     * @return A `file_system` block as defined below.
     * 
     */
    public Optional<Output<SlotLogsHttpLogsFileSystemArgs>> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    private SlotLogsHttpLogsArgs() {}

    private SlotLogsHttpLogsArgs(SlotLogsHttpLogsArgs $) {
        this.azureBlobStorage = $.azureBlobStorage;
        this.fileSystem = $.fileSystem;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlotLogsHttpLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlotLogsHttpLogsArgs $;

        public Builder() {
            $ = new SlotLogsHttpLogsArgs();
        }

        public Builder(SlotLogsHttpLogsArgs defaults) {
            $ = new SlotLogsHttpLogsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureBlobStorage An `azure_blob_storage` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorage(@Nullable Output<SlotLogsHttpLogsAzureBlobStorageArgs> azureBlobStorage) {
            $.azureBlobStorage = azureBlobStorage;
            return this;
        }

        /**
         * @param azureBlobStorage An `azure_blob_storage` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorage(SlotLogsHttpLogsAzureBlobStorageArgs azureBlobStorage) {
            return azureBlobStorage(Output.of(azureBlobStorage));
        }

        /**
         * @param fileSystem A `file_system` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder fileSystem(@Nullable Output<SlotLogsHttpLogsFileSystemArgs> fileSystem) {
            $.fileSystem = fileSystem;
            return this;
        }

        /**
         * @param fileSystem A `file_system` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder fileSystem(SlotLogsHttpLogsFileSystemArgs fileSystem) {
            return fileSystem(Output.of(fileSystem));
        }

        public SlotLogsHttpLogsArgs build() {
            return $;
        }
    }

}

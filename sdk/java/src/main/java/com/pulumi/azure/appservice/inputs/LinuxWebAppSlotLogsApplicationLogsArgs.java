// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxWebAppSlotLogsApplicationLogsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxWebAppSlotLogsApplicationLogsArgs Empty = new LinuxWebAppSlotLogsApplicationLogsArgs();

    /**
     * An `azure_blob_storage` block as defined below.
     * 
     */
    @Import(name="azureBlobStorage")
    private @Nullable Output<LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs> azureBlobStorage;

    /**
     * @return An `azure_blob_storage` block as defined below.
     * 
     */
    public Optional<Output<LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs>> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }

    /**
     * Log level. Possible values include `Off`, `Verbose`, `Information`, `Warning`, and `Error`.
     * 
     */
    @Import(name="fileSystemLevel", required=true)
    private Output<String> fileSystemLevel;

    /**
     * @return Log level. Possible values include `Off`, `Verbose`, `Information`, `Warning`, and `Error`.
     * 
     */
    public Output<String> fileSystemLevel() {
        return this.fileSystemLevel;
    }

    private LinuxWebAppSlotLogsApplicationLogsArgs() {}

    private LinuxWebAppSlotLogsApplicationLogsArgs(LinuxWebAppSlotLogsApplicationLogsArgs $) {
        this.azureBlobStorage = $.azureBlobStorage;
        this.fileSystemLevel = $.fileSystemLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxWebAppSlotLogsApplicationLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxWebAppSlotLogsApplicationLogsArgs $;

        public Builder() {
            $ = new LinuxWebAppSlotLogsApplicationLogsArgs();
        }

        public Builder(LinuxWebAppSlotLogsApplicationLogsArgs defaults) {
            $ = new LinuxWebAppSlotLogsApplicationLogsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureBlobStorage An `azure_blob_storage` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorage(@Nullable Output<LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs> azureBlobStorage) {
            $.azureBlobStorage = azureBlobStorage;
            return this;
        }

        /**
         * @param azureBlobStorage An `azure_blob_storage` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorage(LinuxWebAppSlotLogsApplicationLogsAzureBlobStorageArgs azureBlobStorage) {
            return azureBlobStorage(Output.of(azureBlobStorage));
        }

        /**
         * @param fileSystemLevel Log level. Possible values include `Off`, `Verbose`, `Information`, `Warning`, and `Error`.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemLevel(Output<String> fileSystemLevel) {
            $.fileSystemLevel = fileSystemLevel;
            return this;
        }

        /**
         * @param fileSystemLevel Log level. Possible values include `Off`, `Verbose`, `Information`, `Warning`, and `Error`.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemLevel(String fileSystemLevel) {
            return fileSystemLevel(Output.of(fileSystemLevel));
        }

        public LinuxWebAppSlotLogsApplicationLogsArgs build() {
            if ($.fileSystemLevel == null) {
                throw new MissingRequiredPropertyException("LinuxWebAppSlotLogsApplicationLogsArgs", "fileSystemLevel");
            }
            return $;
        }
    }

}

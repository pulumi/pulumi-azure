// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetParquetAzureBlobStorageLocation {
    /**
     * @return The container on the Azure Blob Storage Account hosting the file.
     * 
     */
    private String container;
    /**
     * @return Is the `container` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    private @Nullable Boolean dynamicContainerEnabled;
    /**
     * @return Is the `filename` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    private @Nullable Boolean dynamicFilenameEnabled;
    /**
     * @return Is the `path` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    private @Nullable Boolean dynamicPathEnabled;
    /**
     * @return The filename of the file on the web server.
     * 
     */
    private @Nullable String filename;
    /**
     * @return The folder path to the file on the web server.
     * 
     */
    private String path;

    private DatasetParquetAzureBlobStorageLocation() {}
    /**
     * @return The container on the Azure Blob Storage Account hosting the file.
     * 
     */
    public String container() {
        return this.container;
    }
    /**
     * @return Is the `container` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    public Optional<Boolean> dynamicContainerEnabled() {
        return Optional.ofNullable(this.dynamicContainerEnabled);
    }
    /**
     * @return Is the `filename` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    public Optional<Boolean> dynamicFilenameEnabled() {
        return Optional.ofNullable(this.dynamicFilenameEnabled);
    }
    /**
     * @return Is the `path` using dynamic expression, function or system variables? Defaults to `false`.
     * 
     */
    public Optional<Boolean> dynamicPathEnabled() {
        return Optional.ofNullable(this.dynamicPathEnabled);
    }
    /**
     * @return The filename of the file on the web server.
     * 
     */
    public Optional<String> filename() {
        return Optional.ofNullable(this.filename);
    }
    /**
     * @return The folder path to the file on the web server.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetParquetAzureBlobStorageLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String container;
        private @Nullable Boolean dynamicContainerEnabled;
        private @Nullable Boolean dynamicFilenameEnabled;
        private @Nullable Boolean dynamicPathEnabled;
        private @Nullable String filename;
        private String path;
        public Builder() {}
        public Builder(DatasetParquetAzureBlobStorageLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.dynamicContainerEnabled = defaults.dynamicContainerEnabled;
    	      this.dynamicFilenameEnabled = defaults.dynamicFilenameEnabled;
    	      this.dynamicPathEnabled = defaults.dynamicPathEnabled;
    	      this.filename = defaults.filename;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder container(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        @CustomType.Setter
        public Builder dynamicContainerEnabled(@Nullable Boolean dynamicContainerEnabled) {
            this.dynamicContainerEnabled = dynamicContainerEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicFilenameEnabled(@Nullable Boolean dynamicFilenameEnabled) {
            this.dynamicFilenameEnabled = dynamicFilenameEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicPathEnabled(@Nullable Boolean dynamicPathEnabled) {
            this.dynamicPathEnabled = dynamicPathEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder filename(@Nullable String filename) {
            this.filename = filename;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public DatasetParquetAzureBlobStorageLocation build() {
            final var o = new DatasetParquetAzureBlobStorageLocation();
            o.container = container;
            o.dynamicContainerEnabled = dynamicContainerEnabled;
            o.dynamicFilenameEnabled = dynamicFilenameEnabled;
            o.dynamicPathEnabled = dynamicPathEnabled;
            o.filename = filename;
            o.path = path;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShareFileState extends com.pulumi.resources.ResourceArgs {

    public static final ShareFileState Empty = new ShareFileState();

    /**
     * Sets the file’s Content-Disposition header.
     * 
     */
    @Import(name="contentDisposition")
    private @Nullable Output<String> contentDisposition;

    /**
     * @return Sets the file’s Content-Disposition header.
     * 
     */
    public Optional<Output<String>> contentDisposition() {
        return Optional.ofNullable(this.contentDisposition);
    }

    /**
     * Specifies which content encodings have been applied to the file.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable Output<String> contentEncoding;

    /**
     * @return Specifies which content encodings have been applied to the file.
     * 
     */
    public Optional<Output<String>> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    /**
     * The length in bytes of the file content
     * 
     */
    @Import(name="contentLength")
    private @Nullable Output<Integer> contentLength;

    /**
     * @return The length in bytes of the file content
     * 
     */
    public Optional<Output<Integer>> contentLength() {
        return Optional.ofNullable(this.contentLength);
    }

    @Import(name="contentMd5")
    private @Nullable Output<String> contentMd5;

    public Optional<Output<String>> contentMd5() {
        return Optional.ofNullable(this.contentMd5);
    }

    /**
     * The content type of the share file. Defaults to `application/octet-stream`.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The content type of the share file. Defaults to `application/octet-stream`.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * A mapping of metadata to assign to this file.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return A mapping of metadata to assign to this file.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `&#34;&#34;`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * An absolute path to a file on the local system. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The file specified with `source` can not be empty.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return An absolute path to a file on the local system. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** The file specified with `source` can not be empty.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageShareId")
    private @Nullable Output<String> storageShareId;

    /**
     * @return The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageShareId() {
        return Optional.ofNullable(this.storageShareId);
    }

    private ShareFileState() {}

    private ShareFileState(ShareFileState $) {
        this.contentDisposition = $.contentDisposition;
        this.contentEncoding = $.contentEncoding;
        this.contentLength = $.contentLength;
        this.contentMd5 = $.contentMd5;
        this.contentType = $.contentType;
        this.metadata = $.metadata;
        this.name = $.name;
        this.path = $.path;
        this.source = $.source;
        this.storageShareId = $.storageShareId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShareFileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShareFileState $;

        public Builder() {
            $ = new ShareFileState();
        }

        public Builder(ShareFileState defaults) {
            $ = new ShareFileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentDisposition Sets the file’s Content-Disposition header.
         * 
         * @return builder
         * 
         */
        public Builder contentDisposition(@Nullable Output<String> contentDisposition) {
            $.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * @param contentDisposition Sets the file’s Content-Disposition header.
         * 
         * @return builder
         * 
         */
        public Builder contentDisposition(String contentDisposition) {
            return contentDisposition(Output.of(contentDisposition));
        }

        /**
         * @param contentEncoding Specifies which content encodings have been applied to the file.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(@Nullable Output<String> contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * @param contentEncoding Specifies which content encodings have been applied to the file.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(String contentEncoding) {
            return contentEncoding(Output.of(contentEncoding));
        }

        /**
         * @param contentLength The length in bytes of the file content
         * 
         * @return builder
         * 
         */
        public Builder contentLength(@Nullable Output<Integer> contentLength) {
            $.contentLength = contentLength;
            return this;
        }

        /**
         * @param contentLength The length in bytes of the file content
         * 
         * @return builder
         * 
         */
        public Builder contentLength(Integer contentLength) {
            return contentLength(Output.of(contentLength));
        }

        public Builder contentMd5(@Nullable Output<String> contentMd5) {
            $.contentMd5 = contentMd5;
            return this;
        }

        public Builder contentMd5(String contentMd5) {
            return contentMd5(Output.of(contentMd5));
        }

        /**
         * @param contentType The content type of the share file. Defaults to `application/octet-stream`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type of the share file. Defaults to `application/octet-stream`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param metadata A mapping of metadata to assign to this file.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A mapping of metadata to assign to this file.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The storage share directory that you would like the file placed into. Changing this forces a new resource to be created. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param source An absolute path to a file on the local system. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The file specified with `source` can not be empty.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source An absolute path to a file on the local system. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** The file specified with `source` can not be empty.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param storageShareId The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageShareId(@Nullable Output<String> storageShareId) {
            $.storageShareId = storageShareId;
            return this;
        }

        /**
         * @param storageShareId The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageShareId(String storageShareId) {
            return storageShareId(Output.of(storageShareId));
        }

        public ShareFileState build() {
            return $;
        }
    }

}

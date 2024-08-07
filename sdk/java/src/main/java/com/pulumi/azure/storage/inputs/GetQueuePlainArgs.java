// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQueuePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueuePlainArgs Empty = new GetQueuePlainArgs();

    /**
     * A mapping of MetaData for this Queue.
     * 
     */
    @Import(name="metadata")
    private @Nullable Map<String,String> metadata;

    /**
     * @return A mapping of MetaData for this Queue.
     * 
     */
    public Optional<Map<String,String>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name of the Queue.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Queue.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Storage Account where the Queue exists.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private String storageAccountName;

    /**
     * @return The name of the Storage Account where the Queue exists.
     * 
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    private GetQueuePlainArgs() {}

    private GetQueuePlainArgs(GetQueuePlainArgs $) {
        this.metadata = $.metadata;
        this.name = $.name;
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueuePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueuePlainArgs $;

        public Builder() {
            $ = new GetQueuePlainArgs();
        }

        public Builder(GetQueuePlainArgs defaults) {
            $ = new GetQueuePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata A mapping of MetaData for this Queue.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Map<String,String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param name The name of the Queue.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param storageAccountName The name of the Storage Account where the Queue exists.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public GetQueuePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetQueuePlainArgs", "name");
            }
            if ($.storageAccountName == null) {
                throw new MissingRequiredPropertyException("GetQueuePlainArgs", "storageAccountName");
            }
            return $;
        }
    }

}

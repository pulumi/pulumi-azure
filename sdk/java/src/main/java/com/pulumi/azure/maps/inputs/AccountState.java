// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountState extends com.pulumi.resources.ResourceArgs {

    public static final AccountState Empty = new AccountState();

    /**
     * The name of the Azure Maps Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Azure Maps Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The primary key used to authenticate and authorize access to the Maps REST APIs.
     * 
     */
    @Import(name="primaryAccessKey")
    private @Nullable Output<String> primaryAccessKey;

    /**
     * @return The primary key used to authenticate and authorize access to the Maps REST APIs.
     * 
     */
    public Optional<Output<String>> primaryAccessKey() {
        return Optional.ofNullable(this.primaryAccessKey);
    }

    /**
     * The name of the Resource Group in which the Azure Maps Account should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Azure Maps Account should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The secondary key used to authenticate and authorize access to the Maps REST APIs.
     * 
     */
    @Import(name="secondaryAccessKey")
    private @Nullable Output<String> secondaryAccessKey;

    /**
     * @return The secondary key used to authenticate and authorize access to the Maps REST APIs.
     * 
     */
    public Optional<Output<String>> secondaryAccessKey() {
        return Optional.ofNullable(this.secondaryAccessKey);
    }

    /**
     * The SKU of the Azure Maps Account. Possible values are `S0`, `S1` and `G2`.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return The SKU of the Azure Maps Account. Possible values are `S0`, `S1` and `G2`.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * A mapping of tags to assign to the Azure Maps Account.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Azure Maps Account.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A unique identifier for the Maps Account.
     * 
     */
    @Import(name="xMsClientId")
    private @Nullable Output<String> xMsClientId;

    /**
     * @return A unique identifier for the Maps Account.
     * 
     */
    public Optional<Output<String>> xMsClientId() {
        return Optional.ofNullable(this.xMsClientId);
    }

    private AccountState() {}

    private AccountState(AccountState $) {
        this.name = $.name;
        this.primaryAccessKey = $.primaryAccessKey;
        this.resourceGroupName = $.resourceGroupName;
        this.secondaryAccessKey = $.secondaryAccessKey;
        this.skuName = $.skuName;
        this.tags = $.tags;
        this.xMsClientId = $.xMsClientId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountState $;

        public Builder() {
            $ = new AccountState();
        }

        public Builder(AccountState defaults) {
            $ = new AccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Azure Maps Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Azure Maps Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryAccessKey The primary key used to authenticate and authorize access to the Maps REST APIs.
         * 
         * @return builder
         * 
         */
        public Builder primaryAccessKey(@Nullable Output<String> primaryAccessKey) {
            $.primaryAccessKey = primaryAccessKey;
            return this;
        }

        /**
         * @param primaryAccessKey The primary key used to authenticate and authorize access to the Maps REST APIs.
         * 
         * @return builder
         * 
         */
        public Builder primaryAccessKey(String primaryAccessKey) {
            return primaryAccessKey(Output.of(primaryAccessKey));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Azure Maps Account should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Azure Maps Account should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param secondaryAccessKey The secondary key used to authenticate and authorize access to the Maps REST APIs.
         * 
         * @return builder
         * 
         */
        public Builder secondaryAccessKey(@Nullable Output<String> secondaryAccessKey) {
            $.secondaryAccessKey = secondaryAccessKey;
            return this;
        }

        /**
         * @param secondaryAccessKey The secondary key used to authenticate and authorize access to the Maps REST APIs.
         * 
         * @return builder
         * 
         */
        public Builder secondaryAccessKey(String secondaryAccessKey) {
            return secondaryAccessKey(Output.of(secondaryAccessKey));
        }

        /**
         * @param skuName The SKU of the Azure Maps Account. Possible values are `S0`, `S1` and `G2`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The SKU of the Azure Maps Account. Possible values are `S0`, `S1` and `G2`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param tags A mapping of tags to assign to the Azure Maps Account.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the Azure Maps Account.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param xMsClientId A unique identifier for the Maps Account.
         * 
         * @return builder
         * 
         */
        public Builder xMsClientId(@Nullable Output<String> xMsClientId) {
            $.xMsClientId = xMsClientId;
            return this;
        }

        /**
         * @param xMsClientId A unique identifier for the Maps Account.
         * 
         * @return builder
         * 
         */
        public Builder xMsClientId(String xMsClientId) {
            return xMsClientId(Output.of(xMsClientId));
        }

        public AccountState build() {
            return $;
        }
    }

}
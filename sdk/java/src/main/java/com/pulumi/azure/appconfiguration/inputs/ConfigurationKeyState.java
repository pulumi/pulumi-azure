// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationKeyState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationKeyState Empty = new ConfigurationKeyState();

    /**
     * Specifies the id of the App Configuration. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="configurationStoreId")
    private @Nullable Output<String> configurationStoreId;

    /**
     * @return Specifies the id of the App Configuration. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> configurationStoreId() {
        return Optional.ofNullable(this.configurationStoreId);
    }

    /**
     * The content type of the App Configuration Key. This should only be set when type is set to `kv`.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The content type of the App Configuration Key. This should only be set when type is set to `kv`.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * (Optional) The ETag of the key.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Optional) The ETag of the key.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The name of the App Configuration Key to create. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The name of the App Configuration Key to create. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The label of the App Configuration Key. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label of the App Configuration Key. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Should this App Configuration Key be Locked to prevent changes?
     * 
     */
    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    /**
     * @return Should this App Configuration Key be Locked to prevent changes?
     * 
     */
    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the App Configuration Key. It can either be `kv` (simple [key/value](https://docs.microsoft.com/azure/azure-app-configuration/concept-key-value)) or `vault` (where the value is a reference to a [Key Vault Secret](https://azure.microsoft.com/en-gb/services/key-vault/). Defaults to `kv`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the App Configuration Key. It can either be `kv` (simple [key/value](https://docs.microsoft.com/azure/azure-app-configuration/concept-key-value)) or `vault` (where the value is a reference to a [Key Vault Secret](https://azure.microsoft.com/en-gb/services/key-vault/). Defaults to `kv`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The value of the App Configuration Key. This should only be set when type is set to `kv`.
     * 
     * &gt; **Note:** `value` and `vault_key_reference` are mutually exclusive.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the App Configuration Key. This should only be set when type is set to `kv`.
     * 
     * &gt; **Note:** `value` and `vault_key_reference` are mutually exclusive.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * The ID of the vault secret this App Configuration Key refers to. This should only be set when `type` is set to `vault`.
     * 
     * &gt; **Note:** `vault_key_reference` and `value` are mutually exclusive.
     * 
     * &gt; **Note:** When setting the `vault_key_reference` using the `id` will pin the value to specific version of the secret, to reference latest secret value use `versionless_id`
     * 
     */
    @Import(name="vaultKeyReference")
    private @Nullable Output<String> vaultKeyReference;

    /**
     * @return The ID of the vault secret this App Configuration Key refers to. This should only be set when `type` is set to `vault`.
     * 
     * &gt; **Note:** `vault_key_reference` and `value` are mutually exclusive.
     * 
     * &gt; **Note:** When setting the `vault_key_reference` using the `id` will pin the value to specific version of the secret, to reference latest secret value use `versionless_id`
     * 
     */
    public Optional<Output<String>> vaultKeyReference() {
        return Optional.ofNullable(this.vaultKeyReference);
    }

    private ConfigurationKeyState() {}

    private ConfigurationKeyState(ConfigurationKeyState $) {
        this.configurationStoreId = $.configurationStoreId;
        this.contentType = $.contentType;
        this.etag = $.etag;
        this.key = $.key;
        this.label = $.label;
        this.locked = $.locked;
        this.tags = $.tags;
        this.type = $.type;
        this.value = $.value;
        this.vaultKeyReference = $.vaultKeyReference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationKeyState $;

        public Builder() {
            $ = new ConfigurationKeyState();
        }

        public Builder(ConfigurationKeyState defaults) {
            $ = new ConfigurationKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationStoreId Specifies the id of the App Configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder configurationStoreId(@Nullable Output<String> configurationStoreId) {
            $.configurationStoreId = configurationStoreId;
            return this;
        }

        /**
         * @param configurationStoreId Specifies the id of the App Configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder configurationStoreId(String configurationStoreId) {
            return configurationStoreId(Output.of(configurationStoreId));
        }

        /**
         * @param contentType The content type of the App Configuration Key. This should only be set when type is set to `kv`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type of the App Configuration Key. This should only be set when type is set to `kv`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param etag (Optional) The ETag of the key.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Optional) The ETag of the key.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param key The name of the App Configuration Key to create. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The name of the App Configuration Key to create. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param label The label of the App Configuration Key. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the App Configuration Key. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param locked Should this App Configuration Key be Locked to prevent changes?
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param locked Should this App Configuration Key be Locked to prevent changes?
         * 
         * @return builder
         * 
         */
        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type The type of the App Configuration Key. It can either be `kv` (simple [key/value](https://docs.microsoft.com/azure/azure-app-configuration/concept-key-value)) or `vault` (where the value is a reference to a [Key Vault Secret](https://azure.microsoft.com/en-gb/services/key-vault/). Defaults to `kv`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the App Configuration Key. It can either be `kv` (simple [key/value](https://docs.microsoft.com/azure/azure-app-configuration/concept-key-value)) or `vault` (where the value is a reference to a [Key Vault Secret](https://azure.microsoft.com/en-gb/services/key-vault/). Defaults to `kv`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value of the App Configuration Key. This should only be set when type is set to `kv`.
         * 
         * &gt; **Note:** `value` and `vault_key_reference` are mutually exclusive.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the App Configuration Key. This should only be set when type is set to `kv`.
         * 
         * &gt; **Note:** `value` and `vault_key_reference` are mutually exclusive.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param vaultKeyReference The ID of the vault secret this App Configuration Key refers to. This should only be set when `type` is set to `vault`.
         * 
         * &gt; **Note:** `vault_key_reference` and `value` are mutually exclusive.
         * 
         * &gt; **Note:** When setting the `vault_key_reference` using the `id` will pin the value to specific version of the secret, to reference latest secret value use `versionless_id`
         * 
         * @return builder
         * 
         */
        public Builder vaultKeyReference(@Nullable Output<String> vaultKeyReference) {
            $.vaultKeyReference = vaultKeyReference;
            return this;
        }

        /**
         * @param vaultKeyReference The ID of the vault secret this App Configuration Key refers to. This should only be set when `type` is set to `vault`.
         * 
         * &gt; **Note:** `vault_key_reference` and `value` are mutually exclusive.
         * 
         * &gt; **Note:** When setting the `vault_key_reference` using the `id` will pin the value to specific version of the secret, to reference latest secret value use `versionless_id`
         * 
         * @return builder
         * 
         */
        public Builder vaultKeyReference(String vaultKeyReference) {
            return vaultKeyReference(Output.of(vaultKeyReference));
        }

        public ConfigurationKeyState build() {
            return $;
        }
    }

}

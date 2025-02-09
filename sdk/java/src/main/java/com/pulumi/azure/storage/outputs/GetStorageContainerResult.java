// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStorageContainerResult {
    /**
     * @return The Access Level configured for this Container.
     * 
     */
    private String containerAccessType;
    /**
     * @return The default encryption scope in use for blobs uploaded to this container.
     * 
     */
    private String defaultEncryptionScope;
    /**
     * @return Whether blobs are allowed to override the default encryption scope for this container.
     * 
     */
    private Boolean encryptionScopeOverrideEnabled;
    /**
     * @return Is there an Immutability Policy configured on this Storage Container?
     * 
     */
    private Boolean hasImmutabilityPolicy;
    /**
     * @return Is there a Legal Hold configured on this Storage Container?
     * 
     */
    private Boolean hasLegalHold;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A mapping of MetaData for this Container.
     * 
     */
    private Map<String,String> metadata;
    private String name;
    /**
     * @deprecated
     * this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider.
     * 
     */
    @Deprecated /* this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider. */
    private String resourceManagerId;
    private @Nullable String storageAccountId;
    private @Nullable String storageAccountName;

    private GetStorageContainerResult() {}
    /**
     * @return The Access Level configured for this Container.
     * 
     */
    public String containerAccessType() {
        return this.containerAccessType;
    }
    /**
     * @return The default encryption scope in use for blobs uploaded to this container.
     * 
     */
    public String defaultEncryptionScope() {
        return this.defaultEncryptionScope;
    }
    /**
     * @return Whether blobs are allowed to override the default encryption scope for this container.
     * 
     */
    public Boolean encryptionScopeOverrideEnabled() {
        return this.encryptionScopeOverrideEnabled;
    }
    /**
     * @return Is there an Immutability Policy configured on this Storage Container?
     * 
     */
    public Boolean hasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }
    /**
     * @return Is there a Legal Hold configured on this Storage Container?
     * 
     */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A mapping of MetaData for this Container.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    public String name() {
        return this.name;
    }
    /**
     * @deprecated
     * this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider.
     * 
     */
    @Deprecated /* this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider. */
    public String resourceManagerId() {
        return this.resourceManagerId;
    }
    public Optional<String> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }
    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageContainerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerAccessType;
        private String defaultEncryptionScope;
        private Boolean encryptionScopeOverrideEnabled;
        private Boolean hasImmutabilityPolicy;
        private Boolean hasLegalHold;
        private String id;
        private Map<String,String> metadata;
        private String name;
        private String resourceManagerId;
        private @Nullable String storageAccountId;
        private @Nullable String storageAccountName;
        public Builder() {}
        public Builder(GetStorageContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerAccessType = defaults.containerAccessType;
    	      this.defaultEncryptionScope = defaults.defaultEncryptionScope;
    	      this.encryptionScopeOverrideEnabled = defaults.encryptionScopeOverrideEnabled;
    	      this.hasImmutabilityPolicy = defaults.hasImmutabilityPolicy;
    	      this.hasLegalHold = defaults.hasLegalHold;
    	      this.id = defaults.id;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.resourceManagerId = defaults.resourceManagerId;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        @CustomType.Setter
        public Builder containerAccessType(String containerAccessType) {
            if (containerAccessType == null) {
              throw new MissingRequiredPropertyException("GetStorageContainerResult", "containerAccessType");
            }
            this.containerAccessType = containerAccessType;
            return this;
        }
        @CustomType.Setter
        public Builder defaultEncryptionScope(String defaultEncryptionScope) {
            if (defaultEncryptionScope == null) {
              throw new MissingRequiredPropertyException("GetStorageContainerResult", "defaultEncryptionScope");
            }
            this.defaultEncryptionScope = defaultEncryptionScope;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionScopeOverrideEnabled(Boolean encryptionScopeOverrideEnabled) {
            if (encryptionScopeOverrideEnabled == null) {
              throw new MissingRequiredPropertyException("GetStorageContainerResult", "encryptionScopeOverrideEnabled");
            }
            this.encryptionScopeOverrideEnabled = encryptionScopeOverrideEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder hasImmutabilityPolicy(Boolean hasImmutabilityPolicy) {
            if (hasImmutabilityPolicy == null) {
              throw new MissingRequiredPropertyException("GetStorageContainerResult", "hasImmutabilityPolicy");
            }
            this.hasImmutabilityPolicy = hasImmutabilityPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder hasLegalHold(Boolean hasLegalHold) {
            if (hasLegalHold == null) {
              throw new MissingRequiredPropertyException("GetStorageContainerResult", "hasLegalHold");
            }
            this.hasLegalHold = hasLegalHold;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStorageContainerResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(Map<String,String> metadata) {
            if (metadata == null) {
              throw new MissingRequiredPropertyException("GetStorageContainerResult", "metadata");
            }
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetStorageContainerResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceManagerId(String resourceManagerId) {
            if (resourceManagerId == null) {
              throw new MissingRequiredPropertyException("GetStorageContainerResult", "resourceManagerId");
            }
            this.resourceManagerId = resourceManagerId;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountId(@Nullable String storageAccountId) {

            this.storageAccountId = storageAccountId;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(@Nullable String storageAccountName) {

            this.storageAccountName = storageAccountName;
            return this;
        }
        public GetStorageContainerResult build() {
            final var _resultValue = new GetStorageContainerResult();
            _resultValue.containerAccessType = containerAccessType;
            _resultValue.defaultEncryptionScope = defaultEncryptionScope;
            _resultValue.encryptionScopeOverrideEnabled = encryptionScopeOverrideEnabled;
            _resultValue.hasImmutabilityPolicy = hasImmutabilityPolicy;
            _resultValue.hasLegalHold = hasLegalHold;
            _resultValue.id = id;
            _resultValue.metadata = metadata;
            _resultValue.name = name;
            _resultValue.resourceManagerId = resourceManagerId;
            _resultValue.storageAccountId = storageAccountId;
            _resultValue.storageAccountName = storageAccountName;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseImport {
    /**
     * @return Specifies the name of the SQL administrator.
     * 
     */
    private String administratorLogin;
    /**
     * @return Specifies the password of the SQL administrator.
     * 
     */
    private String administratorLoginPassword;
    /**
     * @return Specifies the type of authentication used to access the server. Valid values are `SQL` or `ADPassword`.
     * 
     */
    private String authenticationType;
    /**
     * @return The resource id for the storage account used to store BACPAC file. If set, private endpoint connection will be created for the storage account. Must match storage account used for storage_uri parameter.
     * 
     */
    private @Nullable String storageAccountId;
    /**
     * @return Specifies the access key for the storage account.
     * 
     */
    private String storageKey;
    /**
     * @return Specifies the type of access key for the storage account. Valid values are `StorageAccessKey` or `SharedAccessKey`.
     * 
     */
    private String storageKeyType;
    /**
     * @return Specifies the blob URI of the .bacpac file.
     * 
     */
    private String storageUri;

    private DatabaseImport() {}
    /**
     * @return Specifies the name of the SQL administrator.
     * 
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }
    /**
     * @return Specifies the password of the SQL administrator.
     * 
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }
    /**
     * @return Specifies the type of authentication used to access the server. Valid values are `SQL` or `ADPassword`.
     * 
     */
    public String authenticationType() {
        return this.authenticationType;
    }
    /**
     * @return The resource id for the storage account used to store BACPAC file. If set, private endpoint connection will be created for the storage account. Must match storage account used for storage_uri parameter.
     * 
     */
    public Optional<String> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }
    /**
     * @return Specifies the access key for the storage account.
     * 
     */
    public String storageKey() {
        return this.storageKey;
    }
    /**
     * @return Specifies the type of access key for the storage account. Valid values are `StorageAccessKey` or `SharedAccessKey`.
     * 
     */
    public String storageKeyType() {
        return this.storageKeyType;
    }
    /**
     * @return Specifies the blob URI of the .bacpac file.
     * 
     */
    public String storageUri() {
        return this.storageUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseImport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String administratorLogin;
        private String administratorLoginPassword;
        private String authenticationType;
        private @Nullable String storageAccountId;
        private String storageKey;
        private String storageKeyType;
        private String storageUri;
        public Builder() {}
        public Builder(DatabaseImport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administratorLoginPassword = defaults.administratorLoginPassword;
    	      this.authenticationType = defaults.authenticationType;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.storageKey = defaults.storageKey;
    	      this.storageKeyType = defaults.storageKeyType;
    	      this.storageUri = defaults.storageUri;
        }

        @CustomType.Setter
        public Builder administratorLogin(String administratorLogin) {
            this.administratorLogin = Objects.requireNonNull(administratorLogin);
            return this;
        }
        @CustomType.Setter
        public Builder administratorLoginPassword(String administratorLoginPassword) {
            this.administratorLoginPassword = Objects.requireNonNull(administratorLoginPassword);
            return this;
        }
        @CustomType.Setter
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }
        @CustomType.Setter
        public Builder storageKey(String storageKey) {
            this.storageKey = Objects.requireNonNull(storageKey);
            return this;
        }
        @CustomType.Setter
        public Builder storageKeyType(String storageKeyType) {
            this.storageKeyType = Objects.requireNonNull(storageKeyType);
            return this;
        }
        @CustomType.Setter
        public Builder storageUri(String storageUri) {
            this.storageUri = Objects.requireNonNull(storageUri);
            return this;
        }
        public DatabaseImport build() {
            final var o = new DatabaseImport();
            o.administratorLogin = administratorLogin;
            o.administratorLoginPassword = administratorLoginPassword;
            o.authenticationType = authenticationType;
            o.storageAccountId = storageAccountId;
            o.storageKey = storageKey;
            o.storageKeyType = storageKeyType;
            o.storageUri = storageUri;
            return o;
        }
    }
}
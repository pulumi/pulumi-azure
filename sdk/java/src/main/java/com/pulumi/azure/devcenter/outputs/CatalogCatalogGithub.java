// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devcenter.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CatalogCatalogGithub {
    private String branch;
    private String keyVaultKeyUrl;
    private String path;
    private String uri;

    private CatalogCatalogGithub() {}
    public String branch() {
        return this.branch;
    }
    public String keyVaultKeyUrl() {
        return this.keyVaultKeyUrl;
    }
    public String path() {
        return this.path;
    }
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogCatalogGithub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String branch;
        private String keyVaultKeyUrl;
        private String path;
        private String uri;
        public Builder() {}
        public Builder(CatalogCatalogGithub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.keyVaultKeyUrl = defaults.keyVaultKeyUrl;
    	      this.path = defaults.path;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder branch(String branch) {
            if (branch == null) {
              throw new MissingRequiredPropertyException("CatalogCatalogGithub", "branch");
            }
            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultKeyUrl(String keyVaultKeyUrl) {
            if (keyVaultKeyUrl == null) {
              throw new MissingRequiredPropertyException("CatalogCatalogGithub", "keyVaultKeyUrl");
            }
            this.keyVaultKeyUrl = keyVaultKeyUrl;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("CatalogCatalogGithub", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            if (uri == null) {
              throw new MissingRequiredPropertyException("CatalogCatalogGithub", "uri");
            }
            this.uri = uri;
            return this;
        }
        public CatalogCatalogGithub build() {
            final var _resultValue = new CatalogCatalogGithub();
            _resultValue.branch = branch;
            _resultValue.keyVaultKeyUrl = keyVaultKeyUrl;
            _resultValue.path = path;
            _resultValue.uri = uri;
            return _resultValue;
        }
    }
}

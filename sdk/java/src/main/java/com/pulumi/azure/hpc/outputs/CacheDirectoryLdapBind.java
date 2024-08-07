// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hpc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CacheDirectoryLdapBind {
    /**
     * @return The Bind Distinguished Name (DN) identity to be used in the secure LDAP connection.
     * 
     */
    private String dn;
    /**
     * @return The Bind password to be used in the secure LDAP connection.
     * 
     */
    private String password;

    private CacheDirectoryLdapBind() {}
    /**
     * @return The Bind Distinguished Name (DN) identity to be used in the secure LDAP connection.
     * 
     */
    public String dn() {
        return this.dn;
    }
    /**
     * @return The Bind password to be used in the secure LDAP connection.
     * 
     */
    public String password() {
        return this.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheDirectoryLdapBind defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dn;
        private String password;
        public Builder() {}
        public Builder(CacheDirectoryLdapBind defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dn = defaults.dn;
    	      this.password = defaults.password;
        }

        @CustomType.Setter
        public Builder dn(String dn) {
            if (dn == null) {
              throw new MissingRequiredPropertyException("CacheDirectoryLdapBind", "dn");
            }
            this.dn = dn;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("CacheDirectoryLdapBind", "password");
            }
            this.password = password;
            return this;
        }
        public CacheDirectoryLdapBind build() {
            final var _resultValue = new CacheDirectoryLdapBind();
            _resultValue.dn = dn;
            _resultValue.password = password;
            return _resultValue;
        }
    }
}

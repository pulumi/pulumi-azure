// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultContact {
    /**
     * @return E-mail address of the contact.
     * 
     */
    private String email;
    /**
     * @return Name of the contact.
     * 
     */
    private @Nullable String name;
    /**
     * @return Phone number of the contact.
     * 
     */
    private @Nullable String phone;

    private KeyVaultContact() {}
    /**
     * @return E-mail address of the contact.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return Name of the contact.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Phone number of the contact.
     * 
     */
    public Optional<String> phone() {
        return Optional.ofNullable(this.phone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultContact defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private @Nullable String name;
        private @Nullable String phone;
        public Builder() {}
        public Builder(KeyVaultContact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.name = defaults.name;
    	      this.phone = defaults.phone;
        }

        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder phone(@Nullable String phone) {
            this.phone = phone;
            return this;
        }
        public KeyVaultContact build() {
            final var o = new KeyVaultContact();
            o.email = email;
            o.name = name;
            o.phone = phone;
            return o;
        }
    }
}
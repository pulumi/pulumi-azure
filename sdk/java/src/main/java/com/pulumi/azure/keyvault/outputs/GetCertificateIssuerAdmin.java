// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateIssuerAdmin {
    /**
     * @return E-mail address of the admin.
     * 
     */
    private String emailAddress;
    /**
     * @return First name of the admin.
     * 
     */
    private String firstName;
    /**
     * @return Last name of the admin.
     * 
     */
    private String lastName;
    /**
     * @return Phone number of the admin.
     * 
     */
    private String phone;

    private GetCertificateIssuerAdmin() {}
    /**
     * @return E-mail address of the admin.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return First name of the admin.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    /**
     * @return Last name of the admin.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    /**
     * @return Phone number of the admin.
     * 
     */
    public String phone() {
        return this.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateIssuerAdmin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String emailAddress;
        private String firstName;
        private String lastName;
        private String phone;
        public Builder() {}
        public Builder(GetCertificateIssuerAdmin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phone = defaults.phone;
        }

        @CustomType.Setter
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        @CustomType.Setter
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        public GetCertificateIssuerAdmin build() {
            final var o = new GetCertificateIssuerAdmin();
            o.emailAddress = emailAddress;
            o.firstName = firstName;
            o.lastName = lastName;
            o.phone = phone;
            return o;
        }
    }
}
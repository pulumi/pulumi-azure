// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetApplicationGatewaySslProfileSslPolicy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationGatewaySslProfile {
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private String id;
    /**
     * @return The name of this Application Gateway.
     * 
     */
    private String name;
    /**
     * @return a `ssl_policy` block as defined below.
     * 
     */
    private List<GetApplicationGatewaySslProfileSslPolicy> sslPolicies;
    /**
     * @return The name of the Trusted Client Certificate that will be used to authenticate requests from clients.
     * 
     */
    private List<String> trustedClientCertificateNames;
    private Boolean verifyClientCertificateIssuerDn;
    /**
     * @return The method used to check client certificate revocation status.
     * 
     */
    private String verifyClientCertificateRevocation;

    private GetApplicationGatewaySslProfile() {}
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of this Application Gateway.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return a `ssl_policy` block as defined below.
     * 
     */
    public List<GetApplicationGatewaySslProfileSslPolicy> sslPolicies() {
        return this.sslPolicies;
    }
    /**
     * @return The name of the Trusted Client Certificate that will be used to authenticate requests from clients.
     * 
     */
    public List<String> trustedClientCertificateNames() {
        return this.trustedClientCertificateNames;
    }
    public Boolean verifyClientCertificateIssuerDn() {
        return this.verifyClientCertificateIssuerDn;
    }
    /**
     * @return The method used to check client certificate revocation status.
     * 
     */
    public String verifyClientCertificateRevocation() {
        return this.verifyClientCertificateRevocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGatewaySslProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private List<GetApplicationGatewaySslProfileSslPolicy> sslPolicies;
        private List<String> trustedClientCertificateNames;
        private Boolean verifyClientCertificateIssuerDn;
        private String verifyClientCertificateRevocation;
        public Builder() {}
        public Builder(GetApplicationGatewaySslProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sslPolicies = defaults.sslPolicies;
    	      this.trustedClientCertificateNames = defaults.trustedClientCertificateNames;
    	      this.verifyClientCertificateIssuerDn = defaults.verifyClientCertificateIssuerDn;
    	      this.verifyClientCertificateRevocation = defaults.verifyClientCertificateRevocation;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewaySslProfile", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewaySslProfile", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sslPolicies(List<GetApplicationGatewaySslProfileSslPolicy> sslPolicies) {
            if (sslPolicies == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewaySslProfile", "sslPolicies");
            }
            this.sslPolicies = sslPolicies;
            return this;
        }
        public Builder sslPolicies(GetApplicationGatewaySslProfileSslPolicy... sslPolicies) {
            return sslPolicies(List.of(sslPolicies));
        }
        @CustomType.Setter
        public Builder trustedClientCertificateNames(List<String> trustedClientCertificateNames) {
            if (trustedClientCertificateNames == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewaySslProfile", "trustedClientCertificateNames");
            }
            this.trustedClientCertificateNames = trustedClientCertificateNames;
            return this;
        }
        public Builder trustedClientCertificateNames(String... trustedClientCertificateNames) {
            return trustedClientCertificateNames(List.of(trustedClientCertificateNames));
        }
        @CustomType.Setter
        public Builder verifyClientCertificateIssuerDn(Boolean verifyClientCertificateIssuerDn) {
            if (verifyClientCertificateIssuerDn == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewaySslProfile", "verifyClientCertificateIssuerDn");
            }
            this.verifyClientCertificateIssuerDn = verifyClientCertificateIssuerDn;
            return this;
        }
        @CustomType.Setter
        public Builder verifyClientCertificateRevocation(String verifyClientCertificateRevocation) {
            if (verifyClientCertificateRevocation == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewaySslProfile", "verifyClientCertificateRevocation");
            }
            this.verifyClientCertificateRevocation = verifyClientCertificateRevocation;
            return this;
        }
        public GetApplicationGatewaySslProfile build() {
            final var _resultValue = new GetApplicationGatewaySslProfile();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.sslPolicies = sslPolicies;
            _resultValue.trustedClientCertificateNames = trustedClientCertificateNames;
            _resultValue.verifyClientCertificateIssuerDn = verifyClientCertificateIssuerDn;
            _resultValue.verifyClientCertificateRevocation = verifyClientCertificateRevocation;
            return _resultValue;
        }
    }
}

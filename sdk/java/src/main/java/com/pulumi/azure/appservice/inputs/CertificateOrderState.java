// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.CertificateOrderCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateOrderState extends com.pulumi.resources.ResourceArgs {

    public static final CertificateOrderState Empty = new CertificateOrderState();

    /**
     * Reasons why App Service Certificate is not renewable at the current moment.
     * 
     */
    @Import(name="appServiceCertificateNotRenewableReasons")
    private @Nullable Output<List<String>> appServiceCertificateNotRenewableReasons;

    /**
     * @return Reasons why App Service Certificate is not renewable at the current moment.
     * 
     */
    public Optional<Output<List<String>>> appServiceCertificateNotRenewableReasons() {
        return Optional.ofNullable(this.appServiceCertificateNotRenewableReasons);
    }

    /**
     * true if the certificate should be automatically renewed when it expires; otherwise, false. Defaults to `true`.
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return true if the certificate should be automatically renewed when it expires; otherwise, false. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * State of the Key Vault secret. A `certificates` block as defined below.
     * 
     */
    @Import(name="certificates")
    private @Nullable Output<List<CertificateOrderCertificateArgs>> certificates;

    /**
     * @return State of the Key Vault secret. A `certificates` block as defined below.
     * 
     */
    public Optional<Output<List<CertificateOrderCertificateArgs>>> certificates() {
        return Optional.ofNullable(this.certificates);
    }

    /**
     * Last CSR that was created for this order.
     * 
     */
    @Import(name="csr")
    private @Nullable Output<String> csr;

    /**
     * @return Last CSR that was created for this order.
     * 
     */
    public Optional<Output<String>> csr() {
        return Optional.ofNullable(this.csr);
    }

    /**
     * The Distinguished Name for the App Service Certificate Order.
     * 
     * &gt; **Note:** Either `csr` or `distinguished_name` must be set - but not both.
     * 
     */
    @Import(name="distinguishedName")
    private @Nullable Output<String> distinguishedName;

    /**
     * @return The Distinguished Name for the App Service Certificate Order.
     * 
     * &gt; **Note:** Either `csr` or `distinguished_name` must be set - but not both.
     * 
     */
    public Optional<Output<String>> distinguishedName() {
        return Optional.ofNullable(this.distinguishedName);
    }

    /**
     * Domain verification token.
     * 
     */
    @Import(name="domainVerificationToken")
    private @Nullable Output<String> domainVerificationToken;

    /**
     * @return Domain verification token.
     * 
     */
    public Optional<Output<String>> domainVerificationToken() {
        return Optional.ofNullable(this.domainVerificationToken);
    }

    /**
     * Certificate expiration time.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return Certificate expiration time.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * Certificate thumbprint intermediate certificate.
     * 
     */
    @Import(name="intermediateThumbprint")
    private @Nullable Output<String> intermediateThumbprint;

    /**
     * @return Certificate thumbprint intermediate certificate.
     * 
     */
    public Optional<Output<String>> intermediateThumbprint() {
        return Optional.ofNullable(this.intermediateThumbprint);
    }

    /**
     * Whether the private key is external or not.
     * 
     */
    @Import(name="isPrivateKeyExternal")
    private @Nullable Output<Boolean> isPrivateKeyExternal;

    /**
     * @return Whether the private key is external or not.
     * 
     */
    public Optional<Output<Boolean>> isPrivateKeyExternal() {
        return Optional.ofNullable(this.isPrivateKeyExternal);
    }

    /**
     * Certificate key size. Defaults to `2048`.
     * 
     */
    @Import(name="keySize")
    private @Nullable Output<Integer> keySize;

    /**
     * @return Certificate key size. Defaults to `2048`.
     * 
     */
    public Optional<Output<Integer>> keySize() {
        return Optional.ofNullable(this.keySize);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Currently the only valid value is `global`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Currently the only valid value is `global`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Certificate product type, such as `Standard` or `WildCard`. Defaults to `Standard`.
     * 
     */
    @Import(name="productType")
    private @Nullable Output<String> productType;

    /**
     * @return Certificate product type, such as `Standard` or `WildCard`. Defaults to `Standard`.
     * 
     */
    public Optional<Output<String>> productType() {
        return Optional.ofNullable(this.productType);
    }

    /**
     * The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * Certificate thumbprint for root certificate.
     * 
     */
    @Import(name="rootThumbprint")
    private @Nullable Output<String> rootThumbprint;

    /**
     * @return Certificate thumbprint for root certificate.
     * 
     */
    public Optional<Output<String>> rootThumbprint() {
        return Optional.ofNullable(this.rootThumbprint);
    }

    /**
     * Certificate thumbprint for signed certificate.
     * 
     */
    @Import(name="signedCertificateThumbprint")
    private @Nullable Output<String> signedCertificateThumbprint;

    /**
     * @return Certificate thumbprint for signed certificate.
     * 
     */
    public Optional<Output<String>> signedCertificateThumbprint() {
        return Optional.ofNullable(this.signedCertificateThumbprint);
    }

    /**
     * Current order status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Current order status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * (Optional) A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return (Optional) A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Duration in years (must be between `1` and `3`). Defaults to `1`.
     * 
     */
    @Import(name="validityInYears")
    private @Nullable Output<Integer> validityInYears;

    /**
     * @return Duration in years (must be between `1` and `3`). Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> validityInYears() {
        return Optional.ofNullable(this.validityInYears);
    }

    private CertificateOrderState() {}

    private CertificateOrderState(CertificateOrderState $) {
        this.appServiceCertificateNotRenewableReasons = $.appServiceCertificateNotRenewableReasons;
        this.autoRenew = $.autoRenew;
        this.certificates = $.certificates;
        this.csr = $.csr;
        this.distinguishedName = $.distinguishedName;
        this.domainVerificationToken = $.domainVerificationToken;
        this.expirationTime = $.expirationTime;
        this.intermediateThumbprint = $.intermediateThumbprint;
        this.isPrivateKeyExternal = $.isPrivateKeyExternal;
        this.keySize = $.keySize;
        this.location = $.location;
        this.name = $.name;
        this.productType = $.productType;
        this.resourceGroupName = $.resourceGroupName;
        this.rootThumbprint = $.rootThumbprint;
        this.signedCertificateThumbprint = $.signedCertificateThumbprint;
        this.status = $.status;
        this.tags = $.tags;
        this.validityInYears = $.validityInYears;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateOrderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateOrderState $;

        public Builder() {
            $ = new CertificateOrderState();
        }

        public Builder(CertificateOrderState defaults) {
            $ = new CertificateOrderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appServiceCertificateNotRenewableReasons Reasons why App Service Certificate is not renewable at the current moment.
         * 
         * @return builder
         * 
         */
        public Builder appServiceCertificateNotRenewableReasons(@Nullable Output<List<String>> appServiceCertificateNotRenewableReasons) {
            $.appServiceCertificateNotRenewableReasons = appServiceCertificateNotRenewableReasons;
            return this;
        }

        /**
         * @param appServiceCertificateNotRenewableReasons Reasons why App Service Certificate is not renewable at the current moment.
         * 
         * @return builder
         * 
         */
        public Builder appServiceCertificateNotRenewableReasons(List<String> appServiceCertificateNotRenewableReasons) {
            return appServiceCertificateNotRenewableReasons(Output.of(appServiceCertificateNotRenewableReasons));
        }

        /**
         * @param appServiceCertificateNotRenewableReasons Reasons why App Service Certificate is not renewable at the current moment.
         * 
         * @return builder
         * 
         */
        public Builder appServiceCertificateNotRenewableReasons(String... appServiceCertificateNotRenewableReasons) {
            return appServiceCertificateNotRenewableReasons(List.of(appServiceCertificateNotRenewableReasons));
        }

        /**
         * @param autoRenew true if the certificate should be automatically renewed when it expires; otherwise, false. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew true if the certificate should be automatically renewed when it expires; otherwise, false. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param certificates State of the Key Vault secret. A `certificates` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificates(@Nullable Output<List<CertificateOrderCertificateArgs>> certificates) {
            $.certificates = certificates;
            return this;
        }

        /**
         * @param certificates State of the Key Vault secret. A `certificates` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificates(List<CertificateOrderCertificateArgs> certificates) {
            return certificates(Output.of(certificates));
        }

        /**
         * @param certificates State of the Key Vault secret. A `certificates` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificates(CertificateOrderCertificateArgs... certificates) {
            return certificates(List.of(certificates));
        }

        /**
         * @param csr Last CSR that was created for this order.
         * 
         * @return builder
         * 
         */
        public Builder csr(@Nullable Output<String> csr) {
            $.csr = csr;
            return this;
        }

        /**
         * @param csr Last CSR that was created for this order.
         * 
         * @return builder
         * 
         */
        public Builder csr(String csr) {
            return csr(Output.of(csr));
        }

        /**
         * @param distinguishedName The Distinguished Name for the App Service Certificate Order.
         * 
         * &gt; **Note:** Either `csr` or `distinguished_name` must be set - but not both.
         * 
         * @return builder
         * 
         */
        public Builder distinguishedName(@Nullable Output<String> distinguishedName) {
            $.distinguishedName = distinguishedName;
            return this;
        }

        /**
         * @param distinguishedName The Distinguished Name for the App Service Certificate Order.
         * 
         * &gt; **Note:** Either `csr` or `distinguished_name` must be set - but not both.
         * 
         * @return builder
         * 
         */
        public Builder distinguishedName(String distinguishedName) {
            return distinguishedName(Output.of(distinguishedName));
        }

        /**
         * @param domainVerificationToken Domain verification token.
         * 
         * @return builder
         * 
         */
        public Builder domainVerificationToken(@Nullable Output<String> domainVerificationToken) {
            $.domainVerificationToken = domainVerificationToken;
            return this;
        }

        /**
         * @param domainVerificationToken Domain verification token.
         * 
         * @return builder
         * 
         */
        public Builder domainVerificationToken(String domainVerificationToken) {
            return domainVerificationToken(Output.of(domainVerificationToken));
        }

        /**
         * @param expirationTime Certificate expiration time.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime Certificate expiration time.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param intermediateThumbprint Certificate thumbprint intermediate certificate.
         * 
         * @return builder
         * 
         */
        public Builder intermediateThumbprint(@Nullable Output<String> intermediateThumbprint) {
            $.intermediateThumbprint = intermediateThumbprint;
            return this;
        }

        /**
         * @param intermediateThumbprint Certificate thumbprint intermediate certificate.
         * 
         * @return builder
         * 
         */
        public Builder intermediateThumbprint(String intermediateThumbprint) {
            return intermediateThumbprint(Output.of(intermediateThumbprint));
        }

        /**
         * @param isPrivateKeyExternal Whether the private key is external or not.
         * 
         * @return builder
         * 
         */
        public Builder isPrivateKeyExternal(@Nullable Output<Boolean> isPrivateKeyExternal) {
            $.isPrivateKeyExternal = isPrivateKeyExternal;
            return this;
        }

        /**
         * @param isPrivateKeyExternal Whether the private key is external or not.
         * 
         * @return builder
         * 
         */
        public Builder isPrivateKeyExternal(Boolean isPrivateKeyExternal) {
            return isPrivateKeyExternal(Output.of(isPrivateKeyExternal));
        }

        /**
         * @param keySize Certificate key size. Defaults to `2048`.
         * 
         * @return builder
         * 
         */
        public Builder keySize(@Nullable Output<Integer> keySize) {
            $.keySize = keySize;
            return this;
        }

        /**
         * @param keySize Certificate key size. Defaults to `2048`.
         * 
         * @return builder
         * 
         */
        public Builder keySize(Integer keySize) {
            return keySize(Output.of(keySize));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Currently the only valid value is `global`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Currently the only valid value is `global`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param productType Certificate product type, such as `Standard` or `WildCard`. Defaults to `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder productType(@Nullable Output<String> productType) {
            $.productType = productType;
            return this;
        }

        /**
         * @param productType Certificate product type, such as `Standard` or `WildCard`. Defaults to `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder productType(String productType) {
            return productType(Output.of(productType));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param rootThumbprint Certificate thumbprint for root certificate.
         * 
         * @return builder
         * 
         */
        public Builder rootThumbprint(@Nullable Output<String> rootThumbprint) {
            $.rootThumbprint = rootThumbprint;
            return this;
        }

        /**
         * @param rootThumbprint Certificate thumbprint for root certificate.
         * 
         * @return builder
         * 
         */
        public Builder rootThumbprint(String rootThumbprint) {
            return rootThumbprint(Output.of(rootThumbprint));
        }

        /**
         * @param signedCertificateThumbprint Certificate thumbprint for signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder signedCertificateThumbprint(@Nullable Output<String> signedCertificateThumbprint) {
            $.signedCertificateThumbprint = signedCertificateThumbprint;
            return this;
        }

        /**
         * @param signedCertificateThumbprint Certificate thumbprint for signed certificate.
         * 
         * @return builder
         * 
         */
        public Builder signedCertificateThumbprint(String signedCertificateThumbprint) {
            return signedCertificateThumbprint(Output.of(signedCertificateThumbprint));
        }

        /**
         * @param status Current order status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Current order status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags (Optional) A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags (Optional) A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param validityInYears Duration in years (must be between `1` and `3`). Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder validityInYears(@Nullable Output<Integer> validityInYears) {
            $.validityInYears = validityInYears;
            return this;
        }

        /**
         * @param validityInYears Duration in years (must be between `1` and `3`). Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder validityInYears(Integer validityInYears) {
            return validityInYears(Output.of(validityInYears));
        }

        public CertificateOrderState build() {
            return $;
        }
    }

}

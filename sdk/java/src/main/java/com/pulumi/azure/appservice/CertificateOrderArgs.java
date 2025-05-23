// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateOrderArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateOrderArgs Empty = new CertificateOrderArgs();

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
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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

    private CertificateOrderArgs() {}

    private CertificateOrderArgs(CertificateOrderArgs $) {
        this.autoRenew = $.autoRenew;
        this.csr = $.csr;
        this.distinguishedName = $.distinguishedName;
        this.keySize = $.keySize;
        this.location = $.location;
        this.name = $.name;
        this.productType = $.productType;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.validityInYears = $.validityInYears;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateOrderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateOrderArgs $;

        public Builder() {
            $ = new CertificateOrderArgs();
        }

        public Builder(CertificateOrderArgs defaults) {
            $ = new CertificateOrderArgs(Objects.requireNonNull(defaults));
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
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

        public CertificateOrderArgs build() {
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("CertificateOrderArgs", "resourceGroupName");
            }
            return $;
        }
    }

}

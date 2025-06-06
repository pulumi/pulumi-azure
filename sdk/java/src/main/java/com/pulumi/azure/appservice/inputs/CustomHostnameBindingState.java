// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomHostnameBindingState extends com.pulumi.resources.ResourceArgs {

    public static final CustomHostnameBindingState Empty = new CustomHostnameBindingState();

    /**
     * The name of the App Service in which to add the Custom Hostname Binding. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="appServiceName")
    private @Nullable Output<String> appServiceName;

    /**
     * @return The name of the App Service in which to add the Custom Hostname Binding. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> appServiceName() {
        return Optional.ofNullable(this.appServiceName);
    }

    /**
     * Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** A CNAME needs to be configured from this Hostname to the Azure Website - otherwise Azure will reject the Hostname Binding.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** A CNAME needs to be configured from this Hostname to the Azure Website - otherwise Azure will reject the Hostname Binding.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sslState")
    private @Nullable Output<String> sslState;

    /**
     * @return The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sslState() {
        return Optional.ofNullable(this.sslState);
    }

    /**
     * The SSL certificate thumbprint. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `thumbprint` must be specified when `ssl_state` is set.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The SSL certificate thumbprint. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `thumbprint` must be specified when `ssl_state` is set.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    /**
     * The virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    @Import(name="virtualIp")
    private @Nullable Output<String> virtualIp;

    /**
     * @return The virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    public Optional<Output<String>> virtualIp() {
        return Optional.ofNullable(this.virtualIp);
    }

    private CustomHostnameBindingState() {}

    private CustomHostnameBindingState(CustomHostnameBindingState $) {
        this.appServiceName = $.appServiceName;
        this.hostname = $.hostname;
        this.resourceGroupName = $.resourceGroupName;
        this.sslState = $.sslState;
        this.thumbprint = $.thumbprint;
        this.virtualIp = $.virtualIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomHostnameBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHostnameBindingState $;

        public Builder() {
            $ = new CustomHostnameBindingState();
        }

        public Builder(CustomHostnameBindingState defaults) {
            $ = new CustomHostnameBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appServiceName The name of the App Service in which to add the Custom Hostname Binding. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceName(@Nullable Output<String> appServiceName) {
            $.appServiceName = appServiceName;
            return this;
        }

        /**
         * @param appServiceName The name of the App Service in which to add the Custom Hostname Binding. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceName(String appServiceName) {
            return appServiceName(Output.of(appServiceName));
        }

        /**
         * @param hostname Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** A CNAME needs to be configured from this Hostname to the Azure Website - otherwise Azure will reject the Hostname Binding.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** A CNAME needs to be configured from this Hostname to the Azure Website - otherwise Azure will reject the Hostname Binding.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sslState The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sslState(@Nullable Output<String> sslState) {
            $.sslState = sslState;
            return this;
        }

        /**
         * @param sslState The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sslState(String sslState) {
            return sslState(Output.of(sslState));
        }

        /**
         * @param thumbprint The SSL certificate thumbprint. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** `thumbprint` must be specified when `ssl_state` is set.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The SSL certificate thumbprint. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** `thumbprint` must be specified when `ssl_state` is set.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        /**
         * @param virtualIp The virtual IP address assigned to the hostname if IP based SSL is enabled.
         * 
         * @return builder
         * 
         */
        public Builder virtualIp(@Nullable Output<String> virtualIp) {
            $.virtualIp = virtualIp;
            return this;
        }

        /**
         * @param virtualIp The virtual IP address assigned to the hostname if IP based SSL is enabled.
         * 
         * @return builder
         * 
         */
        public Builder virtualIp(String virtualIp) {
            return virtualIp(Output.of(virtualIp));
        }

        public CustomHostnameBindingState build() {
            return $;
        }
    }

}

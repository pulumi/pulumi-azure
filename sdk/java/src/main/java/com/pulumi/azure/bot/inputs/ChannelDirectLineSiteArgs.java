// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelDirectLineSiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelDirectLineSiteArgs Empty = new ChannelDirectLineSiteArgs();

    /**
     * Enables/Disables this site. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enables/Disables this site. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Is the endpoint parameters enabled for this site?
     * 
     */
    @Import(name="endpointParametersEnabled")
    private @Nullable Output<Boolean> endpointParametersEnabled;

    /**
     * @return Is the endpoint parameters enabled for this site?
     * 
     */
    public Optional<Output<Boolean>> endpointParametersEnabled() {
        return Optional.ofNullable(this.endpointParametersEnabled);
    }

    /**
     * Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
     * 
     */
    @Import(name="enhancedAuthenticationEnabled")
    private @Nullable Output<Boolean> enhancedAuthenticationEnabled;

    /**
     * @return Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
     * 
     */
    public Optional<Output<Boolean>> enhancedAuthenticationEnabled() {
        return Optional.ofNullable(this.enhancedAuthenticationEnabled);
    }

    /**
     * Id for the site
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Id for the site
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Primary key for accessing this site
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Primary key for accessing this site
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Secondary key for accessing this site
     * 
     */
    @Import(name="key2")
    private @Nullable Output<String> key2;

    /**
     * @return Secondary key for accessing this site
     * 
     */
    public Optional<Output<String>> key2() {
        return Optional.ofNullable(this.key2);
    }

    /**
     * The name of the site
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the site
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Is the storage site enabled for detailed logging? Defaults to `true`.
     * 
     */
    @Import(name="storageEnabled")
    private @Nullable Output<Boolean> storageEnabled;

    /**
     * @return Is the storage site enabled for detailed logging? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> storageEnabled() {
        return Optional.ofNullable(this.storageEnabled);
    }

    /**
     * This field is required when `is_secure_site_enabled` is enabled. Determines which origins can establish a Directline conversation for this site.
     * 
     */
    @Import(name="trustedOrigins")
    private @Nullable Output<List<String>> trustedOrigins;

    /**
     * @return This field is required when `is_secure_site_enabled` is enabled. Determines which origins can establish a Directline conversation for this site.
     * 
     */
    public Optional<Output<List<String>>> trustedOrigins() {
        return Optional.ofNullable(this.trustedOrigins);
    }

    /**
     * Is the user upload enabled for this site? Defaults to `true`.
     * 
     */
    @Import(name="userUploadEnabled")
    private @Nullable Output<Boolean> userUploadEnabled;

    /**
     * @return Is the user upload enabled for this site? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> userUploadEnabled() {
        return Optional.ofNullable(this.userUploadEnabled);
    }

    /**
     * Enables v1 of the Directline protocol for this site. Defaults to `true`.
     * 
     */
    @Import(name="v1Allowed")
    private @Nullable Output<Boolean> v1Allowed;

    /**
     * @return Enables v1 of the Directline protocol for this site. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> v1Allowed() {
        return Optional.ofNullable(this.v1Allowed);
    }

    /**
     * Enables v3 of the Directline protocol for this site. Defaults to `true`.
     * 
     */
    @Import(name="v3Allowed")
    private @Nullable Output<Boolean> v3Allowed;

    /**
     * @return Enables v3 of the Directline protocol for this site. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> v3Allowed() {
        return Optional.ofNullable(this.v3Allowed);
    }

    private ChannelDirectLineSiteArgs() {}

    private ChannelDirectLineSiteArgs(ChannelDirectLineSiteArgs $) {
        this.enabled = $.enabled;
        this.endpointParametersEnabled = $.endpointParametersEnabled;
        this.enhancedAuthenticationEnabled = $.enhancedAuthenticationEnabled;
        this.id = $.id;
        this.key = $.key;
        this.key2 = $.key2;
        this.name = $.name;
        this.storageEnabled = $.storageEnabled;
        this.trustedOrigins = $.trustedOrigins;
        this.userUploadEnabled = $.userUploadEnabled;
        this.v1Allowed = $.v1Allowed;
        this.v3Allowed = $.v3Allowed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelDirectLineSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelDirectLineSiteArgs $;

        public Builder() {
            $ = new ChannelDirectLineSiteArgs();
        }

        public Builder(ChannelDirectLineSiteArgs defaults) {
            $ = new ChannelDirectLineSiteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enables/Disables this site. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables/Disables this site. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param endpointParametersEnabled Is the endpoint parameters enabled for this site?
         * 
         * @return builder
         * 
         */
        public Builder endpointParametersEnabled(@Nullable Output<Boolean> endpointParametersEnabled) {
            $.endpointParametersEnabled = endpointParametersEnabled;
            return this;
        }

        /**
         * @param endpointParametersEnabled Is the endpoint parameters enabled for this site?
         * 
         * @return builder
         * 
         */
        public Builder endpointParametersEnabled(Boolean endpointParametersEnabled) {
            return endpointParametersEnabled(Output.of(endpointParametersEnabled));
        }

        /**
         * @param enhancedAuthenticationEnabled Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enhancedAuthenticationEnabled(@Nullable Output<Boolean> enhancedAuthenticationEnabled) {
            $.enhancedAuthenticationEnabled = enhancedAuthenticationEnabled;
            return this;
        }

        /**
         * @param enhancedAuthenticationEnabled Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enhancedAuthenticationEnabled(Boolean enhancedAuthenticationEnabled) {
            return enhancedAuthenticationEnabled(Output.of(enhancedAuthenticationEnabled));
        }

        /**
         * @param id Id for the site
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id for the site
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param key Primary key for accessing this site
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Primary key for accessing this site
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param key2 Secondary key for accessing this site
         * 
         * @return builder
         * 
         */
        public Builder key2(@Nullable Output<String> key2) {
            $.key2 = key2;
            return this;
        }

        /**
         * @param key2 Secondary key for accessing this site
         * 
         * @return builder
         * 
         */
        public Builder key2(String key2) {
            return key2(Output.of(key2));
        }

        /**
         * @param name The name of the site
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the site
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageEnabled Is the storage site enabled for detailed logging? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder storageEnabled(@Nullable Output<Boolean> storageEnabled) {
            $.storageEnabled = storageEnabled;
            return this;
        }

        /**
         * @param storageEnabled Is the storage site enabled for detailed logging? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder storageEnabled(Boolean storageEnabled) {
            return storageEnabled(Output.of(storageEnabled));
        }

        /**
         * @param trustedOrigins This field is required when `is_secure_site_enabled` is enabled. Determines which origins can establish a Directline conversation for this site.
         * 
         * @return builder
         * 
         */
        public Builder trustedOrigins(@Nullable Output<List<String>> trustedOrigins) {
            $.trustedOrigins = trustedOrigins;
            return this;
        }

        /**
         * @param trustedOrigins This field is required when `is_secure_site_enabled` is enabled. Determines which origins can establish a Directline conversation for this site.
         * 
         * @return builder
         * 
         */
        public Builder trustedOrigins(List<String> trustedOrigins) {
            return trustedOrigins(Output.of(trustedOrigins));
        }

        /**
         * @param trustedOrigins This field is required when `is_secure_site_enabled` is enabled. Determines which origins can establish a Directline conversation for this site.
         * 
         * @return builder
         * 
         */
        public Builder trustedOrigins(String... trustedOrigins) {
            return trustedOrigins(List.of(trustedOrigins));
        }

        /**
         * @param userUploadEnabled Is the user upload enabled for this site? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder userUploadEnabled(@Nullable Output<Boolean> userUploadEnabled) {
            $.userUploadEnabled = userUploadEnabled;
            return this;
        }

        /**
         * @param userUploadEnabled Is the user upload enabled for this site? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder userUploadEnabled(Boolean userUploadEnabled) {
            return userUploadEnabled(Output.of(userUploadEnabled));
        }

        /**
         * @param v1Allowed Enables v1 of the Directline protocol for this site. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder v1Allowed(@Nullable Output<Boolean> v1Allowed) {
            $.v1Allowed = v1Allowed;
            return this;
        }

        /**
         * @param v1Allowed Enables v1 of the Directline protocol for this site. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder v1Allowed(Boolean v1Allowed) {
            return v1Allowed(Output.of(v1Allowed));
        }

        /**
         * @param v3Allowed Enables v3 of the Directline protocol for this site. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder v3Allowed(@Nullable Output<Boolean> v3Allowed) {
            $.v3Allowed = v3Allowed;
            return this;
        }

        /**
         * @param v3Allowed Enables v3 of the Directline protocol for this site. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder v3Allowed(Boolean v3Allowed) {
            return v3Allowed(Output.of(v3Allowed));
        }

        public ChannelDirectLineSiteArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ChannelDirectLineSiteArgs", "name");
            }
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointDeliveryRuleUrlRedirectActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointDeliveryRuleUrlRedirectActionArgs Empty = new EndpointDeliveryRuleUrlRedirectActionArgs();

    /**
     * Specifies the fragment part of the URL. This value must not start with a `#`.
     * 
     */
    @Import(name="fragment")
    private @Nullable Output<String> fragment;

    /**
     * @return Specifies the fragment part of the URL. This value must not start with a `#`.
     * 
     */
    public Optional<Output<String>> fragment() {
        return Optional.ofNullable(this.fragment);
    }

    /**
     * Specifies the hostname part of the URL.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Specifies the hostname part of the URL.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Specifies the path part of the URL. This value must begin with a `/`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Specifies the path part of the URL. This value must begin with a `/`.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Specifies the protocol part of the URL. Valid values are `Http` and `Https`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Specifies the protocol part of the URL. Valid values are `Http` and `Https`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Specifies the query string part of the URL. This value must not start with a `?` or `&amp;` and must be in `&lt;key&gt;=&lt;value&gt;` format separated by `&amp;`.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<String> queryString;

    /**
     * @return Specifies the query string part of the URL. This value must not start with a `?` or `&amp;` and must be in `&lt;key&gt;=&lt;value&gt;` format separated by `&amp;`.
     * 
     */
    public Optional<Output<String>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Type of the redirect. Valid values are `Found`, `Moved`, `PermanentRedirect` and `TemporaryRedirect`.
     * 
     */
    @Import(name="redirectType", required=true)
    private Output<String> redirectType;

    /**
     * @return Type of the redirect. Valid values are `Found`, `Moved`, `PermanentRedirect` and `TemporaryRedirect`.
     * 
     */
    public Output<String> redirectType() {
        return this.redirectType;
    }

    private EndpointDeliveryRuleUrlRedirectActionArgs() {}

    private EndpointDeliveryRuleUrlRedirectActionArgs(EndpointDeliveryRuleUrlRedirectActionArgs $) {
        this.fragment = $.fragment;
        this.hostname = $.hostname;
        this.path = $.path;
        this.protocol = $.protocol;
        this.queryString = $.queryString;
        this.redirectType = $.redirectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointDeliveryRuleUrlRedirectActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointDeliveryRuleUrlRedirectActionArgs $;

        public Builder() {
            $ = new EndpointDeliveryRuleUrlRedirectActionArgs();
        }

        public Builder(EndpointDeliveryRuleUrlRedirectActionArgs defaults) {
            $ = new EndpointDeliveryRuleUrlRedirectActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fragment Specifies the fragment part of the URL. This value must not start with a `#`.
         * 
         * @return builder
         * 
         */
        public Builder fragment(@Nullable Output<String> fragment) {
            $.fragment = fragment;
            return this;
        }

        /**
         * @param fragment Specifies the fragment part of the URL. This value must not start with a `#`.
         * 
         * @return builder
         * 
         */
        public Builder fragment(String fragment) {
            return fragment(Output.of(fragment));
        }

        /**
         * @param hostname Specifies the hostname part of the URL.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Specifies the hostname part of the URL.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param path Specifies the path part of the URL. This value must begin with a `/`.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Specifies the path part of the URL. This value must begin with a `/`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param protocol Specifies the protocol part of the URL. Valid values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Specifies the protocol part of the URL. Valid values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param queryString Specifies the query string part of the URL. This value must not start with a `?` or `&amp;` and must be in `&lt;key&gt;=&lt;value&gt;` format separated by `&amp;`.
         * 
         * @return builder
         * 
         */
        public Builder queryString(@Nullable Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString Specifies the query string part of the URL. This value must not start with a `?` or `&amp;` and must be in `&lt;key&gt;=&lt;value&gt;` format separated by `&amp;`.
         * 
         * @return builder
         * 
         */
        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param redirectType Type of the redirect. Valid values are `Found`, `Moved`, `PermanentRedirect` and `TemporaryRedirect`.
         * 
         * @return builder
         * 
         */
        public Builder redirectType(Output<String> redirectType) {
            $.redirectType = redirectType;
            return this;
        }

        /**
         * @param redirectType Type of the redirect. Valid values are `Found`, `Moved`, `PermanentRedirect` and `TemporaryRedirect`.
         * 
         * @return builder
         * 
         */
        public Builder redirectType(String redirectType) {
            return redirectType(Output.of(redirectType));
        }

        public EndpointDeliveryRuleUrlRedirectActionArgs build() {
            $.redirectType = Objects.requireNonNull($.redirectType, "expected parameter 'redirectType' to be non-null");
            return $;
        }
    }

}
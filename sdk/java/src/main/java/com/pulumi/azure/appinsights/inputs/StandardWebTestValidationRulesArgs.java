// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appinsights.inputs;

import com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesContentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardWebTestValidationRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardWebTestValidationRulesArgs Empty = new StandardWebTestValidationRulesArgs();

    /**
     * A `content` block as defined above.
     * 
     */
    @Import(name="content")
    private @Nullable Output<StandardWebTestValidationRulesContentArgs> content;

    /**
     * @return A `content` block as defined above.
     * 
     */
    public Optional<Output<StandardWebTestValidationRulesContentArgs>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The expected status code of the response. Default is &#39;200&#39;, &#39;0&#39; means &#39;response code &lt; 400&#39;
     * 
     */
    @Import(name="expectedStatusCode")
    private @Nullable Output<Integer> expectedStatusCode;

    /**
     * @return The expected status code of the response. Default is &#39;200&#39;, &#39;0&#39; means &#39;response code &lt; 400&#39;
     * 
     */
    public Optional<Output<Integer>> expectedStatusCode() {
        return Optional.ofNullable(this.expectedStatusCode);
    }

    /**
     * The number of days of SSL certificate validity remaining for the checked endpoint. If the certificate has a shorter remaining lifetime left, the test will fail.
     * 
     */
    @Import(name="sslCertRemainingLifetime")
    private @Nullable Output<Integer> sslCertRemainingLifetime;

    /**
     * @return The number of days of SSL certificate validity remaining for the checked endpoint. If the certificate has a shorter remaining lifetime left, the test will fail.
     * 
     */
    public Optional<Output<Integer>> sslCertRemainingLifetime() {
        return Optional.ofNullable(this.sslCertRemainingLifetime);
    }

    /**
     * Should the SSL check be enabled?
     * 
     */
    @Import(name="sslCheckEnabled")
    private @Nullable Output<Boolean> sslCheckEnabled;

    /**
     * @return Should the SSL check be enabled?
     * 
     */
    public Optional<Output<Boolean>> sslCheckEnabled() {
        return Optional.ofNullable(this.sslCheckEnabled);
    }

    private StandardWebTestValidationRulesArgs() {}

    private StandardWebTestValidationRulesArgs(StandardWebTestValidationRulesArgs $) {
        this.content = $.content;
        this.expectedStatusCode = $.expectedStatusCode;
        this.sslCertRemainingLifetime = $.sslCertRemainingLifetime;
        this.sslCheckEnabled = $.sslCheckEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardWebTestValidationRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardWebTestValidationRulesArgs $;

        public Builder() {
            $ = new StandardWebTestValidationRulesArgs();
        }

        public Builder(StandardWebTestValidationRulesArgs defaults) {
            $ = new StandardWebTestValidationRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content A `content` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<StandardWebTestValidationRulesContentArgs> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content A `content` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder content(StandardWebTestValidationRulesContentArgs content) {
            return content(Output.of(content));
        }

        /**
         * @param expectedStatusCode The expected status code of the response. Default is &#39;200&#39;, &#39;0&#39; means &#39;response code &lt; 400&#39;
         * 
         * @return builder
         * 
         */
        public Builder expectedStatusCode(@Nullable Output<Integer> expectedStatusCode) {
            $.expectedStatusCode = expectedStatusCode;
            return this;
        }

        /**
         * @param expectedStatusCode The expected status code of the response. Default is &#39;200&#39;, &#39;0&#39; means &#39;response code &lt; 400&#39;
         * 
         * @return builder
         * 
         */
        public Builder expectedStatusCode(Integer expectedStatusCode) {
            return expectedStatusCode(Output.of(expectedStatusCode));
        }

        /**
         * @param sslCertRemainingLifetime The number of days of SSL certificate validity remaining for the checked endpoint. If the certificate has a shorter remaining lifetime left, the test will fail.
         * 
         * @return builder
         * 
         */
        public Builder sslCertRemainingLifetime(@Nullable Output<Integer> sslCertRemainingLifetime) {
            $.sslCertRemainingLifetime = sslCertRemainingLifetime;
            return this;
        }

        /**
         * @param sslCertRemainingLifetime The number of days of SSL certificate validity remaining for the checked endpoint. If the certificate has a shorter remaining lifetime left, the test will fail.
         * 
         * @return builder
         * 
         */
        public Builder sslCertRemainingLifetime(Integer sslCertRemainingLifetime) {
            return sslCertRemainingLifetime(Output.of(sslCertRemainingLifetime));
        }

        /**
         * @param sslCheckEnabled Should the SSL check be enabled?
         * 
         * @return builder
         * 
         */
        public Builder sslCheckEnabled(@Nullable Output<Boolean> sslCheckEnabled) {
            $.sslCheckEnabled = sslCheckEnabled;
            return this;
        }

        /**
         * @param sslCheckEnabled Should the SSL check be enabled?
         * 
         * @return builder
         * 
         */
        public Builder sslCheckEnabled(Boolean sslCheckEnabled) {
            return sslCheckEnabled(Output.of(sslCheckEnabled));
        }

        public StandardWebTestValidationRulesArgs build() {
            return $;
        }
    }

}
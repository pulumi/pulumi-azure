// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountCustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountCustomDomainArgs Empty = new AccountCustomDomainArgs();

    /**
     * The Custom Domain Name to use for the Storage Account, which will be validated by Azure.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Custom Domain Name to use for the Storage Account, which will be validated by Azure.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Should the Custom Domain Name be validated by using indirect CNAME validation?
     * 
     */
    @Import(name="useSubdomain")
    private @Nullable Output<Boolean> useSubdomain;

    /**
     * @return Should the Custom Domain Name be validated by using indirect CNAME validation?
     * 
     */
    public Optional<Output<Boolean>> useSubdomain() {
        return Optional.ofNullable(this.useSubdomain);
    }

    private AccountCustomDomainArgs() {}

    private AccountCustomDomainArgs(AccountCustomDomainArgs $) {
        this.name = $.name;
        this.useSubdomain = $.useSubdomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountCustomDomainArgs $;

        public Builder() {
            $ = new AccountCustomDomainArgs();
        }

        public Builder(AccountCustomDomainArgs defaults) {
            $ = new AccountCustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Custom Domain Name to use for the Storage Account, which will be validated by Azure.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Custom Domain Name to use for the Storage Account, which will be validated by Azure.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param useSubdomain Should the Custom Domain Name be validated by using indirect CNAME validation?
         * 
         * @return builder
         * 
         */
        public Builder useSubdomain(@Nullable Output<Boolean> useSubdomain) {
            $.useSubdomain = useSubdomain;
            return this;
        }

        /**
         * @param useSubdomain Should the Custom Domain Name be validated by using indirect CNAME validation?
         * 
         * @return builder
         * 
         */
        public Builder useSubdomain(Boolean useSubdomain) {
            return useSubdomain(Output.of(useSubdomain));
        }

        public AccountCustomDomainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
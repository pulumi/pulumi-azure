// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountSasPolicy {
    /**
     * @return The SAS expiration action. The only possible value is `Log` at this moment. Defaults to `Log`.
     * 
     */
    private @Nullable String expirationAction;
    /**
     * @return The SAS expiration period in format of `DD.HH:MM:SS`.
     * 
     */
    private String expirationPeriod;

    private AccountSasPolicy() {}
    /**
     * @return The SAS expiration action. The only possible value is `Log` at this moment. Defaults to `Log`.
     * 
     */
    public Optional<String> expirationAction() {
        return Optional.ofNullable(this.expirationAction);
    }
    /**
     * @return The SAS expiration period in format of `DD.HH:MM:SS`.
     * 
     */
    public String expirationPeriod() {
        return this.expirationPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountSasPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expirationAction;
        private String expirationPeriod;
        public Builder() {}
        public Builder(AccountSasPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationAction = defaults.expirationAction;
    	      this.expirationPeriod = defaults.expirationPeriod;
        }

        @CustomType.Setter
        public Builder expirationAction(@Nullable String expirationAction) {
            this.expirationAction = expirationAction;
            return this;
        }
        @CustomType.Setter
        public Builder expirationPeriod(String expirationPeriod) {
            this.expirationPeriod = Objects.requireNonNull(expirationPeriod);
            return this;
        }
        public AccountSasPolicy build() {
            final var o = new AccountSasPolicy();
            o.expirationAction = expirationAction;
            o.expirationPeriod = expirationPeriod;
            return o;
        }
    }
}
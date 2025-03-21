// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountBlobPropertiesDeleteRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountBlobPropertiesDeleteRetentionPolicyArgs Empty = new AccountBlobPropertiesDeleteRetentionPolicyArgs();

    /**
     * Specifies the number of days that the blob should be retained, between `1` and `365` days. Defaults to `7`.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    /**
     * @return Specifies the number of days that the blob should be retained, between `1` and `365` days. Defaults to `7`.
     * 
     */
    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    /**
     * Indicates whether permanent deletion of the soft deleted blob versions and snapshots is allowed. Defaults to `false`.
     * 
     * &gt; **Note:** `permanent_delete_enabled` cannot be set to true if a `restore_policy` block is defined.
     * 
     */
    @Import(name="permanentDeleteEnabled")
    private @Nullable Output<Boolean> permanentDeleteEnabled;

    /**
     * @return Indicates whether permanent deletion of the soft deleted blob versions and snapshots is allowed. Defaults to `false`.
     * 
     * &gt; **Note:** `permanent_delete_enabled` cannot be set to true if a `restore_policy` block is defined.
     * 
     */
    public Optional<Output<Boolean>> permanentDeleteEnabled() {
        return Optional.ofNullable(this.permanentDeleteEnabled);
    }

    private AccountBlobPropertiesDeleteRetentionPolicyArgs() {}

    private AccountBlobPropertiesDeleteRetentionPolicyArgs(AccountBlobPropertiesDeleteRetentionPolicyArgs $) {
        this.days = $.days;
        this.permanentDeleteEnabled = $.permanentDeleteEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountBlobPropertiesDeleteRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountBlobPropertiesDeleteRetentionPolicyArgs $;

        public Builder() {
            $ = new AccountBlobPropertiesDeleteRetentionPolicyArgs();
        }

        public Builder(AccountBlobPropertiesDeleteRetentionPolicyArgs defaults) {
            $ = new AccountBlobPropertiesDeleteRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days Specifies the number of days that the blob should be retained, between `1` and `365` days. Defaults to `7`.
         * 
         * @return builder
         * 
         */
        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days Specifies the number of days that the blob should be retained, between `1` and `365` days. Defaults to `7`.
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        /**
         * @param permanentDeleteEnabled Indicates whether permanent deletion of the soft deleted blob versions and snapshots is allowed. Defaults to `false`.
         * 
         * &gt; **Note:** `permanent_delete_enabled` cannot be set to true if a `restore_policy` block is defined.
         * 
         * @return builder
         * 
         */
        public Builder permanentDeleteEnabled(@Nullable Output<Boolean> permanentDeleteEnabled) {
            $.permanentDeleteEnabled = permanentDeleteEnabled;
            return this;
        }

        /**
         * @param permanentDeleteEnabled Indicates whether permanent deletion of the soft deleted blob versions and snapshots is allowed. Defaults to `false`.
         * 
         * &gt; **Note:** `permanent_delete_enabled` cannot be set to true if a `restore_policy` block is defined.
         * 
         * @return builder
         * 
         */
        public Builder permanentDeleteEnabled(Boolean permanentDeleteEnabled) {
            return permanentDeleteEnabled(Output.of(permanentDeleteEnabled));
        }

        public AccountBlobPropertiesDeleteRetentionPolicyArgs build() {
            return $;
        }
    }

}

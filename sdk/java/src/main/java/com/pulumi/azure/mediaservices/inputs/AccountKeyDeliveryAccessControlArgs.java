// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mediaservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountKeyDeliveryAccessControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountKeyDeliveryAccessControlArgs Empty = new AccountKeyDeliveryAccessControlArgs();

    /**
     * The Default Action to use when no rules match from `ip_allow_list`. Possible values are `Allow` and `Deny`.
     * 
     */
    @Import(name="defaultAction")
    private @Nullable Output<String> defaultAction;

    /**
     * @return The Default Action to use when no rules match from `ip_allow_list`. Possible values are `Allow` and `Deny`.
     * 
     */
    public Optional<Output<String>> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }

    /**
     * One or more IP Addresses, or CIDR Blocks which should be able to access the Key Delivery.
     * 
     */
    @Import(name="ipAllowLists")
    private @Nullable Output<List<String>> ipAllowLists;

    /**
     * @return One or more IP Addresses, or CIDR Blocks which should be able to access the Key Delivery.
     * 
     */
    public Optional<Output<List<String>>> ipAllowLists() {
        return Optional.ofNullable(this.ipAllowLists);
    }

    private AccountKeyDeliveryAccessControlArgs() {}

    private AccountKeyDeliveryAccessControlArgs(AccountKeyDeliveryAccessControlArgs $) {
        this.defaultAction = $.defaultAction;
        this.ipAllowLists = $.ipAllowLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountKeyDeliveryAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountKeyDeliveryAccessControlArgs $;

        public Builder() {
            $ = new AccountKeyDeliveryAccessControlArgs();
        }

        public Builder(AccountKeyDeliveryAccessControlArgs defaults) {
            $ = new AccountKeyDeliveryAccessControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultAction The Default Action to use when no rules match from `ip_allow_list`. Possible values are `Allow` and `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(@Nullable Output<String> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        /**
         * @param defaultAction The Default Action to use when no rules match from `ip_allow_list`. Possible values are `Allow` and `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(String defaultAction) {
            return defaultAction(Output.of(defaultAction));
        }

        /**
         * @param ipAllowLists One or more IP Addresses, or CIDR Blocks which should be able to access the Key Delivery.
         * 
         * @return builder
         * 
         */
        public Builder ipAllowLists(@Nullable Output<List<String>> ipAllowLists) {
            $.ipAllowLists = ipAllowLists;
            return this;
        }

        /**
         * @param ipAllowLists One or more IP Addresses, or CIDR Blocks which should be able to access the Key Delivery.
         * 
         * @return builder
         * 
         */
        public Builder ipAllowLists(List<String> ipAllowLists) {
            return ipAllowLists(Output.of(ipAllowLists));
        }

        /**
         * @param ipAllowLists One or more IP Addresses, or CIDR Blocks which should be able to access the Key Delivery.
         * 
         * @return builder
         * 
         */
        public Builder ipAllowLists(String... ipAllowLists) {
            return ipAllowLists(List.of(ipAllowLists));
        }

        public AccountKeyDeliveryAccessControlArgs build() {
            return $;
        }
    }

}
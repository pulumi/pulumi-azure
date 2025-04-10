// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.billing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetMcaAccountScopeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMcaAccountScopeArgs Empty = new GetMcaAccountScopeArgs();

    /**
     * The Billing Account Name of the MCA account.
     * 
     */
    @Import(name="billingAccountName", required=true)
    private Output<String> billingAccountName;

    /**
     * @return The Billing Account Name of the MCA account.
     * 
     */
    public Output<String> billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * The Billing Profile Name in the above Billing Account.
     * 
     */
    @Import(name="billingProfileName", required=true)
    private Output<String> billingProfileName;

    /**
     * @return The Billing Profile Name in the above Billing Account.
     * 
     */
    public Output<String> billingProfileName() {
        return this.billingProfileName;
    }

    /**
     * The Invoice Section Name in the above Billing Profile.
     * 
     */
    @Import(name="invoiceSectionName", required=true)
    private Output<String> invoiceSectionName;

    /**
     * @return The Invoice Section Name in the above Billing Profile.
     * 
     */
    public Output<String> invoiceSectionName() {
        return this.invoiceSectionName;
    }

    private GetMcaAccountScopeArgs() {}

    private GetMcaAccountScopeArgs(GetMcaAccountScopeArgs $) {
        this.billingAccountName = $.billingAccountName;
        this.billingProfileName = $.billingProfileName;
        this.invoiceSectionName = $.invoiceSectionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMcaAccountScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMcaAccountScopeArgs $;

        public Builder() {
            $ = new GetMcaAccountScopeArgs();
        }

        public Builder(GetMcaAccountScopeArgs defaults) {
            $ = new GetMcaAccountScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountName The Billing Account Name of the MCA account.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountName(Output<String> billingAccountName) {
            $.billingAccountName = billingAccountName;
            return this;
        }

        /**
         * @param billingAccountName The Billing Account Name of the MCA account.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountName(String billingAccountName) {
            return billingAccountName(Output.of(billingAccountName));
        }

        /**
         * @param billingProfileName The Billing Profile Name in the above Billing Account.
         * 
         * @return builder
         * 
         */
        public Builder billingProfileName(Output<String> billingProfileName) {
            $.billingProfileName = billingProfileName;
            return this;
        }

        /**
         * @param billingProfileName The Billing Profile Name in the above Billing Account.
         * 
         * @return builder
         * 
         */
        public Builder billingProfileName(String billingProfileName) {
            return billingProfileName(Output.of(billingProfileName));
        }

        /**
         * @param invoiceSectionName The Invoice Section Name in the above Billing Profile.
         * 
         * @return builder
         * 
         */
        public Builder invoiceSectionName(Output<String> invoiceSectionName) {
            $.invoiceSectionName = invoiceSectionName;
            return this;
        }

        /**
         * @param invoiceSectionName The Invoice Section Name in the above Billing Profile.
         * 
         * @return builder
         * 
         */
        public Builder invoiceSectionName(String invoiceSectionName) {
            return invoiceSectionName(Output.of(invoiceSectionName));
        }

        public GetMcaAccountScopeArgs build() {
            if ($.billingAccountName == null) {
                throw new MissingRequiredPropertyException("GetMcaAccountScopeArgs", "billingAccountName");
            }
            if ($.billingProfileName == null) {
                throw new MissingRequiredPropertyException("GetMcaAccountScopeArgs", "billingProfileName");
            }
            if ($.invoiceSectionName == null) {
                throw new MissingRequiredPropertyException("GetMcaAccountScopeArgs", "invoiceSectionName");
            }
            return $;
        }
    }

}

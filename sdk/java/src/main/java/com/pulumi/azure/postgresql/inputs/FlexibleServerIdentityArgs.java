// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class FlexibleServerIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleServerIdentityArgs Empty = new FlexibleServerIdentityArgs();

    /**
     * A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
     * 
     */
    @Import(name="identityIds", required=true)
    private Output<List<String>> identityIds;

    /**
     * @return A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
     * 
     */
    public Output<List<String>> identityIds() {
        return this.identityIds;
    }

    /**
     * Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. The only possible value is `UserAssigned`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. The only possible value is `UserAssigned`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FlexibleServerIdentityArgs() {}

    private FlexibleServerIdentityArgs(FlexibleServerIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleServerIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleServerIdentityArgs $;

        public Builder() {
            $ = new FlexibleServerIdentityArgs();
        }

        public Builder(FlexibleServerIdentityArgs defaults) {
            $ = new FlexibleServerIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. The only possible value is `UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. The only possible value is `UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FlexibleServerIdentityArgs build() {
            if ($.identityIds == null) {
                throw new MissingRequiredPropertyException("FlexibleServerIdentityArgs", "identityIds");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("FlexibleServerIdentityArgs", "type");
            }
            return $;
        }
    }

}

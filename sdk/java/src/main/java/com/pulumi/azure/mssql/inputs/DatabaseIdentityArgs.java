// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DatabaseIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseIdentityArgs Empty = new DatabaseIdentityArgs();

    /**
     * Specifies a list of User Assigned Managed Identity IDs to be assigned to this SQL Database.
     * 
     */
    @Import(name="identityIds", required=true)
    private Output<List<String>> identityIds;

    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this SQL Database.
     * 
     */
    public Output<List<String>> identityIds() {
        return this.identityIds;
    }

    /**
     * Specifies the type of Managed Service Identity that should be configured on this SQL Database. Possible value is `UserAssigned`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this SQL Database. Possible value is `UserAssigned`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DatabaseIdentityArgs() {}

    private DatabaseIdentityArgs(DatabaseIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseIdentityArgs $;

        public Builder() {
            $ = new DatabaseIdentityArgs();
        }

        public Builder(DatabaseIdentityArgs defaults) {
            $ = new DatabaseIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this SQL Database.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this SQL Database.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this SQL Database.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this SQL Database. Possible value is `UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this SQL Database. Possible value is `UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DatabaseIdentityArgs build() {
            if ($.identityIds == null) {
                throw new MissingRequiredPropertyException("DatabaseIdentityArgs", "identityIds");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DatabaseIdentityArgs", "type");
            }
            return $;
        }
    }

}

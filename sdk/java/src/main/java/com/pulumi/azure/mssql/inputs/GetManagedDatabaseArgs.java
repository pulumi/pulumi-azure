// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetManagedDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDatabaseArgs Empty = new GetManagedDatabaseArgs();

    /**
     * The SQL Managed Instance ID.
     * 
     */
    @Import(name="managedInstanceId", required=true)
    private Output<String> managedInstanceId;

    /**
     * @return The SQL Managed Instance ID.
     * 
     */
    public Output<String> managedInstanceId() {
        return this.managedInstanceId;
    }

    /**
     * The name of this Azure SQL Azure Managed Database.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Azure SQL Azure Managed Database.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetManagedDatabaseArgs() {}

    private GetManagedDatabaseArgs(GetManagedDatabaseArgs $) {
        this.managedInstanceId = $.managedInstanceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDatabaseArgs $;

        public Builder() {
            $ = new GetManagedDatabaseArgs();
        }

        public Builder(GetManagedDatabaseArgs defaults) {
            $ = new GetManagedDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedInstanceId The SQL Managed Instance ID.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceId(Output<String> managedInstanceId) {
            $.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * @param managedInstanceId The SQL Managed Instance ID.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceId(String managedInstanceId) {
            return managedInstanceId(Output.of(managedInstanceId));
        }

        /**
         * @param name The name of this Azure SQL Azure Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Azure SQL Azure Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetManagedDatabaseArgs build() {
            if ($.managedInstanceId == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseArgs", "managedInstanceId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetManagedDatabaseArgs", "name");
            }
            return $;
        }
    }

}

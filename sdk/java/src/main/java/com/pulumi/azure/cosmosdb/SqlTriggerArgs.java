// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlTriggerArgs Empty = new SqlTriggerArgs();

    /**
     * Body of the Trigger.
     * 
     */
    @Import(name="body", required=true)
    private Output<String> body;

    /**
     * @return Body of the Trigger.
     * 
     */
    public Output<String> body() {
        return this.body;
    }

    /**
     * The id of the Cosmos DB SQL Container to create the SQL Trigger within. Changing this forces a new SQL Trigger to be created.
     * 
     */
    @Import(name="containerId", required=true)
    private Output<String> containerId;

    /**
     * @return The id of the Cosmos DB SQL Container to create the SQL Trigger within. Changing this forces a new SQL Trigger to be created.
     * 
     */
    public Output<String> containerId() {
        return this.containerId;
    }

    /**
     * The name which should be used for this SQL Trigger. Changing this forces a new SQL Trigger to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this SQL Trigger. Changing this forces a new SQL Trigger to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The operation the trigger is associated with. Possible values are `All`, `Create`, `Update`, `Delete` and `Replace`.
     * 
     */
    @Import(name="operation", required=true)
    private Output<String> operation;

    /**
     * @return The operation the trigger is associated with. Possible values are `All`, `Create`, `Update`, `Delete` and `Replace`.
     * 
     */
    public Output<String> operation() {
        return this.operation;
    }

    /**
     * Type of the Trigger. Possible values are `Pre` and `Post`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the Trigger. Possible values are `Pre` and `Post`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SqlTriggerArgs() {}

    private SqlTriggerArgs(SqlTriggerArgs $) {
        this.body = $.body;
        this.containerId = $.containerId;
        this.name = $.name;
        this.operation = $.operation;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlTriggerArgs $;

        public Builder() {
            $ = new SqlTriggerArgs();
        }

        public Builder(SqlTriggerArgs defaults) {
            $ = new SqlTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param body Body of the Trigger.
         * 
         * @return builder
         * 
         */
        public Builder body(Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Body of the Trigger.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param containerId The id of the Cosmos DB SQL Container to create the SQL Trigger within. Changing this forces a new SQL Trigger to be created.
         * 
         * @return builder
         * 
         */
        public Builder containerId(Output<String> containerId) {
            $.containerId = containerId;
            return this;
        }

        /**
         * @param containerId The id of the Cosmos DB SQL Container to create the SQL Trigger within. Changing this forces a new SQL Trigger to be created.
         * 
         * @return builder
         * 
         */
        public Builder containerId(String containerId) {
            return containerId(Output.of(containerId));
        }

        /**
         * @param name The name which should be used for this SQL Trigger. Changing this forces a new SQL Trigger to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this SQL Trigger. Changing this forces a new SQL Trigger to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operation The operation the trigger is associated with. Possible values are `All`, `Create`, `Update`, `Delete` and `Replace`.
         * 
         * @return builder
         * 
         */
        public Builder operation(Output<String> operation) {
            $.operation = operation;
            return this;
        }

        /**
         * @param operation The operation the trigger is associated with. Possible values are `All`, `Create`, `Update`, `Delete` and `Replace`.
         * 
         * @return builder
         * 
         */
        public Builder operation(String operation) {
            return operation(Output.of(operation));
        }

        /**
         * @param type Type of the Trigger. Possible values are `Pre` and `Post`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the Trigger. Possible values are `Pre` and `Post`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SqlTriggerArgs build() {
            $.body = Objects.requireNonNull($.body, "expected parameter 'body' to be non-null");
            $.containerId = Objects.requireNonNull($.containerId, "expected parameter 'containerId' to be non-null");
            $.operation = Objects.requireNonNull($.operation, "expected parameter 'operation' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LinuxWebAppSlotConnectionStringArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxWebAppSlotConnectionStringArgs Empty = new LinuxWebAppSlotConnectionStringArgs();

    /**
     * The name of the Connection String.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Connection String.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Type of database. Possible values include `APIHub`, `Custom`, `DocDb`, `EventHub`, `MySQL`, `NotificationHub`, `PostgreSQL`, `RedisCache`, `ServiceBus`, `SQLAzure`, and `SQLServer`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of database. Possible values include `APIHub`, `Custom`, `DocDb`, `EventHub`, `MySQL`, `NotificationHub`, `PostgreSQL`, `RedisCache`, `ServiceBus`, `SQLAzure`, and `SQLServer`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The connection string value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The connection string value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private LinuxWebAppSlotConnectionStringArgs() {}

    private LinuxWebAppSlotConnectionStringArgs(LinuxWebAppSlotConnectionStringArgs $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxWebAppSlotConnectionStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxWebAppSlotConnectionStringArgs $;

        public Builder() {
            $ = new LinuxWebAppSlotConnectionStringArgs();
        }

        public Builder(LinuxWebAppSlotConnectionStringArgs defaults) {
            $ = new LinuxWebAppSlotConnectionStringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Connection String.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Connection String.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of database. Possible values include `APIHub`, `Custom`, `DocDb`, `EventHub`, `MySQL`, `NotificationHub`, `PostgreSQL`, `RedisCache`, `ServiceBus`, `SQLAzure`, and `SQLServer`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of database. Possible values include `APIHub`, `Custom`, `DocDb`, `EventHub`, `MySQL`, `NotificationHub`, `PostgreSQL`, `RedisCache`, `ServiceBus`, `SQLAzure`, and `SQLServer`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The connection string value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The connection string value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public LinuxWebAppSlotConnectionStringArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("LinuxWebAppSlotConnectionStringArgs", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("LinuxWebAppSlotConnectionStringArgs", "type");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("LinuxWebAppSlotConnectionStringArgs", "value");
            }
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiOperationRequestQueryParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiOperationRequestQueryParameterArgs Empty = new ApiOperationRequestQueryParameterArgs();

    /**
     * The default value for this Query Parameter.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    /**
     * @return The default value for this Query Parameter.
     * 
     */
    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * A description of this Query Parameter.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of this Query Parameter.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Name of this Query Parameter.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Name of this Query Parameter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Is this Query Parameter Required?
     * 
     */
    @Import(name="required", required=true)
    private Output<Boolean> required;

    /**
     * @return Is this Query Parameter Required?
     * 
     */
    public Output<Boolean> required() {
        return this.required;
    }

    /**
     * The Type of this Query Parameter, such as a `string`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The Type of this Query Parameter, such as a `string`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * One or more acceptable values for this Query Parameter.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return One or more acceptable values for this Query Parameter.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ApiOperationRequestQueryParameterArgs() {}

    private ApiOperationRequestQueryParameterArgs(ApiOperationRequestQueryParameterArgs $) {
        this.defaultValue = $.defaultValue;
        this.description = $.description;
        this.name = $.name;
        this.required = $.required;
        this.type = $.type;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiOperationRequestQueryParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiOperationRequestQueryParameterArgs $;

        public Builder() {
            $ = new ApiOperationRequestQueryParameterArgs();
        }

        public Builder(ApiOperationRequestQueryParameterArgs defaults) {
            $ = new ApiOperationRequestQueryParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValue The default value for this Query Parameter.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue The default value for this Query Parameter.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        /**
         * @param description A description of this Query Parameter.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of this Query Parameter.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The Name of this Query Parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name of this Query Parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param required Is this Query Parameter Required?
         * 
         * @return builder
         * 
         */
        public Builder required(Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Is this Query Parameter Required?
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        /**
         * @param type The Type of this Query Parameter, such as a `string`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Type of this Query Parameter, such as a `string`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param values One or more acceptable values for this Query Parameter.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values One or more acceptable values for this Query Parameter.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values One or more acceptable values for this Query Parameter.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ApiOperationRequestQueryParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.required = Objects.requireNonNull($.required, "expected parameter 'required' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountRestoreGremlinDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountRestoreGremlinDatabaseArgs Empty = new AccountRestoreGremlinDatabaseArgs();

    /**
     * A list of the Graph names for the restore request. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="graphNames")
    private @Nullable Output<List<String>> graphNames;

    /**
     * @return A list of the Graph names for the restore request. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> graphNames() {
        return Optional.ofNullable(this.graphNames);
    }

    /**
     * The Gremlin Database name for the restore request. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Gremlin Database name for the restore request. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private AccountRestoreGremlinDatabaseArgs() {}

    private AccountRestoreGremlinDatabaseArgs(AccountRestoreGremlinDatabaseArgs $) {
        this.graphNames = $.graphNames;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountRestoreGremlinDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountRestoreGremlinDatabaseArgs $;

        public Builder() {
            $ = new AccountRestoreGremlinDatabaseArgs();
        }

        public Builder(AccountRestoreGremlinDatabaseArgs defaults) {
            $ = new AccountRestoreGremlinDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param graphNames A list of the Graph names for the restore request. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder graphNames(@Nullable Output<List<String>> graphNames) {
            $.graphNames = graphNames;
            return this;
        }

        /**
         * @param graphNames A list of the Graph names for the restore request. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder graphNames(List<String> graphNames) {
            return graphNames(Output.of(graphNames));
        }

        /**
         * @param graphNames A list of the Graph names for the restore request. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder graphNames(String... graphNames) {
            return graphNames(List.of(graphNames));
        }

        /**
         * @param name The Gremlin Database name for the restore request. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Gremlin Database name for the restore request. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AccountRestoreGremlinDatabaseArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AccountRestoreGremlinDatabaseArgs", "name");
            }
            return $;
        }
    }

}

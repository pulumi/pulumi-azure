// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MongoCollectionSystemIndex {
    /**
     * @return The list of system keys which are not settable for each Cosmos DB Mongo Collection.
     * 
     */
    private @Nullable List<String> keys;
    /**
     * @return Identifies whether the table contains no duplicate values.
     * 
     */
    private @Nullable Boolean unique;

    private MongoCollectionSystemIndex() {}
    /**
     * @return The list of system keys which are not settable for each Cosmos DB Mongo Collection.
     * 
     */
    public List<String> keys() {
        return this.keys == null ? List.of() : this.keys;
    }
    /**
     * @return Identifies whether the table contains no duplicate values.
     * 
     */
    public Optional<Boolean> unique() {
        return Optional.ofNullable(this.unique);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoCollectionSystemIndex defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> keys;
        private @Nullable Boolean unique;
        public Builder() {}
        public Builder(MongoCollectionSystemIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
    	      this.unique = defaults.unique;
        }

        @CustomType.Setter
        public Builder keys(@Nullable List<String> keys) {

            this.keys = keys;
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        @CustomType.Setter
        public Builder unique(@Nullable Boolean unique) {

            this.unique = unique;
            return this;
        }
        public MongoCollectionSystemIndex build() {
            final var _resultValue = new MongoCollectionSystemIndex();
            _resultValue.keys = keys;
            _resultValue.unique = unique;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AccountRestoreDatabase {
    /**
     * @return A list of the collection names for the restore request. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable List<String> collectionNames;
    /**
     * @return The database name for the restore request. Changing this forces a new resource to be created.
     * 
     */
    private String name;

    private AccountRestoreDatabase() {}
    /**
     * @return A list of the collection names for the restore request. Changing this forces a new resource to be created.
     * 
     */
    public List<String> collectionNames() {
        return this.collectionNames == null ? List.of() : this.collectionNames;
    }
    /**
     * @return The database name for the restore request. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountRestoreDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> collectionNames;
        private String name;
        public Builder() {}
        public Builder(AccountRestoreDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionNames = defaults.collectionNames;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder collectionNames(@Nullable List<String> collectionNames) {
            this.collectionNames = collectionNames;
            return this;
        }
        public Builder collectionNames(String... collectionNames) {
            return collectionNames(List.of(collectionNames));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public AccountRestoreDatabase build() {
            final var o = new AccountRestoreDatabase();
            o.collectionNames = collectionNames;
            o.name = name;
            return o;
        }
    }
}
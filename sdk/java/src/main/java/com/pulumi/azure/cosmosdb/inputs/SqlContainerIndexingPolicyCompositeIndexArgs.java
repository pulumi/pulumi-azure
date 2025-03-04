// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexIndexArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;


public final class SqlContainerIndexingPolicyCompositeIndexArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlContainerIndexingPolicyCompositeIndexArgs Empty = new SqlContainerIndexingPolicyCompositeIndexArgs();

    /**
     * One or more `index` blocks as defined below.
     * 
     */
    @Import(name="indices", required=true)
    private Output<List<SqlContainerIndexingPolicyCompositeIndexIndexArgs>> indices;

    /**
     * @return One or more `index` blocks as defined below.
     * 
     */
    public Output<List<SqlContainerIndexingPolicyCompositeIndexIndexArgs>> indices() {
        return this.indices;
    }

    private SqlContainerIndexingPolicyCompositeIndexArgs() {}

    private SqlContainerIndexingPolicyCompositeIndexArgs(SqlContainerIndexingPolicyCompositeIndexArgs $) {
        this.indices = $.indices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlContainerIndexingPolicyCompositeIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlContainerIndexingPolicyCompositeIndexArgs $;

        public Builder() {
            $ = new SqlContainerIndexingPolicyCompositeIndexArgs();
        }

        public Builder(SqlContainerIndexingPolicyCompositeIndexArgs defaults) {
            $ = new SqlContainerIndexingPolicyCompositeIndexArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param indices One or more `index` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder indices(Output<List<SqlContainerIndexingPolicyCompositeIndexIndexArgs>> indices) {
            $.indices = indices;
            return this;
        }

        /**
         * @param indices One or more `index` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder indices(List<SqlContainerIndexingPolicyCompositeIndexIndexArgs> indices) {
            return indices(Output.of(indices));
        }

        /**
         * @param indices One or more `index` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder indices(SqlContainerIndexingPolicyCompositeIndexIndexArgs... indices) {
            return indices(List.of(indices));
        }

        public SqlContainerIndexingPolicyCompositeIndexArgs build() {
            if ($.indices == null) {
                throw new MissingRequiredPropertyException("SqlContainerIndexingPolicyCompositeIndexArgs", "indices");
            }
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyCompositeIndexArgs;
import com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyExcludedPathArgs;
import com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyIncludedPathArgs;
import com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicySpatialIndexArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlContainerIndexingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlContainerIndexingPolicyArgs Empty = new SqlContainerIndexingPolicyArgs();

    /**
     * One or more `composite_index` blocks as defined below.
     * 
     */
    @Import(name="compositeIndices")
    private @Nullable Output<List<SqlContainerIndexingPolicyCompositeIndexArgs>> compositeIndices;

    /**
     * @return One or more `composite_index` blocks as defined below.
     * 
     */
    public Optional<Output<List<SqlContainerIndexingPolicyCompositeIndexArgs>>> compositeIndices() {
        return Optional.ofNullable(this.compositeIndices);
    }

    /**
     * One or more `excluded_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
     * 
     */
    @Import(name="excludedPaths")
    private @Nullable Output<List<SqlContainerIndexingPolicyExcludedPathArgs>> excludedPaths;

    /**
     * @return One or more `excluded_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
     * 
     */
    public Optional<Output<List<SqlContainerIndexingPolicyExcludedPathArgs>>> excludedPaths() {
        return Optional.ofNullable(this.excludedPaths);
    }

    /**
     * One or more `included_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
     * 
     */
    @Import(name="includedPaths")
    private @Nullable Output<List<SqlContainerIndexingPolicyIncludedPathArgs>> includedPaths;

    /**
     * @return One or more `included_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
     * 
     */
    public Optional<Output<List<SqlContainerIndexingPolicyIncludedPathArgs>>> includedPaths() {
        return Optional.ofNullable(this.includedPaths);
    }

    /**
     * Indicates the indexing mode. Possible values include: `Consistent` and `None`. Defaults to `Consistent`.
     * 
     */
    @Import(name="indexingMode")
    private @Nullable Output<String> indexingMode;

    /**
     * @return Indicates the indexing mode. Possible values include: `Consistent` and `None`. Defaults to `Consistent`.
     * 
     */
    public Optional<Output<String>> indexingMode() {
        return Optional.ofNullable(this.indexingMode);
    }

    /**
     * One or more `spatial_index` blocks as defined below.
     * 
     */
    @Import(name="spatialIndices")
    private @Nullable Output<List<SqlContainerIndexingPolicySpatialIndexArgs>> spatialIndices;

    /**
     * @return One or more `spatial_index` blocks as defined below.
     * 
     */
    public Optional<Output<List<SqlContainerIndexingPolicySpatialIndexArgs>>> spatialIndices() {
        return Optional.ofNullable(this.spatialIndices);
    }

    private SqlContainerIndexingPolicyArgs() {}

    private SqlContainerIndexingPolicyArgs(SqlContainerIndexingPolicyArgs $) {
        this.compositeIndices = $.compositeIndices;
        this.excludedPaths = $.excludedPaths;
        this.includedPaths = $.includedPaths;
        this.indexingMode = $.indexingMode;
        this.spatialIndices = $.spatialIndices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlContainerIndexingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlContainerIndexingPolicyArgs $;

        public Builder() {
            $ = new SqlContainerIndexingPolicyArgs();
        }

        public Builder(SqlContainerIndexingPolicyArgs defaults) {
            $ = new SqlContainerIndexingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compositeIndices One or more `composite_index` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder compositeIndices(@Nullable Output<List<SqlContainerIndexingPolicyCompositeIndexArgs>> compositeIndices) {
            $.compositeIndices = compositeIndices;
            return this;
        }

        /**
         * @param compositeIndices One or more `composite_index` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder compositeIndices(List<SqlContainerIndexingPolicyCompositeIndexArgs> compositeIndices) {
            return compositeIndices(Output.of(compositeIndices));
        }

        /**
         * @param compositeIndices One or more `composite_index` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder compositeIndices(SqlContainerIndexingPolicyCompositeIndexArgs... compositeIndices) {
            return compositeIndices(List.of(compositeIndices));
        }

        /**
         * @param excludedPaths One or more `excluded_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
         * 
         * @return builder
         * 
         */
        public Builder excludedPaths(@Nullable Output<List<SqlContainerIndexingPolicyExcludedPathArgs>> excludedPaths) {
            $.excludedPaths = excludedPaths;
            return this;
        }

        /**
         * @param excludedPaths One or more `excluded_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
         * 
         * @return builder
         * 
         */
        public Builder excludedPaths(List<SqlContainerIndexingPolicyExcludedPathArgs> excludedPaths) {
            return excludedPaths(Output.of(excludedPaths));
        }

        /**
         * @param excludedPaths One or more `excluded_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
         * 
         * @return builder
         * 
         */
        public Builder excludedPaths(SqlContainerIndexingPolicyExcludedPathArgs... excludedPaths) {
            return excludedPaths(List.of(excludedPaths));
        }

        /**
         * @param includedPaths One or more `included_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
         * 
         * @return builder
         * 
         */
        public Builder includedPaths(@Nullable Output<List<SqlContainerIndexingPolicyIncludedPathArgs>> includedPaths) {
            $.includedPaths = includedPaths;
            return this;
        }

        /**
         * @param includedPaths One or more `included_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
         * 
         * @return builder
         * 
         */
        public Builder includedPaths(List<SqlContainerIndexingPolicyIncludedPathArgs> includedPaths) {
            return includedPaths(Output.of(includedPaths));
        }

        /**
         * @param includedPaths One or more `included_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
         * 
         * @return builder
         * 
         */
        public Builder includedPaths(SqlContainerIndexingPolicyIncludedPathArgs... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }

        /**
         * @param indexingMode Indicates the indexing mode. Possible values include: `Consistent` and `None`. Defaults to `Consistent`.
         * 
         * @return builder
         * 
         */
        public Builder indexingMode(@Nullable Output<String> indexingMode) {
            $.indexingMode = indexingMode;
            return this;
        }

        /**
         * @param indexingMode Indicates the indexing mode. Possible values include: `Consistent` and `None`. Defaults to `Consistent`.
         * 
         * @return builder
         * 
         */
        public Builder indexingMode(String indexingMode) {
            return indexingMode(Output.of(indexingMode));
        }

        /**
         * @param spatialIndices One or more `spatial_index` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder spatialIndices(@Nullable Output<List<SqlContainerIndexingPolicySpatialIndexArgs>> spatialIndices) {
            $.spatialIndices = spatialIndices;
            return this;
        }

        /**
         * @param spatialIndices One or more `spatial_index` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder spatialIndices(List<SqlContainerIndexingPolicySpatialIndexArgs> spatialIndices) {
            return spatialIndices(Output.of(spatialIndices));
        }

        /**
         * @param spatialIndices One or more `spatial_index` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder spatialIndices(SqlContainerIndexingPolicySpatialIndexArgs... spatialIndices) {
            return spatialIndices(List.of(spatialIndices));
        }

        public SqlContainerIndexingPolicyArgs build() {
            return $;
        }
    }

}
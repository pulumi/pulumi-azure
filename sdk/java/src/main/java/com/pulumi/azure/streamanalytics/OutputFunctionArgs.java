// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputFunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputFunctionArgs Empty = new OutputFunctionArgs();

    /**
     * The API key for the Function.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    /**
     * @return The API key for the Function.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }

    /**
     * The maximum number of events in each batch that&#39;s sent to the function. Defaults to `100`.
     * 
     */
    @Import(name="batchMaxCount")
    private @Nullable Output<Integer> batchMaxCount;

    /**
     * @return The maximum number of events in each batch that&#39;s sent to the function. Defaults to `100`.
     * 
     */
    public Optional<Output<Integer>> batchMaxCount() {
        return Optional.ofNullable(this.batchMaxCount);
    }

    /**
     * The maximum batch size in bytes that&#39;s sent to the function. Defaults to `262144` (256 kB).
     * 
     */
    @Import(name="batchMaxInBytes")
    private @Nullable Output<Integer> batchMaxInBytes;

    /**
     * @return The maximum batch size in bytes that&#39;s sent to the function. Defaults to `262144` (256 kB).
     * 
     */
    public Optional<Output<Integer>> batchMaxInBytes() {
        return Optional.ofNullable(this.batchMaxInBytes);
    }

    /**
     * The name of the Function App.
     * 
     */
    @Import(name="functionApp", required=true)
    private Output<String> functionApp;

    /**
     * @return The name of the Function App.
     * 
     */
    public Output<String> functionApp() {
        return this.functionApp;
    }

    /**
     * The name of the function in the Function App.
     * 
     */
    @Import(name="functionName", required=true)
    private Output<String> functionName;

    /**
     * @return The name of the function in the Function App.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }

    /**
     * The name which should be used for this Stream Analytics Output. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Stream Analytics Output. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Stream Analytics Output should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Output should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobName", required=true)
    private Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsJobName() {
        return this.streamAnalyticsJobName;
    }

    private OutputFunctionArgs() {}

    private OutputFunctionArgs(OutputFunctionArgs $) {
        this.apiKey = $.apiKey;
        this.batchMaxCount = $.batchMaxCount;
        this.batchMaxInBytes = $.batchMaxInBytes;
        this.functionApp = $.functionApp;
        this.functionName = $.functionName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.streamAnalyticsJobName = $.streamAnalyticsJobName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputFunctionArgs $;

        public Builder() {
            $ = new OutputFunctionArgs();
        }

        public Builder(OutputFunctionArgs defaults) {
            $ = new OutputFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey The API key for the Function.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The API key for the Function.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param batchMaxCount The maximum number of events in each batch that&#39;s sent to the function. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder batchMaxCount(@Nullable Output<Integer> batchMaxCount) {
            $.batchMaxCount = batchMaxCount;
            return this;
        }

        /**
         * @param batchMaxCount The maximum number of events in each batch that&#39;s sent to the function. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder batchMaxCount(Integer batchMaxCount) {
            return batchMaxCount(Output.of(batchMaxCount));
        }

        /**
         * @param batchMaxInBytes The maximum batch size in bytes that&#39;s sent to the function. Defaults to `262144` (256 kB).
         * 
         * @return builder
         * 
         */
        public Builder batchMaxInBytes(@Nullable Output<Integer> batchMaxInBytes) {
            $.batchMaxInBytes = batchMaxInBytes;
            return this;
        }

        /**
         * @param batchMaxInBytes The maximum batch size in bytes that&#39;s sent to the function. Defaults to `262144` (256 kB).
         * 
         * @return builder
         * 
         */
        public Builder batchMaxInBytes(Integer batchMaxInBytes) {
            return batchMaxInBytes(Output.of(batchMaxInBytes));
        }

        /**
         * @param functionApp The name of the Function App.
         * 
         * @return builder
         * 
         */
        public Builder functionApp(Output<String> functionApp) {
            $.functionApp = functionApp;
            return this;
        }

        /**
         * @param functionApp The name of the Function App.
         * 
         * @return builder
         * 
         */
        public Builder functionApp(String functionApp) {
            return functionApp(Output.of(functionApp));
        }

        /**
         * @param functionName The name of the function in the Function App.
         * 
         * @return builder
         * 
         */
        public Builder functionName(Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName The name of the function in the Function App.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param name The name which should be used for this Stream Analytics Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Stream Analytics Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Output should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Output should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(Output<String> streamAnalyticsJobName) {
            $.streamAnalyticsJobName = streamAnalyticsJobName;
            return this;
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(String streamAnalyticsJobName) {
            return streamAnalyticsJobName(Output.of(streamAnalyticsJobName));
        }

        public OutputFunctionArgs build() {
            $.apiKey = Objects.requireNonNull($.apiKey, "expected parameter 'apiKey' to be non-null");
            $.functionApp = Objects.requireNonNull($.functionApp, "expected parameter 'functionApp' to be non-null");
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.streamAnalyticsJobName = Objects.requireNonNull($.streamAnalyticsJobName, "expected parameter 'streamAnalyticsJobName' to be non-null");
            return $;
        }
    }

}
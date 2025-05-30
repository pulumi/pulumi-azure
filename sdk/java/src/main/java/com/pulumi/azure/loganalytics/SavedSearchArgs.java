// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SavedSearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SavedSearchArgs Empty = new SavedSearchArgs();

    /**
     * The category that the Saved Search will be listed under. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="category", required=true)
    private Output<String> category;

    /**
     * @return The category that the Saved Search will be listed under. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> category() {
        return this.category;
    }

    /**
     * The name that Saved Search will be displayed as. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name that Saved Search will be displayed as. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The function alias if the query serves as a function. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="functionAlias")
    private @Nullable Output<String> functionAlias;

    /**
     * @return The function alias if the query serves as a function. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> functionAlias() {
        return Optional.ofNullable(this.functionAlias);
    }

    /**
     * The function parameters if the query serves as a function. Changing this forces a new resource to be created. For more examples and proper syntax please refer to [this document](https://learn.microsoft.com/en-us/azure/data-explorer/kusto/query/functions/user-defined-functions).
     * 
     */
    @Import(name="functionParameters")
    private @Nullable Output<List<String>> functionParameters;

    /**
     * @return The function parameters if the query serves as a function. Changing this forces a new resource to be created. For more examples and proper syntax please refer to [this document](https://learn.microsoft.com/en-us/azure/data-explorer/kusto/query/functions/user-defined-functions).
     * 
     */
    public Optional<Output<List<String>>> functionParameters() {
        return Optional.ofNullable(this.functionParameters);
    }

    /**
     * Specifies the ID of the Log Analytics Workspace that the Saved Search will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId", required=true)
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return Specifies the ID of the Log Analytics Workspace that the Saved Search will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }

    /**
     * Specifies the name of the Log Analytics Saved Search. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Log Analytics Saved Search. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The query expression for the saved search. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return The query expression for the saved search. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    /**
     * A mapping of tags which should be assigned to the Logs Analytics Saved Search. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Logs Analytics Saved Search. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SavedSearchArgs() {}

    private SavedSearchArgs(SavedSearchArgs $) {
        this.category = $.category;
        this.displayName = $.displayName;
        this.functionAlias = $.functionAlias;
        this.functionParameters = $.functionParameters;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.name = $.name;
        this.query = $.query;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SavedSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SavedSearchArgs $;

        public Builder() {
            $ = new SavedSearchArgs();
        }

        public Builder(SavedSearchArgs defaults) {
            $ = new SavedSearchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category The category that the Saved Search will be listed under. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder category(Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category that the Saved Search will be listed under. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param displayName The name that Saved Search will be displayed as. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name that Saved Search will be displayed as. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param functionAlias The function alias if the query serves as a function. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder functionAlias(@Nullable Output<String> functionAlias) {
            $.functionAlias = functionAlias;
            return this;
        }

        /**
         * @param functionAlias The function alias if the query serves as a function. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder functionAlias(String functionAlias) {
            return functionAlias(Output.of(functionAlias));
        }

        /**
         * @param functionParameters The function parameters if the query serves as a function. Changing this forces a new resource to be created. For more examples and proper syntax please refer to [this document](https://learn.microsoft.com/en-us/azure/data-explorer/kusto/query/functions/user-defined-functions).
         * 
         * @return builder
         * 
         */
        public Builder functionParameters(@Nullable Output<List<String>> functionParameters) {
            $.functionParameters = functionParameters;
            return this;
        }

        /**
         * @param functionParameters The function parameters if the query serves as a function. Changing this forces a new resource to be created. For more examples and proper syntax please refer to [this document](https://learn.microsoft.com/en-us/azure/data-explorer/kusto/query/functions/user-defined-functions).
         * 
         * @return builder
         * 
         */
        public Builder functionParameters(List<String> functionParameters) {
            return functionParameters(Output.of(functionParameters));
        }

        /**
         * @param functionParameters The function parameters if the query serves as a function. Changing this forces a new resource to be created. For more examples and proper syntax please refer to [this document](https://learn.microsoft.com/en-us/azure/data-explorer/kusto/query/functions/user-defined-functions).
         * 
         * @return builder
         * 
         */
        public Builder functionParameters(String... functionParameters) {
            return functionParameters(List.of(functionParameters));
        }

        /**
         * @param logAnalyticsWorkspaceId Specifies the ID of the Log Analytics Workspace that the Saved Search will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId Specifies the ID of the Log Analytics Workspace that the Saved Search will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param name Specifies the name of the Log Analytics Saved Search. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Log Analytics Saved Search. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param query The query expression for the saved search. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The query expression for the saved search. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Logs Analytics Saved Search. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Logs Analytics Saved Search. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SavedSearchArgs build() {
            if ($.category == null) {
                throw new MissingRequiredPropertyException("SavedSearchArgs", "category");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("SavedSearchArgs", "displayName");
            }
            if ($.logAnalyticsWorkspaceId == null) {
                throw new MissingRequiredPropertyException("SavedSearchArgs", "logAnalyticsWorkspaceId");
            }
            if ($.query == null) {
                throw new MissingRequiredPropertyException("SavedSearchArgs", "query");
            }
            return $;
        }
    }

}

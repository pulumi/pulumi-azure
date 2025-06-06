// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dynatrace.inputs;

import com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleFilteringTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagRulesLogRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagRulesLogRuleArgs Empty = new TagRulesLogRuleArgs();

    /**
     * Filtering tag for the log rule. A `filtering_tag` block as defined below.
     * 
     */
    @Import(name="filteringTags", required=true)
    private Output<List<TagRulesLogRuleFilteringTagArgs>> filteringTags;

    /**
     * @return Filtering tag for the log rule. A `filtering_tag` block as defined below.
     * 
     */
    public Output<List<TagRulesLogRuleFilteringTagArgs>> filteringTags() {
        return this.filteringTags;
    }

    /**
     * Send Activity logs. The default value is `false`.
     * 
     */
    @Import(name="sendActivityLogsEnabled")
    private @Nullable Output<Boolean> sendActivityLogsEnabled;

    /**
     * @return Send Activity logs. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> sendActivityLogsEnabled() {
        return Optional.ofNullable(this.sendActivityLogsEnabled);
    }

    /**
     * Send Azure Active Directory logs. The default value is `false`.
     * 
     */
    @Import(name="sendAzureActiveDirectoryLogsEnabled")
    private @Nullable Output<Boolean> sendAzureActiveDirectoryLogsEnabled;

    /**
     * @return Send Azure Active Directory logs. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> sendAzureActiveDirectoryLogsEnabled() {
        return Optional.ofNullable(this.sendAzureActiveDirectoryLogsEnabled);
    }

    /**
     * Send Subscription logs. The default value is `false`.
     * 
     */
    @Import(name="sendSubscriptionLogsEnabled")
    private @Nullable Output<Boolean> sendSubscriptionLogsEnabled;

    /**
     * @return Send Subscription logs. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> sendSubscriptionLogsEnabled() {
        return Optional.ofNullable(this.sendSubscriptionLogsEnabled);
    }

    private TagRulesLogRuleArgs() {}

    private TagRulesLogRuleArgs(TagRulesLogRuleArgs $) {
        this.filteringTags = $.filteringTags;
        this.sendActivityLogsEnabled = $.sendActivityLogsEnabled;
        this.sendAzureActiveDirectoryLogsEnabled = $.sendAzureActiveDirectoryLogsEnabled;
        this.sendSubscriptionLogsEnabled = $.sendSubscriptionLogsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagRulesLogRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagRulesLogRuleArgs $;

        public Builder() {
            $ = new TagRulesLogRuleArgs();
        }

        public Builder(TagRulesLogRuleArgs defaults) {
            $ = new TagRulesLogRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filteringTags Filtering tag for the log rule. A `filtering_tag` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder filteringTags(Output<List<TagRulesLogRuleFilteringTagArgs>> filteringTags) {
            $.filteringTags = filteringTags;
            return this;
        }

        /**
         * @param filteringTags Filtering tag for the log rule. A `filtering_tag` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder filteringTags(List<TagRulesLogRuleFilteringTagArgs> filteringTags) {
            return filteringTags(Output.of(filteringTags));
        }

        /**
         * @param filteringTags Filtering tag for the log rule. A `filtering_tag` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder filteringTags(TagRulesLogRuleFilteringTagArgs... filteringTags) {
            return filteringTags(List.of(filteringTags));
        }

        /**
         * @param sendActivityLogsEnabled Send Activity logs. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder sendActivityLogsEnabled(@Nullable Output<Boolean> sendActivityLogsEnabled) {
            $.sendActivityLogsEnabled = sendActivityLogsEnabled;
            return this;
        }

        /**
         * @param sendActivityLogsEnabled Send Activity logs. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder sendActivityLogsEnabled(Boolean sendActivityLogsEnabled) {
            return sendActivityLogsEnabled(Output.of(sendActivityLogsEnabled));
        }

        /**
         * @param sendAzureActiveDirectoryLogsEnabled Send Azure Active Directory logs. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder sendAzureActiveDirectoryLogsEnabled(@Nullable Output<Boolean> sendAzureActiveDirectoryLogsEnabled) {
            $.sendAzureActiveDirectoryLogsEnabled = sendAzureActiveDirectoryLogsEnabled;
            return this;
        }

        /**
         * @param sendAzureActiveDirectoryLogsEnabled Send Azure Active Directory logs. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder sendAzureActiveDirectoryLogsEnabled(Boolean sendAzureActiveDirectoryLogsEnabled) {
            return sendAzureActiveDirectoryLogsEnabled(Output.of(sendAzureActiveDirectoryLogsEnabled));
        }

        /**
         * @param sendSubscriptionLogsEnabled Send Subscription logs. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder sendSubscriptionLogsEnabled(@Nullable Output<Boolean> sendSubscriptionLogsEnabled) {
            $.sendSubscriptionLogsEnabled = sendSubscriptionLogsEnabled;
            return this;
        }

        /**
         * @param sendSubscriptionLogsEnabled Send Subscription logs. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder sendSubscriptionLogsEnabled(Boolean sendSubscriptionLogsEnabled) {
            return sendSubscriptionLogsEnabled(Output.of(sendSubscriptionLogsEnabled));
        }

        public TagRulesLogRuleArgs build() {
            if ($.filteringTags == null) {
                throw new MissingRequiredPropertyException("TagRulesLogRuleArgs", "filteringTags");
            }
            return $;
        }
    }

}

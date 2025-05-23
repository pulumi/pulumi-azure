// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TagRulesLogRuleFilteringTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagRulesLogRuleFilteringTagArgs Empty = new TagRulesLogRuleFilteringTagArgs();

    /**
     * Action of the filtering tag. Possible values are `Include` and `Exclude`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Action of the filtering tag. Possible values are `Include` and `Exclude`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Name of the filtering tag.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the filtering tag.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Value of the filtering tag.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of the filtering tag.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private TagRulesLogRuleFilteringTagArgs() {}

    private TagRulesLogRuleFilteringTagArgs(TagRulesLogRuleFilteringTagArgs $) {
        this.action = $.action;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagRulesLogRuleFilteringTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagRulesLogRuleFilteringTagArgs $;

        public Builder() {
            $ = new TagRulesLogRuleFilteringTagArgs();
        }

        public Builder(TagRulesLogRuleFilteringTagArgs defaults) {
            $ = new TagRulesLogRuleFilteringTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action of the filtering tag. Possible values are `Include` and `Exclude`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action of the filtering tag. Possible values are `Include` and `Exclude`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param name Name of the filtering tag.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the filtering tag.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value of the filtering tag.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the filtering tag.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TagRulesLogRuleFilteringTagArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("TagRulesLogRuleFilteringTagArgs", "action");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("TagRulesLogRuleFilteringTagArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("TagRulesLogRuleFilteringTagArgs", "value");
            }
            return $;
        }
    }

}

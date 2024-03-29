// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocalRulestackFqdnListState extends com.pulumi.resources.ResourceArgs {

    public static final LocalRulestackFqdnListState Empty = new LocalRulestackFqdnListState();

    /**
     * The comment for Audit purposes.
     * 
     */
    @Import(name="auditComment")
    private @Nullable Output<String> auditComment;

    /**
     * @return The comment for Audit purposes.
     * 
     */
    public Optional<Output<String>> auditComment() {
        return Optional.ofNullable(this.auditComment);
    }

    /**
     * The description for the FQDN List.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the FQDN List.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies a list of Fully Qualified Domain Names.
     * 
     */
    @Import(name="fullyQualifiedDomainNames")
    private @Nullable Output<List<String>> fullyQualifiedDomainNames;

    /**
     * @return Specifies a list of Fully Qualified Domain Names.
     * 
     */
    public Optional<Output<List<String>>> fullyQualifiedDomainNames() {
        return Optional.ofNullable(this.fullyQualifiedDomainNames);
    }

    /**
     * The name which should be used for this Palo Alto Local Rulestack FQDN List.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Palo Alto Local Rulestack FQDN List.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the TODO. Changing this forces a new Palo Alto Local Rulestack FQDN List to be created.
     * 
     */
    @Import(name="rulestackId")
    private @Nullable Output<String> rulestackId;

    /**
     * @return The ID of the TODO. Changing this forces a new Palo Alto Local Rulestack FQDN List to be created.
     * 
     */
    public Optional<Output<String>> rulestackId() {
        return Optional.ofNullable(this.rulestackId);
    }

    private LocalRulestackFqdnListState() {}

    private LocalRulestackFqdnListState(LocalRulestackFqdnListState $) {
        this.auditComment = $.auditComment;
        this.description = $.description;
        this.fullyQualifiedDomainNames = $.fullyQualifiedDomainNames;
        this.name = $.name;
        this.rulestackId = $.rulestackId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalRulestackFqdnListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalRulestackFqdnListState $;

        public Builder() {
            $ = new LocalRulestackFqdnListState();
        }

        public Builder(LocalRulestackFqdnListState defaults) {
            $ = new LocalRulestackFqdnListState(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditComment The comment for Audit purposes.
         * 
         * @return builder
         * 
         */
        public Builder auditComment(@Nullable Output<String> auditComment) {
            $.auditComment = auditComment;
            return this;
        }

        /**
         * @param auditComment The comment for Audit purposes.
         * 
         * @return builder
         * 
         */
        public Builder auditComment(String auditComment) {
            return auditComment(Output.of(auditComment));
        }

        /**
         * @param description The description for the FQDN List.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the FQDN List.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fullyQualifiedDomainNames Specifies a list of Fully Qualified Domain Names.
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedDomainNames(@Nullable Output<List<String>> fullyQualifiedDomainNames) {
            $.fullyQualifiedDomainNames = fullyQualifiedDomainNames;
            return this;
        }

        /**
         * @param fullyQualifiedDomainNames Specifies a list of Fully Qualified Domain Names.
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedDomainNames(List<String> fullyQualifiedDomainNames) {
            return fullyQualifiedDomainNames(Output.of(fullyQualifiedDomainNames));
        }

        /**
         * @param fullyQualifiedDomainNames Specifies a list of Fully Qualified Domain Names.
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedDomainNames(String... fullyQualifiedDomainNames) {
            return fullyQualifiedDomainNames(List.of(fullyQualifiedDomainNames));
        }

        /**
         * @param name The name which should be used for this Palo Alto Local Rulestack FQDN List.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Palo Alto Local Rulestack FQDN List.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rulestackId The ID of the TODO. Changing this forces a new Palo Alto Local Rulestack FQDN List to be created.
         * 
         * @return builder
         * 
         */
        public Builder rulestackId(@Nullable Output<String> rulestackId) {
            $.rulestackId = rulestackId;
            return this;
        }

        /**
         * @param rulestackId The ID of the TODO. Changing this forces a new Palo Alto Local Rulestack FQDN List to be created.
         * 
         * @return builder
         * 
         */
        public Builder rulestackId(String rulestackId) {
            return rulestackId(Output.of(rulestackId));
        }

        public LocalRulestackFqdnListState build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceGroupPolicyAssignmentOverrideSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceGroupPolicyAssignmentOverrideSelectorArgs Empty = new ResourceGroupPolicyAssignmentOverrideSelectorArgs();

    /**
     * Specify the list of policy reference id values to filter in. Cannot be used with `not_in`.
     * 
     */
    @Import(name="ins")
    private @Nullable Output<List<String>> ins;

    /**
     * @return Specify the list of policy reference id values to filter in. Cannot be used with `not_in`.
     * 
     */
    public Optional<Output<List<String>>> ins() {
        return Optional.ofNullable(this.ins);
    }

    /**
     * Specifies which characteristic will narrow down the set of evaluated resources. Possible values are `resourceLocation`,  `resourceType` and `resourceWithoutLocation`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Specifies which characteristic will narrow down the set of evaluated resources. Possible values are `resourceLocation`,  `resourceType` and `resourceWithoutLocation`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Specify the list of policy reference id values to filter out. Cannot be used with `in`.
     * 
     */
    @Import(name="notIns")
    private @Nullable Output<List<String>> notIns;

    /**
     * @return Specify the list of policy reference id values to filter out. Cannot be used with `in`.
     * 
     */
    public Optional<Output<List<String>>> notIns() {
        return Optional.ofNullable(this.notIns);
    }

    private ResourceGroupPolicyAssignmentOverrideSelectorArgs() {}

    private ResourceGroupPolicyAssignmentOverrideSelectorArgs(ResourceGroupPolicyAssignmentOverrideSelectorArgs $) {
        this.ins = $.ins;
        this.kind = $.kind;
        this.notIns = $.notIns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceGroupPolicyAssignmentOverrideSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceGroupPolicyAssignmentOverrideSelectorArgs $;

        public Builder() {
            $ = new ResourceGroupPolicyAssignmentOverrideSelectorArgs();
        }

        public Builder(ResourceGroupPolicyAssignmentOverrideSelectorArgs defaults) {
            $ = new ResourceGroupPolicyAssignmentOverrideSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ins Specify the list of policy reference id values to filter in. Cannot be used with `not_in`.
         * 
         * @return builder
         * 
         */
        public Builder ins(@Nullable Output<List<String>> ins) {
            $.ins = ins;
            return this;
        }

        /**
         * @param ins Specify the list of policy reference id values to filter in. Cannot be used with `not_in`.
         * 
         * @return builder
         * 
         */
        public Builder ins(List<String> ins) {
            return ins(Output.of(ins));
        }

        /**
         * @param ins Specify the list of policy reference id values to filter in. Cannot be used with `not_in`.
         * 
         * @return builder
         * 
         */
        public Builder ins(String... ins) {
            return ins(List.of(ins));
        }

        /**
         * @param kind Specifies which characteristic will narrow down the set of evaluated resources. Possible values are `resourceLocation`,  `resourceType` and `resourceWithoutLocation`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Specifies which characteristic will narrow down the set of evaluated resources. Possible values are `resourceLocation`,  `resourceType` and `resourceWithoutLocation`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param notIns Specify the list of policy reference id values to filter out. Cannot be used with `in`.
         * 
         * @return builder
         * 
         */
        public Builder notIns(@Nullable Output<List<String>> notIns) {
            $.notIns = notIns;
            return this;
        }

        /**
         * @param notIns Specify the list of policy reference id values to filter out. Cannot be used with `in`.
         * 
         * @return builder
         * 
         */
        public Builder notIns(List<String> notIns) {
            return notIns(Output.of(notIns));
        }

        /**
         * @param notIns Specify the list of policy reference id values to filter out. Cannot be used with `in`.
         * 
         * @return builder
         * 
         */
        public Builder notIns(String... notIns) {
            return notIns(List.of(notIns));
        }

        public ResourceGroupPolicyAssignmentOverrideSelectorArgs build() {
            return $;
        }
    }

}
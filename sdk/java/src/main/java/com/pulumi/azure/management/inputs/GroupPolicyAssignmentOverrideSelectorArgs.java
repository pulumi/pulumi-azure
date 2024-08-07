// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPolicyAssignmentOverrideSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPolicyAssignmentOverrideSelectorArgs Empty = new GroupPolicyAssignmentOverrideSelectorArgs();

    @Import(name="ins")
    private @Nullable Output<List<String>> ins;

    public Optional<Output<List<String>>> ins() {
        return Optional.ofNullable(this.ins);
    }

    /**
     * Specifies which characteristic will narrow down the set of evaluated resources. Possible values are `resourceLocation`, `resourceType` and `resourceWithoutLocation`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Specifies which characteristic will narrow down the set of evaluated resources. Possible values are `resourceLocation`, `resourceType` and `resourceWithoutLocation`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    @Import(name="notIns")
    private @Nullable Output<List<String>> notIns;

    public Optional<Output<List<String>>> notIns() {
        return Optional.ofNullable(this.notIns);
    }

    private GroupPolicyAssignmentOverrideSelectorArgs() {}

    private GroupPolicyAssignmentOverrideSelectorArgs(GroupPolicyAssignmentOverrideSelectorArgs $) {
        this.ins = $.ins;
        this.kind = $.kind;
        this.notIns = $.notIns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPolicyAssignmentOverrideSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPolicyAssignmentOverrideSelectorArgs $;

        public Builder() {
            $ = new GroupPolicyAssignmentOverrideSelectorArgs();
        }

        public Builder(GroupPolicyAssignmentOverrideSelectorArgs defaults) {
            $ = new GroupPolicyAssignmentOverrideSelectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder ins(@Nullable Output<List<String>> ins) {
            $.ins = ins;
            return this;
        }

        public Builder ins(List<String> ins) {
            return ins(Output.of(ins));
        }

        public Builder ins(String... ins) {
            return ins(List.of(ins));
        }

        /**
         * @param kind Specifies which characteristic will narrow down the set of evaluated resources. Possible values are `resourceLocation`, `resourceType` and `resourceWithoutLocation`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Specifies which characteristic will narrow down the set of evaluated resources. Possible values are `resourceLocation`, `resourceType` and `resourceWithoutLocation`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder notIns(@Nullable Output<List<String>> notIns) {
            $.notIns = notIns;
            return this;
        }

        public Builder notIns(List<String> notIns) {
            return notIns(Output.of(notIns));
        }

        public Builder notIns(String... notIns) {
            return notIns(List.of(notIns));
        }

        public GroupPolicyAssignmentOverrideSelectorArgs build() {
            return $;
        }
    }

}

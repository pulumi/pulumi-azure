// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFhirServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFhirServiceArgs Empty = new GetFhirServiceArgs();

    /**
     * The name of the Healthcare FHIR Service.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Healthcare FHIR Service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The map of tags assigned to the Healthcare FHIR Service.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The map of tags assigned to the Healthcare FHIR Service.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the Healthcare Workspace in which the Healthcare FHIR Service exists.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The name of the Healthcare Workspace in which the Healthcare FHIR Service exists.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private GetFhirServiceArgs() {}

    private GetFhirServiceArgs(GetFhirServiceArgs $) {
        this.name = $.name;
        this.tags = $.tags;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFhirServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFhirServiceArgs $;

        public Builder() {
            $ = new GetFhirServiceArgs();
        }

        public Builder(GetFhirServiceArgs defaults) {
            $ = new GetFhirServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Healthcare FHIR Service.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Healthcare FHIR Service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags The map of tags assigned to the Healthcare FHIR Service.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The map of tags assigned to the Healthcare FHIR Service.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workspaceId The name of the Healthcare Workspace in which the Healthcare FHIR Service exists.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The name of the Healthcare Workspace in which the Healthcare FHIR Service exists.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public GetFhirServiceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.workspaceId = Objects.requireNonNull($.workspaceId, "expected parameter 'workspaceId' to be non-null");
            return $;
        }
    }

}
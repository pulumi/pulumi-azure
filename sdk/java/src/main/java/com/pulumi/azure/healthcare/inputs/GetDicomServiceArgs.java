// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDicomServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDicomServiceArgs Empty = new GetDicomServiceArgs();

    /**
     * The name of the Healthcare DICOM Service
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Healthcare DICOM Service
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Healthcare Workspace in which the Healthcare DICOM Service exists.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The name of the Healthcare Workspace in which the Healthcare DICOM Service exists.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private GetDicomServiceArgs() {}

    private GetDicomServiceArgs(GetDicomServiceArgs $) {
        this.name = $.name;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDicomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDicomServiceArgs $;

        public Builder() {
            $ = new GetDicomServiceArgs();
        }

        public Builder(GetDicomServiceArgs defaults) {
            $ = new GetDicomServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Healthcare DICOM Service
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Healthcare DICOM Service
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param workspaceId The name of the Healthcare Workspace in which the Healthcare DICOM Service exists.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The name of the Healthcare Workspace in which the Healthcare DICOM Service exists.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public GetDicomServiceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.workspaceId = Objects.requireNonNull($.workspaceId, "expected parameter 'workspaceId' to be non-null");
            return $;
        }
    }

}
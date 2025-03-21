// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class VirtualMachineBootDiagnosticsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineBootDiagnosticsArgs Empty = new VirtualMachineBootDiagnosticsArgs();

    /**
     * Should Boot Diagnostics be enabled for this Virtual Machine?
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Should Boot Diagnostics be enabled for this Virtual Machine?
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The Storage Account&#39;s Blob Endpoint which should hold the virtual machine&#39;s diagnostic files.
     * 
     * &gt; **NOTE:** This needs to be the root of a Storage Account and not a Storage Container.
     * 
     */
    @Import(name="storageUri", required=true)
    private Output<String> storageUri;

    /**
     * @return The Storage Account&#39;s Blob Endpoint which should hold the virtual machine&#39;s diagnostic files.
     * 
     * &gt; **NOTE:** This needs to be the root of a Storage Account and not a Storage Container.
     * 
     */
    public Output<String> storageUri() {
        return this.storageUri;
    }

    private VirtualMachineBootDiagnosticsArgs() {}

    private VirtualMachineBootDiagnosticsArgs(VirtualMachineBootDiagnosticsArgs $) {
        this.enabled = $.enabled;
        this.storageUri = $.storageUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineBootDiagnosticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineBootDiagnosticsArgs $;

        public Builder() {
            $ = new VirtualMachineBootDiagnosticsArgs();
        }

        public Builder(VirtualMachineBootDiagnosticsArgs defaults) {
            $ = new VirtualMachineBootDiagnosticsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Should Boot Diagnostics be enabled for this Virtual Machine?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should Boot Diagnostics be enabled for this Virtual Machine?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param storageUri The Storage Account&#39;s Blob Endpoint which should hold the virtual machine&#39;s diagnostic files.
         * 
         * &gt; **NOTE:** This needs to be the root of a Storage Account and not a Storage Container.
         * 
         * @return builder
         * 
         */
        public Builder storageUri(Output<String> storageUri) {
            $.storageUri = storageUri;
            return this;
        }

        /**
         * @param storageUri The Storage Account&#39;s Blob Endpoint which should hold the virtual machine&#39;s diagnostic files.
         * 
         * &gt; **NOTE:** This needs to be the root of a Storage Account and not a Storage Container.
         * 
         * @return builder
         * 
         */
        public Builder storageUri(String storageUri) {
            return storageUri(Output.of(storageUri));
        }

        public VirtualMachineBootDiagnosticsArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("VirtualMachineBootDiagnosticsArgs", "enabled");
            }
            if ($.storageUri == null) {
                throw new MissingRequiredPropertyException("VirtualMachineBootDiagnosticsArgs", "storageUri");
            }
            return $;
        }
    }

}

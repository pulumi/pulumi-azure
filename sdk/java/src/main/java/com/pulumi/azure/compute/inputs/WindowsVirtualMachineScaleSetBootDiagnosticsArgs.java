// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsVirtualMachineScaleSetBootDiagnosticsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsVirtualMachineScaleSetBootDiagnosticsArgs Empty = new WindowsVirtualMachineScaleSetBootDiagnosticsArgs();

    /**
     * The Primary/Secondary Endpoint for the Azure Storage Account which should be used to store Boot Diagnostics, including Console Output and Screenshots from the Hypervisor.
     * 
     * &gt; **Note:** Passing a null value will utilize a Managed Storage Account to store Boot Diagnostics
     * 
     */
    @Import(name="storageAccountUri")
    private @Nullable Output<String> storageAccountUri;

    /**
     * @return The Primary/Secondary Endpoint for the Azure Storage Account which should be used to store Boot Diagnostics, including Console Output and Screenshots from the Hypervisor.
     * 
     * &gt; **Note:** Passing a null value will utilize a Managed Storage Account to store Boot Diagnostics
     * 
     */
    public Optional<Output<String>> storageAccountUri() {
        return Optional.ofNullable(this.storageAccountUri);
    }

    private WindowsVirtualMachineScaleSetBootDiagnosticsArgs() {}

    private WindowsVirtualMachineScaleSetBootDiagnosticsArgs(WindowsVirtualMachineScaleSetBootDiagnosticsArgs $) {
        this.storageAccountUri = $.storageAccountUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsVirtualMachineScaleSetBootDiagnosticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsVirtualMachineScaleSetBootDiagnosticsArgs $;

        public Builder() {
            $ = new WindowsVirtualMachineScaleSetBootDiagnosticsArgs();
        }

        public Builder(WindowsVirtualMachineScaleSetBootDiagnosticsArgs defaults) {
            $ = new WindowsVirtualMachineScaleSetBootDiagnosticsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param storageAccountUri The Primary/Secondary Endpoint for the Azure Storage Account which should be used to store Boot Diagnostics, including Console Output and Screenshots from the Hypervisor.
         * 
         * &gt; **Note:** Passing a null value will utilize a Managed Storage Account to store Boot Diagnostics
         * 
         * @return builder
         * 
         */
        public Builder storageAccountUri(@Nullable Output<String> storageAccountUri) {
            $.storageAccountUri = storageAccountUri;
            return this;
        }

        /**
         * @param storageAccountUri The Primary/Secondary Endpoint for the Azure Storage Account which should be used to store Boot Diagnostics, including Console Output and Screenshots from the Hypervisor.
         * 
         * &gt; **Note:** Passing a null value will utilize a Managed Storage Account to store Boot Diagnostics
         * 
         * @return builder
         * 
         */
        public Builder storageAccountUri(String storageAccountUri) {
            return storageAccountUri(Output.of(storageAccountUri));
        }

        public WindowsVirtualMachineScaleSetBootDiagnosticsArgs build() {
            return $;
        }
    }

}

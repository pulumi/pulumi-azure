// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsVirtualMachineWinrmListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsVirtualMachineWinrmListenerArgs Empty = new WindowsVirtualMachineWinrmListenerArgs();

    /**
     * The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="certificateUrl")
    private @Nullable Output<String> certificateUrl;

    /**
     * @return The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> certificateUrl() {
        return Optional.ofNullable(this.certificateUrl);
    }

    /**
     * Specifies the protocol of listener. Possible values are `Http` or `Https`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return Specifies the protocol of listener. Possible values are `Http` or `Https`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    private WindowsVirtualMachineWinrmListenerArgs() {}

    private WindowsVirtualMachineWinrmListenerArgs(WindowsVirtualMachineWinrmListenerArgs $) {
        this.certificateUrl = $.certificateUrl;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsVirtualMachineWinrmListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsVirtualMachineWinrmListenerArgs $;

        public Builder() {
            $ = new WindowsVirtualMachineWinrmListenerArgs();
        }

        public Builder(WindowsVirtualMachineWinrmListenerArgs defaults) {
            $ = new WindowsVirtualMachineWinrmListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateUrl The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder certificateUrl(@Nullable Output<String> certificateUrl) {
            $.certificateUrl = certificateUrl;
            return this;
        }

        /**
         * @param certificateUrl The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder certificateUrl(String certificateUrl) {
            return certificateUrl(Output.of(certificateUrl));
        }

        /**
         * @param protocol Specifies the protocol of listener. Possible values are `Http` or `Https`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Specifies the protocol of listener. Possible values are `Http` or `Https`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public WindowsVirtualMachineWinrmListenerArgs build() {
            if ($.protocol == null) {
                throw new MissingRequiredPropertyException("WindowsVirtualMachineWinrmListenerArgs", "protocol");
            }
            return $;
        }
    }

}

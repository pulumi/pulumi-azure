// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.workloadssap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs Empty = new ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs();

    /**
     * Specifies the offer of the platform image or marketplace image used to create the virtual machine. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="offer", required=true)
    private Output<String> offer;

    /**
     * @return Specifies the offer of the platform image or marketplace image used to create the virtual machine. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> offer() {
        return this.offer;
    }

    /**
     * The publisher of the Image. Possible values are `RedHat` and `SUSE`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publisher", required=true)
    private Output<String> publisher;

    /**
     * @return The publisher of the Image. Possible values are `RedHat` and `SUSE`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     * The SKU of the Image. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return The SKU of the Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }

    /**
     * Specifies the version of the platform image or marketplace image used to create the virtual machine. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Specifies the version of the platform image or marketplace image used to create the virtual machine. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs() {}

    private ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs(ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs $) {
        this.offer = $.offer;
        this.publisher = $.publisher;
        this.sku = $.sku;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs $;

        public Builder() {
            $ = new ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs();
        }

        public Builder(ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs defaults) {
            $ = new ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offer Specifies the offer of the platform image or marketplace image used to create the virtual machine. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder offer(Output<String> offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param offer Specifies the offer of the platform image or marketplace image used to create the virtual machine. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder offer(String offer) {
            return offer(Output.of(offer));
        }

        /**
         * @param publisher The publisher of the Image. Possible values are `RedHat` and `SUSE`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher The publisher of the Image. Possible values are `RedHat` and `SUSE`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param sku The SKU of the Image. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the Image. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param version Specifies the version of the platform image or marketplace image used to create the virtual machine. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Specifies the version of the platform image or marketplace image used to create the virtual machine. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs build() {
            if ($.offer == null) {
                throw new MissingRequiredPropertyException("ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs", "offer");
            }
            if ($.publisher == null) {
                throw new MissingRequiredPropertyException("ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs", "publisher");
            }
            if ($.sku == null) {
                throw new MissingRequiredPropertyException("ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs", "sku");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImageArgs", "version");
            }
            return $;
        }
    }

}

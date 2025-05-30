// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.compute.inputs.BastionHostIpConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BastionHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final BastionHostArgs Empty = new BastionHostArgs();

    /**
     * Is Copy/Paste feature enabled for the Bastion Host. Defaults to `true`.
     * 
     */
    @Import(name="copyPasteEnabled")
    private @Nullable Output<Boolean> copyPasteEnabled;

    /**
     * @return Is Copy/Paste feature enabled for the Bastion Host. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> copyPasteEnabled() {
        return Optional.ofNullable(this.copyPasteEnabled);
    }

    /**
     * Is File Copy feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `file_copy_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    @Import(name="fileCopyEnabled")
    private @Nullable Output<Boolean> fileCopyEnabled;

    /**
     * @return Is File Copy feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `file_copy_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    public Optional<Output<Boolean>> fileCopyEnabled() {
        return Optional.ofNullable(this.fileCopyEnabled);
    }

    /**
     * A `ip_configuration` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="ipConfiguration")
    private @Nullable Output<BastionHostIpConfigurationArgs> ipConfiguration;

    /**
     * @return A `ip_configuration` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<BastionHostIpConfigurationArgs>> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }

    /**
     * Is IP Connect feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `ip_connect_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    @Import(name="ipConnectEnabled")
    private @Nullable Output<Boolean> ipConnectEnabled;

    /**
     * @return Is IP Connect feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `ip_connect_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    public Optional<Output<Boolean>> ipConnectEnabled() {
        return Optional.ofNullable(this.ipConnectEnabled);
    }

    /**
     * Is Kerberos authentication feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `kerberos_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    @Import(name="kerberosEnabled")
    private @Nullable Output<Boolean> kerberosEnabled;

    /**
     * @return Is Kerberos authentication feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `kerberos_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    public Optional<Output<Boolean>> kerberosEnabled() {
        return Optional.ofNullable(this.kerberosEnabled);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Review [Azure Bastion Host FAQ](https://docs.microsoft.com/azure/bastion/bastion-faq) for supported locations.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Review [Azure Bastion Host FAQ](https://docs.microsoft.com/azure/bastion/bastion-faq) for supported locations.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Bastion Host. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Bastion Host. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the Bastion Host. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Bastion Host. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The number of scale units with which to provision the Bastion Host. Possible values are between `2` and `50`. Defaults to `2`.
     * 
     * &gt; **Note:** `scale_units` only can be changed when `sku` is `Standard` or `Premium`. `scale_units` is always `2` when `sku` is `Basic`.
     * 
     */
    @Import(name="scaleUnits")
    private @Nullable Output<Integer> scaleUnits;

    /**
     * @return The number of scale units with which to provision the Bastion Host. Possible values are between `2` and `50`. Defaults to `2`.
     * 
     * &gt; **Note:** `scale_units` only can be changed when `sku` is `Standard` or `Premium`. `scale_units` is always `2` when `sku` is `Basic`.
     * 
     */
    public Optional<Output<Integer>> scaleUnits() {
        return Optional.ofNullable(this.scaleUnits);
    }

    /**
     * Is Session Recording feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `session_recording_enabled` is only supported when `sku` is `Premium`.
     * 
     */
    @Import(name="sessionRecordingEnabled")
    private @Nullable Output<Boolean> sessionRecordingEnabled;

    /**
     * @return Is Session Recording feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `session_recording_enabled` is only supported when `sku` is `Premium`.
     * 
     */
    public Optional<Output<Boolean>> sessionRecordingEnabled() {
        return Optional.ofNullable(this.sessionRecordingEnabled);
    }

    /**
     * Is Shareable Link feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `shareable_link_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    @Import(name="shareableLinkEnabled")
    private @Nullable Output<Boolean> shareableLinkEnabled;

    /**
     * @return Is Shareable Link feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `shareable_link_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    public Optional<Output<Boolean>> shareableLinkEnabled() {
        return Optional.ofNullable(this.shareableLinkEnabled);
    }

    /**
     * The SKU of the Bastion Host. Accepted values are `Developer`, `Basic`, `Standard` and `Premium`. Defaults to `Basic`.
     * 
     * &gt; **Note:** Downgrading the SKU will force a new resource to be created.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return The SKU of the Bastion Host. Accepted values are `Developer`, `Basic`, `Standard` and `Premium`. Defaults to `Basic`.
     * 
     * &gt; **Note:** Downgrading the SKU will force a new resource to be created.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Is Tunneling feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `tunneling_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    @Import(name="tunnelingEnabled")
    private @Nullable Output<Boolean> tunnelingEnabled;

    /**
     * @return Is Tunneling feature enabled for the Bastion Host. Defaults to `false`.
     * 
     * &gt; **Note:** `tunneling_enabled` is only supported when `sku` is `Standard` or `Premium`.
     * 
     */
    public Optional<Output<Boolean>> tunnelingEnabled() {
        return Optional.ofNullable(this.tunnelingEnabled);
    }

    /**
     * The ID of the Virtual Network for the Developer Bastion Host. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualNetworkId")
    private @Nullable Output<String> virtualNetworkId;

    /**
     * @return The ID of the Virtual Network for the Developer Bastion Host. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    /**
     * Specifies a list of Availability Zones in which this Public Bastion Host should be located. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this Public Bastion Host should be located. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private BastionHostArgs() {}

    private BastionHostArgs(BastionHostArgs $) {
        this.copyPasteEnabled = $.copyPasteEnabled;
        this.fileCopyEnabled = $.fileCopyEnabled;
        this.ipConfiguration = $.ipConfiguration;
        this.ipConnectEnabled = $.ipConnectEnabled;
        this.kerberosEnabled = $.kerberosEnabled;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scaleUnits = $.scaleUnits;
        this.sessionRecordingEnabled = $.sessionRecordingEnabled;
        this.shareableLinkEnabled = $.shareableLinkEnabled;
        this.sku = $.sku;
        this.tags = $.tags;
        this.tunnelingEnabled = $.tunnelingEnabled;
        this.virtualNetworkId = $.virtualNetworkId;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BastionHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BastionHostArgs $;

        public Builder() {
            $ = new BastionHostArgs();
        }

        public Builder(BastionHostArgs defaults) {
            $ = new BastionHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param copyPasteEnabled Is Copy/Paste feature enabled for the Bastion Host. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder copyPasteEnabled(@Nullable Output<Boolean> copyPasteEnabled) {
            $.copyPasteEnabled = copyPasteEnabled;
            return this;
        }

        /**
         * @param copyPasteEnabled Is Copy/Paste feature enabled for the Bastion Host. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder copyPasteEnabled(Boolean copyPasteEnabled) {
            return copyPasteEnabled(Output.of(copyPasteEnabled));
        }

        /**
         * @param fileCopyEnabled Is File Copy feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `file_copy_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder fileCopyEnabled(@Nullable Output<Boolean> fileCopyEnabled) {
            $.fileCopyEnabled = fileCopyEnabled;
            return this;
        }

        /**
         * @param fileCopyEnabled Is File Copy feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `file_copy_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder fileCopyEnabled(Boolean fileCopyEnabled) {
            return fileCopyEnabled(Output.of(fileCopyEnabled));
        }

        /**
         * @param ipConfiguration A `ip_configuration` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(@Nullable Output<BastionHostIpConfigurationArgs> ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        /**
         * @param ipConfiguration A `ip_configuration` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(BastionHostIpConfigurationArgs ipConfiguration) {
            return ipConfiguration(Output.of(ipConfiguration));
        }

        /**
         * @param ipConnectEnabled Is IP Connect feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `ip_connect_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder ipConnectEnabled(@Nullable Output<Boolean> ipConnectEnabled) {
            $.ipConnectEnabled = ipConnectEnabled;
            return this;
        }

        /**
         * @param ipConnectEnabled Is IP Connect feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `ip_connect_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder ipConnectEnabled(Boolean ipConnectEnabled) {
            return ipConnectEnabled(Output.of(ipConnectEnabled));
        }

        /**
         * @param kerberosEnabled Is Kerberos authentication feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `kerberos_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder kerberosEnabled(@Nullable Output<Boolean> kerberosEnabled) {
            $.kerberosEnabled = kerberosEnabled;
            return this;
        }

        /**
         * @param kerberosEnabled Is Kerberos authentication feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `kerberos_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder kerberosEnabled(Boolean kerberosEnabled) {
            return kerberosEnabled(Output.of(kerberosEnabled));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Review [Azure Bastion Host FAQ](https://docs.microsoft.com/azure/bastion/bastion-faq) for supported locations.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. Review [Azure Bastion Host FAQ](https://docs.microsoft.com/azure/bastion/bastion-faq) for supported locations.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Bastion Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Bastion Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bastion Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bastion Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scaleUnits The number of scale units with which to provision the Bastion Host. Possible values are between `2` and `50`. Defaults to `2`.
         * 
         * &gt; **Note:** `scale_units` only can be changed when `sku` is `Standard` or `Premium`. `scale_units` is always `2` when `sku` is `Basic`.
         * 
         * @return builder
         * 
         */
        public Builder scaleUnits(@Nullable Output<Integer> scaleUnits) {
            $.scaleUnits = scaleUnits;
            return this;
        }

        /**
         * @param scaleUnits The number of scale units with which to provision the Bastion Host. Possible values are between `2` and `50`. Defaults to `2`.
         * 
         * &gt; **Note:** `scale_units` only can be changed when `sku` is `Standard` or `Premium`. `scale_units` is always `2` when `sku` is `Basic`.
         * 
         * @return builder
         * 
         */
        public Builder scaleUnits(Integer scaleUnits) {
            return scaleUnits(Output.of(scaleUnits));
        }

        /**
         * @param sessionRecordingEnabled Is Session Recording feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `session_recording_enabled` is only supported when `sku` is `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder sessionRecordingEnabled(@Nullable Output<Boolean> sessionRecordingEnabled) {
            $.sessionRecordingEnabled = sessionRecordingEnabled;
            return this;
        }

        /**
         * @param sessionRecordingEnabled Is Session Recording feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `session_recording_enabled` is only supported when `sku` is `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder sessionRecordingEnabled(Boolean sessionRecordingEnabled) {
            return sessionRecordingEnabled(Output.of(sessionRecordingEnabled));
        }

        /**
         * @param shareableLinkEnabled Is Shareable Link feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `shareable_link_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder shareableLinkEnabled(@Nullable Output<Boolean> shareableLinkEnabled) {
            $.shareableLinkEnabled = shareableLinkEnabled;
            return this;
        }

        /**
         * @param shareableLinkEnabled Is Shareable Link feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `shareable_link_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder shareableLinkEnabled(Boolean shareableLinkEnabled) {
            return shareableLinkEnabled(Output.of(shareableLinkEnabled));
        }

        /**
         * @param sku The SKU of the Bastion Host. Accepted values are `Developer`, `Basic`, `Standard` and `Premium`. Defaults to `Basic`.
         * 
         * &gt; **Note:** Downgrading the SKU will force a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the Bastion Host. Accepted values are `Developer`, `Basic`, `Standard` and `Premium`. Defaults to `Basic`.
         * 
         * &gt; **Note:** Downgrading the SKU will force a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tunnelingEnabled Is Tunneling feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `tunneling_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder tunnelingEnabled(@Nullable Output<Boolean> tunnelingEnabled) {
            $.tunnelingEnabled = tunnelingEnabled;
            return this;
        }

        /**
         * @param tunnelingEnabled Is Tunneling feature enabled for the Bastion Host. Defaults to `false`.
         * 
         * &gt; **Note:** `tunneling_enabled` is only supported when `sku` is `Standard` or `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder tunnelingEnabled(Boolean tunnelingEnabled) {
            return tunnelingEnabled(Output.of(tunnelingEnabled));
        }

        /**
         * @param virtualNetworkId The ID of the Virtual Network for the Developer Bastion Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(@Nullable Output<String> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        /**
         * @param virtualNetworkId The ID of the Virtual Network for the Developer Bastion Host. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(String virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        /**
         * @param zones Specifies a list of Availability Zones in which this Public Bastion Host should be located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Specifies a list of Availability Zones in which this Public Bastion Host should be located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Specifies a list of Availability Zones in which this Public Bastion Host should be located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public BastionHostArgs build() {
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("BastionHostArgs", "resourceGroupName");
            }
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs Empty = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs();

    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    @Import(name="publicIpAddress", required=true)
    private Output<String> publicIpAddress;

    public Output<String> publicIpAddress() {
        return this.publicIpAddress;
    }

    private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs() {}

    private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs $) {
        this.port = $.port;
        this.publicIpAddress = $.publicIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs $;

        public Builder() {
            $ = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs();
        }

        public Builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs defaults) {
            $ = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder publicIpAddress(Output<String> publicIpAddress) {
            $.publicIpAddress = publicIpAddress;
            return this;
        }

        public Builder publicIpAddress(String publicIpAddress) {
            return publicIpAddress(Output.of(publicIpAddress));
        }

        public NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfigArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.publicIpAddress = Objects.requireNonNull($.publicIpAddress, "expected parameter 'publicIpAddress' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocalRulestackOutboundTrustCertificateAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final LocalRulestackOutboundTrustCertificateAssociationState Empty = new LocalRulestackOutboundTrustCertificateAssociationState();

    /**
     * The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
     * 
     */
    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    /**
     * @return The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
     * 
     */
    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    private LocalRulestackOutboundTrustCertificateAssociationState() {}

    private LocalRulestackOutboundTrustCertificateAssociationState(LocalRulestackOutboundTrustCertificateAssociationState $) {
        this.certificateId = $.certificateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalRulestackOutboundTrustCertificateAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalRulestackOutboundTrustCertificateAssociationState $;

        public Builder() {
            $ = new LocalRulestackOutboundTrustCertificateAssociationState();
        }

        public Builder(LocalRulestackOutboundTrustCertificateAssociationState defaults) {
            $ = new LocalRulestackOutboundTrustCertificateAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        public LocalRulestackOutboundTrustCertificateAssociationState build() {
            return $;
        }
    }

}

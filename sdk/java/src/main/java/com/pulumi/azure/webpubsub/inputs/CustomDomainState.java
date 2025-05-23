// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.webpubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainState extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainState Empty = new CustomDomainState();

    /**
     * Specifies the custom domain name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected Web PubSub Custom Certificate.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return Specifies the custom domain name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected Web PubSub Custom Certificate.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Specifies the name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the Web PubSub Custom Certificate ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="webPubsubCustomCertificateId")
    private @Nullable Output<String> webPubsubCustomCertificateId;

    /**
     * @return Specifies the Web PubSub Custom Certificate ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> webPubsubCustomCertificateId() {
        return Optional.ofNullable(this.webPubsubCustomCertificateId);
    }

    /**
     * Specifies the Web PubSub ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="webPubsubId")
    private @Nullable Output<String> webPubsubId;

    /**
     * @return Specifies the Web PubSub ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> webPubsubId() {
        return Optional.ofNullable(this.webPubsubId);
    }

    private CustomDomainState() {}

    private CustomDomainState(CustomDomainState $) {
        this.domainName = $.domainName;
        this.name = $.name;
        this.webPubsubCustomCertificateId = $.webPubsubCustomCertificateId;
        this.webPubsubId = $.webPubsubId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainState $;

        public Builder() {
            $ = new CustomDomainState();
        }

        public Builder(CustomDomainState defaults) {
            $ = new CustomDomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName Specifies the custom domain name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected Web PubSub Custom Certificate.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Specifies the custom domain name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected Web PubSub Custom Certificate.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param name Specifies the name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param webPubsubCustomCertificateId Specifies the Web PubSub Custom Certificate ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder webPubsubCustomCertificateId(@Nullable Output<String> webPubsubCustomCertificateId) {
            $.webPubsubCustomCertificateId = webPubsubCustomCertificateId;
            return this;
        }

        /**
         * @param webPubsubCustomCertificateId Specifies the Web PubSub Custom Certificate ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder webPubsubCustomCertificateId(String webPubsubCustomCertificateId) {
            return webPubsubCustomCertificateId(Output.of(webPubsubCustomCertificateId));
        }

        /**
         * @param webPubsubId Specifies the Web PubSub ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder webPubsubId(@Nullable Output<String> webPubsubId) {
            $.webPubsubId = webPubsubId;
            return this;
        }

        /**
         * @param webPubsubId Specifies the Web PubSub ID of the Web PubSub Custom Domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder webPubsubId(String webPubsubId) {
            return webPubsubId(Output.of(webPubsubId));
        }

        public CustomDomainState build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudGatewayApiMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudGatewayApiMetadataArgs Empty = new SpringCloudGatewayApiMetadataArgs();

    /**
     * Detailed description of the APIs available on the Gateway instance.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Detailed description of the APIs available on the Gateway instance.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Location of additional documentation for the APIs available on the Gateway instance.
     * 
     */
    @Import(name="documentationUrl")
    private @Nullable Output<String> documentationUrl;

    /**
     * @return Location of additional documentation for the APIs available on the Gateway instance.
     * 
     */
    public Optional<Output<String>> documentationUrl() {
        return Optional.ofNullable(this.documentationUrl);
    }

    /**
     * Base URL that API consumers will use to access APIs on the Gateway instance.
     * 
     */
    @Import(name="serverUrl")
    private @Nullable Output<String> serverUrl;

    /**
     * @return Base URL that API consumers will use to access APIs on the Gateway instance.
     * 
     */
    public Optional<Output<String>> serverUrl() {
        return Optional.ofNullable(this.serverUrl);
    }

    /**
     * Specifies the title describing the context of the APIs available on the Gateway instance.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Specifies the title describing the context of the APIs available on the Gateway instance.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * Specifies the version of APIs available on this Gateway instance.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Specifies the version of APIs available on this Gateway instance.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private SpringCloudGatewayApiMetadataArgs() {}

    private SpringCloudGatewayApiMetadataArgs(SpringCloudGatewayApiMetadataArgs $) {
        this.description = $.description;
        this.documentationUrl = $.documentationUrl;
        this.serverUrl = $.serverUrl;
        this.title = $.title;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudGatewayApiMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudGatewayApiMetadataArgs $;

        public Builder() {
            $ = new SpringCloudGatewayApiMetadataArgs();
        }

        public Builder(SpringCloudGatewayApiMetadataArgs defaults) {
            $ = new SpringCloudGatewayApiMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Detailed description of the APIs available on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Detailed description of the APIs available on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param documentationUrl Location of additional documentation for the APIs available on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder documentationUrl(@Nullable Output<String> documentationUrl) {
            $.documentationUrl = documentationUrl;
            return this;
        }

        /**
         * @param documentationUrl Location of additional documentation for the APIs available on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder documentationUrl(String documentationUrl) {
            return documentationUrl(Output.of(documentationUrl));
        }

        /**
         * @param serverUrl Base URL that API consumers will use to access APIs on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder serverUrl(@Nullable Output<String> serverUrl) {
            $.serverUrl = serverUrl;
            return this;
        }

        /**
         * @param serverUrl Base URL that API consumers will use to access APIs on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder serverUrl(String serverUrl) {
            return serverUrl(Output.of(serverUrl));
        }

        /**
         * @param title Specifies the title describing the context of the APIs available on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Specifies the title describing the context of the APIs available on the Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param version Specifies the version of APIs available on this Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Specifies the version of APIs available on this Gateway instance.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public SpringCloudGatewayApiMetadataArgs build() {
            return $;
        }
    }

}

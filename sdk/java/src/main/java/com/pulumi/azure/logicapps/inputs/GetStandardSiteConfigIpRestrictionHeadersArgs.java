// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStandardSiteConfigIpRestrictionHeadersArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetStandardSiteConfigIpRestrictionHeadersArgs Empty = new GetStandardSiteConfigIpRestrictionHeadersArgs();

    /**
     * A list of allowed Azure FrontDoor IDs in UUID notation.
     * 
     */
    @Import(name="xAzureFdids")
    private @Nullable Output<List<String>> xAzureFdids;

    /**
     * @return A list of allowed Azure FrontDoor IDs in UUID notation.
     * 
     */
    public Optional<Output<List<String>>> xAzureFdids() {
        return Optional.ofNullable(this.xAzureFdids);
    }

    /**
     * A list to allow the Azure FrontDoor health probe header.
     * 
     */
    @Import(name="xFdHealthProbe")
    private @Nullable Output<String> xFdHealthProbe;

    /**
     * @return A list to allow the Azure FrontDoor health probe header.
     * 
     */
    public Optional<Output<String>> xFdHealthProbe() {
        return Optional.ofNullable(this.xFdHealthProbe);
    }

    /**
     * A list of allowed &#39;X-Forwarded-For&#39; IPs in CIDR notation.
     * 
     */
    @Import(name="xForwardedFors")
    private @Nullable Output<List<String>> xForwardedFors;

    /**
     * @return A list of allowed &#39;X-Forwarded-For&#39; IPs in CIDR notation.
     * 
     */
    public Optional<Output<List<String>>> xForwardedFors() {
        return Optional.ofNullable(this.xForwardedFors);
    }

    /**
     * A list of allowed &#39;X-Forwarded-Host&#39; domains.
     * 
     */
    @Import(name="xForwardedHosts")
    private @Nullable Output<List<String>> xForwardedHosts;

    /**
     * @return A list of allowed &#39;X-Forwarded-Host&#39; domains.
     * 
     */
    public Optional<Output<List<String>>> xForwardedHosts() {
        return Optional.ofNullable(this.xForwardedHosts);
    }

    private GetStandardSiteConfigIpRestrictionHeadersArgs() {}

    private GetStandardSiteConfigIpRestrictionHeadersArgs(GetStandardSiteConfigIpRestrictionHeadersArgs $) {
        this.xAzureFdids = $.xAzureFdids;
        this.xFdHealthProbe = $.xFdHealthProbe;
        this.xForwardedFors = $.xForwardedFors;
        this.xForwardedHosts = $.xForwardedHosts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStandardSiteConfigIpRestrictionHeadersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStandardSiteConfigIpRestrictionHeadersArgs $;

        public Builder() {
            $ = new GetStandardSiteConfigIpRestrictionHeadersArgs();
        }

        public Builder(GetStandardSiteConfigIpRestrictionHeadersArgs defaults) {
            $ = new GetStandardSiteConfigIpRestrictionHeadersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param xAzureFdids A list of allowed Azure FrontDoor IDs in UUID notation.
         * 
         * @return builder
         * 
         */
        public Builder xAzureFdids(@Nullable Output<List<String>> xAzureFdids) {
            $.xAzureFdids = xAzureFdids;
            return this;
        }

        /**
         * @param xAzureFdids A list of allowed Azure FrontDoor IDs in UUID notation.
         * 
         * @return builder
         * 
         */
        public Builder xAzureFdids(List<String> xAzureFdids) {
            return xAzureFdids(Output.of(xAzureFdids));
        }

        /**
         * @param xAzureFdids A list of allowed Azure FrontDoor IDs in UUID notation.
         * 
         * @return builder
         * 
         */
        public Builder xAzureFdids(String... xAzureFdids) {
            return xAzureFdids(List.of(xAzureFdids));
        }

        /**
         * @param xFdHealthProbe A list to allow the Azure FrontDoor health probe header.
         * 
         * @return builder
         * 
         */
        public Builder xFdHealthProbe(@Nullable Output<String> xFdHealthProbe) {
            $.xFdHealthProbe = xFdHealthProbe;
            return this;
        }

        /**
         * @param xFdHealthProbe A list to allow the Azure FrontDoor health probe header.
         * 
         * @return builder
         * 
         */
        public Builder xFdHealthProbe(String xFdHealthProbe) {
            return xFdHealthProbe(Output.of(xFdHealthProbe));
        }

        /**
         * @param xForwardedFors A list of allowed &#39;X-Forwarded-For&#39; IPs in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedFors(@Nullable Output<List<String>> xForwardedFors) {
            $.xForwardedFors = xForwardedFors;
            return this;
        }

        /**
         * @param xForwardedFors A list of allowed &#39;X-Forwarded-For&#39; IPs in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedFors(List<String> xForwardedFors) {
            return xForwardedFors(Output.of(xForwardedFors));
        }

        /**
         * @param xForwardedFors A list of allowed &#39;X-Forwarded-For&#39; IPs in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedFors(String... xForwardedFors) {
            return xForwardedFors(List.of(xForwardedFors));
        }

        /**
         * @param xForwardedHosts A list of allowed &#39;X-Forwarded-Host&#39; domains.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedHosts(@Nullable Output<List<String>> xForwardedHosts) {
            $.xForwardedHosts = xForwardedHosts;
            return this;
        }

        /**
         * @param xForwardedHosts A list of allowed &#39;X-Forwarded-Host&#39; domains.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedHosts(List<String> xForwardedHosts) {
            return xForwardedHosts(Output.of(xForwardedHosts));
        }

        /**
         * @param xForwardedHosts A list of allowed &#39;X-Forwarded-Host&#39; domains.
         * 
         * @return builder
         * 
         */
        public Builder xForwardedHosts(String... xForwardedHosts) {
            return xForwardedHosts(List.of(xForwardedHosts));
        }

        public GetStandardSiteConfigIpRestrictionHeadersArgs build() {
            return $;
        }
    }

}

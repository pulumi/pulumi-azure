// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudApiPortalCustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudApiPortalCustomDomainArgs Empty = new SpringCloudApiPortalCustomDomainArgs();

    /**
     * The name which should be used for this Spring Cloud API Portal Domain. Changing this forces a new Spring Cloud API Portal Domain to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud API Portal Domain. Changing this forces a new Spring Cloud API Portal Domain to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal Domain to be created.
     * 
     */
    @Import(name="springCloudApiPortalId", required=true)
    private Output<String> springCloudApiPortalId;

    /**
     * @return The ID of the Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal Domain to be created.
     * 
     */
    public Output<String> springCloudApiPortalId() {
        return this.springCloudApiPortalId;
    }

    /**
     * Specifies the thumbprint of the Spring Cloud Certificate that binds to the Spring Cloud API Portal Domain.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return Specifies the thumbprint of the Spring Cloud Certificate that binds to the Spring Cloud API Portal Domain.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private SpringCloudApiPortalCustomDomainArgs() {}

    private SpringCloudApiPortalCustomDomainArgs(SpringCloudApiPortalCustomDomainArgs $) {
        this.name = $.name;
        this.springCloudApiPortalId = $.springCloudApiPortalId;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudApiPortalCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudApiPortalCustomDomainArgs $;

        public Builder() {
            $ = new SpringCloudApiPortalCustomDomainArgs();
        }

        public Builder(SpringCloudApiPortalCustomDomainArgs defaults) {
            $ = new SpringCloudApiPortalCustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name which should be used for this Spring Cloud API Portal Domain. Changing this forces a new Spring Cloud API Portal Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Spring Cloud API Portal Domain. Changing this forces a new Spring Cloud API Portal Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param springCloudApiPortalId The ID of the Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudApiPortalId(Output<String> springCloudApiPortalId) {
            $.springCloudApiPortalId = springCloudApiPortalId;
            return this;
        }

        /**
         * @param springCloudApiPortalId The ID of the Spring Cloud API Portal. Changing this forces a new Spring Cloud API Portal Domain to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudApiPortalId(String springCloudApiPortalId) {
            return springCloudApiPortalId(Output.of(springCloudApiPortalId));
        }

        /**
         * @param thumbprint Specifies the thumbprint of the Spring Cloud Certificate that binds to the Spring Cloud API Portal Domain.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint Specifies the thumbprint of the Spring Cloud Certificate that binds to the Spring Cloud API Portal Domain.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public SpringCloudApiPortalCustomDomainArgs build() {
            $.springCloudApiPortalId = Objects.requireNonNull($.springCloudApiPortalId, "expected parameter 'springCloudApiPortalId' to be non-null");
            return $;
        }
    }

}
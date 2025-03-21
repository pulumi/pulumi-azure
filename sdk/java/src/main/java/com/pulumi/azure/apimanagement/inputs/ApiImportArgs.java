// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.ApiImportWsdlSelectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiImportArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiImportArgs Empty = new ApiImportArgs();

    /**
     * The format of the content from which the API Definition should be imported. Possible values are: `openapi`, `openapi+json`, `openapi+json-link`, `openapi-link`, `swagger-json`, `swagger-link-json`, `wadl-link-json`, `wadl-xml`, `wsdl` and `wsdl-link`.
     * 
     */
    @Import(name="contentFormat", required=true)
    private Output<String> contentFormat;

    /**
     * @return The format of the content from which the API Definition should be imported. Possible values are: `openapi`, `openapi+json`, `openapi+json-link`, `openapi-link`, `swagger-json`, `swagger-link-json`, `wadl-link-json`, `wadl-xml`, `wsdl` and `wsdl-link`.
     * 
     */
    public Output<String> contentFormat() {
        return this.contentFormat;
    }

    /**
     * The Content from which the API Definition should be imported. When a `content_format` of `*-link-*` is specified this must be a URL, otherwise this must be defined inline. The URL must be accessible and return a valid document; otherwise, deployment may fail.
     * 
     */
    @Import(name="contentValue", required=true)
    private Output<String> contentValue;

    /**
     * @return The Content from which the API Definition should be imported. When a `content_format` of `*-link-*` is specified this must be a URL, otherwise this must be defined inline. The URL must be accessible and return a valid document; otherwise, deployment may fail.
     * 
     */
    public Output<String> contentValue() {
        return this.contentValue;
    }

    /**
     * A `wsdl_selector` block as defined below, which allows you to limit the import of a WSDL to only a subset of the document. This can only be specified when `content_format` is `wsdl` or `wsdl-link`.
     * 
     */
    @Import(name="wsdlSelector")
    private @Nullable Output<ApiImportWsdlSelectorArgs> wsdlSelector;

    /**
     * @return A `wsdl_selector` block as defined below, which allows you to limit the import of a WSDL to only a subset of the document. This can only be specified when `content_format` is `wsdl` or `wsdl-link`.
     * 
     */
    public Optional<Output<ApiImportWsdlSelectorArgs>> wsdlSelector() {
        return Optional.ofNullable(this.wsdlSelector);
    }

    private ApiImportArgs() {}

    private ApiImportArgs(ApiImportArgs $) {
        this.contentFormat = $.contentFormat;
        this.contentValue = $.contentValue;
        this.wsdlSelector = $.wsdlSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiImportArgs $;

        public Builder() {
            $ = new ApiImportArgs();
        }

        public Builder(ApiImportArgs defaults) {
            $ = new ApiImportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentFormat The format of the content from which the API Definition should be imported. Possible values are: `openapi`, `openapi+json`, `openapi+json-link`, `openapi-link`, `swagger-json`, `swagger-link-json`, `wadl-link-json`, `wadl-xml`, `wsdl` and `wsdl-link`.
         * 
         * @return builder
         * 
         */
        public Builder contentFormat(Output<String> contentFormat) {
            $.contentFormat = contentFormat;
            return this;
        }

        /**
         * @param contentFormat The format of the content from which the API Definition should be imported. Possible values are: `openapi`, `openapi+json`, `openapi+json-link`, `openapi-link`, `swagger-json`, `swagger-link-json`, `wadl-link-json`, `wadl-xml`, `wsdl` and `wsdl-link`.
         * 
         * @return builder
         * 
         */
        public Builder contentFormat(String contentFormat) {
            return contentFormat(Output.of(contentFormat));
        }

        /**
         * @param contentValue The Content from which the API Definition should be imported. When a `content_format` of `*-link-*` is specified this must be a URL, otherwise this must be defined inline. The URL must be accessible and return a valid document; otherwise, deployment may fail.
         * 
         * @return builder
         * 
         */
        public Builder contentValue(Output<String> contentValue) {
            $.contentValue = contentValue;
            return this;
        }

        /**
         * @param contentValue The Content from which the API Definition should be imported. When a `content_format` of `*-link-*` is specified this must be a URL, otherwise this must be defined inline. The URL must be accessible and return a valid document; otherwise, deployment may fail.
         * 
         * @return builder
         * 
         */
        public Builder contentValue(String contentValue) {
            return contentValue(Output.of(contentValue));
        }

        /**
         * @param wsdlSelector A `wsdl_selector` block as defined below, which allows you to limit the import of a WSDL to only a subset of the document. This can only be specified when `content_format` is `wsdl` or `wsdl-link`.
         * 
         * @return builder
         * 
         */
        public Builder wsdlSelector(@Nullable Output<ApiImportWsdlSelectorArgs> wsdlSelector) {
            $.wsdlSelector = wsdlSelector;
            return this;
        }

        /**
         * @param wsdlSelector A `wsdl_selector` block as defined below, which allows you to limit the import of a WSDL to only a subset of the document. This can only be specified when `content_format` is `wsdl` or `wsdl-link`.
         * 
         * @return builder
         * 
         */
        public Builder wsdlSelector(ApiImportWsdlSelectorArgs wsdlSelector) {
            return wsdlSelector(Output.of(wsdlSelector));
        }

        public ApiImportArgs build() {
            if ($.contentFormat == null) {
                throw new MissingRequiredPropertyException("ApiImportArgs", "contentFormat");
            }
            if ($.contentValue == null) {
                throw new MissingRequiredPropertyException("ApiImportArgs", "contentValue");
            }
            return $;
        }
    }

}

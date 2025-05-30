// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.ServiceArgs;
import com.pulumi.azure.apimanagement.inputs.ServiceState;
import com.pulumi.azure.apimanagement.outputs.ServiceAdditionalLocation;
import com.pulumi.azure.apimanagement.outputs.ServiceCertificate;
import com.pulumi.azure.apimanagement.outputs.ServiceDelegation;
import com.pulumi.azure.apimanagement.outputs.ServiceHostnameConfiguration;
import com.pulumi.azure.apimanagement.outputs.ServiceIdentity;
import com.pulumi.azure.apimanagement.outputs.ServiceProtocols;
import com.pulumi.azure.apimanagement.outputs.ServiceSecurity;
import com.pulumi.azure.apimanagement.outputs.ServiceSignIn;
import com.pulumi.azure.apimanagement.outputs.ServiceSignUp;
import com.pulumi.azure.apimanagement.outputs.ServiceTenantAccess;
import com.pulumi.azure.apimanagement.outputs.ServiceVirtualNetworkConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.apimanagement.Service;
 * import com.pulumi.azure.apimanagement.ServiceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleService = new Service("exampleService", ServiceArgs.builder()
 *             .name("example-apim")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .publisherName("My Company")
 *             .publisherEmail("company}{@literal @}{@code exmaple.com")
 *             .skuName("Developer_1")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.ApiManagement`: 2022-08-01
 * 
 * ## Import
 * 
 * API Management Services can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:apimanagement/service:Service example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/service:Service")
public class Service extends com.pulumi.resources.CustomResource {
    /**
     * One or more `additional_location` blocks as defined below.
     * 
     */
    @Export(name="additionalLocations", refs={List.class,ServiceAdditionalLocation.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceAdditionalLocation>> additionalLocations;

    /**
     * @return One or more `additional_location` blocks as defined below.
     * 
     */
    public Output<Optional<List<ServiceAdditionalLocation>>> additionalLocations() {
        return Codegen.optional(this.additionalLocations);
    }
    /**
     * One or more `certificate` blocks (up to 10) as defined below.
     * 
     */
    @Export(name="certificates", refs={List.class,ServiceCertificate.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceCertificate>> certificates;

    /**
     * @return One or more `certificate` blocks (up to 10) as defined below.
     * 
     */
    public Output<Optional<List<ServiceCertificate>>> certificates() {
        return Codegen.optional(this.certificates);
    }
    /**
     * Enforce a client certificate to be presented on each request to the gateway? This is only supported when SKU type is `Consumption`.
     * 
     */
    @Export(name="clientCertificateEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> clientCertificateEnabled;

    /**
     * @return Enforce a client certificate to be presented on each request to the gateway? This is only supported when SKU type is `Consumption`.
     * 
     */
    public Output<Optional<Boolean>> clientCertificateEnabled() {
        return Codegen.optional(this.clientCertificateEnabled);
    }
    /**
     * A `delegation` block as defined below.
     * 
     */
    @Export(name="delegation", refs={ServiceDelegation.class}, tree="[0]")
    private Output<ServiceDelegation> delegation;

    /**
     * @return A `delegation` block as defined below.
     * 
     */
    public Output<ServiceDelegation> delegation() {
        return this.delegation;
    }
    /**
     * The URL for the Developer Portal associated with this API Management service.
     * 
     */
    @Export(name="developerPortalUrl", refs={String.class}, tree="[0]")
    private Output<String> developerPortalUrl;

    /**
     * @return The URL for the Developer Portal associated with this API Management service.
     * 
     */
    public Output<String> developerPortalUrl() {
        return this.developerPortalUrl;
    }
    /**
     * Disable the gateway in main region? This is only supported when `additional_location` is set.
     * 
     */
    @Export(name="gatewayDisabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> gatewayDisabled;

    /**
     * @return Disable the gateway in main region? This is only supported when `additional_location` is set.
     * 
     */
    public Output<Optional<Boolean>> gatewayDisabled() {
        return Codegen.optional(this.gatewayDisabled);
    }
    /**
     * The URL of the Regional Gateway for the API Management Service in the specified region.
     * 
     */
    @Export(name="gatewayRegionalUrl", refs={String.class}, tree="[0]")
    private Output<String> gatewayRegionalUrl;

    /**
     * @return The URL of the Regional Gateway for the API Management Service in the specified region.
     * 
     */
    public Output<String> gatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }
    /**
     * The URL of the Gateway for the API Management Service.
     * 
     */
    @Export(name="gatewayUrl", refs={String.class}, tree="[0]")
    private Output<String> gatewayUrl;

    /**
     * @return The URL of the Gateway for the API Management Service.
     * 
     */
    public Output<String> gatewayUrl() {
        return this.gatewayUrl;
    }
    /**
     * A `hostname_configuration` block as defined below.
     * 
     */
    @Export(name="hostnameConfiguration", refs={ServiceHostnameConfiguration.class}, tree="[0]")
    private Output<ServiceHostnameConfiguration> hostnameConfiguration;

    /**
     * @return A `hostname_configuration` block as defined below.
     * 
     */
    public Output<ServiceHostnameConfiguration> hostnameConfiguration() {
        return this.hostnameConfiguration;
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", refs={ServiceIdentity.class}, tree="[0]")
    private Output</* @Nullable */ ServiceIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<ServiceIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Azure location where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure location where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The URL for the Management API associated with this API Management service.
     * 
     */
    @Export(name="managementApiUrl", refs={String.class}, tree="[0]")
    private Output<String> managementApiUrl;

    /**
     * @return The URL for the Management API associated with this API Management service.
     * 
     */
    public Output<String> managementApiUrl() {
        return this.managementApiUrl;
    }
    /**
     * The version which the control plane API calls to API Management service are limited with version equal to or newer than.
     * 
     */
    @Export(name="minApiVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> minApiVersion;

    /**
     * @return The version which the control plane API calls to API Management service are limited with version equal to or newer than.
     * 
     */
    public Output<Optional<String>> minApiVersion() {
        return Codegen.optional(this.minApiVersion);
    }
    /**
     * The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Email address from which the notification will be sent.
     * 
     */
    @Export(name="notificationSenderEmail", refs={String.class}, tree="[0]")
    private Output<String> notificationSenderEmail;

    /**
     * @return Email address from which the notification will be sent.
     * 
     */
    public Output<String> notificationSenderEmail() {
        return this.notificationSenderEmail;
    }
    /**
     * The URL for the Publisher Portal associated with this API Management service.
     * 
     */
    @Export(name="portalUrl", refs={String.class}, tree="[0]")
    private Output<String> portalUrl;

    /**
     * @return The URL for the Publisher Portal associated with this API Management service.
     * 
     */
    public Output<String> portalUrl() {
        return this.portalUrl;
    }
    /**
     * The Private IP addresses of the API Management Service. Available only when the API Manager instance is using Virtual Network mode.
     * 
     */
    @Export(name="privateIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> privateIpAddresses;

    /**
     * @return The Private IP addresses of the API Management Service. Available only when the API Manager instance is using Virtual Network mode.
     * 
     */
    public Output<List<String>> privateIpAddresses() {
        return this.privateIpAddresses;
    }
    /**
     * A `protocols` block as defined below.
     * 
     */
    @Export(name="protocols", refs={ServiceProtocols.class}, tree="[0]")
    private Output<ServiceProtocols> protocols;

    /**
     * @return A `protocols` block as defined below.
     * 
     */
    public Output<ServiceProtocols> protocols() {
        return this.protocols;
    }
    /**
     * ID of a standard SKU IPv4 Public IP.
     * 
     * &gt; **Note:** Custom public IPs are only supported on the `Premium` and `Developer` tiers when deployed in a virtual network.
     * 
     */
    @Export(name="publicIpAddressId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> publicIpAddressId;

    /**
     * @return ID of a standard SKU IPv4 Public IP.
     * 
     * &gt; **Note:** Custom public IPs are only supported on the `Premium` and `Developer` tiers when deployed in a virtual network.
     * 
     */
    public Output<Optional<String>> publicIpAddressId() {
        return Codegen.optional(this.publicIpAddressId);
    }
    /**
     * Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
     * 
     */
    @Export(name="publicIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> publicIpAddresses;

    /**
     * @return Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
     * 
     */
    public Output<List<String>> publicIpAddresses() {
        return this.publicIpAddresses;
    }
    /**
     * Is public access to the service allowed? Defaults to `true`.
     * 
     * &gt; **Note:** This option is applicable only to the Management plane, not the API gateway or Developer portal. It is required to be `true` on the creation.
     * 
     */
    @Export(name="publicNetworkAccessEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Is public access to the service allowed? Defaults to `true`.
     * 
     * &gt; **Note:** This option is applicable only to the Management plane, not the API gateway or Developer portal. It is required to be `true` on the creation.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * The email of publisher/company.
     * 
     */
    @Export(name="publisherEmail", refs={String.class}, tree="[0]")
    private Output<String> publisherEmail;

    /**
     * @return The email of publisher/company.
     * 
     */
    public Output<String> publisherEmail() {
        return this.publisherEmail;
    }
    /**
     * The name of publisher/company.
     * 
     */
    @Export(name="publisherName", refs={String.class}, tree="[0]")
    private Output<String> publisherName;

    /**
     * @return The name of publisher/company.
     * 
     */
    public Output<String> publisherName() {
        return this.publisherName;
    }
    /**
     * The name of the Resource Group in which the API Management Service should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Service should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The URL for the SCM (Source Code Management) Endpoint associated with this API Management service.
     * 
     */
    @Export(name="scmUrl", refs={String.class}, tree="[0]")
    private Output<String> scmUrl;

    /**
     * @return The URL for the SCM (Source Code Management) Endpoint associated with this API Management service.
     * 
     */
    public Output<String> scmUrl() {
        return this.scmUrl;
    }
    /**
     * A `security` block as defined below.
     * 
     */
    @Export(name="security", refs={ServiceSecurity.class}, tree="[0]")
    private Output<ServiceSecurity> security;

    /**
     * @return A `security` block as defined below.
     * 
     */
    public Output<ServiceSecurity> security() {
        return this.security;
    }
    /**
     * A `sign_in` block as defined below.
     * 
     */
    @Export(name="signIn", refs={ServiceSignIn.class}, tree="[0]")
    private Output<ServiceSignIn> signIn;

    /**
     * @return A `sign_in` block as defined below.
     * 
     */
    public Output<ServiceSignIn> signIn() {
        return this.signIn;
    }
    /**
     * A `sign_up` block as defined below.
     * 
     */
    @Export(name="signUp", refs={ServiceSignUp.class}, tree="[0]")
    private Output<ServiceSignUp> signUp;

    /**
     * @return A `sign_up` block as defined below.
     * 
     */
    public Output<ServiceSignUp> signUp() {
        return this.signUp;
    }
    /**
     * `sku_name` is a string consisting of two parts separated by an underscore(\_). The first part is the `name`, valid values include: `Consumption`, `Developer`, `Basic`, `Standard` and `Premium`. The second part is the `capacity` (e.g. the number of deployed units of the `sku`), which must be a positive `integer` (e.g. `Developer_1`).
     * 
     * &gt; **Note:** Premium SKUs are limited to a default maximum of 12 (i.e. `Premium_12`), this can, however, be increased via support request.
     * 
     * &gt; **Note:** Consumption SKU capacity should be 0 (e.g. `Consumption_0`) as this tier includes automatic scaling.
     * 
     */
    @Export(name="skuName", refs={String.class}, tree="[0]")
    private Output<String> skuName;

    /**
     * @return `sku_name` is a string consisting of two parts separated by an underscore(\_). The first part is the `name`, valid values include: `Consumption`, `Developer`, `Basic`, `Standard` and `Premium`. The second part is the `capacity` (e.g. the number of deployed units of the `sku`), which must be a positive `integer` (e.g. `Developer_1`).
     * 
     * &gt; **Note:** Premium SKUs are limited to a default maximum of 12 (i.e. `Premium_12`), this can, however, be increased via support request.
     * 
     * &gt; **Note:** Consumption SKU capacity should be 0 (e.g. `Consumption_0`) as this tier includes automatic scaling.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * A mapping of tags assigned to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A `tenant_access` block as defined below.
     * 
     */
    @Export(name="tenantAccess", refs={ServiceTenantAccess.class}, tree="[0]")
    private Output<ServiceTenantAccess> tenantAccess;

    /**
     * @return A `tenant_access` block as defined below.
     * 
     */
    public Output<ServiceTenantAccess> tenantAccess() {
        return this.tenantAccess;
    }
    /**
     * A `virtual_network_configuration` block as defined below. Required when `virtual_network_type` is `External` or `Internal`.
     * 
     */
    @Export(name="virtualNetworkConfiguration", refs={ServiceVirtualNetworkConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ ServiceVirtualNetworkConfiguration> virtualNetworkConfiguration;

    /**
     * @return A `virtual_network_configuration` block as defined below. Required when `virtual_network_type` is `External` or `Internal`.
     * 
     */
    public Output<Optional<ServiceVirtualNetworkConfiguration>> virtualNetworkConfiguration() {
        return Codegen.optional(this.virtualNetworkConfiguration);
    }
    /**
     * The type of virtual network you want to use, valid values include: `None`, `External`, `Internal`. Defaults to `None`.
     * 
     * &gt; **Note:** Please ensure that in the subnet, inbound port 3443 is open when `virtual_network_type` is `Internal` or `External`. Additionally, please ensure other necessary ports are open according to [api management network configuration](https://learn.microsoft.com/azure/api-management/virtual-network-reference).
     * 
     */
    @Export(name="virtualNetworkType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> virtualNetworkType;

    /**
     * @return The type of virtual network you want to use, valid values include: `None`, `External`, `Internal`. Defaults to `None`.
     * 
     * &gt; **Note:** Please ensure that in the subnet, inbound port 3443 is open when `virtual_network_type` is `Internal` or `External`. Additionally, please ensure other necessary ports are open according to [api management network configuration](https://learn.microsoft.com/azure/api-management/virtual-network-reference).
     * 
     */
    public Output<Optional<String>> virtualNetworkType() {
        return Codegen.optional(this.virtualNetworkType);
    }
    /**
     * Specifies a list of Availability Zones in which this API Management service should be located.
     * 
     * &gt; **Note:** Availability zones are only supported in the Premium tier.
     * 
     */
    @Export(name="zones", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this API Management service should be located.
     * 
     * &gt; **Note:** Availability zones are only supported in the Premium tier.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(java.lang.String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(java.lang.String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(java.lang.String name, ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/service:Service", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Service(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/service:Service", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceArgs makeArgs(ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Service get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}

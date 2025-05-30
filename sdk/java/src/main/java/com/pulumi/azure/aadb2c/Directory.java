// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.aadb2c;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.aadb2c.DirectoryArgs;
import com.pulumi.azure.aadb2c.inputs.DirectoryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an AAD B2C Directory.
 * 
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
 * import com.pulumi.azure.aadb2c.Directory;
 * import com.pulumi.azure.aadb2c.DirectoryArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Directory("example", DirectoryArgs.builder()
 *             .countryCode("US")
 *             .dataResidencyLocation("United States")
 *             .displayName("example-b2c-tenant")
 *             .domainName("exampleb2ctenant.onmicrosoft.com")
 *             .resourceGroupName("example-rg")
 *             .skuName("PremiumP1")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.AzureActiveDirectory`: 2021-04-01-preview
 * 
 * ## Import
 * 
 * AAD B2C Directories can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:aadb2c/directory:Directory example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/example-resource-group/providers/Microsoft.AzureActiveDirectory/b2cDirectories/directory-name
 * ```
 * 
 */
@ResourceType(type="azure:aadb2c/directory:Directory")
public class Directory extends com.pulumi.resources.CustomResource {
    /**
     * The type of billing for the AAD B2C tenant. Possible values include: `MAU` or `Auths`.
     * 
     */
    @Export(name="billingType", refs={String.class}, tree="[0]")
    private Output<String> billingType;

    /**
     * @return The type of billing for the AAD B2C tenant. Possible values include: `MAU` or `Auths`.
     * 
     */
    public Output<String> billingType() {
        return this.billingType;
    }
    /**
     * Country code of the B2C tenant. The `country_code` should be valid for the specified `data_residency_location`. See [official docs](https://aka.ms/B2CDataResidency) for valid country codes. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
     * 
     */
    @Export(name="countryCode", refs={String.class}, tree="[0]")
    private Output<String> countryCode;

    /**
     * @return Country code of the B2C tenant. The `country_code` should be valid for the specified `data_residency_location`. See [official docs](https://aka.ms/B2CDataResidency) for valid country codes. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
     * 
     */
    public Output<String> countryCode() {
        return this.countryCode;
    }
    /**
     * Location in which the B2C tenant is hosted and data resides. The `data_residency_location` should be valid for the specified `country_code`. See [official docs](https://aka.ms/B2CDataResidenc) for more information. Changing this forces a new AAD B2C Directory to be created. Possible values are `Asia Pacific`, `Australia`, `Europe`, `Global` and `United States`.
     * 
     */
    @Export(name="dataResidencyLocation", refs={String.class}, tree="[0]")
    private Output<String> dataResidencyLocation;

    /**
     * @return Location in which the B2C tenant is hosted and data resides. The `data_residency_location` should be valid for the specified `country_code`. See [official docs](https://aka.ms/B2CDataResidenc) for more information. Changing this forces a new AAD B2C Directory to be created. Possible values are `Asia Pacific`, `Australia`, `Europe`, `Global` and `United States`.
     * 
     */
    public Output<String> dataResidencyLocation() {
        return this.dataResidencyLocation;
    }
    /**
     * The initial display name of the B2C tenant. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The initial display name of the B2C tenant. Required when creating a new resource. Changing this forces a new AAD B2C Directory to be created.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix. Changing this forces a new AAD B2C Directory to be created.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix. Changing this forces a new AAD B2C Directory to be created.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The date from which the billing type took effect. May not be populated until after the first billing cycle.
     * 
     */
    @Export(name="effectiveStartDate", refs={String.class}, tree="[0]")
    private Output<String> effectiveStartDate;

    /**
     * @return The date from which the billing type took effect. May not be populated until after the first billing cycle.
     * 
     */
    public Output<String> effectiveStartDate() {
        return this.effectiveStartDate;
    }
    /**
     * The name of the Resource Group where the AAD B2C Directory should exist. Changing this forces a new AAD B2C Directory to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the AAD B2C Directory should exist. Changing this forces a new AAD B2C Directory to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Billing SKU for the B2C tenant. Must be one of: `PremiumP1` or `PremiumP2` (`Standard` is not supported). See [official docs](https://aka.ms/b2cBilling) for more information.
     * 
     */
    @Export(name="skuName", refs={String.class}, tree="[0]")
    private Output<String> skuName;

    /**
     * @return Billing SKU for the B2C tenant. Must be one of: `PremiumP1` or `PremiumP2` (`Standard` is not supported). See [official docs](https://aka.ms/b2cBilling) for more information.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * A mapping of tags which should be assigned to the AAD B2C Directory.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the AAD B2C Directory.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The Tenant ID for the AAD B2C tenant.
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output<String> tenantId;

    /**
     * @return The Tenant ID for the AAD B2C tenant.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(java.lang.String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(java.lang.String name, DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(java.lang.String name, DirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:aadb2c/directory:Directory", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Directory(java.lang.String name, Output<java.lang.String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:aadb2c/directory:Directory", name, state, makeResourceOptions(options, id), false);
    }

    private static DirectoryArgs makeArgs(DirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DirectoryArgs.Empty : args;
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
    public static Directory get(java.lang.String name, Output<java.lang.String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Directory(name, id, state, options);
    }
}

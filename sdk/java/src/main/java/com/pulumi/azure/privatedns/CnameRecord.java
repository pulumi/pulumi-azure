// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.privatedns.CnameRecordArgs;
import com.pulumi.azure.privatedns.inputs.CnameRecordState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Enables you to manage DNS CNAME Records within Azure Private DNS.
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
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.privatedns.Zone;
 * import com.pulumi.azure.privatedns.ZoneArgs;
 * import com.pulumi.azure.privatedns.CnameRecord;
 * import com.pulumi.azure.privatedns.CnameRecordArgs;
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
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleZone = new Zone("exampleZone", ZoneArgs.builder()
 *             .name("mydomain.com")
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleCnameRecord = new CnameRecord("exampleCnameRecord", CnameRecordArgs.builder()
 *             .name("test")
 *             .zoneName(exampleZone.name())
 *             .resourceGroupName(example.name())
 *             .ttl(300)
 *             .record("contoso.com")
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
 * * `Microsoft.Network`: 2024-06-01
 * 
 * ## Import
 * 
 * Private DNS CName Records can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:privatedns/cnameRecord:CnameRecord example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/privateDnsZones/zone1/CNAME/myrecord1
 * ```
 * 
 */
@ResourceType(type="azure:privatedns/cnameRecord:CnameRecord")
public class CnameRecord extends com.pulumi.resources.CustomResource {
    /**
     * The FQDN of the DNS CNAME Record.
     * 
     */
    @Export(name="fqdn", refs={String.class}, tree="[0]")
    private Output<String> fqdn;

    /**
     * @return The FQDN of the DNS CNAME Record.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * The name of the DNS CNAME Record. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the DNS CNAME Record. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The target of the CNAME.
     * 
     */
    @Export(name="record", refs={String.class}, tree="[0]")
    private Output<String> record;

    /**
     * @return The target of the CNAME.
     * 
     */
    public Output<String> record() {
        return this.record;
    }
    /**
     * Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The Time To Live (TTL) of the DNS record in seconds. Possible values are between `0` and `2147483647`.
     * 
     */
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output<Integer> ttl;

    /**
     * @return The Time To Live (TTL) of the DNS record in seconds. Possible values are between `0` and `2147483647`.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="zoneName", refs={String.class}, tree="[0]")
    private Output<String> zoneName;

    /**
     * @return Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CnameRecord(java.lang.String name) {
        this(name, CnameRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CnameRecord(java.lang.String name, CnameRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CnameRecord(java.lang.String name, CnameRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/cnameRecord:CnameRecord", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CnameRecord(java.lang.String name, Output<java.lang.String> id, @Nullable CnameRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/cnameRecord:CnameRecord", name, state, makeResourceOptions(options, id), false);
    }

    private static CnameRecordArgs makeArgs(CnameRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CnameRecordArgs.Empty : args;
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
    public static CnameRecord get(java.lang.String name, Output<java.lang.String> id, @Nullable CnameRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CnameRecord(name, id, state, options);
    }
}

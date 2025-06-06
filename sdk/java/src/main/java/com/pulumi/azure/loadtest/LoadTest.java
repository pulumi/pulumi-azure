// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loadtest;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.loadtest.LoadTestArgs;
import com.pulumi.azure.loadtest.inputs.LoadTestState;
import com.pulumi.azure.loadtest.outputs.LoadTestEncryption;
import com.pulumi.azure.loadtest.outputs.LoadTestIdentity;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
 * 
 * Manages a Load Test Service.
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
 * import com.pulumi.azure.authorization.UserAssignedIdentity;
 * import com.pulumi.azure.authorization.UserAssignedIdentityArgs;
 * import com.pulumi.azure.loadtest.LoadTest;
 * import com.pulumi.azure.loadtest.LoadTestArgs;
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
 *         var exampleUserAssignedIdentity = new UserAssignedIdentity("exampleUserAssignedIdentity", UserAssignedIdentityArgs.builder()
 *             .name("example")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .build());
 * 
 *         var exampleLoadTest = new LoadTest("exampleLoadTest", LoadTestArgs.builder()
 *             .location(example.location())
 *             .name("example")
 *             .resourceGroupName(example.name())
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
 * * `Microsoft.LoadTestService`: 2022-12-01
 * 
 * ## Import
 * 
 * An existing Load Test can be imported into Pulumi using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:loadtest/loadTest:LoadTest example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.LoadTestService/loadTests/{loadTestName}
 * ```
 * 
 * * Where `{subscriptionId}` is the ID of the Azure Subscription where the Load Test exists. For example `12345678-1234-9876-4563-123456789012`.
 * 
 * * Where `{resourceGroupName}` is the name of Resource Group where this Load Test exists. For example `example-resource-group`.
 * 
 * * Where `{loadTestName}` is the name of the Load Test. For example `loadTestValue`.
 * 
 */
@ResourceType(type="azure:loadtest/loadTest:LoadTest")
public class LoadTest extends com.pulumi.resources.CustomResource {
    /**
     * Resource data plane URI.
     * 
     */
    @Export(name="dataPlaneUri", refs={String.class}, tree="[0]")
    private Output<String> dataPlaneUri;

    /**
     * @return Resource data plane URI.
     * 
     */
    public Output<String> dataPlaneUri() {
        return this.dataPlaneUri;
    }
    /**
     * Description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * An `encryption` block as defined below. Changing this forces a new Load Test to be created.
     * 
     */
    @Export(name="encryption", refs={LoadTestEncryption.class}, tree="[0]")
    private Output</* @Nullable */ LoadTestEncryption> encryption;

    /**
     * @return An `encryption` block as defined below. Changing this forces a new Load Test to be created.
     * 
     */
    public Output<Optional<LoadTestEncryption>> encryption() {
        return Codegen.optional(this.encryption);
    }
    /**
     * An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Load Test.
     * 
     */
    @Export(name="identity", refs={LoadTestIdentity.class}, tree="[0]")
    private Output</* @Nullable */ LoadTestIdentity> identity;

    /**
     * @return An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Load Test.
     * 
     */
    public Output<Optional<LoadTestIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Azure Region where the Load Test should exist. Changing this forces a new Load Test to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Azure Region where the Load Test should exist. Changing this forces a new Load Test to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of this Load Test. Changing this forces a new Load Test to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of this Load Test. Changing this forces a new Load Test to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the Resource Group within which this Load Test should exist. Changing this forces a new Load Test to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group within which this Load Test should exist. Changing this forces a new Load Test to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags which should be assigned to the Load Test.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Load Test.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadTest(java.lang.String name) {
        this(name, LoadTestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadTest(java.lang.String name, LoadTestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadTest(java.lang.String name, LoadTestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loadtest/loadTest:LoadTest", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LoadTest(java.lang.String name, Output<java.lang.String> id, @Nullable LoadTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loadtest/loadTest:LoadTest", name, state, makeResourceOptions(options, id), false);
    }

    private static LoadTestArgs makeArgs(LoadTestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LoadTestArgs.Empty : args;
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
    public static LoadTest get(java.lang.String name, Output<java.lang.String> id, @Nullable LoadTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadTest(name, id, state, options);
    }
}

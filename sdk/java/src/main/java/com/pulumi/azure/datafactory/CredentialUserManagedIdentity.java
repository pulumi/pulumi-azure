// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.CredentialUserManagedIdentityArgs;
import com.pulumi.azure.datafactory.inputs.CredentialUserManagedIdentityState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manage a Data Factory User Assigned Managed Identity credential resource. These resources are used by Data Factory to access data sources.
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
 * import com.pulumi.azure.datafactory.Factory;
 * import com.pulumi.azure.datafactory.FactoryArgs;
 * import com.pulumi.azure.datafactory.inputs.FactoryIdentityArgs;
 * import com.pulumi.azure.datafactory.CredentialUserManagedIdentity;
 * import com.pulumi.azure.datafactory.CredentialUserManagedIdentityArgs;
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
 *             .location("westus")
 *             .build());
 * 
 *         var exampleUserAssignedIdentity = new UserAssignedIdentity("exampleUserAssignedIdentity", UserAssignedIdentityArgs.builder()
 *             .location(example.location())
 *             .name("my-user")
 *             .resourceGroupName(example.name())
 *             .build());
 * 
 *         var exampleFactory = new Factory("exampleFactory", FactoryArgs.builder()
 *             .name("example")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .identity(FactoryIdentityArgs.builder()
 *                 .type("UserAssigned")
 *                 .identityIds(exampleUserAssignedIdentity.id())
 *                 .build())
 *             .build());
 * 
 *         var test = new CredentialUserManagedIdentity("test", CredentialUserManagedIdentityArgs.builder()
 *             .name(exampleUserAssignedIdentity.name())
 *             .description("Short description of this credential")
 *             .dataFactoryId(exampleFactory.id())
 *             .identityId(exampleUserAssignedIdentity.id())
 *             .annotations(            
 *                 "example",
 *                 "example2")
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
 * * `Microsoft.DataFactory`: 2018-06-01
 * 
 * ## Import
 * 
 * Data Factory Credentials can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:datafactory/credentialUserManagedIdentity:CredentialUserManagedIdentity example /subscriptions/1f3d6e58-feed-4bb6-87e5-a52305ad3375/resourceGroups/example-resources/providers/Microsoft.DataFactory/factories/example/credentials/credential1
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/credentialUserManagedIdentity:CredentialUserManagedIdentity")
public class CredentialUserManagedIdentity extends com.pulumi.resources.CustomResource {
    /**
     * List of tags that can be used for describing the Data Factory Credential.
     * 
     * &gt; **Note:** Manually altering a Credential resource will cause annotations to be lost, resulting in a change being detected on the next run.
     * 
     */
    @Export(name="annotations", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Credential.
     * 
     * &gt; **Note:** Manually altering a Credential resource will cause annotations to be lost, resulting in a change being detected on the next run.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The Data Factory ID in which to associate the Credential with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", refs={String.class}, tree="[0]")
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Credential with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Credential.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Credential.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Resouce ID of an existing User Assigned Managed Identity. This can be changed without recreating the resource. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Attempting to create a Credential resource without first assigning the identity to the parent Data Factory will result in an Azure API error.
     * 
     */
    @Export(name="identityId", refs={String.class}, tree="[0]")
    private Output<String> identityId;

    /**
     * @return The Resouce ID of an existing User Assigned Managed Identity. This can be changed without recreating the resource. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Attempting to create a Credential resource without first assigning the identity to the parent Data Factory will result in an Azure API error.
     * 
     */
    public Output<String> identityId() {
        return this.identityId;
    }
    /**
     * Specifies the name of the Credential. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Credential. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CredentialUserManagedIdentity(java.lang.String name) {
        this(name, CredentialUserManagedIdentityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CredentialUserManagedIdentity(java.lang.String name, CredentialUserManagedIdentityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CredentialUserManagedIdentity(java.lang.String name, CredentialUserManagedIdentityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/credentialUserManagedIdentity:CredentialUserManagedIdentity", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CredentialUserManagedIdentity(java.lang.String name, Output<java.lang.String> id, @Nullable CredentialUserManagedIdentityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/credentialUserManagedIdentity:CredentialUserManagedIdentity", name, state, makeResourceOptions(options, id), false);
    }

    private static CredentialUserManagedIdentityArgs makeArgs(CredentialUserManagedIdentityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CredentialUserManagedIdentityArgs.Empty : args;
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
    public static CredentialUserManagedIdentity get(java.lang.String name, Output<java.lang.String> id, @Nullable CredentialUserManagedIdentityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CredentialUserManagedIdentity(name, id, state, options);
    }
}

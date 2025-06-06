// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.communication;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.communication.EmailServiceArgs;
import com.pulumi.azure.communication.inputs.EmailServiceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Email Communication Service.
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
 * import com.pulumi.azure.communication.EmailService;
 * import com.pulumi.azure.communication.EmailServiceArgs;
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
 *         var exampleEmailService = new EmailService("exampleEmailService", EmailServiceArgs.builder()
 *             .name("example-emailcommunicationservice")
 *             .resourceGroupName(example.name())
 *             .dataLocation("United States")
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
 * * `Microsoft.Communication`: 2023-03-31
 * 
 * ## Import
 * 
 * Communication Services can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:communication/emailService:EmailService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Communication/emailServices/emailCommunicationService1
 * ```
 * 
 */
@ResourceType(type="azure:communication/emailService:EmailService")
public class EmailService extends com.pulumi.resources.CustomResource {
    /**
     * The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
     * 
     */
    @Export(name="dataLocation", refs={String.class}, tree="[0]")
    private Output<String> dataLocation;

    /**
     * @return The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
     * 
     */
    public Output<String> dataLocation() {
        return this.dataLocation;
    }
    /**
     * The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags which should be assigned to the Email Communication Service.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Email Communication Service.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailService(java.lang.String name) {
        this(name, EmailServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailService(java.lang.String name, EmailServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailService(java.lang.String name, EmailServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:communication/emailService:EmailService", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EmailService(java.lang.String name, Output<java.lang.String> id, @Nullable EmailServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:communication/emailService:EmailService", name, state, makeResourceOptions(options, id), false);
    }

    private static EmailServiceArgs makeArgs(EmailServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EmailServiceArgs.Empty : args;
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
    public static EmailService get(java.lang.String name, Output<java.lang.String> id, @Nullable EmailServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailService(name, id, state, options);
    }
}

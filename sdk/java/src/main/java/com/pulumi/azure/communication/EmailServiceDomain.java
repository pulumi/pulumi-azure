// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.communication;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.communication.EmailServiceDomainArgs;
import com.pulumi.azure.communication.inputs.EmailServiceDomainState;
import com.pulumi.azure.communication.outputs.EmailServiceDomainVerificationRecord;
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
 * Manages an Email Communication Service Domain.
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
 * import com.pulumi.azure.communication.EmailServiceDomain;
 * import com.pulumi.azure.communication.EmailServiceDomainArgs;
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
 *         var exampleEmailServiceDomain = new EmailServiceDomain("exampleEmailServiceDomain", EmailServiceDomainArgs.builder()
 *             .name("AzureManagedDomain")
 *             .emailServiceId(exampleEmailService.id())
 *             .domainManagement("AzureManaged")
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
 * $ pulumi import azure:communication/emailServiceDomain:EmailServiceDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Communication/emailServices/emailCommunicationService1/domains/domain1
 * ```
 * 
 */
@ResourceType(type="azure:communication/emailServiceDomain:EmailServiceDomain")
public class EmailServiceDomain extends com.pulumi.resources.CustomResource {
    /**
     * Describes how a Domains resource is being managed. Possible values are `AzureManaged`, `CustomerManaged`, `CustomerManagedInExchangeOnline`. Changing this forces a new Email Communication Service to be created.
     * 
     */
    @Export(name="domainManagement", refs={String.class}, tree="[0]")
    private Output<String> domainManagement;

    /**
     * @return Describes how a Domains resource is being managed. Possible values are `AzureManaged`, `CustomerManaged`, `CustomerManagedInExchangeOnline`. Changing this forces a new Email Communication Service to be created.
     * 
     */
    public Output<String> domainManagement() {
        return this.domainManagement;
    }
    /**
     * The resource ID of the Email Communication Service where the Domain belongs to. Changing this forces a new Email Communication Service to be created.
     * 
     */
    @Export(name="emailServiceId", refs={String.class}, tree="[0]")
    private Output<String> emailServiceId;

    /**
     * @return The resource ID of the Email Communication Service where the Domain belongs to. Changing this forces a new Email Communication Service to be created.
     * 
     */
    public Output<String> emailServiceId() {
        return this.emailServiceId;
    }
    /**
     * P2 sender domain that is displayed to the email recipients [RFC 5322].
     * 
     */
    @Export(name="fromSenderDomain", refs={String.class}, tree="[0]")
    private Output<String> fromSenderDomain;

    /**
     * @return P2 sender domain that is displayed to the email recipients [RFC 5322].
     * 
     */
    public Output<String> fromSenderDomain() {
        return this.fromSenderDomain;
    }
    /**
     * P1 sender domain that is present on the email envelope [RFC 5321].
     * 
     */
    @Export(name="mailFromSenderDomain", refs={String.class}, tree="[0]")
    private Output<String> mailFromSenderDomain;

    /**
     * @return P1 sender domain that is present on the email envelope [RFC 5321].
     * 
     */
    public Output<String> mailFromSenderDomain() {
        return this.mailFromSenderDomain;
    }
    /**
     * The name of the Email Communication Service resource. If `domain_management` is `AzureManaged`, the name must be `AzureManagedDomain`. Changing this forces a new Email Communication Service to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Email Communication Service resource. If `domain_management` is `AzureManaged`, the name must be `AzureManagedDomain`. Changing this forces a new Email Communication Service to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Describes user engagement tracking is enabled or disabled. Defaults to `false`.
     * 
     */
    @Export(name="userEngagementTrackingEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> userEngagementTrackingEnabled;

    /**
     * @return Describes user engagement tracking is enabled or disabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> userEngagementTrackingEnabled() {
        return Codegen.optional(this.userEngagementTrackingEnabled);
    }
    /**
     * (Optional) An `verification_records` block as defined below.
     * 
     */
    @Export(name="verificationRecords", refs={List.class,EmailServiceDomainVerificationRecord.class}, tree="[0,1]")
    private Output<List<EmailServiceDomainVerificationRecord>> verificationRecords;

    /**
     * @return (Optional) An `verification_records` block as defined below.
     * 
     */
    public Output<List<EmailServiceDomainVerificationRecord>> verificationRecords() {
        return this.verificationRecords;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailServiceDomain(java.lang.String name) {
        this(name, EmailServiceDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailServiceDomain(java.lang.String name, EmailServiceDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailServiceDomain(java.lang.String name, EmailServiceDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:communication/emailServiceDomain:EmailServiceDomain", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EmailServiceDomain(java.lang.String name, Output<java.lang.String> id, @Nullable EmailServiceDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:communication/emailServiceDomain:EmailServiceDomain", name, state, makeResourceOptions(options, id), false);
    }

    private static EmailServiceDomainArgs makeArgs(EmailServiceDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EmailServiceDomainArgs.Empty : args;
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
    public static EmailServiceDomain get(java.lang.String name, Output<java.lang.String> id, @Nullable EmailServiceDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailServiceDomain(name, id, state, options);
    }
}

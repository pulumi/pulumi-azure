// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyRotationPolicyArgs;
import com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleKeyRotationPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Managed HSM Key rotation policy.
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
 * import com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKey;
 * import com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyArgs;
 * import com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyRotationPolicy;
 * import com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleKeyRotationPolicyArgs;
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
 *         var example = new ManagedHardwareSecurityModuleKey("example", ManagedHardwareSecurityModuleKeyArgs.builder()
 *             .name("example-key")
 *             .managedHsmId(exampleAzurermKeyVaultManagedHardwareSecurityModule.id())
 *             .keyType("EC-HSM")
 *             .curve("P-521")
 *             .keyOpts("sign")
 *             .build());
 * 
 *         var exampleManagedHardwareSecurityModuleKeyRotationPolicy = new ManagedHardwareSecurityModuleKeyRotationPolicy("exampleManagedHardwareSecurityModuleKeyRotationPolicy", ManagedHardwareSecurityModuleKeyRotationPolicyArgs.builder()
 *             .managedHsmKeyId(example.id())
 *             .expireAfter("P60D")
 *             .timeBeforeExpiry("P30D")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Managed HSM Key rotation policy can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:keyvault/managedHardwareSecurityModuleKeyRotationPolicy:ManagedHardwareSecurityModuleKeyRotationPolicy example https://example-hsm.managedhsm.azure.net/keys/example
 * ```
 * 
 */
@ResourceType(type="azure:keyvault/managedHardwareSecurityModuleKeyRotationPolicy:ManagedHardwareSecurityModuleKeyRotationPolicy")
public class ManagedHardwareSecurityModuleKeyRotationPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Specify the expiration duration on a newly rotated key as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The minimum duration is `P28D`.
     * 
     */
    @Export(name="expireAfter", refs={String.class}, tree="[0]")
    private Output<String> expireAfter;

    /**
     * @return Specify the expiration duration on a newly rotated key as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). The minimum duration is `P28D`.
     * 
     */
    public Output<String> expireAfter() {
        return this.expireAfter;
    }
    /**
     * The ID of the Managed HSM Key. Changing this forces a new Managed HSM Key rotation policy to be created.
     * 
     */
    @Export(name="managedHsmKeyId", refs={String.class}, tree="[0]")
    private Output<String> managedHsmKeyId;

    /**
     * @return The ID of the Managed HSM Key. Changing this forces a new Managed HSM Key rotation policy to be created.
     * 
     */
    public Output<String> managedHsmKeyId() {
        return this.managedHsmKeyId;
    }
    /**
     * Rotate automatically at a duration after key creation as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). Exactly one of `time_after_creation` or `time_before_expiry` should be specified.
     * 
     */
    @Export(name="timeAfterCreation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timeAfterCreation;

    /**
     * @return Rotate automatically at a duration after key creation as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). Exactly one of `time_after_creation` or `time_before_expiry` should be specified.
     * 
     */
    public Output<Optional<String>> timeAfterCreation() {
        return Codegen.optional(this.timeAfterCreation);
    }
    /**
     * Rotate automatically at a duration before key expiry as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). Exactly one of `time_after_creation` or `time_before_expiry` should be specified.
     * 
     */
    @Export(name="timeBeforeExpiry", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timeBeforeExpiry;

    /**
     * @return Rotate automatically at a duration before key expiry as an [ISO 8601 duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). Exactly one of `time_after_creation` or `time_before_expiry` should be specified.
     * 
     */
    public Output<Optional<String>> timeBeforeExpiry() {
        return Codegen.optional(this.timeBeforeExpiry);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedHardwareSecurityModuleKeyRotationPolicy(java.lang.String name) {
        this(name, ManagedHardwareSecurityModuleKeyRotationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedHardwareSecurityModuleKeyRotationPolicy(java.lang.String name, ManagedHardwareSecurityModuleKeyRotationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedHardwareSecurityModuleKeyRotationPolicy(java.lang.String name, ManagedHardwareSecurityModuleKeyRotationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:keyvault/managedHardwareSecurityModuleKeyRotationPolicy:ManagedHardwareSecurityModuleKeyRotationPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ManagedHardwareSecurityModuleKeyRotationPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedHardwareSecurityModuleKeyRotationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:keyvault/managedHardwareSecurityModuleKeyRotationPolicy:ManagedHardwareSecurityModuleKeyRotationPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static ManagedHardwareSecurityModuleKeyRotationPolicyArgs makeArgs(ManagedHardwareSecurityModuleKeyRotationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ManagedHardwareSecurityModuleKeyRotationPolicyArgs.Empty : args;
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
    public static ManagedHardwareSecurityModuleKeyRotationPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable ManagedHardwareSecurityModuleKeyRotationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedHardwareSecurityModuleKeyRotationPolicy(name, id, state, options);
    }
}

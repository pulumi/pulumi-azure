// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.postgresql.ServerKeyArgs;
import com.pulumi.azure.postgresql.inputs.ServerKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Customer Managed Key for a PostgreSQL Server.
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
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.postgresql.Server;
 * import com.pulumi.azure.postgresql.ServerArgs;
 * import com.pulumi.azure.postgresql.inputs.ServerIdentityArgs;
 * import com.pulumi.azure.keyvault.AccessPolicy;
 * import com.pulumi.azure.keyvault.AccessPolicyArgs;
 * import com.pulumi.azure.keyvault.Key;
 * import com.pulumi.azure.keyvault.KeyArgs;
 * import com.pulumi.azure.postgresql.ServerKey;
 * import com.pulumi.azure.postgresql.ServerKeyArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var current = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault("exampleKeyVault", KeyVaultArgs.builder()
 *             .name("examplekv")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .tenantId(current.tenantId())
 *             .skuName("premium")
 *             .purgeProtectionEnabled(true)
 *             .build());
 * 
 *         var exampleServer = new Server("exampleServer", ServerArgs.builder()
 *             .name("example-postgre-server")
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .administratorLogin("psqladmin")
 *             .administratorLoginPassword("H}{@literal @}{@code Sh1CoR3!")
 *             .skuName("GP_Gen5_2")
 *             .version("11")
 *             .storageMb(51200)
 *             .sslEnforcementEnabled(true)
 *             .identity(ServerIdentityArgs.builder()
 *                 .type("SystemAssigned")
 *                 .build())
 *             .build());
 * 
 *         var server = new AccessPolicy("server", AccessPolicyArgs.builder()
 *             .keyVaultId(exampleKeyVault.id())
 *             .tenantId(current.tenantId())
 *             .objectId(exampleServer.identity().applyValue(_identity -> _identity.principalId()))
 *             .keyPermissions(            
 *                 "Get",
 *                 "UnwrapKey",
 *                 "WrapKey")
 *             .secretPermissions("Get")
 *             .build());
 * 
 *         var client = new AccessPolicy("client", AccessPolicyArgs.builder()
 *             .keyVaultId(exampleKeyVault.id())
 *             .tenantId(current.tenantId())
 *             .objectId(current.objectId())
 *             .keyPermissions(            
 *                 "Get",
 *                 "Create",
 *                 "Delete",
 *                 "List",
 *                 "Restore",
 *                 "Recover",
 *                 "UnwrapKey",
 *                 "WrapKey",
 *                 "Purge",
 *                 "Encrypt",
 *                 "Decrypt",
 *                 "Sign",
 *                 "Verify",
 *                 "GetRotationPolicy")
 *             .secretPermissions("Get")
 *             .build());
 * 
 *         var exampleKey = new Key("exampleKey", KeyArgs.builder()
 *             .name("tfex-key")
 *             .keyVaultId(exampleKeyVault.id())
 *             .keyType("RSA")
 *             .keySize(2048)
 *             .keyOpts(            
 *                 "decrypt",
 *                 "encrypt",
 *                 "sign",
 *                 "unwrapKey",
 *                 "verify",
 *                 "wrapKey")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     client,
 *                     server)
 *                 .build());
 * 
 *         var exampleServerKey = new ServerKey("exampleServerKey", ServerKeyArgs.builder()
 *             .serverId(exampleServer.id())
 *             .keyVaultKeyId(exampleKey.id())
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
 * * `Microsoft.DBforPostgreSQL`: 2020-01-01
 * 
 * ## Import
 * 
 * A PostgreSQL Server Key can be imported using the `resource id` of the PostgreSQL Server Key, e.g.
 * 
 * ```sh
 * $ pulumi import azure:postgresql/serverKey:ServerKey example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DBforPostgreSQL/servers/server1/keys/keyvaultname_key-name_keyversion
 * ```
 * 
 */
@ResourceType(type="azure:postgresql/serverKey:ServerKey")
public class ServerKey extends com.pulumi.resources.CustomResource {
    /**
     * The URL to a Key Vault Key.
     * 
     */
    @Export(name="keyVaultKeyId", refs={String.class}, tree="[0]")
    private Output<String> keyVaultKeyId;

    /**
     * @return The URL to a Key Vault Key.
     * 
     */
    public Output<String> keyVaultKeyId() {
        return this.keyVaultKeyId;
    }
    /**
     * The ID of the PostgreSQL Server. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serverId", refs={String.class}, tree="[0]")
    private Output<String> serverId;

    /**
     * @return The ID of the PostgreSQL Server. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerKey(java.lang.String name) {
        this(name, ServerKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerKey(java.lang.String name, ServerKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerKey(java.lang.String name, ServerKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/serverKey:ServerKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServerKey(java.lang.String name, Output<java.lang.String> id, @Nullable ServerKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/serverKey:ServerKey", name, state, makeResourceOptions(options, id), false);
    }

    private static ServerKeyArgs makeArgs(ServerKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServerKeyArgs.Empty : args;
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
    public static ServerKey get(java.lang.String name, Output<java.lang.String> id, @Nullable ServerKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerKey(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.redis.LinkedServerArgs;
import com.pulumi.azure.redis.inputs.LinkedServerState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Redis Linked Server (ie Geo Location)
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.Cache`: 2024-11-01
 * 
 * ## Import
 * 
 * Redis can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:redis/linkedServer:LinkedServer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redis/cache1/linkedServers/cache2
 * ```
 * 
 */
@ResourceType(type="azure:redis/linkedServer:LinkedServer")
public class LinkedServer extends com.pulumi.resources.CustomResource {
    /**
     * The geo-replicated primary hostname for this linked server.
     * 
     */
    @Export(name="geoReplicatedPrimaryHostName", refs={String.class}, tree="[0]")
    private Output<String> geoReplicatedPrimaryHostName;

    /**
     * @return The geo-replicated primary hostname for this linked server.
     * 
     */
    public Output<String> geoReplicatedPrimaryHostName() {
        return this.geoReplicatedPrimaryHostName;
    }
    /**
     * The ID of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    @Export(name="linkedRedisCacheId", refs={String.class}, tree="[0]")
    private Output<String> linkedRedisCacheId;

    /**
     * @return The ID of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    public Output<String> linkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }
    /**
     * The location of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    @Export(name="linkedRedisCacheLocation", refs={String.class}, tree="[0]")
    private Output<String> linkedRedisCacheLocation;

    /**
     * @return The location of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    public Output<String> linkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
    }
    /**
     * The name of the linked server.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the linked server.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
     * 
     */
    @Export(name="serverRole", refs={String.class}, tree="[0]")
    private Output<String> serverRole;

    /**
     * @return The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
     * 
     */
    public Output<String> serverRole() {
        return this.serverRole;
    }
    /**
     * The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
     * 
     */
    @Export(name="targetRedisCacheName", refs={String.class}, tree="[0]")
    private Output<String> targetRedisCacheName;

    /**
     * @return The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
     * 
     */
    public Output<String> targetRedisCacheName() {
        return this.targetRedisCacheName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedServer(java.lang.String name) {
        this(name, LinkedServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedServer(java.lang.String name, LinkedServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedServer(java.lang.String name, LinkedServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:redis/linkedServer:LinkedServer", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LinkedServer(java.lang.String name, Output<java.lang.String> id, @Nullable LinkedServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:redis/linkedServer:LinkedServer", name, state, makeResourceOptions(options, id), false);
    }

    private static LinkedServerArgs makeArgs(LinkedServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LinkedServerArgs.Empty : args;
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
    public static LinkedServer get(java.lang.String name, Output<java.lang.String> id, @Nullable LinkedServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkedServer(name, id, state, options);
    }
}

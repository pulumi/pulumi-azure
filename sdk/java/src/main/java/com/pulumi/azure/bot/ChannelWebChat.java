// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.bot.ChannelWebChatArgs;
import com.pulumi.azure.bot.inputs.ChannelWebChatState;
import com.pulumi.azure.bot.outputs.ChannelWebChatSite;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Web Chat integration for a Bot Channel
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
 * import com.pulumi.azure.bot.ChannelsRegistration;
 * import com.pulumi.azure.bot.ChannelsRegistrationArgs;
 * import com.pulumi.azure.bot.ChannelWebChat;
 * import com.pulumi.azure.bot.ChannelWebChatArgs;
 * import com.pulumi.azure.bot.inputs.ChannelWebChatSiteArgs;
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
 *         final var current = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleChannelsRegistration = new ChannelsRegistration("exampleChannelsRegistration", ChannelsRegistrationArgs.builder()
 *             .name("example-bcr")
 *             .location("global")
 *             .resourceGroupName(example.name())
 *             .sku("F0")
 *             .microsoftAppId(current.clientId())
 *             .build());
 * 
 *         var exampleChannelWebChat = new ChannelWebChat("exampleChannelWebChat", ChannelWebChatArgs.builder()
 *             .botName(exampleChannelsRegistration.name())
 *             .location(exampleChannelsRegistration.location())
 *             .resourceGroupName(example.name())
 *             .sites(ChannelWebChatSiteArgs.builder()
 *                 .name("TestSite")
 *                 .build())
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
 * Web Chat Channels can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:bot/channelWebChat:ChannelWebChat example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.BotService/botServices/botService1/channels/WebChatChannel
 * ```
 * 
 */
@ResourceType(type="azure:bot/channelWebChat:ChannelWebChat")
public class ChannelWebChat extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="botName", refs={String.class}, tree="[0]")
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * 
     */
    @Export(name="sites", refs={List.class,ChannelWebChatSite.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ChannelWebChatSite>> sites;

    /**
     * @return A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
     * 
     */
    public Output<Optional<List<ChannelWebChatSite>>> sites() {
        return Codegen.optional(this.sites);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ChannelWebChat(java.lang.String name) {
        this(name, ChannelWebChatArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ChannelWebChat(java.lang.String name, ChannelWebChatArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ChannelWebChat(java.lang.String name, ChannelWebChatArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/channelWebChat:ChannelWebChat", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ChannelWebChat(java.lang.String name, Output<java.lang.String> id, @Nullable ChannelWebChatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/channelWebChat:ChannelWebChat", name, state, makeResourceOptions(options, id), false);
    }

    private static ChannelWebChatArgs makeArgs(ChannelWebChatArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ChannelWebChatArgs.Empty : args;
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
    public static ChannelWebChat get(java.lang.String name, Output<java.lang.String> id, @Nullable ChannelWebChatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ChannelWebChat(name, id, state, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.iot.FileUploadArgs;
import com.pulumi.azure.iot.inputs.FileUploadState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the File Upload of an IoT Hub.
 * 
 * &gt; **Note:** File upload can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.FileUpload` resource - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.azure.iot.IoTHub;
 * import com.pulumi.azure.iot.IoTHubArgs;
 * import com.pulumi.azure.iot.inputs.IoTHubSkuArgs;
 * import com.pulumi.azure.iot.FileUpload;
 * import com.pulumi.azure.iot.FileUploadArgs;
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
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("examplestorage")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .build());
 * 
 *         var exampleContainer = new Container("exampleContainer", ContainerArgs.builder()
 *             .name("examplecontainer")
 *             .storageAccountName(exampleAccount.name())
 *             .containerAccessType("private")
 *             .build());
 * 
 *         var exampleIoTHub = new IoTHub("exampleIoTHub", IoTHubArgs.builder()
 *             .name("example")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .sku(IoTHubSkuArgs.builder()
 *                 .name("S1")
 *                 .capacity(1)
 *                 .build())
 *             .build());
 * 
 *         var exampleFileUpload = new FileUpload("exampleFileUpload", FileUploadArgs.builder()
 *             .iothubId(exampleIoTHub.id())
 *             .connectionString(exampleAccount.primaryBlobConnectionString())
 *             .containerName(exampleContainer.name())
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
 * IoT Hub File Uploads can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:iot/fileUpload:FileUpload example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/iotHubs/hub1
 * ```
 * 
 */
@ResourceType(type="azure:iot/fileUpload:FileUpload")
public class FileUpload extends com.pulumi.resources.CustomResource {
    /**
     * The type used to authenticate against the storage account. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     * 
     */
    @Export(name="authenticationType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authenticationType;

    /**
     * @return The type used to authenticate against the storage account. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     * 
     */
    public Output<Optional<String>> authenticationType() {
        return Codegen.optional(this.authenticationType);
    }
    /**
     * The connection string for the Azure Storage account to which files are uploaded.
     * 
     */
    @Export(name="connectionString", refs={String.class}, tree="[0]")
    private Output<String> connectionString;

    /**
     * @return The connection string for the Azure Storage account to which files are uploaded.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * The name of the root container where the files should be uploaded to. The container need not exist but should be creatable using the `connection_string` specified.
     * 
     */
    @Export(name="containerName", refs={String.class}, tree="[0]")
    private Output<String> containerName;

    /**
     * @return The name of the root container where the files should be uploaded to. The container need not exist but should be creatable using the `connection_string` specified.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }
    /**
     * The period of time for which a file upload notification message is available to consume before it expires, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     * 
     */
    @Export(name="defaultTtl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultTtl;

    /**
     * @return The period of time for which a file upload notification message is available to consume before it expires, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     * 
     */
    public Output<Optional<String>> defaultTtl() {
        return Codegen.optional(this.defaultTtl);
    }
    /**
     * The ID of the User Managed Identity used to authenticate against the storage account.
     * 
     * &gt; **Note:** `identity_id` can only be specified when `authentication_type` is `identityBased`. It must be one of the `identity_ids` of the IoT Hub. If `identity_id` is omitted when `authentication_type` is `identityBased`, then the System-Assigned Managed Identity of the IoT Hub will be used.
     * 
     */
    @Export(name="identityId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> identityId;

    /**
     * @return The ID of the User Managed Identity used to authenticate against the storage account.
     * 
     * &gt; **Note:** `identity_id` can only be specified when `authentication_type` is `identityBased`. It must be one of the `identity_ids` of the IoT Hub. If `identity_id` is omitted when `authentication_type` is `identityBased`, then the System-Assigned Managed Identity of the IoT Hub will be used.
     * 
     */
    public Output<Optional<String>> identityId() {
        return Codegen.optional(this.identityId);
    }
    /**
     * The ID of the IoT Hub. Changing this forces a new IoT Hub to be created.
     * 
     */
    @Export(name="iothubId", refs={String.class}, tree="[0]")
    private Output<String> iothubId;

    /**
     * @return The ID of the IoT Hub. Changing this forces a new IoT Hub to be created.
     * 
     */
    public Output<String> iothubId() {
        return this.iothubId;
    }
    /**
     * The lock duration for the file upload notifications queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT1M`.
     * 
     */
    @Export(name="lockDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lockDuration;

    /**
     * @return The lock duration for the file upload notifications queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT1M`.
     * 
     */
    public Output<Optional<String>> lockDuration() {
        return Codegen.optional(this.lockDuration);
    }
    /**
     * The number of times the IoT Hub attempts to deliver a file upload notification message. Defaults to `10`.
     * 
     */
    @Export(name="maxDeliveryCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxDeliveryCount;

    /**
     * @return The number of times the IoT Hub attempts to deliver a file upload notification message. Defaults to `10`.
     * 
     */
    public Output<Optional<Integer>> maxDeliveryCount() {
        return Codegen.optional(this.maxDeliveryCount);
    }
    /**
     * Used to specify whether file notifications are sent to IoT Hub on upload. Defaults to `false`.
     * 
     */
    @Export(name="notificationsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> notificationsEnabled;

    /**
     * @return Used to specify whether file notifications are sent to IoT Hub on upload. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> notificationsEnabled() {
        return Codegen.optional(this.notificationsEnabled);
    }
    /**
     * The period of time for which the SAS URI generated by IoT Hub for file upload is valid, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 24 hours. Defaults to `PT1H`.
     * 
     */
    @Export(name="sasTtl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sasTtl;

    /**
     * @return The period of time for which the SAS URI generated by IoT Hub for file upload is valid, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 24 hours. Defaults to `PT1H`.
     * 
     */
    public Output<Optional<String>> sasTtl() {
        return Codegen.optional(this.sasTtl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileUpload(java.lang.String name) {
        this(name, FileUploadArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileUpload(java.lang.String name, FileUploadArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileUpload(java.lang.String name, FileUploadArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/fileUpload:FileUpload", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FileUpload(java.lang.String name, Output<java.lang.String> id, @Nullable FileUploadState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/fileUpload:FileUpload", name, state, makeResourceOptions(options, id), false);
    }

    private static FileUploadArgs makeArgs(FileUploadArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FileUploadArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "connectionString"
            ))
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
    public static FileUpload get(java.lang.String name, Output<java.lang.String> id, @Nullable FileUploadState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FileUpload(name, id, state, options);
    }
}

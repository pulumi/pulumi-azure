// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the File Upload of an IoT Hub.
 *
 * > **Note:** File upload can be defined either directly on the `azure.iot.IoTHub` resource, or using the `azure.iot.FileUpload` resource - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "examplestorage",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const exampleContainer = new azure.storage.Container("example", {
 *     name: "examplecontainer",
 *     storageAccountName: exampleAccount.name,
 *     containerAccessType: "private",
 * });
 * const exampleIoTHub = new azure.iot.IoTHub("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     sku: {
 *         name: "S1",
 *         capacity: 1,
 *     },
 * });
 * const exampleFileUpload = new azure.iot.FileUpload("example", {
 *     iothubId: exampleIoTHub.id,
 *     connectionString: exampleAccount.primaryBlobConnectionString,
 *     containerName: exampleContainer.name,
 * });
 * ```
 *
 * ## Import
 *
 * IoT Hub File Uploads can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:iot/fileUpload:FileUpload example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/iotHubs/hub1
 * ```
 */
export class FileUpload extends pulumi.CustomResource {
    /**
     * Get an existing FileUpload resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FileUploadState, opts?: pulumi.CustomResourceOptions): FileUpload {
        return new FileUpload(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:iot/fileUpload:FileUpload';

    /**
     * Returns true if the given object is an instance of FileUpload.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FileUpload {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FileUpload.__pulumiType;
    }

    /**
     * The type used to authenticate against the storage account. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     */
    public readonly authenticationType!: pulumi.Output<string | undefined>;
    /**
     * The connection string for the Azure Storage account to which files are uploaded.
     */
    public readonly connectionString!: pulumi.Output<string>;
    /**
     * The name of the root container where the files should be uploaded to. The container need not exist but should be creatable using the `connectionString` specified.
     */
    public readonly containerName!: pulumi.Output<string>;
    /**
     * The period of time for which a file upload notification message is available to consume before it expires, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     */
    public readonly defaultTtl!: pulumi.Output<string | undefined>;
    /**
     * The ID of the User Managed Identity used to authenticate against the storage account.
     *
     * > **Note:** `identityId` can only be specified when `authenticationType` is `identityBased`. It must be one of the `identityIds` of the IoT Hub. If `identityId` is omitted when `authenticationType` is `identityBased`, then the System-Assigned Managed Identity of the IoT Hub will be used.
     */
    public readonly identityId!: pulumi.Output<string | undefined>;
    /**
     * The ID of the IoT Hub. Changing this forces a new IoT Hub to be created.
     */
    public readonly iothubId!: pulumi.Output<string>;
    /**
     * The lock duration for the file upload notifications queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT1M`.
     */
    public readonly lockDuration!: pulumi.Output<string | undefined>;
    /**
     * The number of times the IoT Hub attempts to deliver a file upload notification message. Defaults to `10`.
     */
    public readonly maxDeliveryCount!: pulumi.Output<number | undefined>;
    /**
     * Used to specify whether file notifications are sent to IoT Hub on upload. Defaults to `false`.
     */
    public readonly notificationsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The period of time for which the SAS URI generated by IoT Hub for file upload is valid, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 24 hours. Defaults to `PT1H`.
     */
    public readonly sasTtl!: pulumi.Output<string | undefined>;

    /**
     * Create a FileUpload resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FileUploadArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FileUploadArgs | FileUploadState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FileUploadState | undefined;
            resourceInputs["authenticationType"] = state ? state.authenticationType : undefined;
            resourceInputs["connectionString"] = state ? state.connectionString : undefined;
            resourceInputs["containerName"] = state ? state.containerName : undefined;
            resourceInputs["defaultTtl"] = state ? state.defaultTtl : undefined;
            resourceInputs["identityId"] = state ? state.identityId : undefined;
            resourceInputs["iothubId"] = state ? state.iothubId : undefined;
            resourceInputs["lockDuration"] = state ? state.lockDuration : undefined;
            resourceInputs["maxDeliveryCount"] = state ? state.maxDeliveryCount : undefined;
            resourceInputs["notificationsEnabled"] = state ? state.notificationsEnabled : undefined;
            resourceInputs["sasTtl"] = state ? state.sasTtl : undefined;
        } else {
            const args = argsOrState as FileUploadArgs | undefined;
            if ((!args || args.connectionString === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionString'");
            }
            if ((!args || args.containerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'containerName'");
            }
            if ((!args || args.iothubId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'iothubId'");
            }
            resourceInputs["authenticationType"] = args ? args.authenticationType : undefined;
            resourceInputs["connectionString"] = args?.connectionString ? pulumi.secret(args.connectionString) : undefined;
            resourceInputs["containerName"] = args ? args.containerName : undefined;
            resourceInputs["defaultTtl"] = args ? args.defaultTtl : undefined;
            resourceInputs["identityId"] = args ? args.identityId : undefined;
            resourceInputs["iothubId"] = args ? args.iothubId : undefined;
            resourceInputs["lockDuration"] = args ? args.lockDuration : undefined;
            resourceInputs["maxDeliveryCount"] = args ? args.maxDeliveryCount : undefined;
            resourceInputs["notificationsEnabled"] = args ? args.notificationsEnabled : undefined;
            resourceInputs["sasTtl"] = args ? args.sasTtl : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["connectionString"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(FileUpload.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FileUpload resources.
 */
export interface FileUploadState {
    /**
     * The type used to authenticate against the storage account. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     */
    authenticationType?: pulumi.Input<string>;
    /**
     * The connection string for the Azure Storage account to which files are uploaded.
     */
    connectionString?: pulumi.Input<string>;
    /**
     * The name of the root container where the files should be uploaded to. The container need not exist but should be creatable using the `connectionString` specified.
     */
    containerName?: pulumi.Input<string>;
    /**
     * The period of time for which a file upload notification message is available to consume before it expires, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     */
    defaultTtl?: pulumi.Input<string>;
    /**
     * The ID of the User Managed Identity used to authenticate against the storage account.
     *
     * > **Note:** `identityId` can only be specified when `authenticationType` is `identityBased`. It must be one of the `identityIds` of the IoT Hub. If `identityId` is omitted when `authenticationType` is `identityBased`, then the System-Assigned Managed Identity of the IoT Hub will be used.
     */
    identityId?: pulumi.Input<string>;
    /**
     * The ID of the IoT Hub. Changing this forces a new IoT Hub to be created.
     */
    iothubId?: pulumi.Input<string>;
    /**
     * The lock duration for the file upload notifications queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT1M`.
     */
    lockDuration?: pulumi.Input<string>;
    /**
     * The number of times the IoT Hub attempts to deliver a file upload notification message. Defaults to `10`.
     */
    maxDeliveryCount?: pulumi.Input<number>;
    /**
     * Used to specify whether file notifications are sent to IoT Hub on upload. Defaults to `false`.
     */
    notificationsEnabled?: pulumi.Input<boolean>;
    /**
     * The period of time for which the SAS URI generated by IoT Hub for file upload is valid, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 24 hours. Defaults to `PT1H`.
     */
    sasTtl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FileUpload resource.
 */
export interface FileUploadArgs {
    /**
     * The type used to authenticate against the storage account. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     */
    authenticationType?: pulumi.Input<string>;
    /**
     * The connection string for the Azure Storage account to which files are uploaded.
     */
    connectionString: pulumi.Input<string>;
    /**
     * The name of the root container where the files should be uploaded to. The container need not exist but should be creatable using the `connectionString` specified.
     */
    containerName: pulumi.Input<string>;
    /**
     * The period of time for which a file upload notification message is available to consume before it expires, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     */
    defaultTtl?: pulumi.Input<string>;
    /**
     * The ID of the User Managed Identity used to authenticate against the storage account.
     *
     * > **Note:** `identityId` can only be specified when `authenticationType` is `identityBased`. It must be one of the `identityIds` of the IoT Hub. If `identityId` is omitted when `authenticationType` is `identityBased`, then the System-Assigned Managed Identity of the IoT Hub will be used.
     */
    identityId?: pulumi.Input<string>;
    /**
     * The ID of the IoT Hub. Changing this forces a new IoT Hub to be created.
     */
    iothubId: pulumi.Input<string>;
    /**
     * The lock duration for the file upload notifications queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT1M`.
     */
    lockDuration?: pulumi.Input<string>;
    /**
     * The number of times the IoT Hub attempts to deliver a file upload notification message. Defaults to `10`.
     */
    maxDeliveryCount?: pulumi.Input<number>;
    /**
     * Used to specify whether file notifications are sent to IoT Hub on upload. Defaults to `false`.
     */
    notificationsEnabled?: pulumi.Input<boolean>;
    /**
     * The period of time for which the SAS URI generated by IoT Hub for file upload is valid, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 24 hours. Defaults to `PT1H`.
     */
    sasTtl?: pulumi.Input<string>;
}

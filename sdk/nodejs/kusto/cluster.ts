// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Kusto (also known as Azure Data Explorer) Cluster
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "my-kusto-cluster-rg",
 *     location: "West Europe",
 * });
 * const exampleCluster = new azure.kusto.Cluster("example", {
 *     name: "kustocluster",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     sku: {
 *         name: "Standard_D13_v2",
 *         capacity: 2,
 *     },
 *     tags: {
 *         Environment: "Production",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Kusto`: 2024-04-13
 *
 * ## Import
 *
 * Kusto Clusters can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:kusto/cluster:Cluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/clusters/cluster1
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:kusto/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
     */
    public readonly allowedFqdns!: pulumi.Output<string[] | undefined>;
    /**
     * The list of ips in the format of CIDR allowed to connect to the cluster.
     */
    public readonly allowedIpRanges!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies if the cluster could be automatically stopped (due to lack of data or no activity for many days). Defaults to `true`.
     */
    public readonly autoStopEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The Kusto Cluster URI to be used for data ingestion.
     */
    public /*out*/ readonly dataIngestionUri!: pulumi.Output<string>;
    /**
     * Specifies if the cluster's disks are encrypted.
     */
    public readonly diskEncryptionEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Is the cluster's double encryption enabled? Changing this forces a new resource to be created.
     */
    public readonly doubleEncryptionEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.kusto.ClusterIdentity | undefined>;
    /**
     * An list of `languageExtensions` to enable. Valid values are: `PYTHON`, `PYTHON_3.10.8` and `R`. `PYTHON` is used to specify Python 3.6.5 image and `PYTHON_3.10.8` is used to specify Python 3.10.8 image. Note that `PYTHON_3.10.8` is only available in skus which support nested virtualization.
     *
     * > **Note:** In `v4.0.0` and later version of the AzureRM Provider, `languageExtensions` will be changed to a list of `languageExtension` block. In each block, `name` and `image` are required. `name` is the name of the language extension, possible values are `PYTHON`, `R`. `image` is the image of the language extension, possible values are `Python3_6_5`, `Python3_10_8` and `R`.
     */
    public readonly languageExtensions!: pulumi.Output<outputs.kusto.ClusterLanguageExtension[] | undefined>;
    /**
     * The location where the Kusto Cluster should be created. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An `optimizedAutoScale` block as defined below.
     */
    public readonly optimizedAutoScale!: pulumi.Output<outputs.kusto.ClusterOptimizedAutoScale | undefined>;
    /**
     * Whether to restrict outbound network access. Value is optional but if passed in, must be `true` or `false`, default is `false`.
     */
    public readonly outboundNetworkAccessRestricted!: pulumi.Output<boolean | undefined>;
    /**
     * Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6). Defaults to `IPv4`.
     */
    public readonly publicIpType!: pulumi.Output<string | undefined>;
    /**
     * Is the public network access enabled? Defaults to `true`.
     */
    public readonly publicNetworkAccessEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies if the purge operations are enabled.
     */
    public readonly purgeEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A `sku` block as defined below.
     */
    public readonly sku!: pulumi.Output<outputs.kusto.ClusterSku>;
    /**
     * Specifies if the streaming ingest is enabled.
     */
    public readonly streamingIngestionEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Specifies a list of tenant IDs that are trusted by the cluster. Default setting trusts all other tenants. Use `trustedExternalTenants = ["*"]` to explicitly allow all other tenants, `trustedExternalTenants = ["MyTenantOnly"]` for only your tenant or `trustedExternalTenants = ["<tenantId1>", "<tenantIdx>"]` to allow specific other tenants.
     *
     * > **Note:** In v3.0 of `azurerm` a new or updated Kusto Cluster will only allow your own tenant by default. Explicit configuration of this setting will change from `trustedExternalTenants = ["MyTenantOnly"]` to `trustedExternalTenants = []`.
     */
    public readonly trustedExternalTenants!: pulumi.Output<string[]>;
    /**
     * The FQDN of the Azure Kusto Cluster.
     */
    public /*out*/ readonly uri!: pulumi.Output<string>;
    /**
     * A `virtualNetworkConfiguration` block as defined below.
     *
     * > **Note:** Currently removing `virtualNetworkConfiguration` sets the `virtualNetworkConfiguration` to `Disabled` state. But any changes to `virtualNetworkConfiguration` in `Disabled` state forces a new resource to be created.
     */
    public readonly virtualNetworkConfiguration!: pulumi.Output<outputs.kusto.ClusterVirtualNetworkConfiguration | undefined>;
    /**
     * Specifies a list of Availability Zones in which this Kusto Cluster should be located. Changing this forces a new Kusto Cluster to be created.
     */
    public readonly zones!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["allowedFqdns"] = state ? state.allowedFqdns : undefined;
            resourceInputs["allowedIpRanges"] = state ? state.allowedIpRanges : undefined;
            resourceInputs["autoStopEnabled"] = state ? state.autoStopEnabled : undefined;
            resourceInputs["dataIngestionUri"] = state ? state.dataIngestionUri : undefined;
            resourceInputs["diskEncryptionEnabled"] = state ? state.diskEncryptionEnabled : undefined;
            resourceInputs["doubleEncryptionEnabled"] = state ? state.doubleEncryptionEnabled : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["languageExtensions"] = state ? state.languageExtensions : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["optimizedAutoScale"] = state ? state.optimizedAutoScale : undefined;
            resourceInputs["outboundNetworkAccessRestricted"] = state ? state.outboundNetworkAccessRestricted : undefined;
            resourceInputs["publicIpType"] = state ? state.publicIpType : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = state ? state.publicNetworkAccessEnabled : undefined;
            resourceInputs["purgeEnabled"] = state ? state.purgeEnabled : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["sku"] = state ? state.sku : undefined;
            resourceInputs["streamingIngestionEnabled"] = state ? state.streamingIngestionEnabled : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["trustedExternalTenants"] = state ? state.trustedExternalTenants : undefined;
            resourceInputs["uri"] = state ? state.uri : undefined;
            resourceInputs["virtualNetworkConfiguration"] = state ? state.virtualNetworkConfiguration : undefined;
            resourceInputs["zones"] = state ? state.zones : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.sku === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sku'");
            }
            resourceInputs["allowedFqdns"] = args ? args.allowedFqdns : undefined;
            resourceInputs["allowedIpRanges"] = args ? args.allowedIpRanges : undefined;
            resourceInputs["autoStopEnabled"] = args ? args.autoStopEnabled : undefined;
            resourceInputs["diskEncryptionEnabled"] = args ? args.diskEncryptionEnabled : undefined;
            resourceInputs["doubleEncryptionEnabled"] = args ? args.doubleEncryptionEnabled : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["languageExtensions"] = args ? args.languageExtensions : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["optimizedAutoScale"] = args ? args.optimizedAutoScale : undefined;
            resourceInputs["outboundNetworkAccessRestricted"] = args ? args.outboundNetworkAccessRestricted : undefined;
            resourceInputs["publicIpType"] = args ? args.publicIpType : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = args ? args.publicNetworkAccessEnabled : undefined;
            resourceInputs["purgeEnabled"] = args ? args.purgeEnabled : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sku"] = args ? args.sku : undefined;
            resourceInputs["streamingIngestionEnabled"] = args ? args.streamingIngestionEnabled : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["trustedExternalTenants"] = args ? args.trustedExternalTenants : undefined;
            resourceInputs["virtualNetworkConfiguration"] = args ? args.virtualNetworkConfiguration : undefined;
            resourceInputs["zones"] = args ? args.zones : undefined;
            resourceInputs["dataIngestionUri"] = undefined /*out*/;
            resourceInputs["uri"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
     */
    allowedFqdns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of ips in the format of CIDR allowed to connect to the cluster.
     */
    allowedIpRanges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies if the cluster could be automatically stopped (due to lack of data or no activity for many days). Defaults to `true`.
     */
    autoStopEnabled?: pulumi.Input<boolean>;
    /**
     * The Kusto Cluster URI to be used for data ingestion.
     */
    dataIngestionUri?: pulumi.Input<string>;
    /**
     * Specifies if the cluster's disks are encrypted.
     */
    diskEncryptionEnabled?: pulumi.Input<boolean>;
    /**
     * Is the cluster's double encryption enabled? Changing this forces a new resource to be created.
     */
    doubleEncryptionEnabled?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.kusto.ClusterIdentity>;
    /**
     * An list of `languageExtensions` to enable. Valid values are: `PYTHON`, `PYTHON_3.10.8` and `R`. `PYTHON` is used to specify Python 3.6.5 image and `PYTHON_3.10.8` is used to specify Python 3.10.8 image. Note that `PYTHON_3.10.8` is only available in skus which support nested virtualization.
     *
     * > **Note:** In `v4.0.0` and later version of the AzureRM Provider, `languageExtensions` will be changed to a list of `languageExtension` block. In each block, `name` and `image` are required. `name` is the name of the language extension, possible values are `PYTHON`, `R`. `image` is the image of the language extension, possible values are `Python3_6_5`, `Python3_10_8` and `R`.
     */
    languageExtensions?: pulumi.Input<pulumi.Input<inputs.kusto.ClusterLanguageExtension>[]>;
    /**
     * The location where the Kusto Cluster should be created. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * An `optimizedAutoScale` block as defined below.
     */
    optimizedAutoScale?: pulumi.Input<inputs.kusto.ClusterOptimizedAutoScale>;
    /**
     * Whether to restrict outbound network access. Value is optional but if passed in, must be `true` or `false`, default is `false`.
     */
    outboundNetworkAccessRestricted?: pulumi.Input<boolean>;
    /**
     * Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6). Defaults to `IPv4`.
     */
    publicIpType?: pulumi.Input<string>;
    /**
     * Is the public network access enabled? Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies if the purge operations are enabled.
     */
    purgeEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A `sku` block as defined below.
     */
    sku?: pulumi.Input<inputs.kusto.ClusterSku>;
    /**
     * Specifies if the streaming ingest is enabled.
     */
    streamingIngestionEnabled?: pulumi.Input<boolean>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies a list of tenant IDs that are trusted by the cluster. Default setting trusts all other tenants. Use `trustedExternalTenants = ["*"]` to explicitly allow all other tenants, `trustedExternalTenants = ["MyTenantOnly"]` for only your tenant or `trustedExternalTenants = ["<tenantId1>", "<tenantIdx>"]` to allow specific other tenants.
     *
     * > **Note:** In v3.0 of `azurerm` a new or updated Kusto Cluster will only allow your own tenant by default. Explicit configuration of this setting will change from `trustedExternalTenants = ["MyTenantOnly"]` to `trustedExternalTenants = []`.
     */
    trustedExternalTenants?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The FQDN of the Azure Kusto Cluster.
     */
    uri?: pulumi.Input<string>;
    /**
     * A `virtualNetworkConfiguration` block as defined below.
     *
     * > **Note:** Currently removing `virtualNetworkConfiguration` sets the `virtualNetworkConfiguration` to `Disabled` state. But any changes to `virtualNetworkConfiguration` in `Disabled` state forces a new resource to be created.
     */
    virtualNetworkConfiguration?: pulumi.Input<inputs.kusto.ClusterVirtualNetworkConfiguration>;
    /**
     * Specifies a list of Availability Zones in which this Kusto Cluster should be located. Changing this forces a new Kusto Cluster to be created.
     */
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * List of allowed FQDNs(Fully Qualified Domain Name) for egress from Cluster.
     */
    allowedFqdns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of ips in the format of CIDR allowed to connect to the cluster.
     */
    allowedIpRanges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies if the cluster could be automatically stopped (due to lack of data or no activity for many days). Defaults to `true`.
     */
    autoStopEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies if the cluster's disks are encrypted.
     */
    diskEncryptionEnabled?: pulumi.Input<boolean>;
    /**
     * Is the cluster's double encryption enabled? Changing this forces a new resource to be created.
     */
    doubleEncryptionEnabled?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.kusto.ClusterIdentity>;
    /**
     * An list of `languageExtensions` to enable. Valid values are: `PYTHON`, `PYTHON_3.10.8` and `R`. `PYTHON` is used to specify Python 3.6.5 image and `PYTHON_3.10.8` is used to specify Python 3.10.8 image. Note that `PYTHON_3.10.8` is only available in skus which support nested virtualization.
     *
     * > **Note:** In `v4.0.0` and later version of the AzureRM Provider, `languageExtensions` will be changed to a list of `languageExtension` block. In each block, `name` and `image` are required. `name` is the name of the language extension, possible values are `PYTHON`, `R`. `image` is the image of the language extension, possible values are `Python3_6_5`, `Python3_10_8` and `R`.
     */
    languageExtensions?: pulumi.Input<pulumi.Input<inputs.kusto.ClusterLanguageExtension>[]>;
    /**
     * The location where the Kusto Cluster should be created. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Kusto Cluster to create. Only lowercase Alphanumeric characters allowed, starting with a letter. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * An `optimizedAutoScale` block as defined below.
     */
    optimizedAutoScale?: pulumi.Input<inputs.kusto.ClusterOptimizedAutoScale>;
    /**
     * Whether to restrict outbound network access. Value is optional but if passed in, must be `true` or `false`, default is `false`.
     */
    outboundNetworkAccessRestricted?: pulumi.Input<boolean>;
    /**
     * Indicates what public IP type to create - IPv4 (default), or DualStack (both IPv4 and IPv6). Defaults to `IPv4`.
     */
    publicIpType?: pulumi.Input<string>;
    /**
     * Is the public network access enabled? Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies if the purge operations are enabled.
     */
    purgeEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the Resource Group where the Kusto Cluster should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `sku` block as defined below.
     */
    sku: pulumi.Input<inputs.kusto.ClusterSku>;
    /**
     * Specifies if the streaming ingest is enabled.
     */
    streamingIngestionEnabled?: pulumi.Input<boolean>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies a list of tenant IDs that are trusted by the cluster. Default setting trusts all other tenants. Use `trustedExternalTenants = ["*"]` to explicitly allow all other tenants, `trustedExternalTenants = ["MyTenantOnly"]` for only your tenant or `trustedExternalTenants = ["<tenantId1>", "<tenantIdx>"]` to allow specific other tenants.
     *
     * > **Note:** In v3.0 of `azurerm` a new or updated Kusto Cluster will only allow your own tenant by default. Explicit configuration of this setting will change from `trustedExternalTenants = ["MyTenantOnly"]` to `trustedExternalTenants = []`.
     */
    trustedExternalTenants?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A `virtualNetworkConfiguration` block as defined below.
     *
     * > **Note:** Currently removing `virtualNetworkConfiguration` sets the `virtualNetworkConfiguration` to `Disabled` state. But any changes to `virtualNetworkConfiguration` in `Disabled` state forces a new resource to be created.
     */
    virtualNetworkConfiguration?: pulumi.Input<inputs.kusto.ClusterVirtualNetworkConfiguration>;
    /**
     * Specifies a list of Availability Zones in which this Kusto Cluster should be located. Changing this forces a new Kusto Cluster to be created.
     */
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}

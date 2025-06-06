// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Public IP Address.
 *
 * ## Example Usage
 *
 * ### Reference An Existing)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.network.getPublicIP({
 *     name: "name_of_public_ip",
 *     resourceGroupName: "name_of_resource_group",
 * });
 * export const domainNameLabel = example.then(example => example.domainNameLabel);
 * export const publicIpAddress = example.then(example => example.ipAddress);
 * ```
 *
 * ### Retrieve The Dynamic Public IP Of A New VM)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("example", {
 *     name: "test-resources",
 *     location: "West Europe",
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "test-network",
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "acctsub",
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 * });
 * const examplePublicIp = new azure.network.PublicIp("example", {
 *     name: "test-pip",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     allocationMethod: "Dynamic",
 *     idleTimeoutInMinutes: 30,
 *     tags: {
 *         environment: "test",
 *     },
 * });
 * const exampleNetworkInterface = new azure.network.NetworkInterface("example", {
 *     name: "test-nic",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     ipConfigurations: [{
 *         name: "testconfiguration1",
 *         subnetId: exampleSubnet.id,
 *         privateIpAddressAllocation: "Static",
 *         privateIpAddress: "10.0.2.5",
 *         publicIpAddressId: examplePublicIp.id,
 *     }],
 * });
 * const exampleVirtualMachine = new azure.compute.VirtualMachine("example", {
 *     name: "test-vm",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkInterfaceIds: [exampleNetworkInterface.id],
 * });
 * const example = azure.network.getPublicIPOutput({
 *     name: examplePublicIp.name,
 *     resourceGroupName: exampleVirtualMachine.resourceGroupName,
 * });
 * export const publicIpAddress = example.apply(example => example.ipAddress);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2024-05-01
 */
export function getPublicIP(args: GetPublicIPArgs, opts?: pulumi.InvokeOptions): Promise<GetPublicIPResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:network/getPublicIP:getPublicIP", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPublicIP.
 */
export interface GetPublicIPArgs {
    /**
     * Specifies the name of the public IP address.
     */
    name: string;
    /**
     * Specifies the name of the resource group.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getPublicIP.
 */
export interface GetPublicIPResult {
    /**
     * The allocation method for this IP address. Possible values are `Static` or `Dynamic`.
     */
    readonly allocationMethod: string;
    /**
     * The DDoS protection mode of the public IP.
     */
    readonly ddosProtectionMode: string;
    /**
     * The ID of DDoS protection plan associated with the public IP.
     */
    readonly ddosProtectionPlanId: string;
    /**
     * The label for the Domain Name.
     */
    readonly domainNameLabel: string;
    /**
     * Fully qualified domain name of the A DNS record associated with the public IP. This is the concatenation of the domainNameLabel and the regionalized DNS zone.
     */
    readonly fqdn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Specifies the timeout for the TCP idle connection.
     */
    readonly idleTimeoutInMinutes: number;
    /**
     * The IP address value that was allocated.
     */
    readonly ipAddress: string;
    /**
     * A mapping of tags to assigned to the resource.
     */
    readonly ipTags: {[key: string]: string};
    /**
     * The IP version being used, for example `IPv4` or `IPv6`.
     */
    readonly ipVersion: string;
    /**
     * The region that this public ip exists.
     */
    readonly location: string;
    readonly name: string;
    readonly resourceGroupName: string;
    /**
     * The fully qualified domain name that resolves to this public IP address.
     */
    readonly reverseFqdn: string;
    /**
     * The SKU of the Public IP.
     */
    readonly sku: string;
    /**
     * A mapping of tags to assigned to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * A list of Availability Zones in which this Public IP is located.
     */
    readonly zones: string[];
}
/**
 * Use this data source to access information about an existing Public IP Address.
 *
 * ## Example Usage
 *
 * ### Reference An Existing)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.network.getPublicIP({
 *     name: "name_of_public_ip",
 *     resourceGroupName: "name_of_resource_group",
 * });
 * export const domainNameLabel = example.then(example => example.domainNameLabel);
 * export const publicIpAddress = example.then(example => example.ipAddress);
 * ```
 *
 * ### Retrieve The Dynamic Public IP Of A New VM)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("example", {
 *     name: "test-resources",
 *     location: "West Europe",
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "test-network",
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "acctsub",
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 * });
 * const examplePublicIp = new azure.network.PublicIp("example", {
 *     name: "test-pip",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     allocationMethod: "Dynamic",
 *     idleTimeoutInMinutes: 30,
 *     tags: {
 *         environment: "test",
 *     },
 * });
 * const exampleNetworkInterface = new azure.network.NetworkInterface("example", {
 *     name: "test-nic",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     ipConfigurations: [{
 *         name: "testconfiguration1",
 *         subnetId: exampleSubnet.id,
 *         privateIpAddressAllocation: "Static",
 *         privateIpAddress: "10.0.2.5",
 *         publicIpAddressId: examplePublicIp.id,
 *     }],
 * });
 * const exampleVirtualMachine = new azure.compute.VirtualMachine("example", {
 *     name: "test-vm",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkInterfaceIds: [exampleNetworkInterface.id],
 * });
 * const example = azure.network.getPublicIPOutput({
 *     name: examplePublicIp.name,
 *     resourceGroupName: exampleVirtualMachine.resourceGroupName,
 * });
 * export const publicIpAddress = example.apply(example => example.ipAddress);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2024-05-01
 */
export function getPublicIPOutput(args: GetPublicIPOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPublicIPResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:network/getPublicIP:getPublicIP", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPublicIP.
 */
export interface GetPublicIPOutputArgs {
    /**
     * Specifies the name of the public IP address.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the name of the resource group.
     */
    resourceGroupName: pulumi.Input<string>;
}

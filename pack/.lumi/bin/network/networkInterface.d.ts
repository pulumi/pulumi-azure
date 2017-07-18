import * as lumi from "@lumi/lumi";
export declare class NetworkInterface extends lumi.NamedResource implements NetworkInterfaceArgs {
    readonly appliedDnsServers: string[];
    readonly dnsServers: string[];
    readonly enableIpForwarding?: boolean;
    readonly internalDnsNameLabel: string;
    readonly internalFqdn: string;
    readonly ipConfiguration: {
        loadBalancerBackendAddressPoolsIds: string[];
        loadBalancerInboundNatRulesIds: string[];
        name: string;
        privateIpAddress: string;
        privateIpAddressAllocation: string;
        publicIpAddressId: string;
        subnetId: string;
    }[];
    readonly location: string;
    readonly macAddress: string;
    readonly networkInterfaceName?: string;
    readonly networkSecurityGroupId: string;
    readonly privateIpAddress: string;
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly virtualMachineId: string;
    constructor(name: string, args: NetworkInterfaceArgs);
}
export interface NetworkInterfaceArgs {
    readonly appliedDnsServers?: string[];
    readonly dnsServers?: string[];
    readonly enableIpForwarding?: boolean;
    readonly internalDnsNameLabel?: string;
    readonly internalFqdn?: string;
    readonly ipConfiguration: {
        loadBalancerBackendAddressPoolsIds: string[];
        loadBalancerInboundNatRulesIds: string[];
        name: string;
        privateIpAddress: string;
        privateIpAddressAllocation: string;
        publicIpAddressId: string;
        subnetId: string;
    }[];
    readonly location: string;
    readonly macAddress?: string;
    readonly networkInterfaceName?: string;
    readonly networkSecurityGroupId?: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly virtualMachineId?: string;
}


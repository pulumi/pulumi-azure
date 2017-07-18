import * as lumi from "@lumi/lumi";
export declare class NetworkPeering extends lumi.NamedResource implements NetworkPeeringArgs {
    readonly allowForwardedTraffic: boolean;
    readonly allowGatewayTransit: boolean;
    readonly allowVirtualNetworkAccess: boolean;
    readonly networkPeeringName?: string;
    readonly remoteVirtualNetworkId: string;
    readonly resourceGroupName: string;
    readonly useRemoteGateways: boolean;
    readonly virtualNetworkName: string;
    constructor(name: string, args: NetworkPeeringArgs);
}
export interface NetworkPeeringArgs {
    readonly allowForwardedTraffic?: boolean;
    readonly allowGatewayTransit?: boolean;
    readonly allowVirtualNetworkAccess?: boolean;
    readonly networkPeeringName?: string;
    readonly remoteVirtualNetworkId: string;
    readonly resourceGroupName: string;
    readonly useRemoteGateways?: boolean;
    readonly virtualNetworkName: string;
}


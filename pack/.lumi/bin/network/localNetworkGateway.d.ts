import * as lumi from "@lumi/lumi";
export declare class LocalNetworkGateway extends lumi.NamedResource implements LocalNetworkGatewayArgs {
    readonly addressSpace: string[];
    readonly gatewayAddress: string;
    readonly location: string;
    readonly localNetworkGatewayName?: string;
    readonly resourceGroupName?: string;
    constructor(name: string, args: LocalNetworkGatewayArgs);
}
export interface LocalNetworkGatewayArgs {
    readonly addressSpace: string[];
    readonly gatewayAddress: string;
    readonly location: string;
    readonly localNetworkGatewayName?: string;
    readonly resourceGroupName?: string;
}


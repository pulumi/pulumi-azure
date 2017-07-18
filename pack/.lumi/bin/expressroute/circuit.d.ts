import * as lumi from "@lumi/lumi";
export declare class Circuit extends lumi.NamedResource implements CircuitArgs {
    readonly allowClassicOperations?: boolean;
    readonly bandwidthInMbps: number;
    readonly location: string;
    readonly circuitName?: string;
    readonly peeringLocation: string;
    readonly resourceGroupName: string;
    readonly serviceKey: string;
    readonly serviceProviderName: string;
    readonly serviceProviderProvisioningState: string;
    readonly sku: {
        family: string;
        tier: string;
    }[];
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: CircuitArgs);
}
export interface CircuitArgs {
    readonly allowClassicOperations?: boolean;
    readonly bandwidthInMbps: number;
    readonly location: string;
    readonly circuitName?: string;
    readonly peeringLocation: string;
    readonly resourceGroupName: string;
    readonly serviceProviderName: string;
    readonly sku: {
        family: string;
        tier: string;
    }[];
    readonly tags?: {
        [key: string]: any;
    };
}


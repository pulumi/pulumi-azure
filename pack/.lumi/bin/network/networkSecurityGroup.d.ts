import * as lumi from "@lumi/lumi";
export declare class NetworkSecurityGroup extends lumi.NamedResource implements NetworkSecurityGroupArgs {
    readonly location: string;
    readonly networkSecurityGroupName?: string;
    readonly resourceGroupName: string;
    readonly securityRule: {
        access: string;
        description?: string;
        destinationAddressPrefix: string;
        destinationPortRange: string;
        direction: string;
        name: string;
        priority: number;
        protocol: string;
        sourceAddressPrefix: string;
        sourcePortRange: string;
    }[];
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: NetworkSecurityGroupArgs);
}
export interface NetworkSecurityGroupArgs {
    readonly location: string;
    readonly networkSecurityGroupName?: string;
    readonly resourceGroupName: string;
    readonly securityRule?: {
        access: string;
        description?: string;
        destinationAddressPrefix: string;
        destinationPortRange: string;
        direction: string;
        name: string;
        priority: number;
        protocol: string;
        sourceAddressPrefix: string;
        sourcePortRange: string;
    }[];
    readonly tags?: {
        [key: string]: any;
    };
}


import * as lumi from "@lumi/lumi";
export declare class Subnet extends lumi.NamedResource implements SubnetArgs {
    readonly addressPrefix: string;
    readonly ipConfigurations: string[];
    readonly subnetName?: string;
    readonly networkSecurityGroupId: string;
    readonly resourceGroupName: string;
    readonly routeTableId: string;
    readonly virtualNetworkName: string;
    constructor(name: string, args: SubnetArgs);
}
export interface SubnetArgs {
    readonly addressPrefix: string;
    readonly ipConfigurations?: string[];
    readonly subnetName?: string;
    readonly networkSecurityGroupId?: string;
    readonly resourceGroupName: string;
    readonly routeTableId?: string;
    readonly virtualNetworkName: string;
}


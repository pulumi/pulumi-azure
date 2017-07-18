import * as lumi from "@lumi/lumi";
export declare class NetworkSecurityRule extends lumi.NamedResource implements NetworkSecurityRuleArgs {
    readonly access: string;
    readonly description?: string;
    readonly destinationAddressPrefix: string;
    readonly destinationPortRange: string;
    readonly direction: string;
    readonly networkSecurityRuleName?: string;
    readonly networkSecurityGroupName: string;
    readonly priority: number;
    readonly protocol: string;
    readonly resourceGroupName: string;
    readonly sourceAddressPrefix: string;
    readonly sourcePortRange: string;
    constructor(name: string, args: NetworkSecurityRuleArgs);
}
export interface NetworkSecurityRuleArgs {
    readonly access: string;
    readonly description?: string;
    readonly destinationAddressPrefix: string;
    readonly destinationPortRange: string;
    readonly direction: string;
    readonly networkSecurityRuleName?: string;
    readonly networkSecurityGroupName: string;
    readonly priority: number;
    readonly protocol: string;
    readonly resourceGroupName: string;
    readonly sourceAddressPrefix: string;
    readonly sourcePortRange: string;
}


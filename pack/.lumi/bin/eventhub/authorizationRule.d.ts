import * as lumi from "@lumi/lumi";
export declare class AuthorizationRule extends lumi.NamedResource implements AuthorizationRuleArgs {
    readonly eventhubName: string;
    readonly listen?: boolean;
    readonly location: string;
    readonly manage?: boolean;
    readonly authorizationRuleName?: string;
    readonly namespaceName: string;
    readonly primaryConnectionString: string;
    readonly primaryKey: string;
    readonly resourceGroupName: string;
    readonly secondaryConnectionString: string;
    readonly secondaryKey: string;
    readonly send?: boolean;
    constructor(name: string, args: AuthorizationRuleArgs);
}
export interface AuthorizationRuleArgs {
    readonly eventhubName: string;
    readonly listen?: boolean;
    readonly location: string;
    readonly manage?: boolean;
    readonly authorizationRuleName?: string;
    readonly namespaceName: string;
    readonly resourceGroupName: string;
    readonly send?: boolean;
}


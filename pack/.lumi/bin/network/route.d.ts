import * as lumi from "@lumi/lumi";
export declare class Route extends lumi.NamedResource implements RouteArgs {
    readonly addressPrefix: string;
    readonly routeName?: string;
    readonly nextHopInIpAddress: string;
    readonly nextHopType: string;
    readonly resourceGroupName: string;
    readonly routeTableName: string;
    constructor(name: string, args: RouteArgs);
}
export interface RouteArgs {
    readonly addressPrefix: string;
    readonly routeName?: string;
    readonly nextHopInIpAddress?: string;
    readonly nextHopType: string;
    readonly resourceGroupName: string;
    readonly routeTableName: string;
}


import * as lumi from "@lumi/lumi";
export declare class RouteTable extends lumi.NamedResource implements RouteTableArgs {
    readonly location: string;
    readonly routeTableName?: string;
    readonly resourceGroupName: string;
    readonly route: {
        addressPrefix: string;
        name: string;
        nextHopInIpAddress: string;
        nextHopType: string;
    }[];
    readonly subnets: string[];
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: RouteTableArgs);
}
export interface RouteTableArgs {
    readonly location: string;
    readonly routeTableName?: string;
    readonly resourceGroupName: string;
    readonly route?: {
        addressPrefix: string;
        name: string;
        nextHopInIpAddress: string;
        nextHopType: string;
    }[];
    readonly tags?: {
        [key: string]: any;
    };
}


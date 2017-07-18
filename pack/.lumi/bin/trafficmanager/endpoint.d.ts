import * as lumi from "@lumi/lumi";
export declare class Endpoint extends lumi.NamedResource implements EndpointArgs {
    readonly endpointLocation: string;
    readonly endpointStatus: string;
    readonly minChildEndpoints?: number;
    readonly endpointName?: string;
    readonly priority: number;
    readonly profileName: string;
    readonly resourceGroupName: string;
    readonly target: string;
    readonly targetResourceId?: string;
    readonly type: string;
    readonly weight: number;
    constructor(name: string, args: EndpointArgs);
}
export interface EndpointArgs {
    readonly endpointLocation?: string;
    readonly endpointStatus?: string;
    readonly minChildEndpoints?: number;
    readonly endpointName?: string;
    readonly priority?: number;
    readonly profileName: string;
    readonly resourceGroupName: string;
    readonly target?: string;
    readonly targetResourceId?: string;
    readonly type: string;
    readonly weight?: number;
}


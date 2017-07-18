import * as lumi from "@lumi/lumi";
export declare class ElasticPool extends lumi.NamedResource implements ElasticPoolArgs {
    readonly creationDate: string;
    readonly dbDtuMax: number;
    readonly dbDtuMin: number;
    readonly dtu: number;
    readonly edition: string;
    readonly location: string;
    readonly elasticPoolName?: string;
    readonly poolSize: number;
    readonly resourceGroupName: string;
    readonly serverName: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: ElasticPoolArgs);
}
export interface ElasticPoolArgs {
    readonly dbDtuMax?: number;
    readonly dbDtuMin?: number;
    readonly dtu: number;
    readonly edition: string;
    readonly location: string;
    readonly elasticPoolName?: string;
    readonly poolSize?: number;
    readonly resourceGroupName: string;
    readonly serverName: string;
    readonly tags?: {
        [key: string]: any;
    };
}


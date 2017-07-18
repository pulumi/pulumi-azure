import * as lumi from "@lumi/lumi";
export declare class SqlServer extends lumi.NamedResource implements SqlServerArgs {
    readonly administratorLogin: string;
    readonly administratorLoginPassword: string;
    readonly fullyQualifiedDomainName: string;
    readonly location: string;
    readonly sqlServerName?: string;
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    readonly version: string;
    constructor(name: string, args: SqlServerArgs);
}
export interface SqlServerArgs {
    readonly administratorLogin: string;
    readonly administratorLoginPassword: string;
    readonly location: string;
    readonly sqlServerName?: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
    readonly version: string;
}


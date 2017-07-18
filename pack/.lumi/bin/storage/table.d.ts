import * as lumi from "@lumi/lumi";
export declare class Table extends lumi.NamedResource implements TableArgs {
    readonly tableName?: string;
    readonly resourceGroupName: string;
    readonly storageAccountName: string;
    constructor(name: string, args: TableArgs);
}
export interface TableArgs {
    readonly tableName?: string;
    readonly resourceGroupName: string;
    readonly storageAccountName: string;
}


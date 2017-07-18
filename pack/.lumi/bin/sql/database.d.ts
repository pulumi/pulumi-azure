import * as lumi from "@lumi/lumi";
export declare class Database extends lumi.NamedResource implements DatabaseArgs {
    readonly collation: string;
    readonly createMode?: string;
    readonly creationDate: string;
    readonly defaultSecondaryLocation: string;
    readonly edition: string;
    readonly elasticPoolName: string;
    readonly encryption: string;
    readonly location: string;
    readonly maxSizeBytes: string;
    readonly databaseName?: string;
    readonly requestedServiceObjectiveId: string;
    readonly requestedServiceObjectiveName: string;
    readonly resourceGroupName: string;
    readonly restorePointInTime: string;
    readonly serverName: string;
    readonly sourceDatabaseDeletionDate: string;
    readonly sourceDatabaseId: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: DatabaseArgs);
}
export interface DatabaseArgs {
    readonly collation?: string;
    readonly createMode?: string;
    readonly edition?: string;
    readonly elasticPoolName?: string;
    readonly location: string;
    readonly maxSizeBytes?: string;
    readonly databaseName?: string;
    readonly requestedServiceObjectiveId?: string;
    readonly requestedServiceObjectiveName?: string;
    readonly resourceGroupName: string;
    readonly restorePointInTime?: string;
    readonly serverName: string;
    readonly sourceDatabaseDeletionDate?: string;
    readonly sourceDatabaseId?: string;
    readonly tags?: {
        [key: string]: any;
    };
}


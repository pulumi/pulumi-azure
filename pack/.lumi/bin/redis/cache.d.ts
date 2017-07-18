import * as lumi from "@lumi/lumi";
export declare class Cache extends lumi.NamedResource implements CacheArgs {
    readonly capacity: number;
    readonly enableNonSslPort?: boolean;
    readonly family: string;
    readonly hostname: string;
    readonly location: string;
    readonly cacheName?: string;
    readonly port: number;
    readonly primaryAccessKey: string;
    readonly redisConfiguration: {
        maxclients: number;
        maxmemoryDelta: number;
        maxmemoryPolicy?: string;
        maxmemoryReserved: number;
        rdbBackupEnabled?: boolean;
        rdbBackupFrequency?: number;
        rdbBackupMaxSnapshotCount?: number;
        rdbStorageConnectionString?: string;
    }[];
    readonly resourceGroupName: string;
    readonly secondaryAccessKey: string;
    readonly shardCount?: number;
    readonly skuName: string;
    readonly sslPort: number;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: CacheArgs);
}
export interface CacheArgs {
    readonly capacity: number;
    readonly enableNonSslPort?: boolean;
    readonly family: string;
    readonly location: string;
    readonly cacheName?: string;
    readonly redisConfiguration: {
        maxclients: number;
        maxmemoryDelta: number;
        maxmemoryPolicy?: string;
        maxmemoryReserved: number;
        rdbBackupEnabled?: boolean;
        rdbBackupFrequency?: number;
        rdbBackupMaxSnapshotCount?: number;
        rdbStorageConnectionString?: string;
    }[];
    readonly resourceGroupName: string;
    readonly shardCount?: number;
    readonly skuName: string;
    readonly tags?: {
        [key: string]: any;
    };
}


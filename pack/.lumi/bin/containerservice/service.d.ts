import * as lumi from "@lumi/lumi";
export declare class Service extends lumi.NamedResource implements ServiceArgs {
    readonly agentPoolProfile: {
        count?: number;
        dnsPrefix: string;
        fqdn: string;
        name: string;
        vmSize: string;
    }[];
    readonly diagnosticsProfile: {
        enabled: boolean;
        storageUri: string;
    }[];
    readonly linuxProfile: {
        adminUsername: string;
        sshKey: {
            keyData: string;
        }[];
    }[];
    readonly location: string;
    readonly masterProfile: {
        count?: number;
        dnsPrefix: string;
        fqdn: string;
    }[];
    readonly serviceName?: string;
    readonly orchestrationPlatform: string;
    readonly resourceGroupName: string;
    readonly servicePrincipal?: {
        clientId: string;
        clientSecret: string;
    }[];
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: ServiceArgs);
}
export interface ServiceArgs {
    readonly agentPoolProfile: {
        count?: number;
        dnsPrefix: string;
        fqdn: string;
        name: string;
        vmSize: string;
    }[];
    readonly diagnosticsProfile: {
        enabled: boolean;
        storageUri: string;
    }[];
    readonly linuxProfile: {
        adminUsername: string;
        sshKey: {
            keyData: string;
        }[];
    }[];
    readonly location: string;
    readonly masterProfile: {
        count?: number;
        dnsPrefix: string;
        fqdn: string;
    }[];
    readonly serviceName?: string;
    readonly orchestrationPlatform: string;
    readonly resourceGroupName: string;
    readonly servicePrincipal?: {
        clientId: string;
        clientSecret: string;
    }[];
    readonly tags?: {
        [key: string]: any;
    };
}


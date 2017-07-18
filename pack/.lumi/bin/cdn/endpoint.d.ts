import * as lumi from "@lumi/lumi";
export declare class Endpoint extends lumi.NamedResource implements EndpointArgs {
    readonly contentTypesToCompress: string[];
    readonly hostName: string;
    readonly isCompressionEnabled?: boolean;
    readonly isHttpAllowed?: boolean;
    readonly isHttpsAllowed?: boolean;
    readonly location: string;
    readonly endpointName?: string;
    readonly origin: {
        hostName: string;
        httpPort: number;
        httpsPort: number;
        name: string;
    }[];
    readonly originHostHeader: string;
    readonly originPath: string;
    readonly profileName: string;
    readonly querystringCachingBehaviour?: string;
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: EndpointArgs);
}
export interface EndpointArgs {
    readonly contentTypesToCompress?: string[];
    readonly isCompressionEnabled?: boolean;
    readonly isHttpAllowed?: boolean;
    readonly isHttpsAllowed?: boolean;
    readonly location: string;
    readonly endpointName?: string;
    readonly origin: {
        hostName: string;
        httpPort: number;
        httpsPort: number;
        name: string;
    }[];
    readonly originHostHeader?: string;
    readonly originPath?: string;
    readonly profileName: string;
    readonly querystringCachingBehaviour?: string;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
}


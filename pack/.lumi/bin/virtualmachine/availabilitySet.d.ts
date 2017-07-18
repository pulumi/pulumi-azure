import * as lumi from "@lumi/lumi";
export declare class AvailabilitySet extends lumi.NamedResource implements AvailabilitySetArgs {
    readonly location: string;
    readonly managed?: boolean;
    readonly availabilitySetName?: string;
    readonly platformFaultDomainCount?: number;
    readonly platformUpdateDomainCount?: number;
    readonly resourceGroupName: string;
    readonly tags: {
        [key: string]: any;
    };
    constructor(name: string, args: AvailabilitySetArgs);
}
export interface AvailabilitySetArgs {
    readonly location: string;
    readonly managed?: boolean;
    readonly availabilitySetName?: string;
    readonly platformFaultDomainCount?: number;
    readonly platformUpdateDomainCount?: number;
    readonly resourceGroupName: string;
    readonly tags?: {
        [key: string]: any;
    };
}


import * as lumi from "@lumi/lumi";
export declare class TemplateDeployment extends lumi.NamedResource implements TemplateDeploymentArgs {
    readonly deploymentMode: string;
    readonly templateDeploymentName?: string;
    readonly outputs: {
        [key: string]: any;
    };
    readonly parameters?: {
        [key: string]: any;
    };
    readonly resourceGroupName: string;
    readonly templateBody: string;
    constructor(name: string, args: TemplateDeploymentArgs);
}
export interface TemplateDeploymentArgs {
    readonly deploymentMode: string;
    readonly templateDeploymentName?: string;
    readonly parameters?: {
        [key: string]: any;
    };
    readonly resourceGroupName: string;
    readonly templateBody?: string;
}


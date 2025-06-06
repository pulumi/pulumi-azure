// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { EmbeddedArgs, EmbeddedState } from "./embedded";
export type Embedded = import("./embedded").Embedded;
export const Embedded: typeof import("./embedded").Embedded = null as any;
utilities.lazyLoad(exports, ["Embedded"], () => require("./embedded"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:powerbi/embedded:Embedded":
                return new Embedded(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "powerbi/embedded", _module)

// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ModuleArgs, ModuleState } from "./module";
export type Module = import("./module").Module;
export const Module: typeof import("./module").Module = null as any;
utilities.lazyLoad(exports, ["Module"], () => require("./module"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:hsm/module:Module":
                return new Module(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "hsm/module", _module)

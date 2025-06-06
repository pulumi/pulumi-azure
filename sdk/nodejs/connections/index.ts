// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ApiConnectionArgs, ApiConnectionState } from "./apiConnection";
export type ApiConnection = import("./apiConnection").ApiConnection;
export const ApiConnection: typeof import("./apiConnection").ApiConnection = null as any;
utilities.lazyLoad(exports, ["ApiConnection"], () => require("./apiConnection"));

export { GetManagedApiArgs, GetManagedApiResult, GetManagedApiOutputArgs } from "./getManagedApi";
export const getManagedApi: typeof import("./getManagedApi").getManagedApi = null as any;
export const getManagedApiOutput: typeof import("./getManagedApi").getManagedApiOutput = null as any;
utilities.lazyLoad(exports, ["getManagedApi","getManagedApiOutput"], () => require("./getManagedApi"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:connections/apiConnection:ApiConnection":
                return new ApiConnection(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "connections/apiConnection", _module)

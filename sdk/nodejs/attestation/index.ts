// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetProviderArgs, GetProviderResult, GetProviderOutputArgs } from "./getProvider";
export const getProvider: typeof import("./getProvider").getProvider = null as any;
export const getProviderOutput: typeof import("./getProvider").getProviderOutput = null as any;
utilities.lazyLoad(exports, ["getProvider","getProviderOutput"], () => require("./getProvider"));

export { ProviderArgs, ProviderState } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:attestation/provider:Provider":
                return new Provider(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "attestation/provider", _module)

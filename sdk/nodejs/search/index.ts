// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { ServiceArgs, ServiceState } from "./service";
export type Service = import("./service").Service;
export const Service: typeof import("./service").Service = null as any;
utilities.lazyLoad(exports, ["Service"], () => require("./service"));

export { SharedPrivateLinkServiceArgs, SharedPrivateLinkServiceState } from "./sharedPrivateLinkService";
export type SharedPrivateLinkService = import("./sharedPrivateLinkService").SharedPrivateLinkService;
export const SharedPrivateLinkService: typeof import("./sharedPrivateLinkService").SharedPrivateLinkService = null as any;
utilities.lazyLoad(exports, ["SharedPrivateLinkService"], () => require("./sharedPrivateLinkService"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:search/service:Service":
                return new Service(name, <any>undefined, { urn })
            case "azure:search/sharedPrivateLinkService:SharedPrivateLinkService":
                return new SharedPrivateLinkService(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "search/service", _module)
pulumi.runtime.registerResourceModule("azure", "search/sharedPrivateLinkService", _module)

// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ServicesCommunicationsGatewayArgs, ServicesCommunicationsGatewayState } from "./servicesCommunicationsGateway";
export type ServicesCommunicationsGateway = import("./servicesCommunicationsGateway").ServicesCommunicationsGateway;
export const ServicesCommunicationsGateway: typeof import("./servicesCommunicationsGateway").ServicesCommunicationsGateway = null as any;
utilities.lazyLoad(exports, ["ServicesCommunicationsGateway"], () => require("./servicesCommunicationsGateway"));

export { ServicesCommunicationsGatewayTestLineArgs, ServicesCommunicationsGatewayTestLineState } from "./servicesCommunicationsGatewayTestLine";
export type ServicesCommunicationsGatewayTestLine = import("./servicesCommunicationsGatewayTestLine").ServicesCommunicationsGatewayTestLine;
export const ServicesCommunicationsGatewayTestLine: typeof import("./servicesCommunicationsGatewayTestLine").ServicesCommunicationsGatewayTestLine = null as any;
utilities.lazyLoad(exports, ["ServicesCommunicationsGatewayTestLine"], () => require("./servicesCommunicationsGatewayTestLine"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:voice/servicesCommunicationsGateway:ServicesCommunicationsGateway":
                return new ServicesCommunicationsGateway(name, <any>undefined, { urn })
            case "azure:voice/servicesCommunicationsGatewayTestLine:ServicesCommunicationsGatewayTestLine":
                return new ServicesCommunicationsGatewayTestLine(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "voice/servicesCommunicationsGateway", _module)
pulumi.runtime.registerResourceModule("azure", "voice/servicesCommunicationsGatewayTestLine", _module)

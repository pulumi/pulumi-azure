// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { EmailServiceArgs, EmailServiceState } from "./emailService";
export type EmailService = import("./emailService").EmailService;
export const EmailService: typeof import("./emailService").EmailService = null as any;
utilities.lazyLoad(exports, ["EmailService"], () => require("./emailService"));

export { EmailServiceDomainArgs, EmailServiceDomainState } from "./emailServiceDomain";
export type EmailServiceDomain = import("./emailServiceDomain").EmailServiceDomain;
export const EmailServiceDomain: typeof import("./emailServiceDomain").EmailServiceDomain = null as any;
utilities.lazyLoad(exports, ["EmailServiceDomain"], () => require("./emailServiceDomain"));

export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { ServiceArgs, ServiceState } from "./service";
export type Service = import("./service").Service;
export const Service: typeof import("./service").Service = null as any;
utilities.lazyLoad(exports, ["Service"], () => require("./service"));

export { ServiceEmailDomainAssociationArgs, ServiceEmailDomainAssociationState } from "./serviceEmailDomainAssociation";
export type ServiceEmailDomainAssociation = import("./serviceEmailDomainAssociation").ServiceEmailDomainAssociation;
export const ServiceEmailDomainAssociation: typeof import("./serviceEmailDomainAssociation").ServiceEmailDomainAssociation = null as any;
utilities.lazyLoad(exports, ["ServiceEmailDomainAssociation"], () => require("./serviceEmailDomainAssociation"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:communication/emailService:EmailService":
                return new EmailService(name, <any>undefined, { urn })
            case "azure:communication/emailServiceDomain:EmailServiceDomain":
                return new EmailServiceDomain(name, <any>undefined, { urn })
            case "azure:communication/service:Service":
                return new Service(name, <any>undefined, { urn })
            case "azure:communication/serviceEmailDomainAssociation:ServiceEmailDomainAssociation":
                return new ServiceEmailDomainAssociation(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "communication/emailService", _module)
pulumi.runtime.registerResourceModule("azure", "communication/emailServiceDomain", _module)
pulumi.runtime.registerResourceModule("azure", "communication/service", _module)
pulumi.runtime.registerResourceModule("azure", "communication/serviceEmailDomainAssociation", _module)

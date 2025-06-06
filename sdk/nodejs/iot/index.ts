// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { CertificateArgs, CertificateState } from "./certificate";
export type Certificate = import("./certificate").Certificate;
export const Certificate: typeof import("./certificate").Certificate = null as any;
utilities.lazyLoad(exports, ["Certificate"], () => require("./certificate"));

export { ConsumerGroupArgs, ConsumerGroupState } from "./consumerGroup";
export type ConsumerGroup = import("./consumerGroup").ConsumerGroup;
export const ConsumerGroup: typeof import("./consumerGroup").ConsumerGroup = null as any;
utilities.lazyLoad(exports, ["ConsumerGroup"], () => require("./consumerGroup"));

export { DpsSharedAccessPolicyArgs, DpsSharedAccessPolicyState } from "./dpsSharedAccessPolicy";
export type DpsSharedAccessPolicy = import("./dpsSharedAccessPolicy").DpsSharedAccessPolicy;
export const DpsSharedAccessPolicy: typeof import("./dpsSharedAccessPolicy").DpsSharedAccessPolicy = null as any;
utilities.lazyLoad(exports, ["DpsSharedAccessPolicy"], () => require("./dpsSharedAccessPolicy"));

export { EndpointCosmosdbAccountArgs, EndpointCosmosdbAccountState } from "./endpointCosmosdbAccount";
export type EndpointCosmosdbAccount = import("./endpointCosmosdbAccount").EndpointCosmosdbAccount;
export const EndpointCosmosdbAccount: typeof import("./endpointCosmosdbAccount").EndpointCosmosdbAccount = null as any;
utilities.lazyLoad(exports, ["EndpointCosmosdbAccount"], () => require("./endpointCosmosdbAccount"));

export { EndpointEventhubArgs, EndpointEventhubState } from "./endpointEventhub";
export type EndpointEventhub = import("./endpointEventhub").EndpointEventhub;
export const EndpointEventhub: typeof import("./endpointEventhub").EndpointEventhub = null as any;
utilities.lazyLoad(exports, ["EndpointEventhub"], () => require("./endpointEventhub"));

export { EndpointServicebusQueueArgs, EndpointServicebusQueueState } from "./endpointServicebusQueue";
export type EndpointServicebusQueue = import("./endpointServicebusQueue").EndpointServicebusQueue;
export const EndpointServicebusQueue: typeof import("./endpointServicebusQueue").EndpointServicebusQueue = null as any;
utilities.lazyLoad(exports, ["EndpointServicebusQueue"], () => require("./endpointServicebusQueue"));

export { EndpointServicebusTopicArgs, EndpointServicebusTopicState } from "./endpointServicebusTopic";
export type EndpointServicebusTopic = import("./endpointServicebusTopic").EndpointServicebusTopic;
export const EndpointServicebusTopic: typeof import("./endpointServicebusTopic").EndpointServicebusTopic = null as any;
utilities.lazyLoad(exports, ["EndpointServicebusTopic"], () => require("./endpointServicebusTopic"));

export { EndpointStorageContainerArgs, EndpointStorageContainerState } from "./endpointStorageContainer";
export type EndpointStorageContainer = import("./endpointStorageContainer").EndpointStorageContainer;
export const EndpointStorageContainer: typeof import("./endpointStorageContainer").EndpointStorageContainer = null as any;
utilities.lazyLoad(exports, ["EndpointStorageContainer"], () => require("./endpointStorageContainer"));

export { EnrichmentArgs, EnrichmentState } from "./enrichment";
export type Enrichment = import("./enrichment").Enrichment;
export const Enrichment: typeof import("./enrichment").Enrichment = null as any;
utilities.lazyLoad(exports, ["Enrichment"], () => require("./enrichment"));

export { FallbackRouteArgs, FallbackRouteState } from "./fallbackRoute";
export type FallbackRoute = import("./fallbackRoute").FallbackRoute;
export const FallbackRoute: typeof import("./fallbackRoute").FallbackRoute = null as any;
utilities.lazyLoad(exports, ["FallbackRoute"], () => require("./fallbackRoute"));

export { FileUploadArgs, FileUploadState } from "./fileUpload";
export type FileUpload = import("./fileUpload").FileUpload;
export const FileUpload: typeof import("./fileUpload").FileUpload = null as any;
utilities.lazyLoad(exports, ["FileUpload"], () => require("./fileUpload"));

export { GetDpsArgs, GetDpsResult, GetDpsOutputArgs } from "./getDps";
export const getDps: typeof import("./getDps").getDps = null as any;
export const getDpsOutput: typeof import("./getDps").getDpsOutput = null as any;
utilities.lazyLoad(exports, ["getDps","getDpsOutput"], () => require("./getDps"));

export { GetDpsSharedAccessPolicyArgs, GetDpsSharedAccessPolicyResult, GetDpsSharedAccessPolicyOutputArgs } from "./getDpsSharedAccessPolicy";
export const getDpsSharedAccessPolicy: typeof import("./getDpsSharedAccessPolicy").getDpsSharedAccessPolicy = null as any;
export const getDpsSharedAccessPolicyOutput: typeof import("./getDpsSharedAccessPolicy").getDpsSharedAccessPolicyOutput = null as any;
utilities.lazyLoad(exports, ["getDpsSharedAccessPolicy","getDpsSharedAccessPolicyOutput"], () => require("./getDpsSharedAccessPolicy"));

export { GetIotHubArgs, GetIotHubResult, GetIotHubOutputArgs } from "./getIotHub";
export const getIotHub: typeof import("./getIotHub").getIotHub = null as any;
export const getIotHubOutput: typeof import("./getIotHub").getIotHubOutput = null as any;
utilities.lazyLoad(exports, ["getIotHub","getIotHubOutput"], () => require("./getIotHub"));

export { GetSharedAccessPolicyArgs, GetSharedAccessPolicyResult, GetSharedAccessPolicyOutputArgs } from "./getSharedAccessPolicy";
export const getSharedAccessPolicy: typeof import("./getSharedAccessPolicy").getSharedAccessPolicy = null as any;
export const getSharedAccessPolicyOutput: typeof import("./getSharedAccessPolicy").getSharedAccessPolicyOutput = null as any;
utilities.lazyLoad(exports, ["getSharedAccessPolicy","getSharedAccessPolicyOutput"], () => require("./getSharedAccessPolicy"));

export { IoTHubArgs, IoTHubState } from "./ioTHub";
export type IoTHub = import("./ioTHub").IoTHub;
export const IoTHub: typeof import("./ioTHub").IoTHub = null as any;
utilities.lazyLoad(exports, ["IoTHub"], () => require("./ioTHub"));

export { IotHubCertificateArgs, IotHubCertificateState } from "./iotHubCertificate";
export type IotHubCertificate = import("./iotHubCertificate").IotHubCertificate;
export const IotHubCertificate: typeof import("./iotHubCertificate").IotHubCertificate = null as any;
utilities.lazyLoad(exports, ["IotHubCertificate"], () => require("./iotHubCertificate"));

export { IotHubDeviceUpdateAccountArgs, IotHubDeviceUpdateAccountState } from "./iotHubDeviceUpdateAccount";
export type IotHubDeviceUpdateAccount = import("./iotHubDeviceUpdateAccount").IotHubDeviceUpdateAccount;
export const IotHubDeviceUpdateAccount: typeof import("./iotHubDeviceUpdateAccount").IotHubDeviceUpdateAccount = null as any;
utilities.lazyLoad(exports, ["IotHubDeviceUpdateAccount"], () => require("./iotHubDeviceUpdateAccount"));

export { IotHubDeviceUpdateInstanceArgs, IotHubDeviceUpdateInstanceState } from "./iotHubDeviceUpdateInstance";
export type IotHubDeviceUpdateInstance = import("./iotHubDeviceUpdateInstance").IotHubDeviceUpdateInstance;
export const IotHubDeviceUpdateInstance: typeof import("./iotHubDeviceUpdateInstance").IotHubDeviceUpdateInstance = null as any;
utilities.lazyLoad(exports, ["IotHubDeviceUpdateInstance"], () => require("./iotHubDeviceUpdateInstance"));

export { IotHubDpsArgs, IotHubDpsState } from "./iotHubDps";
export type IotHubDps = import("./iotHubDps").IotHubDps;
export const IotHubDps: typeof import("./iotHubDps").IotHubDps = null as any;
utilities.lazyLoad(exports, ["IotHubDps"], () => require("./iotHubDps"));

export { RouteArgs, RouteState } from "./route";
export type Route = import("./route").Route;
export const Route: typeof import("./route").Route = null as any;
utilities.lazyLoad(exports, ["Route"], () => require("./route"));

export { SecurityDeviceGroupArgs, SecurityDeviceGroupState } from "./securityDeviceGroup";
export type SecurityDeviceGroup = import("./securityDeviceGroup").SecurityDeviceGroup;
export const SecurityDeviceGroup: typeof import("./securityDeviceGroup").SecurityDeviceGroup = null as any;
utilities.lazyLoad(exports, ["SecurityDeviceGroup"], () => require("./securityDeviceGroup"));

export { SecuritySolutionArgs, SecuritySolutionState } from "./securitySolution";
export type SecuritySolution = import("./securitySolution").SecuritySolution;
export const SecuritySolution: typeof import("./securitySolution").SecuritySolution = null as any;
utilities.lazyLoad(exports, ["SecuritySolution"], () => require("./securitySolution"));

export { SharedAccessPolicyArgs, SharedAccessPolicyState } from "./sharedAccessPolicy";
export type SharedAccessPolicy = import("./sharedAccessPolicy").SharedAccessPolicy;
export const SharedAccessPolicy: typeof import("./sharedAccessPolicy").SharedAccessPolicy = null as any;
utilities.lazyLoad(exports, ["SharedAccessPolicy"], () => require("./sharedAccessPolicy"));

export * from "./zMixins";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:iot/certificate:Certificate":
                return new Certificate(name, <any>undefined, { urn })
            case "azure:iot/consumerGroup:ConsumerGroup":
                return new ConsumerGroup(name, <any>undefined, { urn })
            case "azure:iot/dpsSharedAccessPolicy:DpsSharedAccessPolicy":
                return new DpsSharedAccessPolicy(name, <any>undefined, { urn })
            case "azure:iot/endpointCosmosdbAccount:EndpointCosmosdbAccount":
                return new EndpointCosmosdbAccount(name, <any>undefined, { urn })
            case "azure:iot/endpointEventhub:EndpointEventhub":
                return new EndpointEventhub(name, <any>undefined, { urn })
            case "azure:iot/endpointServicebusQueue:EndpointServicebusQueue":
                return new EndpointServicebusQueue(name, <any>undefined, { urn })
            case "azure:iot/endpointServicebusTopic:EndpointServicebusTopic":
                return new EndpointServicebusTopic(name, <any>undefined, { urn })
            case "azure:iot/endpointStorageContainer:EndpointStorageContainer":
                return new EndpointStorageContainer(name, <any>undefined, { urn })
            case "azure:iot/enrichment:Enrichment":
                return new Enrichment(name, <any>undefined, { urn })
            case "azure:iot/fallbackRoute:FallbackRoute":
                return new FallbackRoute(name, <any>undefined, { urn })
            case "azure:iot/fileUpload:FileUpload":
                return new FileUpload(name, <any>undefined, { urn })
            case "azure:iot/ioTHub:IoTHub":
                return new IoTHub(name, <any>undefined, { urn })
            case "azure:iot/iotHubCertificate:IotHubCertificate":
                return new IotHubCertificate(name, <any>undefined, { urn })
            case "azure:iot/iotHubDeviceUpdateAccount:IotHubDeviceUpdateAccount":
                return new IotHubDeviceUpdateAccount(name, <any>undefined, { urn })
            case "azure:iot/iotHubDeviceUpdateInstance:IotHubDeviceUpdateInstance":
                return new IotHubDeviceUpdateInstance(name, <any>undefined, { urn })
            case "azure:iot/iotHubDps:IotHubDps":
                return new IotHubDps(name, <any>undefined, { urn })
            case "azure:iot/route:Route":
                return new Route(name, <any>undefined, { urn })
            case "azure:iot/securityDeviceGroup:SecurityDeviceGroup":
                return new SecurityDeviceGroup(name, <any>undefined, { urn })
            case "azure:iot/securitySolution:SecuritySolution":
                return new SecuritySolution(name, <any>undefined, { urn })
            case "azure:iot/sharedAccessPolicy:SharedAccessPolicy":
                return new SharedAccessPolicy(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "iot/certificate", _module)
pulumi.runtime.registerResourceModule("azure", "iot/consumerGroup", _module)
pulumi.runtime.registerResourceModule("azure", "iot/dpsSharedAccessPolicy", _module)
pulumi.runtime.registerResourceModule("azure", "iot/endpointCosmosdbAccount", _module)
pulumi.runtime.registerResourceModule("azure", "iot/endpointEventhub", _module)
pulumi.runtime.registerResourceModule("azure", "iot/endpointServicebusQueue", _module)
pulumi.runtime.registerResourceModule("azure", "iot/endpointServicebusTopic", _module)
pulumi.runtime.registerResourceModule("azure", "iot/endpointStorageContainer", _module)
pulumi.runtime.registerResourceModule("azure", "iot/enrichment", _module)
pulumi.runtime.registerResourceModule("azure", "iot/fallbackRoute", _module)
pulumi.runtime.registerResourceModule("azure", "iot/fileUpload", _module)
pulumi.runtime.registerResourceModule("azure", "iot/ioTHub", _module)
pulumi.runtime.registerResourceModule("azure", "iot/iotHubCertificate", _module)
pulumi.runtime.registerResourceModule("azure", "iot/iotHubDeviceUpdateAccount", _module)
pulumi.runtime.registerResourceModule("azure", "iot/iotHubDeviceUpdateInstance", _module)
pulumi.runtime.registerResourceModule("azure", "iot/iotHubDps", _module)
pulumi.runtime.registerResourceModule("azure", "iot/route", _module)
pulumi.runtime.registerResourceModule("azure", "iot/securityDeviceGroup", _module)
pulumi.runtime.registerResourceModule("azure", "iot/securitySolution", _module)
pulumi.runtime.registerResourceModule("azure", "iot/sharedAccessPolicy", _module)

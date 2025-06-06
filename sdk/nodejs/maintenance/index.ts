// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AssignmentDedicatedHostArgs, AssignmentDedicatedHostState } from "./assignmentDedicatedHost";
export type AssignmentDedicatedHost = import("./assignmentDedicatedHost").AssignmentDedicatedHost;
export const AssignmentDedicatedHost: typeof import("./assignmentDedicatedHost").AssignmentDedicatedHost = null as any;
utilities.lazyLoad(exports, ["AssignmentDedicatedHost"], () => require("./assignmentDedicatedHost"));

export { AssignmentDynamicScopeArgs, AssignmentDynamicScopeState } from "./assignmentDynamicScope";
export type AssignmentDynamicScope = import("./assignmentDynamicScope").AssignmentDynamicScope;
export const AssignmentDynamicScope: typeof import("./assignmentDynamicScope").AssignmentDynamicScope = null as any;
utilities.lazyLoad(exports, ["AssignmentDynamicScope"], () => require("./assignmentDynamicScope"));

export { AssignmentVirtualMachineArgs, AssignmentVirtualMachineState } from "./assignmentVirtualMachine";
export type AssignmentVirtualMachine = import("./assignmentVirtualMachine").AssignmentVirtualMachine;
export const AssignmentVirtualMachine: typeof import("./assignmentVirtualMachine").AssignmentVirtualMachine = null as any;
utilities.lazyLoad(exports, ["AssignmentVirtualMachine"], () => require("./assignmentVirtualMachine"));

export { AssignmentVirtualMachineScaleSetArgs, AssignmentVirtualMachineScaleSetState } from "./assignmentVirtualMachineScaleSet";
export type AssignmentVirtualMachineScaleSet = import("./assignmentVirtualMachineScaleSet").AssignmentVirtualMachineScaleSet;
export const AssignmentVirtualMachineScaleSet: typeof import("./assignmentVirtualMachineScaleSet").AssignmentVirtualMachineScaleSet = null as any;
utilities.lazyLoad(exports, ["AssignmentVirtualMachineScaleSet"], () => require("./assignmentVirtualMachineScaleSet"));

export { ConfigurationArgs, ConfigurationState } from "./configuration";
export type Configuration = import("./configuration").Configuration;
export const Configuration: typeof import("./configuration").Configuration = null as any;
utilities.lazyLoad(exports, ["Configuration"], () => require("./configuration"));

export { GetConfigurationArgs, GetConfigurationResult, GetConfigurationOutputArgs } from "./getConfiguration";
export const getConfiguration: typeof import("./getConfiguration").getConfiguration = null as any;
export const getConfigurationOutput: typeof import("./getConfiguration").getConfigurationOutput = null as any;
utilities.lazyLoad(exports, ["getConfiguration","getConfigurationOutput"], () => require("./getConfiguration"));

export { GetPublicConfigurationsArgs, GetPublicConfigurationsResult, GetPublicConfigurationsOutputArgs } from "./getPublicConfigurations";
export const getPublicConfigurations: typeof import("./getPublicConfigurations").getPublicConfigurations = null as any;
export const getPublicConfigurationsOutput: typeof import("./getPublicConfigurations").getPublicConfigurationsOutput = null as any;
utilities.lazyLoad(exports, ["getPublicConfigurations","getPublicConfigurationsOutput"], () => require("./getPublicConfigurations"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:maintenance/assignmentDedicatedHost:AssignmentDedicatedHost":
                return new AssignmentDedicatedHost(name, <any>undefined, { urn })
            case "azure:maintenance/assignmentDynamicScope:AssignmentDynamicScope":
                return new AssignmentDynamicScope(name, <any>undefined, { urn })
            case "azure:maintenance/assignmentVirtualMachine:AssignmentVirtualMachine":
                return new AssignmentVirtualMachine(name, <any>undefined, { urn })
            case "azure:maintenance/assignmentVirtualMachineScaleSet:AssignmentVirtualMachineScaleSet":
                return new AssignmentVirtualMachineScaleSet(name, <any>undefined, { urn })
            case "azure:maintenance/configuration:Configuration":
                return new Configuration(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "maintenance/assignmentDedicatedHost", _module)
pulumi.runtime.registerResourceModule("azure", "maintenance/assignmentDynamicScope", _module)
pulumi.runtime.registerResourceModule("azure", "maintenance/assignmentVirtualMachine", _module)
pulumi.runtime.registerResourceModule("azure", "maintenance/assignmentVirtualMachineScaleSet", _module)
pulumi.runtime.registerResourceModule("azure", "maintenance/configuration", _module)

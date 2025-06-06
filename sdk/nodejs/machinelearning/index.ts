// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ComputeClusterArgs, ComputeClusterState } from "./computeCluster";
export type ComputeCluster = import("./computeCluster").ComputeCluster;
export const ComputeCluster: typeof import("./computeCluster").ComputeCluster = null as any;
utilities.lazyLoad(exports, ["ComputeCluster"], () => require("./computeCluster"));

export { ComputeInstanceArgs, ComputeInstanceState } from "./computeInstance";
export type ComputeInstance = import("./computeInstance").ComputeInstance;
export const ComputeInstance: typeof import("./computeInstance").ComputeInstance = null as any;
utilities.lazyLoad(exports, ["ComputeInstance"], () => require("./computeInstance"));

export { DatastoreBlobstorageArgs, DatastoreBlobstorageState } from "./datastoreBlobstorage";
export type DatastoreBlobstorage = import("./datastoreBlobstorage").DatastoreBlobstorage;
export const DatastoreBlobstorage: typeof import("./datastoreBlobstorage").DatastoreBlobstorage = null as any;
utilities.lazyLoad(exports, ["DatastoreBlobstorage"], () => require("./datastoreBlobstorage"));

export { DatastoreDatalakeGen2Args, DatastoreDatalakeGen2State } from "./datastoreDatalakeGen2";
export type DatastoreDatalakeGen2 = import("./datastoreDatalakeGen2").DatastoreDatalakeGen2;
export const DatastoreDatalakeGen2: typeof import("./datastoreDatalakeGen2").DatastoreDatalakeGen2 = null as any;
utilities.lazyLoad(exports, ["DatastoreDatalakeGen2"], () => require("./datastoreDatalakeGen2"));

export { DatastoreFileshareArgs, DatastoreFileshareState } from "./datastoreFileshare";
export type DatastoreFileshare = import("./datastoreFileshare").DatastoreFileshare;
export const DatastoreFileshare: typeof import("./datastoreFileshare").DatastoreFileshare = null as any;
utilities.lazyLoad(exports, ["DatastoreFileshare"], () => require("./datastoreFileshare"));

export { GetWorkspaceArgs, GetWorkspaceResult, GetWorkspaceOutputArgs } from "./getWorkspace";
export const getWorkspace: typeof import("./getWorkspace").getWorkspace = null as any;
export const getWorkspaceOutput: typeof import("./getWorkspace").getWorkspaceOutput = null as any;
utilities.lazyLoad(exports, ["getWorkspace","getWorkspaceOutput"], () => require("./getWorkspace"));

export { InferenceClusterArgs, InferenceClusterState } from "./inferenceCluster";
export type InferenceCluster = import("./inferenceCluster").InferenceCluster;
export const InferenceCluster: typeof import("./inferenceCluster").InferenceCluster = null as any;
utilities.lazyLoad(exports, ["InferenceCluster"], () => require("./inferenceCluster"));

export { SynapseSparkArgs, SynapseSparkState } from "./synapseSpark";
export type SynapseSpark = import("./synapseSpark").SynapseSpark;
export const SynapseSpark: typeof import("./synapseSpark").SynapseSpark = null as any;
utilities.lazyLoad(exports, ["SynapseSpark"], () => require("./synapseSpark"));

export { WorkspaceArgs, WorkspaceState } from "./workspace";
export type Workspace = import("./workspace").Workspace;
export const Workspace: typeof import("./workspace").Workspace = null as any;
utilities.lazyLoad(exports, ["Workspace"], () => require("./workspace"));

export { WorkspaceNetworkOutboundRuleFqdnArgs, WorkspaceNetworkOutboundRuleFqdnState } from "./workspaceNetworkOutboundRuleFqdn";
export type WorkspaceNetworkOutboundRuleFqdn = import("./workspaceNetworkOutboundRuleFqdn").WorkspaceNetworkOutboundRuleFqdn;
export const WorkspaceNetworkOutboundRuleFqdn: typeof import("./workspaceNetworkOutboundRuleFqdn").WorkspaceNetworkOutboundRuleFqdn = null as any;
utilities.lazyLoad(exports, ["WorkspaceNetworkOutboundRuleFqdn"], () => require("./workspaceNetworkOutboundRuleFqdn"));

export { WorkspaceNetworkOutboundRulePrivateEndpointArgs, WorkspaceNetworkOutboundRulePrivateEndpointState } from "./workspaceNetworkOutboundRulePrivateEndpoint";
export type WorkspaceNetworkOutboundRulePrivateEndpoint = import("./workspaceNetworkOutboundRulePrivateEndpoint").WorkspaceNetworkOutboundRulePrivateEndpoint;
export const WorkspaceNetworkOutboundRulePrivateEndpoint: typeof import("./workspaceNetworkOutboundRulePrivateEndpoint").WorkspaceNetworkOutboundRulePrivateEndpoint = null as any;
utilities.lazyLoad(exports, ["WorkspaceNetworkOutboundRulePrivateEndpoint"], () => require("./workspaceNetworkOutboundRulePrivateEndpoint"));

export { WorkspaceNetworkOutboundRuleServiceTagArgs, WorkspaceNetworkOutboundRuleServiceTagState } from "./workspaceNetworkOutboundRuleServiceTag";
export type WorkspaceNetworkOutboundRuleServiceTag = import("./workspaceNetworkOutboundRuleServiceTag").WorkspaceNetworkOutboundRuleServiceTag;
export const WorkspaceNetworkOutboundRuleServiceTag: typeof import("./workspaceNetworkOutboundRuleServiceTag").WorkspaceNetworkOutboundRuleServiceTag = null as any;
utilities.lazyLoad(exports, ["WorkspaceNetworkOutboundRuleServiceTag"], () => require("./workspaceNetworkOutboundRuleServiceTag"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:machinelearning/computeCluster:ComputeCluster":
                return new ComputeCluster(name, <any>undefined, { urn })
            case "azure:machinelearning/computeInstance:ComputeInstance":
                return new ComputeInstance(name, <any>undefined, { urn })
            case "azure:machinelearning/datastoreBlobstorage:DatastoreBlobstorage":
                return new DatastoreBlobstorage(name, <any>undefined, { urn })
            case "azure:machinelearning/datastoreDatalakeGen2:DatastoreDatalakeGen2":
                return new DatastoreDatalakeGen2(name, <any>undefined, { urn })
            case "azure:machinelearning/datastoreFileshare:DatastoreFileshare":
                return new DatastoreFileshare(name, <any>undefined, { urn })
            case "azure:machinelearning/inferenceCluster:InferenceCluster":
                return new InferenceCluster(name, <any>undefined, { urn })
            case "azure:machinelearning/synapseSpark:SynapseSpark":
                return new SynapseSpark(name, <any>undefined, { urn })
            case "azure:machinelearning/workspace:Workspace":
                return new Workspace(name, <any>undefined, { urn })
            case "azure:machinelearning/workspaceNetworkOutboundRuleFqdn:WorkspaceNetworkOutboundRuleFqdn":
                return new WorkspaceNetworkOutboundRuleFqdn(name, <any>undefined, { urn })
            case "azure:machinelearning/workspaceNetworkOutboundRulePrivateEndpoint:WorkspaceNetworkOutboundRulePrivateEndpoint":
                return new WorkspaceNetworkOutboundRulePrivateEndpoint(name, <any>undefined, { urn })
            case "azure:machinelearning/workspaceNetworkOutboundRuleServiceTag:WorkspaceNetworkOutboundRuleServiceTag":
                return new WorkspaceNetworkOutboundRuleServiceTag(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "machinelearning/computeCluster", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/computeInstance", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/datastoreBlobstorage", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/datastoreDatalakeGen2", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/datastoreFileshare", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/inferenceCluster", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/synapseSpark", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/workspace", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/workspaceNetworkOutboundRuleFqdn", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/workspaceNetworkOutboundRulePrivateEndpoint", _module)
pulumi.runtime.registerResourceModule("azure", "machinelearning/workspaceNetworkOutboundRuleServiceTag", _module)

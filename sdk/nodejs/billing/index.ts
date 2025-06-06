// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AccountCostManagementExportArgs, AccountCostManagementExportState } from "./accountCostManagementExport";
export type AccountCostManagementExport = import("./accountCostManagementExport").AccountCostManagementExport;
export const AccountCostManagementExport: typeof import("./accountCostManagementExport").AccountCostManagementExport = null as any;
utilities.lazyLoad(exports, ["AccountCostManagementExport"], () => require("./accountCostManagementExport"));

export { GetEnrollmentAccountScopeArgs, GetEnrollmentAccountScopeResult, GetEnrollmentAccountScopeOutputArgs } from "./getEnrollmentAccountScope";
export const getEnrollmentAccountScope: typeof import("./getEnrollmentAccountScope").getEnrollmentAccountScope = null as any;
export const getEnrollmentAccountScopeOutput: typeof import("./getEnrollmentAccountScope").getEnrollmentAccountScopeOutput = null as any;
utilities.lazyLoad(exports, ["getEnrollmentAccountScope","getEnrollmentAccountScopeOutput"], () => require("./getEnrollmentAccountScope"));

export { GetMcaAccountScopeArgs, GetMcaAccountScopeResult, GetMcaAccountScopeOutputArgs } from "./getMcaAccountScope";
export const getMcaAccountScope: typeof import("./getMcaAccountScope").getMcaAccountScope = null as any;
export const getMcaAccountScopeOutput: typeof import("./getMcaAccountScope").getMcaAccountScopeOutput = null as any;
utilities.lazyLoad(exports, ["getMcaAccountScope","getMcaAccountScopeOutput"], () => require("./getMcaAccountScope"));

export { GetMpaAccountScopeArgs, GetMpaAccountScopeResult, GetMpaAccountScopeOutputArgs } from "./getMpaAccountScope";
export const getMpaAccountScope: typeof import("./getMpaAccountScope").getMpaAccountScope = null as any;
export const getMpaAccountScopeOutput: typeof import("./getMpaAccountScope").getMpaAccountScopeOutput = null as any;
utilities.lazyLoad(exports, ["getMpaAccountScope","getMpaAccountScopeOutput"], () => require("./getMpaAccountScope"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:billing/accountCostManagementExport:AccountCostManagementExport":
                return new AccountCostManagementExport(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "billing/accountCostManagementExport", _module)

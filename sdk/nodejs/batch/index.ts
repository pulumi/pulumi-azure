// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AccountArgs, AccountState } from "./account";
export type Account = import("./account").Account;
export const Account: typeof import("./account").Account = null as any;
utilities.lazyLoad(exports, ["Account"], () => require("./account"));

export { ApplicationArgs, ApplicationState } from "./application";
export type Application = import("./application").Application;
export const Application: typeof import("./application").Application = null as any;
utilities.lazyLoad(exports, ["Application"], () => require("./application"));

export { CertificateArgs, CertificateState } from "./certificate";
export type Certificate = import("./certificate").Certificate;
export const Certificate: typeof import("./certificate").Certificate = null as any;
utilities.lazyLoad(exports, ["Certificate"], () => require("./certificate"));

export { GetAccountArgs, GetAccountResult, GetAccountOutputArgs } from "./getAccount";
export const getAccount: typeof import("./getAccount").getAccount = null as any;
export const getAccountOutput: typeof import("./getAccount").getAccountOutput = null as any;
utilities.lazyLoad(exports, ["getAccount","getAccountOutput"], () => require("./getAccount"));

export { GetApplicationArgs, GetApplicationResult, GetApplicationOutputArgs } from "./getApplication";
export const getApplication: typeof import("./getApplication").getApplication = null as any;
export const getApplicationOutput: typeof import("./getApplication").getApplicationOutput = null as any;
utilities.lazyLoad(exports, ["getApplication","getApplicationOutput"], () => require("./getApplication"));

export { GetCertificateArgs, GetCertificateResult, GetCertificateOutputArgs } from "./getCertificate";
export const getCertificate: typeof import("./getCertificate").getCertificate = null as any;
export const getCertificateOutput: typeof import("./getCertificate").getCertificateOutput = null as any;
utilities.lazyLoad(exports, ["getCertificate","getCertificateOutput"], () => require("./getCertificate"));

export { GetPoolArgs, GetPoolResult, GetPoolOutputArgs } from "./getPool";
export const getPool: typeof import("./getPool").getPool = null as any;
export const getPoolOutput: typeof import("./getPool").getPoolOutput = null as any;
utilities.lazyLoad(exports, ["getPool","getPoolOutput"], () => require("./getPool"));

export { JobArgs, JobState } from "./job";
export type Job = import("./job").Job;
export const Job: typeof import("./job").Job = null as any;
utilities.lazyLoad(exports, ["Job"], () => require("./job"));

export { PoolArgs, PoolState } from "./pool";
export type Pool = import("./pool").Pool;
export const Pool: typeof import("./pool").Pool = null as any;
utilities.lazyLoad(exports, ["Pool"], () => require("./pool"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:batch/account:Account":
                return new Account(name, <any>undefined, { urn })
            case "azure:batch/application:Application":
                return new Application(name, <any>undefined, { urn })
            case "azure:batch/certificate:Certificate":
                return new Certificate(name, <any>undefined, { urn })
            case "azure:batch/job:Job":
                return new Job(name, <any>undefined, { urn })
            case "azure:batch/pool:Pool":
                return new Pool(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "batch/account", _module)
pulumi.runtime.registerResourceModule("azure", "batch/application", _module)
pulumi.runtime.registerResourceModule("azure", "batch/certificate", _module)
pulumi.runtime.registerResourceModule("azure", "batch/job", _module)
pulumi.runtime.registerResourceModule("azure", "batch/pool", _module)

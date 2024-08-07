// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ActiveDirectoryAdministratorArgs, ActiveDirectoryAdministratorState } from "./activeDirectoryAdministrator";
export type ActiveDirectoryAdministrator = import("./activeDirectoryAdministrator").ActiveDirectoryAdministrator;
export const ActiveDirectoryAdministrator: typeof import("./activeDirectoryAdministrator").ActiveDirectoryAdministrator = null as any;
utilities.lazyLoad(exports, ["ActiveDirectoryAdministrator"], () => require("./activeDirectoryAdministrator"));

export { DatabaseArgs, DatabaseState } from "./database";
export type Database = import("./database").Database;
export const Database: typeof import("./database").Database = null as any;
utilities.lazyLoad(exports, ["Database"], () => require("./database"));

export { ElasticPoolArgs, ElasticPoolState } from "./elasticPool";
export type ElasticPool = import("./elasticPool").ElasticPool;
export const ElasticPool: typeof import("./elasticPool").ElasticPool = null as any;
utilities.lazyLoad(exports, ["ElasticPool"], () => require("./elasticPool"));

export { FailoverGroupArgs, FailoverGroupState } from "./failoverGroup";
export type FailoverGroup = import("./failoverGroup").FailoverGroup;
export const FailoverGroup: typeof import("./failoverGroup").FailoverGroup = null as any;
utilities.lazyLoad(exports, ["FailoverGroup"], () => require("./failoverGroup"));

export { FirewallRuleArgs, FirewallRuleState } from "./firewallRule";
export type FirewallRule = import("./firewallRule").FirewallRule;
export const FirewallRule: typeof import("./firewallRule").FirewallRule = null as any;
utilities.lazyLoad(exports, ["FirewallRule"], () => require("./firewallRule"));

export { GetDatabaseArgs, GetDatabaseResult, GetDatabaseOutputArgs } from "./getDatabase";
export const getDatabase: typeof import("./getDatabase").getDatabase = null as any;
export const getDatabaseOutput: typeof import("./getDatabase").getDatabaseOutput = null as any;
utilities.lazyLoad(exports, ["getDatabase","getDatabaseOutput"], () => require("./getDatabase"));

export { GetServerArgs, GetServerResult, GetServerOutputArgs } from "./getServer";
export const getServer: typeof import("./getServer").getServer = null as any;
export const getServerOutput: typeof import("./getServer").getServerOutput = null as any;
utilities.lazyLoad(exports, ["getServer","getServerOutput"], () => require("./getServer"));

export { GetSqlManagedInstanceArgs, GetSqlManagedInstanceResult, GetSqlManagedInstanceOutputArgs } from "./getSqlManagedInstance";
export const getSqlManagedInstance: typeof import("./getSqlManagedInstance").getSqlManagedInstance = null as any;
export const getSqlManagedInstanceOutput: typeof import("./getSqlManagedInstance").getSqlManagedInstanceOutput = null as any;
utilities.lazyLoad(exports, ["getSqlManagedInstance","getSqlManagedInstanceOutput"], () => require("./getSqlManagedInstance"));

export { ManagedDatabaseArgs, ManagedDatabaseState } from "./managedDatabase";
export type ManagedDatabase = import("./managedDatabase").ManagedDatabase;
export const ManagedDatabase: typeof import("./managedDatabase").ManagedDatabase = null as any;
utilities.lazyLoad(exports, ["ManagedDatabase"], () => require("./managedDatabase"));

export { ManagedInstanceArgs, ManagedInstanceState } from "./managedInstance";
export type ManagedInstance = import("./managedInstance").ManagedInstance;
export const ManagedInstance: typeof import("./managedInstance").ManagedInstance = null as any;
utilities.lazyLoad(exports, ["ManagedInstance"], () => require("./managedInstance"));

export { ManagedInstanceActiveDirectoryAdministratorArgs, ManagedInstanceActiveDirectoryAdministratorState } from "./managedInstanceActiveDirectoryAdministrator";
export type ManagedInstanceActiveDirectoryAdministrator = import("./managedInstanceActiveDirectoryAdministrator").ManagedInstanceActiveDirectoryAdministrator;
export const ManagedInstanceActiveDirectoryAdministrator: typeof import("./managedInstanceActiveDirectoryAdministrator").ManagedInstanceActiveDirectoryAdministrator = null as any;
utilities.lazyLoad(exports, ["ManagedInstanceActiveDirectoryAdministrator"], () => require("./managedInstanceActiveDirectoryAdministrator"));

export { ManagedInstanceFailoverGroupArgs, ManagedInstanceFailoverGroupState } from "./managedInstanceFailoverGroup";
export type ManagedInstanceFailoverGroup = import("./managedInstanceFailoverGroup").ManagedInstanceFailoverGroup;
export const ManagedInstanceFailoverGroup: typeof import("./managedInstanceFailoverGroup").ManagedInstanceFailoverGroup = null as any;
utilities.lazyLoad(exports, ["ManagedInstanceFailoverGroup"], () => require("./managedInstanceFailoverGroup"));

export { SqlServerArgs, SqlServerState } from "./sqlServer";
export type SqlServer = import("./sqlServer").SqlServer;
export const SqlServer: typeof import("./sqlServer").SqlServer = null as any;
utilities.lazyLoad(exports, ["SqlServer"], () => require("./sqlServer"));

export { VirtualNetworkRuleArgs, VirtualNetworkRuleState } from "./virtualNetworkRule";
export type VirtualNetworkRule = import("./virtualNetworkRule").VirtualNetworkRule;
export const VirtualNetworkRule: typeof import("./virtualNetworkRule").VirtualNetworkRule = null as any;
utilities.lazyLoad(exports, ["VirtualNetworkRule"], () => require("./virtualNetworkRule"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:sql/activeDirectoryAdministrator:ActiveDirectoryAdministrator":
                return new ActiveDirectoryAdministrator(name, <any>undefined, { urn })
            case "azure:sql/database:Database":
                return new Database(name, <any>undefined, { urn })
            case "azure:sql/elasticPool:ElasticPool":
                return new ElasticPool(name, <any>undefined, { urn })
            case "azure:sql/failoverGroup:FailoverGroup":
                return new FailoverGroup(name, <any>undefined, { urn })
            case "azure:sql/firewallRule:FirewallRule":
                return new FirewallRule(name, <any>undefined, { urn })
            case "azure:sql/managedDatabase:ManagedDatabase":
                return new ManagedDatabase(name, <any>undefined, { urn })
            case "azure:sql/managedInstance:ManagedInstance":
                return new ManagedInstance(name, <any>undefined, { urn })
            case "azure:sql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator":
                return new ManagedInstanceActiveDirectoryAdministrator(name, <any>undefined, { urn })
            case "azure:sql/managedInstanceFailoverGroup:ManagedInstanceFailoverGroup":
                return new ManagedInstanceFailoverGroup(name, <any>undefined, { urn })
            case "azure:sql/sqlServer:SqlServer":
                return new SqlServer(name, <any>undefined, { urn })
            case "azure:sql/virtualNetworkRule:VirtualNetworkRule":
                return new VirtualNetworkRule(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "sql/activeDirectoryAdministrator", _module)
pulumi.runtime.registerResourceModule("azure", "sql/database", _module)
pulumi.runtime.registerResourceModule("azure", "sql/elasticPool", _module)
pulumi.runtime.registerResourceModule("azure", "sql/failoverGroup", _module)
pulumi.runtime.registerResourceModule("azure", "sql/firewallRule", _module)
pulumi.runtime.registerResourceModule("azure", "sql/managedDatabase", _module)
pulumi.runtime.registerResourceModule("azure", "sql/managedInstance", _module)
pulumi.runtime.registerResourceModule("azure", "sql/managedInstanceActiveDirectoryAdministrator", _module)
pulumi.runtime.registerResourceModule("azure", "sql/managedInstanceFailoverGroup", _module)
pulumi.runtime.registerResourceModule("azure", "sql/sqlServer", _module)
pulumi.runtime.registerResourceModule("azure", "sql/virtualNetworkRule", _module)

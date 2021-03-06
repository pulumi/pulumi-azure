// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./backupInstancePostgresql";
export * from "./backupPolicyPostgresql";
export * from "./backupVault";

// Import resources to register:
import { BackupInstancePostgresql } from "./backupInstancePostgresql";
import { BackupPolicyPostgresql } from "./backupPolicyPostgresql";
import { BackupVault } from "./backupVault";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:dataprotection/backupInstancePostgresql:BackupInstancePostgresql":
                return new BackupInstancePostgresql(name, <any>undefined, { urn })
            case "azure:dataprotection/backupPolicyPostgresql:BackupPolicyPostgresql":
                return new BackupPolicyPostgresql(name, <any>undefined, { urn })
            case "azure:dataprotection/backupVault:BackupVault":
                return new BackupVault(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "dataprotection/backupInstancePostgresql", _module)
pulumi.runtime.registerResourceModule("azure", "dataprotection/backupPolicyPostgresql", _module)
pulumi.runtime.registerResourceModule("azure", "dataprotection/backupVault", _module)

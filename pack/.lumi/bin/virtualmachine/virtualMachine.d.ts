import * as lumi from "@lumi/lumi";
export declare class VirtualMachine extends lumi.NamedResource implements VirtualMachineArgs {
    readonly availabilitySetId: string;
    readonly bootDiagnostics?: {
        enabled: boolean;
        storageUri: string;
    }[];
    readonly deleteDataDisksOnTermination?: boolean;
    readonly deleteOsDiskOnTermination?: boolean;
    readonly diagnosticsProfile?: {
        bootDiagnostics: {
            enabled: boolean;
            storageUri: string;
        }[];
    }[];
    readonly licenseType: string;
    readonly location: string;
    readonly virtualMachineName?: string;
    readonly networkInterfaceIds: string[];
    readonly osProfile?: {
        adminPassword: string;
        adminUsername: string;
        computerName: string;
        customData: string;
    }[];
    readonly osProfileLinuxConfig?: {
        disablePasswordAuthentication: boolean;
        sshKeys?: {
            keyData?: string;
            path: string;
        }[];
    }[];
    readonly osProfileSecrets?: {
        sourceVaultId: string;
        vaultCertificates?: {
            certificateStore?: string;
            certificateUrl: string;
        }[];
    }[];
    readonly osProfileWindowsConfig?: {
        additionalUnattendConfig?: {
            component: string;
            content: string;
            pass: string;
            settingName: string;
        }[];
        enableAutomaticUpgrades?: boolean;
        provisionVmAgent?: boolean;
        winrm?: {
            certificateUrl?: string;
            protocol: string;
        }[];
    }[];
    readonly plan?: {
        name: string;
        product: string;
        publisher: string;
    }[];
    readonly primaryNetworkInterfaceId?: string;
    readonly resourceGroupName: string;
    readonly storageDataDisk?: {
        caching: string;
        createOption: string;
        diskSizeGb: number;
        lun: number;
        managedDiskId: string;
        managedDiskType: string;
        name: string;
        vhdUri?: string;
    }[];
    readonly storageImageReference: {
        offer: string;
        publisher: string;
        sku: string;
        version: string;
    }[];
    readonly storageOsDisk: {
        caching: string;
        createOption: string;
        diskSizeGb?: number;
        imageUri?: string;
        managedDiskId: string;
        managedDiskType: string;
        name: string;
        osType?: string;
        vhdUri?: string;
    }[];
    readonly tags: {
        [key: string]: any;
    };
    readonly vmSize: string;
    constructor(name: string, args: VirtualMachineArgs);
}
export interface VirtualMachineArgs {
    readonly availabilitySetId?: string;
    readonly bootDiagnostics?: {
        enabled: boolean;
        storageUri: string;
    }[];
    readonly deleteDataDisksOnTermination?: boolean;
    readonly deleteOsDiskOnTermination?: boolean;
    readonly diagnosticsProfile?: {
        bootDiagnostics: {
            enabled: boolean;
            storageUri: string;
        }[];
    }[];
    readonly licenseType?: string;
    readonly location: string;
    readonly virtualMachineName?: string;
    readonly networkInterfaceIds: string[];
    readonly osProfile?: {
        adminPassword: string;
        adminUsername: string;
        computerName: string;
        customData: string;
    }[];
    readonly osProfileLinuxConfig?: {
        disablePasswordAuthentication: boolean;
        sshKeys?: {
            keyData?: string;
            path: string;
        }[];
    }[];
    readonly osProfileSecrets?: {
        sourceVaultId: string;
        vaultCertificates?: {
            certificateStore?: string;
            certificateUrl: string;
        }[];
    }[];
    readonly osProfileWindowsConfig?: {
        additionalUnattendConfig?: {
            component: string;
            content: string;
            pass: string;
            settingName: string;
        }[];
        enableAutomaticUpgrades?: boolean;
        provisionVmAgent?: boolean;
        winrm?: {
            certificateUrl?: string;
            protocol: string;
        }[];
    }[];
    readonly plan?: {
        name: string;
        product: string;
        publisher: string;
    }[];
    readonly primaryNetworkInterfaceId?: string;
    readonly resourceGroupName: string;
    readonly storageDataDisk?: {
        caching: string;
        createOption: string;
        diskSizeGb: number;
        lun: number;
        managedDiskId: string;
        managedDiskType: string;
        name: string;
        vhdUri?: string;
    }[];
    readonly storageImageReference?: {
        offer: string;
        publisher: string;
        sku: string;
        version: string;
    }[];
    readonly storageOsDisk: {
        caching: string;
        createOption: string;
        diskSizeGb?: number;
        imageUri?: string;
        managedDiskId: string;
        managedDiskType: string;
        name: string;
        osType?: string;
        vhdUri?: string;
    }[];
    readonly tags?: {
        [key: string]: any;
    };
    readonly vmSize: string;
}


import * as lumi from "@lumi/lumi";
export declare class ScaleSet extends lumi.NamedResource implements ScaleSetArgs {
    readonly extension?: {
        autoUpgradeMinorVersion?: boolean;
        name: string;
        protectedSettings?: string;
        publisher: string;
        settings?: string;
        type: string;
        typeHandlerVersion: string;
    }[];
    readonly location: string;
    readonly scaleSetName?: string;
    readonly networkProfile: {
        ipConfiguration: {
            loadBalancerBackendAddressPoolIds?: string[];
            loadBalancerInboundNatRulesIds: string[];
            name: string;
            subnetId: string;
        }[];
        name: string;
        primary: boolean;
    }[];
    readonly osProfile: {
        adminPassword: string;
        adminUsername: string;
        computerNamePrefix: string;
        customData?: string;
    }[];
    readonly osProfileLinuxConfig: {
        disablePasswordAuthentication?: boolean;
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
    readonly overprovision?: boolean;
    readonly resourceGroupName: string;
    readonly singlePlacementGroup?: boolean;
    readonly sku: {
        capacity: number;
        name: string;
        tier: string;
    }[];
    readonly storageProfileDataDisk?: {
        caching: string;
        createOption: string;
        diskSizeGb: number;
        lun: number;
        managedDiskType: string;
    }[];
    readonly storageProfileImageReference: {
        offer: string;
        publisher: string;
        sku: string;
        version: string;
    }[];
    readonly storageProfileOsDisk: {
        caching: string;
        createOption: string;
        image?: string;
        managedDiskType: string;
        name?: string;
        osType?: string;
        vhdContainers?: string[];
    }[];
    readonly tags: {
        [key: string]: any;
    };
    readonly upgradePolicyMode: string;
    constructor(name: string, args: ScaleSetArgs);
}
export interface ScaleSetArgs {
    readonly extension?: {
        autoUpgradeMinorVersion?: boolean;
        name: string;
        protectedSettings?: string;
        publisher: string;
        settings?: string;
        type: string;
        typeHandlerVersion: string;
    }[];
    readonly location: string;
    readonly scaleSetName?: string;
    readonly networkProfile: {
        ipConfiguration: {
            loadBalancerBackendAddressPoolIds?: string[];
            loadBalancerInboundNatRulesIds: string[];
            name: string;
            subnetId: string;
        }[];
        name: string;
        primary: boolean;
    }[];
    readonly osProfile: {
        adminPassword: string;
        adminUsername: string;
        computerNamePrefix: string;
        customData?: string;
    }[];
    readonly osProfileLinuxConfig?: {
        disablePasswordAuthentication?: boolean;
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
    readonly overprovision?: boolean;
    readonly resourceGroupName: string;
    readonly singlePlacementGroup?: boolean;
    readonly sku: {
        capacity: number;
        name: string;
        tier: string;
    }[];
    readonly storageProfileDataDisk?: {
        caching: string;
        createOption: string;
        diskSizeGb: number;
        lun: number;
        managedDiskType: string;
    }[];
    readonly storageProfileImageReference?: {
        offer: string;
        publisher: string;
        sku: string;
        version: string;
    }[];
    readonly storageProfileOsDisk: {
        caching: string;
        createOption: string;
        image?: string;
        managedDiskType: string;
        name?: string;
        osType?: string;
        vhdContainers?: string[];
    }[];
    readonly tags?: {
        [key: string]: any;
    };
    readonly upgradePolicyMode: string;
}


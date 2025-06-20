// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a VPN Server Configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const test = new azure.network.VpnServerConfiguration("test", {
 *     name: "example-config",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     vpnAuthenticationTypes: ["Certificate"],
 *     clientRootCertificates: [{
 *         name: "DigiCert-Federated-ID-Root-CA",
 *         publicCertData: `MIIDuzCCAqOgAwIBAgIQCHTZWCM+IlfFIRXIvyKSrjANBgkqhkiG9w0BAQsFADBn
 * MQswCQYDVQQGEwJVUzEVMBMGA1UEChMMRGlnaUNlcnQgSW5jMRkwFwYDVQQLExB3
 * d3cuZGlnaWNlcnQuY29tMSYwJAYDVQQDEx1EaWdpQ2VydCBGZWRlcmF0ZWQgSUQg
 * Um9vdCBDQTAeFw0xMzAxMTUxMjAwMDBaFw0zMzAxMTUxMjAwMDBaMGcxCzAJBgNV
 * BAYTAlVTMRUwEwYDVQQKEwxEaWdpQ2VydCBJbmMxGTAXBgNVBAsTEHd3dy5kaWdp
 * Y2VydC5jb20xJjAkBgNVBAMTHURpZ2lDZXJ0IEZlZGVyYXRlZCBJRCBSb290IENB
 * MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvAEB4pcCqnNNOWE6Ur5j
 * QPUH+1y1F9KdHTRSza6k5iDlXq1kGS1qAkuKtw9JsiNRrjltmFnzMZRBbX8Tlfl8
 * zAhBmb6dDduDGED01kBsTkgywYPxXVTKec0WxYEEF0oMn4wSYNl0lt2eJAKHXjNf
 * GTwiibdP8CUR2ghSM2sUTI8Nt1Omfc4SMHhGhYD64uJMbX98THQ/4LMGuYegou+d
 * GTiahfHtjn7AboSEknwAMJHCh5RlYZZ6B1O4QbKJ+34Q0eKgnI3X6Vc9u0zf6DH8
 * Dk+4zQDYRRTqTnVO3VT8jzqDlCRuNtq6YvryOWN74/dq8LQhUnXHvFyrsdMaE1X2
 * DwIDAQABo2MwYTAPBgNVHRMBAf8EBTADAQH/MA4GA1UdDwEB/wQEAwIBhjAdBgNV
 * HQ4EFgQUGRdkFnbGt1EWjKwbUne+5OaZvRYwHwYDVR0jBBgwFoAUGRdkFnbGt1EW
 * jKwbUne+5OaZvRYwDQYJKoZIhvcNAQELBQADggEBAHcqsHkrjpESqfuVTRiptJfP
 * 9JbdtWqRTmOf6uJi2c8YVqI6XlKXsD8C1dUUaaHKLUJzvKiazibVuBwMIT84AyqR
 * QELn3e0BtgEymEygMU569b01ZPxoFSnNXc7qDZBDef8WfqAV/sxkTi8L9BkmFYfL
 * uGLOhRJOFprPdoDIUBB+tmCl3oDcBy3vnUeOEioz8zAkprcb3GHwHAK+vHmmfgcn
 * WsfMLH4JCLa/tRYL+Rw/N3ybCkDp00s0WUZ+AoDywSl0Q/ZEnNY0MsFiw6LyIdbq
 * M/s/1JRtO3bDSzD9TazRVzn2oBqzSa8VgIo5C1nOnoAKJTlsClJKvIhnRlaLQqk=
 * `,
 *     }],
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2024-05-01
 *
 * ## Import
 *
 * VPN Server Configurations can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:network/vpnServerConfiguration:VpnServerConfiguration config1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/vpnServerConfigurations/config1
 * ```
 */
export class VpnServerConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing VpnServerConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpnServerConfigurationState, opts?: pulumi.CustomResourceOptions): VpnServerConfiguration {
        return new VpnServerConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/vpnServerConfiguration:VpnServerConfiguration';

    /**
     * Returns true if the given object is an instance of VpnServerConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpnServerConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpnServerConfiguration.__pulumiType;
    }

    public readonly azureActiveDirectoryAuthentications!: pulumi.Output<outputs.network.VpnServerConfigurationAzureActiveDirectoryAuthentication[] | undefined>;
    public readonly clientRevokedCertificates!: pulumi.Output<outputs.network.VpnServerConfigurationClientRevokedCertificate[] | undefined>;
    public readonly clientRootCertificates!: pulumi.Output<outputs.network.VpnServerConfigurationClientRootCertificate[] | undefined>;
    /**
     * A `ipsecPolicy` block as defined below.
     */
    public readonly ipsecPolicy!: pulumi.Output<outputs.network.VpnServerConfigurationIpsecPolicy | undefined>;
    /**
     * The Azure location where this VPN Server Configuration should be created. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The Name which should be used for this VPN Server Configuration. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly radius!: pulumi.Output<outputs.network.VpnServerConfigurationRadius | undefined>;
    /**
     * The Name of the Resource Group in which this VPN Server Configuration should be created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A list of Authentication Types applicable for this VPN Server Configuration. Possible values are `AAD` (Azure Active Directory), `Certificate` and `Radius`.
     */
    public readonly vpnAuthenticationTypes!: pulumi.Output<string[]>;
    /**
     * A list of VPN Protocols to use for this Server Configuration. Possible values are `IkeV2` and `OpenVPN`.
     */
    public readonly vpnProtocols!: pulumi.Output<string[]>;

    /**
     * Create a VpnServerConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpnServerConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpnServerConfigurationArgs | VpnServerConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpnServerConfigurationState | undefined;
            resourceInputs["azureActiveDirectoryAuthentications"] = state ? state.azureActiveDirectoryAuthentications : undefined;
            resourceInputs["clientRevokedCertificates"] = state ? state.clientRevokedCertificates : undefined;
            resourceInputs["clientRootCertificates"] = state ? state.clientRootCertificates : undefined;
            resourceInputs["ipsecPolicy"] = state ? state.ipsecPolicy : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["radius"] = state ? state.radius : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpnAuthenticationTypes"] = state ? state.vpnAuthenticationTypes : undefined;
            resourceInputs["vpnProtocols"] = state ? state.vpnProtocols : undefined;
        } else {
            const args = argsOrState as VpnServerConfigurationArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.vpnAuthenticationTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpnAuthenticationTypes'");
            }
            resourceInputs["azureActiveDirectoryAuthentications"] = args ? args.azureActiveDirectoryAuthentications : undefined;
            resourceInputs["clientRevokedCertificates"] = args ? args.clientRevokedCertificates : undefined;
            resourceInputs["clientRootCertificates"] = args ? args.clientRootCertificates : undefined;
            resourceInputs["ipsecPolicy"] = args ? args.ipsecPolicy : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["radius"] = args ? args.radius : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpnAuthenticationTypes"] = args ? args.vpnAuthenticationTypes : undefined;
            resourceInputs["vpnProtocols"] = args ? args.vpnProtocols : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpnServerConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpnServerConfiguration resources.
 */
export interface VpnServerConfigurationState {
    azureActiveDirectoryAuthentications?: pulumi.Input<pulumi.Input<inputs.network.VpnServerConfigurationAzureActiveDirectoryAuthentication>[]>;
    clientRevokedCertificates?: pulumi.Input<pulumi.Input<inputs.network.VpnServerConfigurationClientRevokedCertificate>[]>;
    clientRootCertificates?: pulumi.Input<pulumi.Input<inputs.network.VpnServerConfigurationClientRootCertificate>[]>;
    /**
     * A `ipsecPolicy` block as defined below.
     */
    ipsecPolicy?: pulumi.Input<inputs.network.VpnServerConfigurationIpsecPolicy>;
    /**
     * The Azure location where this VPN Server Configuration should be created. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The Name which should be used for this VPN Server Configuration. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    radius?: pulumi.Input<inputs.network.VpnServerConfigurationRadius>;
    /**
     * The Name of the Resource Group in which this VPN Server Configuration should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A list of Authentication Types applicable for this VPN Server Configuration. Possible values are `AAD` (Azure Active Directory), `Certificate` and `Radius`.
     */
    vpnAuthenticationTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of VPN Protocols to use for this Server Configuration. Possible values are `IkeV2` and `OpenVPN`.
     */
    vpnProtocols?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a VpnServerConfiguration resource.
 */
export interface VpnServerConfigurationArgs {
    azureActiveDirectoryAuthentications?: pulumi.Input<pulumi.Input<inputs.network.VpnServerConfigurationAzureActiveDirectoryAuthentication>[]>;
    clientRevokedCertificates?: pulumi.Input<pulumi.Input<inputs.network.VpnServerConfigurationClientRevokedCertificate>[]>;
    clientRootCertificates?: pulumi.Input<pulumi.Input<inputs.network.VpnServerConfigurationClientRootCertificate>[]>;
    /**
     * A `ipsecPolicy` block as defined below.
     */
    ipsecPolicy?: pulumi.Input<inputs.network.VpnServerConfigurationIpsecPolicy>;
    /**
     * The Azure location where this VPN Server Configuration should be created. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The Name which should be used for this VPN Server Configuration. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    radius?: pulumi.Input<inputs.network.VpnServerConfigurationRadius>;
    /**
     * The Name of the Resource Group in which this VPN Server Configuration should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A list of Authentication Types applicable for this VPN Server Configuration. Possible values are `AAD` (Azure Active Directory), `Certificate` and `Radius`.
     */
    vpnAuthenticationTypes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of VPN Protocols to use for this Server Configuration. Possible values are `IkeV2` and `OpenVPN`.
     */
    vpnProtocols?: pulumi.Input<pulumi.Input<string>[]>;
}

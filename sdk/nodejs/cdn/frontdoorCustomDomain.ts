// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-cdn-frontdoor",
 *     location: "West Europe",
 * });
 * const exampleZone = new azure.dns.Zone("example", {
 *     name: "sub-domain.domain.com",
 *     resourceGroupName: example.name,
 * });
 * const exampleFrontdoorProfile = new azure.cdn.FrontdoorProfile("example", {
 *     name: "example-profile",
 *     resourceGroupName: example.name,
 *     skuName: "Standard_AzureFrontDoor",
 * });
 * const exampleFrontdoorCustomDomain = new azure.cdn.FrontdoorCustomDomain("example", {
 *     name: "example-customDomain",
 *     cdnFrontdoorProfileId: exampleFrontdoorProfile.id,
 *     dnsZoneId: exampleZone.id,
 *     hostName: "contoso.fabrikam.com",
 *     tls: {
 *         certificateType: "ManagedCertificate",
 *         minimumTlsVersion: "TLS12",
 *     },
 * });
 * ```
 *
 * ## Example DNS Auth TXT Record Usage
 *
 * The name of your DNS TXT record should be in the format of `_dnsauth.<your_subdomain>`. So, for example, if we use the `hostName` in the example usage above you would create a DNS TXT record with the name of `_dnsauth.contoso` which contains the value of the Front Door Custom Domains `validationToken` field. See the [product documentation](https://learn.microsoft.com/azure/frontdoor/standard-premium/how-to-add-custom-domain) for more information.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 * import * as std from "@pulumi/std";
 *
 * const example = new azure.dns.TxtRecord("example", {
 *     name: std.join({
 *         separator: ".",
 *         input: [
 *             "_dnsauth",
 *             "contoso",
 *         ],
 *     }).then(invoke => invoke.result),
 *     zoneName: exampleAzurermDnsZone.name,
 *     resourceGroupName: exampleAzurermResourceGroup.name,
 *     ttl: 3600,
 *     records: [{
 *         value: exampleAzurermCdnFrontdoorCustomDomain.validationToken,
 *     }],
 * });
 * ```
 *
 * ## Example CNAME Record Usage
 *
 * !> **Note:** You **must** include the `dependsOn` meta-argument which references both the `azure.cdn.FrontdoorRoute` and the `azure.cdn.FrontdoorSecurityPolicy` that are associated with your Custom Domain. The reason for these `dependsOn` meta-arguments is because all of the resources for the Custom Domain need to be associated within Front Door before the CNAME record can be written to the domains DNS, else the CNAME validation will fail and Front Door will not enable traffic to the Domain.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.dns.CNameRecord("example", {
 *     name: "contoso",
 *     zoneName: exampleAzurermDnsZone.name,
 *     resourceGroupName: exampleAzurermResourceGroup.name,
 *     ttl: 3600,
 *     record: exampleAzurermCdnFrontdoorEndpoint.hostName,
 * }, {
 *     dependsOn: [
 *         exampleAzurermCdnFrontdoorRoute,
 *         exampleAzurermCdnFrontdoorSecurityPolicy,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Front Door Custom Domains can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:cdn/frontdoorCustomDomain:FrontdoorCustomDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/customDomains/customDomain1
 * ```
 */
export class FrontdoorCustomDomain extends pulumi.CustomResource {
    /**
     * Get an existing FrontdoorCustomDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FrontdoorCustomDomainState, opts?: pulumi.CustomResourceOptions): FrontdoorCustomDomain {
        return new FrontdoorCustomDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:cdn/frontdoorCustomDomain:FrontdoorCustomDomain';

    /**
     * Returns true if the given object is an instance of FrontdoorCustomDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FrontdoorCustomDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FrontdoorCustomDomain.__pulumiType;
    }

    /**
     * The ID of the Front Door Profile. Changing this forces a new Front Door Custom Domain to be created.
     */
    public readonly cdnFrontdoorProfileId!: pulumi.Output<string>;
    /**
     * The ID of the Azure DNS Zone which should be used for this Front Door Custom Domain. If you are using Azure to host your [DNS domains](https://learn.microsoft.com/azure/dns/dns-overview), you must delegate the domain provider's domain name system (DNS) to an Azure DNS Zone. For more information, see [Delegate a domain to Azure DNS](https://learn.microsoft.com/azure/dns/dns-delegate-domain-azure-dns). Otherwise, if you're using your own domain provider to handle your DNS, you must validate the Front Door Custom Domain by creating the DNS TXT records manually.
     *
     * <!-- * `preValidatedCdnFrontdoorCustomDomainId` - (Optional) The resource ID of the pre-validated Front Door Custom Domain. This domain type is used when you wish to onboard a validated Azure service domain, and then configure the Azure service behind an Azure Front Door.
     *
     * > **Note:** Currently `preValidatedCdnFrontdoorCustomDomainId` only supports domains validated by Static Web App. -->
     */
    public readonly dnsZoneId!: pulumi.Output<string | undefined>;
    /**
     * The date time that the token expires.
     */
    public /*out*/ readonly expirationDate!: pulumi.Output<string>;
    /**
     * The host name of the domain. The `hostName` field must be the FQDN of your domain(e.g. `contoso.fabrikam.com`). Changing this forces a new Front Door Custom Domain to be created.
     */
    public readonly hostName!: pulumi.Output<string>;
    /**
     * The name which should be used for this Front Door Custom Domain. Possible values must be between 2 and 260 characters in length, must begin with a letter or number, end with a letter or number and contain only letters, numbers and hyphens. Changing this forces a new Front Door Custom Domain to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `tls` block as defined below.
     */
    public readonly tls!: pulumi.Output<outputs.cdn.FrontdoorCustomDomainTls>;
    /**
     * Challenge used for DNS TXT record or file based validation.
     */
    public /*out*/ readonly validationToken!: pulumi.Output<string>;

    /**
     * Create a FrontdoorCustomDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FrontdoorCustomDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FrontdoorCustomDomainArgs | FrontdoorCustomDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FrontdoorCustomDomainState | undefined;
            resourceInputs["cdnFrontdoorProfileId"] = state ? state.cdnFrontdoorProfileId : undefined;
            resourceInputs["dnsZoneId"] = state ? state.dnsZoneId : undefined;
            resourceInputs["expirationDate"] = state ? state.expirationDate : undefined;
            resourceInputs["hostName"] = state ? state.hostName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tls"] = state ? state.tls : undefined;
            resourceInputs["validationToken"] = state ? state.validationToken : undefined;
        } else {
            const args = argsOrState as FrontdoorCustomDomainArgs | undefined;
            if ((!args || args.cdnFrontdoorProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cdnFrontdoorProfileId'");
            }
            if ((!args || args.hostName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostName'");
            }
            if ((!args || args.tls === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tls'");
            }
            resourceInputs["cdnFrontdoorProfileId"] = args ? args.cdnFrontdoorProfileId : undefined;
            resourceInputs["dnsZoneId"] = args ? args.dnsZoneId : undefined;
            resourceInputs["hostName"] = args ? args.hostName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tls"] = args ? args.tls : undefined;
            resourceInputs["expirationDate"] = undefined /*out*/;
            resourceInputs["validationToken"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "azure:cdn/frontdoorCustomEndpoint:FrontdoorCustomEndpoint" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(FrontdoorCustomDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FrontdoorCustomDomain resources.
 */
export interface FrontdoorCustomDomainState {
    /**
     * The ID of the Front Door Profile. Changing this forces a new Front Door Custom Domain to be created.
     */
    cdnFrontdoorProfileId?: pulumi.Input<string>;
    /**
     * The ID of the Azure DNS Zone which should be used for this Front Door Custom Domain. If you are using Azure to host your [DNS domains](https://learn.microsoft.com/azure/dns/dns-overview), you must delegate the domain provider's domain name system (DNS) to an Azure DNS Zone. For more information, see [Delegate a domain to Azure DNS](https://learn.microsoft.com/azure/dns/dns-delegate-domain-azure-dns). Otherwise, if you're using your own domain provider to handle your DNS, you must validate the Front Door Custom Domain by creating the DNS TXT records manually.
     *
     * <!-- * `preValidatedCdnFrontdoorCustomDomainId` - (Optional) The resource ID of the pre-validated Front Door Custom Domain. This domain type is used when you wish to onboard a validated Azure service domain, and then configure the Azure service behind an Azure Front Door.
     *
     * > **Note:** Currently `preValidatedCdnFrontdoorCustomDomainId` only supports domains validated by Static Web App. -->
     */
    dnsZoneId?: pulumi.Input<string>;
    /**
     * The date time that the token expires.
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * The host name of the domain. The `hostName` field must be the FQDN of your domain(e.g. `contoso.fabrikam.com`). Changing this forces a new Front Door Custom Domain to be created.
     */
    hostName?: pulumi.Input<string>;
    /**
     * The name which should be used for this Front Door Custom Domain. Possible values must be between 2 and 260 characters in length, must begin with a letter or number, end with a letter or number and contain only letters, numbers and hyphens. Changing this forces a new Front Door Custom Domain to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `tls` block as defined below.
     */
    tls?: pulumi.Input<inputs.cdn.FrontdoorCustomDomainTls>;
    /**
     * Challenge used for DNS TXT record or file based validation.
     */
    validationToken?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FrontdoorCustomDomain resource.
 */
export interface FrontdoorCustomDomainArgs {
    /**
     * The ID of the Front Door Profile. Changing this forces a new Front Door Custom Domain to be created.
     */
    cdnFrontdoorProfileId: pulumi.Input<string>;
    /**
     * The ID of the Azure DNS Zone which should be used for this Front Door Custom Domain. If you are using Azure to host your [DNS domains](https://learn.microsoft.com/azure/dns/dns-overview), you must delegate the domain provider's domain name system (DNS) to an Azure DNS Zone. For more information, see [Delegate a domain to Azure DNS](https://learn.microsoft.com/azure/dns/dns-delegate-domain-azure-dns). Otherwise, if you're using your own domain provider to handle your DNS, you must validate the Front Door Custom Domain by creating the DNS TXT records manually.
     *
     * <!-- * `preValidatedCdnFrontdoorCustomDomainId` - (Optional) The resource ID of the pre-validated Front Door Custom Domain. This domain type is used when you wish to onboard a validated Azure service domain, and then configure the Azure service behind an Azure Front Door.
     *
     * > **Note:** Currently `preValidatedCdnFrontdoorCustomDomainId` only supports domains validated by Static Web App. -->
     */
    dnsZoneId?: pulumi.Input<string>;
    /**
     * The host name of the domain. The `hostName` field must be the FQDN of your domain(e.g. `contoso.fabrikam.com`). Changing this forces a new Front Door Custom Domain to be created.
     */
    hostName: pulumi.Input<string>;
    /**
     * The name which should be used for this Front Door Custom Domain. Possible values must be between 2 and 260 characters in length, must begin with a letter or number, end with a letter or number and contain only letters, numbers and hyphens. Changing this forces a new Front Door Custom Domain to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `tls` block as defined below.
     */
    tls: pulumi.Input<inputs.cdn.FrontdoorCustomDomainTls>;
}

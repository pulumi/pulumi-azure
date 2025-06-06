// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the subscription's Security Center Contact.
 *
 * > **Note:** Owner access permission is required.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.securitycenter.Contact("example", {
 *     name: "contact",
 *     email: "contact@example.com",
 *     phone: "+1-555-555-5555",
 *     alertNotifications: true,
 *     alertsToAdmins: true,
 * });
 * ```
 *
 * ## Import
 *
 * Security Center Contacts can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:securitycenter/contact:Contact example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Security/securityContacts/default1
 * ```
 */
export class Contact extends pulumi.CustomResource {
    /**
     * Get an existing Contact resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ContactState, opts?: pulumi.CustomResourceOptions): Contact {
        return new Contact(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:securitycenter/contact:Contact';

    /**
     * Returns true if the given object is an instance of Contact.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Contact {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Contact.__pulumiType;
    }

    /**
     * Whether to send security alerts notifications to the security contact.
     */
    public readonly alertNotifications!: pulumi.Output<boolean>;
    /**
     * Whether to send security alerts notifications to subscription admins.
     */
    public readonly alertsToAdmins!: pulumi.Output<boolean>;
    /**
     * The email of the Security Center Contact.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The phone number of the Security Center Contact.
     */
    public readonly phone!: pulumi.Output<string | undefined>;

    /**
     * Create a Contact resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ContactArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ContactArgs | ContactState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ContactState | undefined;
            resourceInputs["alertNotifications"] = state ? state.alertNotifications : undefined;
            resourceInputs["alertsToAdmins"] = state ? state.alertsToAdmins : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["phone"] = state ? state.phone : undefined;
        } else {
            const args = argsOrState as ContactArgs | undefined;
            if ((!args || args.alertNotifications === undefined) && !opts.urn) {
                throw new Error("Missing required property 'alertNotifications'");
            }
            if ((!args || args.alertsToAdmins === undefined) && !opts.urn) {
                throw new Error("Missing required property 'alertsToAdmins'");
            }
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            resourceInputs["alertNotifications"] = args ? args.alertNotifications : undefined;
            resourceInputs["alertsToAdmins"] = args ? args.alertsToAdmins : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["phone"] = args ? args.phone : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Contact.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Contact resources.
 */
export interface ContactState {
    /**
     * Whether to send security alerts notifications to the security contact.
     */
    alertNotifications?: pulumi.Input<boolean>;
    /**
     * Whether to send security alerts notifications to subscription admins.
     */
    alertsToAdmins?: pulumi.Input<boolean>;
    /**
     * The email of the Security Center Contact.
     */
    email?: pulumi.Input<string>;
    /**
     * The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The phone number of the Security Center Contact.
     */
    phone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Contact resource.
 */
export interface ContactArgs {
    /**
     * Whether to send security alerts notifications to the security contact.
     */
    alertNotifications: pulumi.Input<boolean>;
    /**
     * Whether to send security alerts notifications to subscription admins.
     */
    alertsToAdmins: pulumi.Input<boolean>;
    /**
     * The email of the Security Center Contact.
     */
    email: pulumi.Input<string>;
    /**
     * The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The phone number of the Security Center Contact.
     */
    phone?: pulumi.Input<string>;
}

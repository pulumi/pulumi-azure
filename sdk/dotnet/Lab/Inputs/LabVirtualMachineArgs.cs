// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lab.Inputs
{

    public sealed class LabVirtualMachineArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Is flagged to pre-install dedicated GPU drivers? Defaults to `false`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("additionalCapabilityGpuDriversInstalled")]
        public Input<bool>? AdditionalCapabilityGpuDriversInstalled { get; set; }

        /// <summary>
        /// An `admin_user` block as defined below.
        /// </summary>
        [Input("adminUser", required: true)]
        public Input<Inputs.LabVirtualMachineAdminUserArgs> AdminUser { get; set; } = null!;

        /// <summary>
        /// The create option to indicate what Lab Service Lab VMs are created from. Possible values are `Image` and `TemplateVM`. Defaults to `Image`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("createOption")]
        public Input<string>? CreateOption { get; set; }

        /// <summary>
        /// An `image_reference` block as defined below.
        /// </summary>
        [Input("imageReference", required: true)]
        public Input<Inputs.LabVirtualMachineImageReferenceArgs> ImageReference { get; set; } = null!;

        /// <summary>
        /// A `non_admin_user` block as defined below.
        /// </summary>
        [Input("nonAdminUser")]
        public Input<Inputs.LabVirtualMachineNonAdminUserArgs>? NonAdminUser { get; set; }

        /// <summary>
        /// Is the shared password enabled with the same password for all user VMs? Defaults to `false`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sharedPasswordEnabled")]
        public Input<bool>? SharedPasswordEnabled { get; set; }

        /// <summary>
        /// A `sku` block as defined below.
        /// </summary>
        [Input("sku", required: true)]
        public Input<Inputs.LabVirtualMachineSkuArgs> Sku { get; set; } = null!;

        /// <summary>
        /// The initial quota allocated to each Lab Service Lab user. Defaults to `PT0S`. This value must be formatted as an ISO 8601 string.
        /// </summary>
        [Input("usageQuota")]
        public Input<string>? UsageQuota { get; set; }

        public LabVirtualMachineArgs()
        {
        }
        public static new LabVirtualMachineArgs Empty => new LabVirtualMachineArgs();
    }
}

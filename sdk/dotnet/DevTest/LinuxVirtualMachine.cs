// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DevTest
{
    /// <summary>
    /// Manages a Linux Virtual Machine within a Dev Test Lab.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleLab = new Azure.DevTest.Lab("example", new()
    ///     {
    ///         Name = "example-devtestlab",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Tags = 
    ///         {
    ///             { "Sydney", "Australia" },
    ///         },
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.DevTest.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-network",
    ///         LabName = exampleLab.Name,
    ///         ResourceGroupName = example.Name,
    ///         Subnet = new Azure.DevTest.Inputs.VirtualNetworkSubnetArgs
    ///         {
    ///             UsePublicIpAddress = "Allow",
    ///             UseInVirtualMachineCreation = "Allow",
    ///         },
    ///     });
    /// 
    ///     var exampleLinuxVirtualMachine = new Azure.DevTest.LinuxVirtualMachine("example", new()
    ///     {
    ///         Name = "example-vm03",
    ///         LabName = exampleLab.Name,
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         Size = "Standard_DS2",
    ///         Username = "exampleuser99",
    ///         SshKey = Std.File.Invoke(new()
    ///         {
    ///             Input = "~/.ssh/id_rsa.pub",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         LabVirtualNetworkId = exampleVirtualNetwork.Id,
    ///         LabSubnetName = exampleVirtualNetwork.Subnet.Apply(subnet =&gt; subnet.Name),
    ///         StorageType = "Premium",
    ///         Notes = "Some notes about this Virtual Machine.",
    ///         GalleryImageReference = new Azure.DevTest.Inputs.LinuxVirtualMachineGalleryImageReferenceArgs
    ///         {
    ///             Publisher = "Canonical",
    ///             Offer = "0001-com-ubuntu-server-jammy",
    ///             Sku = "22_04-lts",
    ///             Version = "latest",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.DevTestLab`: 2018-09-15
    /// 
    /// ## Import
    /// 
    /// Dev Test Linux Virtual Machines can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:devtest/linuxVirtualMachine:LinuxVirtualMachine machine1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevTestLab/labs/lab1/virtualMachines/machine1
    /// ```
    /// </summary>
    [AzureResourceType("azure:devtest/linuxVirtualMachine:LinuxVirtualMachine")]
    public partial class LinuxVirtualMachine : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Can this Virtual Machine be claimed by users? Defaults to `true`.
        /// </summary>
        [Output("allowClaim")]
        public Output<bool?> AllowClaim { get; private set; } = null!;

        /// <summary>
        /// Should the Virtual Machine be created without a Public IP Address? Changing this forces a new resource to be created.
        /// </summary>
        [Output("disallowPublicIpAddress")]
        public Output<bool?> DisallowPublicIpAddress { get; private set; } = null!;

        /// <summary>
        /// The FQDN of the Virtual Machine.
        /// </summary>
        [Output("fqdn")]
        public Output<string> Fqdn { get; private set; } = null!;

        /// <summary>
        /// A `gallery_image_reference` block as defined below.
        /// </summary>
        [Output("galleryImageReference")]
        public Output<Outputs.LinuxVirtualMachineGalleryImageReference> GalleryImageReference { get; private set; } = null!;

        /// <summary>
        /// One or more `inbound_nat_rule` blocks as defined below. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** If any `inbound_nat_rule` blocks are specified then `disallow_public_ip_address` must be set to `true`.
        /// </summary>
        [Output("inboundNatRules")]
        public Output<ImmutableArray<Outputs.LinuxVirtualMachineInboundNatRule>> InboundNatRules { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Dev Test Lab in which the Virtual Machine should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("labName")]
        public Output<string> LabName { get; private set; } = null!;

        /// <summary>
        /// The name of a Subnet within the Dev Test Virtual Network where this machine should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("labSubnetName")]
        public Output<string> LabSubnetName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Dev Test Virtual Network where this Virtual Machine should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("labVirtualNetworkId")]
        public Output<string> LabVirtualNetworkId { get; private set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the Dev Test Lab exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Dev Test Machine. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** The validation requirements for the Name change based on the `os_type` used in this Virtual Machine. For a Linux VM the name must be between 1-62 characters, and for a Windows VM the name must be between 1-15 characters. It must begin and end with a letter or number, and cannot be all numbers.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Any notes about the Virtual Machine.
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        /// <summary>
        /// The Password associated with the `username` used to login to this Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The Machine Size to use for this Virtual Machine, such as `Standard_F2`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("size")]
        public Output<string> Size { get; private set; } = null!;

        /// <summary>
        /// The SSH Key associated with the `username` used to login to this Virtual Machine. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** One or either `password` or `ssh_key` must be specified.
        /// </summary>
        [Output("sshKey")]
        public Output<string?> SshKey { get; private set; } = null!;

        /// <summary>
        /// The type of Storage to use on this Virtual Machine. Possible values are `Standard` and `Premium`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("storageType")]
        public Output<string> StorageType { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The unique immutable identifier of the Virtual Machine.
        /// </summary>
        [Output("uniqueIdentifier")]
        public Output<string> UniqueIdentifier { get; private set; } = null!;

        /// <summary>
        /// The Username associated with the local administrator on this Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a LinuxVirtualMachine resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LinuxVirtualMachine(string name, LinuxVirtualMachineArgs args, CustomResourceOptions? options = null)
            : base("azure:devtest/linuxVirtualMachine:LinuxVirtualMachine", name, args ?? new LinuxVirtualMachineArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LinuxVirtualMachine(string name, Input<string> id, LinuxVirtualMachineState? state = null, CustomResourceOptions? options = null)
            : base("azure:devtest/linuxVirtualMachine:LinuxVirtualMachine", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LinuxVirtualMachine resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LinuxVirtualMachine Get(string name, Input<string> id, LinuxVirtualMachineState? state = null, CustomResourceOptions? options = null)
        {
            return new LinuxVirtualMachine(name, id, state, options);
        }
    }

    public sealed class LinuxVirtualMachineArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Can this Virtual Machine be claimed by users? Defaults to `true`.
        /// </summary>
        [Input("allowClaim")]
        public Input<bool>? AllowClaim { get; set; }

        /// <summary>
        /// Should the Virtual Machine be created without a Public IP Address? Changing this forces a new resource to be created.
        /// </summary>
        [Input("disallowPublicIpAddress")]
        public Input<bool>? DisallowPublicIpAddress { get; set; }

        /// <summary>
        /// A `gallery_image_reference` block as defined below.
        /// </summary>
        [Input("galleryImageReference", required: true)]
        public Input<Inputs.LinuxVirtualMachineGalleryImageReferenceArgs> GalleryImageReference { get; set; } = null!;

        [Input("inboundNatRules")]
        private InputList<Inputs.LinuxVirtualMachineInboundNatRuleArgs>? _inboundNatRules;

        /// <summary>
        /// One or more `inbound_nat_rule` blocks as defined below. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** If any `inbound_nat_rule` blocks are specified then `disallow_public_ip_address` must be set to `true`.
        /// </summary>
        public InputList<Inputs.LinuxVirtualMachineInboundNatRuleArgs> InboundNatRules
        {
            get => _inboundNatRules ?? (_inboundNatRules = new InputList<Inputs.LinuxVirtualMachineInboundNatRuleArgs>());
            set => _inboundNatRules = value;
        }

        /// <summary>
        /// Specifies the name of the Dev Test Lab in which the Virtual Machine should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("labName", required: true)]
        public Input<string> LabName { get; set; } = null!;

        /// <summary>
        /// The name of a Subnet within the Dev Test Virtual Network where this machine should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("labSubnetName", required: true)]
        public Input<string> LabSubnetName { get; set; } = null!;

        /// <summary>
        /// The ID of the Dev Test Virtual Network where this Virtual Machine should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("labVirtualNetworkId", required: true)]
        public Input<string> LabVirtualNetworkId { get; set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the Dev Test Lab exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Dev Test Machine. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** The validation requirements for the Name change based on the `os_type` used in this Virtual Machine. For a Linux VM the name must be between 1-62 characters, and for a Windows VM the name must be between 1-15 characters. It must begin and end with a letter or number, and cannot be all numbers.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Any notes about the Virtual Machine.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The Password associated with the `username` used to login to this Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The Machine Size to use for this Virtual Machine, such as `Standard_F2`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("size", required: true)]
        public Input<string> Size { get; set; } = null!;

        /// <summary>
        /// The SSH Key associated with the `username` used to login to this Virtual Machine. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** One or either `password` or `ssh_key` must be specified.
        /// </summary>
        [Input("sshKey")]
        public Input<string>? SshKey { get; set; }

        /// <summary>
        /// The type of Storage to use on this Virtual Machine. Possible values are `Standard` and `Premium`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageType", required: true)]
        public Input<string> StorageType { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Username associated with the local administrator on this Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public LinuxVirtualMachineArgs()
        {
        }
        public static new LinuxVirtualMachineArgs Empty => new LinuxVirtualMachineArgs();
    }

    public sealed class LinuxVirtualMachineState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Can this Virtual Machine be claimed by users? Defaults to `true`.
        /// </summary>
        [Input("allowClaim")]
        public Input<bool>? AllowClaim { get; set; }

        /// <summary>
        /// Should the Virtual Machine be created without a Public IP Address? Changing this forces a new resource to be created.
        /// </summary>
        [Input("disallowPublicIpAddress")]
        public Input<bool>? DisallowPublicIpAddress { get; set; }

        /// <summary>
        /// The FQDN of the Virtual Machine.
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        /// <summary>
        /// A `gallery_image_reference` block as defined below.
        /// </summary>
        [Input("galleryImageReference")]
        public Input<Inputs.LinuxVirtualMachineGalleryImageReferenceGetArgs>? GalleryImageReference { get; set; }

        [Input("inboundNatRules")]
        private InputList<Inputs.LinuxVirtualMachineInboundNatRuleGetArgs>? _inboundNatRules;

        /// <summary>
        /// One or more `inbound_nat_rule` blocks as defined below. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** If any `inbound_nat_rule` blocks are specified then `disallow_public_ip_address` must be set to `true`.
        /// </summary>
        public InputList<Inputs.LinuxVirtualMachineInboundNatRuleGetArgs> InboundNatRules
        {
            get => _inboundNatRules ?? (_inboundNatRules = new InputList<Inputs.LinuxVirtualMachineInboundNatRuleGetArgs>());
            set => _inboundNatRules = value;
        }

        /// <summary>
        /// Specifies the name of the Dev Test Lab in which the Virtual Machine should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("labName")]
        public Input<string>? LabName { get; set; }

        /// <summary>
        /// The name of a Subnet within the Dev Test Virtual Network where this machine should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("labSubnetName")]
        public Input<string>? LabSubnetName { get; set; }

        /// <summary>
        /// The ID of the Dev Test Virtual Network where this Virtual Machine should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("labVirtualNetworkId")]
        public Input<string>? LabVirtualNetworkId { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the Dev Test Lab exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Dev Test Machine. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** The validation requirements for the Name change based on the `os_type` used in this Virtual Machine. For a Linux VM the name must be between 1-62 characters, and for a Windows VM the name must be between 1-15 characters. It must begin and end with a letter or number, and cannot be all numbers.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Any notes about the Virtual Machine.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The Password associated with the `username` used to login to this Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The Machine Size to use for this Virtual Machine, such as `Standard_F2`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("size")]
        public Input<string>? Size { get; set; }

        /// <summary>
        /// The SSH Key associated with the `username` used to login to this Virtual Machine. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** One or either `password` or `ssh_key` must be specified.
        /// </summary>
        [Input("sshKey")]
        public Input<string>? SshKey { get; set; }

        /// <summary>
        /// The type of Storage to use on this Virtual Machine. Possible values are `Standard` and `Premium`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The unique immutable identifier of the Virtual Machine.
        /// </summary>
        [Input("uniqueIdentifier")]
        public Input<string>? UniqueIdentifier { get; set; }

        /// <summary>
        /// The Username associated with the local administrator on this Virtual Machine. Changing this forces a new resource to be created.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public LinuxVirtualMachineState()
        {
        }
        public static new LinuxVirtualMachineState Empty => new LinuxVirtualMachineState();
    }
}

// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package policy

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Applies a Guest Configuration Policy to a Virtual Machine.
//
// > **Note:** You can create Guest Configuration Policies without defining a `compute.Extension` resource, however the policies will not be executed until a `compute.Extension` has been provisioned to the virtual machine.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/compute"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/policy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-gca"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "example", &network.VirtualNetworkArgs{
//				Name:              pulumi.String("example-vnet"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.0.0/16"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleSubnet, err := network.NewSubnet(ctx, "example", &network.SubnetArgs{
//				Name:               pulumi.String("internal"),
//				ResourceGroupName:  example.Name,
//				VirtualNetworkName: exampleVirtualNetwork.Name,
//				AddressPrefixes: pulumi.StringArray{
//					pulumi.String("10.0.2.0/24"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleNetworkInterface, err := network.NewNetworkInterface(ctx, "example", &network.NetworkInterfaceArgs{
//				Name:              pulumi.String("example-nic"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				IpConfigurations: network.NetworkInterfaceIpConfigurationArray{
//					&network.NetworkInterfaceIpConfigurationArgs{
//						Name:                       pulumi.String("internal"),
//						SubnetId:                   exampleSubnet.ID(),
//						PrivateIpAddressAllocation: pulumi.String("Dynamic"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleWindowsVirtualMachine, err := compute.NewWindowsVirtualMachine(ctx, "example", &compute.WindowsVirtualMachineArgs{
//				Name:              pulumi.String("examplevm"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				Size:              pulumi.String("Standard_F2"),
//				AdminUsername:     pulumi.String("adminuser"),
//				AdminPassword:     pulumi.String("P@$$w0rd1234!"),
//				NetworkInterfaceIds: pulumi.StringArray{
//					exampleNetworkInterface.ID(),
//				},
//				Identity: &compute.WindowsVirtualMachineIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//				OsDisk: &compute.WindowsVirtualMachineOsDiskArgs{
//					Caching:            pulumi.String("ReadWrite"),
//					StorageAccountType: pulumi.String("Standard_LRS"),
//				},
//				SourceImageReference: &compute.WindowsVirtualMachineSourceImageReferenceArgs{
//					Publisher: pulumi.String("MicrosoftWindowsServer"),
//					Offer:     pulumi.String("WindowsServer"),
//					Sku:       pulumi.String("2019-Datacenter"),
//					Version:   pulumi.String("latest"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewExtension(ctx, "example", &compute.ExtensionArgs{
//				Name:                    pulumi.String("AzurePolicyforWindows"),
//				VirtualMachineId:        exampleWindowsVirtualMachine.ID(),
//				Publisher:               pulumi.String("Microsoft.GuestConfiguration"),
//				Type:                    pulumi.String("ConfigurationforWindows"),
//				TypeHandlerVersion:      pulumi.String("1.29"),
//				AutoUpgradeMinorVersion: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = policy.NewVirtualMachineConfigurationAssignment(ctx, "example", &policy.VirtualMachineConfigurationAssignmentArgs{
//				Name:             pulumi.String("AzureWindowsBaseline"),
//				Location:         exampleWindowsVirtualMachine.Location,
//				VirtualMachineId: exampleWindowsVirtualMachine.ID(),
//				Configuration: &policy.VirtualMachineConfigurationAssignmentConfigurationArgs{
//					AssignmentType: pulumi.String("ApplyAndMonitor"),
//					Version:        pulumi.String("1.*"),
//					Parameters: policy.VirtualMachineConfigurationAssignmentConfigurationParameterArray{
//						&policy.VirtualMachineConfigurationAssignmentConfigurationParameterArgs{
//							Name:  pulumi.String("Minimum Password Length;ExpectedValue"),
//							Value: pulumi.String("16"),
//						},
//						&policy.VirtualMachineConfigurationAssignmentConfigurationParameterArgs{
//							Name:  pulumi.String("Minimum Password Age;ExpectedValue"),
//							Value: pulumi.String("0"),
//						},
//						&policy.VirtualMachineConfigurationAssignmentConfigurationParameterArgs{
//							Name:  pulumi.String("Maximum Password Age;ExpectedValue"),
//							Value: pulumi.String("30,45"),
//						},
//						&policy.VirtualMachineConfigurationAssignmentConfigurationParameterArgs{
//							Name:  pulumi.String("Enforce Password History;ExpectedValue"),
//							Value: pulumi.String("10"),
//						},
//						&policy.VirtualMachineConfigurationAssignmentConfigurationParameterArgs{
//							Name:  pulumi.String("Password Must Meet Complexity Requirements;ExpectedValue"),
//							Value: pulumi.String("1"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Compute`: 2020-06-25
//
// ## Import
//
// Policy Virtual Machine Configuration Assignments can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:policy/virtualMachineConfigurationAssignment:VirtualMachineConfigurationAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/virtualMachines/vm1/providers/Microsoft.GuestConfiguration/guestConfigurationAssignments/assignment1
// ```
type VirtualMachineConfigurationAssignment struct {
	pulumi.CustomResourceState

	// A `configuration` block as defined below.
	Configuration VirtualMachineConfigurationAssignmentConfigurationOutput `pulumi:"configuration"`
	// The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
	VirtualMachineId pulumi.StringOutput `pulumi:"virtualMachineId"`
}

// NewVirtualMachineConfigurationAssignment registers a new resource with the given unique name, arguments, and options.
func NewVirtualMachineConfigurationAssignment(ctx *pulumi.Context,
	name string, args *VirtualMachineConfigurationAssignmentArgs, opts ...pulumi.ResourceOption) (*VirtualMachineConfigurationAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Configuration == nil {
		return nil, errors.New("invalid value for required argument 'Configuration'")
	}
	if args.VirtualMachineId == nil {
		return nil, errors.New("invalid value for required argument 'VirtualMachineId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualMachineConfigurationAssignment
	err := ctx.RegisterResource("azure:policy/virtualMachineConfigurationAssignment:VirtualMachineConfigurationAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualMachineConfigurationAssignment gets an existing VirtualMachineConfigurationAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualMachineConfigurationAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualMachineConfigurationAssignmentState, opts ...pulumi.ResourceOption) (*VirtualMachineConfigurationAssignment, error) {
	var resource VirtualMachineConfigurationAssignment
	err := ctx.ReadResource("azure:policy/virtualMachineConfigurationAssignment:VirtualMachineConfigurationAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualMachineConfigurationAssignment resources.
type virtualMachineConfigurationAssignmentState struct {
	// A `configuration` block as defined below.
	Configuration *VirtualMachineConfigurationAssignmentConfiguration `pulumi:"configuration"`
	// The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
	VirtualMachineId *string `pulumi:"virtualMachineId"`
}

type VirtualMachineConfigurationAssignmentState struct {
	// A `configuration` block as defined below.
	Configuration VirtualMachineConfigurationAssignmentConfigurationPtrInput
	// The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
	VirtualMachineId pulumi.StringPtrInput
}

func (VirtualMachineConfigurationAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualMachineConfigurationAssignmentState)(nil)).Elem()
}

type virtualMachineConfigurationAssignmentArgs struct {
	// A `configuration` block as defined below.
	Configuration VirtualMachineConfigurationAssignmentConfiguration `pulumi:"configuration"`
	// The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
	VirtualMachineId string `pulumi:"virtualMachineId"`
}

// The set of arguments for constructing a VirtualMachineConfigurationAssignment resource.
type VirtualMachineConfigurationAssignmentArgs struct {
	// A `configuration` block as defined below.
	Configuration VirtualMachineConfigurationAssignmentConfigurationInput
	// The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
	VirtualMachineId pulumi.StringInput
}

func (VirtualMachineConfigurationAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualMachineConfigurationAssignmentArgs)(nil)).Elem()
}

type VirtualMachineConfigurationAssignmentInput interface {
	pulumi.Input

	ToVirtualMachineConfigurationAssignmentOutput() VirtualMachineConfigurationAssignmentOutput
	ToVirtualMachineConfigurationAssignmentOutputWithContext(ctx context.Context) VirtualMachineConfigurationAssignmentOutput
}

func (*VirtualMachineConfigurationAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualMachineConfigurationAssignment)(nil)).Elem()
}

func (i *VirtualMachineConfigurationAssignment) ToVirtualMachineConfigurationAssignmentOutput() VirtualMachineConfigurationAssignmentOutput {
	return i.ToVirtualMachineConfigurationAssignmentOutputWithContext(context.Background())
}

func (i *VirtualMachineConfigurationAssignment) ToVirtualMachineConfigurationAssignmentOutputWithContext(ctx context.Context) VirtualMachineConfigurationAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMachineConfigurationAssignmentOutput)
}

// VirtualMachineConfigurationAssignmentArrayInput is an input type that accepts VirtualMachineConfigurationAssignmentArray and VirtualMachineConfigurationAssignmentArrayOutput values.
// You can construct a concrete instance of `VirtualMachineConfigurationAssignmentArrayInput` via:
//
//	VirtualMachineConfigurationAssignmentArray{ VirtualMachineConfigurationAssignmentArgs{...} }
type VirtualMachineConfigurationAssignmentArrayInput interface {
	pulumi.Input

	ToVirtualMachineConfigurationAssignmentArrayOutput() VirtualMachineConfigurationAssignmentArrayOutput
	ToVirtualMachineConfigurationAssignmentArrayOutputWithContext(context.Context) VirtualMachineConfigurationAssignmentArrayOutput
}

type VirtualMachineConfigurationAssignmentArray []VirtualMachineConfigurationAssignmentInput

func (VirtualMachineConfigurationAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualMachineConfigurationAssignment)(nil)).Elem()
}

func (i VirtualMachineConfigurationAssignmentArray) ToVirtualMachineConfigurationAssignmentArrayOutput() VirtualMachineConfigurationAssignmentArrayOutput {
	return i.ToVirtualMachineConfigurationAssignmentArrayOutputWithContext(context.Background())
}

func (i VirtualMachineConfigurationAssignmentArray) ToVirtualMachineConfigurationAssignmentArrayOutputWithContext(ctx context.Context) VirtualMachineConfigurationAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMachineConfigurationAssignmentArrayOutput)
}

// VirtualMachineConfigurationAssignmentMapInput is an input type that accepts VirtualMachineConfigurationAssignmentMap and VirtualMachineConfigurationAssignmentMapOutput values.
// You can construct a concrete instance of `VirtualMachineConfigurationAssignmentMapInput` via:
//
//	VirtualMachineConfigurationAssignmentMap{ "key": VirtualMachineConfigurationAssignmentArgs{...} }
type VirtualMachineConfigurationAssignmentMapInput interface {
	pulumi.Input

	ToVirtualMachineConfigurationAssignmentMapOutput() VirtualMachineConfigurationAssignmentMapOutput
	ToVirtualMachineConfigurationAssignmentMapOutputWithContext(context.Context) VirtualMachineConfigurationAssignmentMapOutput
}

type VirtualMachineConfigurationAssignmentMap map[string]VirtualMachineConfigurationAssignmentInput

func (VirtualMachineConfigurationAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualMachineConfigurationAssignment)(nil)).Elem()
}

func (i VirtualMachineConfigurationAssignmentMap) ToVirtualMachineConfigurationAssignmentMapOutput() VirtualMachineConfigurationAssignmentMapOutput {
	return i.ToVirtualMachineConfigurationAssignmentMapOutputWithContext(context.Background())
}

func (i VirtualMachineConfigurationAssignmentMap) ToVirtualMachineConfigurationAssignmentMapOutputWithContext(ctx context.Context) VirtualMachineConfigurationAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMachineConfigurationAssignmentMapOutput)
}

type VirtualMachineConfigurationAssignmentOutput struct{ *pulumi.OutputState }

func (VirtualMachineConfigurationAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualMachineConfigurationAssignment)(nil)).Elem()
}

func (o VirtualMachineConfigurationAssignmentOutput) ToVirtualMachineConfigurationAssignmentOutput() VirtualMachineConfigurationAssignmentOutput {
	return o
}

func (o VirtualMachineConfigurationAssignmentOutput) ToVirtualMachineConfigurationAssignmentOutputWithContext(ctx context.Context) VirtualMachineConfigurationAssignmentOutput {
	return o
}

// A `configuration` block as defined below.
func (o VirtualMachineConfigurationAssignmentOutput) Configuration() VirtualMachineConfigurationAssignmentConfigurationOutput {
	return o.ApplyT(func(v *VirtualMachineConfigurationAssignment) VirtualMachineConfigurationAssignmentConfigurationOutput {
		return v.Configuration
	}).(VirtualMachineConfigurationAssignmentConfigurationOutput)
}

// The Azure location where the Policy Virtual Machine Configuration Assignment should exist. Changing this forces a new resource to be created.
func (o VirtualMachineConfigurationAssignmentOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineConfigurationAssignment) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the Guest Configuration that will be assigned in this Guest Configuration Assignment. Changing this forces a new resource to be created.
func (o VirtualMachineConfigurationAssignmentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineConfigurationAssignment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The resource ID of the Policy Virtual Machine which this Guest Configuration Assignment should apply to. Changing this forces a new resource to be created.
func (o VirtualMachineConfigurationAssignmentOutput) VirtualMachineId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineConfigurationAssignment) pulumi.StringOutput { return v.VirtualMachineId }).(pulumi.StringOutput)
}

type VirtualMachineConfigurationAssignmentArrayOutput struct{ *pulumi.OutputState }

func (VirtualMachineConfigurationAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualMachineConfigurationAssignment)(nil)).Elem()
}

func (o VirtualMachineConfigurationAssignmentArrayOutput) ToVirtualMachineConfigurationAssignmentArrayOutput() VirtualMachineConfigurationAssignmentArrayOutput {
	return o
}

func (o VirtualMachineConfigurationAssignmentArrayOutput) ToVirtualMachineConfigurationAssignmentArrayOutputWithContext(ctx context.Context) VirtualMachineConfigurationAssignmentArrayOutput {
	return o
}

func (o VirtualMachineConfigurationAssignmentArrayOutput) Index(i pulumi.IntInput) VirtualMachineConfigurationAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualMachineConfigurationAssignment {
		return vs[0].([]*VirtualMachineConfigurationAssignment)[vs[1].(int)]
	}).(VirtualMachineConfigurationAssignmentOutput)
}

type VirtualMachineConfigurationAssignmentMapOutput struct{ *pulumi.OutputState }

func (VirtualMachineConfigurationAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualMachineConfigurationAssignment)(nil)).Elem()
}

func (o VirtualMachineConfigurationAssignmentMapOutput) ToVirtualMachineConfigurationAssignmentMapOutput() VirtualMachineConfigurationAssignmentMapOutput {
	return o
}

func (o VirtualMachineConfigurationAssignmentMapOutput) ToVirtualMachineConfigurationAssignmentMapOutputWithContext(ctx context.Context) VirtualMachineConfigurationAssignmentMapOutput {
	return o
}

func (o VirtualMachineConfigurationAssignmentMapOutput) MapIndex(k pulumi.StringInput) VirtualMachineConfigurationAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualMachineConfigurationAssignment {
		return vs[0].(map[string]*VirtualMachineConfigurationAssignment)[vs[1].(string)]
	}).(VirtualMachineConfigurationAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMachineConfigurationAssignmentInput)(nil)).Elem(), &VirtualMachineConfigurationAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMachineConfigurationAssignmentArrayInput)(nil)).Elem(), VirtualMachineConfigurationAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMachineConfigurationAssignmentMapInput)(nil)).Elem(), VirtualMachineConfigurationAssignmentMap{})
	pulumi.RegisterOutputType(VirtualMachineConfigurationAssignmentOutput{})
	pulumi.RegisterOutputType(VirtualMachineConfigurationAssignmentArrayOutput{})
	pulumi.RegisterOutputType(VirtualMachineConfigurationAssignmentMapOutput{})
}

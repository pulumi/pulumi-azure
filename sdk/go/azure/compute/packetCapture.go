// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Configures Network Packet Capturing against a Virtual Machine using a Network Watcher.
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
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleNetworkWatcher, err := network.NewNetworkWatcher(ctx, "example", &network.NetworkWatcherArgs{
//				Name:              pulumi.String("example-nw"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "example", &network.VirtualNetworkArgs{
//				Name: pulumi.String("example-network"),
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.0.0/16"),
//				},
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
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
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				IpConfigurations: network.NetworkInterfaceIpConfigurationArray{
//					&network.NetworkInterfaceIpConfigurationArgs{
//						Name:                       pulumi.String("testconfiguration1"),
//						SubnetId:                   exampleSubnet.ID(),
//						PrivateIpAddressAllocation: pulumi.String("Dynamic"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualMachine, err := compute.NewVirtualMachine(ctx, "example", &compute.VirtualMachineArgs{
//				Name:              pulumi.String("example-vm"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				NetworkInterfaceIds: pulumi.StringArray{
//					exampleNetworkInterface.ID(),
//				},
//				VmSize: pulumi.String("Standard_F2"),
//				StorageImageReference: &compute.VirtualMachineStorageImageReferenceArgs{
//					Publisher: pulumi.String("Canonical"),
//					Offer:     pulumi.String("0001-com-ubuntu-server-jammy"),
//					Sku:       pulumi.String("22_04-lts"),
//					Version:   pulumi.String("latest"),
//				},
//				StorageOsDisk: &compute.VirtualMachineStorageOsDiskArgs{
//					Name:            pulumi.String("osdisk"),
//					Caching:         pulumi.String("ReadWrite"),
//					CreateOption:    pulumi.String("FromImage"),
//					ManagedDiskType: pulumi.String("Standard_LRS"),
//				},
//				OsProfile: &compute.VirtualMachineOsProfileArgs{
//					ComputerName:  pulumi.String("pctest-vm"),
//					AdminUsername: pulumi.String("testadmin"),
//					AdminPassword: pulumi.String("Password1234!"),
//				},
//				OsProfileLinuxConfig: &compute.VirtualMachineOsProfileLinuxConfigArgs{
//					DisablePasswordAuthentication: pulumi.Bool(false),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleExtension, err := compute.NewExtension(ctx, "example", &compute.ExtensionArgs{
//				Name:                    pulumi.String("network-watcher"),
//				VirtualMachineId:        exampleVirtualMachine.ID(),
//				Publisher:               pulumi.String("Microsoft.Azure.NetworkWatcher"),
//				Type:                    pulumi.String("NetworkWatcherAgentLinux"),
//				TypeHandlerVersion:      pulumi.String("1.4"),
//				AutoUpgradeMinorVersion: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("examplesa"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewPacketCapture(ctx, "example", &compute.PacketCaptureArgs{
//				Name:             pulumi.String("example-pc"),
//				NetworkWatcherId: exampleNetworkWatcher.ID(),
//				VirtualMachineId: exampleVirtualMachine.ID(),
//				StorageLocation: &compute.PacketCaptureStorageLocationArgs{
//					StorageAccountId: exampleAccount.ID(),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleExtension,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// > **Note:** This Resource requires that [the Network Watcher Virtual Machine Extension](https://docs.microsoft.com/azure/network-watcher/network-watcher-packet-capture-manage-portal#before-you-begin) is installed on the Virtual Machine before capturing can be enabled which can be installed via the `compute.Extension` resource.
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Network`: 2024-05-01
//
// ## Import
//
// Virtual Machine Packet Captures can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:compute/packetCapture:PacketCapture capture1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/networkWatchers/watcher1/packetCaptures/capture1
// ```
type PacketCapture struct {
	pulumi.CustomResourceState

	// One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
	Filters PacketCaptureFilterArrayOutput `pulumi:"filters"`
	// The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
	MaximumBytesPerPacket pulumi.IntPtrOutput `pulumi:"maximumBytesPerPacket"`
	// Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
	MaximumBytesPerSession pulumi.IntPtrOutput `pulumi:"maximumBytesPerSession"`
	// The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
	MaximumCaptureDurationInSeconds pulumi.IntPtrOutput `pulumi:"maximumCaptureDurationInSeconds"`
	// The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The resource ID of the Network Watcher. Changing this forces a new resource to be created.
	NetworkWatcherId pulumi.StringOutput `pulumi:"networkWatcherId"`
	// A `storageLocation` block as defined below. Changing this forces a new resource to be created.
	StorageLocation PacketCaptureStorageLocationOutput `pulumi:"storageLocation"`
	// The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
	VirtualMachineId pulumi.StringOutput `pulumi:"virtualMachineId"`
}

// NewPacketCapture registers a new resource with the given unique name, arguments, and options.
func NewPacketCapture(ctx *pulumi.Context,
	name string, args *PacketCaptureArgs, opts ...pulumi.ResourceOption) (*PacketCapture, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkWatcherId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkWatcherId'")
	}
	if args.StorageLocation == nil {
		return nil, errors.New("invalid value for required argument 'StorageLocation'")
	}
	if args.VirtualMachineId == nil {
		return nil, errors.New("invalid value for required argument 'VirtualMachineId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PacketCapture
	err := ctx.RegisterResource("azure:compute/packetCapture:PacketCapture", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPacketCapture gets an existing PacketCapture resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPacketCapture(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PacketCaptureState, opts ...pulumi.ResourceOption) (*PacketCapture, error) {
	var resource PacketCapture
	err := ctx.ReadResource("azure:compute/packetCapture:PacketCapture", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PacketCapture resources.
type packetCaptureState struct {
	// One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
	Filters []PacketCaptureFilter `pulumi:"filters"`
	// The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
	MaximumBytesPerPacket *int `pulumi:"maximumBytesPerPacket"`
	// Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
	MaximumBytesPerSession *int `pulumi:"maximumBytesPerSession"`
	// The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
	MaximumCaptureDurationInSeconds *int `pulumi:"maximumCaptureDurationInSeconds"`
	// The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The resource ID of the Network Watcher. Changing this forces a new resource to be created.
	NetworkWatcherId *string `pulumi:"networkWatcherId"`
	// A `storageLocation` block as defined below. Changing this forces a new resource to be created.
	StorageLocation *PacketCaptureStorageLocation `pulumi:"storageLocation"`
	// The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
	VirtualMachineId *string `pulumi:"virtualMachineId"`
}

type PacketCaptureState struct {
	// One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
	Filters PacketCaptureFilterArrayInput
	// The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
	MaximumBytesPerPacket pulumi.IntPtrInput
	// Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
	MaximumBytesPerSession pulumi.IntPtrInput
	// The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
	MaximumCaptureDurationInSeconds pulumi.IntPtrInput
	// The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The resource ID of the Network Watcher. Changing this forces a new resource to be created.
	NetworkWatcherId pulumi.StringPtrInput
	// A `storageLocation` block as defined below. Changing this forces a new resource to be created.
	StorageLocation PacketCaptureStorageLocationPtrInput
	// The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
	VirtualMachineId pulumi.StringPtrInput
}

func (PacketCaptureState) ElementType() reflect.Type {
	return reflect.TypeOf((*packetCaptureState)(nil)).Elem()
}

type packetCaptureArgs struct {
	// One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
	Filters []PacketCaptureFilter `pulumi:"filters"`
	// The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
	MaximumBytesPerPacket *int `pulumi:"maximumBytesPerPacket"`
	// Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
	MaximumBytesPerSession *int `pulumi:"maximumBytesPerSession"`
	// The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
	MaximumCaptureDurationInSeconds *int `pulumi:"maximumCaptureDurationInSeconds"`
	// The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The resource ID of the Network Watcher. Changing this forces a new resource to be created.
	NetworkWatcherId string `pulumi:"networkWatcherId"`
	// A `storageLocation` block as defined below. Changing this forces a new resource to be created.
	StorageLocation PacketCaptureStorageLocation `pulumi:"storageLocation"`
	// The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
	VirtualMachineId string `pulumi:"virtualMachineId"`
}

// The set of arguments for constructing a PacketCapture resource.
type PacketCaptureArgs struct {
	// One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
	Filters PacketCaptureFilterArrayInput
	// The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
	MaximumBytesPerPacket pulumi.IntPtrInput
	// Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
	MaximumBytesPerSession pulumi.IntPtrInput
	// The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
	MaximumCaptureDurationInSeconds pulumi.IntPtrInput
	// The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The resource ID of the Network Watcher. Changing this forces a new resource to be created.
	NetworkWatcherId pulumi.StringInput
	// A `storageLocation` block as defined below. Changing this forces a new resource to be created.
	StorageLocation PacketCaptureStorageLocationInput
	// The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
	VirtualMachineId pulumi.StringInput
}

func (PacketCaptureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*packetCaptureArgs)(nil)).Elem()
}

type PacketCaptureInput interface {
	pulumi.Input

	ToPacketCaptureOutput() PacketCaptureOutput
	ToPacketCaptureOutputWithContext(ctx context.Context) PacketCaptureOutput
}

func (*PacketCapture) ElementType() reflect.Type {
	return reflect.TypeOf((**PacketCapture)(nil)).Elem()
}

func (i *PacketCapture) ToPacketCaptureOutput() PacketCaptureOutput {
	return i.ToPacketCaptureOutputWithContext(context.Background())
}

func (i *PacketCapture) ToPacketCaptureOutputWithContext(ctx context.Context) PacketCaptureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PacketCaptureOutput)
}

// PacketCaptureArrayInput is an input type that accepts PacketCaptureArray and PacketCaptureArrayOutput values.
// You can construct a concrete instance of `PacketCaptureArrayInput` via:
//
//	PacketCaptureArray{ PacketCaptureArgs{...} }
type PacketCaptureArrayInput interface {
	pulumi.Input

	ToPacketCaptureArrayOutput() PacketCaptureArrayOutput
	ToPacketCaptureArrayOutputWithContext(context.Context) PacketCaptureArrayOutput
}

type PacketCaptureArray []PacketCaptureInput

func (PacketCaptureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PacketCapture)(nil)).Elem()
}

func (i PacketCaptureArray) ToPacketCaptureArrayOutput() PacketCaptureArrayOutput {
	return i.ToPacketCaptureArrayOutputWithContext(context.Background())
}

func (i PacketCaptureArray) ToPacketCaptureArrayOutputWithContext(ctx context.Context) PacketCaptureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PacketCaptureArrayOutput)
}

// PacketCaptureMapInput is an input type that accepts PacketCaptureMap and PacketCaptureMapOutput values.
// You can construct a concrete instance of `PacketCaptureMapInput` via:
//
//	PacketCaptureMap{ "key": PacketCaptureArgs{...} }
type PacketCaptureMapInput interface {
	pulumi.Input

	ToPacketCaptureMapOutput() PacketCaptureMapOutput
	ToPacketCaptureMapOutputWithContext(context.Context) PacketCaptureMapOutput
}

type PacketCaptureMap map[string]PacketCaptureInput

func (PacketCaptureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PacketCapture)(nil)).Elem()
}

func (i PacketCaptureMap) ToPacketCaptureMapOutput() PacketCaptureMapOutput {
	return i.ToPacketCaptureMapOutputWithContext(context.Background())
}

func (i PacketCaptureMap) ToPacketCaptureMapOutputWithContext(ctx context.Context) PacketCaptureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PacketCaptureMapOutput)
}

type PacketCaptureOutput struct{ *pulumi.OutputState }

func (PacketCaptureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PacketCapture)(nil)).Elem()
}

func (o PacketCaptureOutput) ToPacketCaptureOutput() PacketCaptureOutput {
	return o
}

func (o PacketCaptureOutput) ToPacketCaptureOutputWithContext(ctx context.Context) PacketCaptureOutput {
	return o
}

// One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
func (o PacketCaptureOutput) Filters() PacketCaptureFilterArrayOutput {
	return o.ApplyT(func(v *PacketCapture) PacketCaptureFilterArrayOutput { return v.Filters }).(PacketCaptureFilterArrayOutput)
}

// The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
func (o PacketCaptureOutput) MaximumBytesPerPacket() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PacketCapture) pulumi.IntPtrOutput { return v.MaximumBytesPerPacket }).(pulumi.IntPtrOutput)
}

// Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
func (o PacketCaptureOutput) MaximumBytesPerSession() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PacketCapture) pulumi.IntPtrOutput { return v.MaximumBytesPerSession }).(pulumi.IntPtrOutput)
}

// The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
func (o PacketCaptureOutput) MaximumCaptureDurationInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PacketCapture) pulumi.IntPtrOutput { return v.MaximumCaptureDurationInSeconds }).(pulumi.IntPtrOutput)
}

// The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
func (o PacketCaptureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PacketCapture) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The resource ID of the Network Watcher. Changing this forces a new resource to be created.
func (o PacketCaptureOutput) NetworkWatcherId() pulumi.StringOutput {
	return o.ApplyT(func(v *PacketCapture) pulumi.StringOutput { return v.NetworkWatcherId }).(pulumi.StringOutput)
}

// A `storageLocation` block as defined below. Changing this forces a new resource to be created.
func (o PacketCaptureOutput) StorageLocation() PacketCaptureStorageLocationOutput {
	return o.ApplyT(func(v *PacketCapture) PacketCaptureStorageLocationOutput { return v.StorageLocation }).(PacketCaptureStorageLocationOutput)
}

// The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
func (o PacketCaptureOutput) VirtualMachineId() pulumi.StringOutput {
	return o.ApplyT(func(v *PacketCapture) pulumi.StringOutput { return v.VirtualMachineId }).(pulumi.StringOutput)
}

type PacketCaptureArrayOutput struct{ *pulumi.OutputState }

func (PacketCaptureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PacketCapture)(nil)).Elem()
}

func (o PacketCaptureArrayOutput) ToPacketCaptureArrayOutput() PacketCaptureArrayOutput {
	return o
}

func (o PacketCaptureArrayOutput) ToPacketCaptureArrayOutputWithContext(ctx context.Context) PacketCaptureArrayOutput {
	return o
}

func (o PacketCaptureArrayOutput) Index(i pulumi.IntInput) PacketCaptureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PacketCapture {
		return vs[0].([]*PacketCapture)[vs[1].(int)]
	}).(PacketCaptureOutput)
}

type PacketCaptureMapOutput struct{ *pulumi.OutputState }

func (PacketCaptureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PacketCapture)(nil)).Elem()
}

func (o PacketCaptureMapOutput) ToPacketCaptureMapOutput() PacketCaptureMapOutput {
	return o
}

func (o PacketCaptureMapOutput) ToPacketCaptureMapOutputWithContext(ctx context.Context) PacketCaptureMapOutput {
	return o
}

func (o PacketCaptureMapOutput) MapIndex(k pulumi.StringInput) PacketCaptureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PacketCapture {
		return vs[0].(map[string]*PacketCapture)[vs[1].(string)]
	}).(PacketCaptureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PacketCaptureInput)(nil)).Elem(), &PacketCapture{})
	pulumi.RegisterInputType(reflect.TypeOf((*PacketCaptureArrayInput)(nil)).Elem(), PacketCaptureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PacketCaptureMapInput)(nil)).Elem(), PacketCaptureMap{})
	pulumi.RegisterOutputType(PacketCaptureOutput{})
	pulumi.RegisterOutputType(PacketCaptureArrayOutput{})
	pulumi.RegisterOutputType(PacketCaptureMapOutput{})
}

// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package systemcenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a System Center Virtual Machine Manager Server.
//
// > **Note:** By request of the service team the provider no longer automatically registering the `Microsoft.ScVmm` Resource Provider for this resource. To register it you can run `az provider register --namespace Microsoft.ScVmm`.
//
// > **Note:** This resource depends on an existing `System Center Virtual Machine Manager Host Machine`, `Arc Resource Bridge` and `Custom Location`. Installing and configuring these dependencies is outside the scope of this document. See [Virtual Machine Manager documentation](https://learn.microsoft.com/en-us/system-center/vmm/?view=sc-vmm-2022) and [Install VMM](https://learn.microsoft.com/en-us/system-center/vmm/install?view=sc-vmm-2022) for more details of `System Center Virtual Machine Manager Host Machine`. See [What is Azure Arc resource bridge](https://learn.microsoft.com/en-us/azure/azure-arc/resource-bridge/overview) and [Overview of Arc-enabled System Center Virtual Machine Manager](https://learn.microsoft.com/en-us/azure/azure-arc/system-center-virtual-machine-manager/overview) for more details of `Arc Resource Bridge/Appliance`. See [Create and manage custom locations on Azure Arc-enabled Kubernetes](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/custom-locations) for more details of `Custom Location`. If you encounter issues while configuring, we'd recommend opening a ticket with Microsoft Support.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/systemcenter"
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
//			_, err = systemcenter.NewVirtualMachineManagerServer(ctx, "example", &systemcenter.VirtualMachineManagerServerArgs{
//				Name:              pulumi.String("example-scvmmms"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				CustomLocationId:  pulumi.String("/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.ExtendedLocation/customLocations/customLocation1"),
//				Fqdn:              pulumi.String("example.labtest"),
//				Username:          pulumi.String("testUser"),
//				Password:          pulumi.String("H@Sh1CoR3!"),
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
// * `Microsoft.ScVmm`: 2023-10-07
//
// ## Import
//
// System Center Virtual Machine Manager Servers can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:systemcenter/virtualMachineManagerServer:VirtualMachineManagerServer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.ScVmm/vmmServers/vmmServer1
// ```
type VirtualMachineManagerServer struct {
	pulumi.CustomResourceState

	// The ID of the Custom Location for the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	CustomLocationId pulumi.StringOutput `pulumi:"customLocationId"`
	// The FQDN of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Fqdn pulumi.StringOutput `pulumi:"fqdn"`
	// The Azure Region where the System Center Virtual Machine Manager Server should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The password that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Password pulumi.StringOutput `pulumi:"password"`
	// The port on which the System Center Virtual Machine Manager Server is listening. Possible values are between `1` and `65535`. Changing this forces a new resource to be created.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The name of the Resource Group where the System Center Virtual Machine Manager should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the System Center Virtual Machine Manager Server.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The username that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewVirtualMachineManagerServer registers a new resource with the given unique name, arguments, and options.
func NewVirtualMachineManagerServer(ctx *pulumi.Context,
	name string, args *VirtualMachineManagerServerArgs, opts ...pulumi.ResourceOption) (*VirtualMachineManagerServer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CustomLocationId == nil {
		return nil, errors.New("invalid value for required argument 'CustomLocationId'")
	}
	if args.Fqdn == nil {
		return nil, errors.New("invalid value for required argument 'Fqdn'")
	}
	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualMachineManagerServer
	err := ctx.RegisterResource("azure:systemcenter/virtualMachineManagerServer:VirtualMachineManagerServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualMachineManagerServer gets an existing VirtualMachineManagerServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualMachineManagerServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualMachineManagerServerState, opts ...pulumi.ResourceOption) (*VirtualMachineManagerServer, error) {
	var resource VirtualMachineManagerServer
	err := ctx.ReadResource("azure:systemcenter/virtualMachineManagerServer:VirtualMachineManagerServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualMachineManagerServer resources.
type virtualMachineManagerServerState struct {
	// The ID of the Custom Location for the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	CustomLocationId *string `pulumi:"customLocationId"`
	// The FQDN of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Fqdn *string `pulumi:"fqdn"`
	// The Azure Region where the System Center Virtual Machine Manager Server should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The password that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Password *string `pulumi:"password"`
	// The port on which the System Center Virtual Machine Manager Server is listening. Possible values are between `1` and `65535`. Changing this forces a new resource to be created.
	Port *int `pulumi:"port"`
	// The name of the Resource Group where the System Center Virtual Machine Manager should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the System Center Virtual Machine Manager Server.
	Tags map[string]string `pulumi:"tags"`
	// The username that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Username *string `pulumi:"username"`
}

type VirtualMachineManagerServerState struct {
	// The ID of the Custom Location for the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	CustomLocationId pulumi.StringPtrInput
	// The FQDN of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Fqdn pulumi.StringPtrInput
	// The Azure Region where the System Center Virtual Machine Manager Server should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The password that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Password pulumi.StringPtrInput
	// The port on which the System Center Virtual Machine Manager Server is listening. Possible values are between `1` and `65535`. Changing this forces a new resource to be created.
	Port pulumi.IntPtrInput
	// The name of the Resource Group where the System Center Virtual Machine Manager should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the System Center Virtual Machine Manager Server.
	Tags pulumi.StringMapInput
	// The username that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Username pulumi.StringPtrInput
}

func (VirtualMachineManagerServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualMachineManagerServerState)(nil)).Elem()
}

type virtualMachineManagerServerArgs struct {
	// The ID of the Custom Location for the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	CustomLocationId string `pulumi:"customLocationId"`
	// The FQDN of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Fqdn string `pulumi:"fqdn"`
	// The Azure Region where the System Center Virtual Machine Manager Server should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The password that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Password string `pulumi:"password"`
	// The port on which the System Center Virtual Machine Manager Server is listening. Possible values are between `1` and `65535`. Changing this forces a new resource to be created.
	Port *int `pulumi:"port"`
	// The name of the Resource Group where the System Center Virtual Machine Manager should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the System Center Virtual Machine Manager Server.
	Tags map[string]string `pulumi:"tags"`
	// The username that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a VirtualMachineManagerServer resource.
type VirtualMachineManagerServerArgs struct {
	// The ID of the Custom Location for the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	CustomLocationId pulumi.StringInput
	// The FQDN of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Fqdn pulumi.StringInput
	// The Azure Region where the System Center Virtual Machine Manager Server should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The password that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Password pulumi.StringInput
	// The port on which the System Center Virtual Machine Manager Server is listening. Possible values are between `1` and `65535`. Changing this forces a new resource to be created.
	Port pulumi.IntPtrInput
	// The name of the Resource Group where the System Center Virtual Machine Manager should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the System Center Virtual Machine Manager Server.
	Tags pulumi.StringMapInput
	// The username that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
	Username pulumi.StringInput
}

func (VirtualMachineManagerServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualMachineManagerServerArgs)(nil)).Elem()
}

type VirtualMachineManagerServerInput interface {
	pulumi.Input

	ToVirtualMachineManagerServerOutput() VirtualMachineManagerServerOutput
	ToVirtualMachineManagerServerOutputWithContext(ctx context.Context) VirtualMachineManagerServerOutput
}

func (*VirtualMachineManagerServer) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualMachineManagerServer)(nil)).Elem()
}

func (i *VirtualMachineManagerServer) ToVirtualMachineManagerServerOutput() VirtualMachineManagerServerOutput {
	return i.ToVirtualMachineManagerServerOutputWithContext(context.Background())
}

func (i *VirtualMachineManagerServer) ToVirtualMachineManagerServerOutputWithContext(ctx context.Context) VirtualMachineManagerServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMachineManagerServerOutput)
}

// VirtualMachineManagerServerArrayInput is an input type that accepts VirtualMachineManagerServerArray and VirtualMachineManagerServerArrayOutput values.
// You can construct a concrete instance of `VirtualMachineManagerServerArrayInput` via:
//
//	VirtualMachineManagerServerArray{ VirtualMachineManagerServerArgs{...} }
type VirtualMachineManagerServerArrayInput interface {
	pulumi.Input

	ToVirtualMachineManagerServerArrayOutput() VirtualMachineManagerServerArrayOutput
	ToVirtualMachineManagerServerArrayOutputWithContext(context.Context) VirtualMachineManagerServerArrayOutput
}

type VirtualMachineManagerServerArray []VirtualMachineManagerServerInput

func (VirtualMachineManagerServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualMachineManagerServer)(nil)).Elem()
}

func (i VirtualMachineManagerServerArray) ToVirtualMachineManagerServerArrayOutput() VirtualMachineManagerServerArrayOutput {
	return i.ToVirtualMachineManagerServerArrayOutputWithContext(context.Background())
}

func (i VirtualMachineManagerServerArray) ToVirtualMachineManagerServerArrayOutputWithContext(ctx context.Context) VirtualMachineManagerServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMachineManagerServerArrayOutput)
}

// VirtualMachineManagerServerMapInput is an input type that accepts VirtualMachineManagerServerMap and VirtualMachineManagerServerMapOutput values.
// You can construct a concrete instance of `VirtualMachineManagerServerMapInput` via:
//
//	VirtualMachineManagerServerMap{ "key": VirtualMachineManagerServerArgs{...} }
type VirtualMachineManagerServerMapInput interface {
	pulumi.Input

	ToVirtualMachineManagerServerMapOutput() VirtualMachineManagerServerMapOutput
	ToVirtualMachineManagerServerMapOutputWithContext(context.Context) VirtualMachineManagerServerMapOutput
}

type VirtualMachineManagerServerMap map[string]VirtualMachineManagerServerInput

func (VirtualMachineManagerServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualMachineManagerServer)(nil)).Elem()
}

func (i VirtualMachineManagerServerMap) ToVirtualMachineManagerServerMapOutput() VirtualMachineManagerServerMapOutput {
	return i.ToVirtualMachineManagerServerMapOutputWithContext(context.Background())
}

func (i VirtualMachineManagerServerMap) ToVirtualMachineManagerServerMapOutputWithContext(ctx context.Context) VirtualMachineManagerServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMachineManagerServerMapOutput)
}

type VirtualMachineManagerServerOutput struct{ *pulumi.OutputState }

func (VirtualMachineManagerServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualMachineManagerServer)(nil)).Elem()
}

func (o VirtualMachineManagerServerOutput) ToVirtualMachineManagerServerOutput() VirtualMachineManagerServerOutput {
	return o
}

func (o VirtualMachineManagerServerOutput) ToVirtualMachineManagerServerOutputWithContext(ctx context.Context) VirtualMachineManagerServerOutput {
	return o
}

// The ID of the Custom Location for the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
func (o VirtualMachineManagerServerOutput) CustomLocationId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineManagerServer) pulumi.StringOutput { return v.CustomLocationId }).(pulumi.StringOutput)
}

// The FQDN of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
func (o VirtualMachineManagerServerOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineManagerServer) pulumi.StringOutput { return v.Fqdn }).(pulumi.StringOutput)
}

// The Azure Region where the System Center Virtual Machine Manager Server should exist. Changing this forces a new resource to be created.
func (o VirtualMachineManagerServerOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineManagerServer) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
func (o VirtualMachineManagerServerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineManagerServer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The password that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
func (o VirtualMachineManagerServerOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineManagerServer) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The port on which the System Center Virtual Machine Manager Server is listening. Possible values are between `1` and `65535`. Changing this forces a new resource to be created.
func (o VirtualMachineManagerServerOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *VirtualMachineManagerServer) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// The name of the Resource Group where the System Center Virtual Machine Manager should exist. Changing this forces a new resource to be created.
func (o VirtualMachineManagerServerOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineManagerServer) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the System Center Virtual Machine Manager Server.
func (o VirtualMachineManagerServerOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VirtualMachineManagerServer) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The username that is used to connect to the System Center Virtual Machine Manager Server. Changing this forces a new resource to be created.
func (o VirtualMachineManagerServerOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachineManagerServer) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type VirtualMachineManagerServerArrayOutput struct{ *pulumi.OutputState }

func (VirtualMachineManagerServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualMachineManagerServer)(nil)).Elem()
}

func (o VirtualMachineManagerServerArrayOutput) ToVirtualMachineManagerServerArrayOutput() VirtualMachineManagerServerArrayOutput {
	return o
}

func (o VirtualMachineManagerServerArrayOutput) ToVirtualMachineManagerServerArrayOutputWithContext(ctx context.Context) VirtualMachineManagerServerArrayOutput {
	return o
}

func (o VirtualMachineManagerServerArrayOutput) Index(i pulumi.IntInput) VirtualMachineManagerServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualMachineManagerServer {
		return vs[0].([]*VirtualMachineManagerServer)[vs[1].(int)]
	}).(VirtualMachineManagerServerOutput)
}

type VirtualMachineManagerServerMapOutput struct{ *pulumi.OutputState }

func (VirtualMachineManagerServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualMachineManagerServer)(nil)).Elem()
}

func (o VirtualMachineManagerServerMapOutput) ToVirtualMachineManagerServerMapOutput() VirtualMachineManagerServerMapOutput {
	return o
}

func (o VirtualMachineManagerServerMapOutput) ToVirtualMachineManagerServerMapOutputWithContext(ctx context.Context) VirtualMachineManagerServerMapOutput {
	return o
}

func (o VirtualMachineManagerServerMapOutput) MapIndex(k pulumi.StringInput) VirtualMachineManagerServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualMachineManagerServer {
		return vs[0].(map[string]*VirtualMachineManagerServer)[vs[1].(string)]
	}).(VirtualMachineManagerServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMachineManagerServerInput)(nil)).Elem(), &VirtualMachineManagerServer{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMachineManagerServerArrayInput)(nil)).Elem(), VirtualMachineManagerServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMachineManagerServerMapInput)(nil)).Elem(), VirtualMachineManagerServerMap{})
	pulumi.RegisterOutputType(VirtualMachineManagerServerOutput{})
	pulumi.RegisterOutputType(VirtualMachineManagerServerArrayOutput{})
	pulumi.RegisterOutputType(VirtualMachineManagerServerMapOutput{})
}

// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package elasticsan

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Elastic SAN Volume resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/elasticsan"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-rg"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleElasticSan, err := elasticsan.NewElasticSan(ctx, "example", &elasticsan.ElasticSanArgs{
//				Name:              pulumi.String("example-es"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				BaseSizeInTib:     pulumi.Int(1),
//				Sku: &elasticsan.ElasticSanSkuArgs{
//					Name: pulumi.String("Premium_LRS"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleVolumeGroup, err := elasticsan.NewVolumeGroup(ctx, "example", &elasticsan.VolumeGroupArgs{
//				Name:         pulumi.String("example-esvg"),
//				ElasticSanId: exampleElasticSan.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVolume, err := elasticsan.NewVolume(ctx, "example", &elasticsan.VolumeArgs{
//				Name:          pulumi.String("example-esv"),
//				VolumeGroupId: exampleVolumeGroup.ID(),
//				SizeInGib:     pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("targetIqn", exampleVolume.TargetIqn)
//			return nil
//		})
//	}
//
// ```
//
// ## Example of creating an Elastic SAN Volume from a Disk Snapshot
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/compute"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/elasticsan"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-rg"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleElasticSan, err := elasticsan.NewElasticSan(ctx, "example", &elasticsan.ElasticSanArgs{
//				Name:              pulumi.String("example-es"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				BaseSizeInTib:     pulumi.Int(1),
//				Sku: &elasticsan.ElasticSanSkuArgs{
//					Name: pulumi.String("Premium_LRS"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleVolumeGroup, err := elasticsan.NewVolumeGroup(ctx, "example", &elasticsan.VolumeGroupArgs{
//				Name:         pulumi.String("example-esvg"),
//				ElasticSanId: exampleElasticSan.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleManagedDisk, err := compute.NewManagedDisk(ctx, "example", &compute.ManagedDiskArgs{
//				Name:               pulumi.String("example-disk"),
//				Location:           example.Location,
//				ResourceGroupName:  example.Name,
//				CreateOption:       pulumi.String("Empty"),
//				StorageAccountType: pulumi.String("Standard_LRS"),
//				DiskSizeGb:         pulumi.Int(2),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSnapshot, err := compute.NewSnapshot(ctx, "example", &compute.SnapshotArgs{
//				Name:              pulumi.String("example-ss"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				CreateOption:      pulumi.String("Copy"),
//				SourceUri:         exampleManagedDisk.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = elasticsan.NewVolume(ctx, "example2", &elasticsan.VolumeArgs{
//				Name:          pulumi.String("example-esv2"),
//				VolumeGroupId: exampleVolumeGroup.ID(),
//				SizeInGib:     pulumi.Int(2),
//				CreateSource: &elasticsan.VolumeCreateSourceArgs{
//					SourceType: pulumi.String("DiskSnapshot"),
//					SourceId:   exampleSnapshot.ID(),
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
// * `Microsoft.ElasticSan`: 2023-01-01
//
// ## Import
//
// An existing Elastic SAN Volume can be imported into Pulumi using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:elasticsan/volume:Volume example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.ElasticSan/elasticSans/esan1/volumeGroups/vg1/volumes/vol1
// ```
type Volume struct {
	pulumi.CustomResourceState

	// A `createSource` block as defined below.
	CreateSource VolumeCreateSourcePtrOutput `pulumi:"createSource"`
	// Specifies the name of this Elastic SAN Volume. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the size of the Elastic SAN Volume in GiB. The size should be within the remaining capacity of the parent Elastic SAN. Possible values are between `1` and `65536` (16 TiB).
	//
	// > **Note:** The size can only be increased. If `createSource` is specified, then the size must be equal to or greater than the source's size.
	SizeInGib pulumi.IntOutput `pulumi:"sizeInGib"`
	// The iSCSI Target IQN of the Elastic SAN Volume.
	TargetIqn pulumi.StringOutput `pulumi:"targetIqn"`
	// The iSCSI Target Portal Host Name of the Elastic SAN Volume.
	TargetPortalHostname pulumi.StringOutput `pulumi:"targetPortalHostname"`
	// The iSCSI Target Portal Port of the Elastic SAN Volume.
	TargetPortalPort pulumi.IntOutput `pulumi:"targetPortalPort"`
	// Specifies the Volume Group ID within which this Elastic SAN Volume should exist. Changing this forces a new resource to be created.
	VolumeGroupId pulumi.StringOutput `pulumi:"volumeGroupId"`
	// The UUID of the Elastic SAN Volume.
	VolumeId pulumi.StringOutput `pulumi:"volumeId"`
}

// NewVolume registers a new resource with the given unique name, arguments, and options.
func NewVolume(ctx *pulumi.Context,
	name string, args *VolumeArgs, opts ...pulumi.ResourceOption) (*Volume, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SizeInGib == nil {
		return nil, errors.New("invalid value for required argument 'SizeInGib'")
	}
	if args.VolumeGroupId == nil {
		return nil, errors.New("invalid value for required argument 'VolumeGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Volume
	err := ctx.RegisterResource("azure:elasticsan/volume:Volume", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVolume gets an existing Volume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolume(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VolumeState, opts ...pulumi.ResourceOption) (*Volume, error) {
	var resource Volume
	err := ctx.ReadResource("azure:elasticsan/volume:Volume", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Volume resources.
type volumeState struct {
	// A `createSource` block as defined below.
	CreateSource *VolumeCreateSource `pulumi:"createSource"`
	// Specifies the name of this Elastic SAN Volume. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the size of the Elastic SAN Volume in GiB. The size should be within the remaining capacity of the parent Elastic SAN. Possible values are between `1` and `65536` (16 TiB).
	//
	// > **Note:** The size can only be increased. If `createSource` is specified, then the size must be equal to or greater than the source's size.
	SizeInGib *int `pulumi:"sizeInGib"`
	// The iSCSI Target IQN of the Elastic SAN Volume.
	TargetIqn *string `pulumi:"targetIqn"`
	// The iSCSI Target Portal Host Name of the Elastic SAN Volume.
	TargetPortalHostname *string `pulumi:"targetPortalHostname"`
	// The iSCSI Target Portal Port of the Elastic SAN Volume.
	TargetPortalPort *int `pulumi:"targetPortalPort"`
	// Specifies the Volume Group ID within which this Elastic SAN Volume should exist. Changing this forces a new resource to be created.
	VolumeGroupId *string `pulumi:"volumeGroupId"`
	// The UUID of the Elastic SAN Volume.
	VolumeId *string `pulumi:"volumeId"`
}

type VolumeState struct {
	// A `createSource` block as defined below.
	CreateSource VolumeCreateSourcePtrInput
	// Specifies the name of this Elastic SAN Volume. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the size of the Elastic SAN Volume in GiB. The size should be within the remaining capacity of the parent Elastic SAN. Possible values are between `1` and `65536` (16 TiB).
	//
	// > **Note:** The size can only be increased. If `createSource` is specified, then the size must be equal to or greater than the source's size.
	SizeInGib pulumi.IntPtrInput
	// The iSCSI Target IQN of the Elastic SAN Volume.
	TargetIqn pulumi.StringPtrInput
	// The iSCSI Target Portal Host Name of the Elastic SAN Volume.
	TargetPortalHostname pulumi.StringPtrInput
	// The iSCSI Target Portal Port of the Elastic SAN Volume.
	TargetPortalPort pulumi.IntPtrInput
	// Specifies the Volume Group ID within which this Elastic SAN Volume should exist. Changing this forces a new resource to be created.
	VolumeGroupId pulumi.StringPtrInput
	// The UUID of the Elastic SAN Volume.
	VolumeId pulumi.StringPtrInput
}

func (VolumeState) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeState)(nil)).Elem()
}

type volumeArgs struct {
	// A `createSource` block as defined below.
	CreateSource *VolumeCreateSource `pulumi:"createSource"`
	// Specifies the name of this Elastic SAN Volume. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the size of the Elastic SAN Volume in GiB. The size should be within the remaining capacity of the parent Elastic SAN. Possible values are between `1` and `65536` (16 TiB).
	//
	// > **Note:** The size can only be increased. If `createSource` is specified, then the size must be equal to or greater than the source's size.
	SizeInGib int `pulumi:"sizeInGib"`
	// Specifies the Volume Group ID within which this Elastic SAN Volume should exist. Changing this forces a new resource to be created.
	VolumeGroupId string `pulumi:"volumeGroupId"`
}

// The set of arguments for constructing a Volume resource.
type VolumeArgs struct {
	// A `createSource` block as defined below.
	CreateSource VolumeCreateSourcePtrInput
	// Specifies the name of this Elastic SAN Volume. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the size of the Elastic SAN Volume in GiB. The size should be within the remaining capacity of the parent Elastic SAN. Possible values are between `1` and `65536` (16 TiB).
	//
	// > **Note:** The size can only be increased. If `createSource` is specified, then the size must be equal to or greater than the source's size.
	SizeInGib pulumi.IntInput
	// Specifies the Volume Group ID within which this Elastic SAN Volume should exist. Changing this forces a new resource to be created.
	VolumeGroupId pulumi.StringInput
}

func (VolumeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeArgs)(nil)).Elem()
}

type VolumeInput interface {
	pulumi.Input

	ToVolumeOutput() VolumeOutput
	ToVolumeOutputWithContext(ctx context.Context) VolumeOutput
}

func (*Volume) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil)).Elem()
}

func (i *Volume) ToVolumeOutput() VolumeOutput {
	return i.ToVolumeOutputWithContext(context.Background())
}

func (i *Volume) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeOutput)
}

// VolumeArrayInput is an input type that accepts VolumeArray and VolumeArrayOutput values.
// You can construct a concrete instance of `VolumeArrayInput` via:
//
//	VolumeArray{ VolumeArgs{...} }
type VolumeArrayInput interface {
	pulumi.Input

	ToVolumeArrayOutput() VolumeArrayOutput
	ToVolumeArrayOutputWithContext(context.Context) VolumeArrayOutput
}

type VolumeArray []VolumeInput

func (VolumeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Volume)(nil)).Elem()
}

func (i VolumeArray) ToVolumeArrayOutput() VolumeArrayOutput {
	return i.ToVolumeArrayOutputWithContext(context.Background())
}

func (i VolumeArray) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeArrayOutput)
}

// VolumeMapInput is an input type that accepts VolumeMap and VolumeMapOutput values.
// You can construct a concrete instance of `VolumeMapInput` via:
//
//	VolumeMap{ "key": VolumeArgs{...} }
type VolumeMapInput interface {
	pulumi.Input

	ToVolumeMapOutput() VolumeMapOutput
	ToVolumeMapOutputWithContext(context.Context) VolumeMapOutput
}

type VolumeMap map[string]VolumeInput

func (VolumeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Volume)(nil)).Elem()
}

func (i VolumeMap) ToVolumeMapOutput() VolumeMapOutput {
	return i.ToVolumeMapOutputWithContext(context.Background())
}

func (i VolumeMap) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeMapOutput)
}

type VolumeOutput struct{ *pulumi.OutputState }

func (VolumeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil)).Elem()
}

func (o VolumeOutput) ToVolumeOutput() VolumeOutput {
	return o
}

func (o VolumeOutput) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return o
}

// A `createSource` block as defined below.
func (o VolumeOutput) CreateSource() VolumeCreateSourcePtrOutput {
	return o.ApplyT(func(v *Volume) VolumeCreateSourcePtrOutput { return v.CreateSource }).(VolumeCreateSourcePtrOutput)
}

// Specifies the name of this Elastic SAN Volume. Changing this forces a new resource to be created.
func (o VolumeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the size of the Elastic SAN Volume in GiB. The size should be within the remaining capacity of the parent Elastic SAN. Possible values are between `1` and `65536` (16 TiB).
//
// > **Note:** The size can only be increased. If `createSource` is specified, then the size must be equal to or greater than the source's size.
func (o VolumeOutput) SizeInGib() pulumi.IntOutput {
	return o.ApplyT(func(v *Volume) pulumi.IntOutput { return v.SizeInGib }).(pulumi.IntOutput)
}

// The iSCSI Target IQN of the Elastic SAN Volume.
func (o VolumeOutput) TargetIqn() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.TargetIqn }).(pulumi.StringOutput)
}

// The iSCSI Target Portal Host Name of the Elastic SAN Volume.
func (o VolumeOutput) TargetPortalHostname() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.TargetPortalHostname }).(pulumi.StringOutput)
}

// The iSCSI Target Portal Port of the Elastic SAN Volume.
func (o VolumeOutput) TargetPortalPort() pulumi.IntOutput {
	return o.ApplyT(func(v *Volume) pulumi.IntOutput { return v.TargetPortalPort }).(pulumi.IntOutput)
}

// Specifies the Volume Group ID within which this Elastic SAN Volume should exist. Changing this forces a new resource to be created.
func (o VolumeOutput) VolumeGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.VolumeGroupId }).(pulumi.StringOutput)
}

// The UUID of the Elastic SAN Volume.
func (o VolumeOutput) VolumeId() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.VolumeId }).(pulumi.StringOutput)
}

type VolumeArrayOutput struct{ *pulumi.OutputState }

func (VolumeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Volume)(nil)).Elem()
}

func (o VolumeArrayOutput) ToVolumeArrayOutput() VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) Index(i pulumi.IntInput) VolumeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Volume {
		return vs[0].([]*Volume)[vs[1].(int)]
	}).(VolumeOutput)
}

type VolumeMapOutput struct{ *pulumi.OutputState }

func (VolumeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Volume)(nil)).Elem()
}

func (o VolumeMapOutput) ToVolumeMapOutput() VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) MapIndex(k pulumi.StringInput) VolumeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Volume {
		return vs[0].(map[string]*Volume)[vs[1].(string)]
	}).(VolumeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeInput)(nil)).Elem(), &Volume{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeArrayInput)(nil)).Elem(), VolumeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeMapInput)(nil)).Elem(), VolumeMap{})
	pulumi.RegisterOutputType(VolumeOutput{})
	pulumi.RegisterOutputType(VolumeArrayOutput{})
	pulumi.RegisterOutputType(VolumeMapOutput{})
}

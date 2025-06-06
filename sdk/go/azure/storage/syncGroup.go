// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Storage Sync Group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
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
//			exampleSync, err := storage.NewSync(ctx, "example", &storage.SyncArgs{
//				Name:              pulumi.String("example-ss"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = storage.NewSyncGroup(ctx, "example", &storage.SyncGroupArgs{
//				Name:          pulumi.String("example-ss-group"),
//				StorageSyncId: exampleSync.ID(),
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
// * `Microsoft.StorageSync`: 2020-03-01
//
// ## Import
//
// Storage Sync Groups can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:storage/syncGroup:SyncGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.StorageSync/storageSyncServices/sync1/syncGroups/group1
// ```
type SyncGroup struct {
	pulumi.CustomResourceState

	// The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
	StorageSyncId pulumi.StringOutput `pulumi:"storageSyncId"`
}

// NewSyncGroup registers a new resource with the given unique name, arguments, and options.
func NewSyncGroup(ctx *pulumi.Context,
	name string, args *SyncGroupArgs, opts ...pulumi.ResourceOption) (*SyncGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StorageSyncId == nil {
		return nil, errors.New("invalid value for required argument 'StorageSyncId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SyncGroup
	err := ctx.RegisterResource("azure:storage/syncGroup:SyncGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSyncGroup gets an existing SyncGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSyncGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SyncGroupState, opts ...pulumi.ResourceOption) (*SyncGroup, error) {
	var resource SyncGroup
	err := ctx.ReadResource("azure:storage/syncGroup:SyncGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SyncGroup resources.
type syncGroupState struct {
	// The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
	Name *string `pulumi:"name"`
	// The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
	StorageSyncId *string `pulumi:"storageSyncId"`
}

type SyncGroupState struct {
	// The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
	Name pulumi.StringPtrInput
	// The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
	StorageSyncId pulumi.StringPtrInput
}

func (SyncGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*syncGroupState)(nil)).Elem()
}

type syncGroupArgs struct {
	// The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
	Name *string `pulumi:"name"`
	// The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
	StorageSyncId string `pulumi:"storageSyncId"`
}

// The set of arguments for constructing a SyncGroup resource.
type SyncGroupArgs struct {
	// The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
	Name pulumi.StringPtrInput
	// The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
	StorageSyncId pulumi.StringInput
}

func (SyncGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*syncGroupArgs)(nil)).Elem()
}

type SyncGroupInput interface {
	pulumi.Input

	ToSyncGroupOutput() SyncGroupOutput
	ToSyncGroupOutputWithContext(ctx context.Context) SyncGroupOutput
}

func (*SyncGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**SyncGroup)(nil)).Elem()
}

func (i *SyncGroup) ToSyncGroupOutput() SyncGroupOutput {
	return i.ToSyncGroupOutputWithContext(context.Background())
}

func (i *SyncGroup) ToSyncGroupOutputWithContext(ctx context.Context) SyncGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SyncGroupOutput)
}

// SyncGroupArrayInput is an input type that accepts SyncGroupArray and SyncGroupArrayOutput values.
// You can construct a concrete instance of `SyncGroupArrayInput` via:
//
//	SyncGroupArray{ SyncGroupArgs{...} }
type SyncGroupArrayInput interface {
	pulumi.Input

	ToSyncGroupArrayOutput() SyncGroupArrayOutput
	ToSyncGroupArrayOutputWithContext(context.Context) SyncGroupArrayOutput
}

type SyncGroupArray []SyncGroupInput

func (SyncGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SyncGroup)(nil)).Elem()
}

func (i SyncGroupArray) ToSyncGroupArrayOutput() SyncGroupArrayOutput {
	return i.ToSyncGroupArrayOutputWithContext(context.Background())
}

func (i SyncGroupArray) ToSyncGroupArrayOutputWithContext(ctx context.Context) SyncGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SyncGroupArrayOutput)
}

// SyncGroupMapInput is an input type that accepts SyncGroupMap and SyncGroupMapOutput values.
// You can construct a concrete instance of `SyncGroupMapInput` via:
//
//	SyncGroupMap{ "key": SyncGroupArgs{...} }
type SyncGroupMapInput interface {
	pulumi.Input

	ToSyncGroupMapOutput() SyncGroupMapOutput
	ToSyncGroupMapOutputWithContext(context.Context) SyncGroupMapOutput
}

type SyncGroupMap map[string]SyncGroupInput

func (SyncGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SyncGroup)(nil)).Elem()
}

func (i SyncGroupMap) ToSyncGroupMapOutput() SyncGroupMapOutput {
	return i.ToSyncGroupMapOutputWithContext(context.Background())
}

func (i SyncGroupMap) ToSyncGroupMapOutputWithContext(ctx context.Context) SyncGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SyncGroupMapOutput)
}

type SyncGroupOutput struct{ *pulumi.OutputState }

func (SyncGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SyncGroup)(nil)).Elem()
}

func (o SyncGroupOutput) ToSyncGroupOutput() SyncGroupOutput {
	return o
}

func (o SyncGroupOutput) ToSyncGroupOutputWithContext(ctx context.Context) SyncGroupOutput {
	return o
}

// The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
func (o SyncGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SyncGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
func (o SyncGroupOutput) StorageSyncId() pulumi.StringOutput {
	return o.ApplyT(func(v *SyncGroup) pulumi.StringOutput { return v.StorageSyncId }).(pulumi.StringOutput)
}

type SyncGroupArrayOutput struct{ *pulumi.OutputState }

func (SyncGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SyncGroup)(nil)).Elem()
}

func (o SyncGroupArrayOutput) ToSyncGroupArrayOutput() SyncGroupArrayOutput {
	return o
}

func (o SyncGroupArrayOutput) ToSyncGroupArrayOutputWithContext(ctx context.Context) SyncGroupArrayOutput {
	return o
}

func (o SyncGroupArrayOutput) Index(i pulumi.IntInput) SyncGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SyncGroup {
		return vs[0].([]*SyncGroup)[vs[1].(int)]
	}).(SyncGroupOutput)
}

type SyncGroupMapOutput struct{ *pulumi.OutputState }

func (SyncGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SyncGroup)(nil)).Elem()
}

func (o SyncGroupMapOutput) ToSyncGroupMapOutput() SyncGroupMapOutput {
	return o
}

func (o SyncGroupMapOutput) ToSyncGroupMapOutputWithContext(ctx context.Context) SyncGroupMapOutput {
	return o
}

func (o SyncGroupMapOutput) MapIndex(k pulumi.StringInput) SyncGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SyncGroup {
		return vs[0].(map[string]*SyncGroup)[vs[1].(string)]
	}).(SyncGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SyncGroupInput)(nil)).Elem(), &SyncGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*SyncGroupArrayInput)(nil)).Elem(), SyncGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SyncGroupMapInput)(nil)).Elem(), SyncGroupMap{})
	pulumi.RegisterOutputType(SyncGroupOutput{})
	pulumi.RegisterOutputType(SyncGroupArrayOutput{})
	pulumi.RegisterOutputType(SyncGroupMapOutput{})
}

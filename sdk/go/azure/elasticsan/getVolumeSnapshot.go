// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package elasticsan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Elastic SAN Volume Snapshot.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/elasticsan"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := elasticsan.Get(ctx, &elasticsan.GetArgs{
//				Name:              "existing",
//				ResourceGroupName: "existing",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetVolumeGroup, err := elasticsan.LookupVolumeGroup(ctx, &elasticsan.LookupVolumeGroupArgs{
//				Name:         "existing",
//				ElasticSanId: example.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetVolumeSnapshot, err := elasticsan.GetVolumeSnapshot(ctx, &elasticsan.GetVolumeSnapshotArgs{
//				Name:          "existing",
//				VolumeGroupId: exampleGetVolumeGroup.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", exampleGetVolumeSnapshot.Id)
//			return nil
//		})
//	}
//
// ```
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This data source uses the following Azure API Providers:
//
// * `Microsoft.ElasticSan`: 2023-01-01
func GetVolumeSnapshot(ctx *pulumi.Context, args *GetVolumeSnapshotArgs, opts ...pulumi.InvokeOption) (*GetVolumeSnapshotResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVolumeSnapshotResult
	err := ctx.Invoke("azure:elasticsan/getVolumeSnapshot:getVolumeSnapshot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolumeSnapshot.
type GetVolumeSnapshotArgs struct {
	// The name of the Elastic SAN Volume Snapshot.
	Name string `pulumi:"name"`
	// The Elastic SAN Volume Group ID within which the Elastic SAN Volume Snapshot exists.
	VolumeGroupId string `pulumi:"volumeGroupId"`
}

// A collection of values returned by getVolumeSnapshot.
type GetVolumeSnapshotResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// The resource ID from which the Snapshot is created.
	SourceId string `pulumi:"sourceId"`
	// The size of source volume.
	SourceVolumeSizeInGib int    `pulumi:"sourceVolumeSizeInGib"`
	VolumeGroupId         string `pulumi:"volumeGroupId"`
	// The source volume name of the Snapshot.
	VolumeName string `pulumi:"volumeName"`
}

func GetVolumeSnapshotOutput(ctx *pulumi.Context, args GetVolumeSnapshotOutputArgs, opts ...pulumi.InvokeOption) GetVolumeSnapshotResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetVolumeSnapshotResultOutput, error) {
			args := v.(GetVolumeSnapshotArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:elasticsan/getVolumeSnapshot:getVolumeSnapshot", args, GetVolumeSnapshotResultOutput{}, options).(GetVolumeSnapshotResultOutput), nil
		}).(GetVolumeSnapshotResultOutput)
}

// A collection of arguments for invoking getVolumeSnapshot.
type GetVolumeSnapshotOutputArgs struct {
	// The name of the Elastic SAN Volume Snapshot.
	Name pulumi.StringInput `pulumi:"name"`
	// The Elastic SAN Volume Group ID within which the Elastic SAN Volume Snapshot exists.
	VolumeGroupId pulumi.StringInput `pulumi:"volumeGroupId"`
}

func (GetVolumeSnapshotOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumeSnapshotArgs)(nil)).Elem()
}

// A collection of values returned by getVolumeSnapshot.
type GetVolumeSnapshotResultOutput struct{ *pulumi.OutputState }

func (GetVolumeSnapshotResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumeSnapshotResult)(nil)).Elem()
}

func (o GetVolumeSnapshotResultOutput) ToGetVolumeSnapshotResultOutput() GetVolumeSnapshotResultOutput {
	return o
}

func (o GetVolumeSnapshotResultOutput) ToGetVolumeSnapshotResultOutputWithContext(ctx context.Context) GetVolumeSnapshotResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetVolumeSnapshotResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumeSnapshotResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVolumeSnapshotResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumeSnapshotResult) string { return v.Name }).(pulumi.StringOutput)
}

// The resource ID from which the Snapshot is created.
func (o GetVolumeSnapshotResultOutput) SourceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumeSnapshotResult) string { return v.SourceId }).(pulumi.StringOutput)
}

// The size of source volume.
func (o GetVolumeSnapshotResultOutput) SourceVolumeSizeInGib() pulumi.IntOutput {
	return o.ApplyT(func(v GetVolumeSnapshotResult) int { return v.SourceVolumeSizeInGib }).(pulumi.IntOutput)
}

func (o GetVolumeSnapshotResultOutput) VolumeGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumeSnapshotResult) string { return v.VolumeGroupId }).(pulumi.StringOutput)
}

// The source volume name of the Snapshot.
func (o GetVolumeSnapshotResultOutput) VolumeName() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumeSnapshotResult) string { return v.VolumeName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVolumeSnapshotResultOutput{})
}

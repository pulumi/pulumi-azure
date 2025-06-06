// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Storage Sync Group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := storage.LookupSyncGroup(ctx, &storage.LookupSyncGroupArgs{
//				Name:          "existing-ss-group",
//				StorageSyncId: "existing-ss-id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", example.Id)
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
// * `Microsoft.StorageSync`: 2020-03-01
func LookupSyncGroup(ctx *pulumi.Context, args *LookupSyncGroupArgs, opts ...pulumi.InvokeOption) (*LookupSyncGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSyncGroupResult
	err := ctx.Invoke("azure:storage/getSyncGroup:getSyncGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSyncGroup.
type LookupSyncGroupArgs struct {
	// The name of this Storage Sync Group.
	Name string `pulumi:"name"`
	// The resource ID of the Storage Sync where this Storage Sync Group is.
	StorageSyncId string `pulumi:"storageSyncId"`
}

// A collection of values returned by getSyncGroup.
type LookupSyncGroupResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id            string `pulumi:"id"`
	Name          string `pulumi:"name"`
	StorageSyncId string `pulumi:"storageSyncId"`
}

func LookupSyncGroupOutput(ctx *pulumi.Context, args LookupSyncGroupOutputArgs, opts ...pulumi.InvokeOption) LookupSyncGroupResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSyncGroupResultOutput, error) {
			args := v.(LookupSyncGroupArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:storage/getSyncGroup:getSyncGroup", args, LookupSyncGroupResultOutput{}, options).(LookupSyncGroupResultOutput), nil
		}).(LookupSyncGroupResultOutput)
}

// A collection of arguments for invoking getSyncGroup.
type LookupSyncGroupOutputArgs struct {
	// The name of this Storage Sync Group.
	Name pulumi.StringInput `pulumi:"name"`
	// The resource ID of the Storage Sync where this Storage Sync Group is.
	StorageSyncId pulumi.StringInput `pulumi:"storageSyncId"`
}

func (LookupSyncGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSyncGroupArgs)(nil)).Elem()
}

// A collection of values returned by getSyncGroup.
type LookupSyncGroupResultOutput struct{ *pulumi.OutputState }

func (LookupSyncGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSyncGroupResult)(nil)).Elem()
}

func (o LookupSyncGroupResultOutput) ToLookupSyncGroupResultOutput() LookupSyncGroupResultOutput {
	return o
}

func (o LookupSyncGroupResultOutput) ToLookupSyncGroupResultOutputWithContext(ctx context.Context) LookupSyncGroupResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSyncGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSyncGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSyncGroupResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSyncGroupResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupSyncGroupResultOutput) StorageSyncId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSyncGroupResult) string { return v.StorageSyncId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSyncGroupResultOutput{})
}

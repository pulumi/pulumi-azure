// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datashare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Data Share Data Lake Gen2 Dataset.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/datashare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := datashare.LookupDatasetDataLakeGen2(ctx, &datashare.LookupDatasetDataLakeGen2Args{
//				Name:    "example-dsdlg2ds",
//				ShareId: "example-share-id",
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
// * `Microsoft.DataShare`: 2019-11-01
func LookupDatasetDataLakeGen2(ctx *pulumi.Context, args *LookupDatasetDataLakeGen2Args, opts ...pulumi.InvokeOption) (*LookupDatasetDataLakeGen2Result, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDatasetDataLakeGen2Result
	err := ctx.Invoke("azure:datashare/getDatasetDataLakeGen2:getDatasetDataLakeGen2", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatasetDataLakeGen2.
type LookupDatasetDataLakeGen2Args struct {
	// The name of this Data Share Data Lake Gen2 Dataset.
	Name string `pulumi:"name"`
	// The resource ID of the Data Share where this Data Share Data Lake Gen2 Dataset should be created.
	ShareId string `pulumi:"shareId"`
}

// A collection of values returned by getDatasetDataLakeGen2.
type LookupDatasetDataLakeGen2Result struct {
	// The name of the Data Share Dataset.
	DisplayName string `pulumi:"displayName"`
	// The path of the file in the data lake file system to be shared with the receiver.
	FilePath string `pulumi:"filePath"`
	// The name of the data lake file system to be shared with the receiver.
	FileSystemName string `pulumi:"fileSystemName"`
	// The folder path in the data lake file system to be shared with the receiver.
	FolderPath string `pulumi:"folderPath"`
	// The provider-assigned unique ID for this managed resource.
	Id      string `pulumi:"id"`
	Name    string `pulumi:"name"`
	ShareId string `pulumi:"shareId"`
	// The resource ID of the storage account of the data lake file system to be shared with the receiver.
	StorageAccountId string `pulumi:"storageAccountId"`
}

func LookupDatasetDataLakeGen2Output(ctx *pulumi.Context, args LookupDatasetDataLakeGen2OutputArgs, opts ...pulumi.InvokeOption) LookupDatasetDataLakeGen2ResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDatasetDataLakeGen2ResultOutput, error) {
			args := v.(LookupDatasetDataLakeGen2Args)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:datashare/getDatasetDataLakeGen2:getDatasetDataLakeGen2", args, LookupDatasetDataLakeGen2ResultOutput{}, options).(LookupDatasetDataLakeGen2ResultOutput), nil
		}).(LookupDatasetDataLakeGen2ResultOutput)
}

// A collection of arguments for invoking getDatasetDataLakeGen2.
type LookupDatasetDataLakeGen2OutputArgs struct {
	// The name of this Data Share Data Lake Gen2 Dataset.
	Name pulumi.StringInput `pulumi:"name"`
	// The resource ID of the Data Share where this Data Share Data Lake Gen2 Dataset should be created.
	ShareId pulumi.StringInput `pulumi:"shareId"`
}

func (LookupDatasetDataLakeGen2OutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatasetDataLakeGen2Args)(nil)).Elem()
}

// A collection of values returned by getDatasetDataLakeGen2.
type LookupDatasetDataLakeGen2ResultOutput struct{ *pulumi.OutputState }

func (LookupDatasetDataLakeGen2ResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatasetDataLakeGen2Result)(nil)).Elem()
}

func (o LookupDatasetDataLakeGen2ResultOutput) ToLookupDatasetDataLakeGen2ResultOutput() LookupDatasetDataLakeGen2ResultOutput {
	return o
}

func (o LookupDatasetDataLakeGen2ResultOutput) ToLookupDatasetDataLakeGen2ResultOutputWithContext(ctx context.Context) LookupDatasetDataLakeGen2ResultOutput {
	return o
}

// The name of the Data Share Dataset.
func (o LookupDatasetDataLakeGen2ResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetDataLakeGen2Result) string { return v.DisplayName }).(pulumi.StringOutput)
}

// The path of the file in the data lake file system to be shared with the receiver.
func (o LookupDatasetDataLakeGen2ResultOutput) FilePath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetDataLakeGen2Result) string { return v.FilePath }).(pulumi.StringOutput)
}

// The name of the data lake file system to be shared with the receiver.
func (o LookupDatasetDataLakeGen2ResultOutput) FileSystemName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetDataLakeGen2Result) string { return v.FileSystemName }).(pulumi.StringOutput)
}

// The folder path in the data lake file system to be shared with the receiver.
func (o LookupDatasetDataLakeGen2ResultOutput) FolderPath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetDataLakeGen2Result) string { return v.FolderPath }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatasetDataLakeGen2ResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetDataLakeGen2Result) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDatasetDataLakeGen2ResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetDataLakeGen2Result) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupDatasetDataLakeGen2ResultOutput) ShareId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetDataLakeGen2Result) string { return v.ShareId }).(pulumi.StringOutput)
}

// The resource ID of the storage account of the data lake file system to be shared with the receiver.
func (o LookupDatasetDataLakeGen2ResultOutput) StorageAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatasetDataLakeGen2Result) string { return v.StorageAccountId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatasetDataLakeGen2ResultOutput{})
}

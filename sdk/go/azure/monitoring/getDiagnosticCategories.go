// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about the Monitor Diagnostics Categories supported by an existing Resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/keyvault"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/monitoring"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := keyvault.LookupKeyVault(ctx, &keyvault.LookupKeyVaultArgs{
//				Name:              exampleAzurermKeyVault.Name,
//				ResourceGroupName: exampleAzurermKeyVault.ResourceGroupName,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = monitoring.GetDiagnosticCategories(ctx, &monitoring.GetDiagnosticCategoriesArgs{
//				ResourceId: example.Id,
//			}, nil)
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
// This data source uses the following Azure API Providers:
//
// * `Microsoft.Insights`: 2021-05-01-preview
func GetDiagnosticCategories(ctx *pulumi.Context, args *GetDiagnosticCategoriesArgs, opts ...pulumi.InvokeOption) (*GetDiagnosticCategoriesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDiagnosticCategoriesResult
	err := ctx.Invoke("azure:monitoring/getDiagnosticCategories:getDiagnosticCategories", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDiagnosticCategories.
type GetDiagnosticCategoriesArgs struct {
	// The ID of an existing Resource which Monitor Diagnostics Categories should be retrieved for.
	ResourceId string `pulumi:"resourceId"`
}

// A collection of values returned by getDiagnosticCategories.
type GetDiagnosticCategoriesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of the supported log category groups of this resource to send to the destination.
	LogCategoryGroups []string `pulumi:"logCategoryGroups"`
	// A list of the supported log category types of this resource to send to the destination.
	LogCategoryTypes []string `pulumi:"logCategoryTypes"`
	// A list of the Metric Categories supported for this Resource.
	Metrics    []string `pulumi:"metrics"`
	ResourceId string   `pulumi:"resourceId"`
}

func GetDiagnosticCategoriesOutput(ctx *pulumi.Context, args GetDiagnosticCategoriesOutputArgs, opts ...pulumi.InvokeOption) GetDiagnosticCategoriesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDiagnosticCategoriesResultOutput, error) {
			args := v.(GetDiagnosticCategoriesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:monitoring/getDiagnosticCategories:getDiagnosticCategories", args, GetDiagnosticCategoriesResultOutput{}, options).(GetDiagnosticCategoriesResultOutput), nil
		}).(GetDiagnosticCategoriesResultOutput)
}

// A collection of arguments for invoking getDiagnosticCategories.
type GetDiagnosticCategoriesOutputArgs struct {
	// The ID of an existing Resource which Monitor Diagnostics Categories should be retrieved for.
	ResourceId pulumi.StringInput `pulumi:"resourceId"`
}

func (GetDiagnosticCategoriesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDiagnosticCategoriesArgs)(nil)).Elem()
}

// A collection of values returned by getDiagnosticCategories.
type GetDiagnosticCategoriesResultOutput struct{ *pulumi.OutputState }

func (GetDiagnosticCategoriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDiagnosticCategoriesResult)(nil)).Elem()
}

func (o GetDiagnosticCategoriesResultOutput) ToGetDiagnosticCategoriesResultOutput() GetDiagnosticCategoriesResultOutput {
	return o
}

func (o GetDiagnosticCategoriesResultOutput) ToGetDiagnosticCategoriesResultOutputWithContext(ctx context.Context) GetDiagnosticCategoriesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetDiagnosticCategoriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDiagnosticCategoriesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of the supported log category groups of this resource to send to the destination.
func (o GetDiagnosticCategoriesResultOutput) LogCategoryGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDiagnosticCategoriesResult) []string { return v.LogCategoryGroups }).(pulumi.StringArrayOutput)
}

// A list of the supported log category types of this resource to send to the destination.
func (o GetDiagnosticCategoriesResultOutput) LogCategoryTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDiagnosticCategoriesResult) []string { return v.LogCategoryTypes }).(pulumi.StringArrayOutput)
}

// A list of the Metric Categories supported for this Resource.
func (o GetDiagnosticCategoriesResultOutput) Metrics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDiagnosticCategoriesResult) []string { return v.Metrics }).(pulumi.StringArrayOutput)
}

func (o GetDiagnosticCategoriesResultOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDiagnosticCategoriesResult) string { return v.ResourceId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDiagnosticCategoriesResultOutput{})
}

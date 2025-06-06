// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatedns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/privatedns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := privatedns.NewPTRRecord(ctx, "example", &privatedns.PTRRecordArgs{
//				Name:              pulumi.String("test"),
//				ZoneName:          pulumi.String("test-zone"),
//				ResourceGroupName: pulumi.String("test-rg"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("privateDnsPtrRecordId", exampleAzurermPrivateDnsPtrRecord.Id)
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
// * `Microsoft.Network`: 2024-06-01
func GetPtrRecord(ctx *pulumi.Context, args *GetPtrRecordArgs, opts ...pulumi.InvokeOption) (*GetPtrRecordResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPtrRecordResult
	err := ctx.Invoke("azure:privatedns/getPtrRecord:getPtrRecord", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPtrRecord.
type GetPtrRecordArgs struct {
	// The name of the Private DNS PTR Record.
	Name string `pulumi:"name"`
	// Specifies the resource group where the Private DNS Zone (parent resource) exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Specifies the Private DNS Zone where the resource exists.
	ZoneName string `pulumi:"zoneName"`
}

// A collection of values returned by getPtrRecord.
type GetPtrRecordResult struct {
	// The FQDN of the Private DNS PTR Record.
	Fqdn string `pulumi:"fqdn"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// List of Fully Qualified Domain Names.
	Records           []string `pulumi:"records"`
	ResourceGroupName string   `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The Time To Live (TTL) of the Private DNS record in seconds.
	Ttl      int    `pulumi:"ttl"`
	ZoneName string `pulumi:"zoneName"`
}

func GetPtrRecordOutput(ctx *pulumi.Context, args GetPtrRecordOutputArgs, opts ...pulumi.InvokeOption) GetPtrRecordResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetPtrRecordResultOutput, error) {
			args := v.(GetPtrRecordArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:privatedns/getPtrRecord:getPtrRecord", args, GetPtrRecordResultOutput{}, options).(GetPtrRecordResultOutput), nil
		}).(GetPtrRecordResultOutput)
}

// A collection of arguments for invoking getPtrRecord.
type GetPtrRecordOutputArgs struct {
	// The name of the Private DNS PTR Record.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the resource group where the Private DNS Zone (parent resource) exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
	// Specifies the Private DNS Zone where the resource exists.
	ZoneName pulumi.StringInput `pulumi:"zoneName"`
}

func (GetPtrRecordOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPtrRecordArgs)(nil)).Elem()
}

// A collection of values returned by getPtrRecord.
type GetPtrRecordResultOutput struct{ *pulumi.OutputState }

func (GetPtrRecordResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPtrRecordResult)(nil)).Elem()
}

func (o GetPtrRecordResultOutput) ToGetPtrRecordResultOutput() GetPtrRecordResultOutput {
	return o
}

func (o GetPtrRecordResultOutput) ToGetPtrRecordResultOutputWithContext(ctx context.Context) GetPtrRecordResultOutput {
	return o
}

// The FQDN of the Private DNS PTR Record.
func (o GetPtrRecordResultOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v GetPtrRecordResult) string { return v.Fqdn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPtrRecordResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPtrRecordResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPtrRecordResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetPtrRecordResult) string { return v.Name }).(pulumi.StringOutput)
}

// List of Fully Qualified Domain Names.
func (o GetPtrRecordResultOutput) Records() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPtrRecordResult) []string { return v.Records }).(pulumi.StringArrayOutput)
}

func (o GetPtrRecordResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetPtrRecordResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the resource.
func (o GetPtrRecordResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetPtrRecordResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The Time To Live (TTL) of the Private DNS record in seconds.
func (o GetPtrRecordResultOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v GetPtrRecordResult) int { return v.Ttl }).(pulumi.IntOutput)
}

func (o GetPtrRecordResultOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v GetPtrRecordResult) string { return v.ZoneName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPtrRecordResultOutput{})
}

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
//			_, err := privatedns.NewCnameRecord(ctx, "example", &privatedns.CnameRecordArgs{
//				Name:              pulumi.String("test"),
//				ZoneName:          pulumi.String("test-zone"),
//				ResourceGroupName: pulumi.String("test-rg"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("privateDnsCnameRecordId", exampleAzurermPrivateDnsCnameRecord.Id)
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
func LookupCnameRecord(ctx *pulumi.Context, args *LookupCnameRecordArgs, opts ...pulumi.InvokeOption) (*LookupCnameRecordResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCnameRecordResult
	err := ctx.Invoke("azure:privatedns/getCnameRecord:getCnameRecord", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCnameRecord.
type LookupCnameRecordArgs struct {
	// The name of the Private DNS CNAME Record.
	Name string `pulumi:"name"`
	// Specifies the resource group where the Private DNS Zone (parent resource) exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Specifies the Private DNS Zone where the resource exists.
	ZoneName string `pulumi:"zoneName"`
}

// A collection of values returned by getCnameRecord.
type LookupCnameRecordResult struct {
	// The FQDN of the Private DNS CName Record.
	Fqdn string `pulumi:"fqdn"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// The target of the CNAME.
	Record            string `pulumi:"record"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the resource.
	Tags             map[string]string `pulumi:"tags"`
	TargetResourceId string            `pulumi:"targetResourceId"`
	// The Time To Live (TTL) of the Private DNS record in seconds.
	Ttl      int    `pulumi:"ttl"`
	ZoneName string `pulumi:"zoneName"`
}

func LookupCnameRecordOutput(ctx *pulumi.Context, args LookupCnameRecordOutputArgs, opts ...pulumi.InvokeOption) LookupCnameRecordResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCnameRecordResultOutput, error) {
			args := v.(LookupCnameRecordArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:privatedns/getCnameRecord:getCnameRecord", args, LookupCnameRecordResultOutput{}, options).(LookupCnameRecordResultOutput), nil
		}).(LookupCnameRecordResultOutput)
}

// A collection of arguments for invoking getCnameRecord.
type LookupCnameRecordOutputArgs struct {
	// The name of the Private DNS CNAME Record.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the resource group where the Private DNS Zone (parent resource) exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
	// Specifies the Private DNS Zone where the resource exists.
	ZoneName pulumi.StringInput `pulumi:"zoneName"`
}

func (LookupCnameRecordOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCnameRecordArgs)(nil)).Elem()
}

// A collection of values returned by getCnameRecord.
type LookupCnameRecordResultOutput struct{ *pulumi.OutputState }

func (LookupCnameRecordResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCnameRecordResult)(nil)).Elem()
}

func (o LookupCnameRecordResultOutput) ToLookupCnameRecordResultOutput() LookupCnameRecordResultOutput {
	return o
}

func (o LookupCnameRecordResultOutput) ToLookupCnameRecordResultOutputWithContext(ctx context.Context) LookupCnameRecordResultOutput {
	return o
}

// The FQDN of the Private DNS CName Record.
func (o LookupCnameRecordResultOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCnameRecordResult) string { return v.Fqdn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCnameRecordResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCnameRecordResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCnameRecordResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCnameRecordResult) string { return v.Name }).(pulumi.StringOutput)
}

// The target of the CNAME.
func (o LookupCnameRecordResultOutput) Record() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCnameRecordResult) string { return v.Record }).(pulumi.StringOutput)
}

func (o LookupCnameRecordResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCnameRecordResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the resource.
func (o LookupCnameRecordResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupCnameRecordResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o LookupCnameRecordResultOutput) TargetResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCnameRecordResult) string { return v.TargetResourceId }).(pulumi.StringOutput)
}

// The Time To Live (TTL) of the Private DNS record in seconds.
func (o LookupCnameRecordResultOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v LookupCnameRecordResult) int { return v.Ttl }).(pulumi.IntOutput)
}

func (o LookupCnameRecordResultOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCnameRecordResult) string { return v.ZoneName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCnameRecordResultOutput{})
}

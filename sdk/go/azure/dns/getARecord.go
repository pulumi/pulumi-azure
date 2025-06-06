// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

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
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := dns.LookupARecord(ctx, &dns.LookupARecordArgs{
//				Name:              "test",
//				ZoneName:          "test-zone",
//				ResourceGroupName: "test-rg",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dnsARecordId", example.Id)
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
// * `Microsoft.Network`: 2018-05-01
func LookupARecord(ctx *pulumi.Context, args *LookupARecordArgs, opts ...pulumi.InvokeOption) (*LookupARecordResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupARecordResult
	err := ctx.Invoke("azure:dns/getARecord:getARecord", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getARecord.
type LookupARecordArgs struct {
	// The name of the DNS A Record.
	Name string `pulumi:"name"`
	// Specifies the resource group where the DNS Zone (parent resource) exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Specifies the DNS Zone where the resource exists.
	ZoneName string `pulumi:"zoneName"`
}

// A collection of values returned by getARecord.
type LookupARecordResult struct {
	// The FQDN of the DNS A Record.
	Fqdn string `pulumi:"fqdn"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// List of IPv4 Addresses.
	Records           []string `pulumi:"records"`
	ResourceGroupName string   `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the DNS A Record.
	Tags map[string]string `pulumi:"tags"`
	// The Azure resource id of the target object from where the dns resource value is taken.
	TargetResourceId string `pulumi:"targetResourceId"`
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl      int    `pulumi:"ttl"`
	ZoneName string `pulumi:"zoneName"`
}

func LookupARecordOutput(ctx *pulumi.Context, args LookupARecordOutputArgs, opts ...pulumi.InvokeOption) LookupARecordResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupARecordResultOutput, error) {
			args := v.(LookupARecordArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:dns/getARecord:getARecord", args, LookupARecordResultOutput{}, options).(LookupARecordResultOutput), nil
		}).(LookupARecordResultOutput)
}

// A collection of arguments for invoking getARecord.
type LookupARecordOutputArgs struct {
	// The name of the DNS A Record.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the resource group where the DNS Zone (parent resource) exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
	// Specifies the DNS Zone where the resource exists.
	ZoneName pulumi.StringInput `pulumi:"zoneName"`
}

func (LookupARecordOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupARecordArgs)(nil)).Elem()
}

// A collection of values returned by getARecord.
type LookupARecordResultOutput struct{ *pulumi.OutputState }

func (LookupARecordResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupARecordResult)(nil)).Elem()
}

func (o LookupARecordResultOutput) ToLookupARecordResultOutput() LookupARecordResultOutput {
	return o
}

func (o LookupARecordResultOutput) ToLookupARecordResultOutputWithContext(ctx context.Context) LookupARecordResultOutput {
	return o
}

// The FQDN of the DNS A Record.
func (o LookupARecordResultOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupARecordResult) string { return v.Fqdn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupARecordResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupARecordResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupARecordResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupARecordResult) string { return v.Name }).(pulumi.StringOutput)
}

// List of IPv4 Addresses.
func (o LookupARecordResultOutput) Records() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupARecordResult) []string { return v.Records }).(pulumi.StringArrayOutput)
}

func (o LookupARecordResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupARecordResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the DNS A Record.
func (o LookupARecordResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupARecordResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The Azure resource id of the target object from where the dns resource value is taken.
func (o LookupARecordResultOutput) TargetResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupARecordResult) string { return v.TargetResourceId }).(pulumi.StringOutput)
}

// The Time To Live (TTL) of the DNS record in seconds.
func (o LookupARecordResultOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v LookupARecordResult) int { return v.Ttl }).(pulumi.IntOutput)
}

func (o LookupARecordResultOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupARecordResult) string { return v.ZoneName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupARecordResultOutput{})
}

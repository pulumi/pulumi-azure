// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := dns.NewSrvRecord(ctx, "example", &dns.SrvRecordArgs{
//				ZoneName:          pulumi.String("test-zone"),
//				ResourceGroupName: pulumi.String("test-rg"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("dnsSrvRecordId", example.ID())
//			return nil
//		})
//	}
//
// ```
func LookupSrvRecord(ctx *pulumi.Context, args *LookupSrvRecordArgs, opts ...pulumi.InvokeOption) (*LookupSrvRecordResult, error) {
	var rv LookupSrvRecordResult
	err := ctx.Invoke("azure:dns/getSrvRecord:getSrvRecord", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSrvRecord.
type LookupSrvRecordArgs struct {
	// The name of the DNS SRV Record.
	Name string `pulumi:"name"`
	// Specifies the resource group where the DNS Zone (parent resource) exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Specifies the DNS Zone where the resource exists.
	ZoneName string `pulumi:"zoneName"`
}

// A collection of values returned by getSrvRecord.
type LookupSrvRecordResult struct {
	// The FQDN of the DNS SRV Record.
	Fqdn string `pulumi:"fqdn"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// A list of values that make up the SRV record. Each `record` block supports fields documented below.
	Records           []GetSrvRecordRecord `pulumi:"records"`
	ResourceGroupName string               `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl      int    `pulumi:"ttl"`
	ZoneName string `pulumi:"zoneName"`
}

func LookupSrvRecordOutput(ctx *pulumi.Context, args LookupSrvRecordOutputArgs, opts ...pulumi.InvokeOption) LookupSrvRecordResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSrvRecordResult, error) {
			args := v.(LookupSrvRecordArgs)
			r, err := LookupSrvRecord(ctx, &args, opts...)
			var s LookupSrvRecordResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSrvRecordResultOutput)
}

// A collection of arguments for invoking getSrvRecord.
type LookupSrvRecordOutputArgs struct {
	// The name of the DNS SRV Record.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the resource group where the DNS Zone (parent resource) exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
	// Specifies the DNS Zone where the resource exists.
	ZoneName pulumi.StringInput `pulumi:"zoneName"`
}

func (LookupSrvRecordOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSrvRecordArgs)(nil)).Elem()
}

// A collection of values returned by getSrvRecord.
type LookupSrvRecordResultOutput struct{ *pulumi.OutputState }

func (LookupSrvRecordResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSrvRecordResult)(nil)).Elem()
}

func (o LookupSrvRecordResultOutput) ToLookupSrvRecordResultOutput() LookupSrvRecordResultOutput {
	return o
}

func (o LookupSrvRecordResultOutput) ToLookupSrvRecordResultOutputWithContext(ctx context.Context) LookupSrvRecordResultOutput {
	return o
}

// The FQDN of the DNS SRV Record.
func (o LookupSrvRecordResultOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSrvRecordResult) string { return v.Fqdn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSrvRecordResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSrvRecordResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSrvRecordResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSrvRecordResult) string { return v.Name }).(pulumi.StringOutput)
}

// A list of values that make up the SRV record. Each `record` block supports fields documented below.
func (o LookupSrvRecordResultOutput) Records() GetSrvRecordRecordArrayOutput {
	return o.ApplyT(func(v LookupSrvRecordResult) []GetSrvRecordRecord { return v.Records }).(GetSrvRecordRecordArrayOutput)
}

func (o LookupSrvRecordResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSrvRecordResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the resource.
func (o LookupSrvRecordResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSrvRecordResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The Time To Live (TTL) of the DNS record in seconds.
func (o LookupSrvRecordResultOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSrvRecordResult) int { return v.Ttl }).(pulumi.IntOutput)
}

func (o LookupSrvRecordResultOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSrvRecordResult) string { return v.ZoneName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSrvRecordResultOutput{})
}
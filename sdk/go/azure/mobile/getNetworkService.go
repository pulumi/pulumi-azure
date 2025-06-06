// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mobile

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about a Mobile Network Service.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/mobile"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := mobile.LookupNetwork(ctx, &mobile.LookupNetworkArgs{
//				Name:              "example-mn",
//				ResourceGroupName: "example-rg",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = mobile.NewNetworkService(ctx, "example", &mobile.NetworkServiceArgs{
//				Name:            pulumi.String("example-mns"),
//				MobileNetworkId: pulumi.String(example.Id),
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
// This data source uses the following Azure API Providers:
//
// * `Microsoft.MobileNetwork`: 2022-11-01
func LookupNetworkService(ctx *pulumi.Context, args *LookupNetworkServiceArgs, opts ...pulumi.InvokeOption) (*LookupNetworkServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkServiceResult
	err := ctx.Invoke("azure:mobile/getNetworkService:getNetworkService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkService.
type LookupNetworkServiceArgs struct {
	// Specifies the ID of the Mobile Network Service.
	MobileNetworkId string `pulumi:"mobileNetworkId"`
	// Specifies the name which should be used for this Mobile Network Service.
	Name string `pulumi:"name"`
}

// A collection of values returned by getNetworkService.
type LookupNetworkServiceResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Azure Region where the Mobile Network Service should exist.
	Location        string `pulumi:"location"`
	MobileNetworkId string `pulumi:"mobileNetworkId"`
	// The name of the data flow template. This must be unique within the parent data flow policy rule.
	Name string `pulumi:"name"`
	// A `pccRule` block as defined below. The set of PCC Rules that make up this service.
	PccRules []GetNetworkServicePccRule `pulumi:"pccRules"`
	// A precedence value that is used to decide between services when identifying the QoS values to use for a particular SIM. A lower value means a higher priority.
	ServicePrecedence int `pulumi:"servicePrecedence"`
	// A `serviceQosPolicy` block as defined below. The QoS policy to use for packets matching this service.
	ServiceQosPolicies []GetNetworkServiceServiceQosPolicy `pulumi:"serviceQosPolicies"`
	// A mapping of tags which should be assigned to the Mobile Network Service.
	Tags map[string]string `pulumi:"tags"`
}

func LookupNetworkServiceOutput(ctx *pulumi.Context, args LookupNetworkServiceOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkServiceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNetworkServiceResultOutput, error) {
			args := v.(LookupNetworkServiceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:mobile/getNetworkService:getNetworkService", args, LookupNetworkServiceResultOutput{}, options).(LookupNetworkServiceResultOutput), nil
		}).(LookupNetworkServiceResultOutput)
}

// A collection of arguments for invoking getNetworkService.
type LookupNetworkServiceOutputArgs struct {
	// Specifies the ID of the Mobile Network Service.
	MobileNetworkId pulumi.StringInput `pulumi:"mobileNetworkId"`
	// Specifies the name which should be used for this Mobile Network Service.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupNetworkServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkServiceArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkService.
type LookupNetworkServiceResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkServiceResult)(nil)).Elem()
}

func (o LookupNetworkServiceResultOutput) ToLookupNetworkServiceResultOutput() LookupNetworkServiceResultOutput {
	return o
}

func (o LookupNetworkServiceResultOutput) ToLookupNetworkServiceResultOutputWithContext(ctx context.Context) LookupNetworkServiceResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Azure Region where the Mobile Network Service should exist.
func (o LookupNetworkServiceResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkServiceResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupNetworkServiceResultOutput) MobileNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkServiceResult) string { return v.MobileNetworkId }).(pulumi.StringOutput)
}

// The name of the data flow template. This must be unique within the parent data flow policy rule.
func (o LookupNetworkServiceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkServiceResult) string { return v.Name }).(pulumi.StringOutput)
}

// A `pccRule` block as defined below. The set of PCC Rules that make up this service.
func (o LookupNetworkServiceResultOutput) PccRules() GetNetworkServicePccRuleArrayOutput {
	return o.ApplyT(func(v LookupNetworkServiceResult) []GetNetworkServicePccRule { return v.PccRules }).(GetNetworkServicePccRuleArrayOutput)
}

// A precedence value that is used to decide between services when identifying the QoS values to use for a particular SIM. A lower value means a higher priority.
func (o LookupNetworkServiceResultOutput) ServicePrecedence() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNetworkServiceResult) int { return v.ServicePrecedence }).(pulumi.IntOutput)
}

// A `serviceQosPolicy` block as defined below. The QoS policy to use for packets matching this service.
func (o LookupNetworkServiceResultOutput) ServiceQosPolicies() GetNetworkServiceServiceQosPolicyArrayOutput {
	return o.ApplyT(func(v LookupNetworkServiceResult) []GetNetworkServiceServiceQosPolicy { return v.ServiceQosPolicies }).(GetNetworkServiceServiceQosPolicyArrayOutput)
}

// A mapping of tags which should be assigned to the Mobile Network Service.
func (o LookupNetworkServiceResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNetworkServiceResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkServiceResultOutput{})
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eventgrid

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing EventGrid Domain
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/eventgrid"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := eventgrid.LookupDomain(ctx, &eventgrid.LookupDomainArgs{
// 			Name:              "my-eventgrid-domain",
// 			ResourceGroupName: "example-resources",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("eventgridDomainMappingTopic", example.InputMappingFields[0].Topic)
// 		return nil
// 	})
// }
// ```
func LookupDomain(ctx *pulumi.Context, args *LookupDomainArgs, opts ...pulumi.InvokeOption) (*LookupDomainResult, error) {
	var rv LookupDomainResult
	err := ctx.Invoke("azure:eventgrid/getDomain:getDomain", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomain.
type LookupDomainArgs struct {
	// One or more `inboundIpRule` blocks as defined below.
	InboundIpRules []GetDomainInboundIpRule `pulumi:"inboundIpRules"`
	// The name of the EventGrid Domain resource.
	Name string `pulumi:"name"`
	// Whether or not public network access is allowed for this server.
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// The name of the resource group in which the EventGrid Domain exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the EventGrid Domain.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getDomain.
type LookupDomainResult struct {
	// The Endpoint associated with the EventGrid Domain.
	Endpoint string `pulumi:"endpoint"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// One or more `inboundIpRule` blocks as defined below.
	InboundIpRules []GetDomainInboundIpRule `pulumi:"inboundIpRules"`
	// A `inputMappingDefaultValues` block as defined below.
	InputMappingDefaultValues []GetDomainInputMappingDefaultValue `pulumi:"inputMappingDefaultValues"`
	// A `inputMappingFields` block as defined below.
	InputMappingFields []GetDomainInputMappingField `pulumi:"inputMappingFields"`
	// The schema in which incoming events will be published to this domain. Possible values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`.
	InputSchema string `pulumi:"inputSchema"`
	// The Azure Region in which this EventGrid Domain exists.
	Location         string `pulumi:"location"`
	Name             string `pulumi:"name"`
	PrimaryAccessKey string `pulumi:"primaryAccessKey"`
	// Whether or not public network access is allowed for this server.
	PublicNetworkAccessEnabled *bool  `pulumi:"publicNetworkAccessEnabled"`
	ResourceGroupName          string `pulumi:"resourceGroupName"`
	SecondaryAccessKey         string `pulumi:"secondaryAccessKey"`
	// A mapping of tags assigned to the EventGrid Domain.
	Tags map[string]string `pulumi:"tags"`
}

func LookupDomainOutput(ctx *pulumi.Context, args LookupDomainOutputArgs, opts ...pulumi.InvokeOption) LookupDomainResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDomainResult, error) {
			args := v.(LookupDomainArgs)
			r, err := LookupDomain(ctx, &args, opts...)
			return *r, err
		}).(LookupDomainResultOutput)
}

// A collection of arguments for invoking getDomain.
type LookupDomainOutputArgs struct {
	// One or more `inboundIpRule` blocks as defined below.
	InboundIpRules GetDomainInboundIpRuleArrayInput `pulumi:"inboundIpRules"`
	// The name of the EventGrid Domain resource.
	Name pulumi.StringInput `pulumi:"name"`
	// Whether or not public network access is allowed for this server.
	PublicNetworkAccessEnabled pulumi.BoolPtrInput `pulumi:"publicNetworkAccessEnabled"`
	// The name of the resource group in which the EventGrid Domain exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the EventGrid Domain.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupDomainOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDomainArgs)(nil)).Elem()
}

// A collection of values returned by getDomain.
type LookupDomainResultOutput struct{ *pulumi.OutputState }

func (LookupDomainResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDomainResult)(nil)).Elem()
}

func (o LookupDomainResultOutput) ToLookupDomainResultOutput() LookupDomainResultOutput {
	return o
}

func (o LookupDomainResultOutput) ToLookupDomainResultOutputWithContext(ctx context.Context) LookupDomainResultOutput {
	return o
}

// The Endpoint associated with the EventGrid Domain.
func (o LookupDomainResultOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.Endpoint }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDomainResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.Id }).(pulumi.StringOutput)
}

// One or more `inboundIpRule` blocks as defined below.
func (o LookupDomainResultOutput) InboundIpRules() GetDomainInboundIpRuleArrayOutput {
	return o.ApplyT(func(v LookupDomainResult) []GetDomainInboundIpRule { return v.InboundIpRules }).(GetDomainInboundIpRuleArrayOutput)
}

// A `inputMappingDefaultValues` block as defined below.
func (o LookupDomainResultOutput) InputMappingDefaultValues() GetDomainInputMappingDefaultValueArrayOutput {
	return o.ApplyT(func(v LookupDomainResult) []GetDomainInputMappingDefaultValue { return v.InputMappingDefaultValues }).(GetDomainInputMappingDefaultValueArrayOutput)
}

// A `inputMappingFields` block as defined below.
func (o LookupDomainResultOutput) InputMappingFields() GetDomainInputMappingFieldArrayOutput {
	return o.ApplyT(func(v LookupDomainResult) []GetDomainInputMappingField { return v.InputMappingFields }).(GetDomainInputMappingFieldArrayOutput)
}

// The schema in which incoming events will be published to this domain. Possible values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`.
func (o LookupDomainResultOutput) InputSchema() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.InputSchema }).(pulumi.StringOutput)
}

// The Azure Region in which this EventGrid Domain exists.
func (o LookupDomainResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupDomainResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupDomainResultOutput) PrimaryAccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.PrimaryAccessKey }).(pulumi.StringOutput)
}

// Whether or not public network access is allowed for this server.
func (o LookupDomainResultOutput) PublicNetworkAccessEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupDomainResult) *bool { return v.PublicNetworkAccessEnabled }).(pulumi.BoolPtrOutput)
}

func (o LookupDomainResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

func (o LookupDomainResultOutput) SecondaryAccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.SecondaryAccessKey }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the EventGrid Domain.
func (o LookupDomainResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDomainResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDomainResultOutput{})
}
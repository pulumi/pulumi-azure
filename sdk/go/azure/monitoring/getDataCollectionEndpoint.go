// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Data Collection Endpoint.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/monitoring"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := monitoring.LookupDataCollectionEndpoint(ctx, &monitoring.LookupDataCollectionEndpointArgs{
//				Name:              "example-mdce",
//				ResourceGroupName: exampleAzurermResourceGroup.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("endpointId", example.Id)
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
// * `Microsoft.Insights`: 2023-03-11
func LookupDataCollectionEndpoint(ctx *pulumi.Context, args *LookupDataCollectionEndpointArgs, opts ...pulumi.InvokeOption) (*LookupDataCollectionEndpointResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDataCollectionEndpointResult
	err := ctx.Invoke("azure:monitoring/getDataCollectionEndpoint:getDataCollectionEndpoint", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDataCollectionEndpoint.
type LookupDataCollectionEndpointArgs struct {
	// Specifies the name of the Data Collection Endpoint.
	Name string `pulumi:"name"`
	// Specifies the name of the resource group the Data Collection Endpoint is located in.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getDataCollectionEndpoint.
type LookupDataCollectionEndpointResult struct {
	// The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
	ConfigurationAccessEndpoint string `pulumi:"configurationAccessEndpoint"`
	// Specifies a description for the Data Collection Endpoint.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The immutable ID of the Data Collection Endpoint.
	ImmutableId string `pulumi:"immutableId"`
	// The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
	Kind string `pulumi:"kind"`
	// The Azure Region where the Data Collection Endpoint should exist.
	Location string `pulumi:"location"`
	// The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
	LogsIngestionEndpoint string `pulumi:"logsIngestionEndpoint"`
	// The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
	MetricsIngestionEndpoint string `pulumi:"metricsIngestionEndpoint"`
	Name                     string `pulumi:"name"`
	// Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`.
	PublicNetworkAccessEnabled bool   `pulumi:"publicNetworkAccessEnabled"`
	ResourceGroupName          string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Data Collection Endpoint.
	Tags map[string]string `pulumi:"tags"`
}

func LookupDataCollectionEndpointOutput(ctx *pulumi.Context, args LookupDataCollectionEndpointOutputArgs, opts ...pulumi.InvokeOption) LookupDataCollectionEndpointResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDataCollectionEndpointResultOutput, error) {
			args := v.(LookupDataCollectionEndpointArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:monitoring/getDataCollectionEndpoint:getDataCollectionEndpoint", args, LookupDataCollectionEndpointResultOutput{}, options).(LookupDataCollectionEndpointResultOutput), nil
		}).(LookupDataCollectionEndpointResultOutput)
}

// A collection of arguments for invoking getDataCollectionEndpoint.
type LookupDataCollectionEndpointOutputArgs struct {
	// Specifies the name of the Data Collection Endpoint.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the name of the resource group the Data Collection Endpoint is located in.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupDataCollectionEndpointOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDataCollectionEndpointArgs)(nil)).Elem()
}

// A collection of values returned by getDataCollectionEndpoint.
type LookupDataCollectionEndpointResultOutput struct{ *pulumi.OutputState }

func (LookupDataCollectionEndpointResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDataCollectionEndpointResult)(nil)).Elem()
}

func (o LookupDataCollectionEndpointResultOutput) ToLookupDataCollectionEndpointResultOutput() LookupDataCollectionEndpointResultOutput {
	return o
}

func (o LookupDataCollectionEndpointResultOutput) ToLookupDataCollectionEndpointResultOutputWithContext(ctx context.Context) LookupDataCollectionEndpointResultOutput {
	return o
}

// The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
func (o LookupDataCollectionEndpointResultOutput) ConfigurationAccessEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.ConfigurationAccessEndpoint }).(pulumi.StringOutput)
}

// Specifies a description for the Data Collection Endpoint.
func (o LookupDataCollectionEndpointResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDataCollectionEndpointResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.Id }).(pulumi.StringOutput)
}

// The immutable ID of the Data Collection Endpoint.
func (o LookupDataCollectionEndpointResultOutput) ImmutableId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.ImmutableId }).(pulumi.StringOutput)
}

// The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
func (o LookupDataCollectionEndpointResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.Kind }).(pulumi.StringOutput)
}

// The Azure Region where the Data Collection Endpoint should exist.
func (o LookupDataCollectionEndpointResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.Location }).(pulumi.StringOutput)
}

// The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
func (o LookupDataCollectionEndpointResultOutput) LogsIngestionEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.LogsIngestionEndpoint }).(pulumi.StringOutput)
}

// The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
func (o LookupDataCollectionEndpointResultOutput) MetricsIngestionEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.MetricsIngestionEndpoint }).(pulumi.StringOutput)
}

func (o LookupDataCollectionEndpointResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.Name }).(pulumi.StringOutput)
}

// Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`.
func (o LookupDataCollectionEndpointResultOutput) PublicNetworkAccessEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) bool { return v.PublicNetworkAccessEnabled }).(pulumi.BoolOutput)
}

func (o LookupDataCollectionEndpointResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Data Collection Endpoint.
func (o LookupDataCollectionEndpointResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDataCollectionEndpointResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDataCollectionEndpointResultOutput{})
}

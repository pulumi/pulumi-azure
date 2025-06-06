// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Uses this data source to access information about an existing Virtual Hub Route Table.
//
// ## Virtual Hub Route Table Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := network.LookupVirtualHubRouteTable(ctx, &network.LookupVirtualHubRouteTableArgs{
//				Name:              "example-hub-route-table",
//				ResourceGroupName: "example-resources",
//				VirtualHubName:    "example-hub-name",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("virtualHubRouteTableId", example.Id)
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
// * `Microsoft.Network`: 2024-05-01
func LookupVirtualHubRouteTable(ctx *pulumi.Context, args *LookupVirtualHubRouteTableArgs, opts ...pulumi.InvokeOption) (*LookupVirtualHubRouteTableResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVirtualHubRouteTableResult
	err := ctx.Invoke("azure:network/getVirtualHubRouteTable:getVirtualHubRouteTable", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVirtualHubRouteTable.
type LookupVirtualHubRouteTableArgs struct {
	// The name of the Virtual Hub Route Table.
	Name string `pulumi:"name"`
	// The Name of the Resource Group where the Virtual Hub Route Table exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The name which should be used for Virtual Hub Route Table.
	VirtualHubName string `pulumi:"virtualHubName"`
}

// A collection of values returned by getVirtualHubRouteTable.
type LookupVirtualHubRouteTableResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of labels associated with this route table.
	Labels []string `pulumi:"labels"`
	// The name which is used for this route.
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `route` block as defined below.
	Routes []GetVirtualHubRouteTableRouteType `pulumi:"routes"`
	// The ID of the Virtual Hub within which this route table is created
	VirtualHubId   string `pulumi:"virtualHubId"`
	VirtualHubName string `pulumi:"virtualHubName"`
}

func LookupVirtualHubRouteTableOutput(ctx *pulumi.Context, args LookupVirtualHubRouteTableOutputArgs, opts ...pulumi.InvokeOption) LookupVirtualHubRouteTableResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupVirtualHubRouteTableResultOutput, error) {
			args := v.(LookupVirtualHubRouteTableArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:network/getVirtualHubRouteTable:getVirtualHubRouteTable", args, LookupVirtualHubRouteTableResultOutput{}, options).(LookupVirtualHubRouteTableResultOutput), nil
		}).(LookupVirtualHubRouteTableResultOutput)
}

// A collection of arguments for invoking getVirtualHubRouteTable.
type LookupVirtualHubRouteTableOutputArgs struct {
	// The name of the Virtual Hub Route Table.
	Name pulumi.StringInput `pulumi:"name"`
	// The Name of the Resource Group where the Virtual Hub Route Table exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
	// The name which should be used for Virtual Hub Route Table.
	VirtualHubName pulumi.StringInput `pulumi:"virtualHubName"`
}

func (LookupVirtualHubRouteTableOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVirtualHubRouteTableArgs)(nil)).Elem()
}

// A collection of values returned by getVirtualHubRouteTable.
type LookupVirtualHubRouteTableResultOutput struct{ *pulumi.OutputState }

func (LookupVirtualHubRouteTableResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVirtualHubRouteTableResult)(nil)).Elem()
}

func (o LookupVirtualHubRouteTableResultOutput) ToLookupVirtualHubRouteTableResultOutput() LookupVirtualHubRouteTableResultOutput {
	return o
}

func (o LookupVirtualHubRouteTableResultOutput) ToLookupVirtualHubRouteTableResultOutputWithContext(ctx context.Context) LookupVirtualHubRouteTableResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupVirtualHubRouteTableResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualHubRouteTableResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of labels associated with this route table.
func (o LookupVirtualHubRouteTableResultOutput) Labels() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupVirtualHubRouteTableResult) []string { return v.Labels }).(pulumi.StringArrayOutput)
}

// The name which is used for this route.
func (o LookupVirtualHubRouteTableResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualHubRouteTableResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupVirtualHubRouteTableResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualHubRouteTableResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `route` block as defined below.
func (o LookupVirtualHubRouteTableResultOutput) Routes() GetVirtualHubRouteTableRouteTypeArrayOutput {
	return o.ApplyT(func(v LookupVirtualHubRouteTableResult) []GetVirtualHubRouteTableRouteType { return v.Routes }).(GetVirtualHubRouteTableRouteTypeArrayOutput)
}

// The ID of the Virtual Hub within which this route table is created
func (o LookupVirtualHubRouteTableResultOutput) VirtualHubId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualHubRouteTableResult) string { return v.VirtualHubId }).(pulumi.StringOutput)
}

func (o LookupVirtualHubRouteTableResultOutput) VirtualHubName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualHubRouteTableResult) string { return v.VirtualHubName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVirtualHubRouteTableResultOutput{})
}

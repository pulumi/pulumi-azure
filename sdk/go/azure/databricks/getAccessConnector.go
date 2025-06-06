// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Databricks Access Connector.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := databricks.LookupAccessConnector(ctx, &databricks.LookupAccessConnectorArgs{
//				Name:              "existing",
//				ResourceGroupName: "existing",
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
// * `Microsoft.Databricks`: 2022-10-01-preview
func LookupAccessConnector(ctx *pulumi.Context, args *LookupAccessConnectorArgs, opts ...pulumi.InvokeOption) (*LookupAccessConnectorResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccessConnectorResult
	err := ctx.Invoke("azure:databricks/getAccessConnector:getAccessConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccessConnector.
type LookupAccessConnectorArgs struct {
	// The name of this Databricks Access Connector.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Databricks Access Connector exists. Changing this forces a new Databricks Access Connector to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getAccessConnector.
type LookupAccessConnectorResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A `identity` block as defined below.
	Identities []GetAccessConnectorIdentity `pulumi:"identities"`
	// The Azure Region where the Databricks Access Connector exists.
	Location          string `pulumi:"location"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the Databricks Access Connector.
	Tags map[string]string `pulumi:"tags"`
}

func LookupAccessConnectorOutput(ctx *pulumi.Context, args LookupAccessConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupAccessConnectorResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAccessConnectorResultOutput, error) {
			args := v.(LookupAccessConnectorArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:databricks/getAccessConnector:getAccessConnector", args, LookupAccessConnectorResultOutput{}, options).(LookupAccessConnectorResultOutput), nil
		}).(LookupAccessConnectorResultOutput)
}

// A collection of arguments for invoking getAccessConnector.
type LookupAccessConnectorOutputArgs struct {
	// The name of this Databricks Access Connector.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the Databricks Access Connector exists. Changing this forces a new Databricks Access Connector to be created.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupAccessConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getAccessConnector.
type LookupAccessConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupAccessConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccessConnectorResult)(nil)).Elem()
}

func (o LookupAccessConnectorResultOutput) ToLookupAccessConnectorResultOutput() LookupAccessConnectorResultOutput {
	return o
}

func (o LookupAccessConnectorResultOutput) ToLookupAccessConnectorResultOutputWithContext(ctx context.Context) LookupAccessConnectorResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccessConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// A `identity` block as defined below.
func (o LookupAccessConnectorResultOutput) Identities() GetAccessConnectorIdentityArrayOutput {
	return o.ApplyT(func(v LookupAccessConnectorResult) []GetAccessConnectorIdentity { return v.Identities }).(GetAccessConnectorIdentityArrayOutput)
}

// The Azure Region where the Databricks Access Connector exists.
func (o LookupAccessConnectorResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessConnectorResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupAccessConnectorResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessConnectorResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupAccessConnectorResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccessConnectorResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the Databricks Access Connector.
func (o LookupAccessConnectorResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAccessConnectorResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccessConnectorResultOutput{})
}

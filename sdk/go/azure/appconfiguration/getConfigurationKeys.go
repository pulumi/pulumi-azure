// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appconfiguration

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about existing Azure App Configuration Keys.
//
// > **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/appconfiguration"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		test, err := appconfiguration.GetConfigurationKeys(ctx, &appconfiguration.GetConfigurationKeysArgs{
// 			ConfigurationStoreId: azurerm_app_configuration.Appconf.Id,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("value", test.Items)
// 		return nil
// 	})
// }
// ```
func GetConfigurationKeys(ctx *pulumi.Context, args *GetConfigurationKeysArgs, opts ...pulumi.InvokeOption) (*GetConfigurationKeysResult, error) {
	var rv GetConfigurationKeysResult
	err := ctx.Invoke("azure:appconfiguration/getConfigurationKeys:getConfigurationKeys", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConfigurationKeys.
type GetConfigurationKeysArgs struct {
	// Specifies the id of the App Configuration.
	ConfigurationStoreId string `pulumi:"configurationStoreId"`
	// The name of the App Configuration Keys to look up.
	Key *string `pulumi:"key"`
	// The label of the App Configuration Keys tp look up.
	Label *string `pulumi:"label"`
}

// A collection of values returned by getConfigurationKeys.
type GetConfigurationKeysResult struct {
	ConfigurationStoreId string `pulumi:"configurationStoreId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of `items` blocks as defined below.
	Items []GetConfigurationKeysItem `pulumi:"items"`
	// The name of the App Configuration Key.
	Key *string `pulumi:"key"`
	// The label of the App Configuration Key.
	Label *string `pulumi:"label"`
}

func GetConfigurationKeysOutput(ctx *pulumi.Context, args GetConfigurationKeysOutputArgs, opts ...pulumi.InvokeOption) GetConfigurationKeysResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetConfigurationKeysResult, error) {
			args := v.(GetConfigurationKeysArgs)
			r, err := GetConfigurationKeys(ctx, &args, opts...)
			var s GetConfigurationKeysResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetConfigurationKeysResultOutput)
}

// A collection of arguments for invoking getConfigurationKeys.
type GetConfigurationKeysOutputArgs struct {
	// Specifies the id of the App Configuration.
	ConfigurationStoreId pulumi.StringInput `pulumi:"configurationStoreId"`
	// The name of the App Configuration Keys to look up.
	Key pulumi.StringPtrInput `pulumi:"key"`
	// The label of the App Configuration Keys tp look up.
	Label pulumi.StringPtrInput `pulumi:"label"`
}

func (GetConfigurationKeysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConfigurationKeysArgs)(nil)).Elem()
}

// A collection of values returned by getConfigurationKeys.
type GetConfigurationKeysResultOutput struct{ *pulumi.OutputState }

func (GetConfigurationKeysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConfigurationKeysResult)(nil)).Elem()
}

func (o GetConfigurationKeysResultOutput) ToGetConfigurationKeysResultOutput() GetConfigurationKeysResultOutput {
	return o
}

func (o GetConfigurationKeysResultOutput) ToGetConfigurationKeysResultOutputWithContext(ctx context.Context) GetConfigurationKeysResultOutput {
	return o
}

func (o GetConfigurationKeysResultOutput) ConfigurationStoreId() pulumi.StringOutput {
	return o.ApplyT(func(v GetConfigurationKeysResult) string { return v.ConfigurationStoreId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConfigurationKeysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConfigurationKeysResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of `items` blocks as defined below.
func (o GetConfigurationKeysResultOutput) Items() GetConfigurationKeysItemArrayOutput {
	return o.ApplyT(func(v GetConfigurationKeysResult) []GetConfigurationKeysItem { return v.Items }).(GetConfigurationKeysItemArrayOutput)
}

// The name of the App Configuration Key.
func (o GetConfigurationKeysResultOutput) Key() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConfigurationKeysResult) *string { return v.Key }).(pulumi.StringPtrOutput)
}

// The label of the App Configuration Key.
func (o GetConfigurationKeysResultOutput) Label() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConfigurationKeysResult) *string { return v.Label }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConfigurationKeysResultOutput{})
}
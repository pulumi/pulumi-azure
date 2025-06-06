// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apimanagement

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an API Management API Assignment to a Product.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/apimanagement"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := apimanagement.LookupService(ctx, &apimanagement.LookupServiceArgs{
//				Name:              "example-api",
//				ResourceGroupName: "example-resources",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetApi, err := apimanagement.LookupApi(ctx, &apimanagement.LookupApiArgs{
//				Name:              "search-api",
//				ApiManagementName: example.Name,
//				ResourceGroupName: example.ResourceGroupName,
//				Revision:          "2",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetProduct, err := apimanagement.LookupProduct(ctx, &apimanagement.LookupProductArgs{
//				ProductId:         "my-product",
//				ApiManagementName: example.Name,
//				ResourceGroupName: example.ResourceGroupName,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = apimanagement.NewProductApi(ctx, "example", &apimanagement.ProductApiArgs{
//				ApiName:           pulumi.String(exampleGetApi.Name),
//				ProductId:         pulumi.String(exampleGetProduct.ProductId),
//				ApiManagementName: pulumi.String(example.Name),
//				ResourceGroupName: pulumi.String(example.ResourceGroupName),
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
// This resource uses the following Azure API Providers:
//
// * `Microsoft.ApiManagement`: 2022-08-01
//
// ## Import
//
// API Management Product API's can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:apimanagement/productApi:ProductApi example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/products/exampleId/apis/apiId
// ```
type ProductApi struct {
	pulumi.CustomResourceState

	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName pulumi.StringOutput `pulumi:"apiManagementName"`
	// The Name of the API Management API within the API Management Service. Changing this forces a new resource to be created.
	ApiName pulumi.StringOutput `pulumi:"apiName"`
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId pulumi.StringOutput `pulumi:"productId"`
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
}

// NewProductApi registers a new resource with the given unique name, arguments, and options.
func NewProductApi(ctx *pulumi.Context,
	name string, args *ProductApiArgs, opts ...pulumi.ResourceOption) (*ProductApi, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiManagementName == nil {
		return nil, errors.New("invalid value for required argument 'ApiManagementName'")
	}
	if args.ApiName == nil {
		return nil, errors.New("invalid value for required argument 'ApiName'")
	}
	if args.ProductId == nil {
		return nil, errors.New("invalid value for required argument 'ProductId'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProductApi
	err := ctx.RegisterResource("azure:apimanagement/productApi:ProductApi", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProductApi gets an existing ProductApi resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProductApi(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProductApiState, opts ...pulumi.ResourceOption) (*ProductApi, error) {
	var resource ProductApi
	err := ctx.ReadResource("azure:apimanagement/productApi:ProductApi", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProductApi resources.
type productApiState struct {
	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName *string `pulumi:"apiManagementName"`
	// The Name of the API Management API within the API Management Service. Changing this forces a new resource to be created.
	ApiName *string `pulumi:"apiName"`
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId *string `pulumi:"productId"`
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
}

type ProductApiState struct {
	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName pulumi.StringPtrInput
	// The Name of the API Management API within the API Management Service. Changing this forces a new resource to be created.
	ApiName pulumi.StringPtrInput
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId pulumi.StringPtrInput
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
}

func (ProductApiState) ElementType() reflect.Type {
	return reflect.TypeOf((*productApiState)(nil)).Elem()
}

type productApiArgs struct {
	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName string `pulumi:"apiManagementName"`
	// The Name of the API Management API within the API Management Service. Changing this forces a new resource to be created.
	ApiName string `pulumi:"apiName"`
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId string `pulumi:"productId"`
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// The set of arguments for constructing a ProductApi resource.
type ProductApiArgs struct {
	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName pulumi.StringInput
	// The Name of the API Management API within the API Management Service. Changing this forces a new resource to be created.
	ApiName pulumi.StringInput
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId pulumi.StringInput
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
}

func (ProductApiArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*productApiArgs)(nil)).Elem()
}

type ProductApiInput interface {
	pulumi.Input

	ToProductApiOutput() ProductApiOutput
	ToProductApiOutputWithContext(ctx context.Context) ProductApiOutput
}

func (*ProductApi) ElementType() reflect.Type {
	return reflect.TypeOf((**ProductApi)(nil)).Elem()
}

func (i *ProductApi) ToProductApiOutput() ProductApiOutput {
	return i.ToProductApiOutputWithContext(context.Background())
}

func (i *ProductApi) ToProductApiOutputWithContext(ctx context.Context) ProductApiOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductApiOutput)
}

// ProductApiArrayInput is an input type that accepts ProductApiArray and ProductApiArrayOutput values.
// You can construct a concrete instance of `ProductApiArrayInput` via:
//
//	ProductApiArray{ ProductApiArgs{...} }
type ProductApiArrayInput interface {
	pulumi.Input

	ToProductApiArrayOutput() ProductApiArrayOutput
	ToProductApiArrayOutputWithContext(context.Context) ProductApiArrayOutput
}

type ProductApiArray []ProductApiInput

func (ProductApiArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProductApi)(nil)).Elem()
}

func (i ProductApiArray) ToProductApiArrayOutput() ProductApiArrayOutput {
	return i.ToProductApiArrayOutputWithContext(context.Background())
}

func (i ProductApiArray) ToProductApiArrayOutputWithContext(ctx context.Context) ProductApiArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductApiArrayOutput)
}

// ProductApiMapInput is an input type that accepts ProductApiMap and ProductApiMapOutput values.
// You can construct a concrete instance of `ProductApiMapInput` via:
//
//	ProductApiMap{ "key": ProductApiArgs{...} }
type ProductApiMapInput interface {
	pulumi.Input

	ToProductApiMapOutput() ProductApiMapOutput
	ToProductApiMapOutputWithContext(context.Context) ProductApiMapOutput
}

type ProductApiMap map[string]ProductApiInput

func (ProductApiMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProductApi)(nil)).Elem()
}

func (i ProductApiMap) ToProductApiMapOutput() ProductApiMapOutput {
	return i.ToProductApiMapOutputWithContext(context.Background())
}

func (i ProductApiMap) ToProductApiMapOutputWithContext(ctx context.Context) ProductApiMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductApiMapOutput)
}

type ProductApiOutput struct{ *pulumi.OutputState }

func (ProductApiOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProductApi)(nil)).Elem()
}

func (o ProductApiOutput) ToProductApiOutput() ProductApiOutput {
	return o
}

func (o ProductApiOutput) ToProductApiOutputWithContext(ctx context.Context) ProductApiOutput {
	return o
}

// The name of the API Management Service. Changing this forces a new resource to be created.
func (o ProductApiOutput) ApiManagementName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductApi) pulumi.StringOutput { return v.ApiManagementName }).(pulumi.StringOutput)
}

// The Name of the API Management API within the API Management Service. Changing this forces a new resource to be created.
func (o ProductApiOutput) ApiName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductApi) pulumi.StringOutput { return v.ApiName }).(pulumi.StringOutput)
}

// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
func (o ProductApiOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductApi) pulumi.StringOutput { return v.ProductId }).(pulumi.StringOutput)
}

// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
func (o ProductApiOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductApi) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

type ProductApiArrayOutput struct{ *pulumi.OutputState }

func (ProductApiArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProductApi)(nil)).Elem()
}

func (o ProductApiArrayOutput) ToProductApiArrayOutput() ProductApiArrayOutput {
	return o
}

func (o ProductApiArrayOutput) ToProductApiArrayOutputWithContext(ctx context.Context) ProductApiArrayOutput {
	return o
}

func (o ProductApiArrayOutput) Index(i pulumi.IntInput) ProductApiOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProductApi {
		return vs[0].([]*ProductApi)[vs[1].(int)]
	}).(ProductApiOutput)
}

type ProductApiMapOutput struct{ *pulumi.OutputState }

func (ProductApiMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProductApi)(nil)).Elem()
}

func (o ProductApiMapOutput) ToProductApiMapOutput() ProductApiMapOutput {
	return o
}

func (o ProductApiMapOutput) ToProductApiMapOutputWithContext(ctx context.Context) ProductApiMapOutput {
	return o
}

func (o ProductApiMapOutput) MapIndex(k pulumi.StringInput) ProductApiOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProductApi {
		return vs[0].(map[string]*ProductApi)[vs[1].(string)]
	}).(ProductApiOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProductApiInput)(nil)).Elem(), &ProductApi{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProductApiArrayInput)(nil)).Elem(), ProductApiArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProductApiMapInput)(nil)).Elem(), ProductApiMap{})
	pulumi.RegisterOutputType(ProductApiOutput{})
	pulumi.RegisterOutputType(ProductApiArrayOutput{})
	pulumi.RegisterOutputType(ProductApiMapOutput{})
}

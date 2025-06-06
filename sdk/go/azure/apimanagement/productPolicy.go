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

// Manages an API Management Product Policy
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
//			example, err := apimanagement.LookupProduct(ctx, &apimanagement.LookupProductArgs{
//				ProductId:         "my-product",
//				ApiManagementName: "example-apim",
//				ResourceGroupName: "search-service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = apimanagement.NewProductPolicy(ctx, "example", &apimanagement.ProductPolicyArgs{
//				ProductId:         pulumi.String(example.ProductId),
//				ApiManagementName: pulumi.String(example.ApiManagementName),
//				ResourceGroupName: pulumi.String(example.ResourceGroupName),
//				XmlContent: pulumi.String(`<policies>
//	  <inbound>
//	    <find-and-replace from="xyz" to="abc" />
//	  </inbound>
//
// </policies>
// `),
//
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
// API Management Product Policy can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:apimanagement/productPolicy:ProductPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/products/product1
// ```
type ProductPolicy struct {
	pulumi.CustomResourceState

	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName pulumi.StringOutput `pulumi:"apiManagementName"`
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId pulumi.StringOutput `pulumi:"productId"`
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The XML Content for this Policy.
	XmlContent pulumi.StringOutput `pulumi:"xmlContent"`
	// A link to a Policy XML Document, which must be publicly available.
	XmlLink pulumi.StringPtrOutput `pulumi:"xmlLink"`
}

// NewProductPolicy registers a new resource with the given unique name, arguments, and options.
func NewProductPolicy(ctx *pulumi.Context,
	name string, args *ProductPolicyArgs, opts ...pulumi.ResourceOption) (*ProductPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiManagementName == nil {
		return nil, errors.New("invalid value for required argument 'ApiManagementName'")
	}
	if args.ProductId == nil {
		return nil, errors.New("invalid value for required argument 'ProductId'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProductPolicy
	err := ctx.RegisterResource("azure:apimanagement/productPolicy:ProductPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProductPolicy gets an existing ProductPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProductPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProductPolicyState, opts ...pulumi.ResourceOption) (*ProductPolicy, error) {
	var resource ProductPolicy
	err := ctx.ReadResource("azure:apimanagement/productPolicy:ProductPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProductPolicy resources.
type productPolicyState struct {
	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName *string `pulumi:"apiManagementName"`
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId *string `pulumi:"productId"`
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The XML Content for this Policy.
	XmlContent *string `pulumi:"xmlContent"`
	// A link to a Policy XML Document, which must be publicly available.
	XmlLink *string `pulumi:"xmlLink"`
}

type ProductPolicyState struct {
	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName pulumi.StringPtrInput
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId pulumi.StringPtrInput
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The XML Content for this Policy.
	XmlContent pulumi.StringPtrInput
	// A link to a Policy XML Document, which must be publicly available.
	XmlLink pulumi.StringPtrInput
}

func (ProductPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*productPolicyState)(nil)).Elem()
}

type productPolicyArgs struct {
	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName string `pulumi:"apiManagementName"`
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId string `pulumi:"productId"`
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The XML Content for this Policy.
	XmlContent *string `pulumi:"xmlContent"`
	// A link to a Policy XML Document, which must be publicly available.
	XmlLink *string `pulumi:"xmlLink"`
}

// The set of arguments for constructing a ProductPolicy resource.
type ProductPolicyArgs struct {
	// The name of the API Management Service. Changing this forces a new resource to be created.
	ApiManagementName pulumi.StringInput
	// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
	ProductId pulumi.StringInput
	// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The XML Content for this Policy.
	XmlContent pulumi.StringPtrInput
	// A link to a Policy XML Document, which must be publicly available.
	XmlLink pulumi.StringPtrInput
}

func (ProductPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*productPolicyArgs)(nil)).Elem()
}

type ProductPolicyInput interface {
	pulumi.Input

	ToProductPolicyOutput() ProductPolicyOutput
	ToProductPolicyOutputWithContext(ctx context.Context) ProductPolicyOutput
}

func (*ProductPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ProductPolicy)(nil)).Elem()
}

func (i *ProductPolicy) ToProductPolicyOutput() ProductPolicyOutput {
	return i.ToProductPolicyOutputWithContext(context.Background())
}

func (i *ProductPolicy) ToProductPolicyOutputWithContext(ctx context.Context) ProductPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductPolicyOutput)
}

// ProductPolicyArrayInput is an input type that accepts ProductPolicyArray and ProductPolicyArrayOutput values.
// You can construct a concrete instance of `ProductPolicyArrayInput` via:
//
//	ProductPolicyArray{ ProductPolicyArgs{...} }
type ProductPolicyArrayInput interface {
	pulumi.Input

	ToProductPolicyArrayOutput() ProductPolicyArrayOutput
	ToProductPolicyArrayOutputWithContext(context.Context) ProductPolicyArrayOutput
}

type ProductPolicyArray []ProductPolicyInput

func (ProductPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProductPolicy)(nil)).Elem()
}

func (i ProductPolicyArray) ToProductPolicyArrayOutput() ProductPolicyArrayOutput {
	return i.ToProductPolicyArrayOutputWithContext(context.Background())
}

func (i ProductPolicyArray) ToProductPolicyArrayOutputWithContext(ctx context.Context) ProductPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductPolicyArrayOutput)
}

// ProductPolicyMapInput is an input type that accepts ProductPolicyMap and ProductPolicyMapOutput values.
// You can construct a concrete instance of `ProductPolicyMapInput` via:
//
//	ProductPolicyMap{ "key": ProductPolicyArgs{...} }
type ProductPolicyMapInput interface {
	pulumi.Input

	ToProductPolicyMapOutput() ProductPolicyMapOutput
	ToProductPolicyMapOutputWithContext(context.Context) ProductPolicyMapOutput
}

type ProductPolicyMap map[string]ProductPolicyInput

func (ProductPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProductPolicy)(nil)).Elem()
}

func (i ProductPolicyMap) ToProductPolicyMapOutput() ProductPolicyMapOutput {
	return i.ToProductPolicyMapOutputWithContext(context.Background())
}

func (i ProductPolicyMap) ToProductPolicyMapOutputWithContext(ctx context.Context) ProductPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductPolicyMapOutput)
}

type ProductPolicyOutput struct{ *pulumi.OutputState }

func (ProductPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProductPolicy)(nil)).Elem()
}

func (o ProductPolicyOutput) ToProductPolicyOutput() ProductPolicyOutput {
	return o
}

func (o ProductPolicyOutput) ToProductPolicyOutputWithContext(ctx context.Context) ProductPolicyOutput {
	return o
}

// The name of the API Management Service. Changing this forces a new resource to be created.
func (o ProductPolicyOutput) ApiManagementName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductPolicy) pulumi.StringOutput { return v.ApiManagementName }).(pulumi.StringOutput)
}

// The ID of the API Management Product within the API Management Service. Changing this forces a new resource to be created.
func (o ProductPolicyOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductPolicy) pulumi.StringOutput { return v.ProductId }).(pulumi.StringOutput)
}

// The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
func (o ProductPolicyOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductPolicy) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The XML Content for this Policy.
func (o ProductPolicyOutput) XmlContent() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductPolicy) pulumi.StringOutput { return v.XmlContent }).(pulumi.StringOutput)
}

// A link to a Policy XML Document, which must be publicly available.
func (o ProductPolicyOutput) XmlLink() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProductPolicy) pulumi.StringPtrOutput { return v.XmlLink }).(pulumi.StringPtrOutput)
}

type ProductPolicyArrayOutput struct{ *pulumi.OutputState }

func (ProductPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProductPolicy)(nil)).Elem()
}

func (o ProductPolicyArrayOutput) ToProductPolicyArrayOutput() ProductPolicyArrayOutput {
	return o
}

func (o ProductPolicyArrayOutput) ToProductPolicyArrayOutputWithContext(ctx context.Context) ProductPolicyArrayOutput {
	return o
}

func (o ProductPolicyArrayOutput) Index(i pulumi.IntInput) ProductPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProductPolicy {
		return vs[0].([]*ProductPolicy)[vs[1].(int)]
	}).(ProductPolicyOutput)
}

type ProductPolicyMapOutput struct{ *pulumi.OutputState }

func (ProductPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProductPolicy)(nil)).Elem()
}

func (o ProductPolicyMapOutput) ToProductPolicyMapOutput() ProductPolicyMapOutput {
	return o
}

func (o ProductPolicyMapOutput) ToProductPolicyMapOutputWithContext(ctx context.Context) ProductPolicyMapOutput {
	return o
}

func (o ProductPolicyMapOutput) MapIndex(k pulumi.StringInput) ProductPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProductPolicy {
		return vs[0].(map[string]*ProductPolicy)[vs[1].(string)]
	}).(ProductPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProductPolicyInput)(nil)).Elem(), &ProductPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProductPolicyArrayInput)(nil)).Elem(), ProductPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProductPolicyMapInput)(nil)).Elem(), ProductPolicyMap{})
	pulumi.RegisterOutputType(ProductPolicyOutput{})
	pulumi.RegisterOutputType(ProductPolicyArrayOutput{})
	pulumi.RegisterOutputType(ProductPolicyMapOutput{})
}

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

// Manages an API Schema within an API Management Service.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/apimanagement"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := apimanagement.LookupApi(ctx, &apimanagement.LookupApiArgs{
//				Name:              "search-api",
//				ApiManagementName: "search-api-management",
//				ResourceGroupName: "search-service",
//				Revision:          "2",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			invokeFile, err := std.File(ctx, &std.FileArgs{
//				Input: "api_management_api_schema.xml",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = apimanagement.NewApiSchema(ctx, "example", &apimanagement.ApiSchemaArgs{
//				ApiName:           pulumi.String(example.Name),
//				ApiManagementName: pulumi.String(example.ApiManagementName),
//				ResourceGroupName: pulumi.String(example.ResourceGroupName),
//				SchemaId:          pulumi.String("example-schema"),
//				ContentType:       pulumi.String("application/vnd.ms-azure-apim.xsd+xml"),
//				Value:             pulumi.String(invokeFile.Result),
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
// API Management API Schema's can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:apimanagement/apiSchema:ApiSchema example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/apis/api1/schemas/schema1
// ```
type ApiSchema struct {
	pulumi.CustomResourceState

	// The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
	ApiManagementName pulumi.StringOutput `pulumi:"apiManagementName"`
	// The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
	ApiName pulumi.StringOutput `pulumi:"apiName"`
	// Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
	Components pulumi.StringPtrOutput `pulumi:"components"`
	// The content type of the API Schema.
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// Types definitions. Used for Swagger/OpenAPI v1 schemas only.
	Definitions pulumi.StringPtrOutput `pulumi:"definitions"`
	// The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A unique identifier for this API Schema. Changing this forces a new resource to be created.
	SchemaId pulumi.StringOutput `pulumi:"schemaId"`
	// The JSON escaped string defining the document representing the Schema.
	Value pulumi.StringPtrOutput `pulumi:"value"`
}

// NewApiSchema registers a new resource with the given unique name, arguments, and options.
func NewApiSchema(ctx *pulumi.Context,
	name string, args *ApiSchemaArgs, opts ...pulumi.ResourceOption) (*ApiSchema, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiManagementName == nil {
		return nil, errors.New("invalid value for required argument 'ApiManagementName'")
	}
	if args.ApiName == nil {
		return nil, errors.New("invalid value for required argument 'ApiName'")
	}
	if args.ContentType == nil {
		return nil, errors.New("invalid value for required argument 'ContentType'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.SchemaId == nil {
		return nil, errors.New("invalid value for required argument 'SchemaId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApiSchema
	err := ctx.RegisterResource("azure:apimanagement/apiSchema:ApiSchema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiSchema gets an existing ApiSchema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiSchemaState, opts ...pulumi.ResourceOption) (*ApiSchema, error) {
	var resource ApiSchema
	err := ctx.ReadResource("azure:apimanagement/apiSchema:ApiSchema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiSchema resources.
type apiSchemaState struct {
	// The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
	ApiManagementName *string `pulumi:"apiManagementName"`
	// The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
	ApiName *string `pulumi:"apiName"`
	// Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
	Components *string `pulumi:"components"`
	// The content type of the API Schema.
	ContentType *string `pulumi:"contentType"`
	// Types definitions. Used for Swagger/OpenAPI v1 schemas only.
	Definitions *string `pulumi:"definitions"`
	// The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A unique identifier for this API Schema. Changing this forces a new resource to be created.
	SchemaId *string `pulumi:"schemaId"`
	// The JSON escaped string defining the document representing the Schema.
	Value *string `pulumi:"value"`
}

type ApiSchemaState struct {
	// The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
	ApiManagementName pulumi.StringPtrInput
	// The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
	ApiName pulumi.StringPtrInput
	// Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
	Components pulumi.StringPtrInput
	// The content type of the API Schema.
	ContentType pulumi.StringPtrInput
	// Types definitions. Used for Swagger/OpenAPI v1 schemas only.
	Definitions pulumi.StringPtrInput
	// The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A unique identifier for this API Schema. Changing this forces a new resource to be created.
	SchemaId pulumi.StringPtrInput
	// The JSON escaped string defining the document representing the Schema.
	Value pulumi.StringPtrInput
}

func (ApiSchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiSchemaState)(nil)).Elem()
}

type apiSchemaArgs struct {
	// The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
	ApiManagementName string `pulumi:"apiManagementName"`
	// The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
	ApiName string `pulumi:"apiName"`
	// Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
	Components *string `pulumi:"components"`
	// The content type of the API Schema.
	ContentType string `pulumi:"contentType"`
	// Types definitions. Used for Swagger/OpenAPI v1 schemas only.
	Definitions *string `pulumi:"definitions"`
	// The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A unique identifier for this API Schema. Changing this forces a new resource to be created.
	SchemaId string `pulumi:"schemaId"`
	// The JSON escaped string defining the document representing the Schema.
	Value *string `pulumi:"value"`
}

// The set of arguments for constructing a ApiSchema resource.
type ApiSchemaArgs struct {
	// The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
	ApiManagementName pulumi.StringInput
	// The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
	ApiName pulumi.StringInput
	// Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
	Components pulumi.StringPtrInput
	// The content type of the API Schema.
	ContentType pulumi.StringInput
	// Types definitions. Used for Swagger/OpenAPI v1 schemas only.
	Definitions pulumi.StringPtrInput
	// The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A unique identifier for this API Schema. Changing this forces a new resource to be created.
	SchemaId pulumi.StringInput
	// The JSON escaped string defining the document representing the Schema.
	Value pulumi.StringPtrInput
}

func (ApiSchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiSchemaArgs)(nil)).Elem()
}

type ApiSchemaInput interface {
	pulumi.Input

	ToApiSchemaOutput() ApiSchemaOutput
	ToApiSchemaOutputWithContext(ctx context.Context) ApiSchemaOutput
}

func (*ApiSchema) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiSchema)(nil)).Elem()
}

func (i *ApiSchema) ToApiSchemaOutput() ApiSchemaOutput {
	return i.ToApiSchemaOutputWithContext(context.Background())
}

func (i *ApiSchema) ToApiSchemaOutputWithContext(ctx context.Context) ApiSchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiSchemaOutput)
}

// ApiSchemaArrayInput is an input type that accepts ApiSchemaArray and ApiSchemaArrayOutput values.
// You can construct a concrete instance of `ApiSchemaArrayInput` via:
//
//	ApiSchemaArray{ ApiSchemaArgs{...} }
type ApiSchemaArrayInput interface {
	pulumi.Input

	ToApiSchemaArrayOutput() ApiSchemaArrayOutput
	ToApiSchemaArrayOutputWithContext(context.Context) ApiSchemaArrayOutput
}

type ApiSchemaArray []ApiSchemaInput

func (ApiSchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiSchema)(nil)).Elem()
}

func (i ApiSchemaArray) ToApiSchemaArrayOutput() ApiSchemaArrayOutput {
	return i.ToApiSchemaArrayOutputWithContext(context.Background())
}

func (i ApiSchemaArray) ToApiSchemaArrayOutputWithContext(ctx context.Context) ApiSchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiSchemaArrayOutput)
}

// ApiSchemaMapInput is an input type that accepts ApiSchemaMap and ApiSchemaMapOutput values.
// You can construct a concrete instance of `ApiSchemaMapInput` via:
//
//	ApiSchemaMap{ "key": ApiSchemaArgs{...} }
type ApiSchemaMapInput interface {
	pulumi.Input

	ToApiSchemaMapOutput() ApiSchemaMapOutput
	ToApiSchemaMapOutputWithContext(context.Context) ApiSchemaMapOutput
}

type ApiSchemaMap map[string]ApiSchemaInput

func (ApiSchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiSchema)(nil)).Elem()
}

func (i ApiSchemaMap) ToApiSchemaMapOutput() ApiSchemaMapOutput {
	return i.ToApiSchemaMapOutputWithContext(context.Background())
}

func (i ApiSchemaMap) ToApiSchemaMapOutputWithContext(ctx context.Context) ApiSchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiSchemaMapOutput)
}

type ApiSchemaOutput struct{ *pulumi.OutputState }

func (ApiSchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiSchema)(nil)).Elem()
}

func (o ApiSchemaOutput) ToApiSchemaOutput() ApiSchemaOutput {
	return o
}

func (o ApiSchemaOutput) ToApiSchemaOutputWithContext(ctx context.Context) ApiSchemaOutput {
	return o
}

// The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
func (o ApiSchemaOutput) ApiManagementName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiSchema) pulumi.StringOutput { return v.ApiManagementName }).(pulumi.StringOutput)
}

// The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
func (o ApiSchemaOutput) ApiName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiSchema) pulumi.StringOutput { return v.ApiName }).(pulumi.StringOutput)
}

// Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
func (o ApiSchemaOutput) Components() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiSchema) pulumi.StringPtrOutput { return v.Components }).(pulumi.StringPtrOutput)
}

// The content type of the API Schema.
func (o ApiSchemaOutput) ContentType() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiSchema) pulumi.StringOutput { return v.ContentType }).(pulumi.StringOutput)
}

// Types definitions. Used for Swagger/OpenAPI v1 schemas only.
func (o ApiSchemaOutput) Definitions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiSchema) pulumi.StringPtrOutput { return v.Definitions }).(pulumi.StringPtrOutput)
}

// The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
func (o ApiSchemaOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiSchema) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A unique identifier for this API Schema. Changing this forces a new resource to be created.
func (o ApiSchemaOutput) SchemaId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiSchema) pulumi.StringOutput { return v.SchemaId }).(pulumi.StringOutput)
}

// The JSON escaped string defining the document representing the Schema.
func (o ApiSchemaOutput) Value() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiSchema) pulumi.StringPtrOutput { return v.Value }).(pulumi.StringPtrOutput)
}

type ApiSchemaArrayOutput struct{ *pulumi.OutputState }

func (ApiSchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiSchema)(nil)).Elem()
}

func (o ApiSchemaArrayOutput) ToApiSchemaArrayOutput() ApiSchemaArrayOutput {
	return o
}

func (o ApiSchemaArrayOutput) ToApiSchemaArrayOutputWithContext(ctx context.Context) ApiSchemaArrayOutput {
	return o
}

func (o ApiSchemaArrayOutput) Index(i pulumi.IntInput) ApiSchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiSchema {
		return vs[0].([]*ApiSchema)[vs[1].(int)]
	}).(ApiSchemaOutput)
}

type ApiSchemaMapOutput struct{ *pulumi.OutputState }

func (ApiSchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiSchema)(nil)).Elem()
}

func (o ApiSchemaMapOutput) ToApiSchemaMapOutput() ApiSchemaMapOutput {
	return o
}

func (o ApiSchemaMapOutput) ToApiSchemaMapOutputWithContext(ctx context.Context) ApiSchemaMapOutput {
	return o
}

func (o ApiSchemaMapOutput) MapIndex(k pulumi.StringInput) ApiSchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiSchema {
		return vs[0].(map[string]*ApiSchema)[vs[1].(string)]
	}).(ApiSchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiSchemaInput)(nil)).Elem(), &ApiSchema{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiSchemaArrayInput)(nil)).Elem(), ApiSchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiSchemaMapInput)(nil)).Elem(), ApiSchemaMap{})
	pulumi.RegisterOutputType(ApiSchemaOutput{})
	pulumi.RegisterOutputType(ApiSchemaArrayOutput{})
	pulumi.RegisterOutputType(ApiSchemaMapOutput{})
}

// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datafactory

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Linked Service (connection) between Data Lake Storage Gen2 and Azure Data Factory.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/datafactory"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleFactory, err := datafactory.NewFactory(ctx, "example", &datafactory.FactoryArgs{
//				Name:              pulumi.String("example"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			current, err := core.GetClientConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = datafactory.NewLinkedServiceDataLakeStorageGen2(ctx, "example", &datafactory.LinkedServiceDataLakeStorageGen2Args{
//				Name:                pulumi.String("example"),
//				DataFactoryId:       exampleFactory.ID(),
//				ServicePrincipalId:  pulumi.String(current.ClientId),
//				ServicePrincipalKey: pulumi.String("exampleKey"),
//				Tenant:              pulumi.String("11111111-1111-1111-1111-111111111111"),
//				Url:                 pulumi.String("https://datalakestoragegen2"),
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
// ## Import
//
// Data Factory Data Lake Storage Gen2 Linked Services can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:datafactory/linkedServiceDataLakeStorageGen2:LinkedServiceDataLakeStorageGen2 example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
// ```
type LinkedServiceDataLakeStorageGen2 struct {
	pulumi.CustomResourceState

	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Data Lake Storage Gen2 Linked Service:
	AdditionalProperties pulumi.StringMapOutput `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayOutput `pulumi:"annotations"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringOutput `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName pulumi.StringPtrOutput `pulumi:"integrationRuntimeName"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
	// The service principal id with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `storageAccountKey` and `useManagedIdentity`.
	ServicePrincipalId pulumi.StringPtrOutput `pulumi:"servicePrincipalId"`
	// The service principal key with which to authenticate against the Azure Data Lake Storage Gen2 account.
	ServicePrincipalKey pulumi.StringPtrOutput `pulumi:"servicePrincipalKey"`
	// The Storage Account Key with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `useManagedIdentity`.
	StorageAccountKey pulumi.StringPtrOutput `pulumi:"storageAccountKey"`
	// The tenant id or name in which the service principal exists to authenticate against the Azure Data Lake Storage Gen2 account.
	//
	// > **Note:** If `servicePrincipalId` is used, `servicePrincipalKey` and `tenant` are also required.
	Tenant pulumi.StringPtrOutput `pulumi:"tenant"`
	// The endpoint for the Azure Data Lake Storage Gen2 service.
	//
	// > **Note:** Users should specify only one of the following three authentication strategies: storage account key, managed identity, service principal.
	Url pulumi.StringOutput `pulumi:"url"`
	// Whether to use the Data Factory's managed identity to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `storageAccountKey`.
	UseManagedIdentity pulumi.BoolPtrOutput `pulumi:"useManagedIdentity"`
}

// NewLinkedServiceDataLakeStorageGen2 registers a new resource with the given unique name, arguments, and options.
func NewLinkedServiceDataLakeStorageGen2(ctx *pulumi.Context,
	name string, args *LinkedServiceDataLakeStorageGen2Args, opts ...pulumi.ResourceOption) (*LinkedServiceDataLakeStorageGen2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataFactoryId == nil {
		return nil, errors.New("invalid value for required argument 'DataFactoryId'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LinkedServiceDataLakeStorageGen2
	err := ctx.RegisterResource("azure:datafactory/linkedServiceDataLakeStorageGen2:LinkedServiceDataLakeStorageGen2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkedServiceDataLakeStorageGen2 gets an existing LinkedServiceDataLakeStorageGen2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkedServiceDataLakeStorageGen2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkedServiceDataLakeStorageGen2State, opts ...pulumi.ResourceOption) (*LinkedServiceDataLakeStorageGen2, error) {
	var resource LinkedServiceDataLakeStorageGen2
	err := ctx.ReadResource("azure:datafactory/linkedServiceDataLakeStorageGen2:LinkedServiceDataLakeStorageGen2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkedServiceDataLakeStorageGen2 resources.
type linkedServiceDataLakeStorageGen2State struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Data Lake Storage Gen2 Linked Service:
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations []string `pulumi:"annotations"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId *string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description *string `pulumi:"description"`
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName *string `pulumi:"integrationRuntimeName"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters map[string]string `pulumi:"parameters"`
	// The service principal id with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `storageAccountKey` and `useManagedIdentity`.
	ServicePrincipalId *string `pulumi:"servicePrincipalId"`
	// The service principal key with which to authenticate against the Azure Data Lake Storage Gen2 account.
	ServicePrincipalKey *string `pulumi:"servicePrincipalKey"`
	// The Storage Account Key with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `useManagedIdentity`.
	StorageAccountKey *string `pulumi:"storageAccountKey"`
	// The tenant id or name in which the service principal exists to authenticate against the Azure Data Lake Storage Gen2 account.
	//
	// > **Note:** If `servicePrincipalId` is used, `servicePrincipalKey` and `tenant` are also required.
	Tenant *string `pulumi:"tenant"`
	// The endpoint for the Azure Data Lake Storage Gen2 service.
	//
	// > **Note:** Users should specify only one of the following three authentication strategies: storage account key, managed identity, service principal.
	Url *string `pulumi:"url"`
	// Whether to use the Data Factory's managed identity to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `storageAccountKey`.
	UseManagedIdentity *bool `pulumi:"useManagedIdentity"`
}

type LinkedServiceDataLakeStorageGen2State struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Data Lake Storage Gen2 Linked Service:
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayInput
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringPtrInput
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrInput
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName pulumi.StringPtrInput
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapInput
	// The service principal id with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `storageAccountKey` and `useManagedIdentity`.
	ServicePrincipalId pulumi.StringPtrInput
	// The service principal key with which to authenticate against the Azure Data Lake Storage Gen2 account.
	ServicePrincipalKey pulumi.StringPtrInput
	// The Storage Account Key with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `useManagedIdentity`.
	StorageAccountKey pulumi.StringPtrInput
	// The tenant id or name in which the service principal exists to authenticate against the Azure Data Lake Storage Gen2 account.
	//
	// > **Note:** If `servicePrincipalId` is used, `servicePrincipalKey` and `tenant` are also required.
	Tenant pulumi.StringPtrInput
	// The endpoint for the Azure Data Lake Storage Gen2 service.
	//
	// > **Note:** Users should specify only one of the following three authentication strategies: storage account key, managed identity, service principal.
	Url pulumi.StringPtrInput
	// Whether to use the Data Factory's managed identity to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `storageAccountKey`.
	UseManagedIdentity pulumi.BoolPtrInput
}

func (LinkedServiceDataLakeStorageGen2State) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceDataLakeStorageGen2State)(nil)).Elem()
}

type linkedServiceDataLakeStorageGen2Args struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Data Lake Storage Gen2 Linked Service:
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations []string `pulumi:"annotations"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description *string `pulumi:"description"`
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName *string `pulumi:"integrationRuntimeName"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters map[string]string `pulumi:"parameters"`
	// The service principal id with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `storageAccountKey` and `useManagedIdentity`.
	ServicePrincipalId *string `pulumi:"servicePrincipalId"`
	// The service principal key with which to authenticate against the Azure Data Lake Storage Gen2 account.
	ServicePrincipalKey *string `pulumi:"servicePrincipalKey"`
	// The Storage Account Key with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `useManagedIdentity`.
	StorageAccountKey *string `pulumi:"storageAccountKey"`
	// The tenant id or name in which the service principal exists to authenticate against the Azure Data Lake Storage Gen2 account.
	//
	// > **Note:** If `servicePrincipalId` is used, `servicePrincipalKey` and `tenant` are also required.
	Tenant *string `pulumi:"tenant"`
	// The endpoint for the Azure Data Lake Storage Gen2 service.
	//
	// > **Note:** Users should specify only one of the following three authentication strategies: storage account key, managed identity, service principal.
	Url string `pulumi:"url"`
	// Whether to use the Data Factory's managed identity to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `storageAccountKey`.
	UseManagedIdentity *bool `pulumi:"useManagedIdentity"`
}

// The set of arguments for constructing a LinkedServiceDataLakeStorageGen2 resource.
type LinkedServiceDataLakeStorageGen2Args struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Data Lake Storage Gen2 Linked Service:
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayInput
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringInput
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrInput
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName pulumi.StringPtrInput
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapInput
	// The service principal id with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `storageAccountKey` and `useManagedIdentity`.
	ServicePrincipalId pulumi.StringPtrInput
	// The service principal key with which to authenticate against the Azure Data Lake Storage Gen2 account.
	ServicePrincipalKey pulumi.StringPtrInput
	// The Storage Account Key with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `useManagedIdentity`.
	StorageAccountKey pulumi.StringPtrInput
	// The tenant id or name in which the service principal exists to authenticate against the Azure Data Lake Storage Gen2 account.
	//
	// > **Note:** If `servicePrincipalId` is used, `servicePrincipalKey` and `tenant` are also required.
	Tenant pulumi.StringPtrInput
	// The endpoint for the Azure Data Lake Storage Gen2 service.
	//
	// > **Note:** Users should specify only one of the following three authentication strategies: storage account key, managed identity, service principal.
	Url pulumi.StringInput
	// Whether to use the Data Factory's managed identity to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `storageAccountKey`.
	UseManagedIdentity pulumi.BoolPtrInput
}

func (LinkedServiceDataLakeStorageGen2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceDataLakeStorageGen2Args)(nil)).Elem()
}

type LinkedServiceDataLakeStorageGen2Input interface {
	pulumi.Input

	ToLinkedServiceDataLakeStorageGen2Output() LinkedServiceDataLakeStorageGen2Output
	ToLinkedServiceDataLakeStorageGen2OutputWithContext(ctx context.Context) LinkedServiceDataLakeStorageGen2Output
}

func (*LinkedServiceDataLakeStorageGen2) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedServiceDataLakeStorageGen2)(nil)).Elem()
}

func (i *LinkedServiceDataLakeStorageGen2) ToLinkedServiceDataLakeStorageGen2Output() LinkedServiceDataLakeStorageGen2Output {
	return i.ToLinkedServiceDataLakeStorageGen2OutputWithContext(context.Background())
}

func (i *LinkedServiceDataLakeStorageGen2) ToLinkedServiceDataLakeStorageGen2OutputWithContext(ctx context.Context) LinkedServiceDataLakeStorageGen2Output {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceDataLakeStorageGen2Output)
}

// LinkedServiceDataLakeStorageGen2ArrayInput is an input type that accepts LinkedServiceDataLakeStorageGen2Array and LinkedServiceDataLakeStorageGen2ArrayOutput values.
// You can construct a concrete instance of `LinkedServiceDataLakeStorageGen2ArrayInput` via:
//
//	LinkedServiceDataLakeStorageGen2Array{ LinkedServiceDataLakeStorageGen2Args{...} }
type LinkedServiceDataLakeStorageGen2ArrayInput interface {
	pulumi.Input

	ToLinkedServiceDataLakeStorageGen2ArrayOutput() LinkedServiceDataLakeStorageGen2ArrayOutput
	ToLinkedServiceDataLakeStorageGen2ArrayOutputWithContext(context.Context) LinkedServiceDataLakeStorageGen2ArrayOutput
}

type LinkedServiceDataLakeStorageGen2Array []LinkedServiceDataLakeStorageGen2Input

func (LinkedServiceDataLakeStorageGen2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedServiceDataLakeStorageGen2)(nil)).Elem()
}

func (i LinkedServiceDataLakeStorageGen2Array) ToLinkedServiceDataLakeStorageGen2ArrayOutput() LinkedServiceDataLakeStorageGen2ArrayOutput {
	return i.ToLinkedServiceDataLakeStorageGen2ArrayOutputWithContext(context.Background())
}

func (i LinkedServiceDataLakeStorageGen2Array) ToLinkedServiceDataLakeStorageGen2ArrayOutputWithContext(ctx context.Context) LinkedServiceDataLakeStorageGen2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceDataLakeStorageGen2ArrayOutput)
}

// LinkedServiceDataLakeStorageGen2MapInput is an input type that accepts LinkedServiceDataLakeStorageGen2Map and LinkedServiceDataLakeStorageGen2MapOutput values.
// You can construct a concrete instance of `LinkedServiceDataLakeStorageGen2MapInput` via:
//
//	LinkedServiceDataLakeStorageGen2Map{ "key": LinkedServiceDataLakeStorageGen2Args{...} }
type LinkedServiceDataLakeStorageGen2MapInput interface {
	pulumi.Input

	ToLinkedServiceDataLakeStorageGen2MapOutput() LinkedServiceDataLakeStorageGen2MapOutput
	ToLinkedServiceDataLakeStorageGen2MapOutputWithContext(context.Context) LinkedServiceDataLakeStorageGen2MapOutput
}

type LinkedServiceDataLakeStorageGen2Map map[string]LinkedServiceDataLakeStorageGen2Input

func (LinkedServiceDataLakeStorageGen2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedServiceDataLakeStorageGen2)(nil)).Elem()
}

func (i LinkedServiceDataLakeStorageGen2Map) ToLinkedServiceDataLakeStorageGen2MapOutput() LinkedServiceDataLakeStorageGen2MapOutput {
	return i.ToLinkedServiceDataLakeStorageGen2MapOutputWithContext(context.Background())
}

func (i LinkedServiceDataLakeStorageGen2Map) ToLinkedServiceDataLakeStorageGen2MapOutputWithContext(ctx context.Context) LinkedServiceDataLakeStorageGen2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceDataLakeStorageGen2MapOutput)
}

type LinkedServiceDataLakeStorageGen2Output struct{ *pulumi.OutputState }

func (LinkedServiceDataLakeStorageGen2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedServiceDataLakeStorageGen2)(nil)).Elem()
}

func (o LinkedServiceDataLakeStorageGen2Output) ToLinkedServiceDataLakeStorageGen2Output() LinkedServiceDataLakeStorageGen2Output {
	return o
}

func (o LinkedServiceDataLakeStorageGen2Output) ToLinkedServiceDataLakeStorageGen2OutputWithContext(ctx context.Context) LinkedServiceDataLakeStorageGen2Output {
	return o
}

// A map of additional properties to associate with the Data Factory Linked Service.
//
// The following supported arguments are specific to Data Lake Storage Gen2 Linked Service:
func (o LinkedServiceDataLakeStorageGen2Output) AdditionalProperties() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringMapOutput { return v.AdditionalProperties }).(pulumi.StringMapOutput)
}

// List of tags that can be used for describing the Data Factory Linked Service.
func (o LinkedServiceDataLakeStorageGen2Output) Annotations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringArrayOutput { return v.Annotations }).(pulumi.StringArrayOutput)
}

// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
func (o LinkedServiceDataLakeStorageGen2Output) DataFactoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringOutput { return v.DataFactoryId }).(pulumi.StringOutput)
}

// The description for the Data Factory Linked Service.
func (o LinkedServiceDataLakeStorageGen2Output) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The integration runtime reference to associate with the Data Factory Linked Service.
func (o LinkedServiceDataLakeStorageGen2Output) IntegrationRuntimeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringPtrOutput { return v.IntegrationRuntimeName }).(pulumi.StringPtrOutput)
}

// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
func (o LinkedServiceDataLakeStorageGen2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A map of parameters to associate with the Data Factory Linked Service.
func (o LinkedServiceDataLakeStorageGen2Output) Parameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringMapOutput { return v.Parameters }).(pulumi.StringMapOutput)
}

// The service principal id with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `storageAccountKey` and `useManagedIdentity`.
func (o LinkedServiceDataLakeStorageGen2Output) ServicePrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringPtrOutput { return v.ServicePrincipalId }).(pulumi.StringPtrOutput)
}

// The service principal key with which to authenticate against the Azure Data Lake Storage Gen2 account.
func (o LinkedServiceDataLakeStorageGen2Output) ServicePrincipalKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringPtrOutput { return v.ServicePrincipalKey }).(pulumi.StringPtrOutput)
}

// The Storage Account Key with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `useManagedIdentity`.
func (o LinkedServiceDataLakeStorageGen2Output) StorageAccountKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringPtrOutput { return v.StorageAccountKey }).(pulumi.StringPtrOutput)
}

// The tenant id or name in which the service principal exists to authenticate against the Azure Data Lake Storage Gen2 account.
//
// > **Note:** If `servicePrincipalId` is used, `servicePrincipalKey` and `tenant` are also required.
func (o LinkedServiceDataLakeStorageGen2Output) Tenant() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringPtrOutput { return v.Tenant }).(pulumi.StringPtrOutput)
}

// The endpoint for the Azure Data Lake Storage Gen2 service.
//
// > **Note:** Users should specify only one of the following three authentication strategies: storage account key, managed identity, service principal.
func (o LinkedServiceDataLakeStorageGen2Output) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Whether to use the Data Factory's managed identity to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `servicePrincipalId`, `servicePrincipalKey`, `tenant` and `storageAccountKey`.
func (o LinkedServiceDataLakeStorageGen2Output) UseManagedIdentity() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LinkedServiceDataLakeStorageGen2) pulumi.BoolPtrOutput { return v.UseManagedIdentity }).(pulumi.BoolPtrOutput)
}

type LinkedServiceDataLakeStorageGen2ArrayOutput struct{ *pulumi.OutputState }

func (LinkedServiceDataLakeStorageGen2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedServiceDataLakeStorageGen2)(nil)).Elem()
}

func (o LinkedServiceDataLakeStorageGen2ArrayOutput) ToLinkedServiceDataLakeStorageGen2ArrayOutput() LinkedServiceDataLakeStorageGen2ArrayOutput {
	return o
}

func (o LinkedServiceDataLakeStorageGen2ArrayOutput) ToLinkedServiceDataLakeStorageGen2ArrayOutputWithContext(ctx context.Context) LinkedServiceDataLakeStorageGen2ArrayOutput {
	return o
}

func (o LinkedServiceDataLakeStorageGen2ArrayOutput) Index(i pulumi.IntInput) LinkedServiceDataLakeStorageGen2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LinkedServiceDataLakeStorageGen2 {
		return vs[0].([]*LinkedServiceDataLakeStorageGen2)[vs[1].(int)]
	}).(LinkedServiceDataLakeStorageGen2Output)
}

type LinkedServiceDataLakeStorageGen2MapOutput struct{ *pulumi.OutputState }

func (LinkedServiceDataLakeStorageGen2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedServiceDataLakeStorageGen2)(nil)).Elem()
}

func (o LinkedServiceDataLakeStorageGen2MapOutput) ToLinkedServiceDataLakeStorageGen2MapOutput() LinkedServiceDataLakeStorageGen2MapOutput {
	return o
}

func (o LinkedServiceDataLakeStorageGen2MapOutput) ToLinkedServiceDataLakeStorageGen2MapOutputWithContext(ctx context.Context) LinkedServiceDataLakeStorageGen2MapOutput {
	return o
}

func (o LinkedServiceDataLakeStorageGen2MapOutput) MapIndex(k pulumi.StringInput) LinkedServiceDataLakeStorageGen2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LinkedServiceDataLakeStorageGen2 {
		return vs[0].(map[string]*LinkedServiceDataLakeStorageGen2)[vs[1].(string)]
	}).(LinkedServiceDataLakeStorageGen2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceDataLakeStorageGen2Input)(nil)).Elem(), &LinkedServiceDataLakeStorageGen2{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceDataLakeStorageGen2ArrayInput)(nil)).Elem(), LinkedServiceDataLakeStorageGen2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceDataLakeStorageGen2MapInput)(nil)).Elem(), LinkedServiceDataLakeStorageGen2Map{})
	pulumi.RegisterOutputType(LinkedServiceDataLakeStorageGen2Output{})
	pulumi.RegisterOutputType(LinkedServiceDataLakeStorageGen2ArrayOutput{})
	pulumi.RegisterOutputType(LinkedServiceDataLakeStorageGen2MapOutput{})
}

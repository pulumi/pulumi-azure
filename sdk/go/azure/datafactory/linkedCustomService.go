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

// Manages a Linked Service (connection) between a resource and Azure Data Factory. This is a generic resource that supports all different Linked Service Types.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/datafactory"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
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
//				Identity: &datafactory.FactoryIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("example"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountKind:            pulumi.String("BlobStorage"),
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datafactory.NewLinkedCustomService(ctx, "example", &datafactory.LinkedCustomServiceArgs{
//				Name:          pulumi.String("example"),
//				DataFactoryId: exampleFactory.ID(),
//				Type:          pulumi.String("AzureBlobStorage"),
//				Description:   pulumi.String("test description"),
//				TypePropertiesJson: exampleAccount.PrimaryConnectionString.ApplyT(func(primaryConnectionString string) (string, error) {
//					return fmt.Sprintf("{\n  \"connectionString\":\"%v\"\n}\n", primaryConnectionString), nil
//				}).(pulumi.StringOutput),
//				Parameters: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//					"Env": pulumi.String("Test"),
//				},
//				Annotations: pulumi.StringArray{
//					pulumi.String("test1"),
//					pulumi.String("test2"),
//					pulumi.String("test3"),
//				},
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
// Data Factory Linked Service's can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:datafactory/linkedCustomService:LinkedCustomService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
// ```
type LinkedCustomService struct {
	pulumi.CustomResourceState

	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties pulumi.StringMapOutput `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayOutput `pulumi:"annotations"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringOutput `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// An `integrationRuntime` block as defined below.
	IntegrationRuntime LinkedCustomServiceIntegrationRuntimePtrOutput `pulumi:"integrationRuntime"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
	// The type of data stores that will be connected to Data Factory. For full list of supported data stores, please refer to [Azure Data Factory connector](https://docs.microsoft.com/azure/data-factory/connector-overview). Please refer to Microsoft.DataFactory factories/linkedservices for the type values syntax. Changing this forces a new resource to be created.
	Type pulumi.StringOutput `pulumi:"type"`
	// A JSON object that contains the properties of the Data Factory Linked Service.
	TypePropertiesJson pulumi.StringOutput `pulumi:"typePropertiesJson"`
}

// NewLinkedCustomService registers a new resource with the given unique name, arguments, and options.
func NewLinkedCustomService(ctx *pulumi.Context,
	name string, args *LinkedCustomServiceArgs, opts ...pulumi.ResourceOption) (*LinkedCustomService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataFactoryId == nil {
		return nil, errors.New("invalid value for required argument 'DataFactoryId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.TypePropertiesJson == nil {
		return nil, errors.New("invalid value for required argument 'TypePropertiesJson'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LinkedCustomService
	err := ctx.RegisterResource("azure:datafactory/linkedCustomService:LinkedCustomService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkedCustomService gets an existing LinkedCustomService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkedCustomService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkedCustomServiceState, opts ...pulumi.ResourceOption) (*LinkedCustomService, error) {
	var resource LinkedCustomService
	err := ctx.ReadResource("azure:datafactory/linkedCustomService:LinkedCustomService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkedCustomService resources.
type linkedCustomServiceState struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations []string `pulumi:"annotations"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId *string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description *string `pulumi:"description"`
	// An `integrationRuntime` block as defined below.
	IntegrationRuntime *LinkedCustomServiceIntegrationRuntime `pulumi:"integrationRuntime"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters map[string]string `pulumi:"parameters"`
	// The type of data stores that will be connected to Data Factory. For full list of supported data stores, please refer to [Azure Data Factory connector](https://docs.microsoft.com/azure/data-factory/connector-overview). Please refer to Microsoft.DataFactory factories/linkedservices for the type values syntax. Changing this forces a new resource to be created.
	Type *string `pulumi:"type"`
	// A JSON object that contains the properties of the Data Factory Linked Service.
	TypePropertiesJson *string `pulumi:"typePropertiesJson"`
}

type LinkedCustomServiceState struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayInput
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringPtrInput
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrInput
	// An `integrationRuntime` block as defined below.
	IntegrationRuntime LinkedCustomServiceIntegrationRuntimePtrInput
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapInput
	// The type of data stores that will be connected to Data Factory. For full list of supported data stores, please refer to [Azure Data Factory connector](https://docs.microsoft.com/azure/data-factory/connector-overview). Please refer to Microsoft.DataFactory factories/linkedservices for the type values syntax. Changing this forces a new resource to be created.
	Type pulumi.StringPtrInput
	// A JSON object that contains the properties of the Data Factory Linked Service.
	TypePropertiesJson pulumi.StringPtrInput
}

func (LinkedCustomServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedCustomServiceState)(nil)).Elem()
}

type linkedCustomServiceArgs struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations []string `pulumi:"annotations"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description *string `pulumi:"description"`
	// An `integrationRuntime` block as defined below.
	IntegrationRuntime *LinkedCustomServiceIntegrationRuntime `pulumi:"integrationRuntime"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters map[string]string `pulumi:"parameters"`
	// The type of data stores that will be connected to Data Factory. For full list of supported data stores, please refer to [Azure Data Factory connector](https://docs.microsoft.com/azure/data-factory/connector-overview). Please refer to Microsoft.DataFactory factories/linkedservices for the type values syntax. Changing this forces a new resource to be created.
	Type string `pulumi:"type"`
	// A JSON object that contains the properties of the Data Factory Linked Service.
	TypePropertiesJson string `pulumi:"typePropertiesJson"`
}

// The set of arguments for constructing a LinkedCustomService resource.
type LinkedCustomServiceArgs struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayInput
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringInput
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrInput
	// An `integrationRuntime` block as defined below.
	IntegrationRuntime LinkedCustomServiceIntegrationRuntimePtrInput
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapInput
	// The type of data stores that will be connected to Data Factory. For full list of supported data stores, please refer to [Azure Data Factory connector](https://docs.microsoft.com/azure/data-factory/connector-overview). Please refer to Microsoft.DataFactory factories/linkedservices for the type values syntax. Changing this forces a new resource to be created.
	Type pulumi.StringInput
	// A JSON object that contains the properties of the Data Factory Linked Service.
	TypePropertiesJson pulumi.StringInput
}

func (LinkedCustomServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedCustomServiceArgs)(nil)).Elem()
}

type LinkedCustomServiceInput interface {
	pulumi.Input

	ToLinkedCustomServiceOutput() LinkedCustomServiceOutput
	ToLinkedCustomServiceOutputWithContext(ctx context.Context) LinkedCustomServiceOutput
}

func (*LinkedCustomService) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedCustomService)(nil)).Elem()
}

func (i *LinkedCustomService) ToLinkedCustomServiceOutput() LinkedCustomServiceOutput {
	return i.ToLinkedCustomServiceOutputWithContext(context.Background())
}

func (i *LinkedCustomService) ToLinkedCustomServiceOutputWithContext(ctx context.Context) LinkedCustomServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedCustomServiceOutput)
}

// LinkedCustomServiceArrayInput is an input type that accepts LinkedCustomServiceArray and LinkedCustomServiceArrayOutput values.
// You can construct a concrete instance of `LinkedCustomServiceArrayInput` via:
//
//	LinkedCustomServiceArray{ LinkedCustomServiceArgs{...} }
type LinkedCustomServiceArrayInput interface {
	pulumi.Input

	ToLinkedCustomServiceArrayOutput() LinkedCustomServiceArrayOutput
	ToLinkedCustomServiceArrayOutputWithContext(context.Context) LinkedCustomServiceArrayOutput
}

type LinkedCustomServiceArray []LinkedCustomServiceInput

func (LinkedCustomServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedCustomService)(nil)).Elem()
}

func (i LinkedCustomServiceArray) ToLinkedCustomServiceArrayOutput() LinkedCustomServiceArrayOutput {
	return i.ToLinkedCustomServiceArrayOutputWithContext(context.Background())
}

func (i LinkedCustomServiceArray) ToLinkedCustomServiceArrayOutputWithContext(ctx context.Context) LinkedCustomServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedCustomServiceArrayOutput)
}

// LinkedCustomServiceMapInput is an input type that accepts LinkedCustomServiceMap and LinkedCustomServiceMapOutput values.
// You can construct a concrete instance of `LinkedCustomServiceMapInput` via:
//
//	LinkedCustomServiceMap{ "key": LinkedCustomServiceArgs{...} }
type LinkedCustomServiceMapInput interface {
	pulumi.Input

	ToLinkedCustomServiceMapOutput() LinkedCustomServiceMapOutput
	ToLinkedCustomServiceMapOutputWithContext(context.Context) LinkedCustomServiceMapOutput
}

type LinkedCustomServiceMap map[string]LinkedCustomServiceInput

func (LinkedCustomServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedCustomService)(nil)).Elem()
}

func (i LinkedCustomServiceMap) ToLinkedCustomServiceMapOutput() LinkedCustomServiceMapOutput {
	return i.ToLinkedCustomServiceMapOutputWithContext(context.Background())
}

func (i LinkedCustomServiceMap) ToLinkedCustomServiceMapOutputWithContext(ctx context.Context) LinkedCustomServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedCustomServiceMapOutput)
}

type LinkedCustomServiceOutput struct{ *pulumi.OutputState }

func (LinkedCustomServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedCustomService)(nil)).Elem()
}

func (o LinkedCustomServiceOutput) ToLinkedCustomServiceOutput() LinkedCustomServiceOutput {
	return o
}

func (o LinkedCustomServiceOutput) ToLinkedCustomServiceOutputWithContext(ctx context.Context) LinkedCustomServiceOutput {
	return o
}

// A map of additional properties to associate with the Data Factory Linked Service.
func (o LinkedCustomServiceOutput) AdditionalProperties() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkedCustomService) pulumi.StringMapOutput { return v.AdditionalProperties }).(pulumi.StringMapOutput)
}

// List of tags that can be used for describing the Data Factory Linked Service.
func (o LinkedCustomServiceOutput) Annotations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkedCustomService) pulumi.StringArrayOutput { return v.Annotations }).(pulumi.StringArrayOutput)
}

// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
func (o LinkedCustomServiceOutput) DataFactoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedCustomService) pulumi.StringOutput { return v.DataFactoryId }).(pulumi.StringOutput)
}

// The description for the Data Factory Linked Service.
func (o LinkedCustomServiceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedCustomService) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// An `integrationRuntime` block as defined below.
func (o LinkedCustomServiceOutput) IntegrationRuntime() LinkedCustomServiceIntegrationRuntimePtrOutput {
	return o.ApplyT(func(v *LinkedCustomService) LinkedCustomServiceIntegrationRuntimePtrOutput {
		return v.IntegrationRuntime
	}).(LinkedCustomServiceIntegrationRuntimePtrOutput)
}

// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
func (o LinkedCustomServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedCustomService) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A map of parameters to associate with the Data Factory Linked Service.
func (o LinkedCustomServiceOutput) Parameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkedCustomService) pulumi.StringMapOutput { return v.Parameters }).(pulumi.StringMapOutput)
}

// The type of data stores that will be connected to Data Factory. For full list of supported data stores, please refer to [Azure Data Factory connector](https://docs.microsoft.com/azure/data-factory/connector-overview). Please refer to Microsoft.DataFactory factories/linkedservices for the type values syntax. Changing this forces a new resource to be created.
func (o LinkedCustomServiceOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedCustomService) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// A JSON object that contains the properties of the Data Factory Linked Service.
func (o LinkedCustomServiceOutput) TypePropertiesJson() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedCustomService) pulumi.StringOutput { return v.TypePropertiesJson }).(pulumi.StringOutput)
}

type LinkedCustomServiceArrayOutput struct{ *pulumi.OutputState }

func (LinkedCustomServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedCustomService)(nil)).Elem()
}

func (o LinkedCustomServiceArrayOutput) ToLinkedCustomServiceArrayOutput() LinkedCustomServiceArrayOutput {
	return o
}

func (o LinkedCustomServiceArrayOutput) ToLinkedCustomServiceArrayOutputWithContext(ctx context.Context) LinkedCustomServiceArrayOutput {
	return o
}

func (o LinkedCustomServiceArrayOutput) Index(i pulumi.IntInput) LinkedCustomServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LinkedCustomService {
		return vs[0].([]*LinkedCustomService)[vs[1].(int)]
	}).(LinkedCustomServiceOutput)
}

type LinkedCustomServiceMapOutput struct{ *pulumi.OutputState }

func (LinkedCustomServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedCustomService)(nil)).Elem()
}

func (o LinkedCustomServiceMapOutput) ToLinkedCustomServiceMapOutput() LinkedCustomServiceMapOutput {
	return o
}

func (o LinkedCustomServiceMapOutput) ToLinkedCustomServiceMapOutputWithContext(ctx context.Context) LinkedCustomServiceMapOutput {
	return o
}

func (o LinkedCustomServiceMapOutput) MapIndex(k pulumi.StringInput) LinkedCustomServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LinkedCustomService {
		return vs[0].(map[string]*LinkedCustomService)[vs[1].(string)]
	}).(LinkedCustomServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedCustomServiceInput)(nil)).Elem(), &LinkedCustomService{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedCustomServiceArrayInput)(nil)).Elem(), LinkedCustomServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedCustomServiceMapInput)(nil)).Elem(), LinkedCustomServiceMap{})
	pulumi.RegisterOutputType(LinkedCustomServiceOutput{})
	pulumi.RegisterOutputType(LinkedCustomServiceArrayOutput{})
	pulumi.RegisterOutputType(LinkedCustomServiceMapOutput{})
}

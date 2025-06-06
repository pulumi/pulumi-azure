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

// Manages a Linked Service (connection) between a SFTP Server and Azure Data Factory.
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
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			example := storage.LookupAccountOutput(ctx, storage.GetAccountOutputArgs{
//				Name:              pulumi.String("storageaccountname"),
//				ResourceGroupName: exampleResourceGroup.Name,
//			}, nil)
//			exampleFactory, err := datafactory.NewFactory(ctx, "example", &datafactory.FactoryArgs{
//				Name:              pulumi.String("example"),
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datafactory.NewLinkedServiceAzureFileStorage(ctx, "example", &datafactory.LinkedServiceAzureFileStorageArgs{
//				Name:          pulumi.String("example"),
//				DataFactoryId: exampleFactory.ID(),
//				ConnectionString: pulumi.String(example.ApplyT(func(example storage.GetAccountResult) (*string, error) {
//					return &example.PrimaryConnectionString, nil
//				}).(pulumi.StringPtrOutput)),
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
// $ pulumi import azure:datafactory/linkedServiceAzureFileStorage:LinkedServiceAzureFileStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
// ```
type LinkedServiceAzureFileStorage struct {
	pulumi.CustomResourceState

	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Azure File Storage Linked Service:
	AdditionalProperties pulumi.StringMapOutput `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayOutput `pulumi:"annotations"`
	// The connection string.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringOutput `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the file share.
	FileShare pulumi.StringPtrOutput `pulumi:"fileShare"`
	// The Host name of the server.
	Host pulumi.StringPtrOutput `pulumi:"host"`
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName pulumi.StringPtrOutput `pulumi:"integrationRuntimeName"`
	// A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
	KeyVaultPassword LinkedServiceAzureFileStorageKeyVaultPasswordPtrOutput `pulumi:"keyVaultPassword"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
	// The password to log in the server.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The user ID to log in the server.
	UserId pulumi.StringPtrOutput `pulumi:"userId"`
}

// NewLinkedServiceAzureFileStorage registers a new resource with the given unique name, arguments, and options.
func NewLinkedServiceAzureFileStorage(ctx *pulumi.Context,
	name string, args *LinkedServiceAzureFileStorageArgs, opts ...pulumi.ResourceOption) (*LinkedServiceAzureFileStorage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionString == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionString'")
	}
	if args.DataFactoryId == nil {
		return nil, errors.New("invalid value for required argument 'DataFactoryId'")
	}
	if args.ConnectionString != nil {
		args.ConnectionString = pulumi.ToSecret(args.ConnectionString).(pulumi.StringInput)
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"connectionString",
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LinkedServiceAzureFileStorage
	err := ctx.RegisterResource("azure:datafactory/linkedServiceAzureFileStorage:LinkedServiceAzureFileStorage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkedServiceAzureFileStorage gets an existing LinkedServiceAzureFileStorage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkedServiceAzureFileStorage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkedServiceAzureFileStorageState, opts ...pulumi.ResourceOption) (*LinkedServiceAzureFileStorage, error) {
	var resource LinkedServiceAzureFileStorage
	err := ctx.ReadResource("azure:datafactory/linkedServiceAzureFileStorage:LinkedServiceAzureFileStorage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkedServiceAzureFileStorage resources.
type linkedServiceAzureFileStorageState struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Azure File Storage Linked Service:
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations []string `pulumi:"annotations"`
	// The connection string.
	ConnectionString *string `pulumi:"connectionString"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId *string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description *string `pulumi:"description"`
	// The name of the file share.
	FileShare *string `pulumi:"fileShare"`
	// The Host name of the server.
	Host *string `pulumi:"host"`
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName *string `pulumi:"integrationRuntimeName"`
	// A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
	KeyVaultPassword *LinkedServiceAzureFileStorageKeyVaultPassword `pulumi:"keyVaultPassword"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters map[string]string `pulumi:"parameters"`
	// The password to log in the server.
	Password *string `pulumi:"password"`
	// The user ID to log in the server.
	UserId *string `pulumi:"userId"`
}

type LinkedServiceAzureFileStorageState struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Azure File Storage Linked Service:
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayInput
	// The connection string.
	ConnectionString pulumi.StringPtrInput
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringPtrInput
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrInput
	// The name of the file share.
	FileShare pulumi.StringPtrInput
	// The Host name of the server.
	Host pulumi.StringPtrInput
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName pulumi.StringPtrInput
	// A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
	KeyVaultPassword LinkedServiceAzureFileStorageKeyVaultPasswordPtrInput
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapInput
	// The password to log in the server.
	Password pulumi.StringPtrInput
	// The user ID to log in the server.
	UserId pulumi.StringPtrInput
}

func (LinkedServiceAzureFileStorageState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceAzureFileStorageState)(nil)).Elem()
}

type linkedServiceAzureFileStorageArgs struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Azure File Storage Linked Service:
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations []string `pulumi:"annotations"`
	// The connection string.
	ConnectionString string `pulumi:"connectionString"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description *string `pulumi:"description"`
	// The name of the file share.
	FileShare *string `pulumi:"fileShare"`
	// The Host name of the server.
	Host *string `pulumi:"host"`
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName *string `pulumi:"integrationRuntimeName"`
	// A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
	KeyVaultPassword *LinkedServiceAzureFileStorageKeyVaultPassword `pulumi:"keyVaultPassword"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters map[string]string `pulumi:"parameters"`
	// The password to log in the server.
	Password *string `pulumi:"password"`
	// The user ID to log in the server.
	UserId *string `pulumi:"userId"`
}

// The set of arguments for constructing a LinkedServiceAzureFileStorage resource.
type LinkedServiceAzureFileStorageArgs struct {
	// A map of additional properties to associate with the Data Factory Linked Service.
	//
	// The following supported arguments are specific to Azure File Storage Linked Service:
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayInput
	// The connection string.
	ConnectionString pulumi.StringInput
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringInput
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrInput
	// The name of the file share.
	FileShare pulumi.StringPtrInput
	// The Host name of the server.
	Host pulumi.StringPtrInput
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName pulumi.StringPtrInput
	// A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
	KeyVaultPassword LinkedServiceAzureFileStorageKeyVaultPasswordPtrInput
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapInput
	// The password to log in the server.
	Password pulumi.StringPtrInput
	// The user ID to log in the server.
	UserId pulumi.StringPtrInput
}

func (LinkedServiceAzureFileStorageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceAzureFileStorageArgs)(nil)).Elem()
}

type LinkedServiceAzureFileStorageInput interface {
	pulumi.Input

	ToLinkedServiceAzureFileStorageOutput() LinkedServiceAzureFileStorageOutput
	ToLinkedServiceAzureFileStorageOutputWithContext(ctx context.Context) LinkedServiceAzureFileStorageOutput
}

func (*LinkedServiceAzureFileStorage) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedServiceAzureFileStorage)(nil)).Elem()
}

func (i *LinkedServiceAzureFileStorage) ToLinkedServiceAzureFileStorageOutput() LinkedServiceAzureFileStorageOutput {
	return i.ToLinkedServiceAzureFileStorageOutputWithContext(context.Background())
}

func (i *LinkedServiceAzureFileStorage) ToLinkedServiceAzureFileStorageOutputWithContext(ctx context.Context) LinkedServiceAzureFileStorageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceAzureFileStorageOutput)
}

// LinkedServiceAzureFileStorageArrayInput is an input type that accepts LinkedServiceAzureFileStorageArray and LinkedServiceAzureFileStorageArrayOutput values.
// You can construct a concrete instance of `LinkedServiceAzureFileStorageArrayInput` via:
//
//	LinkedServiceAzureFileStorageArray{ LinkedServiceAzureFileStorageArgs{...} }
type LinkedServiceAzureFileStorageArrayInput interface {
	pulumi.Input

	ToLinkedServiceAzureFileStorageArrayOutput() LinkedServiceAzureFileStorageArrayOutput
	ToLinkedServiceAzureFileStorageArrayOutputWithContext(context.Context) LinkedServiceAzureFileStorageArrayOutput
}

type LinkedServiceAzureFileStorageArray []LinkedServiceAzureFileStorageInput

func (LinkedServiceAzureFileStorageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedServiceAzureFileStorage)(nil)).Elem()
}

func (i LinkedServiceAzureFileStorageArray) ToLinkedServiceAzureFileStorageArrayOutput() LinkedServiceAzureFileStorageArrayOutput {
	return i.ToLinkedServiceAzureFileStorageArrayOutputWithContext(context.Background())
}

func (i LinkedServiceAzureFileStorageArray) ToLinkedServiceAzureFileStorageArrayOutputWithContext(ctx context.Context) LinkedServiceAzureFileStorageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceAzureFileStorageArrayOutput)
}

// LinkedServiceAzureFileStorageMapInput is an input type that accepts LinkedServiceAzureFileStorageMap and LinkedServiceAzureFileStorageMapOutput values.
// You can construct a concrete instance of `LinkedServiceAzureFileStorageMapInput` via:
//
//	LinkedServiceAzureFileStorageMap{ "key": LinkedServiceAzureFileStorageArgs{...} }
type LinkedServiceAzureFileStorageMapInput interface {
	pulumi.Input

	ToLinkedServiceAzureFileStorageMapOutput() LinkedServiceAzureFileStorageMapOutput
	ToLinkedServiceAzureFileStorageMapOutputWithContext(context.Context) LinkedServiceAzureFileStorageMapOutput
}

type LinkedServiceAzureFileStorageMap map[string]LinkedServiceAzureFileStorageInput

func (LinkedServiceAzureFileStorageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedServiceAzureFileStorage)(nil)).Elem()
}

func (i LinkedServiceAzureFileStorageMap) ToLinkedServiceAzureFileStorageMapOutput() LinkedServiceAzureFileStorageMapOutput {
	return i.ToLinkedServiceAzureFileStorageMapOutputWithContext(context.Background())
}

func (i LinkedServiceAzureFileStorageMap) ToLinkedServiceAzureFileStorageMapOutputWithContext(ctx context.Context) LinkedServiceAzureFileStorageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceAzureFileStorageMapOutput)
}

type LinkedServiceAzureFileStorageOutput struct{ *pulumi.OutputState }

func (LinkedServiceAzureFileStorageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedServiceAzureFileStorage)(nil)).Elem()
}

func (o LinkedServiceAzureFileStorageOutput) ToLinkedServiceAzureFileStorageOutput() LinkedServiceAzureFileStorageOutput {
	return o
}

func (o LinkedServiceAzureFileStorageOutput) ToLinkedServiceAzureFileStorageOutputWithContext(ctx context.Context) LinkedServiceAzureFileStorageOutput {
	return o
}

// A map of additional properties to associate with the Data Factory Linked Service.
//
// The following supported arguments are specific to Azure File Storage Linked Service:
func (o LinkedServiceAzureFileStorageOutput) AdditionalProperties() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringMapOutput { return v.AdditionalProperties }).(pulumi.StringMapOutput)
}

// List of tags that can be used for describing the Data Factory Linked Service.
func (o LinkedServiceAzureFileStorageOutput) Annotations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringArrayOutput { return v.Annotations }).(pulumi.StringArrayOutput)
}

// The connection string.
func (o LinkedServiceAzureFileStorageOutput) ConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringOutput { return v.ConnectionString }).(pulumi.StringOutput)
}

// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
func (o LinkedServiceAzureFileStorageOutput) DataFactoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringOutput { return v.DataFactoryId }).(pulumi.StringOutput)
}

// The description for the Data Factory Linked Service.
func (o LinkedServiceAzureFileStorageOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the file share.
func (o LinkedServiceAzureFileStorageOutput) FileShare() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringPtrOutput { return v.FileShare }).(pulumi.StringPtrOutput)
}

// The Host name of the server.
func (o LinkedServiceAzureFileStorageOutput) Host() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringPtrOutput { return v.Host }).(pulumi.StringPtrOutput)
}

// The integration runtime reference to associate with the Data Factory Linked Service.
func (o LinkedServiceAzureFileStorageOutput) IntegrationRuntimeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringPtrOutput { return v.IntegrationRuntimeName }).(pulumi.StringPtrOutput)
}

// A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
func (o LinkedServiceAzureFileStorageOutput) KeyVaultPassword() LinkedServiceAzureFileStorageKeyVaultPasswordPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) LinkedServiceAzureFileStorageKeyVaultPasswordPtrOutput {
		return v.KeyVaultPassword
	}).(LinkedServiceAzureFileStorageKeyVaultPasswordPtrOutput)
}

// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
func (o LinkedServiceAzureFileStorageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A map of parameters to associate with the Data Factory Linked Service.
func (o LinkedServiceAzureFileStorageOutput) Parameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringMapOutput { return v.Parameters }).(pulumi.StringMapOutput)
}

// The password to log in the server.
func (o LinkedServiceAzureFileStorageOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The user ID to log in the server.
func (o LinkedServiceAzureFileStorageOutput) UserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureFileStorage) pulumi.StringPtrOutput { return v.UserId }).(pulumi.StringPtrOutput)
}

type LinkedServiceAzureFileStorageArrayOutput struct{ *pulumi.OutputState }

func (LinkedServiceAzureFileStorageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedServiceAzureFileStorage)(nil)).Elem()
}

func (o LinkedServiceAzureFileStorageArrayOutput) ToLinkedServiceAzureFileStorageArrayOutput() LinkedServiceAzureFileStorageArrayOutput {
	return o
}

func (o LinkedServiceAzureFileStorageArrayOutput) ToLinkedServiceAzureFileStorageArrayOutputWithContext(ctx context.Context) LinkedServiceAzureFileStorageArrayOutput {
	return o
}

func (o LinkedServiceAzureFileStorageArrayOutput) Index(i pulumi.IntInput) LinkedServiceAzureFileStorageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LinkedServiceAzureFileStorage {
		return vs[0].([]*LinkedServiceAzureFileStorage)[vs[1].(int)]
	}).(LinkedServiceAzureFileStorageOutput)
}

type LinkedServiceAzureFileStorageMapOutput struct{ *pulumi.OutputState }

func (LinkedServiceAzureFileStorageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedServiceAzureFileStorage)(nil)).Elem()
}

func (o LinkedServiceAzureFileStorageMapOutput) ToLinkedServiceAzureFileStorageMapOutput() LinkedServiceAzureFileStorageMapOutput {
	return o
}

func (o LinkedServiceAzureFileStorageMapOutput) ToLinkedServiceAzureFileStorageMapOutputWithContext(ctx context.Context) LinkedServiceAzureFileStorageMapOutput {
	return o
}

func (o LinkedServiceAzureFileStorageMapOutput) MapIndex(k pulumi.StringInput) LinkedServiceAzureFileStorageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LinkedServiceAzureFileStorage {
		return vs[0].(map[string]*LinkedServiceAzureFileStorage)[vs[1].(string)]
	}).(LinkedServiceAzureFileStorageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceAzureFileStorageInput)(nil)).Elem(), &LinkedServiceAzureFileStorage{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceAzureFileStorageArrayInput)(nil)).Elem(), LinkedServiceAzureFileStorageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceAzureFileStorageMapInput)(nil)).Elem(), LinkedServiceAzureFileStorageMap{})
	pulumi.RegisterOutputType(LinkedServiceAzureFileStorageOutput{})
	pulumi.RegisterOutputType(LinkedServiceAzureFileStorageArrayOutput{})
	pulumi.RegisterOutputType(LinkedServiceAzureFileStorageMapOutput{})
}

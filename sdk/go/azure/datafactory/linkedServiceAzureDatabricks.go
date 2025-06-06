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

// Manages a Linked Service (connection) between Azure Databricks and Azure Data Factory.
//
// ## Example Usage
//
// ### With Managed Identity & New Cluster
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/databricks"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/datafactory"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example"),
//				Location: pulumi.String("East US"),
//			})
//			if err != nil {
//				return err
//			}
//			// Create a Linked Service using managed identity and new cluster config
//			exampleFactory, err := datafactory.NewFactory(ctx, "example", &datafactory.FactoryArgs{
//				Name:              pulumi.String("TestDtaFactory92783401247"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Identity: &datafactory.FactoryIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Create a databricks instance
//			exampleWorkspace, err := databricks.NewWorkspace(ctx, "example", &databricks.WorkspaceArgs{
//				Name:              pulumi.String("databricks-test"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				Sku:               pulumi.String("standard"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datafactory.NewLinkedServiceAzureDatabricks(ctx, "msi_linked", &datafactory.LinkedServiceAzureDatabricksArgs{
//				Name:          pulumi.String("ADBLinkedServiceViaMSI"),
//				DataFactoryId: exampleFactory.ID(),
//				Description:   pulumi.String("ADB Linked Service via MSI"),
//				AdbDomain: exampleWorkspace.WorkspaceUrl.ApplyT(func(workspaceUrl string) (string, error) {
//					return fmt.Sprintf("https://%v", workspaceUrl), nil
//				}).(pulumi.StringOutput),
//				MsiWorkSpaceResourceId: exampleWorkspace.ID(),
//				NewClusterConfig: &datafactory.LinkedServiceAzureDatabricksNewClusterConfigArgs{
//					NodeType:           pulumi.String("Standard_NC12"),
//					ClusterVersion:     pulumi.String("5.5.x-gpu-scala2.11"),
//					MinNumberOfWorkers: pulumi.Int(1),
//					MaxNumberOfWorkers: pulumi.Int(5),
//					DriverNodeType:     pulumi.String("Standard_NC12"),
//					LogDestination:     pulumi.String("dbfs:/logs"),
//					CustomTags: pulumi.StringMap{
//						"custom_tag1": pulumi.String("sct_value_1"),
//						"custom_tag2": pulumi.String("sct_value_2"),
//					},
//					SparkConfig: pulumi.StringMap{
//						"config1": pulumi.String("value1"),
//						"config2": pulumi.String("value2"),
//					},
//					SparkEnvironmentVariables: pulumi.StringMap{
//						"envVar1": pulumi.String("value1"),
//						"envVar2": pulumi.String("value2"),
//					},
//					InitScripts: pulumi.StringArray{
//						pulumi.String("init.sh"),
//						pulumi.String("init2.sh"),
//					},
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
// ### With Access Token & Existing Cluster
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/databricks"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/datafactory"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example"),
//				Location: pulumi.String("East US"),
//			})
//			if err != nil {
//				return err
//			}
//			// Link to an existing cluster via access token
//			exampleFactory, err := datafactory.NewFactory(ctx, "example", &datafactory.FactoryArgs{
//				Name:              pulumi.String("TestDtaFactory92783401247"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			// Create a databricks instance
//			exampleWorkspace, err := databricks.NewWorkspace(ctx, "example", &databricks.WorkspaceArgs{
//				Name:              pulumi.String("databricks-test"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				Sku:               pulumi.String("standard"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datafactory.NewLinkedServiceAzureDatabricks(ctx, "at_linked", &datafactory.LinkedServiceAzureDatabricksArgs{
//				Name:              pulumi.String("ADBLinkedServiceViaAccessToken"),
//				DataFactoryId:     exampleFactory.ID(),
//				Description:       pulumi.String("ADB Linked Service via Access Token"),
//				ExistingClusterId: pulumi.String("0308-201146-sly615"),
//				AccessToken:       pulumi.String("SomeDatabricksAccessToken"),
//				AdbDomain: exampleWorkspace.WorkspaceUrl.ApplyT(func(workspaceUrl string) (string, error) {
//					return fmt.Sprintf("https://%v", workspaceUrl), nil
//				}).(pulumi.StringOutput),
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
// Data Factory Linked Services can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:datafactory/linkedServiceAzureDatabricks:LinkedServiceAzureDatabricks example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
// ```
type LinkedServiceAzureDatabricks struct {
	pulumi.CustomResourceState

	// Authenticate to ADB via an access token.
	AccessToken pulumi.StringPtrOutput `pulumi:"accessToken"`
	// The domain URL of the databricks instance.
	AdbDomain pulumi.StringOutput `pulumi:"adbDomain"`
	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties pulumi.StringMapOutput `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayOutput `pulumi:"annotations"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringOutput `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The clusterId of an existing cluster within the linked ADB instance.
	ExistingClusterId pulumi.StringPtrOutput `pulumi:"existingClusterId"`
	// Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
	InstancePool LinkedServiceAzureDatabricksInstancePoolPtrOutput `pulumi:"instancePool"`
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName pulumi.StringPtrOutput `pulumi:"integrationRuntimeName"`
	// Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
	KeyVaultPassword LinkedServiceAzureDatabricksKeyVaultPasswordPtrOutput `pulumi:"keyVaultPassword"`
	// Authenticate to ADB via managed service identity.
	MsiWorkSpaceResourceId pulumi.StringPtrOutput `pulumi:"msiWorkSpaceResourceId"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
	NewClusterConfig LinkedServiceAzureDatabricksNewClusterConfigPtrOutput `pulumi:"newClusterConfig"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
}

// NewLinkedServiceAzureDatabricks registers a new resource with the given unique name, arguments, and options.
func NewLinkedServiceAzureDatabricks(ctx *pulumi.Context,
	name string, args *LinkedServiceAzureDatabricksArgs, opts ...pulumi.ResourceOption) (*LinkedServiceAzureDatabricks, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AdbDomain == nil {
		return nil, errors.New("invalid value for required argument 'AdbDomain'")
	}
	if args.DataFactoryId == nil {
		return nil, errors.New("invalid value for required argument 'DataFactoryId'")
	}
	if args.AccessToken != nil {
		args.AccessToken = pulumi.ToSecret(args.AccessToken).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"accessToken",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LinkedServiceAzureDatabricks
	err := ctx.RegisterResource("azure:datafactory/linkedServiceAzureDatabricks:LinkedServiceAzureDatabricks", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLinkedServiceAzureDatabricks gets an existing LinkedServiceAzureDatabricks resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLinkedServiceAzureDatabricks(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkedServiceAzureDatabricksState, opts ...pulumi.ResourceOption) (*LinkedServiceAzureDatabricks, error) {
	var resource LinkedServiceAzureDatabricks
	err := ctx.ReadResource("azure:datafactory/linkedServiceAzureDatabricks:LinkedServiceAzureDatabricks", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LinkedServiceAzureDatabricks resources.
type linkedServiceAzureDatabricksState struct {
	// Authenticate to ADB via an access token.
	AccessToken *string `pulumi:"accessToken"`
	// The domain URL of the databricks instance.
	AdbDomain *string `pulumi:"adbDomain"`
	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations []string `pulumi:"annotations"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId *string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description *string `pulumi:"description"`
	// The clusterId of an existing cluster within the linked ADB instance.
	ExistingClusterId *string `pulumi:"existingClusterId"`
	// Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
	InstancePool *LinkedServiceAzureDatabricksInstancePool `pulumi:"instancePool"`
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName *string `pulumi:"integrationRuntimeName"`
	// Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
	KeyVaultPassword *LinkedServiceAzureDatabricksKeyVaultPassword `pulumi:"keyVaultPassword"`
	// Authenticate to ADB via managed service identity.
	MsiWorkSpaceResourceId *string `pulumi:"msiWorkSpaceResourceId"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
	NewClusterConfig *LinkedServiceAzureDatabricksNewClusterConfig `pulumi:"newClusterConfig"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters map[string]string `pulumi:"parameters"`
}

type LinkedServiceAzureDatabricksState struct {
	// Authenticate to ADB via an access token.
	AccessToken pulumi.StringPtrInput
	// The domain URL of the databricks instance.
	AdbDomain pulumi.StringPtrInput
	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayInput
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringPtrInput
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrInput
	// The clusterId of an existing cluster within the linked ADB instance.
	ExistingClusterId pulumi.StringPtrInput
	// Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
	InstancePool LinkedServiceAzureDatabricksInstancePoolPtrInput
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName pulumi.StringPtrInput
	// Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
	KeyVaultPassword LinkedServiceAzureDatabricksKeyVaultPasswordPtrInput
	// Authenticate to ADB via managed service identity.
	MsiWorkSpaceResourceId pulumi.StringPtrInput
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
	NewClusterConfig LinkedServiceAzureDatabricksNewClusterConfigPtrInput
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapInput
}

func (LinkedServiceAzureDatabricksState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceAzureDatabricksState)(nil)).Elem()
}

type linkedServiceAzureDatabricksArgs struct {
	// Authenticate to ADB via an access token.
	AccessToken *string `pulumi:"accessToken"`
	// The domain URL of the databricks instance.
	AdbDomain string `pulumi:"adbDomain"`
	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties map[string]string `pulumi:"additionalProperties"`
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations []string `pulumi:"annotations"`
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId string `pulumi:"dataFactoryId"`
	// The description for the Data Factory Linked Service.
	Description *string `pulumi:"description"`
	// The clusterId of an existing cluster within the linked ADB instance.
	ExistingClusterId *string `pulumi:"existingClusterId"`
	// Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
	InstancePool *LinkedServiceAzureDatabricksInstancePool `pulumi:"instancePool"`
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName *string `pulumi:"integrationRuntimeName"`
	// Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
	KeyVaultPassword *LinkedServiceAzureDatabricksKeyVaultPassword `pulumi:"keyVaultPassword"`
	// Authenticate to ADB via managed service identity.
	MsiWorkSpaceResourceId *string `pulumi:"msiWorkSpaceResourceId"`
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name *string `pulumi:"name"`
	// Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
	NewClusterConfig *LinkedServiceAzureDatabricksNewClusterConfig `pulumi:"newClusterConfig"`
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters map[string]string `pulumi:"parameters"`
}

// The set of arguments for constructing a LinkedServiceAzureDatabricks resource.
type LinkedServiceAzureDatabricksArgs struct {
	// Authenticate to ADB via an access token.
	AccessToken pulumi.StringPtrInput
	// The domain URL of the databricks instance.
	AdbDomain pulumi.StringInput
	// A map of additional properties to associate with the Data Factory Linked Service.
	AdditionalProperties pulumi.StringMapInput
	// List of tags that can be used for describing the Data Factory Linked Service.
	Annotations pulumi.StringArrayInput
	// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
	DataFactoryId pulumi.StringInput
	// The description for the Data Factory Linked Service.
	Description pulumi.StringPtrInput
	// The clusterId of an existing cluster within the linked ADB instance.
	ExistingClusterId pulumi.StringPtrInput
	// Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
	InstancePool LinkedServiceAzureDatabricksInstancePoolPtrInput
	// The integration runtime reference to associate with the Data Factory Linked Service.
	IntegrationRuntimeName pulumi.StringPtrInput
	// Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
	KeyVaultPassword LinkedServiceAzureDatabricksKeyVaultPasswordPtrInput
	// Authenticate to ADB via managed service identity.
	MsiWorkSpaceResourceId pulumi.StringPtrInput
	// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
	Name pulumi.StringPtrInput
	// Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
	NewClusterConfig LinkedServiceAzureDatabricksNewClusterConfigPtrInput
	// A map of parameters to associate with the Data Factory Linked Service.
	Parameters pulumi.StringMapInput
}

func (LinkedServiceAzureDatabricksArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkedServiceAzureDatabricksArgs)(nil)).Elem()
}

type LinkedServiceAzureDatabricksInput interface {
	pulumi.Input

	ToLinkedServiceAzureDatabricksOutput() LinkedServiceAzureDatabricksOutput
	ToLinkedServiceAzureDatabricksOutputWithContext(ctx context.Context) LinkedServiceAzureDatabricksOutput
}

func (*LinkedServiceAzureDatabricks) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedServiceAzureDatabricks)(nil)).Elem()
}

func (i *LinkedServiceAzureDatabricks) ToLinkedServiceAzureDatabricksOutput() LinkedServiceAzureDatabricksOutput {
	return i.ToLinkedServiceAzureDatabricksOutputWithContext(context.Background())
}

func (i *LinkedServiceAzureDatabricks) ToLinkedServiceAzureDatabricksOutputWithContext(ctx context.Context) LinkedServiceAzureDatabricksOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceAzureDatabricksOutput)
}

// LinkedServiceAzureDatabricksArrayInput is an input type that accepts LinkedServiceAzureDatabricksArray and LinkedServiceAzureDatabricksArrayOutput values.
// You can construct a concrete instance of `LinkedServiceAzureDatabricksArrayInput` via:
//
//	LinkedServiceAzureDatabricksArray{ LinkedServiceAzureDatabricksArgs{...} }
type LinkedServiceAzureDatabricksArrayInput interface {
	pulumi.Input

	ToLinkedServiceAzureDatabricksArrayOutput() LinkedServiceAzureDatabricksArrayOutput
	ToLinkedServiceAzureDatabricksArrayOutputWithContext(context.Context) LinkedServiceAzureDatabricksArrayOutput
}

type LinkedServiceAzureDatabricksArray []LinkedServiceAzureDatabricksInput

func (LinkedServiceAzureDatabricksArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedServiceAzureDatabricks)(nil)).Elem()
}

func (i LinkedServiceAzureDatabricksArray) ToLinkedServiceAzureDatabricksArrayOutput() LinkedServiceAzureDatabricksArrayOutput {
	return i.ToLinkedServiceAzureDatabricksArrayOutputWithContext(context.Background())
}

func (i LinkedServiceAzureDatabricksArray) ToLinkedServiceAzureDatabricksArrayOutputWithContext(ctx context.Context) LinkedServiceAzureDatabricksArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceAzureDatabricksArrayOutput)
}

// LinkedServiceAzureDatabricksMapInput is an input type that accepts LinkedServiceAzureDatabricksMap and LinkedServiceAzureDatabricksMapOutput values.
// You can construct a concrete instance of `LinkedServiceAzureDatabricksMapInput` via:
//
//	LinkedServiceAzureDatabricksMap{ "key": LinkedServiceAzureDatabricksArgs{...} }
type LinkedServiceAzureDatabricksMapInput interface {
	pulumi.Input

	ToLinkedServiceAzureDatabricksMapOutput() LinkedServiceAzureDatabricksMapOutput
	ToLinkedServiceAzureDatabricksMapOutputWithContext(context.Context) LinkedServiceAzureDatabricksMapOutput
}

type LinkedServiceAzureDatabricksMap map[string]LinkedServiceAzureDatabricksInput

func (LinkedServiceAzureDatabricksMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedServiceAzureDatabricks)(nil)).Elem()
}

func (i LinkedServiceAzureDatabricksMap) ToLinkedServiceAzureDatabricksMapOutput() LinkedServiceAzureDatabricksMapOutput {
	return i.ToLinkedServiceAzureDatabricksMapOutputWithContext(context.Background())
}

func (i LinkedServiceAzureDatabricksMap) ToLinkedServiceAzureDatabricksMapOutputWithContext(ctx context.Context) LinkedServiceAzureDatabricksMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkedServiceAzureDatabricksMapOutput)
}

type LinkedServiceAzureDatabricksOutput struct{ *pulumi.OutputState }

func (LinkedServiceAzureDatabricksOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LinkedServiceAzureDatabricks)(nil)).Elem()
}

func (o LinkedServiceAzureDatabricksOutput) ToLinkedServiceAzureDatabricksOutput() LinkedServiceAzureDatabricksOutput {
	return o
}

func (o LinkedServiceAzureDatabricksOutput) ToLinkedServiceAzureDatabricksOutputWithContext(ctx context.Context) LinkedServiceAzureDatabricksOutput {
	return o
}

// Authenticate to ADB via an access token.
func (o LinkedServiceAzureDatabricksOutput) AccessToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringPtrOutput { return v.AccessToken }).(pulumi.StringPtrOutput)
}

// The domain URL of the databricks instance.
func (o LinkedServiceAzureDatabricksOutput) AdbDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringOutput { return v.AdbDomain }).(pulumi.StringOutput)
}

// A map of additional properties to associate with the Data Factory Linked Service.
func (o LinkedServiceAzureDatabricksOutput) AdditionalProperties() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringMapOutput { return v.AdditionalProperties }).(pulumi.StringMapOutput)
}

// List of tags that can be used for describing the Data Factory Linked Service.
func (o LinkedServiceAzureDatabricksOutput) Annotations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringArrayOutput { return v.Annotations }).(pulumi.StringArrayOutput)
}

// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
func (o LinkedServiceAzureDatabricksOutput) DataFactoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringOutput { return v.DataFactoryId }).(pulumi.StringOutput)
}

// The description for the Data Factory Linked Service.
func (o LinkedServiceAzureDatabricksOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The clusterId of an existing cluster within the linked ADB instance.
func (o LinkedServiceAzureDatabricksOutput) ExistingClusterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringPtrOutput { return v.ExistingClusterId }).(pulumi.StringPtrOutput)
}

// Leverages an instance pool within the linked ADB instance as one `instancePool` block defined below.
func (o LinkedServiceAzureDatabricksOutput) InstancePool() LinkedServiceAzureDatabricksInstancePoolPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) LinkedServiceAzureDatabricksInstancePoolPtrOutput {
		return v.InstancePool
	}).(LinkedServiceAzureDatabricksInstancePoolPtrOutput)
}

// The integration runtime reference to associate with the Data Factory Linked Service.
func (o LinkedServiceAzureDatabricksOutput) IntegrationRuntimeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringPtrOutput { return v.IntegrationRuntimeName }).(pulumi.StringPtrOutput)
}

// Authenticate to ADB via Azure Key Vault Linked Service as defined in the `keyVaultPassword` block below.
func (o LinkedServiceAzureDatabricksOutput) KeyVaultPassword() LinkedServiceAzureDatabricksKeyVaultPasswordPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) LinkedServiceAzureDatabricksKeyVaultPasswordPtrOutput {
		return v.KeyVaultPassword
	}).(LinkedServiceAzureDatabricksKeyVaultPasswordPtrOutput)
}

// Authenticate to ADB via managed service identity.
func (o LinkedServiceAzureDatabricksOutput) MsiWorkSpaceResourceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringPtrOutput { return v.MsiWorkSpaceResourceId }).(pulumi.StringPtrOutput)
}

// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
func (o LinkedServiceAzureDatabricksOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Creates new clusters within the linked ADB instance as defined in the `newClusterConfig` block below.
func (o LinkedServiceAzureDatabricksOutput) NewClusterConfig() LinkedServiceAzureDatabricksNewClusterConfigPtrOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) LinkedServiceAzureDatabricksNewClusterConfigPtrOutput {
		return v.NewClusterConfig
	}).(LinkedServiceAzureDatabricksNewClusterConfigPtrOutput)
}

// A map of parameters to associate with the Data Factory Linked Service.
func (o LinkedServiceAzureDatabricksOutput) Parameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LinkedServiceAzureDatabricks) pulumi.StringMapOutput { return v.Parameters }).(pulumi.StringMapOutput)
}

type LinkedServiceAzureDatabricksArrayOutput struct{ *pulumi.OutputState }

func (LinkedServiceAzureDatabricksArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LinkedServiceAzureDatabricks)(nil)).Elem()
}

func (o LinkedServiceAzureDatabricksArrayOutput) ToLinkedServiceAzureDatabricksArrayOutput() LinkedServiceAzureDatabricksArrayOutput {
	return o
}

func (o LinkedServiceAzureDatabricksArrayOutput) ToLinkedServiceAzureDatabricksArrayOutputWithContext(ctx context.Context) LinkedServiceAzureDatabricksArrayOutput {
	return o
}

func (o LinkedServiceAzureDatabricksArrayOutput) Index(i pulumi.IntInput) LinkedServiceAzureDatabricksOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LinkedServiceAzureDatabricks {
		return vs[0].([]*LinkedServiceAzureDatabricks)[vs[1].(int)]
	}).(LinkedServiceAzureDatabricksOutput)
}

type LinkedServiceAzureDatabricksMapOutput struct{ *pulumi.OutputState }

func (LinkedServiceAzureDatabricksMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LinkedServiceAzureDatabricks)(nil)).Elem()
}

func (o LinkedServiceAzureDatabricksMapOutput) ToLinkedServiceAzureDatabricksMapOutput() LinkedServiceAzureDatabricksMapOutput {
	return o
}

func (o LinkedServiceAzureDatabricksMapOutput) ToLinkedServiceAzureDatabricksMapOutputWithContext(ctx context.Context) LinkedServiceAzureDatabricksMapOutput {
	return o
}

func (o LinkedServiceAzureDatabricksMapOutput) MapIndex(k pulumi.StringInput) LinkedServiceAzureDatabricksOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LinkedServiceAzureDatabricks {
		return vs[0].(map[string]*LinkedServiceAzureDatabricks)[vs[1].(string)]
	}).(LinkedServiceAzureDatabricksOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceAzureDatabricksInput)(nil)).Elem(), &LinkedServiceAzureDatabricks{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceAzureDatabricksArrayInput)(nil)).Elem(), LinkedServiceAzureDatabricksArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkedServiceAzureDatabricksMapInput)(nil)).Elem(), LinkedServiceAzureDatabricksMap{})
	pulumi.RegisterOutputType(LinkedServiceAzureDatabricksOutput{})
	pulumi.RegisterOutputType(LinkedServiceAzureDatabricksArrayOutput{})
	pulumi.RegisterOutputType(LinkedServiceAzureDatabricksMapOutput{})
}

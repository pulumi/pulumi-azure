// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package machinelearning

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages the linked service to link an Azure Machine learning workspace to an Azure Synapse workspace.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appinsights"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/keyvault"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/machinelearning"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/synapse"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			current, err := core.GetClientConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-rg"),
//				Location: pulumi.String("west europe"),
//				Tags: pulumi.StringMap{
//					"stage": pulumi.String("example"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleInsights, err := appinsights.NewInsights(ctx, "example", &appinsights.InsightsArgs{
//				Name:              pulumi.String("example-ai"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				ApplicationType:   pulumi.String("web"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleKeyVault, err := keyvault.NewKeyVault(ctx, "example", &keyvault.KeyVaultArgs{
//				Name:                   pulumi.String("example-kv"),
//				Location:               example.Location,
//				ResourceGroupName:      example.Name,
//				TenantId:               pulumi.String(current.TenantId),
//				SkuName:                pulumi.String("standard"),
//				PurgeProtectionEnabled: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("examplesa"),
//				Location:               example.Location,
//				ResourceGroupName:      example.Name,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleWorkspace, err := machinelearning.NewWorkspace(ctx, "example", &machinelearning.WorkspaceArgs{
//				Name:                  pulumi.String("example-mlw"),
//				Location:              example.Location,
//				ResourceGroupName:     example.Name,
//				ApplicationInsightsId: exampleInsights.ID(),
//				KeyVaultId:            exampleKeyVault.ID(),
//				StorageAccountId:      exampleAccount.ID(),
//				Identity: &machinelearning.WorkspaceIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleDataLakeGen2Filesystem, err := storage.NewDataLakeGen2Filesystem(ctx, "example", &storage.DataLakeGen2FilesystemArgs{
//				Name:             pulumi.String("example"),
//				StorageAccountId: exampleAccount.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleWorkspace2, err := synapse.NewWorkspace(ctx, "example", &synapse.WorkspaceArgs{
//				Name:                            pulumi.String("example"),
//				ResourceGroupName:               example.Name,
//				Location:                        example.Location,
//				StorageDataLakeGen2FilesystemId: exampleDataLakeGen2Filesystem.ID(),
//				SqlAdministratorLogin:           pulumi.String("sqladminuser"),
//				SqlAdministratorLoginPassword:   pulumi.String("H@Sh1CoR3!"),
//				Identity: &synapse.WorkspaceIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleSparkPool, err := synapse.NewSparkPool(ctx, "example", &synapse.SparkPoolArgs{
//				Name:               pulumi.String("example"),
//				SynapseWorkspaceId: exampleWorkspace2.ID(),
//				NodeSizeFamily:     pulumi.String("MemoryOptimized"),
//				NodeSize:           pulumi.String("Small"),
//				NodeCount:          pulumi.Int(3),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = machinelearning.NewSynapseSpark(ctx, "example", &machinelearning.SynapseSparkArgs{
//				Name:                       pulumi.String("example"),
//				MachineLearningWorkspaceId: exampleWorkspace.ID(),
//				Location:                   example.Location,
//				SynapseSparkPoolId:         exampleSparkPool.ID(),
//				Identity: &machinelearning.SynapseSparkIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
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
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.MachineLearningServices`: 2024-04-01
//
// ## Import
//
// Machine Learning Synapse Sparks can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:machinelearning/synapseSpark:SynapseSpark example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.MachineLearningServices/workspaces/workspace1/computes/compute1
// ```
type SynapseSpark struct {
	pulumi.CustomResourceState

	// The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
	Identity SynapseSparkIdentityPtrOutput `pulumi:"identity"`
	// Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
	LocalAuthEnabled pulumi.BoolPtrOutput `pulumi:"localAuthEnabled"`
	// The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
	MachineLearningWorkspaceId pulumi.StringOutput `pulumi:"machineLearningWorkspaceId"`
	// The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
	SynapseSparkPoolId pulumi.StringOutput `pulumi:"synapseSparkPoolId"`
	// A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewSynapseSpark registers a new resource with the given unique name, arguments, and options.
func NewSynapseSpark(ctx *pulumi.Context,
	name string, args *SynapseSparkArgs, opts ...pulumi.ResourceOption) (*SynapseSpark, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MachineLearningWorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'MachineLearningWorkspaceId'")
	}
	if args.SynapseSparkPoolId == nil {
		return nil, errors.New("invalid value for required argument 'SynapseSparkPoolId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SynapseSpark
	err := ctx.RegisterResource("azure:machinelearning/synapseSpark:SynapseSpark", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSynapseSpark gets an existing SynapseSpark resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSynapseSpark(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SynapseSparkState, opts ...pulumi.ResourceOption) (*SynapseSpark, error) {
	var resource SynapseSpark
	err := ctx.ReadResource("azure:machinelearning/synapseSpark:SynapseSpark", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SynapseSpark resources.
type synapseSparkState struct {
	// The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Description *string `pulumi:"description"`
	// An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
	Identity *SynapseSparkIdentity `pulumi:"identity"`
	// Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
	LocalAuthEnabled *bool `pulumi:"localAuthEnabled"`
	// The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
	Location *string `pulumi:"location"`
	// The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
	MachineLearningWorkspaceId *string `pulumi:"machineLearningWorkspaceId"`
	// The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Name *string `pulumi:"name"`
	// The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
	SynapseSparkPoolId *string `pulumi:"synapseSparkPoolId"`
	// A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Tags map[string]string `pulumi:"tags"`
}

type SynapseSparkState struct {
	// The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Description pulumi.StringPtrInput
	// An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
	Identity SynapseSparkIdentityPtrInput
	// Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
	LocalAuthEnabled pulumi.BoolPtrInput
	// The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
	Location pulumi.StringPtrInput
	// The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
	MachineLearningWorkspaceId pulumi.StringPtrInput
	// The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Name pulumi.StringPtrInput
	// The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
	SynapseSparkPoolId pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Tags pulumi.StringMapInput
}

func (SynapseSparkState) ElementType() reflect.Type {
	return reflect.TypeOf((*synapseSparkState)(nil)).Elem()
}

type synapseSparkArgs struct {
	// The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Description *string `pulumi:"description"`
	// An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
	Identity *SynapseSparkIdentity `pulumi:"identity"`
	// Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
	LocalAuthEnabled *bool `pulumi:"localAuthEnabled"`
	// The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
	Location *string `pulumi:"location"`
	// The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
	MachineLearningWorkspaceId string `pulumi:"machineLearningWorkspaceId"`
	// The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Name *string `pulumi:"name"`
	// The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
	SynapseSparkPoolId string `pulumi:"synapseSparkPoolId"`
	// A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a SynapseSpark resource.
type SynapseSparkArgs struct {
	// The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Description pulumi.StringPtrInput
	// An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
	Identity SynapseSparkIdentityPtrInput
	// Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
	LocalAuthEnabled pulumi.BoolPtrInput
	// The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
	Location pulumi.StringPtrInput
	// The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
	MachineLearningWorkspaceId pulumi.StringInput
	// The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Name pulumi.StringPtrInput
	// The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
	SynapseSparkPoolId pulumi.StringInput
	// A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
	Tags pulumi.StringMapInput
}

func (SynapseSparkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*synapseSparkArgs)(nil)).Elem()
}

type SynapseSparkInput interface {
	pulumi.Input

	ToSynapseSparkOutput() SynapseSparkOutput
	ToSynapseSparkOutputWithContext(ctx context.Context) SynapseSparkOutput
}

func (*SynapseSpark) ElementType() reflect.Type {
	return reflect.TypeOf((**SynapseSpark)(nil)).Elem()
}

func (i *SynapseSpark) ToSynapseSparkOutput() SynapseSparkOutput {
	return i.ToSynapseSparkOutputWithContext(context.Background())
}

func (i *SynapseSpark) ToSynapseSparkOutputWithContext(ctx context.Context) SynapseSparkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SynapseSparkOutput)
}

// SynapseSparkArrayInput is an input type that accepts SynapseSparkArray and SynapseSparkArrayOutput values.
// You can construct a concrete instance of `SynapseSparkArrayInput` via:
//
//	SynapseSparkArray{ SynapseSparkArgs{...} }
type SynapseSparkArrayInput interface {
	pulumi.Input

	ToSynapseSparkArrayOutput() SynapseSparkArrayOutput
	ToSynapseSparkArrayOutputWithContext(context.Context) SynapseSparkArrayOutput
}

type SynapseSparkArray []SynapseSparkInput

func (SynapseSparkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SynapseSpark)(nil)).Elem()
}

func (i SynapseSparkArray) ToSynapseSparkArrayOutput() SynapseSparkArrayOutput {
	return i.ToSynapseSparkArrayOutputWithContext(context.Background())
}

func (i SynapseSparkArray) ToSynapseSparkArrayOutputWithContext(ctx context.Context) SynapseSparkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SynapseSparkArrayOutput)
}

// SynapseSparkMapInput is an input type that accepts SynapseSparkMap and SynapseSparkMapOutput values.
// You can construct a concrete instance of `SynapseSparkMapInput` via:
//
//	SynapseSparkMap{ "key": SynapseSparkArgs{...} }
type SynapseSparkMapInput interface {
	pulumi.Input

	ToSynapseSparkMapOutput() SynapseSparkMapOutput
	ToSynapseSparkMapOutputWithContext(context.Context) SynapseSparkMapOutput
}

type SynapseSparkMap map[string]SynapseSparkInput

func (SynapseSparkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SynapseSpark)(nil)).Elem()
}

func (i SynapseSparkMap) ToSynapseSparkMapOutput() SynapseSparkMapOutput {
	return i.ToSynapseSparkMapOutputWithContext(context.Background())
}

func (i SynapseSparkMap) ToSynapseSparkMapOutputWithContext(ctx context.Context) SynapseSparkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SynapseSparkMapOutput)
}

type SynapseSparkOutput struct{ *pulumi.OutputState }

func (SynapseSparkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SynapseSpark)(nil)).Elem()
}

func (o SynapseSparkOutput) ToSynapseSparkOutput() SynapseSparkOutput {
	return o
}

func (o SynapseSparkOutput) ToSynapseSparkOutputWithContext(ctx context.Context) SynapseSparkOutput {
	return o
}

// The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
func (o SynapseSparkOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SynapseSpark) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
func (o SynapseSparkOutput) Identity() SynapseSparkIdentityPtrOutput {
	return o.ApplyT(func(v *SynapseSpark) SynapseSparkIdentityPtrOutput { return v.Identity }).(SynapseSparkIdentityPtrOutput)
}

// Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
func (o SynapseSparkOutput) LocalAuthEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SynapseSpark) pulumi.BoolPtrOutput { return v.LocalAuthEnabled }).(pulumi.BoolPtrOutput)
}

// The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
func (o SynapseSparkOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *SynapseSpark) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
func (o SynapseSparkOutput) MachineLearningWorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SynapseSpark) pulumi.StringOutput { return v.MachineLearningWorkspaceId }).(pulumi.StringOutput)
}

// The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
func (o SynapseSparkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SynapseSpark) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
func (o SynapseSparkOutput) SynapseSparkPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v *SynapseSpark) pulumi.StringOutput { return v.SynapseSparkPoolId }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
func (o SynapseSparkOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SynapseSpark) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type SynapseSparkArrayOutput struct{ *pulumi.OutputState }

func (SynapseSparkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SynapseSpark)(nil)).Elem()
}

func (o SynapseSparkArrayOutput) ToSynapseSparkArrayOutput() SynapseSparkArrayOutput {
	return o
}

func (o SynapseSparkArrayOutput) ToSynapseSparkArrayOutputWithContext(ctx context.Context) SynapseSparkArrayOutput {
	return o
}

func (o SynapseSparkArrayOutput) Index(i pulumi.IntInput) SynapseSparkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SynapseSpark {
		return vs[0].([]*SynapseSpark)[vs[1].(int)]
	}).(SynapseSparkOutput)
}

type SynapseSparkMapOutput struct{ *pulumi.OutputState }

func (SynapseSparkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SynapseSpark)(nil)).Elem()
}

func (o SynapseSparkMapOutput) ToSynapseSparkMapOutput() SynapseSparkMapOutput {
	return o
}

func (o SynapseSparkMapOutput) ToSynapseSparkMapOutputWithContext(ctx context.Context) SynapseSparkMapOutput {
	return o
}

func (o SynapseSparkMapOutput) MapIndex(k pulumi.StringInput) SynapseSparkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SynapseSpark {
		return vs[0].(map[string]*SynapseSpark)[vs[1].(string)]
	}).(SynapseSparkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SynapseSparkInput)(nil)).Elem(), &SynapseSpark{})
	pulumi.RegisterInputType(reflect.TypeOf((*SynapseSparkArrayInput)(nil)).Elem(), SynapseSparkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SynapseSparkMapInput)(nil)).Elem(), SynapseSparkMap{})
	pulumi.RegisterOutputType(SynapseSparkOutput{})
	pulumi.RegisterOutputType(SynapseSparkArrayOutput{})
	pulumi.RegisterOutputType(SynapseSparkMapOutput{})
}

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Storage Mover Job Definition.
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
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleMover, err := storage.NewMover(ctx, "exampleMover", &storage.MoverArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//			})
//			if err != nil {
//				return err
//			}
//			exampleMoverAgent, err := storage.NewMoverAgent(ctx, "exampleMoverAgent", &storage.MoverAgentArgs{
//				StorageMoverId: exampleMover.ID(),
//				ArcVirtualMachineId: exampleResourceGroup.ID().ApplyT(func(id string) (string, error) {
//					return fmt.Sprintf("%v/providers/Microsoft.HybridCompute/machines/examples-hybridComputeName", id), nil
//				}).(pulumi.StringOutput),
//				ArcVirtualMachineUuid: pulumi.String("3bb2c024-eba9-4d18-9e7a-1d772fcc5fe9"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "exampleAccount", &storage.AccountArgs{
//				ResourceGroupName:          exampleResourceGroup.Name,
//				Location:                   exampleResourceGroup.Location,
//				AccountTier:                pulumi.String("Standard"),
//				AccountReplicationType:     pulumi.String("LRS"),
//				AllowNestedItemsToBePublic: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			exampleContainer, err := storage.NewContainer(ctx, "exampleContainer", &storage.ContainerArgs{
//				StorageAccountName:  exampleAccount.Name,
//				ContainerAccessType: pulumi.String("blob"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleMoverTargetEndpoint, err := storage.NewMoverTargetEndpoint(ctx, "exampleMoverTargetEndpoint", &storage.MoverTargetEndpointArgs{
//				StorageMoverId:       exampleMover.ID(),
//				StorageAccountId:     exampleAccount.ID(),
//				StorageContainerName: exampleContainer.Name,
//			})
//			if err != nil {
//				return err
//			}
//			exampleMoverSourceEndpoint, err := storage.NewMoverSourceEndpoint(ctx, "exampleMoverSourceEndpoint", &storage.MoverSourceEndpointArgs{
//				StorageMoverId: exampleMover.ID(),
//				Host:           pulumi.String("192.168.0.1"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleMoverProject, err := storage.NewMoverProject(ctx, "exampleMoverProject", &storage.MoverProjectArgs{
//				StorageMoverId: exampleMover.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = storage.NewMoverJobDefinition(ctx, "exampleMoverJobDefinition", &storage.MoverJobDefinitionArgs{
//				StorageMoverProjectId: exampleMoverProject.ID(),
//				AgentName:             exampleMoverAgent.Name,
//				CopyMode:              pulumi.String("Additive"),
//				SourceName:            exampleMoverSourceEndpoint.Name,
//				SourceSubPath:         pulumi.String("/"),
//				TargetName:            exampleMoverTargetEndpoint.Name,
//				TargetSubPath:         pulumi.String("/"),
//				Description:           pulumi.String("Example Job Definition Description"),
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
// Storage Mover Job Definition can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:storage/moverJobDefinition:MoverJobDefinition example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StorageMover/storageMovers/storageMover1/projects/project1/jobDefinitions/jobDefinition1
//
// ```
type MoverJobDefinition struct {
	pulumi.CustomResourceState

	// Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
	AgentName pulumi.StringPtrOutput `pulumi:"agentName"`
	// Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
	CopyMode pulumi.StringOutput `pulumi:"copyMode"`
	// Specifies a description for this Storage Mover Job Definition.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceName pulumi.StringOutput `pulumi:"sourceName"`
	// Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceSubPath pulumi.StringPtrOutput `pulumi:"sourceSubPath"`
	// Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
	StorageMoverProjectId pulumi.StringOutput `pulumi:"storageMoverProjectId"`
	// Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
	TargetName pulumi.StringOutput `pulumi:"targetName"`
	// Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
	TargetSubPath pulumi.StringPtrOutput `pulumi:"targetSubPath"`
}

// NewMoverJobDefinition registers a new resource with the given unique name, arguments, and options.
func NewMoverJobDefinition(ctx *pulumi.Context,
	name string, args *MoverJobDefinitionArgs, opts ...pulumi.ResourceOption) (*MoverJobDefinition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CopyMode == nil {
		return nil, errors.New("invalid value for required argument 'CopyMode'")
	}
	if args.SourceName == nil {
		return nil, errors.New("invalid value for required argument 'SourceName'")
	}
	if args.StorageMoverProjectId == nil {
		return nil, errors.New("invalid value for required argument 'StorageMoverProjectId'")
	}
	if args.TargetName == nil {
		return nil, errors.New("invalid value for required argument 'TargetName'")
	}
	var resource MoverJobDefinition
	err := ctx.RegisterResource("azure:storage/moverJobDefinition:MoverJobDefinition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMoverJobDefinition gets an existing MoverJobDefinition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMoverJobDefinition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MoverJobDefinitionState, opts ...pulumi.ResourceOption) (*MoverJobDefinition, error) {
	var resource MoverJobDefinition
	err := ctx.ReadResource("azure:storage/moverJobDefinition:MoverJobDefinition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MoverJobDefinition resources.
type moverJobDefinitionState struct {
	// Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
	AgentName *string `pulumi:"agentName"`
	// Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
	CopyMode *string `pulumi:"copyMode"`
	// Specifies a description for this Storage Mover Job Definition.
	Description *string `pulumi:"description"`
	// Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceName *string `pulumi:"sourceName"`
	// Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceSubPath *string `pulumi:"sourceSubPath"`
	// Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
	StorageMoverProjectId *string `pulumi:"storageMoverProjectId"`
	// Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
	TargetName *string `pulumi:"targetName"`
	// Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
	TargetSubPath *string `pulumi:"targetSubPath"`
}

type MoverJobDefinitionState struct {
	// Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
	AgentName pulumi.StringPtrInput
	// Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
	CopyMode pulumi.StringPtrInput
	// Specifies a description for this Storage Mover Job Definition.
	Description pulumi.StringPtrInput
	// Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceName pulumi.StringPtrInput
	// Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceSubPath pulumi.StringPtrInput
	// Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
	StorageMoverProjectId pulumi.StringPtrInput
	// Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
	TargetName pulumi.StringPtrInput
	// Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
	TargetSubPath pulumi.StringPtrInput
}

func (MoverJobDefinitionState) ElementType() reflect.Type {
	return reflect.TypeOf((*moverJobDefinitionState)(nil)).Elem()
}

type moverJobDefinitionArgs struct {
	// Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
	AgentName *string `pulumi:"agentName"`
	// Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
	CopyMode string `pulumi:"copyMode"`
	// Specifies a description for this Storage Mover Job Definition.
	Description *string `pulumi:"description"`
	// Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceName string `pulumi:"sourceName"`
	// Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceSubPath *string `pulumi:"sourceSubPath"`
	// Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
	StorageMoverProjectId string `pulumi:"storageMoverProjectId"`
	// Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
	TargetName string `pulumi:"targetName"`
	// Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
	TargetSubPath *string `pulumi:"targetSubPath"`
}

// The set of arguments for constructing a MoverJobDefinition resource.
type MoverJobDefinitionArgs struct {
	// Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
	AgentName pulumi.StringPtrInput
	// Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
	CopyMode pulumi.StringInput
	// Specifies a description for this Storage Mover Job Definition.
	Description pulumi.StringPtrInput
	// Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceName pulumi.StringInput
	// Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
	SourceSubPath pulumi.StringPtrInput
	// Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
	StorageMoverProjectId pulumi.StringInput
	// Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
	TargetName pulumi.StringInput
	// Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
	TargetSubPath pulumi.StringPtrInput
}

func (MoverJobDefinitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*moverJobDefinitionArgs)(nil)).Elem()
}

type MoverJobDefinitionInput interface {
	pulumi.Input

	ToMoverJobDefinitionOutput() MoverJobDefinitionOutput
	ToMoverJobDefinitionOutputWithContext(ctx context.Context) MoverJobDefinitionOutput
}

func (*MoverJobDefinition) ElementType() reflect.Type {
	return reflect.TypeOf((**MoverJobDefinition)(nil)).Elem()
}

func (i *MoverJobDefinition) ToMoverJobDefinitionOutput() MoverJobDefinitionOutput {
	return i.ToMoverJobDefinitionOutputWithContext(context.Background())
}

func (i *MoverJobDefinition) ToMoverJobDefinitionOutputWithContext(ctx context.Context) MoverJobDefinitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MoverJobDefinitionOutput)
}

// MoverJobDefinitionArrayInput is an input type that accepts MoverJobDefinitionArray and MoverJobDefinitionArrayOutput values.
// You can construct a concrete instance of `MoverJobDefinitionArrayInput` via:
//
//	MoverJobDefinitionArray{ MoverJobDefinitionArgs{...} }
type MoverJobDefinitionArrayInput interface {
	pulumi.Input

	ToMoverJobDefinitionArrayOutput() MoverJobDefinitionArrayOutput
	ToMoverJobDefinitionArrayOutputWithContext(context.Context) MoverJobDefinitionArrayOutput
}

type MoverJobDefinitionArray []MoverJobDefinitionInput

func (MoverJobDefinitionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MoverJobDefinition)(nil)).Elem()
}

func (i MoverJobDefinitionArray) ToMoverJobDefinitionArrayOutput() MoverJobDefinitionArrayOutput {
	return i.ToMoverJobDefinitionArrayOutputWithContext(context.Background())
}

func (i MoverJobDefinitionArray) ToMoverJobDefinitionArrayOutputWithContext(ctx context.Context) MoverJobDefinitionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MoverJobDefinitionArrayOutput)
}

// MoverJobDefinitionMapInput is an input type that accepts MoverJobDefinitionMap and MoverJobDefinitionMapOutput values.
// You can construct a concrete instance of `MoverJobDefinitionMapInput` via:
//
//	MoverJobDefinitionMap{ "key": MoverJobDefinitionArgs{...} }
type MoverJobDefinitionMapInput interface {
	pulumi.Input

	ToMoverJobDefinitionMapOutput() MoverJobDefinitionMapOutput
	ToMoverJobDefinitionMapOutputWithContext(context.Context) MoverJobDefinitionMapOutput
}

type MoverJobDefinitionMap map[string]MoverJobDefinitionInput

func (MoverJobDefinitionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MoverJobDefinition)(nil)).Elem()
}

func (i MoverJobDefinitionMap) ToMoverJobDefinitionMapOutput() MoverJobDefinitionMapOutput {
	return i.ToMoverJobDefinitionMapOutputWithContext(context.Background())
}

func (i MoverJobDefinitionMap) ToMoverJobDefinitionMapOutputWithContext(ctx context.Context) MoverJobDefinitionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MoverJobDefinitionMapOutput)
}

type MoverJobDefinitionOutput struct{ *pulumi.OutputState }

func (MoverJobDefinitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MoverJobDefinition)(nil)).Elem()
}

func (o MoverJobDefinitionOutput) ToMoverJobDefinitionOutput() MoverJobDefinitionOutput {
	return o
}

func (o MoverJobDefinitionOutput) ToMoverJobDefinitionOutputWithContext(ctx context.Context) MoverJobDefinitionOutput {
	return o
}

// Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
func (o MoverJobDefinitionOutput) AgentName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MoverJobDefinition) pulumi.StringPtrOutput { return v.AgentName }).(pulumi.StringPtrOutput)
}

// Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
func (o MoverJobDefinitionOutput) CopyMode() pulumi.StringOutput {
	return o.ApplyT(func(v *MoverJobDefinition) pulumi.StringOutput { return v.CopyMode }).(pulumi.StringOutput)
}

// Specifies a description for this Storage Mover Job Definition.
func (o MoverJobDefinitionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MoverJobDefinition) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
func (o MoverJobDefinitionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MoverJobDefinition) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
func (o MoverJobDefinitionOutput) SourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *MoverJobDefinition) pulumi.StringOutput { return v.SourceName }).(pulumi.StringOutput)
}

// Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
func (o MoverJobDefinitionOutput) SourceSubPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MoverJobDefinition) pulumi.StringPtrOutput { return v.SourceSubPath }).(pulumi.StringPtrOutput)
}

// Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
func (o MoverJobDefinitionOutput) StorageMoverProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *MoverJobDefinition) pulumi.StringOutput { return v.StorageMoverProjectId }).(pulumi.StringOutput)
}

// Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
func (o MoverJobDefinitionOutput) TargetName() pulumi.StringOutput {
	return o.ApplyT(func(v *MoverJobDefinition) pulumi.StringOutput { return v.TargetName }).(pulumi.StringOutput)
}

// Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
func (o MoverJobDefinitionOutput) TargetSubPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MoverJobDefinition) pulumi.StringPtrOutput { return v.TargetSubPath }).(pulumi.StringPtrOutput)
}

type MoverJobDefinitionArrayOutput struct{ *pulumi.OutputState }

func (MoverJobDefinitionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MoverJobDefinition)(nil)).Elem()
}

func (o MoverJobDefinitionArrayOutput) ToMoverJobDefinitionArrayOutput() MoverJobDefinitionArrayOutput {
	return o
}

func (o MoverJobDefinitionArrayOutput) ToMoverJobDefinitionArrayOutputWithContext(ctx context.Context) MoverJobDefinitionArrayOutput {
	return o
}

func (o MoverJobDefinitionArrayOutput) Index(i pulumi.IntInput) MoverJobDefinitionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MoverJobDefinition {
		return vs[0].([]*MoverJobDefinition)[vs[1].(int)]
	}).(MoverJobDefinitionOutput)
}

type MoverJobDefinitionMapOutput struct{ *pulumi.OutputState }

func (MoverJobDefinitionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MoverJobDefinition)(nil)).Elem()
}

func (o MoverJobDefinitionMapOutput) ToMoverJobDefinitionMapOutput() MoverJobDefinitionMapOutput {
	return o
}

func (o MoverJobDefinitionMapOutput) ToMoverJobDefinitionMapOutputWithContext(ctx context.Context) MoverJobDefinitionMapOutput {
	return o
}

func (o MoverJobDefinitionMapOutput) MapIndex(k pulumi.StringInput) MoverJobDefinitionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MoverJobDefinition {
		return vs[0].(map[string]*MoverJobDefinition)[vs[1].(string)]
	}).(MoverJobDefinitionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MoverJobDefinitionInput)(nil)).Elem(), &MoverJobDefinition{})
	pulumi.RegisterInputType(reflect.TypeOf((*MoverJobDefinitionArrayInput)(nil)).Elem(), MoverJobDefinitionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MoverJobDefinitionMapInput)(nil)).Elem(), MoverJobDefinitionMap{})
	pulumi.RegisterOutputType(MoverJobDefinitionOutput{})
	pulumi.RegisterOutputType(MoverJobDefinitionArrayOutput{})
	pulumi.RegisterOutputType(MoverJobDefinitionMapOutput{})
}
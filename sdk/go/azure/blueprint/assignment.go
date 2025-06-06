// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package blueprint

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Blueprint Assignment resource
//
// > **NOTE:** Azure Blueprints are in Preview and potentially subject to breaking change without notice.
//
// > **NOTE:** Azure Blueprint Assignments can only be applied to Subscriptions.  Assignments to Management Groups is not currently supported by the service or by this provider.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/authorization"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/blueprint"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
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
//			example, err := core.LookupSubscription(ctx, &core.LookupSubscriptionArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetDefinition, err := blueprint.GetDefinition(ctx, &blueprint.GetDefinitionArgs{
//				Name:    "exampleBlueprint",
//				ScopeId: example.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetPublishedVersion, err := blueprint.GetPublishedVersion(ctx, &blueprint.GetPublishedVersionArgs{
//				ScopeId:       exampleGetDefinition.ScopeId,
//				BlueprintName: exampleGetDefinition.Name,
//				Version:       "v1.0.0",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("exampleRG-bp"),
//				Location: pulumi.String("West Europe"),
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("example"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleUserAssignedIdentity, err := authorization.NewUserAssignedIdentity(ctx, "example", &authorization.UserAssignedIdentityArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				Name:              pulumi.String("bp-user-example"),
//			})
//			if err != nil {
//				return err
//			}
//			operator, err := authorization.NewAssignment(ctx, "operator", &authorization.AssignmentArgs{
//				Scope:              pulumi.String(example.Id),
//				RoleDefinitionName: pulumi.String("Blueprint Operator"),
//				PrincipalId:        exampleUserAssignedIdentity.PrincipalId,
//			})
//			if err != nil {
//				return err
//			}
//			owner, err := authorization.NewAssignment(ctx, "owner", &authorization.AssignmentArgs{
//				Scope:              pulumi.String(example.Id),
//				RoleDefinitionName: pulumi.String("Owner"),
//				PrincipalId:        exampleUserAssignedIdentity.PrincipalId,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = blueprint.NewAssignment(ctx, "example", &blueprint.AssignmentArgs{
//				Name:                 pulumi.String("testAccBPAssignment"),
//				TargetSubscriptionId: pulumi.String(example.Id),
//				VersionId:            pulumi.String(exampleGetPublishedVersion.Id),
//				Location:             exampleResourceGroup.Location,
//				LockMode:             pulumi.String("AllResourcesDoNotDelete"),
//				LockExcludePrincipals: pulumi.StringArray{
//					pulumi.String(current.ObjectId),
//				},
//				Identity: &blueprint.AssignmentIdentityArgs{
//					Type: pulumi.String("UserAssigned"),
//					IdentityIds: pulumi.StringArray{
//						exampleUserAssignedIdentity.ID(),
//					},
//				},
//				ResourceGroups: pulumi.String(`    {
//	      "ResourceGroup": {
//	        "name": "exampleRG-bp"
//	      }
//	    }
//
// `),
//
//				ParameterValues: pulumi.String(`    {
//	      "allowedlocationsforresourcegroups_listOfAllowedLocations": {
//	        "value": ["westus", "westus2", "eastus", "centralus", "centraluseuap", "southcentralus", "northcentralus", "westcentralus", "eastus2", "eastus2euap", "brazilsouth", "brazilus", "northeurope", "westeurope", "eastasia", "southeastasia", "japanwest", "japaneast", "koreacentral", "koreasouth", "indiasouth", "indiawest", "indiacentral", "australiaeast", "australiasoutheast", "canadacentral", "canadaeast", "uknorth", "uksouth2", "uksouth", "ukwest", "francecentral", "francesouth", "australiacentral", "australiacentral2", "uaecentral", "uaenorth", "southafricanorth", "southafricawest", "switzerlandnorth", "switzerlandwest", "germanynorth", "germanywestcentral", "norwayeast", "norwaywest"]
//	      }
//	    }
//
// `),
//
//			}, pulumi.DependsOn([]pulumi.Resource{
//				operator,
//				owner,
//			}))
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
// Azure Blueprint Assignments can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:blueprint/assignment:Assignment example "/subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Blueprint/blueprintAssignments/assignSimpleBlueprint"
// ```
type Assignment struct {
	pulumi.CustomResourceState

	// The name of the blueprint assigned
	BlueprintName pulumi.StringOutput `pulumi:"blueprintName"`
	// The Description on the Blueprint
	Description pulumi.StringOutput `pulumi:"description"`
	// The display name of the blueprint
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// An `identity` block as defined below.
	Identity AssignmentIdentityOutput `pulumi:"identity"`
	// The Azure location of the Assignment. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// a list of up to 200 actions that are permitted to bypass the locks applied by the Blueprint.
	LockExcludeActions pulumi.StringArrayOutput `pulumi:"lockExcludeActions"`
	// a list of up to 5 Principal IDs that are permitted to bypass the locks applied by the Blueprint.
	LockExcludePrincipals pulumi.StringArrayOutput `pulumi:"lockExcludePrincipals"`
	// The locking mode of the Blueprint Assignment. One of `None` (Default), `AllResourcesReadOnly`, or `AllResourcesDoNotDelete`. Defaults to `None`.
	LockMode pulumi.StringPtrOutput `pulumi:"lockMode"`
	// The name of the Blueprint Assignment. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// a JSON string to supply Blueprint Assignment parameter values.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ParameterValues pulumi.StringPtrOutput `pulumi:"parameterValues"`
	// a JSON string to supply the Blueprint Resource Group information.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ResourceGroups pulumi.StringPtrOutput `pulumi:"resourceGroups"`
	// The Subscription ID the Blueprint Published Version is to be applied to. Changing this forces a new resource to be created.
	TargetSubscriptionId pulumi.StringOutput `pulumi:"targetSubscriptionId"`
	Type                 pulumi.StringOutput `pulumi:"type"`
	// The ID of the Published Version of the blueprint to be assigned.
	VersionId pulumi.StringOutput `pulumi:"versionId"`
}

// NewAssignment registers a new resource with the given unique name, arguments, and options.
func NewAssignment(ctx *pulumi.Context,
	name string, args *AssignmentArgs, opts ...pulumi.ResourceOption) (*Assignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identity == nil {
		return nil, errors.New("invalid value for required argument 'Identity'")
	}
	if args.TargetSubscriptionId == nil {
		return nil, errors.New("invalid value for required argument 'TargetSubscriptionId'")
	}
	if args.VersionId == nil {
		return nil, errors.New("invalid value for required argument 'VersionId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Assignment
	err := ctx.RegisterResource("azure:blueprint/assignment:Assignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAssignment gets an existing Assignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AssignmentState, opts ...pulumi.ResourceOption) (*Assignment, error) {
	var resource Assignment
	err := ctx.ReadResource("azure:blueprint/assignment:Assignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Assignment resources.
type assignmentState struct {
	// The name of the blueprint assigned
	BlueprintName *string `pulumi:"blueprintName"`
	// The Description on the Blueprint
	Description *string `pulumi:"description"`
	// The display name of the blueprint
	DisplayName *string `pulumi:"displayName"`
	// An `identity` block as defined below.
	Identity *AssignmentIdentity `pulumi:"identity"`
	// The Azure location of the Assignment. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// a list of up to 200 actions that are permitted to bypass the locks applied by the Blueprint.
	LockExcludeActions []string `pulumi:"lockExcludeActions"`
	// a list of up to 5 Principal IDs that are permitted to bypass the locks applied by the Blueprint.
	LockExcludePrincipals []string `pulumi:"lockExcludePrincipals"`
	// The locking mode of the Blueprint Assignment. One of `None` (Default), `AllResourcesReadOnly`, or `AllResourcesDoNotDelete`. Defaults to `None`.
	LockMode *string `pulumi:"lockMode"`
	// The name of the Blueprint Assignment. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// a JSON string to supply Blueprint Assignment parameter values.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ParameterValues *string `pulumi:"parameterValues"`
	// a JSON string to supply the Blueprint Resource Group information.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ResourceGroups *string `pulumi:"resourceGroups"`
	// The Subscription ID the Blueprint Published Version is to be applied to. Changing this forces a new resource to be created.
	TargetSubscriptionId *string `pulumi:"targetSubscriptionId"`
	Type                 *string `pulumi:"type"`
	// The ID of the Published Version of the blueprint to be assigned.
	VersionId *string `pulumi:"versionId"`
}

type AssignmentState struct {
	// The name of the blueprint assigned
	BlueprintName pulumi.StringPtrInput
	// The Description on the Blueprint
	Description pulumi.StringPtrInput
	// The display name of the blueprint
	DisplayName pulumi.StringPtrInput
	// An `identity` block as defined below.
	Identity AssignmentIdentityPtrInput
	// The Azure location of the Assignment. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// a list of up to 200 actions that are permitted to bypass the locks applied by the Blueprint.
	LockExcludeActions pulumi.StringArrayInput
	// a list of up to 5 Principal IDs that are permitted to bypass the locks applied by the Blueprint.
	LockExcludePrincipals pulumi.StringArrayInput
	// The locking mode of the Blueprint Assignment. One of `None` (Default), `AllResourcesReadOnly`, or `AllResourcesDoNotDelete`. Defaults to `None`.
	LockMode pulumi.StringPtrInput
	// The name of the Blueprint Assignment. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// a JSON string to supply Blueprint Assignment parameter values.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ParameterValues pulumi.StringPtrInput
	// a JSON string to supply the Blueprint Resource Group information.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ResourceGroups pulumi.StringPtrInput
	// The Subscription ID the Blueprint Published Version is to be applied to. Changing this forces a new resource to be created.
	TargetSubscriptionId pulumi.StringPtrInput
	Type                 pulumi.StringPtrInput
	// The ID of the Published Version of the blueprint to be assigned.
	VersionId pulumi.StringPtrInput
}

func (AssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*assignmentState)(nil)).Elem()
}

type assignmentArgs struct {
	// An `identity` block as defined below.
	Identity AssignmentIdentity `pulumi:"identity"`
	// The Azure location of the Assignment. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// a list of up to 200 actions that are permitted to bypass the locks applied by the Blueprint.
	LockExcludeActions []string `pulumi:"lockExcludeActions"`
	// a list of up to 5 Principal IDs that are permitted to bypass the locks applied by the Blueprint.
	LockExcludePrincipals []string `pulumi:"lockExcludePrincipals"`
	// The locking mode of the Blueprint Assignment. One of `None` (Default), `AllResourcesReadOnly`, or `AllResourcesDoNotDelete`. Defaults to `None`.
	LockMode *string `pulumi:"lockMode"`
	// The name of the Blueprint Assignment. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// a JSON string to supply Blueprint Assignment parameter values.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ParameterValues *string `pulumi:"parameterValues"`
	// a JSON string to supply the Blueprint Resource Group information.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ResourceGroups *string `pulumi:"resourceGroups"`
	// The Subscription ID the Blueprint Published Version is to be applied to. Changing this forces a new resource to be created.
	TargetSubscriptionId string `pulumi:"targetSubscriptionId"`
	// The ID of the Published Version of the blueprint to be assigned.
	VersionId string `pulumi:"versionId"`
}

// The set of arguments for constructing a Assignment resource.
type AssignmentArgs struct {
	// An `identity` block as defined below.
	Identity AssignmentIdentityInput
	// The Azure location of the Assignment. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// a list of up to 200 actions that are permitted to bypass the locks applied by the Blueprint.
	LockExcludeActions pulumi.StringArrayInput
	// a list of up to 5 Principal IDs that are permitted to bypass the locks applied by the Blueprint.
	LockExcludePrincipals pulumi.StringArrayInput
	// The locking mode of the Blueprint Assignment. One of `None` (Default), `AllResourcesReadOnly`, or `AllResourcesDoNotDelete`. Defaults to `None`.
	LockMode pulumi.StringPtrInput
	// The name of the Blueprint Assignment. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// a JSON string to supply Blueprint Assignment parameter values.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ParameterValues pulumi.StringPtrInput
	// a JSON string to supply the Blueprint Resource Group information.
	//
	// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
	ResourceGroups pulumi.StringPtrInput
	// The Subscription ID the Blueprint Published Version is to be applied to. Changing this forces a new resource to be created.
	TargetSubscriptionId pulumi.StringInput
	// The ID of the Published Version of the blueprint to be assigned.
	VersionId pulumi.StringInput
}

func (AssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*assignmentArgs)(nil)).Elem()
}

type AssignmentInput interface {
	pulumi.Input

	ToAssignmentOutput() AssignmentOutput
	ToAssignmentOutputWithContext(ctx context.Context) AssignmentOutput
}

func (*Assignment) ElementType() reflect.Type {
	return reflect.TypeOf((**Assignment)(nil)).Elem()
}

func (i *Assignment) ToAssignmentOutput() AssignmentOutput {
	return i.ToAssignmentOutputWithContext(context.Background())
}

func (i *Assignment) ToAssignmentOutputWithContext(ctx context.Context) AssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssignmentOutput)
}

// AssignmentArrayInput is an input type that accepts AssignmentArray and AssignmentArrayOutput values.
// You can construct a concrete instance of `AssignmentArrayInput` via:
//
//	AssignmentArray{ AssignmentArgs{...} }
type AssignmentArrayInput interface {
	pulumi.Input

	ToAssignmentArrayOutput() AssignmentArrayOutput
	ToAssignmentArrayOutputWithContext(context.Context) AssignmentArrayOutput
}

type AssignmentArray []AssignmentInput

func (AssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Assignment)(nil)).Elem()
}

func (i AssignmentArray) ToAssignmentArrayOutput() AssignmentArrayOutput {
	return i.ToAssignmentArrayOutputWithContext(context.Background())
}

func (i AssignmentArray) ToAssignmentArrayOutputWithContext(ctx context.Context) AssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssignmentArrayOutput)
}

// AssignmentMapInput is an input type that accepts AssignmentMap and AssignmentMapOutput values.
// You can construct a concrete instance of `AssignmentMapInput` via:
//
//	AssignmentMap{ "key": AssignmentArgs{...} }
type AssignmentMapInput interface {
	pulumi.Input

	ToAssignmentMapOutput() AssignmentMapOutput
	ToAssignmentMapOutputWithContext(context.Context) AssignmentMapOutput
}

type AssignmentMap map[string]AssignmentInput

func (AssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Assignment)(nil)).Elem()
}

func (i AssignmentMap) ToAssignmentMapOutput() AssignmentMapOutput {
	return i.ToAssignmentMapOutputWithContext(context.Background())
}

func (i AssignmentMap) ToAssignmentMapOutputWithContext(ctx context.Context) AssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssignmentMapOutput)
}

type AssignmentOutput struct{ *pulumi.OutputState }

func (AssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Assignment)(nil)).Elem()
}

func (o AssignmentOutput) ToAssignmentOutput() AssignmentOutput {
	return o
}

func (o AssignmentOutput) ToAssignmentOutputWithContext(ctx context.Context) AssignmentOutput {
	return o
}

// The name of the blueprint assigned
func (o AssignmentOutput) BlueprintName() pulumi.StringOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringOutput { return v.BlueprintName }).(pulumi.StringOutput)
}

// The Description on the Blueprint
func (o AssignmentOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The display name of the blueprint
func (o AssignmentOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// An `identity` block as defined below.
func (o AssignmentOutput) Identity() AssignmentIdentityOutput {
	return o.ApplyT(func(v *Assignment) AssignmentIdentityOutput { return v.Identity }).(AssignmentIdentityOutput)
}

// The Azure location of the Assignment. Changing this forces a new resource to be created.
func (o AssignmentOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// a list of up to 200 actions that are permitted to bypass the locks applied by the Blueprint.
func (o AssignmentOutput) LockExcludeActions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringArrayOutput { return v.LockExcludeActions }).(pulumi.StringArrayOutput)
}

// a list of up to 5 Principal IDs that are permitted to bypass the locks applied by the Blueprint.
func (o AssignmentOutput) LockExcludePrincipals() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringArrayOutput { return v.LockExcludePrincipals }).(pulumi.StringArrayOutput)
}

// The locking mode of the Blueprint Assignment. One of `None` (Default), `AllResourcesReadOnly`, or `AllResourcesDoNotDelete`. Defaults to `None`.
func (o AssignmentOutput) LockMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringPtrOutput { return v.LockMode }).(pulumi.StringPtrOutput)
}

// The name of the Blueprint Assignment. Changing this forces a new resource to be created.
func (o AssignmentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// a JSON string to supply Blueprint Assignment parameter values.
//
// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
func (o AssignmentOutput) ParameterValues() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringPtrOutput { return v.ParameterValues }).(pulumi.StringPtrOutput)
}

// a JSON string to supply the Blueprint Resource Group information.
//
// > **NOTE:** Improperly formatted JSON, or missing values required by a Blueprint will cause the assignment to fail.
func (o AssignmentOutput) ResourceGroups() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringPtrOutput { return v.ResourceGroups }).(pulumi.StringPtrOutput)
}

// The Subscription ID the Blueprint Published Version is to be applied to. Changing this forces a new resource to be created.
func (o AssignmentOutput) TargetSubscriptionId() pulumi.StringOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringOutput { return v.TargetSubscriptionId }).(pulumi.StringOutput)
}

func (o AssignmentOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The ID of the Published Version of the blueprint to be assigned.
func (o AssignmentOutput) VersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *Assignment) pulumi.StringOutput { return v.VersionId }).(pulumi.StringOutput)
}

type AssignmentArrayOutput struct{ *pulumi.OutputState }

func (AssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Assignment)(nil)).Elem()
}

func (o AssignmentArrayOutput) ToAssignmentArrayOutput() AssignmentArrayOutput {
	return o
}

func (o AssignmentArrayOutput) ToAssignmentArrayOutputWithContext(ctx context.Context) AssignmentArrayOutput {
	return o
}

func (o AssignmentArrayOutput) Index(i pulumi.IntInput) AssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Assignment {
		return vs[0].([]*Assignment)[vs[1].(int)]
	}).(AssignmentOutput)
}

type AssignmentMapOutput struct{ *pulumi.OutputState }

func (AssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Assignment)(nil)).Elem()
}

func (o AssignmentMapOutput) ToAssignmentMapOutput() AssignmentMapOutput {
	return o
}

func (o AssignmentMapOutput) ToAssignmentMapOutputWithContext(ctx context.Context) AssignmentMapOutput {
	return o
}

func (o AssignmentMapOutput) MapIndex(k pulumi.StringInput) AssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Assignment {
		return vs[0].(map[string]*Assignment)[vs[1].(string)]
	}).(AssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AssignmentInput)(nil)).Elem(), &Assignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssignmentArrayInput)(nil)).Elem(), AssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssignmentMapInput)(nil)).Elem(), AssignmentMap{})
	pulumi.RegisterOutputType(AssignmentOutput{})
	pulumi.RegisterOutputType(AssignmentArrayOutput{})
	pulumi.RegisterOutputType(AssignmentMapOutput{})
}

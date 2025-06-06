// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package synapse

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Active Directory Administrator setting for a Synapse Workspace
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/keyvault"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/synapse"
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
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("examplestorageacc"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//				AccountKind:            pulumi.String("StorageV2"),
//				IsHnsEnabled:           pulumi.Bool(true),
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
//			current, err := core.GetClientConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			exampleKeyVault, err := keyvault.NewKeyVault(ctx, "example", &keyvault.KeyVaultArgs{
//				Name:                   pulumi.String("example"),
//				Location:               example.Location,
//				ResourceGroupName:      example.Name,
//				TenantId:               pulumi.String(current.TenantId),
//				SkuName:                pulumi.String("standard"),
//				PurgeProtectionEnabled: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			deployer, err := keyvault.NewAccessPolicy(ctx, "deployer", &keyvault.AccessPolicyArgs{
//				KeyVaultId: exampleKeyVault.ID(),
//				TenantId:   pulumi.String(current.TenantId),
//				ObjectId:   pulumi.String(current.ObjectId),
//				KeyPermissions: pulumi.StringArray{
//					pulumi.String("Create"),
//					pulumi.String("Get"),
//					pulumi.String("Delete"),
//					pulumi.String("Purge"),
//					pulumi.String("GetRotationPolicy"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = keyvault.NewKey(ctx, "example", &keyvault.KeyArgs{
//				Name:       pulumi.String("workspace-encryption-key"),
//				KeyVaultId: exampleKeyVault.ID(),
//				KeyType:    pulumi.String("RSA"),
//				KeySize:    pulumi.Int(2048),
//				KeyOpts: pulumi.StringArray{
//					pulumi.String("unwrapKey"),
//					pulumi.String("wrapKey"),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				deployer,
//			}))
//			if err != nil {
//				return err
//			}
//			exampleWorkspace, err := synapse.NewWorkspace(ctx, "example", &synapse.WorkspaceArgs{
//				Name:                            pulumi.String("example"),
//				ResourceGroupName:               example.Name,
//				Location:                        example.Location,
//				StorageDataLakeGen2FilesystemId: exampleDataLakeGen2Filesystem.ID(),
//				SqlAdministratorLogin:           pulumi.String("sqladminuser"),
//				SqlAdministratorLoginPassword:   pulumi.String("H@Sh1CoR3!"),
//				Identity: &synapse.WorkspaceIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//				Tags: pulumi.StringMap{
//					"Env": pulumi.String("production"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = synapse.NewWorkspaceAadAdmin(ctx, "example", &synapse.WorkspaceAadAdminArgs{
//				SynapseWorkspaceId: exampleWorkspace.ID(),
//				Login:              pulumi.String("AzureAD Admin"),
//				ObjectId:           pulumi.String(current.ObjectId),
//				TenantId:           pulumi.String(current.TenantId),
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
// Synapse Workspace Azure AD Administrator can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:synapse/workspaceAadAdmin:WorkspaceAadAdmin example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Synapse/workspaces/workspace1/administrators/activeDirectory
// ```
type WorkspaceAadAdmin struct {
	pulumi.CustomResourceState

	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login pulumi.StringOutput `pulumi:"login"`
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId pulumi.StringOutput `pulumi:"objectId"`
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId pulumi.StringOutput `pulumi:"synapseWorkspaceId"`
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
}

// NewWorkspaceAadAdmin registers a new resource with the given unique name, arguments, and options.
func NewWorkspaceAadAdmin(ctx *pulumi.Context,
	name string, args *WorkspaceAadAdminArgs, opts ...pulumi.ResourceOption) (*WorkspaceAadAdmin, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Login == nil {
		return nil, errors.New("invalid value for required argument 'Login'")
	}
	if args.ObjectId == nil {
		return nil, errors.New("invalid value for required argument 'ObjectId'")
	}
	if args.SynapseWorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'SynapseWorkspaceId'")
	}
	if args.TenantId == nil {
		return nil, errors.New("invalid value for required argument 'TenantId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkspaceAadAdmin
	err := ctx.RegisterResource("azure:synapse/workspaceAadAdmin:WorkspaceAadAdmin", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkspaceAadAdmin gets an existing WorkspaceAadAdmin resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkspaceAadAdmin(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkspaceAadAdminState, opts ...pulumi.ResourceOption) (*WorkspaceAadAdmin, error) {
	var resource WorkspaceAadAdmin
	err := ctx.ReadResource("azure:synapse/workspaceAadAdmin:WorkspaceAadAdmin", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkspaceAadAdmin resources.
type workspaceAadAdminState struct {
	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login *string `pulumi:"login"`
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId *string `pulumi:"objectId"`
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId *string `pulumi:"synapseWorkspaceId"`
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId *string `pulumi:"tenantId"`
}

type WorkspaceAadAdminState struct {
	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login pulumi.StringPtrInput
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId pulumi.StringPtrInput
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId pulumi.StringPtrInput
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId pulumi.StringPtrInput
}

func (WorkspaceAadAdminState) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceAadAdminState)(nil)).Elem()
}

type workspaceAadAdminArgs struct {
	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login string `pulumi:"login"`
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId string `pulumi:"objectId"`
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId string `pulumi:"synapseWorkspaceId"`
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId string `pulumi:"tenantId"`
}

// The set of arguments for constructing a WorkspaceAadAdmin resource.
type WorkspaceAadAdminArgs struct {
	// The login name of the Azure AD Administrator of this Synapse Workspace.
	Login pulumi.StringInput
	// The object id of the Azure AD Administrator of this Synapse Workspace.
	ObjectId pulumi.StringInput
	// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
	SynapseWorkspaceId pulumi.StringInput
	// The tenant id of the Azure AD Administrator of this Synapse Workspace.
	TenantId pulumi.StringInput
}

func (WorkspaceAadAdminArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceAadAdminArgs)(nil)).Elem()
}

type WorkspaceAadAdminInput interface {
	pulumi.Input

	ToWorkspaceAadAdminOutput() WorkspaceAadAdminOutput
	ToWorkspaceAadAdminOutputWithContext(ctx context.Context) WorkspaceAadAdminOutput
}

func (*WorkspaceAadAdmin) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceAadAdmin)(nil)).Elem()
}

func (i *WorkspaceAadAdmin) ToWorkspaceAadAdminOutput() WorkspaceAadAdminOutput {
	return i.ToWorkspaceAadAdminOutputWithContext(context.Background())
}

func (i *WorkspaceAadAdmin) ToWorkspaceAadAdminOutputWithContext(ctx context.Context) WorkspaceAadAdminOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceAadAdminOutput)
}

// WorkspaceAadAdminArrayInput is an input type that accepts WorkspaceAadAdminArray and WorkspaceAadAdminArrayOutput values.
// You can construct a concrete instance of `WorkspaceAadAdminArrayInput` via:
//
//	WorkspaceAadAdminArray{ WorkspaceAadAdminArgs{...} }
type WorkspaceAadAdminArrayInput interface {
	pulumi.Input

	ToWorkspaceAadAdminArrayOutput() WorkspaceAadAdminArrayOutput
	ToWorkspaceAadAdminArrayOutputWithContext(context.Context) WorkspaceAadAdminArrayOutput
}

type WorkspaceAadAdminArray []WorkspaceAadAdminInput

func (WorkspaceAadAdminArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceAadAdmin)(nil)).Elem()
}

func (i WorkspaceAadAdminArray) ToWorkspaceAadAdminArrayOutput() WorkspaceAadAdminArrayOutput {
	return i.ToWorkspaceAadAdminArrayOutputWithContext(context.Background())
}

func (i WorkspaceAadAdminArray) ToWorkspaceAadAdminArrayOutputWithContext(ctx context.Context) WorkspaceAadAdminArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceAadAdminArrayOutput)
}

// WorkspaceAadAdminMapInput is an input type that accepts WorkspaceAadAdminMap and WorkspaceAadAdminMapOutput values.
// You can construct a concrete instance of `WorkspaceAadAdminMapInput` via:
//
//	WorkspaceAadAdminMap{ "key": WorkspaceAadAdminArgs{...} }
type WorkspaceAadAdminMapInput interface {
	pulumi.Input

	ToWorkspaceAadAdminMapOutput() WorkspaceAadAdminMapOutput
	ToWorkspaceAadAdminMapOutputWithContext(context.Context) WorkspaceAadAdminMapOutput
}

type WorkspaceAadAdminMap map[string]WorkspaceAadAdminInput

func (WorkspaceAadAdminMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceAadAdmin)(nil)).Elem()
}

func (i WorkspaceAadAdminMap) ToWorkspaceAadAdminMapOutput() WorkspaceAadAdminMapOutput {
	return i.ToWorkspaceAadAdminMapOutputWithContext(context.Background())
}

func (i WorkspaceAadAdminMap) ToWorkspaceAadAdminMapOutputWithContext(ctx context.Context) WorkspaceAadAdminMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceAadAdminMapOutput)
}

type WorkspaceAadAdminOutput struct{ *pulumi.OutputState }

func (WorkspaceAadAdminOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceAadAdmin)(nil)).Elem()
}

func (o WorkspaceAadAdminOutput) ToWorkspaceAadAdminOutput() WorkspaceAadAdminOutput {
	return o
}

func (o WorkspaceAadAdminOutput) ToWorkspaceAadAdminOutputWithContext(ctx context.Context) WorkspaceAadAdminOutput {
	return o
}

// The login name of the Azure AD Administrator of this Synapse Workspace.
func (o WorkspaceAadAdminOutput) Login() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceAadAdmin) pulumi.StringOutput { return v.Login }).(pulumi.StringOutput)
}

// The object id of the Azure AD Administrator of this Synapse Workspace.
func (o WorkspaceAadAdminOutput) ObjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceAadAdmin) pulumi.StringOutput { return v.ObjectId }).(pulumi.StringOutput)
}

// The ID of the Synapse Workspace where the Azure AD Administrator should be configured.
func (o WorkspaceAadAdminOutput) SynapseWorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceAadAdmin) pulumi.StringOutput { return v.SynapseWorkspaceId }).(pulumi.StringOutput)
}

// The tenant id of the Azure AD Administrator of this Synapse Workspace.
func (o WorkspaceAadAdminOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceAadAdmin) pulumi.StringOutput { return v.TenantId }).(pulumi.StringOutput)
}

type WorkspaceAadAdminArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceAadAdminArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceAadAdmin)(nil)).Elem()
}

func (o WorkspaceAadAdminArrayOutput) ToWorkspaceAadAdminArrayOutput() WorkspaceAadAdminArrayOutput {
	return o
}

func (o WorkspaceAadAdminArrayOutput) ToWorkspaceAadAdminArrayOutputWithContext(ctx context.Context) WorkspaceAadAdminArrayOutput {
	return o
}

func (o WorkspaceAadAdminArrayOutput) Index(i pulumi.IntInput) WorkspaceAadAdminOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkspaceAadAdmin {
		return vs[0].([]*WorkspaceAadAdmin)[vs[1].(int)]
	}).(WorkspaceAadAdminOutput)
}

type WorkspaceAadAdminMapOutput struct{ *pulumi.OutputState }

func (WorkspaceAadAdminMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceAadAdmin)(nil)).Elem()
}

func (o WorkspaceAadAdminMapOutput) ToWorkspaceAadAdminMapOutput() WorkspaceAadAdminMapOutput {
	return o
}

func (o WorkspaceAadAdminMapOutput) ToWorkspaceAadAdminMapOutputWithContext(ctx context.Context) WorkspaceAadAdminMapOutput {
	return o
}

func (o WorkspaceAadAdminMapOutput) MapIndex(k pulumi.StringInput) WorkspaceAadAdminOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkspaceAadAdmin {
		return vs[0].(map[string]*WorkspaceAadAdmin)[vs[1].(string)]
	}).(WorkspaceAadAdminOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceAadAdminInput)(nil)).Elem(), &WorkspaceAadAdmin{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceAadAdminArrayInput)(nil)).Elem(), WorkspaceAadAdminArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceAadAdminMapInput)(nil)).Elem(), WorkspaceAadAdminMap{})
	pulumi.RegisterOutputType(WorkspaceAadAdminOutput{})
	pulumi.RegisterOutputType(WorkspaceAadAdminArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceAadAdminMapOutput{})
}

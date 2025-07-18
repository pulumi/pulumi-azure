// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Customer Managed Key for the Databricks Workspaces Root Databricks File System(DBFS)
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/databricks"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/keyvault"
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
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleWorkspace, err := databricks.NewWorkspace(ctx, "example", &databricks.WorkspaceArgs{
//				Name:                      pulumi.String("databricks-test"),
//				ResourceGroupName:         example.Name,
//				Location:                  example.Location,
//				Sku:                       pulumi.String("premium"),
//				CustomerManagedKeyEnabled: pulumi.Bool(true),
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("Production"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleKeyVault, err := keyvault.NewKeyVault(ctx, "example", &keyvault.KeyVaultArgs{
//				Name:                    pulumi.String("examplekeyvault"),
//				Location:                example.Location,
//				ResourceGroupName:       example.Name,
//				TenantId:                pulumi.String(current.TenantId),
//				SkuName:                 pulumi.String("premium"),
//				PurgeProtectionEnabled:  pulumi.Bool(true),
//				SoftDeleteRetentionDays: pulumi.Int(7),
//			})
//			if err != nil {
//				return err
//			}
//			terraform, err := keyvault.NewAccessPolicy(ctx, "terraform", &keyvault.AccessPolicyArgs{
//				KeyVaultId: exampleKeyVault.ID(),
//				TenantId:   exampleKeyVault.TenantId,
//				ObjectId:   pulumi.String(current.ObjectId),
//				KeyPermissions: pulumi.StringArray{
//					pulumi.String("Create"),
//					pulumi.String("Delete"),
//					pulumi.String("Get"),
//					pulumi.String("Purge"),
//					pulumi.String("Recover"),
//					pulumi.String("Update"),
//					pulumi.String("List"),
//					pulumi.String("Decrypt"),
//					pulumi.String("Sign"),
//					pulumi.String("GetRotationPolicy"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleKey, err := keyvault.NewKey(ctx, "example", &keyvault.KeyArgs{
//				Name:       pulumi.String("example-certificate"),
//				KeyVaultId: exampleKeyVault.ID(),
//				KeyType:    pulumi.String("RSA"),
//				KeySize:    pulumi.Int(2048),
//				KeyOpts: pulumi.StringArray{
//					pulumi.String("decrypt"),
//					pulumi.String("encrypt"),
//					pulumi.String("sign"),
//					pulumi.String("unwrapKey"),
//					pulumi.String("verify"),
//					pulumi.String("wrapKey"),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				terraform,
//			}))
//			if err != nil {
//				return err
//			}
//			databricks, err := keyvault.NewAccessPolicy(ctx, "databricks", &keyvault.AccessPolicyArgs{
//				KeyVaultId: exampleKeyVault.ID(),
//				TenantId: pulumi.String(exampleWorkspace.StorageAccountIdentities.ApplyT(func(storageAccountIdentities []databricks.WorkspaceStorageAccountIdentity) (*string, error) {
//					return &storageAccountIdentities[0].TenantId, nil
//				}).(pulumi.StringPtrOutput)),
//				ObjectId: pulumi.String(exampleWorkspace.StorageAccountIdentities.ApplyT(func(storageAccountIdentities []databricks.WorkspaceStorageAccountIdentity) (*string, error) {
//					return &storageAccountIdentities[0].PrincipalId, nil
//				}).(pulumi.StringPtrOutput)),
//				KeyPermissions: pulumi.StringArray{
//					pulumi.String("Create"),
//					pulumi.String("Delete"),
//					pulumi.String("Get"),
//					pulumi.String("Purge"),
//					pulumi.String("Recover"),
//					pulumi.String("Update"),
//					pulumi.String("List"),
//					pulumi.String("Decrypt"),
//					pulumi.String("Sign"),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleWorkspace,
//			}))
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewWorkspaceRootDbfsCustomerManagedKey(ctx, "example", &databricks.WorkspaceRootDbfsCustomerManagedKeyArgs{
//				WorkspaceId:   exampleWorkspace.ID(),
//				KeyVaultKeyId: exampleKey.ID(),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				databricks,
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
// ## Example HCL Configurations
//
// * Databricks Workspace with Root Databricks File System Customer Managed Keys
// * Databricks Workspace with Root Databricks File System Customer Managed Keys in a Different Subscription
// * Databricks Workspace with Private Endpoint, Customer Managed Keys for Managed Services and Root Databricks File System Customer Managed Keys
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Databricks`: 2024-05-01
//
// ## Import
//
// Databricks Workspace Root DBFS Customer Managed Key can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:databricks/workspaceRootDbfsCustomerManagedKey:WorkspaceRootDbfsCustomerManagedKey workspace1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Databricks/workspaces/workspace1
// ```
type WorkspaceRootDbfsCustomerManagedKey struct {
	pulumi.CustomResourceState

	KeyVaultId pulumi.StringPtrOutput `pulumi:"keyVaultId"`
	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId pulumi.StringOutput `pulumi:"keyVaultKeyId"`
	// The resource ID of the Databricks Workspace.
	WorkspaceId pulumi.StringOutput `pulumi:"workspaceId"`
}

// NewWorkspaceRootDbfsCustomerManagedKey registers a new resource with the given unique name, arguments, and options.
func NewWorkspaceRootDbfsCustomerManagedKey(ctx *pulumi.Context,
	name string, args *WorkspaceRootDbfsCustomerManagedKeyArgs, opts ...pulumi.ResourceOption) (*WorkspaceRootDbfsCustomerManagedKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KeyVaultKeyId == nil {
		return nil, errors.New("invalid value for required argument 'KeyVaultKeyId'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("azure:databricks/workspaceCustomerManagedKey:WorkspaceCustomerManagedKey"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkspaceRootDbfsCustomerManagedKey
	err := ctx.RegisterResource("azure:databricks/workspaceRootDbfsCustomerManagedKey:WorkspaceRootDbfsCustomerManagedKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkspaceRootDbfsCustomerManagedKey gets an existing WorkspaceRootDbfsCustomerManagedKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkspaceRootDbfsCustomerManagedKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkspaceRootDbfsCustomerManagedKeyState, opts ...pulumi.ResourceOption) (*WorkspaceRootDbfsCustomerManagedKey, error) {
	var resource WorkspaceRootDbfsCustomerManagedKey
	err := ctx.ReadResource("azure:databricks/workspaceRootDbfsCustomerManagedKey:WorkspaceRootDbfsCustomerManagedKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkspaceRootDbfsCustomerManagedKey resources.
type workspaceRootDbfsCustomerManagedKeyState struct {
	KeyVaultId *string `pulumi:"keyVaultId"`
	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId *string `pulumi:"keyVaultKeyId"`
	// The resource ID of the Databricks Workspace.
	WorkspaceId *string `pulumi:"workspaceId"`
}

type WorkspaceRootDbfsCustomerManagedKeyState struct {
	KeyVaultId pulumi.StringPtrInput
	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId pulumi.StringPtrInput
	// The resource ID of the Databricks Workspace.
	WorkspaceId pulumi.StringPtrInput
}

func (WorkspaceRootDbfsCustomerManagedKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceRootDbfsCustomerManagedKeyState)(nil)).Elem()
}

type workspaceRootDbfsCustomerManagedKeyArgs struct {
	KeyVaultId *string `pulumi:"keyVaultId"`
	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId string `pulumi:"keyVaultKeyId"`
	// The resource ID of the Databricks Workspace.
	WorkspaceId string `pulumi:"workspaceId"`
}

// The set of arguments for constructing a WorkspaceRootDbfsCustomerManagedKey resource.
type WorkspaceRootDbfsCustomerManagedKeyArgs struct {
	KeyVaultId pulumi.StringPtrInput
	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId pulumi.StringInput
	// The resource ID of the Databricks Workspace.
	WorkspaceId pulumi.StringInput
}

func (WorkspaceRootDbfsCustomerManagedKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceRootDbfsCustomerManagedKeyArgs)(nil)).Elem()
}

type WorkspaceRootDbfsCustomerManagedKeyInput interface {
	pulumi.Input

	ToWorkspaceRootDbfsCustomerManagedKeyOutput() WorkspaceRootDbfsCustomerManagedKeyOutput
	ToWorkspaceRootDbfsCustomerManagedKeyOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyOutput
}

func (*WorkspaceRootDbfsCustomerManagedKey) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (i *WorkspaceRootDbfsCustomerManagedKey) ToWorkspaceRootDbfsCustomerManagedKeyOutput() WorkspaceRootDbfsCustomerManagedKeyOutput {
	return i.ToWorkspaceRootDbfsCustomerManagedKeyOutputWithContext(context.Background())
}

func (i *WorkspaceRootDbfsCustomerManagedKey) ToWorkspaceRootDbfsCustomerManagedKeyOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceRootDbfsCustomerManagedKeyOutput)
}

// WorkspaceRootDbfsCustomerManagedKeyArrayInput is an input type that accepts WorkspaceRootDbfsCustomerManagedKeyArray and WorkspaceRootDbfsCustomerManagedKeyArrayOutput values.
// You can construct a concrete instance of `WorkspaceRootDbfsCustomerManagedKeyArrayInput` via:
//
//	WorkspaceRootDbfsCustomerManagedKeyArray{ WorkspaceRootDbfsCustomerManagedKeyArgs{...} }
type WorkspaceRootDbfsCustomerManagedKeyArrayInput interface {
	pulumi.Input

	ToWorkspaceRootDbfsCustomerManagedKeyArrayOutput() WorkspaceRootDbfsCustomerManagedKeyArrayOutput
	ToWorkspaceRootDbfsCustomerManagedKeyArrayOutputWithContext(context.Context) WorkspaceRootDbfsCustomerManagedKeyArrayOutput
}

type WorkspaceRootDbfsCustomerManagedKeyArray []WorkspaceRootDbfsCustomerManagedKeyInput

func (WorkspaceRootDbfsCustomerManagedKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (i WorkspaceRootDbfsCustomerManagedKeyArray) ToWorkspaceRootDbfsCustomerManagedKeyArrayOutput() WorkspaceRootDbfsCustomerManagedKeyArrayOutput {
	return i.ToWorkspaceRootDbfsCustomerManagedKeyArrayOutputWithContext(context.Background())
}

func (i WorkspaceRootDbfsCustomerManagedKeyArray) ToWorkspaceRootDbfsCustomerManagedKeyArrayOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceRootDbfsCustomerManagedKeyArrayOutput)
}

// WorkspaceRootDbfsCustomerManagedKeyMapInput is an input type that accepts WorkspaceRootDbfsCustomerManagedKeyMap and WorkspaceRootDbfsCustomerManagedKeyMapOutput values.
// You can construct a concrete instance of `WorkspaceRootDbfsCustomerManagedKeyMapInput` via:
//
//	WorkspaceRootDbfsCustomerManagedKeyMap{ "key": WorkspaceRootDbfsCustomerManagedKeyArgs{...} }
type WorkspaceRootDbfsCustomerManagedKeyMapInput interface {
	pulumi.Input

	ToWorkspaceRootDbfsCustomerManagedKeyMapOutput() WorkspaceRootDbfsCustomerManagedKeyMapOutput
	ToWorkspaceRootDbfsCustomerManagedKeyMapOutputWithContext(context.Context) WorkspaceRootDbfsCustomerManagedKeyMapOutput
}

type WorkspaceRootDbfsCustomerManagedKeyMap map[string]WorkspaceRootDbfsCustomerManagedKeyInput

func (WorkspaceRootDbfsCustomerManagedKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (i WorkspaceRootDbfsCustomerManagedKeyMap) ToWorkspaceRootDbfsCustomerManagedKeyMapOutput() WorkspaceRootDbfsCustomerManagedKeyMapOutput {
	return i.ToWorkspaceRootDbfsCustomerManagedKeyMapOutputWithContext(context.Background())
}

func (i WorkspaceRootDbfsCustomerManagedKeyMap) ToWorkspaceRootDbfsCustomerManagedKeyMapOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceRootDbfsCustomerManagedKeyMapOutput)
}

type WorkspaceRootDbfsCustomerManagedKeyOutput struct{ *pulumi.OutputState }

func (WorkspaceRootDbfsCustomerManagedKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (o WorkspaceRootDbfsCustomerManagedKeyOutput) ToWorkspaceRootDbfsCustomerManagedKeyOutput() WorkspaceRootDbfsCustomerManagedKeyOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyOutput) ToWorkspaceRootDbfsCustomerManagedKeyOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyOutput) KeyVaultId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkspaceRootDbfsCustomerManagedKey) pulumi.StringPtrOutput { return v.KeyVaultId }).(pulumi.StringPtrOutput)
}

// The resource ID of the Key Vault Key to be used.
func (o WorkspaceRootDbfsCustomerManagedKeyOutput) KeyVaultKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceRootDbfsCustomerManagedKey) pulumi.StringOutput { return v.KeyVaultKeyId }).(pulumi.StringOutput)
}

// The resource ID of the Databricks Workspace.
func (o WorkspaceRootDbfsCustomerManagedKeyOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceRootDbfsCustomerManagedKey) pulumi.StringOutput { return v.WorkspaceId }).(pulumi.StringOutput)
}

type WorkspaceRootDbfsCustomerManagedKeyArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceRootDbfsCustomerManagedKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (o WorkspaceRootDbfsCustomerManagedKeyArrayOutput) ToWorkspaceRootDbfsCustomerManagedKeyArrayOutput() WorkspaceRootDbfsCustomerManagedKeyArrayOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyArrayOutput) ToWorkspaceRootDbfsCustomerManagedKeyArrayOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyArrayOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyArrayOutput) Index(i pulumi.IntInput) WorkspaceRootDbfsCustomerManagedKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkspaceRootDbfsCustomerManagedKey {
		return vs[0].([]*WorkspaceRootDbfsCustomerManagedKey)[vs[1].(int)]
	}).(WorkspaceRootDbfsCustomerManagedKeyOutput)
}

type WorkspaceRootDbfsCustomerManagedKeyMapOutput struct{ *pulumi.OutputState }

func (WorkspaceRootDbfsCustomerManagedKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (o WorkspaceRootDbfsCustomerManagedKeyMapOutput) ToWorkspaceRootDbfsCustomerManagedKeyMapOutput() WorkspaceRootDbfsCustomerManagedKeyMapOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyMapOutput) ToWorkspaceRootDbfsCustomerManagedKeyMapOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyMapOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyMapOutput) MapIndex(k pulumi.StringInput) WorkspaceRootDbfsCustomerManagedKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkspaceRootDbfsCustomerManagedKey {
		return vs[0].(map[string]*WorkspaceRootDbfsCustomerManagedKey)[vs[1].(string)]
	}).(WorkspaceRootDbfsCustomerManagedKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceRootDbfsCustomerManagedKeyInput)(nil)).Elem(), &WorkspaceRootDbfsCustomerManagedKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceRootDbfsCustomerManagedKeyArrayInput)(nil)).Elem(), WorkspaceRootDbfsCustomerManagedKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceRootDbfsCustomerManagedKeyMapInput)(nil)).Elem(), WorkspaceRootDbfsCustomerManagedKeyMap{})
	pulumi.RegisterOutputType(WorkspaceRootDbfsCustomerManagedKeyOutput{})
	pulumi.RegisterOutputType(WorkspaceRootDbfsCustomerManagedKeyArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceRootDbfsCustomerManagedKeyMapOutput{})
}

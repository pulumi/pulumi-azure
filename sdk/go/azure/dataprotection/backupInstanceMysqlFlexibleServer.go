// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dataprotection

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Backup Instance to back up MySQL Flexible Server.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/authorization"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/dataprotection"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/mysql"
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
//			exampleFlexibleServer, err := mysql.NewFlexibleServer(ctx, "example", &mysql.FlexibleServerArgs{
//				Name:                  pulumi.String("example-mysqlfs"),
//				ResourceGroupName:     example.Name,
//				Location:              example.Location,
//				AdministratorLogin:    pulumi.String("adminTerraform"),
//				AdministratorPassword: pulumi.String("QAZwsx123"),
//				Version:               pulumi.String("8.0.21"),
//				SkuName:               pulumi.String("B_Standard_B1ms"),
//				Zone:                  pulumi.String("1"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleBackupVault, err := dataprotection.NewBackupVault(ctx, "example", &dataprotection.BackupVaultArgs{
//				Name:              pulumi.String("example-backupvault"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				DatastoreType:     pulumi.String("VaultStore"),
//				Redundancy:        pulumi.String("LocallyRedundant"),
//				SoftDelete:        pulumi.String("Off"),
//				Identity: &dataprotection.BackupVaultIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleAssignment, err := authorization.NewAssignment(ctx, "example", &authorization.AssignmentArgs{
//				Scope:              example.ID(),
//				RoleDefinitionName: pulumi.String("Reader"),
//				PrincipalId: pulumi.String(exampleBackupVault.Identity.ApplyT(func(identity dataprotection.BackupVaultIdentity) (*string, error) {
//					return &identity.PrincipalId, nil
//				}).(pulumi.StringPtrOutput)),
//			})
//			if err != nil {
//				return err
//			}
//			example2, err := authorization.NewAssignment(ctx, "example2", &authorization.AssignmentArgs{
//				Scope:              exampleFlexibleServer.ID(),
//				RoleDefinitionName: pulumi.String("MySQL Backup And Export Operator"),
//				PrincipalId: pulumi.String(exampleBackupVault.Identity.ApplyT(func(identity dataprotection.BackupVaultIdentity) (*string, error) {
//					return &identity.PrincipalId, nil
//				}).(pulumi.StringPtrOutput)),
//			})
//			if err != nil {
//				return err
//			}
//			exampleBackupPolicyMysqlFlexibleServer, err := dataprotection.NewBackupPolicyMysqlFlexibleServer(ctx, "example", &dataprotection.BackupPolicyMysqlFlexibleServerArgs{
//				Name:    pulumi.String("example-dp"),
//				VaultId: exampleBackupVault.ID(),
//				BackupRepeatingTimeIntervals: pulumi.StringArray{
//					pulumi.String("R/2021-05-23T02:30:00+00:00/P1W"),
//				},
//				DefaultRetentionRule: &dataprotection.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs{
//					LifeCycles: dataprotection.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleLifeCycleArray{
//						&dataprotection.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleLifeCycleArgs{
//							Duration:      pulumi.String("P4M"),
//							DataStoreType: pulumi.String("VaultStore"),
//						},
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleAssignment,
//				example2,
//			}))
//			if err != nil {
//				return err
//			}
//			_, err = dataprotection.NewBackupInstanceMysqlFlexibleServer(ctx, "example", &dataprotection.BackupInstanceMysqlFlexibleServerArgs{
//				Name:           pulumi.String("example-dbi"),
//				Location:       example.Location,
//				VaultId:        exampleBackupVault.ID(),
//				ServerId:       exampleFlexibleServer.ID(),
//				BackupPolicyId: exampleBackupPolicyMysqlFlexibleServer.ID(),
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
// * `Microsoft.DataProtection`: 2024-04-01
//
// ## Import
//
// Backup Instance MySQL Flexible Servers can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:dataprotection/backupInstanceMysqlFlexibleServer:BackupInstanceMysqlFlexibleServer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1/backupInstances/backupInstance1
// ```
type BackupInstanceMysqlFlexibleServer struct {
	pulumi.CustomResourceState

	// The ID of the Backup Policy.
	BackupPolicyId pulumi.StringOutput `pulumi:"backupPolicyId"`
	// The location of the source database. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the source server. Changing this forces a new resource to be created.
	ServerId pulumi.StringOutput `pulumi:"serverId"`
	// The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
	VaultId pulumi.StringOutput `pulumi:"vaultId"`
}

// NewBackupInstanceMysqlFlexibleServer registers a new resource with the given unique name, arguments, and options.
func NewBackupInstanceMysqlFlexibleServer(ctx *pulumi.Context,
	name string, args *BackupInstanceMysqlFlexibleServerArgs, opts ...pulumi.ResourceOption) (*BackupInstanceMysqlFlexibleServer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BackupPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'BackupPolicyId'")
	}
	if args.ServerId == nil {
		return nil, errors.New("invalid value for required argument 'ServerId'")
	}
	if args.VaultId == nil {
		return nil, errors.New("invalid value for required argument 'VaultId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BackupInstanceMysqlFlexibleServer
	err := ctx.RegisterResource("azure:dataprotection/backupInstanceMysqlFlexibleServer:BackupInstanceMysqlFlexibleServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBackupInstanceMysqlFlexibleServer gets an existing BackupInstanceMysqlFlexibleServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBackupInstanceMysqlFlexibleServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BackupInstanceMysqlFlexibleServerState, opts ...pulumi.ResourceOption) (*BackupInstanceMysqlFlexibleServer, error) {
	var resource BackupInstanceMysqlFlexibleServer
	err := ctx.ReadResource("azure:dataprotection/backupInstanceMysqlFlexibleServer:BackupInstanceMysqlFlexibleServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BackupInstanceMysqlFlexibleServer resources.
type backupInstanceMysqlFlexibleServerState struct {
	// The ID of the Backup Policy.
	BackupPolicyId *string `pulumi:"backupPolicyId"`
	// The location of the source database. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the source server. Changing this forces a new resource to be created.
	ServerId *string `pulumi:"serverId"`
	// The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
	VaultId *string `pulumi:"vaultId"`
}

type BackupInstanceMysqlFlexibleServerState struct {
	// The ID of the Backup Policy.
	BackupPolicyId pulumi.StringPtrInput
	// The location of the source database. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the source server. Changing this forces a new resource to be created.
	ServerId pulumi.StringPtrInput
	// The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
	VaultId pulumi.StringPtrInput
}

func (BackupInstanceMysqlFlexibleServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*backupInstanceMysqlFlexibleServerState)(nil)).Elem()
}

type backupInstanceMysqlFlexibleServerArgs struct {
	// The ID of the Backup Policy.
	BackupPolicyId string `pulumi:"backupPolicyId"`
	// The location of the source database. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the source server. Changing this forces a new resource to be created.
	ServerId string `pulumi:"serverId"`
	// The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
	VaultId string `pulumi:"vaultId"`
}

// The set of arguments for constructing a BackupInstanceMysqlFlexibleServer resource.
type BackupInstanceMysqlFlexibleServerArgs struct {
	// The ID of the Backup Policy.
	BackupPolicyId pulumi.StringInput
	// The location of the source database. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the source server. Changing this forces a new resource to be created.
	ServerId pulumi.StringInput
	// The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
	VaultId pulumi.StringInput
}

func (BackupInstanceMysqlFlexibleServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*backupInstanceMysqlFlexibleServerArgs)(nil)).Elem()
}

type BackupInstanceMysqlFlexibleServerInput interface {
	pulumi.Input

	ToBackupInstanceMysqlFlexibleServerOutput() BackupInstanceMysqlFlexibleServerOutput
	ToBackupInstanceMysqlFlexibleServerOutputWithContext(ctx context.Context) BackupInstanceMysqlFlexibleServerOutput
}

func (*BackupInstanceMysqlFlexibleServer) ElementType() reflect.Type {
	return reflect.TypeOf((**BackupInstanceMysqlFlexibleServer)(nil)).Elem()
}

func (i *BackupInstanceMysqlFlexibleServer) ToBackupInstanceMysqlFlexibleServerOutput() BackupInstanceMysqlFlexibleServerOutput {
	return i.ToBackupInstanceMysqlFlexibleServerOutputWithContext(context.Background())
}

func (i *BackupInstanceMysqlFlexibleServer) ToBackupInstanceMysqlFlexibleServerOutputWithContext(ctx context.Context) BackupInstanceMysqlFlexibleServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupInstanceMysqlFlexibleServerOutput)
}

// BackupInstanceMysqlFlexibleServerArrayInput is an input type that accepts BackupInstanceMysqlFlexibleServerArray and BackupInstanceMysqlFlexibleServerArrayOutput values.
// You can construct a concrete instance of `BackupInstanceMysqlFlexibleServerArrayInput` via:
//
//	BackupInstanceMysqlFlexibleServerArray{ BackupInstanceMysqlFlexibleServerArgs{...} }
type BackupInstanceMysqlFlexibleServerArrayInput interface {
	pulumi.Input

	ToBackupInstanceMysqlFlexibleServerArrayOutput() BackupInstanceMysqlFlexibleServerArrayOutput
	ToBackupInstanceMysqlFlexibleServerArrayOutputWithContext(context.Context) BackupInstanceMysqlFlexibleServerArrayOutput
}

type BackupInstanceMysqlFlexibleServerArray []BackupInstanceMysqlFlexibleServerInput

func (BackupInstanceMysqlFlexibleServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BackupInstanceMysqlFlexibleServer)(nil)).Elem()
}

func (i BackupInstanceMysqlFlexibleServerArray) ToBackupInstanceMysqlFlexibleServerArrayOutput() BackupInstanceMysqlFlexibleServerArrayOutput {
	return i.ToBackupInstanceMysqlFlexibleServerArrayOutputWithContext(context.Background())
}

func (i BackupInstanceMysqlFlexibleServerArray) ToBackupInstanceMysqlFlexibleServerArrayOutputWithContext(ctx context.Context) BackupInstanceMysqlFlexibleServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupInstanceMysqlFlexibleServerArrayOutput)
}

// BackupInstanceMysqlFlexibleServerMapInput is an input type that accepts BackupInstanceMysqlFlexibleServerMap and BackupInstanceMysqlFlexibleServerMapOutput values.
// You can construct a concrete instance of `BackupInstanceMysqlFlexibleServerMapInput` via:
//
//	BackupInstanceMysqlFlexibleServerMap{ "key": BackupInstanceMysqlFlexibleServerArgs{...} }
type BackupInstanceMysqlFlexibleServerMapInput interface {
	pulumi.Input

	ToBackupInstanceMysqlFlexibleServerMapOutput() BackupInstanceMysqlFlexibleServerMapOutput
	ToBackupInstanceMysqlFlexibleServerMapOutputWithContext(context.Context) BackupInstanceMysqlFlexibleServerMapOutput
}

type BackupInstanceMysqlFlexibleServerMap map[string]BackupInstanceMysqlFlexibleServerInput

func (BackupInstanceMysqlFlexibleServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BackupInstanceMysqlFlexibleServer)(nil)).Elem()
}

func (i BackupInstanceMysqlFlexibleServerMap) ToBackupInstanceMysqlFlexibleServerMapOutput() BackupInstanceMysqlFlexibleServerMapOutput {
	return i.ToBackupInstanceMysqlFlexibleServerMapOutputWithContext(context.Background())
}

func (i BackupInstanceMysqlFlexibleServerMap) ToBackupInstanceMysqlFlexibleServerMapOutputWithContext(ctx context.Context) BackupInstanceMysqlFlexibleServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupInstanceMysqlFlexibleServerMapOutput)
}

type BackupInstanceMysqlFlexibleServerOutput struct{ *pulumi.OutputState }

func (BackupInstanceMysqlFlexibleServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BackupInstanceMysqlFlexibleServer)(nil)).Elem()
}

func (o BackupInstanceMysqlFlexibleServerOutput) ToBackupInstanceMysqlFlexibleServerOutput() BackupInstanceMysqlFlexibleServerOutput {
	return o
}

func (o BackupInstanceMysqlFlexibleServerOutput) ToBackupInstanceMysqlFlexibleServerOutputWithContext(ctx context.Context) BackupInstanceMysqlFlexibleServerOutput {
	return o
}

// The ID of the Backup Policy.
func (o BackupInstanceMysqlFlexibleServerOutput) BackupPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *BackupInstanceMysqlFlexibleServer) pulumi.StringOutput { return v.BackupPolicyId }).(pulumi.StringOutput)
}

// The location of the source database. Changing this forces a new resource to be created.
func (o BackupInstanceMysqlFlexibleServerOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *BackupInstanceMysqlFlexibleServer) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
func (o BackupInstanceMysqlFlexibleServerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BackupInstanceMysqlFlexibleServer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the source server. Changing this forces a new resource to be created.
func (o BackupInstanceMysqlFlexibleServerOutput) ServerId() pulumi.StringOutput {
	return o.ApplyT(func(v *BackupInstanceMysqlFlexibleServer) pulumi.StringOutput { return v.ServerId }).(pulumi.StringOutput)
}

// The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
func (o BackupInstanceMysqlFlexibleServerOutput) VaultId() pulumi.StringOutput {
	return o.ApplyT(func(v *BackupInstanceMysqlFlexibleServer) pulumi.StringOutput { return v.VaultId }).(pulumi.StringOutput)
}

type BackupInstanceMysqlFlexibleServerArrayOutput struct{ *pulumi.OutputState }

func (BackupInstanceMysqlFlexibleServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BackupInstanceMysqlFlexibleServer)(nil)).Elem()
}

func (o BackupInstanceMysqlFlexibleServerArrayOutput) ToBackupInstanceMysqlFlexibleServerArrayOutput() BackupInstanceMysqlFlexibleServerArrayOutput {
	return o
}

func (o BackupInstanceMysqlFlexibleServerArrayOutput) ToBackupInstanceMysqlFlexibleServerArrayOutputWithContext(ctx context.Context) BackupInstanceMysqlFlexibleServerArrayOutput {
	return o
}

func (o BackupInstanceMysqlFlexibleServerArrayOutput) Index(i pulumi.IntInput) BackupInstanceMysqlFlexibleServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BackupInstanceMysqlFlexibleServer {
		return vs[0].([]*BackupInstanceMysqlFlexibleServer)[vs[1].(int)]
	}).(BackupInstanceMysqlFlexibleServerOutput)
}

type BackupInstanceMysqlFlexibleServerMapOutput struct{ *pulumi.OutputState }

func (BackupInstanceMysqlFlexibleServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BackupInstanceMysqlFlexibleServer)(nil)).Elem()
}

func (o BackupInstanceMysqlFlexibleServerMapOutput) ToBackupInstanceMysqlFlexibleServerMapOutput() BackupInstanceMysqlFlexibleServerMapOutput {
	return o
}

func (o BackupInstanceMysqlFlexibleServerMapOutput) ToBackupInstanceMysqlFlexibleServerMapOutputWithContext(ctx context.Context) BackupInstanceMysqlFlexibleServerMapOutput {
	return o
}

func (o BackupInstanceMysqlFlexibleServerMapOutput) MapIndex(k pulumi.StringInput) BackupInstanceMysqlFlexibleServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BackupInstanceMysqlFlexibleServer {
		return vs[0].(map[string]*BackupInstanceMysqlFlexibleServer)[vs[1].(string)]
	}).(BackupInstanceMysqlFlexibleServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BackupInstanceMysqlFlexibleServerInput)(nil)).Elem(), &BackupInstanceMysqlFlexibleServer{})
	pulumi.RegisterInputType(reflect.TypeOf((*BackupInstanceMysqlFlexibleServerArrayInput)(nil)).Elem(), BackupInstanceMysqlFlexibleServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BackupInstanceMysqlFlexibleServerMapInput)(nil)).Elem(), BackupInstanceMysqlFlexibleServerMap{})
	pulumi.RegisterOutputType(BackupInstanceMysqlFlexibleServerOutput{})
	pulumi.RegisterOutputType(BackupInstanceMysqlFlexibleServerArrayOutput{})
	pulumi.RegisterOutputType(BackupInstanceMysqlFlexibleServerMapOutput{})
}

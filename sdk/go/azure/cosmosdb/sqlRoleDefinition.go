// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cosmosdb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Cosmos DB SQL Role Definition.
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
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cosmosdb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := core.GetClientConfig(ctx, map[string]interface{}{}, nil)
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
//			exampleAccount, err := cosmosdb.NewAccount(ctx, "example", &cosmosdb.AccountArgs{
//				Name:              pulumi.String("example-cosmosdb"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				OfferType:         pulumi.String("Standard"),
//				Kind:              pulumi.String("GlobalDocumentDB"),
//				ConsistencyPolicy: &cosmosdb.AccountConsistencyPolicyArgs{
//					ConsistencyLevel: pulumi.String("Strong"),
//				},
//				GeoLocations: cosmosdb.AccountGeoLocationArray{
//					&cosmosdb.AccountGeoLocationArgs{
//						Location:         example.Location,
//						FailoverPriority: pulumi.Int(0),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cosmosdb.NewSqlRoleDefinition(ctx, "example", &cosmosdb.SqlRoleDefinitionArgs{
//				RoleDefinitionId:  pulumi.String("84cf3a8b-4122-4448-bce2-fa423cfe0a15"),
//				ResourceGroupName: example.Name,
//				AccountName:       exampleAccount.Name,
//				Name:              pulumi.String("acctestsqlrole"),
//				AssignableScopes: pulumi.StringArray{
//					exampleAccount.ID().ApplyT(func(id string) (string, error) {
//						return fmt.Sprintf("%v/dbs/sales", id), nil
//					}).(pulumi.StringOutput),
//				},
//				Permissions: cosmosdb.SqlRoleDefinitionPermissionArray{
//					&cosmosdb.SqlRoleDefinitionPermissionArgs{
//						DataActions: pulumi.StringArray{
//							pulumi.String("Microsoft.DocumentDB/databaseAccounts/sqlDatabases/containers/items/read"),
//						},
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
// ## Import
//
// Cosmos DB SQL Role Definitions can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cosmosdb/sqlRoleDefinition:SqlRoleDefinition example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DocumentDB/databaseAccounts/account1/sqlRoleDefinitions/28b3c337-f436-482b-a167-c2618dc52033
// ```
type SqlRoleDefinition struct {
	pulumi.CustomResourceState

	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// A list of fully qualified scopes at or below which Role Assignments may be created using this Cosmos DB SQL Role Definition. It will allow application of this Cosmos DB SQL Role Definition on the entire Database Account or any underlying Database/Collection. Scopes higher than Database Account are not enforceable as assignable scopes.
	//
	// > **Note:** The resources referenced in assignable scopes need not exist.
	AssignableScopes pulumi.StringArrayOutput `pulumi:"assignableScopes"`
	// An user-friendly name for the Cosmos DB SQL Role Definition which must be unique for the Database Account.
	Name pulumi.StringOutput `pulumi:"name"`
	// A `permissions` block as defined below.
	Permissions SqlRoleDefinitionPermissionArrayOutput `pulumi:"permissions"`
	// The name of the Resource Group in which the Cosmos DB SQL Role Definition is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The GUID as the name of the Cosmos DB SQL Role Definition - one will be generated if not specified. Changing this forces a new resource to be created.
	RoleDefinitionId pulumi.StringOutput `pulumi:"roleDefinitionId"`
	// The type of the Cosmos DB SQL Role Definition. Possible values are `BuiltInRole` and `CustomRole`. Defaults to `CustomRole`. Changing this forces a new resource to be created.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewSqlRoleDefinition registers a new resource with the given unique name, arguments, and options.
func NewSqlRoleDefinition(ctx *pulumi.Context,
	name string, args *SqlRoleDefinitionArgs, opts ...pulumi.ResourceOption) (*SqlRoleDefinition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountName == nil {
		return nil, errors.New("invalid value for required argument 'AccountName'")
	}
	if args.AssignableScopes == nil {
		return nil, errors.New("invalid value for required argument 'AssignableScopes'")
	}
	if args.Permissions == nil {
		return nil, errors.New("invalid value for required argument 'Permissions'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SqlRoleDefinition
	err := ctx.RegisterResource("azure:cosmosdb/sqlRoleDefinition:SqlRoleDefinition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlRoleDefinition gets an existing SqlRoleDefinition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlRoleDefinition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlRoleDefinitionState, opts ...pulumi.ResourceOption) (*SqlRoleDefinition, error) {
	var resource SqlRoleDefinition
	err := ctx.ReadResource("azure:cosmosdb/sqlRoleDefinition:SqlRoleDefinition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlRoleDefinition resources.
type sqlRoleDefinitionState struct {
	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName *string `pulumi:"accountName"`
	// A list of fully qualified scopes at or below which Role Assignments may be created using this Cosmos DB SQL Role Definition. It will allow application of this Cosmos DB SQL Role Definition on the entire Database Account or any underlying Database/Collection. Scopes higher than Database Account are not enforceable as assignable scopes.
	//
	// > **Note:** The resources referenced in assignable scopes need not exist.
	AssignableScopes []string `pulumi:"assignableScopes"`
	// An user-friendly name for the Cosmos DB SQL Role Definition which must be unique for the Database Account.
	Name *string `pulumi:"name"`
	// A `permissions` block as defined below.
	Permissions []SqlRoleDefinitionPermission `pulumi:"permissions"`
	// The name of the Resource Group in which the Cosmos DB SQL Role Definition is created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The GUID as the name of the Cosmos DB SQL Role Definition - one will be generated if not specified. Changing this forces a new resource to be created.
	RoleDefinitionId *string `pulumi:"roleDefinitionId"`
	// The type of the Cosmos DB SQL Role Definition. Possible values are `BuiltInRole` and `CustomRole`. Defaults to `CustomRole`. Changing this forces a new resource to be created.
	Type *string `pulumi:"type"`
}

type SqlRoleDefinitionState struct {
	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName pulumi.StringPtrInput
	// A list of fully qualified scopes at or below which Role Assignments may be created using this Cosmos DB SQL Role Definition. It will allow application of this Cosmos DB SQL Role Definition on the entire Database Account or any underlying Database/Collection. Scopes higher than Database Account are not enforceable as assignable scopes.
	//
	// > **Note:** The resources referenced in assignable scopes need not exist.
	AssignableScopes pulumi.StringArrayInput
	// An user-friendly name for the Cosmos DB SQL Role Definition which must be unique for the Database Account.
	Name pulumi.StringPtrInput
	// A `permissions` block as defined below.
	Permissions SqlRoleDefinitionPermissionArrayInput
	// The name of the Resource Group in which the Cosmos DB SQL Role Definition is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The GUID as the name of the Cosmos DB SQL Role Definition - one will be generated if not specified. Changing this forces a new resource to be created.
	RoleDefinitionId pulumi.StringPtrInput
	// The type of the Cosmos DB SQL Role Definition. Possible values are `BuiltInRole` and `CustomRole`. Defaults to `CustomRole`. Changing this forces a new resource to be created.
	Type pulumi.StringPtrInput
}

func (SqlRoleDefinitionState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlRoleDefinitionState)(nil)).Elem()
}

type sqlRoleDefinitionArgs struct {
	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName string `pulumi:"accountName"`
	// A list of fully qualified scopes at or below which Role Assignments may be created using this Cosmos DB SQL Role Definition. It will allow application of this Cosmos DB SQL Role Definition on the entire Database Account or any underlying Database/Collection. Scopes higher than Database Account are not enforceable as assignable scopes.
	//
	// > **Note:** The resources referenced in assignable scopes need not exist.
	AssignableScopes []string `pulumi:"assignableScopes"`
	// An user-friendly name for the Cosmos DB SQL Role Definition which must be unique for the Database Account.
	Name *string `pulumi:"name"`
	// A `permissions` block as defined below.
	Permissions []SqlRoleDefinitionPermission `pulumi:"permissions"`
	// The name of the Resource Group in which the Cosmos DB SQL Role Definition is created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The GUID as the name of the Cosmos DB SQL Role Definition - one will be generated if not specified. Changing this forces a new resource to be created.
	RoleDefinitionId *string `pulumi:"roleDefinitionId"`
	// The type of the Cosmos DB SQL Role Definition. Possible values are `BuiltInRole` and `CustomRole`. Defaults to `CustomRole`. Changing this forces a new resource to be created.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a SqlRoleDefinition resource.
type SqlRoleDefinitionArgs struct {
	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName pulumi.StringInput
	// A list of fully qualified scopes at or below which Role Assignments may be created using this Cosmos DB SQL Role Definition. It will allow application of this Cosmos DB SQL Role Definition on the entire Database Account or any underlying Database/Collection. Scopes higher than Database Account are not enforceable as assignable scopes.
	//
	// > **Note:** The resources referenced in assignable scopes need not exist.
	AssignableScopes pulumi.StringArrayInput
	// An user-friendly name for the Cosmos DB SQL Role Definition which must be unique for the Database Account.
	Name pulumi.StringPtrInput
	// A `permissions` block as defined below.
	Permissions SqlRoleDefinitionPermissionArrayInput
	// The name of the Resource Group in which the Cosmos DB SQL Role Definition is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The GUID as the name of the Cosmos DB SQL Role Definition - one will be generated if not specified. Changing this forces a new resource to be created.
	RoleDefinitionId pulumi.StringPtrInput
	// The type of the Cosmos DB SQL Role Definition. Possible values are `BuiltInRole` and `CustomRole`. Defaults to `CustomRole`. Changing this forces a new resource to be created.
	Type pulumi.StringPtrInput
}

func (SqlRoleDefinitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlRoleDefinitionArgs)(nil)).Elem()
}

type SqlRoleDefinitionInput interface {
	pulumi.Input

	ToSqlRoleDefinitionOutput() SqlRoleDefinitionOutput
	ToSqlRoleDefinitionOutputWithContext(ctx context.Context) SqlRoleDefinitionOutput
}

func (*SqlRoleDefinition) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlRoleDefinition)(nil)).Elem()
}

func (i *SqlRoleDefinition) ToSqlRoleDefinitionOutput() SqlRoleDefinitionOutput {
	return i.ToSqlRoleDefinitionOutputWithContext(context.Background())
}

func (i *SqlRoleDefinition) ToSqlRoleDefinitionOutputWithContext(ctx context.Context) SqlRoleDefinitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlRoleDefinitionOutput)
}

// SqlRoleDefinitionArrayInput is an input type that accepts SqlRoleDefinitionArray and SqlRoleDefinitionArrayOutput values.
// You can construct a concrete instance of `SqlRoleDefinitionArrayInput` via:
//
//	SqlRoleDefinitionArray{ SqlRoleDefinitionArgs{...} }
type SqlRoleDefinitionArrayInput interface {
	pulumi.Input

	ToSqlRoleDefinitionArrayOutput() SqlRoleDefinitionArrayOutput
	ToSqlRoleDefinitionArrayOutputWithContext(context.Context) SqlRoleDefinitionArrayOutput
}

type SqlRoleDefinitionArray []SqlRoleDefinitionInput

func (SqlRoleDefinitionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlRoleDefinition)(nil)).Elem()
}

func (i SqlRoleDefinitionArray) ToSqlRoleDefinitionArrayOutput() SqlRoleDefinitionArrayOutput {
	return i.ToSqlRoleDefinitionArrayOutputWithContext(context.Background())
}

func (i SqlRoleDefinitionArray) ToSqlRoleDefinitionArrayOutputWithContext(ctx context.Context) SqlRoleDefinitionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlRoleDefinitionArrayOutput)
}

// SqlRoleDefinitionMapInput is an input type that accepts SqlRoleDefinitionMap and SqlRoleDefinitionMapOutput values.
// You can construct a concrete instance of `SqlRoleDefinitionMapInput` via:
//
//	SqlRoleDefinitionMap{ "key": SqlRoleDefinitionArgs{...} }
type SqlRoleDefinitionMapInput interface {
	pulumi.Input

	ToSqlRoleDefinitionMapOutput() SqlRoleDefinitionMapOutput
	ToSqlRoleDefinitionMapOutputWithContext(context.Context) SqlRoleDefinitionMapOutput
}

type SqlRoleDefinitionMap map[string]SqlRoleDefinitionInput

func (SqlRoleDefinitionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlRoleDefinition)(nil)).Elem()
}

func (i SqlRoleDefinitionMap) ToSqlRoleDefinitionMapOutput() SqlRoleDefinitionMapOutput {
	return i.ToSqlRoleDefinitionMapOutputWithContext(context.Background())
}

func (i SqlRoleDefinitionMap) ToSqlRoleDefinitionMapOutputWithContext(ctx context.Context) SqlRoleDefinitionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlRoleDefinitionMapOutput)
}

type SqlRoleDefinitionOutput struct{ *pulumi.OutputState }

func (SqlRoleDefinitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlRoleDefinition)(nil)).Elem()
}

func (o SqlRoleDefinitionOutput) ToSqlRoleDefinitionOutput() SqlRoleDefinitionOutput {
	return o
}

func (o SqlRoleDefinitionOutput) ToSqlRoleDefinitionOutputWithContext(ctx context.Context) SqlRoleDefinitionOutput {
	return o
}

// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
func (o SqlRoleDefinitionOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleDefinition) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

// A list of fully qualified scopes at or below which Role Assignments may be created using this Cosmos DB SQL Role Definition. It will allow application of this Cosmos DB SQL Role Definition on the entire Database Account or any underlying Database/Collection. Scopes higher than Database Account are not enforceable as assignable scopes.
//
// > **Note:** The resources referenced in assignable scopes need not exist.
func (o SqlRoleDefinitionOutput) AssignableScopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SqlRoleDefinition) pulumi.StringArrayOutput { return v.AssignableScopes }).(pulumi.StringArrayOutput)
}

// An user-friendly name for the Cosmos DB SQL Role Definition which must be unique for the Database Account.
func (o SqlRoleDefinitionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleDefinition) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A `permissions` block as defined below.
func (o SqlRoleDefinitionOutput) Permissions() SqlRoleDefinitionPermissionArrayOutput {
	return o.ApplyT(func(v *SqlRoleDefinition) SqlRoleDefinitionPermissionArrayOutput { return v.Permissions }).(SqlRoleDefinitionPermissionArrayOutput)
}

// The name of the Resource Group in which the Cosmos DB SQL Role Definition is created. Changing this forces a new resource to be created.
func (o SqlRoleDefinitionOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleDefinition) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The GUID as the name of the Cosmos DB SQL Role Definition - one will be generated if not specified. Changing this forces a new resource to be created.
func (o SqlRoleDefinitionOutput) RoleDefinitionId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleDefinition) pulumi.StringOutput { return v.RoleDefinitionId }).(pulumi.StringOutput)
}

// The type of the Cosmos DB SQL Role Definition. Possible values are `BuiltInRole` and `CustomRole`. Defaults to `CustomRole`. Changing this forces a new resource to be created.
func (o SqlRoleDefinitionOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlRoleDefinition) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type SqlRoleDefinitionArrayOutput struct{ *pulumi.OutputState }

func (SqlRoleDefinitionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlRoleDefinition)(nil)).Elem()
}

func (o SqlRoleDefinitionArrayOutput) ToSqlRoleDefinitionArrayOutput() SqlRoleDefinitionArrayOutput {
	return o
}

func (o SqlRoleDefinitionArrayOutput) ToSqlRoleDefinitionArrayOutputWithContext(ctx context.Context) SqlRoleDefinitionArrayOutput {
	return o
}

func (o SqlRoleDefinitionArrayOutput) Index(i pulumi.IntInput) SqlRoleDefinitionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlRoleDefinition {
		return vs[0].([]*SqlRoleDefinition)[vs[1].(int)]
	}).(SqlRoleDefinitionOutput)
}

type SqlRoleDefinitionMapOutput struct{ *pulumi.OutputState }

func (SqlRoleDefinitionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlRoleDefinition)(nil)).Elem()
}

func (o SqlRoleDefinitionMapOutput) ToSqlRoleDefinitionMapOutput() SqlRoleDefinitionMapOutput {
	return o
}

func (o SqlRoleDefinitionMapOutput) ToSqlRoleDefinitionMapOutputWithContext(ctx context.Context) SqlRoleDefinitionMapOutput {
	return o
}

func (o SqlRoleDefinitionMapOutput) MapIndex(k pulumi.StringInput) SqlRoleDefinitionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlRoleDefinition {
		return vs[0].(map[string]*SqlRoleDefinition)[vs[1].(string)]
	}).(SqlRoleDefinitionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlRoleDefinitionInput)(nil)).Elem(), &SqlRoleDefinition{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlRoleDefinitionArrayInput)(nil)).Elem(), SqlRoleDefinitionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlRoleDefinitionMapInput)(nil)).Elem(), SqlRoleDefinitionMap{})
	pulumi.RegisterOutputType(SqlRoleDefinitionOutput{})
	pulumi.RegisterOutputType(SqlRoleDefinitionArrayOutput{})
	pulumi.RegisterOutputType(SqlRoleDefinitionMapOutput{})
}

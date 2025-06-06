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

// Manages a Cosmos DB SQL Role Assignment.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cosmosdb"
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
//			exampleSqlRoleDefinition, err := cosmosdb.NewSqlRoleDefinition(ctx, "example", &cosmosdb.SqlRoleDefinitionArgs{
//				Name:              pulumi.String("examplesqlroledef"),
//				ResourceGroupName: example.Name,
//				AccountName:       exampleAccount.Name,
//				Type:              pulumi.String("CustomRole"),
//				AssignableScopes: pulumi.StringArray{
//					exampleAccount.ID(),
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
//			_, err = cosmosdb.NewSqlRoleAssignment(ctx, "example", &cosmosdb.SqlRoleAssignmentArgs{
//				Name:              pulumi.String("736180af-7fbc-4c7f-9004-22735173c1c3"),
//				ResourceGroupName: example.Name,
//				AccountName:       exampleAccount.Name,
//				RoleDefinitionId:  exampleSqlRoleDefinition.ID(),
//				PrincipalId:       pulumi.String(current.ObjectId),
//				Scope:             exampleAccount.ID(),
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
// Cosmos DB SQL Role Assignments can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cosmosdb/sqlRoleAssignment:SqlRoleAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DocumentDB/databaseAccounts/account1/sqlRoleAssignments/9e007587-dbcd-4190-84cb-fcab5a09ca39
// ```
type SqlRoleAssignment struct {
	pulumi.CustomResourceState

	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// The GUID as the name of the Cosmos DB SQL Role Assignment - one will be generated if not specified. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Principal (Client) in Azure Active Directory. Changing this forces a new resource to be created.
	PrincipalId pulumi.StringOutput `pulumi:"principalId"`
	// The name of the Resource Group in which the Cosmos DB SQL Role Assignment is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The resource ID of the Cosmos DB SQL Role Definition.
	RoleDefinitionId pulumi.StringOutput `pulumi:"roleDefinitionId"`
	// The data plane resource path for which access is being granted through this Cosmos DB SQL Role Assignment. Changing this forces a new resource to be created.
	Scope pulumi.StringOutput `pulumi:"scope"`
}

// NewSqlRoleAssignment registers a new resource with the given unique name, arguments, and options.
func NewSqlRoleAssignment(ctx *pulumi.Context,
	name string, args *SqlRoleAssignmentArgs, opts ...pulumi.ResourceOption) (*SqlRoleAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountName == nil {
		return nil, errors.New("invalid value for required argument 'AccountName'")
	}
	if args.PrincipalId == nil {
		return nil, errors.New("invalid value for required argument 'PrincipalId'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.RoleDefinitionId == nil {
		return nil, errors.New("invalid value for required argument 'RoleDefinitionId'")
	}
	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SqlRoleAssignment
	err := ctx.RegisterResource("azure:cosmosdb/sqlRoleAssignment:SqlRoleAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlRoleAssignment gets an existing SqlRoleAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlRoleAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlRoleAssignmentState, opts ...pulumi.ResourceOption) (*SqlRoleAssignment, error) {
	var resource SqlRoleAssignment
	err := ctx.ReadResource("azure:cosmosdb/sqlRoleAssignment:SqlRoleAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlRoleAssignment resources.
type sqlRoleAssignmentState struct {
	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName *string `pulumi:"accountName"`
	// The GUID as the name of the Cosmos DB SQL Role Assignment - one will be generated if not specified. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Principal (Client) in Azure Active Directory. Changing this forces a new resource to be created.
	PrincipalId *string `pulumi:"principalId"`
	// The name of the Resource Group in which the Cosmos DB SQL Role Assignment is created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The resource ID of the Cosmos DB SQL Role Definition.
	RoleDefinitionId *string `pulumi:"roleDefinitionId"`
	// The data plane resource path for which access is being granted through this Cosmos DB SQL Role Assignment. Changing this forces a new resource to be created.
	Scope *string `pulumi:"scope"`
}

type SqlRoleAssignmentState struct {
	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName pulumi.StringPtrInput
	// The GUID as the name of the Cosmos DB SQL Role Assignment - one will be generated if not specified. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Principal (Client) in Azure Active Directory. Changing this forces a new resource to be created.
	PrincipalId pulumi.StringPtrInput
	// The name of the Resource Group in which the Cosmos DB SQL Role Assignment is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The resource ID of the Cosmos DB SQL Role Definition.
	RoleDefinitionId pulumi.StringPtrInput
	// The data plane resource path for which access is being granted through this Cosmos DB SQL Role Assignment. Changing this forces a new resource to be created.
	Scope pulumi.StringPtrInput
}

func (SqlRoleAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlRoleAssignmentState)(nil)).Elem()
}

type sqlRoleAssignmentArgs struct {
	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName string `pulumi:"accountName"`
	// The GUID as the name of the Cosmos DB SQL Role Assignment - one will be generated if not specified. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the Principal (Client) in Azure Active Directory. Changing this forces a new resource to be created.
	PrincipalId string `pulumi:"principalId"`
	// The name of the Resource Group in which the Cosmos DB SQL Role Assignment is created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The resource ID of the Cosmos DB SQL Role Definition.
	RoleDefinitionId string `pulumi:"roleDefinitionId"`
	// The data plane resource path for which access is being granted through this Cosmos DB SQL Role Assignment. Changing this forces a new resource to be created.
	Scope string `pulumi:"scope"`
}

// The set of arguments for constructing a SqlRoleAssignment resource.
type SqlRoleAssignmentArgs struct {
	// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
	AccountName pulumi.StringInput
	// The GUID as the name of the Cosmos DB SQL Role Assignment - one will be generated if not specified. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the Principal (Client) in Azure Active Directory. Changing this forces a new resource to be created.
	PrincipalId pulumi.StringInput
	// The name of the Resource Group in which the Cosmos DB SQL Role Assignment is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The resource ID of the Cosmos DB SQL Role Definition.
	RoleDefinitionId pulumi.StringInput
	// The data plane resource path for which access is being granted through this Cosmos DB SQL Role Assignment. Changing this forces a new resource to be created.
	Scope pulumi.StringInput
}

func (SqlRoleAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlRoleAssignmentArgs)(nil)).Elem()
}

type SqlRoleAssignmentInput interface {
	pulumi.Input

	ToSqlRoleAssignmentOutput() SqlRoleAssignmentOutput
	ToSqlRoleAssignmentOutputWithContext(ctx context.Context) SqlRoleAssignmentOutput
}

func (*SqlRoleAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlRoleAssignment)(nil)).Elem()
}

func (i *SqlRoleAssignment) ToSqlRoleAssignmentOutput() SqlRoleAssignmentOutput {
	return i.ToSqlRoleAssignmentOutputWithContext(context.Background())
}

func (i *SqlRoleAssignment) ToSqlRoleAssignmentOutputWithContext(ctx context.Context) SqlRoleAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlRoleAssignmentOutput)
}

// SqlRoleAssignmentArrayInput is an input type that accepts SqlRoleAssignmentArray and SqlRoleAssignmentArrayOutput values.
// You can construct a concrete instance of `SqlRoleAssignmentArrayInput` via:
//
//	SqlRoleAssignmentArray{ SqlRoleAssignmentArgs{...} }
type SqlRoleAssignmentArrayInput interface {
	pulumi.Input

	ToSqlRoleAssignmentArrayOutput() SqlRoleAssignmentArrayOutput
	ToSqlRoleAssignmentArrayOutputWithContext(context.Context) SqlRoleAssignmentArrayOutput
}

type SqlRoleAssignmentArray []SqlRoleAssignmentInput

func (SqlRoleAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlRoleAssignment)(nil)).Elem()
}

func (i SqlRoleAssignmentArray) ToSqlRoleAssignmentArrayOutput() SqlRoleAssignmentArrayOutput {
	return i.ToSqlRoleAssignmentArrayOutputWithContext(context.Background())
}

func (i SqlRoleAssignmentArray) ToSqlRoleAssignmentArrayOutputWithContext(ctx context.Context) SqlRoleAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlRoleAssignmentArrayOutput)
}

// SqlRoleAssignmentMapInput is an input type that accepts SqlRoleAssignmentMap and SqlRoleAssignmentMapOutput values.
// You can construct a concrete instance of `SqlRoleAssignmentMapInput` via:
//
//	SqlRoleAssignmentMap{ "key": SqlRoleAssignmentArgs{...} }
type SqlRoleAssignmentMapInput interface {
	pulumi.Input

	ToSqlRoleAssignmentMapOutput() SqlRoleAssignmentMapOutput
	ToSqlRoleAssignmentMapOutputWithContext(context.Context) SqlRoleAssignmentMapOutput
}

type SqlRoleAssignmentMap map[string]SqlRoleAssignmentInput

func (SqlRoleAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlRoleAssignment)(nil)).Elem()
}

func (i SqlRoleAssignmentMap) ToSqlRoleAssignmentMapOutput() SqlRoleAssignmentMapOutput {
	return i.ToSqlRoleAssignmentMapOutputWithContext(context.Background())
}

func (i SqlRoleAssignmentMap) ToSqlRoleAssignmentMapOutputWithContext(ctx context.Context) SqlRoleAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlRoleAssignmentMapOutput)
}

type SqlRoleAssignmentOutput struct{ *pulumi.OutputState }

func (SqlRoleAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlRoleAssignment)(nil)).Elem()
}

func (o SqlRoleAssignmentOutput) ToSqlRoleAssignmentOutput() SqlRoleAssignmentOutput {
	return o
}

func (o SqlRoleAssignmentOutput) ToSqlRoleAssignmentOutputWithContext(ctx context.Context) SqlRoleAssignmentOutput {
	return o
}

// The name of the Cosmos DB Account. Changing this forces a new resource to be created.
func (o SqlRoleAssignmentOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleAssignment) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

// The GUID as the name of the Cosmos DB SQL Role Assignment - one will be generated if not specified. Changing this forces a new resource to be created.
func (o SqlRoleAssignmentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleAssignment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the Principal (Client) in Azure Active Directory. Changing this forces a new resource to be created.
func (o SqlRoleAssignmentOutput) PrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleAssignment) pulumi.StringOutput { return v.PrincipalId }).(pulumi.StringOutput)
}

// The name of the Resource Group in which the Cosmos DB SQL Role Assignment is created. Changing this forces a new resource to be created.
func (o SqlRoleAssignmentOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleAssignment) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The resource ID of the Cosmos DB SQL Role Definition.
func (o SqlRoleAssignmentOutput) RoleDefinitionId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleAssignment) pulumi.StringOutput { return v.RoleDefinitionId }).(pulumi.StringOutput)
}

// The data plane resource path for which access is being granted through this Cosmos DB SQL Role Assignment. Changing this forces a new resource to be created.
func (o SqlRoleAssignmentOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlRoleAssignment) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

type SqlRoleAssignmentArrayOutput struct{ *pulumi.OutputState }

func (SqlRoleAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlRoleAssignment)(nil)).Elem()
}

func (o SqlRoleAssignmentArrayOutput) ToSqlRoleAssignmentArrayOutput() SqlRoleAssignmentArrayOutput {
	return o
}

func (o SqlRoleAssignmentArrayOutput) ToSqlRoleAssignmentArrayOutputWithContext(ctx context.Context) SqlRoleAssignmentArrayOutput {
	return o
}

func (o SqlRoleAssignmentArrayOutput) Index(i pulumi.IntInput) SqlRoleAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlRoleAssignment {
		return vs[0].([]*SqlRoleAssignment)[vs[1].(int)]
	}).(SqlRoleAssignmentOutput)
}

type SqlRoleAssignmentMapOutput struct{ *pulumi.OutputState }

func (SqlRoleAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlRoleAssignment)(nil)).Elem()
}

func (o SqlRoleAssignmentMapOutput) ToSqlRoleAssignmentMapOutput() SqlRoleAssignmentMapOutput {
	return o
}

func (o SqlRoleAssignmentMapOutput) ToSqlRoleAssignmentMapOutputWithContext(ctx context.Context) SqlRoleAssignmentMapOutput {
	return o
}

func (o SqlRoleAssignmentMapOutput) MapIndex(k pulumi.StringInput) SqlRoleAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlRoleAssignment {
		return vs[0].(map[string]*SqlRoleAssignment)[vs[1].(string)]
	}).(SqlRoleAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlRoleAssignmentInput)(nil)).Elem(), &SqlRoleAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlRoleAssignmentArrayInput)(nil)).Elem(), SqlRoleAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlRoleAssignmentMapInput)(nil)).Elem(), SqlRoleAssignmentMap{})
	pulumi.RegisterOutputType(SqlRoleAssignmentOutput{})
	pulumi.RegisterOutputType(SqlRoleAssignmentArrayOutput{})
	pulumi.RegisterOutputType(SqlRoleAssignmentMapOutput{})
}

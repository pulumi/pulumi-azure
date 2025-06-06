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

// Manages a Cosmos DB Mongo User Definition.
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
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := cosmosdb.NewAccount(ctx, "example", &cosmosdb.AccountArgs{
//				Name:              pulumi.String("example-ca"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				OfferType:         pulumi.String("Standard"),
//				Kind:              pulumi.String("MongoDB"),
//				Capabilities: cosmosdb.AccountCapabilityArray{
//					&cosmosdb.AccountCapabilityArgs{
//						Name: pulumi.String("EnableMongo"),
//					},
//					&cosmosdb.AccountCapabilityArgs{
//						Name: pulumi.String("EnableMongoRoleBasedAccessControl"),
//					},
//				},
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
//			exampleMongoDatabase, err := cosmosdb.NewMongoDatabase(ctx, "example", &cosmosdb.MongoDatabaseArgs{
//				Name:              pulumi.String("example-mongodb"),
//				ResourceGroupName: exampleAccount.ResourceGroupName,
//				AccountName:       exampleAccount.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cosmosdb.NewMongoUserDefinition(ctx, "example", &cosmosdb.MongoUserDefinitionArgs{
//				CosmosMongoDatabaseId: exampleMongoDatabase.ID(),
//				Username:              pulumi.String("myUserName"),
//				Password:              pulumi.String("myPassword"),
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
// * `Microsoft.DocumentDB`: 2022-11-15
//
// ## Import
//
// Cosmos DB Mongo User Definitions can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cosmosdb/mongoUserDefinition:MongoUserDefinition example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DocumentDB/databaseAccounts/account1/mongodbUserDefinitions/dbname1.username1
// ```
type MongoUserDefinition struct {
	pulumi.CustomResourceState

	// The resource ID of the Mongo DB. Changing this forces a new resource to be created.
	CosmosMongoDatabaseId pulumi.StringOutput `pulumi:"cosmosMongoDatabaseId"`
	// A list of Mongo Roles that are inherited to the Mongo User Definition.
	//
	// > **Note:** The role that needs to be inherited should exist in the Mongo DB of `cosmosMongoDatabaseId`.
	InheritedRoleNames pulumi.StringArrayOutput `pulumi:"inheritedRoleNames"`
	// The password for the Mongo User Definition.
	Password pulumi.StringOutput `pulumi:"password"`
	// The username for the Mongo User Definition. Changing this forces a new resource to be created.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewMongoUserDefinition registers a new resource with the given unique name, arguments, and options.
func NewMongoUserDefinition(ctx *pulumi.Context,
	name string, args *MongoUserDefinitionArgs, opts ...pulumi.ResourceOption) (*MongoUserDefinition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CosmosMongoDatabaseId == nil {
		return nil, errors.New("invalid value for required argument 'CosmosMongoDatabaseId'")
	}
	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MongoUserDefinition
	err := ctx.RegisterResource("azure:cosmosdb/mongoUserDefinition:MongoUserDefinition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMongoUserDefinition gets an existing MongoUserDefinition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMongoUserDefinition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MongoUserDefinitionState, opts ...pulumi.ResourceOption) (*MongoUserDefinition, error) {
	var resource MongoUserDefinition
	err := ctx.ReadResource("azure:cosmosdb/mongoUserDefinition:MongoUserDefinition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MongoUserDefinition resources.
type mongoUserDefinitionState struct {
	// The resource ID of the Mongo DB. Changing this forces a new resource to be created.
	CosmosMongoDatabaseId *string `pulumi:"cosmosMongoDatabaseId"`
	// A list of Mongo Roles that are inherited to the Mongo User Definition.
	//
	// > **Note:** The role that needs to be inherited should exist in the Mongo DB of `cosmosMongoDatabaseId`.
	InheritedRoleNames []string `pulumi:"inheritedRoleNames"`
	// The password for the Mongo User Definition.
	Password *string `pulumi:"password"`
	// The username for the Mongo User Definition. Changing this forces a new resource to be created.
	Username *string `pulumi:"username"`
}

type MongoUserDefinitionState struct {
	// The resource ID of the Mongo DB. Changing this forces a new resource to be created.
	CosmosMongoDatabaseId pulumi.StringPtrInput
	// A list of Mongo Roles that are inherited to the Mongo User Definition.
	//
	// > **Note:** The role that needs to be inherited should exist in the Mongo DB of `cosmosMongoDatabaseId`.
	InheritedRoleNames pulumi.StringArrayInput
	// The password for the Mongo User Definition.
	Password pulumi.StringPtrInput
	// The username for the Mongo User Definition. Changing this forces a new resource to be created.
	Username pulumi.StringPtrInput
}

func (MongoUserDefinitionState) ElementType() reflect.Type {
	return reflect.TypeOf((*mongoUserDefinitionState)(nil)).Elem()
}

type mongoUserDefinitionArgs struct {
	// The resource ID of the Mongo DB. Changing this forces a new resource to be created.
	CosmosMongoDatabaseId string `pulumi:"cosmosMongoDatabaseId"`
	// A list of Mongo Roles that are inherited to the Mongo User Definition.
	//
	// > **Note:** The role that needs to be inherited should exist in the Mongo DB of `cosmosMongoDatabaseId`.
	InheritedRoleNames []string `pulumi:"inheritedRoleNames"`
	// The password for the Mongo User Definition.
	Password string `pulumi:"password"`
	// The username for the Mongo User Definition. Changing this forces a new resource to be created.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a MongoUserDefinition resource.
type MongoUserDefinitionArgs struct {
	// The resource ID of the Mongo DB. Changing this forces a new resource to be created.
	CosmosMongoDatabaseId pulumi.StringInput
	// A list of Mongo Roles that are inherited to the Mongo User Definition.
	//
	// > **Note:** The role that needs to be inherited should exist in the Mongo DB of `cosmosMongoDatabaseId`.
	InheritedRoleNames pulumi.StringArrayInput
	// The password for the Mongo User Definition.
	Password pulumi.StringInput
	// The username for the Mongo User Definition. Changing this forces a new resource to be created.
	Username pulumi.StringInput
}

func (MongoUserDefinitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mongoUserDefinitionArgs)(nil)).Elem()
}

type MongoUserDefinitionInput interface {
	pulumi.Input

	ToMongoUserDefinitionOutput() MongoUserDefinitionOutput
	ToMongoUserDefinitionOutputWithContext(ctx context.Context) MongoUserDefinitionOutput
}

func (*MongoUserDefinition) ElementType() reflect.Type {
	return reflect.TypeOf((**MongoUserDefinition)(nil)).Elem()
}

func (i *MongoUserDefinition) ToMongoUserDefinitionOutput() MongoUserDefinitionOutput {
	return i.ToMongoUserDefinitionOutputWithContext(context.Background())
}

func (i *MongoUserDefinition) ToMongoUserDefinitionOutputWithContext(ctx context.Context) MongoUserDefinitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MongoUserDefinitionOutput)
}

// MongoUserDefinitionArrayInput is an input type that accepts MongoUserDefinitionArray and MongoUserDefinitionArrayOutput values.
// You can construct a concrete instance of `MongoUserDefinitionArrayInput` via:
//
//	MongoUserDefinitionArray{ MongoUserDefinitionArgs{...} }
type MongoUserDefinitionArrayInput interface {
	pulumi.Input

	ToMongoUserDefinitionArrayOutput() MongoUserDefinitionArrayOutput
	ToMongoUserDefinitionArrayOutputWithContext(context.Context) MongoUserDefinitionArrayOutput
}

type MongoUserDefinitionArray []MongoUserDefinitionInput

func (MongoUserDefinitionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MongoUserDefinition)(nil)).Elem()
}

func (i MongoUserDefinitionArray) ToMongoUserDefinitionArrayOutput() MongoUserDefinitionArrayOutput {
	return i.ToMongoUserDefinitionArrayOutputWithContext(context.Background())
}

func (i MongoUserDefinitionArray) ToMongoUserDefinitionArrayOutputWithContext(ctx context.Context) MongoUserDefinitionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MongoUserDefinitionArrayOutput)
}

// MongoUserDefinitionMapInput is an input type that accepts MongoUserDefinitionMap and MongoUserDefinitionMapOutput values.
// You can construct a concrete instance of `MongoUserDefinitionMapInput` via:
//
//	MongoUserDefinitionMap{ "key": MongoUserDefinitionArgs{...} }
type MongoUserDefinitionMapInput interface {
	pulumi.Input

	ToMongoUserDefinitionMapOutput() MongoUserDefinitionMapOutput
	ToMongoUserDefinitionMapOutputWithContext(context.Context) MongoUserDefinitionMapOutput
}

type MongoUserDefinitionMap map[string]MongoUserDefinitionInput

func (MongoUserDefinitionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MongoUserDefinition)(nil)).Elem()
}

func (i MongoUserDefinitionMap) ToMongoUserDefinitionMapOutput() MongoUserDefinitionMapOutput {
	return i.ToMongoUserDefinitionMapOutputWithContext(context.Background())
}

func (i MongoUserDefinitionMap) ToMongoUserDefinitionMapOutputWithContext(ctx context.Context) MongoUserDefinitionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MongoUserDefinitionMapOutput)
}

type MongoUserDefinitionOutput struct{ *pulumi.OutputState }

func (MongoUserDefinitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MongoUserDefinition)(nil)).Elem()
}

func (o MongoUserDefinitionOutput) ToMongoUserDefinitionOutput() MongoUserDefinitionOutput {
	return o
}

func (o MongoUserDefinitionOutput) ToMongoUserDefinitionOutputWithContext(ctx context.Context) MongoUserDefinitionOutput {
	return o
}

// The resource ID of the Mongo DB. Changing this forces a new resource to be created.
func (o MongoUserDefinitionOutput) CosmosMongoDatabaseId() pulumi.StringOutput {
	return o.ApplyT(func(v *MongoUserDefinition) pulumi.StringOutput { return v.CosmosMongoDatabaseId }).(pulumi.StringOutput)
}

// A list of Mongo Roles that are inherited to the Mongo User Definition.
//
// > **Note:** The role that needs to be inherited should exist in the Mongo DB of `cosmosMongoDatabaseId`.
func (o MongoUserDefinitionOutput) InheritedRoleNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MongoUserDefinition) pulumi.StringArrayOutput { return v.InheritedRoleNames }).(pulumi.StringArrayOutput)
}

// The password for the Mongo User Definition.
func (o MongoUserDefinitionOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *MongoUserDefinition) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The username for the Mongo User Definition. Changing this forces a new resource to be created.
func (o MongoUserDefinitionOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *MongoUserDefinition) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type MongoUserDefinitionArrayOutput struct{ *pulumi.OutputState }

func (MongoUserDefinitionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MongoUserDefinition)(nil)).Elem()
}

func (o MongoUserDefinitionArrayOutput) ToMongoUserDefinitionArrayOutput() MongoUserDefinitionArrayOutput {
	return o
}

func (o MongoUserDefinitionArrayOutput) ToMongoUserDefinitionArrayOutputWithContext(ctx context.Context) MongoUserDefinitionArrayOutput {
	return o
}

func (o MongoUserDefinitionArrayOutput) Index(i pulumi.IntInput) MongoUserDefinitionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MongoUserDefinition {
		return vs[0].([]*MongoUserDefinition)[vs[1].(int)]
	}).(MongoUserDefinitionOutput)
}

type MongoUserDefinitionMapOutput struct{ *pulumi.OutputState }

func (MongoUserDefinitionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MongoUserDefinition)(nil)).Elem()
}

func (o MongoUserDefinitionMapOutput) ToMongoUserDefinitionMapOutput() MongoUserDefinitionMapOutput {
	return o
}

func (o MongoUserDefinitionMapOutput) ToMongoUserDefinitionMapOutputWithContext(ctx context.Context) MongoUserDefinitionMapOutput {
	return o
}

func (o MongoUserDefinitionMapOutput) MapIndex(k pulumi.StringInput) MongoUserDefinitionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MongoUserDefinition {
		return vs[0].(map[string]*MongoUserDefinition)[vs[1].(string)]
	}).(MongoUserDefinitionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MongoUserDefinitionInput)(nil)).Elem(), &MongoUserDefinition{})
	pulumi.RegisterInputType(reflect.TypeOf((*MongoUserDefinitionArrayInput)(nil)).Elem(), MongoUserDefinitionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MongoUserDefinitionMapInput)(nil)).Elem(), MongoUserDefinitionMap{})
	pulumi.RegisterOutputType(MongoUserDefinitionOutput{})
	pulumi.RegisterOutputType(MongoUserDefinitionArrayOutput{})
	pulumi.RegisterOutputType(MongoUserDefinitionMapOutput{})
}

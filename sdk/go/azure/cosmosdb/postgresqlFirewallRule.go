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

// Manages an Azure Cosmos DB for PostgreSQL Firewall Rule.
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
//			examplePostgresqlCluster, err := cosmosdb.NewPostgresqlCluster(ctx, "example", &cosmosdb.PostgresqlClusterArgs{
//				Name:                        pulumi.String("examplecluster"),
//				ResourceGroupName:           example.Name,
//				Location:                    example.Location,
//				AdministratorLoginPassword:  pulumi.String("H@Sh1CoR3!"),
//				CoordinatorStorageQuotaInMb: pulumi.Int(131072),
//				CoordinatorVcoreCount:       pulumi.Int(2),
//				NodeCount:                   pulumi.Int(0),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cosmosdb.NewPostgresqlFirewallRule(ctx, "example", &cosmosdb.PostgresqlFirewallRuleArgs{
//				Name:           pulumi.String("example-firewallrule"),
//				ClusterId:      examplePostgresqlCluster.ID(),
//				StartIpAddress: pulumi.String("10.0.17.62"),
//				EndIpAddress:   pulumi.String("10.0.17.64"),
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
// * `Microsoft.DBforPostgreSQL`: 2022-11-08
//
// ## Import
//
// Azure Cosmos DB for PostgreSQL Firewall Rules can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:cosmosdb/postgresqlFirewallRule:PostgresqlFirewallRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.DBforPostgreSQL/serverGroupsv2/cluster1/firewallRules/firewallRule1
// ```
type PostgresqlFirewallRule struct {
	pulumi.CustomResourceState

	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The end IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	EndIpAddress pulumi.StringOutput `pulumi:"endIpAddress"`
	// The name which should be used for the Azure Cosmos DB for PostgreSQL Firewall Rule. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The start IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	StartIpAddress pulumi.StringOutput `pulumi:"startIpAddress"`
}

// NewPostgresqlFirewallRule registers a new resource with the given unique name, arguments, and options.
func NewPostgresqlFirewallRule(ctx *pulumi.Context,
	name string, args *PostgresqlFirewallRuleArgs, opts ...pulumi.ResourceOption) (*PostgresqlFirewallRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.EndIpAddress == nil {
		return nil, errors.New("invalid value for required argument 'EndIpAddress'")
	}
	if args.StartIpAddress == nil {
		return nil, errors.New("invalid value for required argument 'StartIpAddress'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PostgresqlFirewallRule
	err := ctx.RegisterResource("azure:cosmosdb/postgresqlFirewallRule:PostgresqlFirewallRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPostgresqlFirewallRule gets an existing PostgresqlFirewallRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPostgresqlFirewallRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PostgresqlFirewallRuleState, opts ...pulumi.ResourceOption) (*PostgresqlFirewallRule, error) {
	var resource PostgresqlFirewallRule
	err := ctx.ReadResource("azure:cosmosdb/postgresqlFirewallRule:PostgresqlFirewallRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PostgresqlFirewallRule resources.
type postgresqlFirewallRuleState struct {
	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	ClusterId *string `pulumi:"clusterId"`
	// The end IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	EndIpAddress *string `pulumi:"endIpAddress"`
	// The name which should be used for the Azure Cosmos DB for PostgreSQL Firewall Rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The start IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	StartIpAddress *string `pulumi:"startIpAddress"`
}

type PostgresqlFirewallRuleState struct {
	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	ClusterId pulumi.StringPtrInput
	// The end IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	EndIpAddress pulumi.StringPtrInput
	// The name which should be used for the Azure Cosmos DB for PostgreSQL Firewall Rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The start IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	StartIpAddress pulumi.StringPtrInput
}

func (PostgresqlFirewallRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*postgresqlFirewallRuleState)(nil)).Elem()
}

type postgresqlFirewallRuleArgs struct {
	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	ClusterId string `pulumi:"clusterId"`
	// The end IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	EndIpAddress string `pulumi:"endIpAddress"`
	// The name which should be used for the Azure Cosmos DB for PostgreSQL Firewall Rule. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The start IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	StartIpAddress string `pulumi:"startIpAddress"`
}

// The set of arguments for constructing a PostgresqlFirewallRule resource.
type PostgresqlFirewallRuleArgs struct {
	// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
	ClusterId pulumi.StringInput
	// The end IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	EndIpAddress pulumi.StringInput
	// The name which should be used for the Azure Cosmos DB for PostgreSQL Firewall Rule. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The start IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
	StartIpAddress pulumi.StringInput
}

func (PostgresqlFirewallRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*postgresqlFirewallRuleArgs)(nil)).Elem()
}

type PostgresqlFirewallRuleInput interface {
	pulumi.Input

	ToPostgresqlFirewallRuleOutput() PostgresqlFirewallRuleOutput
	ToPostgresqlFirewallRuleOutputWithContext(ctx context.Context) PostgresqlFirewallRuleOutput
}

func (*PostgresqlFirewallRule) ElementType() reflect.Type {
	return reflect.TypeOf((**PostgresqlFirewallRule)(nil)).Elem()
}

func (i *PostgresqlFirewallRule) ToPostgresqlFirewallRuleOutput() PostgresqlFirewallRuleOutput {
	return i.ToPostgresqlFirewallRuleOutputWithContext(context.Background())
}

func (i *PostgresqlFirewallRule) ToPostgresqlFirewallRuleOutputWithContext(ctx context.Context) PostgresqlFirewallRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PostgresqlFirewallRuleOutput)
}

// PostgresqlFirewallRuleArrayInput is an input type that accepts PostgresqlFirewallRuleArray and PostgresqlFirewallRuleArrayOutput values.
// You can construct a concrete instance of `PostgresqlFirewallRuleArrayInput` via:
//
//	PostgresqlFirewallRuleArray{ PostgresqlFirewallRuleArgs{...} }
type PostgresqlFirewallRuleArrayInput interface {
	pulumi.Input

	ToPostgresqlFirewallRuleArrayOutput() PostgresqlFirewallRuleArrayOutput
	ToPostgresqlFirewallRuleArrayOutputWithContext(context.Context) PostgresqlFirewallRuleArrayOutput
}

type PostgresqlFirewallRuleArray []PostgresqlFirewallRuleInput

func (PostgresqlFirewallRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PostgresqlFirewallRule)(nil)).Elem()
}

func (i PostgresqlFirewallRuleArray) ToPostgresqlFirewallRuleArrayOutput() PostgresqlFirewallRuleArrayOutput {
	return i.ToPostgresqlFirewallRuleArrayOutputWithContext(context.Background())
}

func (i PostgresqlFirewallRuleArray) ToPostgresqlFirewallRuleArrayOutputWithContext(ctx context.Context) PostgresqlFirewallRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PostgresqlFirewallRuleArrayOutput)
}

// PostgresqlFirewallRuleMapInput is an input type that accepts PostgresqlFirewallRuleMap and PostgresqlFirewallRuleMapOutput values.
// You can construct a concrete instance of `PostgresqlFirewallRuleMapInput` via:
//
//	PostgresqlFirewallRuleMap{ "key": PostgresqlFirewallRuleArgs{...} }
type PostgresqlFirewallRuleMapInput interface {
	pulumi.Input

	ToPostgresqlFirewallRuleMapOutput() PostgresqlFirewallRuleMapOutput
	ToPostgresqlFirewallRuleMapOutputWithContext(context.Context) PostgresqlFirewallRuleMapOutput
}

type PostgresqlFirewallRuleMap map[string]PostgresqlFirewallRuleInput

func (PostgresqlFirewallRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PostgresqlFirewallRule)(nil)).Elem()
}

func (i PostgresqlFirewallRuleMap) ToPostgresqlFirewallRuleMapOutput() PostgresqlFirewallRuleMapOutput {
	return i.ToPostgresqlFirewallRuleMapOutputWithContext(context.Background())
}

func (i PostgresqlFirewallRuleMap) ToPostgresqlFirewallRuleMapOutputWithContext(ctx context.Context) PostgresqlFirewallRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PostgresqlFirewallRuleMapOutput)
}

type PostgresqlFirewallRuleOutput struct{ *pulumi.OutputState }

func (PostgresqlFirewallRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PostgresqlFirewallRule)(nil)).Elem()
}

func (o PostgresqlFirewallRuleOutput) ToPostgresqlFirewallRuleOutput() PostgresqlFirewallRuleOutput {
	return o
}

func (o PostgresqlFirewallRuleOutput) ToPostgresqlFirewallRuleOutputWithContext(ctx context.Context) PostgresqlFirewallRuleOutput {
	return o
}

// The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
func (o PostgresqlFirewallRuleOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresqlFirewallRule) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// The end IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
func (o PostgresqlFirewallRuleOutput) EndIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresqlFirewallRule) pulumi.StringOutput { return v.EndIpAddress }).(pulumi.StringOutput)
}

// The name which should be used for the Azure Cosmos DB for PostgreSQL Firewall Rule. Changing this forces a new resource to be created.
func (o PostgresqlFirewallRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresqlFirewallRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The start IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
func (o PostgresqlFirewallRuleOutput) StartIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *PostgresqlFirewallRule) pulumi.StringOutput { return v.StartIpAddress }).(pulumi.StringOutput)
}

type PostgresqlFirewallRuleArrayOutput struct{ *pulumi.OutputState }

func (PostgresqlFirewallRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PostgresqlFirewallRule)(nil)).Elem()
}

func (o PostgresqlFirewallRuleArrayOutput) ToPostgresqlFirewallRuleArrayOutput() PostgresqlFirewallRuleArrayOutput {
	return o
}

func (o PostgresqlFirewallRuleArrayOutput) ToPostgresqlFirewallRuleArrayOutputWithContext(ctx context.Context) PostgresqlFirewallRuleArrayOutput {
	return o
}

func (o PostgresqlFirewallRuleArrayOutput) Index(i pulumi.IntInput) PostgresqlFirewallRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PostgresqlFirewallRule {
		return vs[0].([]*PostgresqlFirewallRule)[vs[1].(int)]
	}).(PostgresqlFirewallRuleOutput)
}

type PostgresqlFirewallRuleMapOutput struct{ *pulumi.OutputState }

func (PostgresqlFirewallRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PostgresqlFirewallRule)(nil)).Elem()
}

func (o PostgresqlFirewallRuleMapOutput) ToPostgresqlFirewallRuleMapOutput() PostgresqlFirewallRuleMapOutput {
	return o
}

func (o PostgresqlFirewallRuleMapOutput) ToPostgresqlFirewallRuleMapOutputWithContext(ctx context.Context) PostgresqlFirewallRuleMapOutput {
	return o
}

func (o PostgresqlFirewallRuleMapOutput) MapIndex(k pulumi.StringInput) PostgresqlFirewallRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PostgresqlFirewallRule {
		return vs[0].(map[string]*PostgresqlFirewallRule)[vs[1].(string)]
	}).(PostgresqlFirewallRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PostgresqlFirewallRuleInput)(nil)).Elem(), &PostgresqlFirewallRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*PostgresqlFirewallRuleArrayInput)(nil)).Elem(), PostgresqlFirewallRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PostgresqlFirewallRuleMapInput)(nil)).Elem(), PostgresqlFirewallRuleMap{})
	pulumi.RegisterOutputType(PostgresqlFirewallRuleOutput{})
	pulumi.RegisterOutputType(PostgresqlFirewallRuleArrayOutput{})
	pulumi.RegisterOutputType(PostgresqlFirewallRuleMapOutput{})
}

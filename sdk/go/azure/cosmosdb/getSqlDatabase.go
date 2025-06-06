// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cosmosdb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing CosmosDB SQL Database.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cosmosdb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cosmosdb.LookupSqlDatabase(ctx, &cosmosdb.LookupSqlDatabaseArgs{
//				Name:              "tfex-cosmosdb-sql-database",
//				ResourceGroupName: "tfex-cosmosdb-sql-database-rg",
//				AccountName:       "tfex-cosmosdb-sql-database-account-name",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSqlDatabase(ctx *pulumi.Context, args *LookupSqlDatabaseArgs, opts ...pulumi.InvokeOption) (*LookupSqlDatabaseResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSqlDatabaseResult
	err := ctx.Invoke("azure:cosmosdb/getSqlDatabase:getSqlDatabase", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSqlDatabase.
type LookupSqlDatabaseArgs struct {
	// The name of the Cosmos DB SQL Database to create the table within.
	AccountName string `pulumi:"accountName"`
	// Specifies the name of the Cosmos DB SQL Database.
	Name string `pulumi:"name"`
	// The name of the resource group in which the Cosmos DB SQL Database is created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getSqlDatabase.
type LookupSqlDatabaseResult struct {
	AccountName string `pulumi:"accountName"`
	// An `autoscaleSettings` block as defined below.
	AutoscaleSettings []GetSqlDatabaseAutoscaleSetting `pulumi:"autoscaleSettings"`
	// The provider-assigned unique ID for this managed resource.
	Id                string `pulumi:"id"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The throughput of SQL database (RU/s).
	Throughput int `pulumi:"throughput"`
}

func LookupSqlDatabaseOutput(ctx *pulumi.Context, args LookupSqlDatabaseOutputArgs, opts ...pulumi.InvokeOption) LookupSqlDatabaseResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSqlDatabaseResultOutput, error) {
			args := v.(LookupSqlDatabaseArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:cosmosdb/getSqlDatabase:getSqlDatabase", args, LookupSqlDatabaseResultOutput{}, options).(LookupSqlDatabaseResultOutput), nil
		}).(LookupSqlDatabaseResultOutput)
}

// A collection of arguments for invoking getSqlDatabase.
type LookupSqlDatabaseOutputArgs struct {
	// The name of the Cosmos DB SQL Database to create the table within.
	AccountName pulumi.StringInput `pulumi:"accountName"`
	// Specifies the name of the Cosmos DB SQL Database.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the resource group in which the Cosmos DB SQL Database is created.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupSqlDatabaseOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSqlDatabaseArgs)(nil)).Elem()
}

// A collection of values returned by getSqlDatabase.
type LookupSqlDatabaseResultOutput struct{ *pulumi.OutputState }

func (LookupSqlDatabaseResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSqlDatabaseResult)(nil)).Elem()
}

func (o LookupSqlDatabaseResultOutput) ToLookupSqlDatabaseResultOutput() LookupSqlDatabaseResultOutput {
	return o
}

func (o LookupSqlDatabaseResultOutput) ToLookupSqlDatabaseResultOutputWithContext(ctx context.Context) LookupSqlDatabaseResultOutput {
	return o
}

func (o LookupSqlDatabaseResultOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSqlDatabaseResult) string { return v.AccountName }).(pulumi.StringOutput)
}

// An `autoscaleSettings` block as defined below.
func (o LookupSqlDatabaseResultOutput) AutoscaleSettings() GetSqlDatabaseAutoscaleSettingArrayOutput {
	return o.ApplyT(func(v LookupSqlDatabaseResult) []GetSqlDatabaseAutoscaleSetting { return v.AutoscaleSettings }).(GetSqlDatabaseAutoscaleSettingArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSqlDatabaseResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSqlDatabaseResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSqlDatabaseResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSqlDatabaseResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupSqlDatabaseResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSqlDatabaseResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The throughput of SQL database (RU/s).
func (o LookupSqlDatabaseResultOutput) Throughput() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSqlDatabaseResult) int { return v.Throughput }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSqlDatabaseResultOutput{})
}

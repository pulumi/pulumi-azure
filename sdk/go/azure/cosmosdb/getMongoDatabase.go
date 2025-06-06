// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cosmosdb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Cosmos DB Mongo Database.
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
//			example, err := cosmosdb.LookupMongoDatabase(ctx, &cosmosdb.LookupMongoDatabaseArgs{
//				Name:              "test-cosmosdb-mongo-db",
//				ResourceGroupName: "test-cosmosdb-account-rg",
//				AccountName:       "test-cosmosdb-account",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", example.Id)
//			return nil
//		})
//	}
//
// ```
func LookupMongoDatabase(ctx *pulumi.Context, args *LookupMongoDatabaseArgs, opts ...pulumi.InvokeOption) (*LookupMongoDatabaseResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMongoDatabaseResult
	err := ctx.Invoke("azure:cosmosdb/getMongoDatabase:getMongoDatabase", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMongoDatabase.
type LookupMongoDatabaseArgs struct {
	// The name of the Cosmos DB Account where the Mongo Database exists.
	AccountName string `pulumi:"accountName"`
	// The name of this Cosmos DB Mongo Database.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Cosmos DB Mongo Database exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getMongoDatabase.
type LookupMongoDatabaseResult struct {
	AccountName string `pulumi:"accountName"`
	// The provider-assigned unique ID for this managed resource.
	Id                string `pulumi:"id"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the Cosmos DB Mongo Database.
	Tags map[string]string `pulumi:"tags"`
}

func LookupMongoDatabaseOutput(ctx *pulumi.Context, args LookupMongoDatabaseOutputArgs, opts ...pulumi.InvokeOption) LookupMongoDatabaseResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupMongoDatabaseResultOutput, error) {
			args := v.(LookupMongoDatabaseArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:cosmosdb/getMongoDatabase:getMongoDatabase", args, LookupMongoDatabaseResultOutput{}, options).(LookupMongoDatabaseResultOutput), nil
		}).(LookupMongoDatabaseResultOutput)
}

// A collection of arguments for invoking getMongoDatabase.
type LookupMongoDatabaseOutputArgs struct {
	// The name of the Cosmos DB Account where the Mongo Database exists.
	AccountName pulumi.StringInput `pulumi:"accountName"`
	// The name of this Cosmos DB Mongo Database.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the Cosmos DB Mongo Database exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupMongoDatabaseOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMongoDatabaseArgs)(nil)).Elem()
}

// A collection of values returned by getMongoDatabase.
type LookupMongoDatabaseResultOutput struct{ *pulumi.OutputState }

func (LookupMongoDatabaseResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMongoDatabaseResult)(nil)).Elem()
}

func (o LookupMongoDatabaseResultOutput) ToLookupMongoDatabaseResultOutput() LookupMongoDatabaseResultOutput {
	return o
}

func (o LookupMongoDatabaseResultOutput) ToLookupMongoDatabaseResultOutputWithContext(ctx context.Context) LookupMongoDatabaseResultOutput {
	return o
}

func (o LookupMongoDatabaseResultOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMongoDatabaseResult) string { return v.AccountName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMongoDatabaseResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMongoDatabaseResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupMongoDatabaseResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMongoDatabaseResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupMongoDatabaseResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMongoDatabaseResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the Cosmos DB Mongo Database.
func (o LookupMongoDatabaseResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupMongoDatabaseResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMongoDatabaseResultOutput{})
}

// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mssql

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing SQL database.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/mssql"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleServer, err := mssql.NewServer(ctx, "example", &mssql.ServerArgs{
//				Name:                       pulumi.String("example"),
//				ResourceGroupName:          exampleResourceGroup.Name,
//				Location:                   exampleResourceGroup.Location,
//				Version:                    pulumi.String("12.0"),
//				AdministratorLogin:         pulumi.String("4dm1n157r470r"),
//				AdministratorLoginPassword: pulumi.String("4-v3ry-53cr37-p455w0rd"),
//			})
//			if err != nil {
//				return err
//			}
//			example := mssql.LookupDatabaseOutput(ctx, mssql.GetDatabaseOutputArgs{
//				Name:     pulumi.String("example-mssql-db"),
//				ServerId: exampleServer.ID(),
//			}, nil)
//			ctx.Export("databaseId", example.ApplyT(func(example mssql.GetDatabaseResult) (*string, error) {
//				return &example.Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This data source uses the following Azure API Providers:
//
// * `Microsoft.Sql`: 2023-08-01-preview
func LookupDatabase(ctx *pulumi.Context, args *LookupDatabaseArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDatabaseResult
	err := ctx.Invoke("azure:mssql/getDatabase:getDatabase", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabase.
type LookupDatabaseArgs struct {
	// The name of the MS SQL Database.
	Name string `pulumi:"name"`
	// The id of the MS SQL Server on which to read the database.
	ServerId string `pulumi:"serverId"`
}

// A collection of values returned by getDatabase.
type LookupDatabaseResult struct {
	// The collation of the database.
	Collation string `pulumi:"collation"`
	// The id of the elastic pool containing this database.
	ElasticPoolId string `pulumi:"elasticPoolId"`
	// The type of enclave being used by the database.
	EnclaveType string `pulumi:"enclaveType"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A `identity` block as defined below.
	Identities []GetDatabaseIdentity `pulumi:"identities"`
	// The license type to apply for this database.
	LicenseType string `pulumi:"licenseType"`
	// The max size of the database in gigabytes.
	MaxSizeGb int    `pulumi:"maxSizeGb"`
	Name      string `pulumi:"name"`
	// The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed.
	ReadReplicaCount int `pulumi:"readReplicaCount"`
	// If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica.
	ReadScale bool   `pulumi:"readScale"`
	ServerId  string `pulumi:"serverId"`
	// The name of the SKU of the database.
	SkuName string `pulumi:"skuName"`
	// The storage account type used to store backups for this database.
	StorageAccountType string `pulumi:"storageAccountType"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Whether or not Transparent Data Encryption is enabled.
	TransparentDataEncryptionEnabled bool `pulumi:"transparentDataEncryptionEnabled"`
	// Whether or not TDE automatically rotates the encryption Key to latest version.
	TransparentDataEncryptionKeyAutomaticRotationEnabled bool `pulumi:"transparentDataEncryptionKeyAutomaticRotationEnabled"`
	// The Key Vault key URI to be used as the `Customer Managed Key`(CMK/BYOK) for the `Transparent Data Encryption`(TDE) layer.
	TransparentDataEncryptionKeyVaultKeyId string `pulumi:"transparentDataEncryptionKeyVaultKeyId"`
	// Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
	ZoneRedundant bool `pulumi:"zoneRedundant"`
}

func LookupDatabaseOutput(ctx *pulumi.Context, args LookupDatabaseOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDatabaseResultOutput, error) {
			args := v.(LookupDatabaseArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:mssql/getDatabase:getDatabase", args, LookupDatabaseResultOutput{}, options).(LookupDatabaseResultOutput), nil
		}).(LookupDatabaseResultOutput)
}

// A collection of arguments for invoking getDatabase.
type LookupDatabaseOutputArgs struct {
	// The name of the MS SQL Database.
	Name pulumi.StringInput `pulumi:"name"`
	// The id of the MS SQL Server on which to read the database.
	ServerId pulumi.StringInput `pulumi:"serverId"`
}

func (LookupDatabaseOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseArgs)(nil)).Elem()
}

// A collection of values returned by getDatabase.
type LookupDatabaseResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseResult)(nil)).Elem()
}

func (o LookupDatabaseResultOutput) ToLookupDatabaseResultOutput() LookupDatabaseResultOutput {
	return o
}

func (o LookupDatabaseResultOutput) ToLookupDatabaseResultOutputWithContext(ctx context.Context) LookupDatabaseResultOutput {
	return o
}

// The collation of the database.
func (o LookupDatabaseResultOutput) Collation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.Collation }).(pulumi.StringOutput)
}

// The id of the elastic pool containing this database.
func (o LookupDatabaseResultOutput) ElasticPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.ElasticPoolId }).(pulumi.StringOutput)
}

// The type of enclave being used by the database.
func (o LookupDatabaseResultOutput) EnclaveType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.EnclaveType }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatabaseResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.Id }).(pulumi.StringOutput)
}

// A `identity` block as defined below.
func (o LookupDatabaseResultOutput) Identities() GetDatabaseIdentityArrayOutput {
	return o.ApplyT(func(v LookupDatabaseResult) []GetDatabaseIdentity { return v.Identities }).(GetDatabaseIdentityArrayOutput)
}

// The license type to apply for this database.
func (o LookupDatabaseResultOutput) LicenseType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.LicenseType }).(pulumi.StringOutput)
}

// The max size of the database in gigabytes.
func (o LookupDatabaseResultOutput) MaxSizeGb() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseResult) int { return v.MaxSizeGb }).(pulumi.IntOutput)
}

func (o LookupDatabaseResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.Name }).(pulumi.StringOutput)
}

// The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed.
func (o LookupDatabaseResultOutput) ReadReplicaCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseResult) int { return v.ReadReplicaCount }).(pulumi.IntOutput)
}

// If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica.
func (o LookupDatabaseResultOutput) ReadScale() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabaseResult) bool { return v.ReadScale }).(pulumi.BoolOutput)
}

func (o LookupDatabaseResultOutput) ServerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.ServerId }).(pulumi.StringOutput)
}

// The name of the SKU of the database.
func (o LookupDatabaseResultOutput) SkuName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.SkuName }).(pulumi.StringOutput)
}

// The storage account type used to store backups for this database.
func (o LookupDatabaseResultOutput) StorageAccountType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.StorageAccountType }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o LookupDatabaseResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDatabaseResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Whether or not Transparent Data Encryption is enabled.
func (o LookupDatabaseResultOutput) TransparentDataEncryptionEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabaseResult) bool { return v.TransparentDataEncryptionEnabled }).(pulumi.BoolOutput)
}

// Whether or not TDE automatically rotates the encryption Key to latest version.
func (o LookupDatabaseResultOutput) TransparentDataEncryptionKeyAutomaticRotationEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabaseResult) bool { return v.TransparentDataEncryptionKeyAutomaticRotationEnabled }).(pulumi.BoolOutput)
}

// The Key Vault key URI to be used as the `Customer Managed Key`(CMK/BYOK) for the `Transparent Data Encryption`(TDE) layer.
func (o LookupDatabaseResultOutput) TransparentDataEncryptionKeyVaultKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.TransparentDataEncryptionKeyVaultKeyId }).(pulumi.StringOutput)
}

// Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
func (o LookupDatabaseResultOutput) ZoneRedundant() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabaseResult) bool { return v.ZoneRedundant }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseResultOutput{})
}

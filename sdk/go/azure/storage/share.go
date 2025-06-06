// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a File Share within Azure Storage.
//
// > **Note:** The storage share supports two storage tiers: premium and standard. Standard file shares are created in general purpose (GPv1 or GPv2) storage accounts and premium file shares are created in FileStorage storage accounts. For further information, refer to the section "What storage tiers are supported in Azure Files?" of [documentation](https://docs.microsoft.com/azure/storage/files/storage-files-faq#general).
//
// > **Note:** Shared Key authentication will always be used for this resource, as AzureAD authentication is not supported by the Storage API for files.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("azuretest"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("azureteststorage"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = storage.NewShare(ctx, "example", &storage.ShareArgs{
//				Name:             pulumi.String("sharename"),
//				StorageAccountId: exampleAccount.ID(),
//				Quota:            pulumi.Int(50),
//				Acls: storage.ShareAclArray{
//					&storage.ShareAclArgs{
//						Id: pulumi.String("MTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTI"),
//						AccessPolicies: storage.ShareAclAccessPolicyArray{
//							&storage.ShareAclAccessPolicyArgs{
//								Permissions: pulumi.String("rwdl"),
//								Start:       pulumi.String("2019-07-02T09:38:21Z"),
//								Expiry:      pulumi.String("2019-07-02T10:38:21Z"),
//							},
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
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Storage`: 2023-05-01
//
// ## Import
//
// Storage Shares can be imported using the `id`, e.g.
//
// ```sh
// $ pulumi import azure:storage/share:Share exampleShare /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Storage/storageAccounts/myAccount/fileServices/default/shares/exampleShare
// ```
type Share struct {
	pulumi.CustomResourceState

	// The access tier of the File Share. Possible values are `Hot`, `Cool` and `TransactionOptimized`, `Premium`.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` requires `Premium` `accessTier`.
	AccessTier pulumi.StringOutput `pulumi:"accessTier"`
	// One or more `acl` blocks as defined below.
	Acls ShareAclArrayOutput `pulumi:"acls"`
	// The protocol used for the share. Possible values are `SMB` and `NFS`. The `SMB` indicates the share can be accessed by SMBv3.0, SMBv2.1 and REST. The `NFS` indicates the share can be accessed by NFSv4.1. Defaults to `SMB`. Changing this forces a new resource to be created.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` is required for the `NFS` protocol.
	EnabledProtocol pulumi.StringPtrOutput `pulumi:"enabledProtocol"`
	// A mapping of MetaData for this File Share.
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// The name of the share. Must be unique within the storage account where the share is located. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The maximum size of the share, in gigabytes.
	//
	// > **Note:** For Standard storage accounts, by default this must be `1` GB (or higher) and at most `5120` GB (`5` TB). This can be set to a value larger than `5120` GB if `largeFileShareEnabled` is set to `true` in the parent `storage.Account`.
	//
	// > **Note:** For Premium FileStorage storage accounts, this must be greater than `100` GB and at most `102400` GB (`100` TB).
	Quota pulumi.IntOutput `pulumi:"quota"`
	// The Resource Manager ID of this File Share.
	//
	// Deprecated: this property is deprecated and will be removed 5.0 and replaced by the `id` property.
	ResourceManagerId pulumi.StringOutput `pulumi:"resourceManagerId"`
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created.
	//
	// > **Note:** One of `storageAccountName` or `storageAccountId` must be specified. When specifying `storageAccountId` the resource will use the Resource Manager API, rather than the Data Plane API.
	StorageAccountId pulumi.StringPtrOutput `pulumi:"storageAccountId"`
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created. This property is deprecated in favour of `storageAccountId`.
	//
	// > **Note:** Migrating from the deprecated `storageAccountName` to `storageAccountId` is supported without recreation. Any other change to either property will result in the resource being recreated.
	//
	// Deprecated: This property has been deprecated and will be replaced by `storageAccountId` in version 5.0 of the provider.
	StorageAccountName pulumi.StringPtrOutput `pulumi:"storageAccountName"`
	// The URL of the File Share
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewShare registers a new resource with the given unique name, arguments, and options.
func NewShare(ctx *pulumi.Context,
	name string, args *ShareArgs, opts ...pulumi.ResourceOption) (*Share, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Quota == nil {
		return nil, errors.New("invalid value for required argument 'Quota'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Share
	err := ctx.RegisterResource("azure:storage/share:Share", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetShare gets an existing Share resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetShare(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ShareState, opts ...pulumi.ResourceOption) (*Share, error) {
	var resource Share
	err := ctx.ReadResource("azure:storage/share:Share", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Share resources.
type shareState struct {
	// The access tier of the File Share. Possible values are `Hot`, `Cool` and `TransactionOptimized`, `Premium`.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` requires `Premium` `accessTier`.
	AccessTier *string `pulumi:"accessTier"`
	// One or more `acl` blocks as defined below.
	Acls []ShareAcl `pulumi:"acls"`
	// The protocol used for the share. Possible values are `SMB` and `NFS`. The `SMB` indicates the share can be accessed by SMBv3.0, SMBv2.1 and REST. The `NFS` indicates the share can be accessed by NFSv4.1. Defaults to `SMB`. Changing this forces a new resource to be created.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` is required for the `NFS` protocol.
	EnabledProtocol *string `pulumi:"enabledProtocol"`
	// A mapping of MetaData for this File Share.
	Metadata map[string]string `pulumi:"metadata"`
	// The name of the share. Must be unique within the storage account where the share is located. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The maximum size of the share, in gigabytes.
	//
	// > **Note:** For Standard storage accounts, by default this must be `1` GB (or higher) and at most `5120` GB (`5` TB). This can be set to a value larger than `5120` GB if `largeFileShareEnabled` is set to `true` in the parent `storage.Account`.
	//
	// > **Note:** For Premium FileStorage storage accounts, this must be greater than `100` GB and at most `102400` GB (`100` TB).
	Quota *int `pulumi:"quota"`
	// The Resource Manager ID of this File Share.
	//
	// Deprecated: this property is deprecated and will be removed 5.0 and replaced by the `id` property.
	ResourceManagerId *string `pulumi:"resourceManagerId"`
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created.
	//
	// > **Note:** One of `storageAccountName` or `storageAccountId` must be specified. When specifying `storageAccountId` the resource will use the Resource Manager API, rather than the Data Plane API.
	StorageAccountId *string `pulumi:"storageAccountId"`
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created. This property is deprecated in favour of `storageAccountId`.
	//
	// > **Note:** Migrating from the deprecated `storageAccountName` to `storageAccountId` is supported without recreation. Any other change to either property will result in the resource being recreated.
	//
	// Deprecated: This property has been deprecated and will be replaced by `storageAccountId` in version 5.0 of the provider.
	StorageAccountName *string `pulumi:"storageAccountName"`
	// The URL of the File Share
	Url *string `pulumi:"url"`
}

type ShareState struct {
	// The access tier of the File Share. Possible values are `Hot`, `Cool` and `TransactionOptimized`, `Premium`.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` requires `Premium` `accessTier`.
	AccessTier pulumi.StringPtrInput
	// One or more `acl` blocks as defined below.
	Acls ShareAclArrayInput
	// The protocol used for the share. Possible values are `SMB` and `NFS`. The `SMB` indicates the share can be accessed by SMBv3.0, SMBv2.1 and REST. The `NFS` indicates the share can be accessed by NFSv4.1. Defaults to `SMB`. Changing this forces a new resource to be created.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` is required for the `NFS` protocol.
	EnabledProtocol pulumi.StringPtrInput
	// A mapping of MetaData for this File Share.
	Metadata pulumi.StringMapInput
	// The name of the share. Must be unique within the storage account where the share is located. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The maximum size of the share, in gigabytes.
	//
	// > **Note:** For Standard storage accounts, by default this must be `1` GB (or higher) and at most `5120` GB (`5` TB). This can be set to a value larger than `5120` GB if `largeFileShareEnabled` is set to `true` in the parent `storage.Account`.
	//
	// > **Note:** For Premium FileStorage storage accounts, this must be greater than `100` GB and at most `102400` GB (`100` TB).
	Quota pulumi.IntPtrInput
	// The Resource Manager ID of this File Share.
	//
	// Deprecated: this property is deprecated and will be removed 5.0 and replaced by the `id` property.
	ResourceManagerId pulumi.StringPtrInput
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created.
	//
	// > **Note:** One of `storageAccountName` or `storageAccountId` must be specified. When specifying `storageAccountId` the resource will use the Resource Manager API, rather than the Data Plane API.
	StorageAccountId pulumi.StringPtrInput
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created. This property is deprecated in favour of `storageAccountId`.
	//
	// > **Note:** Migrating from the deprecated `storageAccountName` to `storageAccountId` is supported without recreation. Any other change to either property will result in the resource being recreated.
	//
	// Deprecated: This property has been deprecated and will be replaced by `storageAccountId` in version 5.0 of the provider.
	StorageAccountName pulumi.StringPtrInput
	// The URL of the File Share
	Url pulumi.StringPtrInput
}

func (ShareState) ElementType() reflect.Type {
	return reflect.TypeOf((*shareState)(nil)).Elem()
}

type shareArgs struct {
	// The access tier of the File Share. Possible values are `Hot`, `Cool` and `TransactionOptimized`, `Premium`.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` requires `Premium` `accessTier`.
	AccessTier *string `pulumi:"accessTier"`
	// One or more `acl` blocks as defined below.
	Acls []ShareAcl `pulumi:"acls"`
	// The protocol used for the share. Possible values are `SMB` and `NFS`. The `SMB` indicates the share can be accessed by SMBv3.0, SMBv2.1 and REST. The `NFS` indicates the share can be accessed by NFSv4.1. Defaults to `SMB`. Changing this forces a new resource to be created.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` is required for the `NFS` protocol.
	EnabledProtocol *string `pulumi:"enabledProtocol"`
	// A mapping of MetaData for this File Share.
	Metadata map[string]string `pulumi:"metadata"`
	// The name of the share. Must be unique within the storage account where the share is located. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The maximum size of the share, in gigabytes.
	//
	// > **Note:** For Standard storage accounts, by default this must be `1` GB (or higher) and at most `5120` GB (`5` TB). This can be set to a value larger than `5120` GB if `largeFileShareEnabled` is set to `true` in the parent `storage.Account`.
	//
	// > **Note:** For Premium FileStorage storage accounts, this must be greater than `100` GB and at most `102400` GB (`100` TB).
	Quota int `pulumi:"quota"`
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created.
	//
	// > **Note:** One of `storageAccountName` or `storageAccountId` must be specified. When specifying `storageAccountId` the resource will use the Resource Manager API, rather than the Data Plane API.
	StorageAccountId *string `pulumi:"storageAccountId"`
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created. This property is deprecated in favour of `storageAccountId`.
	//
	// > **Note:** Migrating from the deprecated `storageAccountName` to `storageAccountId` is supported without recreation. Any other change to either property will result in the resource being recreated.
	//
	// Deprecated: This property has been deprecated and will be replaced by `storageAccountId` in version 5.0 of the provider.
	StorageAccountName *string `pulumi:"storageAccountName"`
}

// The set of arguments for constructing a Share resource.
type ShareArgs struct {
	// The access tier of the File Share. Possible values are `Hot`, `Cool` and `TransactionOptimized`, `Premium`.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` requires `Premium` `accessTier`.
	AccessTier pulumi.StringPtrInput
	// One or more `acl` blocks as defined below.
	Acls ShareAclArrayInput
	// The protocol used for the share. Possible values are `SMB` and `NFS`. The `SMB` indicates the share can be accessed by SMBv3.0, SMBv2.1 and REST. The `NFS` indicates the share can be accessed by NFSv4.1. Defaults to `SMB`. Changing this forces a new resource to be created.
	//
	// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` is required for the `NFS` protocol.
	EnabledProtocol pulumi.StringPtrInput
	// A mapping of MetaData for this File Share.
	Metadata pulumi.StringMapInput
	// The name of the share. Must be unique within the storage account where the share is located. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The maximum size of the share, in gigabytes.
	//
	// > **Note:** For Standard storage accounts, by default this must be `1` GB (or higher) and at most `5120` GB (`5` TB). This can be set to a value larger than `5120` GB if `largeFileShareEnabled` is set to `true` in the parent `storage.Account`.
	//
	// > **Note:** For Premium FileStorage storage accounts, this must be greater than `100` GB and at most `102400` GB (`100` TB).
	Quota pulumi.IntInput
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created.
	//
	// > **Note:** One of `storageAccountName` or `storageAccountId` must be specified. When specifying `storageAccountId` the resource will use the Resource Manager API, rather than the Data Plane API.
	StorageAccountId pulumi.StringPtrInput
	// Specifies the storage account in which to create the share. Changing this forces a new resource to be created. This property is deprecated in favour of `storageAccountId`.
	//
	// > **Note:** Migrating from the deprecated `storageAccountName` to `storageAccountId` is supported without recreation. Any other change to either property will result in the resource being recreated.
	//
	// Deprecated: This property has been deprecated and will be replaced by `storageAccountId` in version 5.0 of the provider.
	StorageAccountName pulumi.StringPtrInput
}

func (ShareArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*shareArgs)(nil)).Elem()
}

type ShareInput interface {
	pulumi.Input

	ToShareOutput() ShareOutput
	ToShareOutputWithContext(ctx context.Context) ShareOutput
}

func (*Share) ElementType() reflect.Type {
	return reflect.TypeOf((**Share)(nil)).Elem()
}

func (i *Share) ToShareOutput() ShareOutput {
	return i.ToShareOutputWithContext(context.Background())
}

func (i *Share) ToShareOutputWithContext(ctx context.Context) ShareOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareOutput)
}

// ShareArrayInput is an input type that accepts ShareArray and ShareArrayOutput values.
// You can construct a concrete instance of `ShareArrayInput` via:
//
//	ShareArray{ ShareArgs{...} }
type ShareArrayInput interface {
	pulumi.Input

	ToShareArrayOutput() ShareArrayOutput
	ToShareArrayOutputWithContext(context.Context) ShareArrayOutput
}

type ShareArray []ShareInput

func (ShareArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Share)(nil)).Elem()
}

func (i ShareArray) ToShareArrayOutput() ShareArrayOutput {
	return i.ToShareArrayOutputWithContext(context.Background())
}

func (i ShareArray) ToShareArrayOutputWithContext(ctx context.Context) ShareArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareArrayOutput)
}

// ShareMapInput is an input type that accepts ShareMap and ShareMapOutput values.
// You can construct a concrete instance of `ShareMapInput` via:
//
//	ShareMap{ "key": ShareArgs{...} }
type ShareMapInput interface {
	pulumi.Input

	ToShareMapOutput() ShareMapOutput
	ToShareMapOutputWithContext(context.Context) ShareMapOutput
}

type ShareMap map[string]ShareInput

func (ShareMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Share)(nil)).Elem()
}

func (i ShareMap) ToShareMapOutput() ShareMapOutput {
	return i.ToShareMapOutputWithContext(context.Background())
}

func (i ShareMap) ToShareMapOutputWithContext(ctx context.Context) ShareMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ShareMapOutput)
}

type ShareOutput struct{ *pulumi.OutputState }

func (ShareOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Share)(nil)).Elem()
}

func (o ShareOutput) ToShareOutput() ShareOutput {
	return o
}

func (o ShareOutput) ToShareOutputWithContext(ctx context.Context) ShareOutput {
	return o
}

// The access tier of the File Share. Possible values are `Hot`, `Cool` and `TransactionOptimized`, `Premium`.
//
// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` requires `Premium` `accessTier`.
func (o ShareOutput) AccessTier() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.AccessTier }).(pulumi.StringOutput)
}

// One or more `acl` blocks as defined below.
func (o ShareOutput) Acls() ShareAclArrayOutput {
	return o.ApplyT(func(v *Share) ShareAclArrayOutput { return v.Acls }).(ShareAclArrayOutput)
}

// The protocol used for the share. Possible values are `SMB` and `NFS`. The `SMB` indicates the share can be accessed by SMBv3.0, SMBv2.1 and REST. The `NFS` indicates the share can be accessed by NFSv4.1. Defaults to `SMB`. Changing this forces a new resource to be created.
//
// > **Note:** The `FileStorage` `accountKind` of the `storage.Account` is required for the `NFS` protocol.
func (o ShareOutput) EnabledProtocol() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Share) pulumi.StringPtrOutput { return v.EnabledProtocol }).(pulumi.StringPtrOutput)
}

// A mapping of MetaData for this File Share.
func (o ShareOutput) Metadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Share) pulumi.StringMapOutput { return v.Metadata }).(pulumi.StringMapOutput)
}

// The name of the share. Must be unique within the storage account where the share is located. Changing this forces a new resource to be created.
func (o ShareOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The maximum size of the share, in gigabytes.
//
// > **Note:** For Standard storage accounts, by default this must be `1` GB (or higher) and at most `5120` GB (`5` TB). This can be set to a value larger than `5120` GB if `largeFileShareEnabled` is set to `true` in the parent `storage.Account`.
//
// > **Note:** For Premium FileStorage storage accounts, this must be greater than `100` GB and at most `102400` GB (`100` TB).
func (o ShareOutput) Quota() pulumi.IntOutput {
	return o.ApplyT(func(v *Share) pulumi.IntOutput { return v.Quota }).(pulumi.IntOutput)
}

// The Resource Manager ID of this File Share.
//
// Deprecated: this property is deprecated and will be removed 5.0 and replaced by the `id` property.
func (o ShareOutput) ResourceManagerId() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.ResourceManagerId }).(pulumi.StringOutput)
}

// Specifies the storage account in which to create the share. Changing this forces a new resource to be created.
//
// > **Note:** One of `storageAccountName` or `storageAccountId` must be specified. When specifying `storageAccountId` the resource will use the Resource Manager API, rather than the Data Plane API.
func (o ShareOutput) StorageAccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Share) pulumi.StringPtrOutput { return v.StorageAccountId }).(pulumi.StringPtrOutput)
}

// Specifies the storage account in which to create the share. Changing this forces a new resource to be created. This property is deprecated in favour of `storageAccountId`.
//
// > **Note:** Migrating from the deprecated `storageAccountName` to `storageAccountId` is supported without recreation. Any other change to either property will result in the resource being recreated.
//
// Deprecated: This property has been deprecated and will be replaced by `storageAccountId` in version 5.0 of the provider.
func (o ShareOutput) StorageAccountName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Share) pulumi.StringPtrOutput { return v.StorageAccountName }).(pulumi.StringPtrOutput)
}

// The URL of the File Share
func (o ShareOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Share) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type ShareArrayOutput struct{ *pulumi.OutputState }

func (ShareArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Share)(nil)).Elem()
}

func (o ShareArrayOutput) ToShareArrayOutput() ShareArrayOutput {
	return o
}

func (o ShareArrayOutput) ToShareArrayOutputWithContext(ctx context.Context) ShareArrayOutput {
	return o
}

func (o ShareArrayOutput) Index(i pulumi.IntInput) ShareOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Share {
		return vs[0].([]*Share)[vs[1].(int)]
	}).(ShareOutput)
}

type ShareMapOutput struct{ *pulumi.OutputState }

func (ShareMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Share)(nil)).Elem()
}

func (o ShareMapOutput) ToShareMapOutput() ShareMapOutput {
	return o
}

func (o ShareMapOutput) ToShareMapOutputWithContext(ctx context.Context) ShareMapOutput {
	return o
}

func (o ShareMapOutput) MapIndex(k pulumi.StringInput) ShareOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Share {
		return vs[0].(map[string]*Share)[vs[1].(string)]
	}).(ShareOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ShareInput)(nil)).Elem(), &Share{})
	pulumi.RegisterInputType(reflect.TypeOf((*ShareArrayInput)(nil)).Elem(), ShareArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ShareMapInput)(nil)).Elem(), ShareMap{})
	pulumi.RegisterOutputType(ShareOutput{})
	pulumi.RegisterOutputType(ShareArrayOutput{})
	pulumi.RegisterOutputType(ShareMapOutput{})
}

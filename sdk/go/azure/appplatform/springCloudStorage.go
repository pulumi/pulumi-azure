// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appplatform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Spring Cloud Storage.
//
// !> **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `appplatform.SpringCloudStorage` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appplatform"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
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
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("example"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("GRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSpringCloudService, err := appplatform.NewSpringCloudService(ctx, "example", &appplatform.SpringCloudServiceArgs{
//				Name:              pulumi.String("example"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appplatform.NewSpringCloudStorage(ctx, "example", &appplatform.SpringCloudStorageArgs{
//				Name:                 pulumi.String("example"),
//				SpringCloudServiceId: exampleSpringCloudService.ID(),
//				StorageAccountName:   exampleAccount.Name,
//				StorageAccountKey:    exampleAccount.PrimaryAccessKey,
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
// Spring Cloud Storages can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:appplatform/springCloudStorage:SpringCloudStorage example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resourceGroup1/providers/Microsoft.AppPlatform/spring/service1/storages/storage1
// ```
type SpringCloudStorage struct {
	pulumi.CustomResourceState

	// The name which should be used for this Spring Cloud Storage. Changing this forces a new Spring Cloud Storage to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Spring Cloud Service where the Spring Cloud Storage should exist. Changing this forces a new Spring Cloud Storage to be created.
	SpringCloudServiceId pulumi.StringOutput `pulumi:"springCloudServiceId"`
	// The access key of the Azure Storage Account.
	StorageAccountKey pulumi.StringOutput `pulumi:"storageAccountKey"`
	// The account name of the Azure Storage Account.
	StorageAccountName pulumi.StringOutput `pulumi:"storageAccountName"`
}

// NewSpringCloudStorage registers a new resource with the given unique name, arguments, and options.
func NewSpringCloudStorage(ctx *pulumi.Context,
	name string, args *SpringCloudStorageArgs, opts ...pulumi.ResourceOption) (*SpringCloudStorage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SpringCloudServiceId == nil {
		return nil, errors.New("invalid value for required argument 'SpringCloudServiceId'")
	}
	if args.StorageAccountKey == nil {
		return nil, errors.New("invalid value for required argument 'StorageAccountKey'")
	}
	if args.StorageAccountName == nil {
		return nil, errors.New("invalid value for required argument 'StorageAccountName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SpringCloudStorage
	err := ctx.RegisterResource("azure:appplatform/springCloudStorage:SpringCloudStorage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpringCloudStorage gets an existing SpringCloudStorage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpringCloudStorage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpringCloudStorageState, opts ...pulumi.ResourceOption) (*SpringCloudStorage, error) {
	var resource SpringCloudStorage
	err := ctx.ReadResource("azure:appplatform/springCloudStorage:SpringCloudStorage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpringCloudStorage resources.
type springCloudStorageState struct {
	// The name which should be used for this Spring Cloud Storage. Changing this forces a new Spring Cloud Storage to be created.
	Name *string `pulumi:"name"`
	// The ID of the Spring Cloud Service where the Spring Cloud Storage should exist. Changing this forces a new Spring Cloud Storage to be created.
	SpringCloudServiceId *string `pulumi:"springCloudServiceId"`
	// The access key of the Azure Storage Account.
	StorageAccountKey *string `pulumi:"storageAccountKey"`
	// The account name of the Azure Storage Account.
	StorageAccountName *string `pulumi:"storageAccountName"`
}

type SpringCloudStorageState struct {
	// The name which should be used for this Spring Cloud Storage. Changing this forces a new Spring Cloud Storage to be created.
	Name pulumi.StringPtrInput
	// The ID of the Spring Cloud Service where the Spring Cloud Storage should exist. Changing this forces a new Spring Cloud Storage to be created.
	SpringCloudServiceId pulumi.StringPtrInput
	// The access key of the Azure Storage Account.
	StorageAccountKey pulumi.StringPtrInput
	// The account name of the Azure Storage Account.
	StorageAccountName pulumi.StringPtrInput
}

func (SpringCloudStorageState) ElementType() reflect.Type {
	return reflect.TypeOf((*springCloudStorageState)(nil)).Elem()
}

type springCloudStorageArgs struct {
	// The name which should be used for this Spring Cloud Storage. Changing this forces a new Spring Cloud Storage to be created.
	Name *string `pulumi:"name"`
	// The ID of the Spring Cloud Service where the Spring Cloud Storage should exist. Changing this forces a new Spring Cloud Storage to be created.
	SpringCloudServiceId string `pulumi:"springCloudServiceId"`
	// The access key of the Azure Storage Account.
	StorageAccountKey string `pulumi:"storageAccountKey"`
	// The account name of the Azure Storage Account.
	StorageAccountName string `pulumi:"storageAccountName"`
}

// The set of arguments for constructing a SpringCloudStorage resource.
type SpringCloudStorageArgs struct {
	// The name which should be used for this Spring Cloud Storage. Changing this forces a new Spring Cloud Storage to be created.
	Name pulumi.StringPtrInput
	// The ID of the Spring Cloud Service where the Spring Cloud Storage should exist. Changing this forces a new Spring Cloud Storage to be created.
	SpringCloudServiceId pulumi.StringInput
	// The access key of the Azure Storage Account.
	StorageAccountKey pulumi.StringInput
	// The account name of the Azure Storage Account.
	StorageAccountName pulumi.StringInput
}

func (SpringCloudStorageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*springCloudStorageArgs)(nil)).Elem()
}

type SpringCloudStorageInput interface {
	pulumi.Input

	ToSpringCloudStorageOutput() SpringCloudStorageOutput
	ToSpringCloudStorageOutputWithContext(ctx context.Context) SpringCloudStorageOutput
}

func (*SpringCloudStorage) ElementType() reflect.Type {
	return reflect.TypeOf((**SpringCloudStorage)(nil)).Elem()
}

func (i *SpringCloudStorage) ToSpringCloudStorageOutput() SpringCloudStorageOutput {
	return i.ToSpringCloudStorageOutputWithContext(context.Background())
}

func (i *SpringCloudStorage) ToSpringCloudStorageOutputWithContext(ctx context.Context) SpringCloudStorageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpringCloudStorageOutput)
}

// SpringCloudStorageArrayInput is an input type that accepts SpringCloudStorageArray and SpringCloudStorageArrayOutput values.
// You can construct a concrete instance of `SpringCloudStorageArrayInput` via:
//
//	SpringCloudStorageArray{ SpringCloudStorageArgs{...} }
type SpringCloudStorageArrayInput interface {
	pulumi.Input

	ToSpringCloudStorageArrayOutput() SpringCloudStorageArrayOutput
	ToSpringCloudStorageArrayOutputWithContext(context.Context) SpringCloudStorageArrayOutput
}

type SpringCloudStorageArray []SpringCloudStorageInput

func (SpringCloudStorageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpringCloudStorage)(nil)).Elem()
}

func (i SpringCloudStorageArray) ToSpringCloudStorageArrayOutput() SpringCloudStorageArrayOutput {
	return i.ToSpringCloudStorageArrayOutputWithContext(context.Background())
}

func (i SpringCloudStorageArray) ToSpringCloudStorageArrayOutputWithContext(ctx context.Context) SpringCloudStorageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpringCloudStorageArrayOutput)
}

// SpringCloudStorageMapInput is an input type that accepts SpringCloudStorageMap and SpringCloudStorageMapOutput values.
// You can construct a concrete instance of `SpringCloudStorageMapInput` via:
//
//	SpringCloudStorageMap{ "key": SpringCloudStorageArgs{...} }
type SpringCloudStorageMapInput interface {
	pulumi.Input

	ToSpringCloudStorageMapOutput() SpringCloudStorageMapOutput
	ToSpringCloudStorageMapOutputWithContext(context.Context) SpringCloudStorageMapOutput
}

type SpringCloudStorageMap map[string]SpringCloudStorageInput

func (SpringCloudStorageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpringCloudStorage)(nil)).Elem()
}

func (i SpringCloudStorageMap) ToSpringCloudStorageMapOutput() SpringCloudStorageMapOutput {
	return i.ToSpringCloudStorageMapOutputWithContext(context.Background())
}

func (i SpringCloudStorageMap) ToSpringCloudStorageMapOutputWithContext(ctx context.Context) SpringCloudStorageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpringCloudStorageMapOutput)
}

type SpringCloudStorageOutput struct{ *pulumi.OutputState }

func (SpringCloudStorageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpringCloudStorage)(nil)).Elem()
}

func (o SpringCloudStorageOutput) ToSpringCloudStorageOutput() SpringCloudStorageOutput {
	return o
}

func (o SpringCloudStorageOutput) ToSpringCloudStorageOutputWithContext(ctx context.Context) SpringCloudStorageOutput {
	return o
}

// The name which should be used for this Spring Cloud Storage. Changing this forces a new Spring Cloud Storage to be created.
func (o SpringCloudStorageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudStorage) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the Spring Cloud Service where the Spring Cloud Storage should exist. Changing this forces a new Spring Cloud Storage to be created.
func (o SpringCloudStorageOutput) SpringCloudServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudStorage) pulumi.StringOutput { return v.SpringCloudServiceId }).(pulumi.StringOutput)
}

// The access key of the Azure Storage Account.
func (o SpringCloudStorageOutput) StorageAccountKey() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudStorage) pulumi.StringOutput { return v.StorageAccountKey }).(pulumi.StringOutput)
}

// The account name of the Azure Storage Account.
func (o SpringCloudStorageOutput) StorageAccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *SpringCloudStorage) pulumi.StringOutput { return v.StorageAccountName }).(pulumi.StringOutput)
}

type SpringCloudStorageArrayOutput struct{ *pulumi.OutputState }

func (SpringCloudStorageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpringCloudStorage)(nil)).Elem()
}

func (o SpringCloudStorageArrayOutput) ToSpringCloudStorageArrayOutput() SpringCloudStorageArrayOutput {
	return o
}

func (o SpringCloudStorageArrayOutput) ToSpringCloudStorageArrayOutputWithContext(ctx context.Context) SpringCloudStorageArrayOutput {
	return o
}

func (o SpringCloudStorageArrayOutput) Index(i pulumi.IntInput) SpringCloudStorageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpringCloudStorage {
		return vs[0].([]*SpringCloudStorage)[vs[1].(int)]
	}).(SpringCloudStorageOutput)
}

type SpringCloudStorageMapOutput struct{ *pulumi.OutputState }

func (SpringCloudStorageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpringCloudStorage)(nil)).Elem()
}

func (o SpringCloudStorageMapOutput) ToSpringCloudStorageMapOutput() SpringCloudStorageMapOutput {
	return o
}

func (o SpringCloudStorageMapOutput) ToSpringCloudStorageMapOutputWithContext(ctx context.Context) SpringCloudStorageMapOutput {
	return o
}

func (o SpringCloudStorageMapOutput) MapIndex(k pulumi.StringInput) SpringCloudStorageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpringCloudStorage {
		return vs[0].(map[string]*SpringCloudStorage)[vs[1].(string)]
	}).(SpringCloudStorageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpringCloudStorageInput)(nil)).Elem(), &SpringCloudStorage{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpringCloudStorageArrayInput)(nil)).Elem(), SpringCloudStorageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpringCloudStorageMapInput)(nil)).Elem(), SpringCloudStorageMap{})
	pulumi.RegisterOutputType(SpringCloudStorageOutput{})
	pulumi.RegisterOutputType(SpringCloudStorageArrayOutput{})
	pulumi.RegisterOutputType(SpringCloudStorageMapOutput{})
}

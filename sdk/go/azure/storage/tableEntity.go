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

// Manages an Entity within a Table in an Azure Storage Account.
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
//				Name:     pulumi.String("azureexample"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("azureexamplestorage1"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTable, err := storage.NewTable(ctx, "example", &storage.TableArgs{
//				Name:               pulumi.String("myexampletable"),
//				StorageAccountName: exampleAccount.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = storage.NewTableEntity(ctx, "example", &storage.TableEntityArgs{
//				StorageTableId: exampleTable.ID(),
//				PartitionKey:   pulumi.String("examplepartition"),
//				RowKey:         pulumi.String("examplerow"),
//				Entity: pulumi.StringMap{
//					"example": pulumi.String("example"),
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
// Entities within a Table in an Azure Storage Account can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:storage/tableEntity:TableEntity entity1 https://example.table.core.windows.net/table1(PartitionKey='samplepartition',RowKey='samplerow')
// ```
type TableEntity struct {
	pulumi.CustomResourceState

	// A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
	Entity pulumi.StringMapOutput `pulumi:"entity"`
	// The key for the partition where the entity will be inserted/merged. Changing this forces a new resource to be created.
	PartitionKey pulumi.StringOutput `pulumi:"partitionKey"`
	// The key for the row where the entity will be inserted/merged. Changing this forces a new resource to be created.
	RowKey pulumi.StringOutput `pulumi:"rowKey"`
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageTableId pulumi.StringOutput `pulumi:"storageTableId"`
}

// NewTableEntity registers a new resource with the given unique name, arguments, and options.
func NewTableEntity(ctx *pulumi.Context,
	name string, args *TableEntityArgs, opts ...pulumi.ResourceOption) (*TableEntity, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Entity == nil {
		return nil, errors.New("invalid value for required argument 'Entity'")
	}
	if args.PartitionKey == nil {
		return nil, errors.New("invalid value for required argument 'PartitionKey'")
	}
	if args.RowKey == nil {
		return nil, errors.New("invalid value for required argument 'RowKey'")
	}
	if args.StorageTableId == nil {
		return nil, errors.New("invalid value for required argument 'StorageTableId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TableEntity
	err := ctx.RegisterResource("azure:storage/tableEntity:TableEntity", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTableEntity gets an existing TableEntity resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTableEntity(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableEntityState, opts ...pulumi.ResourceOption) (*TableEntity, error) {
	var resource TableEntity
	err := ctx.ReadResource("azure:storage/tableEntity:TableEntity", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TableEntity resources.
type tableEntityState struct {
	// A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
	Entity map[string]string `pulumi:"entity"`
	// The key for the partition where the entity will be inserted/merged. Changing this forces a new resource to be created.
	PartitionKey *string `pulumi:"partitionKey"`
	// The key for the row where the entity will be inserted/merged. Changing this forces a new resource to be created.
	RowKey *string `pulumi:"rowKey"`
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageTableId *string `pulumi:"storageTableId"`
}

type TableEntityState struct {
	// A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
	Entity pulumi.StringMapInput
	// The key for the partition where the entity will be inserted/merged. Changing this forces a new resource to be created.
	PartitionKey pulumi.StringPtrInput
	// The key for the row where the entity will be inserted/merged. Changing this forces a new resource to be created.
	RowKey pulumi.StringPtrInput
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageTableId pulumi.StringPtrInput
}

func (TableEntityState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableEntityState)(nil)).Elem()
}

type tableEntityArgs struct {
	// A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
	Entity map[string]string `pulumi:"entity"`
	// The key for the partition where the entity will be inserted/merged. Changing this forces a new resource to be created.
	PartitionKey string `pulumi:"partitionKey"`
	// The key for the row where the entity will be inserted/merged. Changing this forces a new resource to be created.
	RowKey string `pulumi:"rowKey"`
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageTableId string `pulumi:"storageTableId"`
}

// The set of arguments for constructing a TableEntity resource.
type TableEntityArgs struct {
	// A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
	Entity pulumi.StringMapInput
	// The key for the partition where the entity will be inserted/merged. Changing this forces a new resource to be created.
	PartitionKey pulumi.StringInput
	// The key for the row where the entity will be inserted/merged. Changing this forces a new resource to be created.
	RowKey pulumi.StringInput
	// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
	StorageTableId pulumi.StringInput
}

func (TableEntityArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableEntityArgs)(nil)).Elem()
}

type TableEntityInput interface {
	pulumi.Input

	ToTableEntityOutput() TableEntityOutput
	ToTableEntityOutputWithContext(ctx context.Context) TableEntityOutput
}

func (*TableEntity) ElementType() reflect.Type {
	return reflect.TypeOf((**TableEntity)(nil)).Elem()
}

func (i *TableEntity) ToTableEntityOutput() TableEntityOutput {
	return i.ToTableEntityOutputWithContext(context.Background())
}

func (i *TableEntity) ToTableEntityOutputWithContext(ctx context.Context) TableEntityOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableEntityOutput)
}

// TableEntityArrayInput is an input type that accepts TableEntityArray and TableEntityArrayOutput values.
// You can construct a concrete instance of `TableEntityArrayInput` via:
//
//	TableEntityArray{ TableEntityArgs{...} }
type TableEntityArrayInput interface {
	pulumi.Input

	ToTableEntityArrayOutput() TableEntityArrayOutput
	ToTableEntityArrayOutputWithContext(context.Context) TableEntityArrayOutput
}

type TableEntityArray []TableEntityInput

func (TableEntityArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableEntity)(nil)).Elem()
}

func (i TableEntityArray) ToTableEntityArrayOutput() TableEntityArrayOutput {
	return i.ToTableEntityArrayOutputWithContext(context.Background())
}

func (i TableEntityArray) ToTableEntityArrayOutputWithContext(ctx context.Context) TableEntityArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableEntityArrayOutput)
}

// TableEntityMapInput is an input type that accepts TableEntityMap and TableEntityMapOutput values.
// You can construct a concrete instance of `TableEntityMapInput` via:
//
//	TableEntityMap{ "key": TableEntityArgs{...} }
type TableEntityMapInput interface {
	pulumi.Input

	ToTableEntityMapOutput() TableEntityMapOutput
	ToTableEntityMapOutputWithContext(context.Context) TableEntityMapOutput
}

type TableEntityMap map[string]TableEntityInput

func (TableEntityMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableEntity)(nil)).Elem()
}

func (i TableEntityMap) ToTableEntityMapOutput() TableEntityMapOutput {
	return i.ToTableEntityMapOutputWithContext(context.Background())
}

func (i TableEntityMap) ToTableEntityMapOutputWithContext(ctx context.Context) TableEntityMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableEntityMapOutput)
}

type TableEntityOutput struct{ *pulumi.OutputState }

func (TableEntityOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TableEntity)(nil)).Elem()
}

func (o TableEntityOutput) ToTableEntityOutput() TableEntityOutput {
	return o
}

func (o TableEntityOutput) ToTableEntityOutputWithContext(ctx context.Context) TableEntityOutput {
	return o
}

// A map of key/value pairs that describe the entity to be inserted/merged in to the storage table.
func (o TableEntityOutput) Entity() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TableEntity) pulumi.StringMapOutput { return v.Entity }).(pulumi.StringMapOutput)
}

// The key for the partition where the entity will be inserted/merged. Changing this forces a new resource to be created.
func (o TableEntityOutput) PartitionKey() pulumi.StringOutput {
	return o.ApplyT(func(v *TableEntity) pulumi.StringOutput { return v.PartitionKey }).(pulumi.StringOutput)
}

// The key for the row where the entity will be inserted/merged. Changing this forces a new resource to be created.
func (o TableEntityOutput) RowKey() pulumi.StringOutput {
	return o.ApplyT(func(v *TableEntity) pulumi.StringOutput { return v.RowKey }).(pulumi.StringOutput)
}

// The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
func (o TableEntityOutput) StorageTableId() pulumi.StringOutput {
	return o.ApplyT(func(v *TableEntity) pulumi.StringOutput { return v.StorageTableId }).(pulumi.StringOutput)
}

type TableEntityArrayOutput struct{ *pulumi.OutputState }

func (TableEntityArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TableEntity)(nil)).Elem()
}

func (o TableEntityArrayOutput) ToTableEntityArrayOutput() TableEntityArrayOutput {
	return o
}

func (o TableEntityArrayOutput) ToTableEntityArrayOutputWithContext(ctx context.Context) TableEntityArrayOutput {
	return o
}

func (o TableEntityArrayOutput) Index(i pulumi.IntInput) TableEntityOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TableEntity {
		return vs[0].([]*TableEntity)[vs[1].(int)]
	}).(TableEntityOutput)
}

type TableEntityMapOutput struct{ *pulumi.OutputState }

func (TableEntityMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TableEntity)(nil)).Elem()
}

func (o TableEntityMapOutput) ToTableEntityMapOutput() TableEntityMapOutput {
	return o
}

func (o TableEntityMapOutput) ToTableEntityMapOutputWithContext(ctx context.Context) TableEntityMapOutput {
	return o
}

func (o TableEntityMapOutput) MapIndex(k pulumi.StringInput) TableEntityOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TableEntity {
		return vs[0].(map[string]*TableEntity)[vs[1].(string)]
	}).(TableEntityOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableEntityInput)(nil)).Elem(), &TableEntity{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableEntityArrayInput)(nil)).Elem(), TableEntityArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableEntityMapInput)(nil)).Elem(), TableEntityMap{})
	pulumi.RegisterOutputType(TableEntityOutput{})
	pulumi.RegisterOutputType(TableEntityArrayOutput{})
	pulumi.RegisterOutputType(TableEntityMapOutput{})
}

// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatedns

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Enables you to manage DNS SRV Records within Azure Private DNS.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/privatedns"
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
//			exampleZone, err := privatedns.NewZone(ctx, "example", &privatedns.ZoneArgs{
//				Name:              pulumi.String("contoso.com"),
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = privatedns.NewSRVRecord(ctx, "example", &privatedns.SRVRecordArgs{
//				Name:              pulumi.String("test"),
//				ResourceGroupName: example.Name,
//				ZoneName:          exampleZone.Name,
//				Ttl:               pulumi.Int(300),
//				Records: privatedns.SRVRecordRecordArray{
//					&privatedns.SRVRecordRecordArgs{
//						Priority: pulumi.Int(1),
//						Weight:   pulumi.Int(5),
//						Port:     pulumi.Int(8080),
//						Target:   pulumi.String("target1.contoso.com"),
//					},
//					&privatedns.SRVRecordRecordArgs{
//						Priority: pulumi.Int(10),
//						Weight:   pulumi.Int(10),
//						Port:     pulumi.Int(8080),
//						Target:   pulumi.String("target2.contoso.com"),
//					},
//				},
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("Production"),
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
// * `Microsoft.Network`: 2024-06-01
//
// ## Import
//
// Private DNS SRV Records can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:privatedns/sRVRecord:SRVRecord test /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/privateDnsZones/contoso.com/SRV/test
// ```
type SRVRecord struct {
	pulumi.CustomResourceState

	// The FQDN of the DNS SRV Record.
	Fqdn pulumi.StringOutput `pulumi:"fqdn"`
	// The name of the DNS SRV Record. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// One or more `record` blocks as defined below.
	Records SRVRecordRecordArrayOutput `pulumi:"records"`
	// Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
	// Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName pulumi.StringOutput `pulumi:"zoneName"`
}

// NewSRVRecord registers a new resource with the given unique name, arguments, and options.
func NewSRVRecord(ctx *pulumi.Context,
	name string, args *SRVRecordArgs, opts ...pulumi.ResourceOption) (*SRVRecord, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Records == nil {
		return nil, errors.New("invalid value for required argument 'Records'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Ttl == nil {
		return nil, errors.New("invalid value for required argument 'Ttl'")
	}
	if args.ZoneName == nil {
		return nil, errors.New("invalid value for required argument 'ZoneName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SRVRecord
	err := ctx.RegisterResource("azure:privatedns/sRVRecord:SRVRecord", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSRVRecord gets an existing SRVRecord resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSRVRecord(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SRVRecordState, opts ...pulumi.ResourceOption) (*SRVRecord, error) {
	var resource SRVRecord
	err := ctx.ReadResource("azure:privatedns/sRVRecord:SRVRecord", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SRVRecord resources.
type srvrecordState struct {
	// The FQDN of the DNS SRV Record.
	Fqdn *string `pulumi:"fqdn"`
	// The name of the DNS SRV Record. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// One or more `record` blocks as defined below.
	Records []SRVRecordRecord `pulumi:"records"`
	// Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl *int `pulumi:"ttl"`
	// Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName *string `pulumi:"zoneName"`
}

type SRVRecordState struct {
	// The FQDN of the DNS SRV Record.
	Fqdn pulumi.StringPtrInput
	// The name of the DNS SRV Record. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// One or more `record` blocks as defined below.
	Records SRVRecordRecordArrayInput
	// Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl pulumi.IntPtrInput
	// Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName pulumi.StringPtrInput
}

func (SRVRecordState) ElementType() reflect.Type {
	return reflect.TypeOf((*srvrecordState)(nil)).Elem()
}

type srvrecordArgs struct {
	// The name of the DNS SRV Record. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// One or more `record` blocks as defined below.
	Records []SRVRecordRecord `pulumi:"records"`
	// Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl int `pulumi:"ttl"`
	// Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName string `pulumi:"zoneName"`
}

// The set of arguments for constructing a SRVRecord resource.
type SRVRecordArgs struct {
	// The name of the DNS SRV Record. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// One or more `record` blocks as defined below.
	Records SRVRecordRecordArrayInput
	// Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl pulumi.IntInput
	// Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName pulumi.StringInput
}

func (SRVRecordArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*srvrecordArgs)(nil)).Elem()
}

type SRVRecordInput interface {
	pulumi.Input

	ToSRVRecordOutput() SRVRecordOutput
	ToSRVRecordOutputWithContext(ctx context.Context) SRVRecordOutput
}

func (*SRVRecord) ElementType() reflect.Type {
	return reflect.TypeOf((**SRVRecord)(nil)).Elem()
}

func (i *SRVRecord) ToSRVRecordOutput() SRVRecordOutput {
	return i.ToSRVRecordOutputWithContext(context.Background())
}

func (i *SRVRecord) ToSRVRecordOutputWithContext(ctx context.Context) SRVRecordOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SRVRecordOutput)
}

// SRVRecordArrayInput is an input type that accepts SRVRecordArray and SRVRecordArrayOutput values.
// You can construct a concrete instance of `SRVRecordArrayInput` via:
//
//	SRVRecordArray{ SRVRecordArgs{...} }
type SRVRecordArrayInput interface {
	pulumi.Input

	ToSRVRecordArrayOutput() SRVRecordArrayOutput
	ToSRVRecordArrayOutputWithContext(context.Context) SRVRecordArrayOutput
}

type SRVRecordArray []SRVRecordInput

func (SRVRecordArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SRVRecord)(nil)).Elem()
}

func (i SRVRecordArray) ToSRVRecordArrayOutput() SRVRecordArrayOutput {
	return i.ToSRVRecordArrayOutputWithContext(context.Background())
}

func (i SRVRecordArray) ToSRVRecordArrayOutputWithContext(ctx context.Context) SRVRecordArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SRVRecordArrayOutput)
}

// SRVRecordMapInput is an input type that accepts SRVRecordMap and SRVRecordMapOutput values.
// You can construct a concrete instance of `SRVRecordMapInput` via:
//
//	SRVRecordMap{ "key": SRVRecordArgs{...} }
type SRVRecordMapInput interface {
	pulumi.Input

	ToSRVRecordMapOutput() SRVRecordMapOutput
	ToSRVRecordMapOutputWithContext(context.Context) SRVRecordMapOutput
}

type SRVRecordMap map[string]SRVRecordInput

func (SRVRecordMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SRVRecord)(nil)).Elem()
}

func (i SRVRecordMap) ToSRVRecordMapOutput() SRVRecordMapOutput {
	return i.ToSRVRecordMapOutputWithContext(context.Background())
}

func (i SRVRecordMap) ToSRVRecordMapOutputWithContext(ctx context.Context) SRVRecordMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SRVRecordMapOutput)
}

type SRVRecordOutput struct{ *pulumi.OutputState }

func (SRVRecordOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SRVRecord)(nil)).Elem()
}

func (o SRVRecordOutput) ToSRVRecordOutput() SRVRecordOutput {
	return o
}

func (o SRVRecordOutput) ToSRVRecordOutputWithContext(ctx context.Context) SRVRecordOutput {
	return o
}

// The FQDN of the DNS SRV Record.
func (o SRVRecordOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v *SRVRecord) pulumi.StringOutput { return v.Fqdn }).(pulumi.StringOutput)
}

// The name of the DNS SRV Record. Changing this forces a new resource to be created.
func (o SRVRecordOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SRVRecord) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// One or more `record` blocks as defined below.
func (o SRVRecordOutput) Records() SRVRecordRecordArrayOutput {
	return o.ApplyT(func(v *SRVRecord) SRVRecordRecordArrayOutput { return v.Records }).(SRVRecordRecordArrayOutput)
}

// Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
func (o SRVRecordOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *SRVRecord) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o SRVRecordOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SRVRecord) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The Time To Live (TTL) of the DNS record in seconds.
func (o SRVRecordOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v *SRVRecord) pulumi.IntOutput { return v.Ttl }).(pulumi.IntOutput)
}

// Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
func (o SRVRecordOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v *SRVRecord) pulumi.StringOutput { return v.ZoneName }).(pulumi.StringOutput)
}

type SRVRecordArrayOutput struct{ *pulumi.OutputState }

func (SRVRecordArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SRVRecord)(nil)).Elem()
}

func (o SRVRecordArrayOutput) ToSRVRecordArrayOutput() SRVRecordArrayOutput {
	return o
}

func (o SRVRecordArrayOutput) ToSRVRecordArrayOutputWithContext(ctx context.Context) SRVRecordArrayOutput {
	return o
}

func (o SRVRecordArrayOutput) Index(i pulumi.IntInput) SRVRecordOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SRVRecord {
		return vs[0].([]*SRVRecord)[vs[1].(int)]
	}).(SRVRecordOutput)
}

type SRVRecordMapOutput struct{ *pulumi.OutputState }

func (SRVRecordMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SRVRecord)(nil)).Elem()
}

func (o SRVRecordMapOutput) ToSRVRecordMapOutput() SRVRecordMapOutput {
	return o
}

func (o SRVRecordMapOutput) ToSRVRecordMapOutputWithContext(ctx context.Context) SRVRecordMapOutput {
	return o
}

func (o SRVRecordMapOutput) MapIndex(k pulumi.StringInput) SRVRecordOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SRVRecord {
		return vs[0].(map[string]*SRVRecord)[vs[1].(string)]
	}).(SRVRecordOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SRVRecordInput)(nil)).Elem(), &SRVRecord{})
	pulumi.RegisterInputType(reflect.TypeOf((*SRVRecordArrayInput)(nil)).Elem(), SRVRecordArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SRVRecordMapInput)(nil)).Elem(), SRVRecordMap{})
	pulumi.RegisterOutputType(SRVRecordOutput{})
	pulumi.RegisterOutputType(SRVRecordArrayOutput{})
	pulumi.RegisterOutputType(SRVRecordMapOutput{})
}

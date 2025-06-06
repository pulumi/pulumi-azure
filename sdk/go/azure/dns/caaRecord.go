// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/dns"
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
//			exampleZone, err := dns.NewZone(ctx, "example", &dns.ZoneArgs{
//				Name:              pulumi.String("mydomain.com"),
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = dns.NewCaaRecord(ctx, "example", &dns.CaaRecordArgs{
//				Name:              pulumi.String("test"),
//				ZoneName:          exampleZone.Name,
//				ResourceGroupName: example.Name,
//				Ttl:               pulumi.Int(300),
//				Records: dns.CaaRecordRecordArray{
//					&dns.CaaRecordRecordArgs{
//						Flags: pulumi.Int(0),
//						Tag:   pulumi.String("issue"),
//						Value: pulumi.String("example.com"),
//					},
//					&dns.CaaRecordRecordArgs{
//						Flags: pulumi.Int(0),
//						Tag:   pulumi.String("issue"),
//						Value: pulumi.String("example.net"),
//					},
//					&dns.CaaRecordRecordArgs{
//						Flags: pulumi.Int(0),
//						Tag:   pulumi.String("issuewild"),
//						Value: pulumi.String(";"),
//					},
//					&dns.CaaRecordRecordArgs{
//						Flags: pulumi.Int(0),
//						Tag:   pulumi.String("iodef"),
//						Value: pulumi.String("mailto:user@nonexisting.tld"),
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
// * `Microsoft.Network`: 2018-05-01
//
// ## Import
//
// CAA records can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:dns/caaRecord:CaaRecord example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/dnsZones/zone1/CAA/myrecord1
// ```
type CaaRecord struct {
	pulumi.CustomResourceState

	// The FQDN of the DNS CAA Record.
	Fqdn pulumi.StringOutput `pulumi:"fqdn"`
	// The name of the DNS CAA Record. If you are creating the record in the apex of the zone use `"@"` as the name. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of values that make up the CAA record. Each `record` block supports fields documented below.
	Records CaaRecordRecordArrayOutput `pulumi:"records"`
	// Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
	// Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName pulumi.StringOutput `pulumi:"zoneName"`
}

// NewCaaRecord registers a new resource with the given unique name, arguments, and options.
func NewCaaRecord(ctx *pulumi.Context,
	name string, args *CaaRecordArgs, opts ...pulumi.ResourceOption) (*CaaRecord, error) {
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
	var resource CaaRecord
	err := ctx.RegisterResource("azure:dns/caaRecord:CaaRecord", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCaaRecord gets an existing CaaRecord resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCaaRecord(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CaaRecordState, opts ...pulumi.ResourceOption) (*CaaRecord, error) {
	var resource CaaRecord
	err := ctx.ReadResource("azure:dns/caaRecord:CaaRecord", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CaaRecord resources.
type caaRecordState struct {
	// The FQDN of the DNS CAA Record.
	Fqdn *string `pulumi:"fqdn"`
	// The name of the DNS CAA Record. If you are creating the record in the apex of the zone use `"@"` as the name. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A list of values that make up the CAA record. Each `record` block supports fields documented below.
	Records []CaaRecordRecord `pulumi:"records"`
	// Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl *int `pulumi:"ttl"`
	// Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName *string `pulumi:"zoneName"`
}

type CaaRecordState struct {
	// The FQDN of the DNS CAA Record.
	Fqdn pulumi.StringPtrInput
	// The name of the DNS CAA Record. If you are creating the record in the apex of the zone use `"@"` as the name. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A list of values that make up the CAA record. Each `record` block supports fields documented below.
	Records CaaRecordRecordArrayInput
	// Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl pulumi.IntPtrInput
	// Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName pulumi.StringPtrInput
}

func (CaaRecordState) ElementType() reflect.Type {
	return reflect.TypeOf((*caaRecordState)(nil)).Elem()
}

type caaRecordArgs struct {
	// The name of the DNS CAA Record. If you are creating the record in the apex of the zone use `"@"` as the name. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A list of values that make up the CAA record. Each `record` block supports fields documented below.
	Records []CaaRecordRecord `pulumi:"records"`
	// Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl int `pulumi:"ttl"`
	// Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName string `pulumi:"zoneName"`
}

// The set of arguments for constructing a CaaRecord resource.
type CaaRecordArgs struct {
	// The name of the DNS CAA Record. If you are creating the record in the apex of the zone use `"@"` as the name. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A list of values that make up the CAA record. Each `record` block supports fields documented below.
	Records CaaRecordRecordArrayInput
	// Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl pulumi.IntInput
	// Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
	ZoneName pulumi.StringInput
}

func (CaaRecordArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*caaRecordArgs)(nil)).Elem()
}

type CaaRecordInput interface {
	pulumi.Input

	ToCaaRecordOutput() CaaRecordOutput
	ToCaaRecordOutputWithContext(ctx context.Context) CaaRecordOutput
}

func (*CaaRecord) ElementType() reflect.Type {
	return reflect.TypeOf((**CaaRecord)(nil)).Elem()
}

func (i *CaaRecord) ToCaaRecordOutput() CaaRecordOutput {
	return i.ToCaaRecordOutputWithContext(context.Background())
}

func (i *CaaRecord) ToCaaRecordOutputWithContext(ctx context.Context) CaaRecordOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CaaRecordOutput)
}

// CaaRecordArrayInput is an input type that accepts CaaRecordArray and CaaRecordArrayOutput values.
// You can construct a concrete instance of `CaaRecordArrayInput` via:
//
//	CaaRecordArray{ CaaRecordArgs{...} }
type CaaRecordArrayInput interface {
	pulumi.Input

	ToCaaRecordArrayOutput() CaaRecordArrayOutput
	ToCaaRecordArrayOutputWithContext(context.Context) CaaRecordArrayOutput
}

type CaaRecordArray []CaaRecordInput

func (CaaRecordArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CaaRecord)(nil)).Elem()
}

func (i CaaRecordArray) ToCaaRecordArrayOutput() CaaRecordArrayOutput {
	return i.ToCaaRecordArrayOutputWithContext(context.Background())
}

func (i CaaRecordArray) ToCaaRecordArrayOutputWithContext(ctx context.Context) CaaRecordArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CaaRecordArrayOutput)
}

// CaaRecordMapInput is an input type that accepts CaaRecordMap and CaaRecordMapOutput values.
// You can construct a concrete instance of `CaaRecordMapInput` via:
//
//	CaaRecordMap{ "key": CaaRecordArgs{...} }
type CaaRecordMapInput interface {
	pulumi.Input

	ToCaaRecordMapOutput() CaaRecordMapOutput
	ToCaaRecordMapOutputWithContext(context.Context) CaaRecordMapOutput
}

type CaaRecordMap map[string]CaaRecordInput

func (CaaRecordMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CaaRecord)(nil)).Elem()
}

func (i CaaRecordMap) ToCaaRecordMapOutput() CaaRecordMapOutput {
	return i.ToCaaRecordMapOutputWithContext(context.Background())
}

func (i CaaRecordMap) ToCaaRecordMapOutputWithContext(ctx context.Context) CaaRecordMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CaaRecordMapOutput)
}

type CaaRecordOutput struct{ *pulumi.OutputState }

func (CaaRecordOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CaaRecord)(nil)).Elem()
}

func (o CaaRecordOutput) ToCaaRecordOutput() CaaRecordOutput {
	return o
}

func (o CaaRecordOutput) ToCaaRecordOutputWithContext(ctx context.Context) CaaRecordOutput {
	return o
}

// The FQDN of the DNS CAA Record.
func (o CaaRecordOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v *CaaRecord) pulumi.StringOutput { return v.Fqdn }).(pulumi.StringOutput)
}

// The name of the DNS CAA Record. If you are creating the record in the apex of the zone use `"@"` as the name. Changing this forces a new resource to be created.
func (o CaaRecordOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CaaRecord) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of values that make up the CAA record. Each `record` block supports fields documented below.
func (o CaaRecordOutput) Records() CaaRecordRecordArrayOutput {
	return o.ApplyT(func(v *CaaRecord) CaaRecordRecordArrayOutput { return v.Records }).(CaaRecordRecordArrayOutput)
}

// Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
func (o CaaRecordOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *CaaRecord) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o CaaRecordOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CaaRecord) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The Time To Live (TTL) of the DNS record in seconds.
func (o CaaRecordOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v *CaaRecord) pulumi.IntOutput { return v.Ttl }).(pulumi.IntOutput)
}

// Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
func (o CaaRecordOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v *CaaRecord) pulumi.StringOutput { return v.ZoneName }).(pulumi.StringOutput)
}

type CaaRecordArrayOutput struct{ *pulumi.OutputState }

func (CaaRecordArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CaaRecord)(nil)).Elem()
}

func (o CaaRecordArrayOutput) ToCaaRecordArrayOutput() CaaRecordArrayOutput {
	return o
}

func (o CaaRecordArrayOutput) ToCaaRecordArrayOutputWithContext(ctx context.Context) CaaRecordArrayOutput {
	return o
}

func (o CaaRecordArrayOutput) Index(i pulumi.IntInput) CaaRecordOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CaaRecord {
		return vs[0].([]*CaaRecord)[vs[1].(int)]
	}).(CaaRecordOutput)
}

type CaaRecordMapOutput struct{ *pulumi.OutputState }

func (CaaRecordMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CaaRecord)(nil)).Elem()
}

func (o CaaRecordMapOutput) ToCaaRecordMapOutput() CaaRecordMapOutput {
	return o
}

func (o CaaRecordMapOutput) ToCaaRecordMapOutputWithContext(ctx context.Context) CaaRecordMapOutput {
	return o
}

func (o CaaRecordMapOutput) MapIndex(k pulumi.StringInput) CaaRecordOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CaaRecord {
		return vs[0].(map[string]*CaaRecord)[vs[1].(string)]
	}).(CaaRecordOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CaaRecordInput)(nil)).Elem(), &CaaRecord{})
	pulumi.RegisterInputType(reflect.TypeOf((*CaaRecordArrayInput)(nil)).Elem(), CaaRecordArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CaaRecordMapInput)(nil)).Elem(), CaaRecordMap{})
	pulumi.RegisterOutputType(CaaRecordOutput{})
	pulumi.RegisterOutputType(CaaRecordArrayOutput{})
	pulumi.RegisterOutputType(CaaRecordMapOutput{})
}

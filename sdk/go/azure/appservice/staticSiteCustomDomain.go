// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appservice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### CNAME validation
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appservice"
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
//			exampleStaticSite, err := appservice.NewStaticSite(ctx, "example", &appservice.StaticSiteArgs{
//				Name:              pulumi.String("example"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//			})
//			if err != nil {
//				return err
//			}
//			exampleCNameRecord, err := dns.NewCNameRecord(ctx, "example", &dns.CNameRecordArgs{
//				Name:              pulumi.String("my-domain"),
//				ZoneName:          pulumi.String("contoso.com"),
//				ResourceGroupName: example.Name,
//				Ttl:               pulumi.Int(300),
//				Record:            exampleStaticSite.DefaultHostName,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appservice.NewStaticSiteCustomDomain(ctx, "example", &appservice.StaticSiteCustomDomainArgs{
//				StaticSiteId: exampleStaticSite.ID(),
//				DomainName: pulumi.All(exampleCNameRecord.Name, exampleCNameRecord.ZoneName).ApplyT(func(_args []interface{}) (string, error) {
//					name := _args[0].(string)
//					zoneName := _args[1].(string)
//					return fmt.Sprintf("%v.%v", name, zoneName), nil
//				}).(pulumi.StringOutput),
//				ValidationType: pulumi.String("cname-delegation"),
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
// ### TXT validation
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appservice"
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
//			exampleStaticSite, err := appservice.NewStaticSite(ctx, "example", &appservice.StaticSiteArgs{
//				Name:              pulumi.String("example"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//			})
//			if err != nil {
//				return err
//			}
//			exampleStaticSiteCustomDomain, err := appservice.NewStaticSiteCustomDomain(ctx, "example", &appservice.StaticSiteCustomDomainArgs{
//				StaticSiteId:   exampleStaticSite.ID(),
//				DomainName:     pulumi.String("my-domain.contoso.com"),
//				ValidationType: pulumi.String("dns-txt-token"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = dns.NewTxtRecord(ctx, "example", &dns.TxtRecordArgs{
//				Name:              pulumi.String("_dnsauth.my-domain"),
//				ZoneName:          pulumi.String("contoso.com"),
//				ResourceGroupName: example.Name,
//				Ttl:               pulumi.Int(300),
//				Records: dns.TxtRecordRecordArray{
//					&dns.TxtRecordRecordArgs{
//						Value: exampleStaticSiteCustomDomain.ValidationToken,
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
// ## Import
//
// Static Site Custom Domains can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:appservice/staticSiteCustomDomain:StaticSiteCustomDomain example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Web/staticSites/my-static-site1/customDomains/name.contoso.com
// ```
type StaticSiteCustomDomain struct {
	pulumi.CustomResourceState

	// The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
	StaticSiteId pulumi.StringOutput `pulumi:"staticSiteId"`
	// Token to be used with `dns-txt-token` validation.
	ValidationToken pulumi.StringOutput `pulumi:"validationToken"`
	// One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
	ValidationType pulumi.StringPtrOutput `pulumi:"validationType"`
}

// NewStaticSiteCustomDomain registers a new resource with the given unique name, arguments, and options.
func NewStaticSiteCustomDomain(ctx *pulumi.Context,
	name string, args *StaticSiteCustomDomainArgs, opts ...pulumi.ResourceOption) (*StaticSiteCustomDomain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DomainName == nil {
		return nil, errors.New("invalid value for required argument 'DomainName'")
	}
	if args.StaticSiteId == nil {
		return nil, errors.New("invalid value for required argument 'StaticSiteId'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"validationToken",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StaticSiteCustomDomain
	err := ctx.RegisterResource("azure:appservice/staticSiteCustomDomain:StaticSiteCustomDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStaticSiteCustomDomain gets an existing StaticSiteCustomDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStaticSiteCustomDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StaticSiteCustomDomainState, opts ...pulumi.ResourceOption) (*StaticSiteCustomDomain, error) {
	var resource StaticSiteCustomDomain
	err := ctx.ReadResource("azure:appservice/staticSiteCustomDomain:StaticSiteCustomDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StaticSiteCustomDomain resources.
type staticSiteCustomDomainState struct {
	// The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
	DomainName *string `pulumi:"domainName"`
	// The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
	StaticSiteId *string `pulumi:"staticSiteId"`
	// Token to be used with `dns-txt-token` validation.
	ValidationToken *string `pulumi:"validationToken"`
	// One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
	ValidationType *string `pulumi:"validationType"`
}

type StaticSiteCustomDomainState struct {
	// The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
	DomainName pulumi.StringPtrInput
	// The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
	StaticSiteId pulumi.StringPtrInput
	// Token to be used with `dns-txt-token` validation.
	ValidationToken pulumi.StringPtrInput
	// One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
	ValidationType pulumi.StringPtrInput
}

func (StaticSiteCustomDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*staticSiteCustomDomainState)(nil)).Elem()
}

type staticSiteCustomDomainArgs struct {
	// The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
	DomainName string `pulumi:"domainName"`
	// The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
	StaticSiteId string `pulumi:"staticSiteId"`
	// One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
	ValidationType *string `pulumi:"validationType"`
}

// The set of arguments for constructing a StaticSiteCustomDomain resource.
type StaticSiteCustomDomainArgs struct {
	// The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
	DomainName pulumi.StringInput
	// The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
	StaticSiteId pulumi.StringInput
	// One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
	ValidationType pulumi.StringPtrInput
}

func (StaticSiteCustomDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*staticSiteCustomDomainArgs)(nil)).Elem()
}

type StaticSiteCustomDomainInput interface {
	pulumi.Input

	ToStaticSiteCustomDomainOutput() StaticSiteCustomDomainOutput
	ToStaticSiteCustomDomainOutputWithContext(ctx context.Context) StaticSiteCustomDomainOutput
}

func (*StaticSiteCustomDomain) ElementType() reflect.Type {
	return reflect.TypeOf((**StaticSiteCustomDomain)(nil)).Elem()
}

func (i *StaticSiteCustomDomain) ToStaticSiteCustomDomainOutput() StaticSiteCustomDomainOutput {
	return i.ToStaticSiteCustomDomainOutputWithContext(context.Background())
}

func (i *StaticSiteCustomDomain) ToStaticSiteCustomDomainOutputWithContext(ctx context.Context) StaticSiteCustomDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StaticSiteCustomDomainOutput)
}

// StaticSiteCustomDomainArrayInput is an input type that accepts StaticSiteCustomDomainArray and StaticSiteCustomDomainArrayOutput values.
// You can construct a concrete instance of `StaticSiteCustomDomainArrayInput` via:
//
//	StaticSiteCustomDomainArray{ StaticSiteCustomDomainArgs{...} }
type StaticSiteCustomDomainArrayInput interface {
	pulumi.Input

	ToStaticSiteCustomDomainArrayOutput() StaticSiteCustomDomainArrayOutput
	ToStaticSiteCustomDomainArrayOutputWithContext(context.Context) StaticSiteCustomDomainArrayOutput
}

type StaticSiteCustomDomainArray []StaticSiteCustomDomainInput

func (StaticSiteCustomDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StaticSiteCustomDomain)(nil)).Elem()
}

func (i StaticSiteCustomDomainArray) ToStaticSiteCustomDomainArrayOutput() StaticSiteCustomDomainArrayOutput {
	return i.ToStaticSiteCustomDomainArrayOutputWithContext(context.Background())
}

func (i StaticSiteCustomDomainArray) ToStaticSiteCustomDomainArrayOutputWithContext(ctx context.Context) StaticSiteCustomDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StaticSiteCustomDomainArrayOutput)
}

// StaticSiteCustomDomainMapInput is an input type that accepts StaticSiteCustomDomainMap and StaticSiteCustomDomainMapOutput values.
// You can construct a concrete instance of `StaticSiteCustomDomainMapInput` via:
//
//	StaticSiteCustomDomainMap{ "key": StaticSiteCustomDomainArgs{...} }
type StaticSiteCustomDomainMapInput interface {
	pulumi.Input

	ToStaticSiteCustomDomainMapOutput() StaticSiteCustomDomainMapOutput
	ToStaticSiteCustomDomainMapOutputWithContext(context.Context) StaticSiteCustomDomainMapOutput
}

type StaticSiteCustomDomainMap map[string]StaticSiteCustomDomainInput

func (StaticSiteCustomDomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StaticSiteCustomDomain)(nil)).Elem()
}

func (i StaticSiteCustomDomainMap) ToStaticSiteCustomDomainMapOutput() StaticSiteCustomDomainMapOutput {
	return i.ToStaticSiteCustomDomainMapOutputWithContext(context.Background())
}

func (i StaticSiteCustomDomainMap) ToStaticSiteCustomDomainMapOutputWithContext(ctx context.Context) StaticSiteCustomDomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StaticSiteCustomDomainMapOutput)
}

type StaticSiteCustomDomainOutput struct{ *pulumi.OutputState }

func (StaticSiteCustomDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StaticSiteCustomDomain)(nil)).Elem()
}

func (o StaticSiteCustomDomainOutput) ToStaticSiteCustomDomainOutput() StaticSiteCustomDomainOutput {
	return o
}

func (o StaticSiteCustomDomainOutput) ToStaticSiteCustomDomainOutputWithContext(ctx context.Context) StaticSiteCustomDomainOutput {
	return o
}

// The Domain Name which should be associated with this Static Site. Changing this forces a new Static Site Custom Domain to be created.
func (o StaticSiteCustomDomainOutput) DomainName() pulumi.StringOutput {
	return o.ApplyT(func(v *StaticSiteCustomDomain) pulumi.StringOutput { return v.DomainName }).(pulumi.StringOutput)
}

// The ID of the Static Site. Changing this forces a new Static Site Custom Domain to be created.
func (o StaticSiteCustomDomainOutput) StaticSiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *StaticSiteCustomDomain) pulumi.StringOutput { return v.StaticSiteId }).(pulumi.StringOutput)
}

// Token to be used with `dns-txt-token` validation.
func (o StaticSiteCustomDomainOutput) ValidationToken() pulumi.StringOutput {
	return o.ApplyT(func(v *StaticSiteCustomDomain) pulumi.StringOutput { return v.ValidationToken }).(pulumi.StringOutput)
}

// One of `cname-delegation` or `dns-txt-token`. Changing this forces a new Static Site Custom Domain to be created.
func (o StaticSiteCustomDomainOutput) ValidationType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StaticSiteCustomDomain) pulumi.StringPtrOutput { return v.ValidationType }).(pulumi.StringPtrOutput)
}

type StaticSiteCustomDomainArrayOutput struct{ *pulumi.OutputState }

func (StaticSiteCustomDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StaticSiteCustomDomain)(nil)).Elem()
}

func (o StaticSiteCustomDomainArrayOutput) ToStaticSiteCustomDomainArrayOutput() StaticSiteCustomDomainArrayOutput {
	return o
}

func (o StaticSiteCustomDomainArrayOutput) ToStaticSiteCustomDomainArrayOutputWithContext(ctx context.Context) StaticSiteCustomDomainArrayOutput {
	return o
}

func (o StaticSiteCustomDomainArrayOutput) Index(i pulumi.IntInput) StaticSiteCustomDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StaticSiteCustomDomain {
		return vs[0].([]*StaticSiteCustomDomain)[vs[1].(int)]
	}).(StaticSiteCustomDomainOutput)
}

type StaticSiteCustomDomainMapOutput struct{ *pulumi.OutputState }

func (StaticSiteCustomDomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StaticSiteCustomDomain)(nil)).Elem()
}

func (o StaticSiteCustomDomainMapOutput) ToStaticSiteCustomDomainMapOutput() StaticSiteCustomDomainMapOutput {
	return o
}

func (o StaticSiteCustomDomainMapOutput) ToStaticSiteCustomDomainMapOutputWithContext(ctx context.Context) StaticSiteCustomDomainMapOutput {
	return o
}

func (o StaticSiteCustomDomainMapOutput) MapIndex(k pulumi.StringInput) StaticSiteCustomDomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StaticSiteCustomDomain {
		return vs[0].(map[string]*StaticSiteCustomDomain)[vs[1].(string)]
	}).(StaticSiteCustomDomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StaticSiteCustomDomainInput)(nil)).Elem(), &StaticSiteCustomDomain{})
	pulumi.RegisterInputType(reflect.TypeOf((*StaticSiteCustomDomainArrayInput)(nil)).Elem(), StaticSiteCustomDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StaticSiteCustomDomainMapInput)(nil)).Elem(), StaticSiteCustomDomainMap{})
	pulumi.RegisterOutputType(StaticSiteCustomDomainOutput{})
	pulumi.RegisterOutputType(StaticSiteCustomDomainArrayOutput{})
	pulumi.RegisterOutputType(StaticSiteCustomDomainMapOutput{})
}

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package paloalto

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Palo Alto Networks Rulestack Outbound Trust Certificate Association.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/paloalto"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleLocalRulestack, err := paloalto.NewLocalRulestack(ctx, "exampleLocalRulestack", &paloalto.LocalRulestackArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//			})
//			if err != nil {
//				return err
//			}
//			exampleLocalRulestackCertificate, err := paloalto.NewLocalRulestackCertificate(ctx, "exampleLocalRulestackCertificate", &paloalto.LocalRulestackCertificateArgs{
//				RulestackId: exampleLocalRulestack.ID(),
//				SelfSigned:  pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = paloalto.NewLocalRulestackOutboundTrustCertificateAssociation(ctx, "exampleLocalRulestackOutboundTrustCertificateAssociation", &paloalto.LocalRulestackOutboundTrustCertificateAssociationArgs{
//				CertificateId: exampleLocalRulestackCertificate.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type LocalRulestackOutboundTrustCertificateAssociation struct {
	pulumi.CustomResourceState

	// The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
	CertificateId pulumi.StringOutput `pulumi:"certificateId"`
}

// NewLocalRulestackOutboundTrustCertificateAssociation registers a new resource with the given unique name, arguments, and options.
func NewLocalRulestackOutboundTrustCertificateAssociation(ctx *pulumi.Context,
	name string, args *LocalRulestackOutboundTrustCertificateAssociationArgs, opts ...pulumi.ResourceOption) (*LocalRulestackOutboundTrustCertificateAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateId == nil {
		return nil, errors.New("invalid value for required argument 'CertificateId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LocalRulestackOutboundTrustCertificateAssociation
	err := ctx.RegisterResource("azure:paloalto/localRulestackOutboundTrustCertificateAssociation:LocalRulestackOutboundTrustCertificateAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLocalRulestackOutboundTrustCertificateAssociation gets an existing LocalRulestackOutboundTrustCertificateAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLocalRulestackOutboundTrustCertificateAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LocalRulestackOutboundTrustCertificateAssociationState, opts ...pulumi.ResourceOption) (*LocalRulestackOutboundTrustCertificateAssociation, error) {
	var resource LocalRulestackOutboundTrustCertificateAssociation
	err := ctx.ReadResource("azure:paloalto/localRulestackOutboundTrustCertificateAssociation:LocalRulestackOutboundTrustCertificateAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LocalRulestackOutboundTrustCertificateAssociation resources.
type localRulestackOutboundTrustCertificateAssociationState struct {
	// The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
	CertificateId *string `pulumi:"certificateId"`
}

type LocalRulestackOutboundTrustCertificateAssociationState struct {
	// The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
	CertificateId pulumi.StringPtrInput
}

func (LocalRulestackOutboundTrustCertificateAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*localRulestackOutboundTrustCertificateAssociationState)(nil)).Elem()
}

type localRulestackOutboundTrustCertificateAssociationArgs struct {
	// The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
	CertificateId string `pulumi:"certificateId"`
}

// The set of arguments for constructing a LocalRulestackOutboundTrustCertificateAssociation resource.
type LocalRulestackOutboundTrustCertificateAssociationArgs struct {
	// The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
	CertificateId pulumi.StringInput
}

func (LocalRulestackOutboundTrustCertificateAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*localRulestackOutboundTrustCertificateAssociationArgs)(nil)).Elem()
}

type LocalRulestackOutboundTrustCertificateAssociationInput interface {
	pulumi.Input

	ToLocalRulestackOutboundTrustCertificateAssociationOutput() LocalRulestackOutboundTrustCertificateAssociationOutput
	ToLocalRulestackOutboundTrustCertificateAssociationOutputWithContext(ctx context.Context) LocalRulestackOutboundTrustCertificateAssociationOutput
}

func (*LocalRulestackOutboundTrustCertificateAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**LocalRulestackOutboundTrustCertificateAssociation)(nil)).Elem()
}

func (i *LocalRulestackOutboundTrustCertificateAssociation) ToLocalRulestackOutboundTrustCertificateAssociationOutput() LocalRulestackOutboundTrustCertificateAssociationOutput {
	return i.ToLocalRulestackOutboundTrustCertificateAssociationOutputWithContext(context.Background())
}

func (i *LocalRulestackOutboundTrustCertificateAssociation) ToLocalRulestackOutboundTrustCertificateAssociationOutputWithContext(ctx context.Context) LocalRulestackOutboundTrustCertificateAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocalRulestackOutboundTrustCertificateAssociationOutput)
}

// LocalRulestackOutboundTrustCertificateAssociationArrayInput is an input type that accepts LocalRulestackOutboundTrustCertificateAssociationArray and LocalRulestackOutboundTrustCertificateAssociationArrayOutput values.
// You can construct a concrete instance of `LocalRulestackOutboundTrustCertificateAssociationArrayInput` via:
//
//	LocalRulestackOutboundTrustCertificateAssociationArray{ LocalRulestackOutboundTrustCertificateAssociationArgs{...} }
type LocalRulestackOutboundTrustCertificateAssociationArrayInput interface {
	pulumi.Input

	ToLocalRulestackOutboundTrustCertificateAssociationArrayOutput() LocalRulestackOutboundTrustCertificateAssociationArrayOutput
	ToLocalRulestackOutboundTrustCertificateAssociationArrayOutputWithContext(context.Context) LocalRulestackOutboundTrustCertificateAssociationArrayOutput
}

type LocalRulestackOutboundTrustCertificateAssociationArray []LocalRulestackOutboundTrustCertificateAssociationInput

func (LocalRulestackOutboundTrustCertificateAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LocalRulestackOutboundTrustCertificateAssociation)(nil)).Elem()
}

func (i LocalRulestackOutboundTrustCertificateAssociationArray) ToLocalRulestackOutboundTrustCertificateAssociationArrayOutput() LocalRulestackOutboundTrustCertificateAssociationArrayOutput {
	return i.ToLocalRulestackOutboundTrustCertificateAssociationArrayOutputWithContext(context.Background())
}

func (i LocalRulestackOutboundTrustCertificateAssociationArray) ToLocalRulestackOutboundTrustCertificateAssociationArrayOutputWithContext(ctx context.Context) LocalRulestackOutboundTrustCertificateAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocalRulestackOutboundTrustCertificateAssociationArrayOutput)
}

// LocalRulestackOutboundTrustCertificateAssociationMapInput is an input type that accepts LocalRulestackOutboundTrustCertificateAssociationMap and LocalRulestackOutboundTrustCertificateAssociationMapOutput values.
// You can construct a concrete instance of `LocalRulestackOutboundTrustCertificateAssociationMapInput` via:
//
//	LocalRulestackOutboundTrustCertificateAssociationMap{ "key": LocalRulestackOutboundTrustCertificateAssociationArgs{...} }
type LocalRulestackOutboundTrustCertificateAssociationMapInput interface {
	pulumi.Input

	ToLocalRulestackOutboundTrustCertificateAssociationMapOutput() LocalRulestackOutboundTrustCertificateAssociationMapOutput
	ToLocalRulestackOutboundTrustCertificateAssociationMapOutputWithContext(context.Context) LocalRulestackOutboundTrustCertificateAssociationMapOutput
}

type LocalRulestackOutboundTrustCertificateAssociationMap map[string]LocalRulestackOutboundTrustCertificateAssociationInput

func (LocalRulestackOutboundTrustCertificateAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LocalRulestackOutboundTrustCertificateAssociation)(nil)).Elem()
}

func (i LocalRulestackOutboundTrustCertificateAssociationMap) ToLocalRulestackOutboundTrustCertificateAssociationMapOutput() LocalRulestackOutboundTrustCertificateAssociationMapOutput {
	return i.ToLocalRulestackOutboundTrustCertificateAssociationMapOutputWithContext(context.Background())
}

func (i LocalRulestackOutboundTrustCertificateAssociationMap) ToLocalRulestackOutboundTrustCertificateAssociationMapOutputWithContext(ctx context.Context) LocalRulestackOutboundTrustCertificateAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LocalRulestackOutboundTrustCertificateAssociationMapOutput)
}

type LocalRulestackOutboundTrustCertificateAssociationOutput struct{ *pulumi.OutputState }

func (LocalRulestackOutboundTrustCertificateAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LocalRulestackOutboundTrustCertificateAssociation)(nil)).Elem()
}

func (o LocalRulestackOutboundTrustCertificateAssociationOutput) ToLocalRulestackOutboundTrustCertificateAssociationOutput() LocalRulestackOutboundTrustCertificateAssociationOutput {
	return o
}

func (o LocalRulestackOutboundTrustCertificateAssociationOutput) ToLocalRulestackOutboundTrustCertificateAssociationOutputWithContext(ctx context.Context) LocalRulestackOutboundTrustCertificateAssociationOutput {
	return o
}

// The ID of the Certificate to use as the Outbound Trust Certificate. Changing this forces a new Palo Alto Networks Rulestack Outbound Trust Certificate Association to be created.
func (o LocalRulestackOutboundTrustCertificateAssociationOutput) CertificateId() pulumi.StringOutput {
	return o.ApplyT(func(v *LocalRulestackOutboundTrustCertificateAssociation) pulumi.StringOutput { return v.CertificateId }).(pulumi.StringOutput)
}

type LocalRulestackOutboundTrustCertificateAssociationArrayOutput struct{ *pulumi.OutputState }

func (LocalRulestackOutboundTrustCertificateAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LocalRulestackOutboundTrustCertificateAssociation)(nil)).Elem()
}

func (o LocalRulestackOutboundTrustCertificateAssociationArrayOutput) ToLocalRulestackOutboundTrustCertificateAssociationArrayOutput() LocalRulestackOutboundTrustCertificateAssociationArrayOutput {
	return o
}

func (o LocalRulestackOutboundTrustCertificateAssociationArrayOutput) ToLocalRulestackOutboundTrustCertificateAssociationArrayOutputWithContext(ctx context.Context) LocalRulestackOutboundTrustCertificateAssociationArrayOutput {
	return o
}

func (o LocalRulestackOutboundTrustCertificateAssociationArrayOutput) Index(i pulumi.IntInput) LocalRulestackOutboundTrustCertificateAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LocalRulestackOutboundTrustCertificateAssociation {
		return vs[0].([]*LocalRulestackOutboundTrustCertificateAssociation)[vs[1].(int)]
	}).(LocalRulestackOutboundTrustCertificateAssociationOutput)
}

type LocalRulestackOutboundTrustCertificateAssociationMapOutput struct{ *pulumi.OutputState }

func (LocalRulestackOutboundTrustCertificateAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LocalRulestackOutboundTrustCertificateAssociation)(nil)).Elem()
}

func (o LocalRulestackOutboundTrustCertificateAssociationMapOutput) ToLocalRulestackOutboundTrustCertificateAssociationMapOutput() LocalRulestackOutboundTrustCertificateAssociationMapOutput {
	return o
}

func (o LocalRulestackOutboundTrustCertificateAssociationMapOutput) ToLocalRulestackOutboundTrustCertificateAssociationMapOutputWithContext(ctx context.Context) LocalRulestackOutboundTrustCertificateAssociationMapOutput {
	return o
}

func (o LocalRulestackOutboundTrustCertificateAssociationMapOutput) MapIndex(k pulumi.StringInput) LocalRulestackOutboundTrustCertificateAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LocalRulestackOutboundTrustCertificateAssociation {
		return vs[0].(map[string]*LocalRulestackOutboundTrustCertificateAssociation)[vs[1].(string)]
	}).(LocalRulestackOutboundTrustCertificateAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LocalRulestackOutboundTrustCertificateAssociationInput)(nil)).Elem(), &LocalRulestackOutboundTrustCertificateAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*LocalRulestackOutboundTrustCertificateAssociationArrayInput)(nil)).Elem(), LocalRulestackOutboundTrustCertificateAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LocalRulestackOutboundTrustCertificateAssociationMapInput)(nil)).Elem(), LocalRulestackOutboundTrustCertificateAssociationMap{})
	pulumi.RegisterOutputType(LocalRulestackOutboundTrustCertificateAssociationOutput{})
	pulumi.RegisterOutputType(LocalRulestackOutboundTrustCertificateAssociationArrayOutput{})
	pulumi.RegisterOutputType(LocalRulestackOutboundTrustCertificateAssociationMapOutput{})
}
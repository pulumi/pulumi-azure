// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securitycenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages the subscription's Security Center Contact.
//
// > **Note:** Owner access permission is required.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewContact(ctx, "example", &securitycenter.ContactArgs{
//				Name:               pulumi.String("contact"),
//				Email:              pulumi.String("contact@example.com"),
//				Phone:              pulumi.String("+1-555-555-5555"),
//				AlertNotifications: pulumi.Bool(true),
//				AlertsToAdmins:     pulumi.Bool(true),
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
// Security Center Contacts can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:securitycenter/contact:Contact example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Security/securityContacts/default1
// ```
type Contact struct {
	pulumi.CustomResourceState

	// Whether to send security alerts notifications to the security contact.
	AlertNotifications pulumi.BoolOutput `pulumi:"alertNotifications"`
	// Whether to send security alerts notifications to subscription admins.
	AlertsToAdmins pulumi.BoolOutput `pulumi:"alertsToAdmins"`
	// The email of the Security Center Contact.
	Email pulumi.StringOutput `pulumi:"email"`
	// The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The phone number of the Security Center Contact.
	Phone pulumi.StringPtrOutput `pulumi:"phone"`
}

// NewContact registers a new resource with the given unique name, arguments, and options.
func NewContact(ctx *pulumi.Context,
	name string, args *ContactArgs, opts ...pulumi.ResourceOption) (*Contact, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AlertNotifications == nil {
		return nil, errors.New("invalid value for required argument 'AlertNotifications'")
	}
	if args.AlertsToAdmins == nil {
		return nil, errors.New("invalid value for required argument 'AlertsToAdmins'")
	}
	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Contact
	err := ctx.RegisterResource("azure:securitycenter/contact:Contact", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetContact gets an existing Contact resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetContact(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ContactState, opts ...pulumi.ResourceOption) (*Contact, error) {
	var resource Contact
	err := ctx.ReadResource("azure:securitycenter/contact:Contact", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Contact resources.
type contactState struct {
	// Whether to send security alerts notifications to the security contact.
	AlertNotifications *bool `pulumi:"alertNotifications"`
	// Whether to send security alerts notifications to subscription admins.
	AlertsToAdmins *bool `pulumi:"alertsToAdmins"`
	// The email of the Security Center Contact.
	Email *string `pulumi:"email"`
	// The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
	Name *string `pulumi:"name"`
	// The phone number of the Security Center Contact.
	Phone *string `pulumi:"phone"`
}

type ContactState struct {
	// Whether to send security alerts notifications to the security contact.
	AlertNotifications pulumi.BoolPtrInput
	// Whether to send security alerts notifications to subscription admins.
	AlertsToAdmins pulumi.BoolPtrInput
	// The email of the Security Center Contact.
	Email pulumi.StringPtrInput
	// The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
	Name pulumi.StringPtrInput
	// The phone number of the Security Center Contact.
	Phone pulumi.StringPtrInput
}

func (ContactState) ElementType() reflect.Type {
	return reflect.TypeOf((*contactState)(nil)).Elem()
}

type contactArgs struct {
	// Whether to send security alerts notifications to the security contact.
	AlertNotifications bool `pulumi:"alertNotifications"`
	// Whether to send security alerts notifications to subscription admins.
	AlertsToAdmins bool `pulumi:"alertsToAdmins"`
	// The email of the Security Center Contact.
	Email string `pulumi:"email"`
	// The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
	Name *string `pulumi:"name"`
	// The phone number of the Security Center Contact.
	Phone *string `pulumi:"phone"`
}

// The set of arguments for constructing a Contact resource.
type ContactArgs struct {
	// Whether to send security alerts notifications to the security contact.
	AlertNotifications pulumi.BoolInput
	// Whether to send security alerts notifications to subscription admins.
	AlertsToAdmins pulumi.BoolInput
	// The email of the Security Center Contact.
	Email pulumi.StringInput
	// The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
	Name pulumi.StringPtrInput
	// The phone number of the Security Center Contact.
	Phone pulumi.StringPtrInput
}

func (ContactArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*contactArgs)(nil)).Elem()
}

type ContactInput interface {
	pulumi.Input

	ToContactOutput() ContactOutput
	ToContactOutputWithContext(ctx context.Context) ContactOutput
}

func (*Contact) ElementType() reflect.Type {
	return reflect.TypeOf((**Contact)(nil)).Elem()
}

func (i *Contact) ToContactOutput() ContactOutput {
	return i.ToContactOutputWithContext(context.Background())
}

func (i *Contact) ToContactOutputWithContext(ctx context.Context) ContactOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContactOutput)
}

// ContactArrayInput is an input type that accepts ContactArray and ContactArrayOutput values.
// You can construct a concrete instance of `ContactArrayInput` via:
//
//	ContactArray{ ContactArgs{...} }
type ContactArrayInput interface {
	pulumi.Input

	ToContactArrayOutput() ContactArrayOutput
	ToContactArrayOutputWithContext(context.Context) ContactArrayOutput
}

type ContactArray []ContactInput

func (ContactArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Contact)(nil)).Elem()
}

func (i ContactArray) ToContactArrayOutput() ContactArrayOutput {
	return i.ToContactArrayOutputWithContext(context.Background())
}

func (i ContactArray) ToContactArrayOutputWithContext(ctx context.Context) ContactArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContactArrayOutput)
}

// ContactMapInput is an input type that accepts ContactMap and ContactMapOutput values.
// You can construct a concrete instance of `ContactMapInput` via:
//
//	ContactMap{ "key": ContactArgs{...} }
type ContactMapInput interface {
	pulumi.Input

	ToContactMapOutput() ContactMapOutput
	ToContactMapOutputWithContext(context.Context) ContactMapOutput
}

type ContactMap map[string]ContactInput

func (ContactMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Contact)(nil)).Elem()
}

func (i ContactMap) ToContactMapOutput() ContactMapOutput {
	return i.ToContactMapOutputWithContext(context.Background())
}

func (i ContactMap) ToContactMapOutputWithContext(ctx context.Context) ContactMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContactMapOutput)
}

type ContactOutput struct{ *pulumi.OutputState }

func (ContactOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Contact)(nil)).Elem()
}

func (o ContactOutput) ToContactOutput() ContactOutput {
	return o
}

func (o ContactOutput) ToContactOutputWithContext(ctx context.Context) ContactOutput {
	return o
}

// Whether to send security alerts notifications to the security contact.
func (o ContactOutput) AlertNotifications() pulumi.BoolOutput {
	return o.ApplyT(func(v *Contact) pulumi.BoolOutput { return v.AlertNotifications }).(pulumi.BoolOutput)
}

// Whether to send security alerts notifications to subscription admins.
func (o ContactOutput) AlertsToAdmins() pulumi.BoolOutput {
	return o.ApplyT(func(v *Contact) pulumi.BoolOutput { return v.AlertsToAdmins }).(pulumi.BoolOutput)
}

// The email of the Security Center Contact.
func (o ContactOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *Contact) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

// The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
func (o ContactOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Contact) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The phone number of the Security Center Contact.
func (o ContactOutput) Phone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Contact) pulumi.StringPtrOutput { return v.Phone }).(pulumi.StringPtrOutput)
}

type ContactArrayOutput struct{ *pulumi.OutputState }

func (ContactArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Contact)(nil)).Elem()
}

func (o ContactArrayOutput) ToContactArrayOutput() ContactArrayOutput {
	return o
}

func (o ContactArrayOutput) ToContactArrayOutputWithContext(ctx context.Context) ContactArrayOutput {
	return o
}

func (o ContactArrayOutput) Index(i pulumi.IntInput) ContactOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Contact {
		return vs[0].([]*Contact)[vs[1].(int)]
	}).(ContactOutput)
}

type ContactMapOutput struct{ *pulumi.OutputState }

func (ContactMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Contact)(nil)).Elem()
}

func (o ContactMapOutput) ToContactMapOutput() ContactMapOutput {
	return o
}

func (o ContactMapOutput) ToContactMapOutputWithContext(ctx context.Context) ContactMapOutput {
	return o
}

func (o ContactMapOutput) MapIndex(k pulumi.StringInput) ContactOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Contact {
		return vs[0].(map[string]*Contact)[vs[1].(string)]
	}).(ContactOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ContactInput)(nil)).Elem(), &Contact{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContactArrayInput)(nil)).Elem(), ContactArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContactMapInput)(nil)).Elem(), ContactMap{})
	pulumi.RegisterOutputType(ContactOutput{})
	pulumi.RegisterOutputType(ContactArrayOutput{})
	pulumi.RegisterOutputType(ContactMapOutput{})
}

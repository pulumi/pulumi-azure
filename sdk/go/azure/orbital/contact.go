// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package orbital

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an orbital contact.
//
// > **Note:** The `orbital.Contact` resource has been deprecated and will be removed in v5.0 of the AzureRM Provider.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/orbital"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("rg-example"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSpacecraft, err := orbital.NewSpacecraft(ctx, "example", &orbital.SpacecraftArgs{
//				Name:              pulumi.String("example-spacecraft"),
//				ResourceGroupName: example.Name,
//				Location:          pulumi.String("westeurope"),
//				NoradId:           pulumi.String("12345"),
//				Links: orbital.SpacecraftLinkArray{
//					&orbital.SpacecraftLinkArgs{
//						BandwidthMhz:       pulumi.Float64(100),
//						CenterFrequencyMhz: pulumi.Float64(101),
//						Direction:          pulumi.String("Uplink"),
//						Polarization:       pulumi.String("LHCP"),
//						Name:               pulumi.String("examplename"),
//					},
//				},
//				TwoLineElements: pulumi.StringArray{
//					pulumi.String("1 23455U 94089A   97320.90946019  .00000140  00000-0  10191-3 0  2621"),
//					pulumi.String("2 23455  99.0090 272.6745 0008546 223.1686 136.8816 14.11711747148495"),
//				},
//				TitleLine: pulumi.String("AQUA"),
//				Tags: pulumi.StringMap{
//					"aks-managed-cluster-name": pulumi.String("9a57225d-a405-4d40-aa46-f13d2342abef"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "example", &network.VirtualNetworkArgs{
//				Name: pulumi.String("example-vnet"),
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.0.0/16"),
//				},
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			exampleSubnet, err := network.NewSubnet(ctx, "example", &network.SubnetArgs{
//				Name:               pulumi.String("example-subnet"),
//				ResourceGroupName:  example.Name,
//				VirtualNetworkName: exampleVirtualNetwork.Name,
//				AddressPrefixes: pulumi.StringArray{
//					pulumi.String("10.0.1.0/24"),
//				},
//				Delegations: network.SubnetDelegationArray{
//					&network.SubnetDelegationArgs{
//						Name: pulumi.String("orbitalgateway"),
//						ServiceDelegation: &network.SubnetDelegationServiceDelegationArgs{
//							Name: pulumi.String("Microsoft.Orbital/orbitalGateways"),
//							Actions: pulumi.StringArray{
//								pulumi.String("Microsoft.Network/publicIPAddresses/join/action"),
//								pulumi.String("Microsoft.Network/virtualNetworks/subnets/join/action"),
//								pulumi.String("Microsoft.Network/virtualNetworks/read"),
//								pulumi.String("Microsoft.Network/publicIPAddresses/read"),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleContactProfile, err := orbital.NewContactProfile(ctx, "example", &orbital.ContactProfileArgs{
//				Name:                           pulumi.String("example-contactprofile"),
//				ResourceGroupName:              example.Name,
//				Location:                       example.Location,
//				MinimumVariableContactDuration: pulumi.String("PT1M"),
//				AutoTracking:                   pulumi.String("disabled"),
//				Links: orbital.ContactProfileLinkArray{
//					&orbital.ContactProfileLinkArgs{
//						Channels: orbital.ContactProfileLinkChannelArray{
//							&orbital.ContactProfileLinkChannelArgs{
//								Name:               pulumi.String("channelname"),
//								BandwidthMhz:       pulumi.Float64(100),
//								CenterFrequencyMhz: pulumi.Float64(101),
//								EndPoints: orbital.ContactProfileLinkChannelEndPointArray{
//									&orbital.ContactProfileLinkChannelEndPointArgs{
//										EndPointName: pulumi.String("AQUA_command"),
//										IpAddress:    pulumi.String("10.0.1.0"),
//										Port:         pulumi.String("49153"),
//										Protocol:     pulumi.String("TCP"),
//									},
//								},
//							},
//						},
//						Direction:    pulumi.String("Uplink"),
//						Name:         pulumi.String("RHCP_UL"),
//						Polarization: pulumi.String("RHCP"),
//					},
//				},
//				NetworkConfigurationSubnetId: exampleSubnet.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = orbital.NewContact(ctx, "example", &orbital.ContactArgs{
//				Name:                 pulumi.String("example-contact"),
//				SpacecraftId:         exampleSpacecraft.ID(),
//				ReservationStartTime: pulumi.String("2020-07-16T20:35:00.00Z"),
//				ReservationEndTime:   pulumi.String("2020-07-16T20:55:00.00Z"),
//				GroundStationName:    pulumi.String("WESTUS2_0"),
//				ContactProfileId:     exampleContactProfile.ID(),
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
// * `Microsoft.Orbital`: 2022-11-01
//
// ## Import
//
// Spacecraft can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:orbital/contact:Contact example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Orbital/spacecrafts/spacecraft1/contacts/contact1
// ```
type Contact struct {
	pulumi.CustomResourceState

	// ID of the orbital contact profile. Changing this forces a new resource to be created.
	ContactProfileId pulumi.StringOutput `pulumi:"contactProfileId"`
	// Name of the Azure ground station. Changing this forces a new resource to be created.
	GroundStationName pulumi.StringOutput `pulumi:"groundStationName"`
	// The name of the Contact. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Reservation end time of the Contact. Changing this forces a new resource to be created.
	ReservationEndTime pulumi.StringOutput `pulumi:"reservationEndTime"`
	// Reservation start time of the Contact. Changing this forces a new resource to be created.
	ReservationStartTime pulumi.StringOutput `pulumi:"reservationStartTime"`
	// The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
	SpacecraftId pulumi.StringOutput `pulumi:"spacecraftId"`
}

// NewContact registers a new resource with the given unique name, arguments, and options.
func NewContact(ctx *pulumi.Context,
	name string, args *ContactArgs, opts ...pulumi.ResourceOption) (*Contact, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContactProfileId == nil {
		return nil, errors.New("invalid value for required argument 'ContactProfileId'")
	}
	if args.GroundStationName == nil {
		return nil, errors.New("invalid value for required argument 'GroundStationName'")
	}
	if args.ReservationEndTime == nil {
		return nil, errors.New("invalid value for required argument 'ReservationEndTime'")
	}
	if args.ReservationStartTime == nil {
		return nil, errors.New("invalid value for required argument 'ReservationStartTime'")
	}
	if args.SpacecraftId == nil {
		return nil, errors.New("invalid value for required argument 'SpacecraftId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Contact
	err := ctx.RegisterResource("azure:orbital/contact:Contact", name, args, &resource, opts...)
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
	err := ctx.ReadResource("azure:orbital/contact:Contact", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Contact resources.
type contactState struct {
	// ID of the orbital contact profile. Changing this forces a new resource to be created.
	ContactProfileId *string `pulumi:"contactProfileId"`
	// Name of the Azure ground station. Changing this forces a new resource to be created.
	GroundStationName *string `pulumi:"groundStationName"`
	// The name of the Contact. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Reservation end time of the Contact. Changing this forces a new resource to be created.
	ReservationEndTime *string `pulumi:"reservationEndTime"`
	// Reservation start time of the Contact. Changing this forces a new resource to be created.
	ReservationStartTime *string `pulumi:"reservationStartTime"`
	// The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
	SpacecraftId *string `pulumi:"spacecraftId"`
}

type ContactState struct {
	// ID of the orbital contact profile. Changing this forces a new resource to be created.
	ContactProfileId pulumi.StringPtrInput
	// Name of the Azure ground station. Changing this forces a new resource to be created.
	GroundStationName pulumi.StringPtrInput
	// The name of the Contact. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Reservation end time of the Contact. Changing this forces a new resource to be created.
	ReservationEndTime pulumi.StringPtrInput
	// Reservation start time of the Contact. Changing this forces a new resource to be created.
	ReservationStartTime pulumi.StringPtrInput
	// The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
	SpacecraftId pulumi.StringPtrInput
}

func (ContactState) ElementType() reflect.Type {
	return reflect.TypeOf((*contactState)(nil)).Elem()
}

type contactArgs struct {
	// ID of the orbital contact profile. Changing this forces a new resource to be created.
	ContactProfileId string `pulumi:"contactProfileId"`
	// Name of the Azure ground station. Changing this forces a new resource to be created.
	GroundStationName string `pulumi:"groundStationName"`
	// The name of the Contact. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Reservation end time of the Contact. Changing this forces a new resource to be created.
	ReservationEndTime string `pulumi:"reservationEndTime"`
	// Reservation start time of the Contact. Changing this forces a new resource to be created.
	ReservationStartTime string `pulumi:"reservationStartTime"`
	// The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
	SpacecraftId string `pulumi:"spacecraftId"`
}

// The set of arguments for constructing a Contact resource.
type ContactArgs struct {
	// ID of the orbital contact profile. Changing this forces a new resource to be created.
	ContactProfileId pulumi.StringInput
	// Name of the Azure ground station. Changing this forces a new resource to be created.
	GroundStationName pulumi.StringInput
	// The name of the Contact. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Reservation end time of the Contact. Changing this forces a new resource to be created.
	ReservationEndTime pulumi.StringInput
	// Reservation start time of the Contact. Changing this forces a new resource to be created.
	ReservationStartTime pulumi.StringInput
	// The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
	SpacecraftId pulumi.StringInput
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

// ID of the orbital contact profile. Changing this forces a new resource to be created.
func (o ContactOutput) ContactProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *Contact) pulumi.StringOutput { return v.ContactProfileId }).(pulumi.StringOutput)
}

// Name of the Azure ground station. Changing this forces a new resource to be created.
func (o ContactOutput) GroundStationName() pulumi.StringOutput {
	return o.ApplyT(func(v *Contact) pulumi.StringOutput { return v.GroundStationName }).(pulumi.StringOutput)
}

// The name of the Contact. Changing this forces a new resource to be created.
func (o ContactOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Contact) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Reservation end time of the Contact. Changing this forces a new resource to be created.
func (o ContactOutput) ReservationEndTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Contact) pulumi.StringOutput { return v.ReservationEndTime }).(pulumi.StringOutput)
}

// Reservation start time of the Contact. Changing this forces a new resource to be created.
func (o ContactOutput) ReservationStartTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Contact) pulumi.StringOutput { return v.ReservationStartTime }).(pulumi.StringOutput)
}

// The ID of the spacecraft which the contact will be made to. Changing this forces a new resource to be created.
func (o ContactOutput) SpacecraftId() pulumi.StringOutput {
	return o.ApplyT(func(v *Contact) pulumi.StringOutput { return v.SpacecraftId }).(pulumi.StringOutput)
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

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mobile

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Mobile Network Packet Core Control Plane.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/databoxedge"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/mobile"
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
//			_, err = mobile.NewNetwork(ctx, "exampleNetwork", &mobile.NetworkArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				MobileCountryCode: pulumi.String("001"),
//				MobileNetworkCode: pulumi.String("01"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleNetworkSite, err := mobile.NewNetworkSite(ctx, "exampleNetworkSite", &mobile.NetworkSiteArgs{
//				MobileNetworkId: pulumi.Any(azurerm_mobile_network.Test.Id),
//				Location:        exampleResourceGroup.Location,
//			})
//			if err != nil {
//				return err
//			}
//			exampleDevice, err := databoxedge.NewDevice(ctx, "exampleDevice", &databoxedge.DeviceArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				SkuName:           pulumi.String("EdgeP_Base-Standard"),
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"key": "value",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = mobile.NewNetworkPacketCoreControlPlane(ctx, "exampleNetworkPacketCoreControlPlane", &mobile.NetworkPacketCoreControlPlaneArgs{
//				ResourceGroupName:             exampleResourceGroup.Name,
//				Location:                      exampleResourceGroup.Location,
//				Sku:                           pulumi.String("G0"),
//				ControlPlaneAccessName:        pulumi.String("default-interface"),
//				ControlPlaneAccessIpv4Address: pulumi.String("192.168.1.199"),
//				ControlPlaneAccessIpv4Gateway: pulumi.String("192.168.1.1"),
//				ControlPlaneAccessIpv4Subnet:  pulumi.String("192.168.1.0/25"),
//				SiteIds: pulumi.StringArray{
//					exampleNetworkSite.ID(),
//				},
//				LocalDiagnosticsAccess: &mobile.NetworkPacketCoreControlPlaneLocalDiagnosticsAccessArgs{
//					AuthenticationType: pulumi.String("AAD"),
//				},
//				Platform: &mobile.NetworkPacketCoreControlPlanePlatformArgs{
//					Type:         pulumi.String("AKS-HCI"),
//					EdgeDeviceId: exampleDevice.ID(),
//				},
//				InteroperabilitySettingsJson: pulumi.String(json0),
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("value"),
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
// Mobile Network Packet Core Control Plane can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:mobile/networkPacketCoreControlPlane:NetworkPacketCoreControlPlane example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/packetCoreControlPlanes/packetCoreControlPlane1
//
// ```
type NetworkPacketCoreControlPlane struct {
	pulumi.CustomResourceState

	// The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Address pulumi.StringPtrOutput `pulumi:"controlPlaneAccessIpv4Address"`
	// The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Gateway pulumi.StringPtrOutput `pulumi:"controlPlaneAccessIpv4Gateway"`
	// The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Subnet pulumi.StringPtrOutput `pulumi:"controlPlaneAccessIpv4Subnet"`
	// Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessName pulumi.StringPtrOutput `pulumi:"controlPlaneAccessName"`
	// The core network technology generation. Possible values are `EPG` and `5GC`.
	CoreNetworkTechnology pulumi.StringPtrOutput `pulumi:"coreNetworkTechnology"`
	// An `identity` block as defined below.
	Identity NetworkPacketCoreControlPlaneIdentityPtrOutput `pulumi:"identity"`
	// Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
	InteroperabilitySettingsJson pulumi.StringPtrOutput `pulumi:"interoperabilitySettingsJson"`
	// One or more `localDiagnosticsAccess` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
	LocalDiagnosticsAccess NetworkPacketCoreControlPlaneLocalDiagnosticsAccessOutput `pulumi:"localDiagnosticsAccess"`
	// Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A `platform` block as defined below.
	Platform NetworkPacketCoreControlPlanePlatformPtrOutput `pulumi:"platform"`
	// Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
	SiteIds pulumi.StringArrayOutput `pulumi:"siteIds"`
	// The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
	Sku pulumi.StringOutput `pulumi:"sku"`
	// Specifies the version of the packet core software that is deployed.
	SoftwareVersion pulumi.StringPtrOutput `pulumi:"softwareVersion"`
	// A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
	UserEquipmentMtuInBytes pulumi.IntPtrOutput `pulumi:"userEquipmentMtuInBytes"`
}

// NewNetworkPacketCoreControlPlane registers a new resource with the given unique name, arguments, and options.
func NewNetworkPacketCoreControlPlane(ctx *pulumi.Context,
	name string, args *NetworkPacketCoreControlPlaneArgs, opts ...pulumi.ResourceOption) (*NetworkPacketCoreControlPlane, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LocalDiagnosticsAccess == nil {
		return nil, errors.New("invalid value for required argument 'LocalDiagnosticsAccess'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.SiteIds == nil {
		return nil, errors.New("invalid value for required argument 'SiteIds'")
	}
	if args.Sku == nil {
		return nil, errors.New("invalid value for required argument 'Sku'")
	}
	var resource NetworkPacketCoreControlPlane
	err := ctx.RegisterResource("azure:mobile/networkPacketCoreControlPlane:NetworkPacketCoreControlPlane", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkPacketCoreControlPlane gets an existing NetworkPacketCoreControlPlane resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkPacketCoreControlPlane(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkPacketCoreControlPlaneState, opts ...pulumi.ResourceOption) (*NetworkPacketCoreControlPlane, error) {
	var resource NetworkPacketCoreControlPlane
	err := ctx.ReadResource("azure:mobile/networkPacketCoreControlPlane:NetworkPacketCoreControlPlane", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkPacketCoreControlPlane resources.
type networkPacketCoreControlPlaneState struct {
	// The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Address *string `pulumi:"controlPlaneAccessIpv4Address"`
	// The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Gateway *string `pulumi:"controlPlaneAccessIpv4Gateway"`
	// The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Subnet *string `pulumi:"controlPlaneAccessIpv4Subnet"`
	// Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessName *string `pulumi:"controlPlaneAccessName"`
	// The core network technology generation. Possible values are `EPG` and `5GC`.
	CoreNetworkTechnology *string `pulumi:"coreNetworkTechnology"`
	// An `identity` block as defined below.
	Identity *NetworkPacketCoreControlPlaneIdentity `pulumi:"identity"`
	// Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
	InteroperabilitySettingsJson *string `pulumi:"interoperabilitySettingsJson"`
	// One or more `localDiagnosticsAccess` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
	LocalDiagnosticsAccess *NetworkPacketCoreControlPlaneLocalDiagnosticsAccess `pulumi:"localDiagnosticsAccess"`
	// Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Location *string `pulumi:"location"`
	// Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Name *string `pulumi:"name"`
	// A `platform` block as defined below.
	Platform *NetworkPacketCoreControlPlanePlatform `pulumi:"platform"`
	// Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
	SiteIds []string `pulumi:"siteIds"`
	// The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
	Sku *string `pulumi:"sku"`
	// Specifies the version of the packet core software that is deployed.
	SoftwareVersion *string `pulumi:"softwareVersion"`
	// A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
	UserEquipmentMtuInBytes *int `pulumi:"userEquipmentMtuInBytes"`
}

type NetworkPacketCoreControlPlaneState struct {
	// The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Address pulumi.StringPtrInput
	// The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Gateway pulumi.StringPtrInput
	// The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Subnet pulumi.StringPtrInput
	// Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessName pulumi.StringPtrInput
	// The core network technology generation. Possible values are `EPG` and `5GC`.
	CoreNetworkTechnology pulumi.StringPtrInput
	// An `identity` block as defined below.
	Identity NetworkPacketCoreControlPlaneIdentityPtrInput
	// Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
	InteroperabilitySettingsJson pulumi.StringPtrInput
	// One or more `localDiagnosticsAccess` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
	LocalDiagnosticsAccess NetworkPacketCoreControlPlaneLocalDiagnosticsAccessPtrInput
	// Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Location pulumi.StringPtrInput
	// Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Name pulumi.StringPtrInput
	// A `platform` block as defined below.
	Platform NetworkPacketCoreControlPlanePlatformPtrInput
	// Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
	SiteIds pulumi.StringArrayInput
	// The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
	Sku pulumi.StringPtrInput
	// Specifies the version of the packet core software that is deployed.
	SoftwareVersion pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
	Tags pulumi.StringMapInput
	// Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
	UserEquipmentMtuInBytes pulumi.IntPtrInput
}

func (NetworkPacketCoreControlPlaneState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkPacketCoreControlPlaneState)(nil)).Elem()
}

type networkPacketCoreControlPlaneArgs struct {
	// The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Address *string `pulumi:"controlPlaneAccessIpv4Address"`
	// The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Gateway *string `pulumi:"controlPlaneAccessIpv4Gateway"`
	// The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Subnet *string `pulumi:"controlPlaneAccessIpv4Subnet"`
	// Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessName *string `pulumi:"controlPlaneAccessName"`
	// The core network technology generation. Possible values are `EPG` and `5GC`.
	CoreNetworkTechnology *string `pulumi:"coreNetworkTechnology"`
	// An `identity` block as defined below.
	Identity *NetworkPacketCoreControlPlaneIdentity `pulumi:"identity"`
	// Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
	InteroperabilitySettingsJson *string `pulumi:"interoperabilitySettingsJson"`
	// One or more `localDiagnosticsAccess` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
	LocalDiagnosticsAccess NetworkPacketCoreControlPlaneLocalDiagnosticsAccess `pulumi:"localDiagnosticsAccess"`
	// Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Location *string `pulumi:"location"`
	// Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Name *string `pulumi:"name"`
	// A `platform` block as defined below.
	Platform *NetworkPacketCoreControlPlanePlatform `pulumi:"platform"`
	// Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
	SiteIds []string `pulumi:"siteIds"`
	// The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
	Sku string `pulumi:"sku"`
	// Specifies the version of the packet core software that is deployed.
	SoftwareVersion *string `pulumi:"softwareVersion"`
	// A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
	UserEquipmentMtuInBytes *int `pulumi:"userEquipmentMtuInBytes"`
}

// The set of arguments for constructing a NetworkPacketCoreControlPlane resource.
type NetworkPacketCoreControlPlaneArgs struct {
	// The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Address pulumi.StringPtrInput
	// The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Gateway pulumi.StringPtrInput
	// The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessIpv4Subnet pulumi.StringPtrInput
	// Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
	ControlPlaneAccessName pulumi.StringPtrInput
	// The core network technology generation. Possible values are `EPG` and `5GC`.
	CoreNetworkTechnology pulumi.StringPtrInput
	// An `identity` block as defined below.
	Identity NetworkPacketCoreControlPlaneIdentityPtrInput
	// Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
	InteroperabilitySettingsJson pulumi.StringPtrInput
	// One or more `localDiagnosticsAccess` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
	LocalDiagnosticsAccess NetworkPacketCoreControlPlaneLocalDiagnosticsAccessInput
	// Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Location pulumi.StringPtrInput
	// Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	Name pulumi.StringPtrInput
	// A `platform` block as defined below.
	Platform NetworkPacketCoreControlPlanePlatformPtrInput
	// Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
	ResourceGroupName pulumi.StringInput
	// A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
	SiteIds pulumi.StringArrayInput
	// The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
	Sku pulumi.StringInput
	// Specifies the version of the packet core software that is deployed.
	SoftwareVersion pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
	Tags pulumi.StringMapInput
	// Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
	UserEquipmentMtuInBytes pulumi.IntPtrInput
}

func (NetworkPacketCoreControlPlaneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkPacketCoreControlPlaneArgs)(nil)).Elem()
}

type NetworkPacketCoreControlPlaneInput interface {
	pulumi.Input

	ToNetworkPacketCoreControlPlaneOutput() NetworkPacketCoreControlPlaneOutput
	ToNetworkPacketCoreControlPlaneOutputWithContext(ctx context.Context) NetworkPacketCoreControlPlaneOutput
}

func (*NetworkPacketCoreControlPlane) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkPacketCoreControlPlane)(nil)).Elem()
}

func (i *NetworkPacketCoreControlPlane) ToNetworkPacketCoreControlPlaneOutput() NetworkPacketCoreControlPlaneOutput {
	return i.ToNetworkPacketCoreControlPlaneOutputWithContext(context.Background())
}

func (i *NetworkPacketCoreControlPlane) ToNetworkPacketCoreControlPlaneOutputWithContext(ctx context.Context) NetworkPacketCoreControlPlaneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPacketCoreControlPlaneOutput)
}

// NetworkPacketCoreControlPlaneArrayInput is an input type that accepts NetworkPacketCoreControlPlaneArray and NetworkPacketCoreControlPlaneArrayOutput values.
// You can construct a concrete instance of `NetworkPacketCoreControlPlaneArrayInput` via:
//
//	NetworkPacketCoreControlPlaneArray{ NetworkPacketCoreControlPlaneArgs{...} }
type NetworkPacketCoreControlPlaneArrayInput interface {
	pulumi.Input

	ToNetworkPacketCoreControlPlaneArrayOutput() NetworkPacketCoreControlPlaneArrayOutput
	ToNetworkPacketCoreControlPlaneArrayOutputWithContext(context.Context) NetworkPacketCoreControlPlaneArrayOutput
}

type NetworkPacketCoreControlPlaneArray []NetworkPacketCoreControlPlaneInput

func (NetworkPacketCoreControlPlaneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkPacketCoreControlPlane)(nil)).Elem()
}

func (i NetworkPacketCoreControlPlaneArray) ToNetworkPacketCoreControlPlaneArrayOutput() NetworkPacketCoreControlPlaneArrayOutput {
	return i.ToNetworkPacketCoreControlPlaneArrayOutputWithContext(context.Background())
}

func (i NetworkPacketCoreControlPlaneArray) ToNetworkPacketCoreControlPlaneArrayOutputWithContext(ctx context.Context) NetworkPacketCoreControlPlaneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPacketCoreControlPlaneArrayOutput)
}

// NetworkPacketCoreControlPlaneMapInput is an input type that accepts NetworkPacketCoreControlPlaneMap and NetworkPacketCoreControlPlaneMapOutput values.
// You can construct a concrete instance of `NetworkPacketCoreControlPlaneMapInput` via:
//
//	NetworkPacketCoreControlPlaneMap{ "key": NetworkPacketCoreControlPlaneArgs{...} }
type NetworkPacketCoreControlPlaneMapInput interface {
	pulumi.Input

	ToNetworkPacketCoreControlPlaneMapOutput() NetworkPacketCoreControlPlaneMapOutput
	ToNetworkPacketCoreControlPlaneMapOutputWithContext(context.Context) NetworkPacketCoreControlPlaneMapOutput
}

type NetworkPacketCoreControlPlaneMap map[string]NetworkPacketCoreControlPlaneInput

func (NetworkPacketCoreControlPlaneMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkPacketCoreControlPlane)(nil)).Elem()
}

func (i NetworkPacketCoreControlPlaneMap) ToNetworkPacketCoreControlPlaneMapOutput() NetworkPacketCoreControlPlaneMapOutput {
	return i.ToNetworkPacketCoreControlPlaneMapOutputWithContext(context.Background())
}

func (i NetworkPacketCoreControlPlaneMap) ToNetworkPacketCoreControlPlaneMapOutputWithContext(ctx context.Context) NetworkPacketCoreControlPlaneMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkPacketCoreControlPlaneMapOutput)
}

type NetworkPacketCoreControlPlaneOutput struct{ *pulumi.OutputState }

func (NetworkPacketCoreControlPlaneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkPacketCoreControlPlane)(nil)).Elem()
}

func (o NetworkPacketCoreControlPlaneOutput) ToNetworkPacketCoreControlPlaneOutput() NetworkPacketCoreControlPlaneOutput {
	return o
}

func (o NetworkPacketCoreControlPlaneOutput) ToNetworkPacketCoreControlPlaneOutputWithContext(ctx context.Context) NetworkPacketCoreControlPlaneOutput {
	return o
}

// The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
func (o NetworkPacketCoreControlPlaneOutput) ControlPlaneAccessIpv4Address() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringPtrOutput { return v.ControlPlaneAccessIpv4Address }).(pulumi.StringPtrOutput)
}

// The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
func (o NetworkPacketCoreControlPlaneOutput) ControlPlaneAccessIpv4Gateway() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringPtrOutput { return v.ControlPlaneAccessIpv4Gateway }).(pulumi.StringPtrOutput)
}

// The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
func (o NetworkPacketCoreControlPlaneOutput) ControlPlaneAccessIpv4Subnet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringPtrOutput { return v.ControlPlaneAccessIpv4Subnet }).(pulumi.StringPtrOutput)
}

// Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
func (o NetworkPacketCoreControlPlaneOutput) ControlPlaneAccessName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringPtrOutput { return v.ControlPlaneAccessName }).(pulumi.StringPtrOutput)
}

// The core network technology generation. Possible values are `EPG` and `5GC`.
func (o NetworkPacketCoreControlPlaneOutput) CoreNetworkTechnology() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringPtrOutput { return v.CoreNetworkTechnology }).(pulumi.StringPtrOutput)
}

// An `identity` block as defined below.
func (o NetworkPacketCoreControlPlaneOutput) Identity() NetworkPacketCoreControlPlaneIdentityPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) NetworkPacketCoreControlPlaneIdentityPtrOutput {
		return v.Identity
	}).(NetworkPacketCoreControlPlaneIdentityPtrOutput)
}

// Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
func (o NetworkPacketCoreControlPlaneOutput) InteroperabilitySettingsJson() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringPtrOutput { return v.InteroperabilitySettingsJson }).(pulumi.StringPtrOutput)
}

// One or more `localDiagnosticsAccess` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
func (o NetworkPacketCoreControlPlaneOutput) LocalDiagnosticsAccess() NetworkPacketCoreControlPlaneLocalDiagnosticsAccessOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) NetworkPacketCoreControlPlaneLocalDiagnosticsAccessOutput {
		return v.LocalDiagnosticsAccess
	}).(NetworkPacketCoreControlPlaneLocalDiagnosticsAccessOutput)
}

// Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
func (o NetworkPacketCoreControlPlaneOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
func (o NetworkPacketCoreControlPlaneOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A `platform` block as defined below.
func (o NetworkPacketCoreControlPlaneOutput) Platform() NetworkPacketCoreControlPlanePlatformPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) NetworkPacketCoreControlPlanePlatformPtrOutput {
		return v.Platform
	}).(NetworkPacketCoreControlPlanePlatformPtrOutput)
}

// Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
func (o NetworkPacketCoreControlPlaneOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
func (o NetworkPacketCoreControlPlaneOutput) SiteIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringArrayOutput { return v.SiteIds }).(pulumi.StringArrayOutput)
}

// The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
func (o NetworkPacketCoreControlPlaneOutput) Sku() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringOutput { return v.Sku }).(pulumi.StringOutput)
}

// Specifies the version of the packet core software that is deployed.
func (o NetworkPacketCoreControlPlaneOutput) SoftwareVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringPtrOutput { return v.SoftwareVersion }).(pulumi.StringPtrOutput)
}

// A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
func (o NetworkPacketCoreControlPlaneOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
func (o NetworkPacketCoreControlPlaneOutput) UserEquipmentMtuInBytes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *NetworkPacketCoreControlPlane) pulumi.IntPtrOutput { return v.UserEquipmentMtuInBytes }).(pulumi.IntPtrOutput)
}

type NetworkPacketCoreControlPlaneArrayOutput struct{ *pulumi.OutputState }

func (NetworkPacketCoreControlPlaneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkPacketCoreControlPlane)(nil)).Elem()
}

func (o NetworkPacketCoreControlPlaneArrayOutput) ToNetworkPacketCoreControlPlaneArrayOutput() NetworkPacketCoreControlPlaneArrayOutput {
	return o
}

func (o NetworkPacketCoreControlPlaneArrayOutput) ToNetworkPacketCoreControlPlaneArrayOutputWithContext(ctx context.Context) NetworkPacketCoreControlPlaneArrayOutput {
	return o
}

func (o NetworkPacketCoreControlPlaneArrayOutput) Index(i pulumi.IntInput) NetworkPacketCoreControlPlaneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkPacketCoreControlPlane {
		return vs[0].([]*NetworkPacketCoreControlPlane)[vs[1].(int)]
	}).(NetworkPacketCoreControlPlaneOutput)
}

type NetworkPacketCoreControlPlaneMapOutput struct{ *pulumi.OutputState }

func (NetworkPacketCoreControlPlaneMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkPacketCoreControlPlane)(nil)).Elem()
}

func (o NetworkPacketCoreControlPlaneMapOutput) ToNetworkPacketCoreControlPlaneMapOutput() NetworkPacketCoreControlPlaneMapOutput {
	return o
}

func (o NetworkPacketCoreControlPlaneMapOutput) ToNetworkPacketCoreControlPlaneMapOutputWithContext(ctx context.Context) NetworkPacketCoreControlPlaneMapOutput {
	return o
}

func (o NetworkPacketCoreControlPlaneMapOutput) MapIndex(k pulumi.StringInput) NetworkPacketCoreControlPlaneOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkPacketCoreControlPlane {
		return vs[0].(map[string]*NetworkPacketCoreControlPlane)[vs[1].(string)]
	}).(NetworkPacketCoreControlPlaneOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPacketCoreControlPlaneInput)(nil)).Elem(), &NetworkPacketCoreControlPlane{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPacketCoreControlPlaneArrayInput)(nil)).Elem(), NetworkPacketCoreControlPlaneArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkPacketCoreControlPlaneMapInput)(nil)).Elem(), NetworkPacketCoreControlPlaneMap{})
	pulumi.RegisterOutputType(NetworkPacketCoreControlPlaneOutput{})
	pulumi.RegisterOutputType(NetworkPacketCoreControlPlaneArrayOutput{})
	pulumi.RegisterOutputType(NetworkPacketCoreControlPlaneMapOutput{})
}
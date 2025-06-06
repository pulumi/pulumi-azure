// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Gallery Application.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/compute"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-rg"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSharedImageGallery, err := compute.NewSharedImageGallery(ctx, "example", &compute.SharedImageGalleryArgs{
//				Name:              pulumi.String("examplegallery"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewGalleryApplication(ctx, "example", &compute.GalleryApplicationArgs{
//				Name:            pulumi.String("example-app"),
//				GalleryId:       exampleSharedImageGallery.ID(),
//				Location:        example.Location,
//				SupportedOsType: pulumi.String("Linux"),
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
// * `Microsoft.Compute`: 2022-03-03
//
// ## Import
//
// Gallery Applications can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:compute/galleryApplication:GalleryApplication example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/galleries/gallery1/applications/galleryApplication1
// ```
type GalleryApplication struct {
	pulumi.CustomResourceState

	// A description of the Gallery Application.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The end of life date in RFC3339 format of the Gallery Application.
	EndOfLifeDate pulumi.StringPtrOutput `pulumi:"endOfLifeDate"`
	// The End User Licence Agreement of the Gallery Application.
	Eula pulumi.StringPtrOutput `pulumi:"eula"`
	// The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
	GalleryId pulumi.StringOutput `pulumi:"galleryId"`
	// The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the Gallery Application. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The URI containing the Privacy Statement associated with the Gallery Application.
	PrivacyStatementUri pulumi.StringPtrOutput `pulumi:"privacyStatementUri"`
	// The URI containing the Release Notes associated with the Gallery Application.
	ReleaseNoteUri pulumi.StringPtrOutput `pulumi:"releaseNoteUri"`
	// The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
	SupportedOsType pulumi.StringOutput `pulumi:"supportedOsType"`
	// A mapping of tags to assign to the Gallery Application.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewGalleryApplication registers a new resource with the given unique name, arguments, and options.
func NewGalleryApplication(ctx *pulumi.Context,
	name string, args *GalleryApplicationArgs, opts ...pulumi.ResourceOption) (*GalleryApplication, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GalleryId == nil {
		return nil, errors.New("invalid value for required argument 'GalleryId'")
	}
	if args.SupportedOsType == nil {
		return nil, errors.New("invalid value for required argument 'SupportedOsType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GalleryApplication
	err := ctx.RegisterResource("azure:compute/galleryApplication:GalleryApplication", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGalleryApplication gets an existing GalleryApplication resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGalleryApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GalleryApplicationState, opts ...pulumi.ResourceOption) (*GalleryApplication, error) {
	var resource GalleryApplication
	err := ctx.ReadResource("azure:compute/galleryApplication:GalleryApplication", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GalleryApplication resources.
type galleryApplicationState struct {
	// A description of the Gallery Application.
	Description *string `pulumi:"description"`
	// The end of life date in RFC3339 format of the Gallery Application.
	EndOfLifeDate *string `pulumi:"endOfLifeDate"`
	// The End User Licence Agreement of the Gallery Application.
	Eula *string `pulumi:"eula"`
	// The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
	GalleryId *string `pulumi:"galleryId"`
	// The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Gallery Application. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The URI containing the Privacy Statement associated with the Gallery Application.
	PrivacyStatementUri *string `pulumi:"privacyStatementUri"`
	// The URI containing the Release Notes associated with the Gallery Application.
	ReleaseNoteUri *string `pulumi:"releaseNoteUri"`
	// The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
	SupportedOsType *string `pulumi:"supportedOsType"`
	// A mapping of tags to assign to the Gallery Application.
	Tags map[string]string `pulumi:"tags"`
}

type GalleryApplicationState struct {
	// A description of the Gallery Application.
	Description pulumi.StringPtrInput
	// The end of life date in RFC3339 format of the Gallery Application.
	EndOfLifeDate pulumi.StringPtrInput
	// The End User Licence Agreement of the Gallery Application.
	Eula pulumi.StringPtrInput
	// The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
	GalleryId pulumi.StringPtrInput
	// The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Gallery Application. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The URI containing the Privacy Statement associated with the Gallery Application.
	PrivacyStatementUri pulumi.StringPtrInput
	// The URI containing the Release Notes associated with the Gallery Application.
	ReleaseNoteUri pulumi.StringPtrInput
	// The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
	SupportedOsType pulumi.StringPtrInput
	// A mapping of tags to assign to the Gallery Application.
	Tags pulumi.StringMapInput
}

func (GalleryApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*galleryApplicationState)(nil)).Elem()
}

type galleryApplicationArgs struct {
	// A description of the Gallery Application.
	Description *string `pulumi:"description"`
	// The end of life date in RFC3339 format of the Gallery Application.
	EndOfLifeDate *string `pulumi:"endOfLifeDate"`
	// The End User Licence Agreement of the Gallery Application.
	Eula *string `pulumi:"eula"`
	// The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
	GalleryId string `pulumi:"galleryId"`
	// The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Gallery Application. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The URI containing the Privacy Statement associated with the Gallery Application.
	PrivacyStatementUri *string `pulumi:"privacyStatementUri"`
	// The URI containing the Release Notes associated with the Gallery Application.
	ReleaseNoteUri *string `pulumi:"releaseNoteUri"`
	// The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
	SupportedOsType string `pulumi:"supportedOsType"`
	// A mapping of tags to assign to the Gallery Application.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a GalleryApplication resource.
type GalleryApplicationArgs struct {
	// A description of the Gallery Application.
	Description pulumi.StringPtrInput
	// The end of life date in RFC3339 format of the Gallery Application.
	EndOfLifeDate pulumi.StringPtrInput
	// The End User Licence Agreement of the Gallery Application.
	Eula pulumi.StringPtrInput
	// The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
	GalleryId pulumi.StringInput
	// The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Gallery Application. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The URI containing the Privacy Statement associated with the Gallery Application.
	PrivacyStatementUri pulumi.StringPtrInput
	// The URI containing the Release Notes associated with the Gallery Application.
	ReleaseNoteUri pulumi.StringPtrInput
	// The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
	SupportedOsType pulumi.StringInput
	// A mapping of tags to assign to the Gallery Application.
	Tags pulumi.StringMapInput
}

func (GalleryApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*galleryApplicationArgs)(nil)).Elem()
}

type GalleryApplicationInput interface {
	pulumi.Input

	ToGalleryApplicationOutput() GalleryApplicationOutput
	ToGalleryApplicationOutputWithContext(ctx context.Context) GalleryApplicationOutput
}

func (*GalleryApplication) ElementType() reflect.Type {
	return reflect.TypeOf((**GalleryApplication)(nil)).Elem()
}

func (i *GalleryApplication) ToGalleryApplicationOutput() GalleryApplicationOutput {
	return i.ToGalleryApplicationOutputWithContext(context.Background())
}

func (i *GalleryApplication) ToGalleryApplicationOutputWithContext(ctx context.Context) GalleryApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GalleryApplicationOutput)
}

// GalleryApplicationArrayInput is an input type that accepts GalleryApplicationArray and GalleryApplicationArrayOutput values.
// You can construct a concrete instance of `GalleryApplicationArrayInput` via:
//
//	GalleryApplicationArray{ GalleryApplicationArgs{...} }
type GalleryApplicationArrayInput interface {
	pulumi.Input

	ToGalleryApplicationArrayOutput() GalleryApplicationArrayOutput
	ToGalleryApplicationArrayOutputWithContext(context.Context) GalleryApplicationArrayOutput
}

type GalleryApplicationArray []GalleryApplicationInput

func (GalleryApplicationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GalleryApplication)(nil)).Elem()
}

func (i GalleryApplicationArray) ToGalleryApplicationArrayOutput() GalleryApplicationArrayOutput {
	return i.ToGalleryApplicationArrayOutputWithContext(context.Background())
}

func (i GalleryApplicationArray) ToGalleryApplicationArrayOutputWithContext(ctx context.Context) GalleryApplicationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GalleryApplicationArrayOutput)
}

// GalleryApplicationMapInput is an input type that accepts GalleryApplicationMap and GalleryApplicationMapOutput values.
// You can construct a concrete instance of `GalleryApplicationMapInput` via:
//
//	GalleryApplicationMap{ "key": GalleryApplicationArgs{...} }
type GalleryApplicationMapInput interface {
	pulumi.Input

	ToGalleryApplicationMapOutput() GalleryApplicationMapOutput
	ToGalleryApplicationMapOutputWithContext(context.Context) GalleryApplicationMapOutput
}

type GalleryApplicationMap map[string]GalleryApplicationInput

func (GalleryApplicationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GalleryApplication)(nil)).Elem()
}

func (i GalleryApplicationMap) ToGalleryApplicationMapOutput() GalleryApplicationMapOutput {
	return i.ToGalleryApplicationMapOutputWithContext(context.Background())
}

func (i GalleryApplicationMap) ToGalleryApplicationMapOutputWithContext(ctx context.Context) GalleryApplicationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GalleryApplicationMapOutput)
}

type GalleryApplicationOutput struct{ *pulumi.OutputState }

func (GalleryApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GalleryApplication)(nil)).Elem()
}

func (o GalleryApplicationOutput) ToGalleryApplicationOutput() GalleryApplicationOutput {
	return o
}

func (o GalleryApplicationOutput) ToGalleryApplicationOutputWithContext(ctx context.Context) GalleryApplicationOutput {
	return o
}

// A description of the Gallery Application.
func (o GalleryApplicationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The end of life date in RFC3339 format of the Gallery Application.
func (o GalleryApplicationOutput) EndOfLifeDate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringPtrOutput { return v.EndOfLifeDate }).(pulumi.StringPtrOutput)
}

// The End User Licence Agreement of the Gallery Application.
func (o GalleryApplicationOutput) Eula() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringPtrOutput { return v.Eula }).(pulumi.StringPtrOutput)
}

// The ID of the Shared Image Gallery. Changing this forces a new resource to be created.
func (o GalleryApplicationOutput) GalleryId() pulumi.StringOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringOutput { return v.GalleryId }).(pulumi.StringOutput)
}

// The Azure Region where the Gallery Application exists. Changing this forces a new resource to be created.
func (o GalleryApplicationOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the Gallery Application. Changing this forces a new resource to be created.
func (o GalleryApplicationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The URI containing the Privacy Statement associated with the Gallery Application.
func (o GalleryApplicationOutput) PrivacyStatementUri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringPtrOutput { return v.PrivacyStatementUri }).(pulumi.StringPtrOutput)
}

// The URI containing the Release Notes associated with the Gallery Application.
func (o GalleryApplicationOutput) ReleaseNoteUri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringPtrOutput { return v.ReleaseNoteUri }).(pulumi.StringPtrOutput)
}

// The type of the Operating System supported for the Gallery Application. Possible values are `Linux` and `Windows`. Changing this forces a new resource to be created.
func (o GalleryApplicationOutput) SupportedOsType() pulumi.StringOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringOutput { return v.SupportedOsType }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the Gallery Application.
func (o GalleryApplicationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *GalleryApplication) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type GalleryApplicationArrayOutput struct{ *pulumi.OutputState }

func (GalleryApplicationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GalleryApplication)(nil)).Elem()
}

func (o GalleryApplicationArrayOutput) ToGalleryApplicationArrayOutput() GalleryApplicationArrayOutput {
	return o
}

func (o GalleryApplicationArrayOutput) ToGalleryApplicationArrayOutputWithContext(ctx context.Context) GalleryApplicationArrayOutput {
	return o
}

func (o GalleryApplicationArrayOutput) Index(i pulumi.IntInput) GalleryApplicationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GalleryApplication {
		return vs[0].([]*GalleryApplication)[vs[1].(int)]
	}).(GalleryApplicationOutput)
}

type GalleryApplicationMapOutput struct{ *pulumi.OutputState }

func (GalleryApplicationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GalleryApplication)(nil)).Elem()
}

func (o GalleryApplicationMapOutput) ToGalleryApplicationMapOutput() GalleryApplicationMapOutput {
	return o
}

func (o GalleryApplicationMapOutput) ToGalleryApplicationMapOutputWithContext(ctx context.Context) GalleryApplicationMapOutput {
	return o
}

func (o GalleryApplicationMapOutput) MapIndex(k pulumi.StringInput) GalleryApplicationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GalleryApplication {
		return vs[0].(map[string]*GalleryApplication)[vs[1].(string)]
	}).(GalleryApplicationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GalleryApplicationInput)(nil)).Elem(), &GalleryApplication{})
	pulumi.RegisterInputType(reflect.TypeOf((*GalleryApplicationArrayInput)(nil)).Elem(), GalleryApplicationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GalleryApplicationMapInput)(nil)).Elem(), GalleryApplicationMap{})
	pulumi.RegisterOutputType(GalleryApplicationOutput{})
	pulumi.RegisterOutputType(GalleryApplicationArrayOutput{})
	pulumi.RegisterOutputType(GalleryApplicationMapOutput{})
}

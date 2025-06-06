// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appinsights

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Application Insights API key.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appinsights"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("tf-test"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleInsights, err := appinsights.NewInsights(ctx, "example", &appinsights.InsightsArgs{
//				Name:              pulumi.String("tf-test-appinsights"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				ApplicationType:   pulumi.String("web"),
//			})
//			if err != nil {
//				return err
//			}
//			readTelemetry, err := appinsights.NewApiKey(ctx, "read_telemetry", &appinsights.ApiKeyArgs{
//				Name:                  pulumi.String("tf-test-appinsights-read-telemetry-api-key"),
//				ApplicationInsightsId: exampleInsights.ID(),
//				ReadPermissions: pulumi.StringArray{
//					pulumi.String("aggregate"),
//					pulumi.String("api"),
//					pulumi.String("draft"),
//					pulumi.String("extendqueries"),
//					pulumi.String("search"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			writeAnnotations, err := appinsights.NewApiKey(ctx, "write_annotations", &appinsights.ApiKeyArgs{
//				Name:                  pulumi.String("tf-test-appinsights-write-annotations-api-key"),
//				ApplicationInsightsId: exampleInsights.ID(),
//				WritePermissions: pulumi.StringArray{
//					pulumi.String("annotations"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			authenticateSdkControlChannel, err := appinsights.NewApiKey(ctx, "authenticate_sdk_control_channel", &appinsights.ApiKeyArgs{
//				Name:                  pulumi.String("tf-test-appinsights-authenticate-sdk-control-channel-api-key"),
//				ApplicationInsightsId: exampleInsights.ID(),
//				ReadPermissions: pulumi.StringArray{
//					pulumi.String("agentconfig"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			fullPermissions, err := appinsights.NewApiKey(ctx, "full_permissions", &appinsights.ApiKeyArgs{
//				Name:                  pulumi.String("tf-test-appinsights-full-permissions-api-key"),
//				ApplicationInsightsId: exampleInsights.ID(),
//				ReadPermissions: pulumi.StringArray{
//					pulumi.String("agentconfig"),
//					pulumi.String("aggregate"),
//					pulumi.String("api"),
//					pulumi.String("draft"),
//					pulumi.String("extendqueries"),
//					pulumi.String("search"),
//				},
//				WritePermissions: pulumi.StringArray{
//					pulumi.String("annotations"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("readTelemetryApiKey", readTelemetry.ApiKey)
//			ctx.Export("writeAnnotationsApiKey", writeAnnotations.ApiKey)
//			ctx.Export("authenticateSdkControlChannel", authenticateSdkControlChannel.ApiKey)
//			ctx.Export("fullPermissionsApiKey", fullPermissions.ApiKey)
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
// * `Microsoft.Insights`: 2015-05-01
//
// ## Import
//
// Application Insights API keys can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:appinsights/apiKey:ApiKey my_key /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Insights/components/instance1/apiKeys/00000000-0000-0000-0000-000000000000
// ```
type ApiKey struct {
	pulumi.CustomResourceState

	// The API Key secret (Sensitive).
	ApiKey pulumi.StringOutput `pulumi:"apiKey"`
	// The ID of the Application Insights component on which the API key operates. Changing this forces a new resource to be created.
	ApplicationInsightsId pulumi.StringOutput `pulumi:"applicationInsightsId"`
	// Specifies the name of the Application Insights API key. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the list of read permissions granted to the API key. Valid values are `agentconfig`, `aggregate`, `api`, `draft`, `extendqueries`, `search`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	ReadPermissions pulumi.StringArrayOutput `pulumi:"readPermissions"`
	// Specifies the list of write permissions granted to the API key. Valid values are `annotations`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one read or write permission must be defined.
	WritePermissions pulumi.StringArrayOutput `pulumi:"writePermissions"`
}

// NewApiKey registers a new resource with the given unique name, arguments, and options.
func NewApiKey(ctx *pulumi.Context,
	name string, args *ApiKeyArgs, opts ...pulumi.ResourceOption) (*ApiKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationInsightsId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationInsightsId'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApiKey
	err := ctx.RegisterResource("azure:appinsights/apiKey:ApiKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiKey gets an existing ApiKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiKeyState, opts ...pulumi.ResourceOption) (*ApiKey, error) {
	var resource ApiKey
	err := ctx.ReadResource("azure:appinsights/apiKey:ApiKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiKey resources.
type apiKeyState struct {
	// The API Key secret (Sensitive).
	ApiKey *string `pulumi:"apiKey"`
	// The ID of the Application Insights component on which the API key operates. Changing this forces a new resource to be created.
	ApplicationInsightsId *string `pulumi:"applicationInsightsId"`
	// Specifies the name of the Application Insights API key. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the list of read permissions granted to the API key. Valid values are `agentconfig`, `aggregate`, `api`, `draft`, `extendqueries`, `search`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	ReadPermissions []string `pulumi:"readPermissions"`
	// Specifies the list of write permissions granted to the API key. Valid values are `annotations`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one read or write permission must be defined.
	WritePermissions []string `pulumi:"writePermissions"`
}

type ApiKeyState struct {
	// The API Key secret (Sensitive).
	ApiKey pulumi.StringPtrInput
	// The ID of the Application Insights component on which the API key operates. Changing this forces a new resource to be created.
	ApplicationInsightsId pulumi.StringPtrInput
	// Specifies the name of the Application Insights API key. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the list of read permissions granted to the API key. Valid values are `agentconfig`, `aggregate`, `api`, `draft`, `extendqueries`, `search`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	ReadPermissions pulumi.StringArrayInput
	// Specifies the list of write permissions granted to the API key. Valid values are `annotations`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one read or write permission must be defined.
	WritePermissions pulumi.StringArrayInput
}

func (ApiKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiKeyState)(nil)).Elem()
}

type apiKeyArgs struct {
	// The ID of the Application Insights component on which the API key operates. Changing this forces a new resource to be created.
	ApplicationInsightsId string `pulumi:"applicationInsightsId"`
	// Specifies the name of the Application Insights API key. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the list of read permissions granted to the API key. Valid values are `agentconfig`, `aggregate`, `api`, `draft`, `extendqueries`, `search`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	ReadPermissions []string `pulumi:"readPermissions"`
	// Specifies the list of write permissions granted to the API key. Valid values are `annotations`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one read or write permission must be defined.
	WritePermissions []string `pulumi:"writePermissions"`
}

// The set of arguments for constructing a ApiKey resource.
type ApiKeyArgs struct {
	// The ID of the Application Insights component on which the API key operates. Changing this forces a new resource to be created.
	ApplicationInsightsId pulumi.StringInput
	// Specifies the name of the Application Insights API key. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the list of read permissions granted to the API key. Valid values are `agentconfig`, `aggregate`, `api`, `draft`, `extendqueries`, `search`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	ReadPermissions pulumi.StringArrayInput
	// Specifies the list of write permissions granted to the API key. Valid values are `annotations`. Please note these values are case sensitive. Changing this forces a new resource to be created.
	//
	// > **Note:** At least one read or write permission must be defined.
	WritePermissions pulumi.StringArrayInput
}

func (ApiKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiKeyArgs)(nil)).Elem()
}

type ApiKeyInput interface {
	pulumi.Input

	ToApiKeyOutput() ApiKeyOutput
	ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput
}

func (*ApiKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiKey)(nil)).Elem()
}

func (i *ApiKey) ToApiKeyOutput() ApiKeyOutput {
	return i.ToApiKeyOutputWithContext(context.Background())
}

func (i *ApiKey) ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyOutput)
}

// ApiKeyArrayInput is an input type that accepts ApiKeyArray and ApiKeyArrayOutput values.
// You can construct a concrete instance of `ApiKeyArrayInput` via:
//
//	ApiKeyArray{ ApiKeyArgs{...} }
type ApiKeyArrayInput interface {
	pulumi.Input

	ToApiKeyArrayOutput() ApiKeyArrayOutput
	ToApiKeyArrayOutputWithContext(context.Context) ApiKeyArrayOutput
}

type ApiKeyArray []ApiKeyInput

func (ApiKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiKey)(nil)).Elem()
}

func (i ApiKeyArray) ToApiKeyArrayOutput() ApiKeyArrayOutput {
	return i.ToApiKeyArrayOutputWithContext(context.Background())
}

func (i ApiKeyArray) ToApiKeyArrayOutputWithContext(ctx context.Context) ApiKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyArrayOutput)
}

// ApiKeyMapInput is an input type that accepts ApiKeyMap and ApiKeyMapOutput values.
// You can construct a concrete instance of `ApiKeyMapInput` via:
//
//	ApiKeyMap{ "key": ApiKeyArgs{...} }
type ApiKeyMapInput interface {
	pulumi.Input

	ToApiKeyMapOutput() ApiKeyMapOutput
	ToApiKeyMapOutputWithContext(context.Context) ApiKeyMapOutput
}

type ApiKeyMap map[string]ApiKeyInput

func (ApiKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiKey)(nil)).Elem()
}

func (i ApiKeyMap) ToApiKeyMapOutput() ApiKeyMapOutput {
	return i.ToApiKeyMapOutputWithContext(context.Background())
}

func (i ApiKeyMap) ToApiKeyMapOutputWithContext(ctx context.Context) ApiKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyMapOutput)
}

type ApiKeyOutput struct{ *pulumi.OutputState }

func (ApiKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiKey)(nil)).Elem()
}

func (o ApiKeyOutput) ToApiKeyOutput() ApiKeyOutput {
	return o
}

func (o ApiKeyOutput) ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput {
	return o
}

// The API Key secret (Sensitive).
func (o ApiKeyOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.ApiKey }).(pulumi.StringOutput)
}

// The ID of the Application Insights component on which the API key operates. Changing this forces a new resource to be created.
func (o ApiKeyOutput) ApplicationInsightsId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.ApplicationInsightsId }).(pulumi.StringOutput)
}

// Specifies the name of the Application Insights API key. Changing this forces a new resource to be created.
func (o ApiKeyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the list of read permissions granted to the API key. Valid values are `agentconfig`, `aggregate`, `api`, `draft`, `extendqueries`, `search`. Please note these values are case sensitive. Changing this forces a new resource to be created.
func (o ApiKeyOutput) ReadPermissions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringArrayOutput { return v.ReadPermissions }).(pulumi.StringArrayOutput)
}

// Specifies the list of write permissions granted to the API key. Valid values are `annotations`. Please note these values are case sensitive. Changing this forces a new resource to be created.
//
// > **Note:** At least one read or write permission must be defined.
func (o ApiKeyOutput) WritePermissions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringArrayOutput { return v.WritePermissions }).(pulumi.StringArrayOutput)
}

type ApiKeyArrayOutput struct{ *pulumi.OutputState }

func (ApiKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiKey)(nil)).Elem()
}

func (o ApiKeyArrayOutput) ToApiKeyArrayOutput() ApiKeyArrayOutput {
	return o
}

func (o ApiKeyArrayOutput) ToApiKeyArrayOutputWithContext(ctx context.Context) ApiKeyArrayOutput {
	return o
}

func (o ApiKeyArrayOutput) Index(i pulumi.IntInput) ApiKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiKey {
		return vs[0].([]*ApiKey)[vs[1].(int)]
	}).(ApiKeyOutput)
}

type ApiKeyMapOutput struct{ *pulumi.OutputState }

func (ApiKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiKey)(nil)).Elem()
}

func (o ApiKeyMapOutput) ToApiKeyMapOutput() ApiKeyMapOutput {
	return o
}

func (o ApiKeyMapOutput) ToApiKeyMapOutputWithContext(ctx context.Context) ApiKeyMapOutput {
	return o
}

func (o ApiKeyMapOutput) MapIndex(k pulumi.StringInput) ApiKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiKey {
		return vs[0].(map[string]*ApiKey)[vs[1].(string)]
	}).(ApiKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyInput)(nil)).Elem(), &ApiKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyArrayInput)(nil)).Elem(), ApiKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyMapInput)(nil)).Elem(), ApiKeyMap{})
	pulumi.RegisterOutputType(ApiKeyOutput{})
	pulumi.RegisterOutputType(ApiKeyArrayOutput{})
	pulumi.RegisterOutputType(ApiKeyMapOutput{})
}

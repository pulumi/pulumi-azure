// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appservice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages a service connector for function app.
//
// ## Import
//
// Service Connector for app service can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:appservice/appConnection:AppConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Web/sites/webapp/providers/Microsoft.ServiceLinker/linkers/serviceconnector1
//
// ```
type AppConnection struct {
	pulumi.CustomResourceState

	// The authentication info. An `authentication` block as defined below.
	//
	// > **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
	Authentication AppConnectionAuthenticationOutput `pulumi:"authentication"`
	// The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
	ClientType pulumi.StringPtrOutput `pulumi:"clientType"`
	// The ID of the data source function app. Changing this forces a new resource to be created.
	FunctionAppId pulumi.StringOutput `pulumi:"functionAppId"`
	// The name of the service connection. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// An option to store secret value in secure place. An `secretStore` block as defined below.
	SecretStore AppConnectionSecretStorePtrOutput `pulumi:"secretStore"`
	// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
	TargetResourceId pulumi.StringOutput `pulumi:"targetResourceId"`
	// The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
	VnetSolution pulumi.StringPtrOutput `pulumi:"vnetSolution"`
}

// NewAppConnection registers a new resource with the given unique name, arguments, and options.
func NewAppConnection(ctx *pulumi.Context,
	name string, args *AppConnectionArgs, opts ...pulumi.ResourceOption) (*AppConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Authentication == nil {
		return nil, errors.New("invalid value for required argument 'Authentication'")
	}
	if args.FunctionAppId == nil {
		return nil, errors.New("invalid value for required argument 'FunctionAppId'")
	}
	if args.TargetResourceId == nil {
		return nil, errors.New("invalid value for required argument 'TargetResourceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AppConnection
	err := ctx.RegisterResource("azure:appservice/appConnection:AppConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppConnection gets an existing AppConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppConnectionState, opts ...pulumi.ResourceOption) (*AppConnection, error) {
	var resource AppConnection
	err := ctx.ReadResource("azure:appservice/appConnection:AppConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppConnection resources.
type appConnectionState struct {
	// The authentication info. An `authentication` block as defined below.
	//
	// > **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
	Authentication *AppConnectionAuthentication `pulumi:"authentication"`
	// The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
	ClientType *string `pulumi:"clientType"`
	// The ID of the data source function app. Changing this forces a new resource to be created.
	FunctionAppId *string `pulumi:"functionAppId"`
	// The name of the service connection. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// An option to store secret value in secure place. An `secretStore` block as defined below.
	SecretStore *AppConnectionSecretStore `pulumi:"secretStore"`
	// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
	TargetResourceId *string `pulumi:"targetResourceId"`
	// The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
	VnetSolution *string `pulumi:"vnetSolution"`
}

type AppConnectionState struct {
	// The authentication info. An `authentication` block as defined below.
	//
	// > **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
	Authentication AppConnectionAuthenticationPtrInput
	// The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
	ClientType pulumi.StringPtrInput
	// The ID of the data source function app. Changing this forces a new resource to be created.
	FunctionAppId pulumi.StringPtrInput
	// The name of the service connection. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// An option to store secret value in secure place. An `secretStore` block as defined below.
	SecretStore AppConnectionSecretStorePtrInput
	// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
	TargetResourceId pulumi.StringPtrInput
	// The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
	VnetSolution pulumi.StringPtrInput
}

func (AppConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*appConnectionState)(nil)).Elem()
}

type appConnectionArgs struct {
	// The authentication info. An `authentication` block as defined below.
	//
	// > **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
	Authentication AppConnectionAuthentication `pulumi:"authentication"`
	// The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
	ClientType *string `pulumi:"clientType"`
	// The ID of the data source function app. Changing this forces a new resource to be created.
	FunctionAppId string `pulumi:"functionAppId"`
	// The name of the service connection. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// An option to store secret value in secure place. An `secretStore` block as defined below.
	SecretStore *AppConnectionSecretStore `pulumi:"secretStore"`
	// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
	TargetResourceId string `pulumi:"targetResourceId"`
	// The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
	VnetSolution *string `pulumi:"vnetSolution"`
}

// The set of arguments for constructing a AppConnection resource.
type AppConnectionArgs struct {
	// The authentication info. An `authentication` block as defined below.
	//
	// > **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
	Authentication AppConnectionAuthenticationInput
	// The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
	ClientType pulumi.StringPtrInput
	// The ID of the data source function app. Changing this forces a new resource to be created.
	FunctionAppId pulumi.StringInput
	// The name of the service connection. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// An option to store secret value in secure place. An `secretStore` block as defined below.
	SecretStore AppConnectionSecretStorePtrInput
	// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
	TargetResourceId pulumi.StringInput
	// The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
	VnetSolution pulumi.StringPtrInput
}

func (AppConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appConnectionArgs)(nil)).Elem()
}

type AppConnectionInput interface {
	pulumi.Input

	ToAppConnectionOutput() AppConnectionOutput
	ToAppConnectionOutputWithContext(ctx context.Context) AppConnectionOutput
}

func (*AppConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**AppConnection)(nil)).Elem()
}

func (i *AppConnection) ToAppConnectionOutput() AppConnectionOutput {
	return i.ToAppConnectionOutputWithContext(context.Background())
}

func (i *AppConnection) ToAppConnectionOutputWithContext(ctx context.Context) AppConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectionOutput)
}

func (i *AppConnection) ToOutput(ctx context.Context) pulumix.Output[*AppConnection] {
	return pulumix.Output[*AppConnection]{
		OutputState: i.ToAppConnectionOutputWithContext(ctx).OutputState,
	}
}

// AppConnectionArrayInput is an input type that accepts AppConnectionArray and AppConnectionArrayOutput values.
// You can construct a concrete instance of `AppConnectionArrayInput` via:
//
//	AppConnectionArray{ AppConnectionArgs{...} }
type AppConnectionArrayInput interface {
	pulumi.Input

	ToAppConnectionArrayOutput() AppConnectionArrayOutput
	ToAppConnectionArrayOutputWithContext(context.Context) AppConnectionArrayOutput
}

type AppConnectionArray []AppConnectionInput

func (AppConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppConnection)(nil)).Elem()
}

func (i AppConnectionArray) ToAppConnectionArrayOutput() AppConnectionArrayOutput {
	return i.ToAppConnectionArrayOutputWithContext(context.Background())
}

func (i AppConnectionArray) ToAppConnectionArrayOutputWithContext(ctx context.Context) AppConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectionArrayOutput)
}

func (i AppConnectionArray) ToOutput(ctx context.Context) pulumix.Output[[]*AppConnection] {
	return pulumix.Output[[]*AppConnection]{
		OutputState: i.ToAppConnectionArrayOutputWithContext(ctx).OutputState,
	}
}

// AppConnectionMapInput is an input type that accepts AppConnectionMap and AppConnectionMapOutput values.
// You can construct a concrete instance of `AppConnectionMapInput` via:
//
//	AppConnectionMap{ "key": AppConnectionArgs{...} }
type AppConnectionMapInput interface {
	pulumi.Input

	ToAppConnectionMapOutput() AppConnectionMapOutput
	ToAppConnectionMapOutputWithContext(context.Context) AppConnectionMapOutput
}

type AppConnectionMap map[string]AppConnectionInput

func (AppConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppConnection)(nil)).Elem()
}

func (i AppConnectionMap) ToAppConnectionMapOutput() AppConnectionMapOutput {
	return i.ToAppConnectionMapOutputWithContext(context.Background())
}

func (i AppConnectionMap) ToAppConnectionMapOutputWithContext(ctx context.Context) AppConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppConnectionMapOutput)
}

func (i AppConnectionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*AppConnection] {
	return pulumix.Output[map[string]*AppConnection]{
		OutputState: i.ToAppConnectionMapOutputWithContext(ctx).OutputState,
	}
}

type AppConnectionOutput struct{ *pulumi.OutputState }

func (AppConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppConnection)(nil)).Elem()
}

func (o AppConnectionOutput) ToAppConnectionOutput() AppConnectionOutput {
	return o
}

func (o AppConnectionOutput) ToAppConnectionOutputWithContext(ctx context.Context) AppConnectionOutput {
	return o
}

func (o AppConnectionOutput) ToOutput(ctx context.Context) pulumix.Output[*AppConnection] {
	return pulumix.Output[*AppConnection]{
		OutputState: o.OutputState,
	}
}

// The authentication info. An `authentication` block as defined below.
//
// > **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
func (o AppConnectionOutput) Authentication() AppConnectionAuthenticationOutput {
	return o.ApplyT(func(v *AppConnection) AppConnectionAuthenticationOutput { return v.Authentication }).(AppConnectionAuthenticationOutput)
}

// The application client type. Possible values are `none`, `dotnet`, `java`, `python`, `go`, `php`, `ruby`, `django`, `nodejs` and `springBoot`.
func (o AppConnectionOutput) ClientType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringPtrOutput { return v.ClientType }).(pulumi.StringPtrOutput)
}

// The ID of the data source function app. Changing this forces a new resource to be created.
func (o AppConnectionOutput) FunctionAppId() pulumi.StringOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringOutput { return v.FunctionAppId }).(pulumi.StringOutput)
}

// The name of the service connection. Changing this forces a new resource to be created.
func (o AppConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// An option to store secret value in secure place. An `secretStore` block as defined below.
func (o AppConnectionOutput) SecretStore() AppConnectionSecretStorePtrOutput {
	return o.ApplyT(func(v *AppConnection) AppConnectionSecretStorePtrOutput { return v.SecretStore }).(AppConnectionSecretStorePtrOutput)
}

// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
func (o AppConnectionOutput) TargetResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringOutput { return v.TargetResourceId }).(pulumi.StringOutput)
}

// The type of the VNet solution. Possible values are `serviceEndpoint`, `privateLink`.
func (o AppConnectionOutput) VnetSolution() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AppConnection) pulumi.StringPtrOutput { return v.VnetSolution }).(pulumi.StringPtrOutput)
}

type AppConnectionArrayOutput struct{ *pulumi.OutputState }

func (AppConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppConnection)(nil)).Elem()
}

func (o AppConnectionArrayOutput) ToAppConnectionArrayOutput() AppConnectionArrayOutput {
	return o
}

func (o AppConnectionArrayOutput) ToAppConnectionArrayOutputWithContext(ctx context.Context) AppConnectionArrayOutput {
	return o
}

func (o AppConnectionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*AppConnection] {
	return pulumix.Output[[]*AppConnection]{
		OutputState: o.OutputState,
	}
}

func (o AppConnectionArrayOutput) Index(i pulumi.IntInput) AppConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppConnection {
		return vs[0].([]*AppConnection)[vs[1].(int)]
	}).(AppConnectionOutput)
}

type AppConnectionMapOutput struct{ *pulumi.OutputState }

func (AppConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppConnection)(nil)).Elem()
}

func (o AppConnectionMapOutput) ToAppConnectionMapOutput() AppConnectionMapOutput {
	return o
}

func (o AppConnectionMapOutput) ToAppConnectionMapOutputWithContext(ctx context.Context) AppConnectionMapOutput {
	return o
}

func (o AppConnectionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*AppConnection] {
	return pulumix.Output[map[string]*AppConnection]{
		OutputState: o.OutputState,
	}
}

func (o AppConnectionMapOutput) MapIndex(k pulumi.StringInput) AppConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppConnection {
		return vs[0].(map[string]*AppConnection)[vs[1].(string)]
	}).(AppConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectionInput)(nil)).Elem(), &AppConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectionArrayInput)(nil)).Elem(), AppConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppConnectionMapInput)(nil)).Elem(), AppConnectionMap{})
	pulumi.RegisterOutputType(AppConnectionOutput{})
	pulumi.RegisterOutputType(AppConnectionArrayOutput{})
	pulumi.RegisterOutputType(AppConnectionMapOutput{})
}
// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package streamanalytics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Stream Analytics Stream Input IoTHub.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/iot"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/streamanalytics"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			example := streamanalytics.LookupJobOutput(ctx, streamanalytics.GetJobOutputArgs{
//				Name:              pulumi.String("example-job"),
//				ResourceGroupName: exampleResourceGroup.Name,
//			}, nil)
//			exampleIoTHub, err := iot.NewIoTHub(ctx, "example", &iot.IoTHubArgs{
//				Name:              pulumi.String("example-iothub"),
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				Sku: &iot.IoTHubSkuArgs{
//					Name:     pulumi.String("S1"),
//					Capacity: pulumi.Int(1),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = streamanalytics.NewStreamInputIotHub(ctx, "example", &streamanalytics.StreamInputIotHubArgs{
//				Name: pulumi.String("example-iothub-input"),
//				StreamAnalyticsJobName: pulumi.String(example.ApplyT(func(example streamanalytics.GetJobResult) (*string, error) {
//					return &example.Name, nil
//				}).(pulumi.StringPtrOutput)),
//				ResourceGroupName: pulumi.String(example.ApplyT(func(example streamanalytics.GetJobResult) (*string, error) {
//					return &example.ResourceGroupName, nil
//				}).(pulumi.StringPtrOutput)),
//				Endpoint:                  pulumi.String("messages/events"),
//				EventhubConsumerGroupName: pulumi.String("$Default"),
//				IothubNamespace:           exampleIoTHub.Name,
//				SharedAccessPolicyKey: pulumi.String(exampleIoTHub.SharedAccessPolicies.ApplyT(func(sharedAccessPolicies []iot.IoTHubSharedAccessPolicy) (*string, error) {
//					return &sharedAccessPolicies[0].PrimaryKey, nil
//				}).(pulumi.StringPtrOutput)),
//				SharedAccessPolicyName: pulumi.String("iothubowner"),
//				Serialization: &streamanalytics.StreamInputIotHubSerializationArgs{
//					Type:     pulumi.String("Json"),
//					Encoding: pulumi.String("UTF8"),
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
// * `Microsoft.StreamAnalytics`: 2020-03-01
//
// ## Import
//
// Stream Analytics Stream Input IoTHub's can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:streamanalytics/streamInputIotHub:StreamInputIotHub example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingJobs/job1/inputs/input1
// ```
type StreamInputIotHub struct {
	pulumi.CustomResourceState

	// The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
	EventhubConsumerGroupName pulumi.StringOutput `pulumi:"eventhubConsumerGroupName"`
	// The name or the URI of the IoT Hub.
	IothubNamespace pulumi.StringOutput `pulumi:"iothubNamespace"`
	// The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `serialization` block as defined below.
	Serialization StreamInputIotHubSerializationOutput `pulumi:"serialization"`
	// The shared access policy key for the specified shared access policy. Changing this forces a new resource to be created.
	SharedAccessPolicyKey pulumi.StringOutput `pulumi:"sharedAccessPolicyKey"`
	// The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
	SharedAccessPolicyName pulumi.StringOutput `pulumi:"sharedAccessPolicyName"`
	// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobName pulumi.StringOutput `pulumi:"streamAnalyticsJobName"`
}

// NewStreamInputIotHub registers a new resource with the given unique name, arguments, and options.
func NewStreamInputIotHub(ctx *pulumi.Context,
	name string, args *StreamInputIotHubArgs, opts ...pulumi.ResourceOption) (*StreamInputIotHub, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Endpoint == nil {
		return nil, errors.New("invalid value for required argument 'Endpoint'")
	}
	if args.EventhubConsumerGroupName == nil {
		return nil, errors.New("invalid value for required argument 'EventhubConsumerGroupName'")
	}
	if args.IothubNamespace == nil {
		return nil, errors.New("invalid value for required argument 'IothubNamespace'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Serialization == nil {
		return nil, errors.New("invalid value for required argument 'Serialization'")
	}
	if args.SharedAccessPolicyKey == nil {
		return nil, errors.New("invalid value for required argument 'SharedAccessPolicyKey'")
	}
	if args.SharedAccessPolicyName == nil {
		return nil, errors.New("invalid value for required argument 'SharedAccessPolicyName'")
	}
	if args.StreamAnalyticsJobName == nil {
		return nil, errors.New("invalid value for required argument 'StreamAnalyticsJobName'")
	}
	if args.SharedAccessPolicyKey != nil {
		args.SharedAccessPolicyKey = pulumi.ToSecret(args.SharedAccessPolicyKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"sharedAccessPolicyKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StreamInputIotHub
	err := ctx.RegisterResource("azure:streamanalytics/streamInputIotHub:StreamInputIotHub", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStreamInputIotHub gets an existing StreamInputIotHub resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStreamInputIotHub(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamInputIotHubState, opts ...pulumi.ResourceOption) (*StreamInputIotHub, error) {
	var resource StreamInputIotHub
	err := ctx.ReadResource("azure:streamanalytics/streamInputIotHub:StreamInputIotHub", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StreamInputIotHub resources.
type streamInputIotHubState struct {
	// The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
	Endpoint *string `pulumi:"endpoint"`
	// The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
	EventhubConsumerGroupName *string `pulumi:"eventhubConsumerGroupName"`
	// The name or the URI of the IoT Hub.
	IothubNamespace *string `pulumi:"iothubNamespace"`
	// The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `serialization` block as defined below.
	Serialization *StreamInputIotHubSerialization `pulumi:"serialization"`
	// The shared access policy key for the specified shared access policy. Changing this forces a new resource to be created.
	SharedAccessPolicyKey *string `pulumi:"sharedAccessPolicyKey"`
	// The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
	SharedAccessPolicyName *string `pulumi:"sharedAccessPolicyName"`
	// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobName *string `pulumi:"streamAnalyticsJobName"`
}

type StreamInputIotHubState struct {
	// The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
	Endpoint pulumi.StringPtrInput
	// The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
	EventhubConsumerGroupName pulumi.StringPtrInput
	// The name or the URI of the IoT Hub.
	IothubNamespace pulumi.StringPtrInput
	// The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `serialization` block as defined below.
	Serialization StreamInputIotHubSerializationPtrInput
	// The shared access policy key for the specified shared access policy. Changing this forces a new resource to be created.
	SharedAccessPolicyKey pulumi.StringPtrInput
	// The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
	SharedAccessPolicyName pulumi.StringPtrInput
	// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobName pulumi.StringPtrInput
}

func (StreamInputIotHubState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamInputIotHubState)(nil)).Elem()
}

type streamInputIotHubArgs struct {
	// The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
	Endpoint string `pulumi:"endpoint"`
	// The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
	EventhubConsumerGroupName string `pulumi:"eventhubConsumerGroupName"`
	// The name or the URI of the IoT Hub.
	IothubNamespace string `pulumi:"iothubNamespace"`
	// The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `serialization` block as defined below.
	Serialization StreamInputIotHubSerialization `pulumi:"serialization"`
	// The shared access policy key for the specified shared access policy. Changing this forces a new resource to be created.
	SharedAccessPolicyKey string `pulumi:"sharedAccessPolicyKey"`
	// The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
	SharedAccessPolicyName string `pulumi:"sharedAccessPolicyName"`
	// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobName string `pulumi:"streamAnalyticsJobName"`
}

// The set of arguments for constructing a StreamInputIotHub resource.
type StreamInputIotHubArgs struct {
	// The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
	Endpoint pulumi.StringInput
	// The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
	EventhubConsumerGroupName pulumi.StringInput
	// The name or the URI of the IoT Hub.
	IothubNamespace pulumi.StringInput
	// The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A `serialization` block as defined below.
	Serialization StreamInputIotHubSerializationInput
	// The shared access policy key for the specified shared access policy. Changing this forces a new resource to be created.
	SharedAccessPolicyKey pulumi.StringInput
	// The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
	SharedAccessPolicyName pulumi.StringInput
	// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
	StreamAnalyticsJobName pulumi.StringInput
}

func (StreamInputIotHubArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamInputIotHubArgs)(nil)).Elem()
}

type StreamInputIotHubInput interface {
	pulumi.Input

	ToStreamInputIotHubOutput() StreamInputIotHubOutput
	ToStreamInputIotHubOutputWithContext(ctx context.Context) StreamInputIotHubOutput
}

func (*StreamInputIotHub) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamInputIotHub)(nil)).Elem()
}

func (i *StreamInputIotHub) ToStreamInputIotHubOutput() StreamInputIotHubOutput {
	return i.ToStreamInputIotHubOutputWithContext(context.Background())
}

func (i *StreamInputIotHub) ToStreamInputIotHubOutputWithContext(ctx context.Context) StreamInputIotHubOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamInputIotHubOutput)
}

// StreamInputIotHubArrayInput is an input type that accepts StreamInputIotHubArray and StreamInputIotHubArrayOutput values.
// You can construct a concrete instance of `StreamInputIotHubArrayInput` via:
//
//	StreamInputIotHubArray{ StreamInputIotHubArgs{...} }
type StreamInputIotHubArrayInput interface {
	pulumi.Input

	ToStreamInputIotHubArrayOutput() StreamInputIotHubArrayOutput
	ToStreamInputIotHubArrayOutputWithContext(context.Context) StreamInputIotHubArrayOutput
}

type StreamInputIotHubArray []StreamInputIotHubInput

func (StreamInputIotHubArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamInputIotHub)(nil)).Elem()
}

func (i StreamInputIotHubArray) ToStreamInputIotHubArrayOutput() StreamInputIotHubArrayOutput {
	return i.ToStreamInputIotHubArrayOutputWithContext(context.Background())
}

func (i StreamInputIotHubArray) ToStreamInputIotHubArrayOutputWithContext(ctx context.Context) StreamInputIotHubArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamInputIotHubArrayOutput)
}

// StreamInputIotHubMapInput is an input type that accepts StreamInputIotHubMap and StreamInputIotHubMapOutput values.
// You can construct a concrete instance of `StreamInputIotHubMapInput` via:
//
//	StreamInputIotHubMap{ "key": StreamInputIotHubArgs{...} }
type StreamInputIotHubMapInput interface {
	pulumi.Input

	ToStreamInputIotHubMapOutput() StreamInputIotHubMapOutput
	ToStreamInputIotHubMapOutputWithContext(context.Context) StreamInputIotHubMapOutput
}

type StreamInputIotHubMap map[string]StreamInputIotHubInput

func (StreamInputIotHubMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamInputIotHub)(nil)).Elem()
}

func (i StreamInputIotHubMap) ToStreamInputIotHubMapOutput() StreamInputIotHubMapOutput {
	return i.ToStreamInputIotHubMapOutputWithContext(context.Background())
}

func (i StreamInputIotHubMap) ToStreamInputIotHubMapOutputWithContext(ctx context.Context) StreamInputIotHubMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamInputIotHubMapOutput)
}

type StreamInputIotHubOutput struct{ *pulumi.OutputState }

func (StreamInputIotHubOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamInputIotHub)(nil)).Elem()
}

func (o StreamInputIotHubOutput) ToStreamInputIotHubOutput() StreamInputIotHubOutput {
	return o
}

func (o StreamInputIotHubOutput) ToStreamInputIotHubOutputWithContext(ctx context.Context) StreamInputIotHubOutput {
	return o
}

// The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
func (o StreamInputIotHubOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamInputIotHub) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub.
func (o StreamInputIotHubOutput) EventhubConsumerGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamInputIotHub) pulumi.StringOutput { return v.EventhubConsumerGroupName }).(pulumi.StringOutput)
}

// The name or the URI of the IoT Hub.
func (o StreamInputIotHubOutput) IothubNamespace() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamInputIotHub) pulumi.StringOutput { return v.IothubNamespace }).(pulumi.StringOutput)
}

// The name of the Stream Input IoTHub. Changing this forces a new resource to be created.
func (o StreamInputIotHubOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamInputIotHub) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
func (o StreamInputIotHubOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamInputIotHub) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `serialization` block as defined below.
func (o StreamInputIotHubOutput) Serialization() StreamInputIotHubSerializationOutput {
	return o.ApplyT(func(v *StreamInputIotHub) StreamInputIotHubSerializationOutput { return v.Serialization }).(StreamInputIotHubSerializationOutput)
}

// The shared access policy key for the specified shared access policy. Changing this forces a new resource to be created.
func (o StreamInputIotHubOutput) SharedAccessPolicyKey() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamInputIotHub) pulumi.StringOutput { return v.SharedAccessPolicyKey }).(pulumi.StringOutput)
}

// The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
func (o StreamInputIotHubOutput) SharedAccessPolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamInputIotHub) pulumi.StringOutput { return v.SharedAccessPolicyName }).(pulumi.StringOutput)
}

// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
func (o StreamInputIotHubOutput) StreamAnalyticsJobName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamInputIotHub) pulumi.StringOutput { return v.StreamAnalyticsJobName }).(pulumi.StringOutput)
}

type StreamInputIotHubArrayOutput struct{ *pulumi.OutputState }

func (StreamInputIotHubArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamInputIotHub)(nil)).Elem()
}

func (o StreamInputIotHubArrayOutput) ToStreamInputIotHubArrayOutput() StreamInputIotHubArrayOutput {
	return o
}

func (o StreamInputIotHubArrayOutput) ToStreamInputIotHubArrayOutputWithContext(ctx context.Context) StreamInputIotHubArrayOutput {
	return o
}

func (o StreamInputIotHubArrayOutput) Index(i pulumi.IntInput) StreamInputIotHubOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StreamInputIotHub {
		return vs[0].([]*StreamInputIotHub)[vs[1].(int)]
	}).(StreamInputIotHubOutput)
}

type StreamInputIotHubMapOutput struct{ *pulumi.OutputState }

func (StreamInputIotHubMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamInputIotHub)(nil)).Elem()
}

func (o StreamInputIotHubMapOutput) ToStreamInputIotHubMapOutput() StreamInputIotHubMapOutput {
	return o
}

func (o StreamInputIotHubMapOutput) ToStreamInputIotHubMapOutputWithContext(ctx context.Context) StreamInputIotHubMapOutput {
	return o
}

func (o StreamInputIotHubMapOutput) MapIndex(k pulumi.StringInput) StreamInputIotHubOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StreamInputIotHub {
		return vs[0].(map[string]*StreamInputIotHub)[vs[1].(string)]
	}).(StreamInputIotHubOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamInputIotHubInput)(nil)).Elem(), &StreamInputIotHub{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamInputIotHubArrayInput)(nil)).Elem(), StreamInputIotHubArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamInputIotHubMapInput)(nil)).Elem(), StreamInputIotHubMap{})
	pulumi.RegisterOutputType(StreamInputIotHubOutput{})
	pulumi.RegisterOutputType(StreamInputIotHubArrayOutput{})
	pulumi.RegisterOutputType(StreamInputIotHubMapOutput{})
}

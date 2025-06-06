// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package containerapp

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Container App Job.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/containerapp"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/operationalinsights"
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
//			exampleAnalyticsWorkspace, err := operationalinsights.NewAnalyticsWorkspace(ctx, "example", &operationalinsights.AnalyticsWorkspaceArgs{
//				Name:              pulumi.String("example-log-analytics-workspace"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("PerGB2018"),
//				RetentionInDays:   pulumi.Int(30),
//			})
//			if err != nil {
//				return err
//			}
//			exampleEnvironment, err := containerapp.NewEnvironment(ctx, "example", &containerapp.EnvironmentArgs{
//				Name:                    pulumi.String("example-container-app-environment"),
//				Location:                example.Location,
//				ResourceGroupName:       example.Name,
//				LogAnalyticsWorkspaceId: exampleAnalyticsWorkspace.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = containerapp.NewJob(ctx, "example", &containerapp.JobArgs{
//				Name:                      pulumi.String("example-container-app-job"),
//				Location:                  example.Location,
//				ResourceGroupName:         example.Name,
//				ContainerAppEnvironmentId: exampleEnvironment.ID(),
//				ReplicaTimeoutInSeconds:   pulumi.Int(10),
//				ReplicaRetryLimit:         pulumi.Int(10),
//				ManualTriggerConfig: &containerapp.JobManualTriggerConfigArgs{
//					Parallelism:            pulumi.Int(4),
//					ReplicaCompletionCount: pulumi.Int(1),
//				},
//				Template: &containerapp.JobTemplateArgs{
//					Containers: containerapp.JobTemplateContainerArray{
//						&containerapp.JobTemplateContainerArgs{
//							Image: pulumi.String("repo/testcontainerAppsJob0:v1"),
//							Name:  pulumi.String("testcontainerappsjob0"),
//							ReadinessProbes: containerapp.JobTemplateContainerReadinessProbeArray{
//								&containerapp.JobTemplateContainerReadinessProbeArgs{
//									Transport: pulumi.String("HTTP"),
//									Port:      pulumi.Int(5000),
//								},
//							},
//							LivenessProbes: containerapp.JobTemplateContainerLivenessProbeArray{
//								&containerapp.JobTemplateContainerLivenessProbeArgs{
//									Transport: pulumi.String("HTTP"),
//									Port:      pulumi.Int(5000),
//									Path:      pulumi.String("/health"),
//									Headers: containerapp.JobTemplateContainerLivenessProbeHeaderArray{
//										&containerapp.JobTemplateContainerLivenessProbeHeaderArgs{
//											Name:  pulumi.String("Cache-Control"),
//											Value: pulumi.String("no-cache"),
//										},
//									},
//									InitialDelay:          pulumi.Int(5),
//									IntervalSeconds:       pulumi.Int(20),
//									Timeout:               pulumi.Int(2),
//									FailureCountThreshold: pulumi.Int(1),
//								},
//							},
//							StartupProbes: containerapp.JobTemplateContainerStartupProbeArray{
//								&containerapp.JobTemplateContainerStartupProbeArgs{
//									Transport: pulumi.String("TCP"),
//									Port:      pulumi.Int(5000),
//								},
//							},
//							Cpu:    pulumi.Float64(0.5),
//							Memory: pulumi.String("1Gi"),
//						},
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
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.App`: 2025-01-01
//
// ## Import
//
// A Container App Job can be imported using the resource id, e.g.
//
// ```sh
// $ pulumi import azure:containerapp/job:Job example "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-resources/providers/Microsoft.App/jobs/example-container-app-job"
// ```
type Job struct {
	pulumi.CustomResourceState

	// The ID of the Container App Environment in which to create the Container App Job. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId pulumi.StringOutput `pulumi:"containerAppEnvironmentId"`
	// The endpoint for the Container App Job event stream.
	EventStreamEndpoint pulumi.StringOutput `pulumi:"eventStreamEndpoint"`
	// A `eventTriggerConfig` block as defined below.
	EventTriggerConfig JobEventTriggerConfigPtrOutput `pulumi:"eventTriggerConfig"`
	// A `identity` block as defined below.
	Identity JobIdentityPtrOutput `pulumi:"identity"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// A `manualTriggerConfig` block as defined below.
	ManualTriggerConfig JobManualTriggerConfigPtrOutput `pulumi:"manualTriggerConfig"`
	// Specifies the name of the Container App Job resource. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of the Public IP Addresses which the Container App uses for outbound network access.
	OutboundIpAddresses pulumi.StringArrayOutput `pulumi:"outboundIpAddresses"`
	// One or more `registry` blocks as defined below.
	Registries JobRegistryArrayOutput `pulumi:"registries"`
	// The maximum number of times a replica is allowed to retry.
	ReplicaRetryLimit pulumi.IntPtrOutput `pulumi:"replicaRetryLimit"`
	// The maximum number of seconds a replica is allowed to run.
	ReplicaTimeoutInSeconds pulumi.IntOutput `pulumi:"replicaTimeoutInSeconds"`
	// The name of the resource group in which to create the Container App Job. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `scheduleTriggerConfig` block as defined below.
	//
	// > **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
	ScheduleTriggerConfig JobScheduleTriggerConfigPtrOutput `pulumi:"scheduleTriggerConfig"`
	// One or more `secret` blocks as defined below.
	Secrets JobSecretArrayOutput `pulumi:"secrets"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A `template` block as defined below.
	Template JobTemplateOutput `pulumi:"template"`
	// The name of the workload profile to use for the Container App Job.
	WorkloadProfileName pulumi.StringPtrOutput `pulumi:"workloadProfileName"`
}

// NewJob registers a new resource with the given unique name, arguments, and options.
func NewJob(ctx *pulumi.Context,
	name string, args *JobArgs, opts ...pulumi.ResourceOption) (*Job, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContainerAppEnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'ContainerAppEnvironmentId'")
	}
	if args.ReplicaTimeoutInSeconds == nil {
		return nil, errors.New("invalid value for required argument 'ReplicaTimeoutInSeconds'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Template == nil {
		return nil, errors.New("invalid value for required argument 'Template'")
	}
	if args.Secrets != nil {
		args.Secrets = pulumi.ToSecret(args.Secrets).(JobSecretArrayInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secrets",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Job
	err := ctx.RegisterResource("azure:containerapp/job:Job", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJob gets an existing Job resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JobState, opts ...pulumi.ResourceOption) (*Job, error) {
	var resource Job
	err := ctx.ReadResource("azure:containerapp/job:Job", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Job resources.
type jobState struct {
	// The ID of the Container App Environment in which to create the Container App Job. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId *string `pulumi:"containerAppEnvironmentId"`
	// The endpoint for the Container App Job event stream.
	EventStreamEndpoint *string `pulumi:"eventStreamEndpoint"`
	// A `eventTriggerConfig` block as defined below.
	EventTriggerConfig *JobEventTriggerConfig `pulumi:"eventTriggerConfig"`
	// A `identity` block as defined below.
	Identity *JobIdentity `pulumi:"identity"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A `manualTriggerConfig` block as defined below.
	ManualTriggerConfig *JobManualTriggerConfig `pulumi:"manualTriggerConfig"`
	// Specifies the name of the Container App Job resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A list of the Public IP Addresses which the Container App uses for outbound network access.
	OutboundIpAddresses []string `pulumi:"outboundIpAddresses"`
	// One or more `registry` blocks as defined below.
	Registries []JobRegistry `pulumi:"registries"`
	// The maximum number of times a replica is allowed to retry.
	ReplicaRetryLimit *int `pulumi:"replicaRetryLimit"`
	// The maximum number of seconds a replica is allowed to run.
	ReplicaTimeoutInSeconds *int `pulumi:"replicaTimeoutInSeconds"`
	// The name of the resource group in which to create the Container App Job. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `scheduleTriggerConfig` block as defined below.
	//
	// > **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
	ScheduleTriggerConfig *JobScheduleTriggerConfig `pulumi:"scheduleTriggerConfig"`
	// One or more `secret` blocks as defined below.
	Secrets []JobSecret `pulumi:"secrets"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// A `template` block as defined below.
	Template *JobTemplate `pulumi:"template"`
	// The name of the workload profile to use for the Container App Job.
	WorkloadProfileName *string `pulumi:"workloadProfileName"`
}

type JobState struct {
	// The ID of the Container App Environment in which to create the Container App Job. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId pulumi.StringPtrInput
	// The endpoint for the Container App Job event stream.
	EventStreamEndpoint pulumi.StringPtrInput
	// A `eventTriggerConfig` block as defined below.
	EventTriggerConfig JobEventTriggerConfigPtrInput
	// A `identity` block as defined below.
	Identity JobIdentityPtrInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A `manualTriggerConfig` block as defined below.
	ManualTriggerConfig JobManualTriggerConfigPtrInput
	// Specifies the name of the Container App Job resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A list of the Public IP Addresses which the Container App uses for outbound network access.
	OutboundIpAddresses pulumi.StringArrayInput
	// One or more `registry` blocks as defined below.
	Registries JobRegistryArrayInput
	// The maximum number of times a replica is allowed to retry.
	ReplicaRetryLimit pulumi.IntPtrInput
	// The maximum number of seconds a replica is allowed to run.
	ReplicaTimeoutInSeconds pulumi.IntPtrInput
	// The name of the resource group in which to create the Container App Job. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `scheduleTriggerConfig` block as defined below.
	//
	// > **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
	ScheduleTriggerConfig JobScheduleTriggerConfigPtrInput
	// One or more `secret` blocks as defined below.
	Secrets JobSecretArrayInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// A `template` block as defined below.
	Template JobTemplatePtrInput
	// The name of the workload profile to use for the Container App Job.
	WorkloadProfileName pulumi.StringPtrInput
}

func (JobState) ElementType() reflect.Type {
	return reflect.TypeOf((*jobState)(nil)).Elem()
}

type jobArgs struct {
	// The ID of the Container App Environment in which to create the Container App Job. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId string `pulumi:"containerAppEnvironmentId"`
	// A `eventTriggerConfig` block as defined below.
	EventTriggerConfig *JobEventTriggerConfig `pulumi:"eventTriggerConfig"`
	// A `identity` block as defined below.
	Identity *JobIdentity `pulumi:"identity"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A `manualTriggerConfig` block as defined below.
	ManualTriggerConfig *JobManualTriggerConfig `pulumi:"manualTriggerConfig"`
	// Specifies the name of the Container App Job resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// One or more `registry` blocks as defined below.
	Registries []JobRegistry `pulumi:"registries"`
	// The maximum number of times a replica is allowed to retry.
	ReplicaRetryLimit *int `pulumi:"replicaRetryLimit"`
	// The maximum number of seconds a replica is allowed to run.
	ReplicaTimeoutInSeconds int `pulumi:"replicaTimeoutInSeconds"`
	// The name of the resource group in which to create the Container App Job. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `scheduleTriggerConfig` block as defined below.
	//
	// > **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
	ScheduleTriggerConfig *JobScheduleTriggerConfig `pulumi:"scheduleTriggerConfig"`
	// One or more `secret` blocks as defined below.
	Secrets []JobSecret `pulumi:"secrets"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// A `template` block as defined below.
	Template JobTemplate `pulumi:"template"`
	// The name of the workload profile to use for the Container App Job.
	WorkloadProfileName *string `pulumi:"workloadProfileName"`
}

// The set of arguments for constructing a Job resource.
type JobArgs struct {
	// The ID of the Container App Environment in which to create the Container App Job. Changing this forces a new resource to be created.
	ContainerAppEnvironmentId pulumi.StringInput
	// A `eventTriggerConfig` block as defined below.
	EventTriggerConfig JobEventTriggerConfigPtrInput
	// A `identity` block as defined below.
	Identity JobIdentityPtrInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A `manualTriggerConfig` block as defined below.
	ManualTriggerConfig JobManualTriggerConfigPtrInput
	// Specifies the name of the Container App Job resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// One or more `registry` blocks as defined below.
	Registries JobRegistryArrayInput
	// The maximum number of times a replica is allowed to retry.
	ReplicaRetryLimit pulumi.IntPtrInput
	// The maximum number of seconds a replica is allowed to run.
	ReplicaTimeoutInSeconds pulumi.IntInput
	// The name of the resource group in which to create the Container App Job. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A `scheduleTriggerConfig` block as defined below.
	//
	// > **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
	ScheduleTriggerConfig JobScheduleTriggerConfigPtrInput
	// One or more `secret` blocks as defined below.
	Secrets JobSecretArrayInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// A `template` block as defined below.
	Template JobTemplateInput
	// The name of the workload profile to use for the Container App Job.
	WorkloadProfileName pulumi.StringPtrInput
}

func (JobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jobArgs)(nil)).Elem()
}

type JobInput interface {
	pulumi.Input

	ToJobOutput() JobOutput
	ToJobOutputWithContext(ctx context.Context) JobOutput
}

func (*Job) ElementType() reflect.Type {
	return reflect.TypeOf((**Job)(nil)).Elem()
}

func (i *Job) ToJobOutput() JobOutput {
	return i.ToJobOutputWithContext(context.Background())
}

func (i *Job) ToJobOutputWithContext(ctx context.Context) JobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobOutput)
}

// JobArrayInput is an input type that accepts JobArray and JobArrayOutput values.
// You can construct a concrete instance of `JobArrayInput` via:
//
//	JobArray{ JobArgs{...} }
type JobArrayInput interface {
	pulumi.Input

	ToJobArrayOutput() JobArrayOutput
	ToJobArrayOutputWithContext(context.Context) JobArrayOutput
}

type JobArray []JobInput

func (JobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Job)(nil)).Elem()
}

func (i JobArray) ToJobArrayOutput() JobArrayOutput {
	return i.ToJobArrayOutputWithContext(context.Background())
}

func (i JobArray) ToJobArrayOutputWithContext(ctx context.Context) JobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobArrayOutput)
}

// JobMapInput is an input type that accepts JobMap and JobMapOutput values.
// You can construct a concrete instance of `JobMapInput` via:
//
//	JobMap{ "key": JobArgs{...} }
type JobMapInput interface {
	pulumi.Input

	ToJobMapOutput() JobMapOutput
	ToJobMapOutputWithContext(context.Context) JobMapOutput
}

type JobMap map[string]JobInput

func (JobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Job)(nil)).Elem()
}

func (i JobMap) ToJobMapOutput() JobMapOutput {
	return i.ToJobMapOutputWithContext(context.Background())
}

func (i JobMap) ToJobMapOutputWithContext(ctx context.Context) JobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobMapOutput)
}

type JobOutput struct{ *pulumi.OutputState }

func (JobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Job)(nil)).Elem()
}

func (o JobOutput) ToJobOutput() JobOutput {
	return o
}

func (o JobOutput) ToJobOutputWithContext(ctx context.Context) JobOutput {
	return o
}

// The ID of the Container App Environment in which to create the Container App Job. Changing this forces a new resource to be created.
func (o JobOutput) ContainerAppEnvironmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.ContainerAppEnvironmentId }).(pulumi.StringOutput)
}

// The endpoint for the Container App Job event stream.
func (o JobOutput) EventStreamEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.EventStreamEndpoint }).(pulumi.StringOutput)
}

// A `eventTriggerConfig` block as defined below.
func (o JobOutput) EventTriggerConfig() JobEventTriggerConfigPtrOutput {
	return o.ApplyT(func(v *Job) JobEventTriggerConfigPtrOutput { return v.EventTriggerConfig }).(JobEventTriggerConfigPtrOutput)
}

// A `identity` block as defined below.
func (o JobOutput) Identity() JobIdentityPtrOutput {
	return o.ApplyT(func(v *Job) JobIdentityPtrOutput { return v.Identity }).(JobIdentityPtrOutput)
}

// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o JobOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// A `manualTriggerConfig` block as defined below.
func (o JobOutput) ManualTriggerConfig() JobManualTriggerConfigPtrOutput {
	return o.ApplyT(func(v *Job) JobManualTriggerConfigPtrOutput { return v.ManualTriggerConfig }).(JobManualTriggerConfigPtrOutput)
}

// Specifies the name of the Container App Job resource. Changing this forces a new resource to be created.
func (o JobOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of the Public IP Addresses which the Container App uses for outbound network access.
func (o JobOutput) OutboundIpAddresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Job) pulumi.StringArrayOutput { return v.OutboundIpAddresses }).(pulumi.StringArrayOutput)
}

// One or more `registry` blocks as defined below.
func (o JobOutput) Registries() JobRegistryArrayOutput {
	return o.ApplyT(func(v *Job) JobRegistryArrayOutput { return v.Registries }).(JobRegistryArrayOutput)
}

// The maximum number of times a replica is allowed to retry.
func (o JobOutput) ReplicaRetryLimit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.IntPtrOutput { return v.ReplicaRetryLimit }).(pulumi.IntPtrOutput)
}

// The maximum number of seconds a replica is allowed to run.
func (o JobOutput) ReplicaTimeoutInSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *Job) pulumi.IntOutput { return v.ReplicaTimeoutInSeconds }).(pulumi.IntOutput)
}

// The name of the resource group in which to create the Container App Job. Changing this forces a new resource to be created.
func (o JobOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `scheduleTriggerConfig` block as defined below.
//
// > **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
func (o JobOutput) ScheduleTriggerConfig() JobScheduleTriggerConfigPtrOutput {
	return o.ApplyT(func(v *Job) JobScheduleTriggerConfigPtrOutput { return v.ScheduleTriggerConfig }).(JobScheduleTriggerConfigPtrOutput)
}

// One or more `secret` blocks as defined below.
func (o JobOutput) Secrets() JobSecretArrayOutput {
	return o.ApplyT(func(v *Job) JobSecretArrayOutput { return v.Secrets }).(JobSecretArrayOutput)
}

// A mapping of tags to assign to the resource.
func (o JobOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Job) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A `template` block as defined below.
func (o JobOutput) Template() JobTemplateOutput {
	return o.ApplyT(func(v *Job) JobTemplateOutput { return v.Template }).(JobTemplateOutput)
}

// The name of the workload profile to use for the Container App Job.
func (o JobOutput) WorkloadProfileName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.StringPtrOutput { return v.WorkloadProfileName }).(pulumi.StringPtrOutput)
}

type JobArrayOutput struct{ *pulumi.OutputState }

func (JobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Job)(nil)).Elem()
}

func (o JobArrayOutput) ToJobArrayOutput() JobArrayOutput {
	return o
}

func (o JobArrayOutput) ToJobArrayOutputWithContext(ctx context.Context) JobArrayOutput {
	return o
}

func (o JobArrayOutput) Index(i pulumi.IntInput) JobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Job {
		return vs[0].([]*Job)[vs[1].(int)]
	}).(JobOutput)
}

type JobMapOutput struct{ *pulumi.OutputState }

func (JobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Job)(nil)).Elem()
}

func (o JobMapOutput) ToJobMapOutput() JobMapOutput {
	return o
}

func (o JobMapOutput) ToJobMapOutputWithContext(ctx context.Context) JobMapOutput {
	return o
}

func (o JobMapOutput) MapIndex(k pulumi.StringInput) JobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Job {
		return vs[0].(map[string]*Job)[vs[1].(string)]
	}).(JobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JobInput)(nil)).Elem(), &Job{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobArrayInput)(nil)).Elem(), JobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobMapInput)(nil)).Elem(), JobMap{})
	pulumi.RegisterOutputType(JobOutput{})
	pulumi.RegisterOutputType(JobArrayOutput{})
	pulumi.RegisterOutputType(JobMapOutput{})
}

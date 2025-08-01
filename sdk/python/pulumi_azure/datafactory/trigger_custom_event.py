# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TriggerCustomEventArgs', 'TriggerCustomEvent']

@pulumi.input_type
class TriggerCustomEventArgs:
    def __init__(__self__, *,
                 data_factory_id: pulumi.Input[_builtins.str],
                 eventgrid_topic_id: pulumi.Input[_builtins.str],
                 events: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 pipelines: pulumi.Input[Sequence[pulumi.Input['TriggerCustomEventPipelineArgs']]],
                 activated: Optional[pulumi.Input[_builtins.bool]] = None,
                 additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 subject_begins_with: Optional[pulumi.Input[_builtins.str]] = None,
                 subject_ends_with: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a TriggerCustomEvent resource.
        :param pulumi.Input[_builtins.str] data_factory_id: The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] eventgrid_topic_id: The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] events: List of events that will fire this trigger. At least one event must be specified.
        :param pulumi.Input[Sequence[pulumi.Input['TriggerCustomEventPipelineArgs']]] pipelines: One or more `pipeline` blocks as defined below.
        :param pulumi.Input[_builtins.bool] activated: Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] additional_properties: A map of additional properties to associate with the Data Factory Custom Event Trigger.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] annotations: List of tags that can be used for describing the Data Factory Custom Event Trigger.
        :param pulumi.Input[_builtins.str] description: The description for the Data Factory Custom Event Trigger.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] subject_begins_with: The pattern that event subject starts with for trigger to fire.
        :param pulumi.Input[_builtins.str] subject_ends_with: The pattern that event subject ends with for trigger to fire.
        """
        pulumi.set(__self__, "data_factory_id", data_factory_id)
        pulumi.set(__self__, "eventgrid_topic_id", eventgrid_topic_id)
        pulumi.set(__self__, "events", events)
        pulumi.set(__self__, "pipelines", pipelines)
        if activated is not None:
            pulumi.set(__self__, "activated", activated)
        if additional_properties is not None:
            pulumi.set(__self__, "additional_properties", additional_properties)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if subject_begins_with is not None:
            pulumi.set(__self__, "subject_begins_with", subject_begins_with)
        if subject_ends_with is not None:
            pulumi.set(__self__, "subject_ends_with", subject_ends_with)

    @_builtins.property
    @pulumi.getter(name="dataFactoryId")
    def data_factory_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
        """
        return pulumi.get(self, "data_factory_id")

    @data_factory_id.setter
    def data_factory_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "data_factory_id", value)

    @_builtins.property
    @pulumi.getter(name="eventgridTopicId")
    def eventgrid_topic_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
        """
        return pulumi.get(self, "eventgrid_topic_id")

    @eventgrid_topic_id.setter
    def eventgrid_topic_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "eventgrid_topic_id", value)

    @_builtins.property
    @pulumi.getter
    def events(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        List of events that will fire this trigger. At least one event must be specified.
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "events", value)

    @_builtins.property
    @pulumi.getter
    def pipelines(self) -> pulumi.Input[Sequence[pulumi.Input['TriggerCustomEventPipelineArgs']]]:
        """
        One or more `pipeline` blocks as defined below.
        """
        return pulumi.get(self, "pipelines")

    @pipelines.setter
    def pipelines(self, value: pulumi.Input[Sequence[pulumi.Input['TriggerCustomEventPipelineArgs']]]):
        pulumi.set(self, "pipelines", value)

    @_builtins.property
    @pulumi.getter
    def activated(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
        """
        return pulumi.get(self, "activated")

    @activated.setter
    def activated(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "activated", value)

    @_builtins.property
    @pulumi.getter(name="additionalProperties")
    def additional_properties(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A map of additional properties to associate with the Data Factory Custom Event Trigger.
        """
        return pulumi.get(self, "additional_properties")

    @additional_properties.setter
    def additional_properties(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "additional_properties", value)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of tags that can be used for describing the Data Factory Custom Event Trigger.
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description for the Data Factory Custom Event Trigger.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="subjectBeginsWith")
    def subject_begins_with(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The pattern that event subject starts with for trigger to fire.
        """
        return pulumi.get(self, "subject_begins_with")

    @subject_begins_with.setter
    def subject_begins_with(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "subject_begins_with", value)

    @_builtins.property
    @pulumi.getter(name="subjectEndsWith")
    def subject_ends_with(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The pattern that event subject ends with for trigger to fire.
        """
        return pulumi.get(self, "subject_ends_with")

    @subject_ends_with.setter
    def subject_ends_with(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "subject_ends_with", value)


@pulumi.input_type
class _TriggerCustomEventState:
    def __init__(__self__, *,
                 activated: Optional[pulumi.Input[_builtins.bool]] = None,
                 additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_id: Optional[pulumi.Input[_builtins.str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 pipelines: Optional[pulumi.Input[Sequence[pulumi.Input['TriggerCustomEventPipelineArgs']]]] = None,
                 subject_begins_with: Optional[pulumi.Input[_builtins.str]] = None,
                 subject_ends_with: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering TriggerCustomEvent resources.
        :param pulumi.Input[_builtins.bool] activated: Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] additional_properties: A map of additional properties to associate with the Data Factory Custom Event Trigger.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] annotations: List of tags that can be used for describing the Data Factory Custom Event Trigger.
        :param pulumi.Input[_builtins.str] data_factory_id: The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: The description for the Data Factory Custom Event Trigger.
        :param pulumi.Input[_builtins.str] eventgrid_topic_id: The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] events: List of events that will fire this trigger. At least one event must be specified.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['TriggerCustomEventPipelineArgs']]] pipelines: One or more `pipeline` blocks as defined below.
        :param pulumi.Input[_builtins.str] subject_begins_with: The pattern that event subject starts with for trigger to fire.
        :param pulumi.Input[_builtins.str] subject_ends_with: The pattern that event subject ends with for trigger to fire.
        """
        if activated is not None:
            pulumi.set(__self__, "activated", activated)
        if additional_properties is not None:
            pulumi.set(__self__, "additional_properties", additional_properties)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if data_factory_id is not None:
            pulumi.set(__self__, "data_factory_id", data_factory_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if eventgrid_topic_id is not None:
            pulumi.set(__self__, "eventgrid_topic_id", eventgrid_topic_id)
        if events is not None:
            pulumi.set(__self__, "events", events)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if pipelines is not None:
            pulumi.set(__self__, "pipelines", pipelines)
        if subject_begins_with is not None:
            pulumi.set(__self__, "subject_begins_with", subject_begins_with)
        if subject_ends_with is not None:
            pulumi.set(__self__, "subject_ends_with", subject_ends_with)

    @_builtins.property
    @pulumi.getter
    def activated(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
        """
        return pulumi.get(self, "activated")

    @activated.setter
    def activated(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "activated", value)

    @_builtins.property
    @pulumi.getter(name="additionalProperties")
    def additional_properties(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A map of additional properties to associate with the Data Factory Custom Event Trigger.
        """
        return pulumi.get(self, "additional_properties")

    @additional_properties.setter
    def additional_properties(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "additional_properties", value)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of tags that can be used for describing the Data Factory Custom Event Trigger.
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter(name="dataFactoryId")
    def data_factory_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
        """
        return pulumi.get(self, "data_factory_id")

    @data_factory_id.setter
    def data_factory_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "data_factory_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description for the Data Factory Custom Event Trigger.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="eventgridTopicId")
    def eventgrid_topic_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
        """
        return pulumi.get(self, "eventgrid_topic_id")

    @eventgrid_topic_id.setter
    def eventgrid_topic_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "eventgrid_topic_id", value)

    @_builtins.property
    @pulumi.getter
    def events(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of events that will fire this trigger. At least one event must be specified.
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "events", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def pipelines(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TriggerCustomEventPipelineArgs']]]]:
        """
        One or more `pipeline` blocks as defined below.
        """
        return pulumi.get(self, "pipelines")

    @pipelines.setter
    def pipelines(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TriggerCustomEventPipelineArgs']]]]):
        pulumi.set(self, "pipelines", value)

    @_builtins.property
    @pulumi.getter(name="subjectBeginsWith")
    def subject_begins_with(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The pattern that event subject starts with for trigger to fire.
        """
        return pulumi.get(self, "subject_begins_with")

    @subject_begins_with.setter
    def subject_begins_with(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "subject_begins_with", value)

    @_builtins.property
    @pulumi.getter(name="subjectEndsWith")
    def subject_ends_with(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The pattern that event subject ends with for trigger to fire.
        """
        return pulumi.get(self, "subject_ends_with")

    @subject_ends_with.setter
    def subject_ends_with(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "subject_ends_with", value)


@pulumi.type_token("azure:datafactory/triggerCustomEvent:TriggerCustomEvent")
class TriggerCustomEvent(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 activated: Optional[pulumi.Input[_builtins.bool]] = None,
                 additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_id: Optional[pulumi.Input[_builtins.str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 pipelines: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TriggerCustomEventPipelineArgs', 'TriggerCustomEventPipelineArgsDict']]]]] = None,
                 subject_begins_with: Optional[pulumi.Input[_builtins.str]] = None,
                 subject_ends_with: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Custom Event Trigger inside an Azure Data Factory.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_factory = azure.datafactory.Factory("example",
            name="example",
            location=example.location,
            resource_group_name=example.name)
        example_pipeline = azure.datafactory.Pipeline("example",
            name="example",
            data_factory_id=example_factory.id)
        example_topic = azure.eventgrid.Topic("example",
            name="example-topic",
            location=example.location,
            resource_group_name=example.name)
        example_trigger_custom_event = azure.datafactory.TriggerCustomEvent("example",
            name="example",
            data_factory_id=example_factory.id,
            eventgrid_topic_id=example_topic.id,
            events=[
                "event1",
                "event2",
            ],
            subject_begins_with="abc",
            subject_ends_with="xyz",
            annotations=[
                "example1",
                "example2",
                "example3",
            ],
            description="example description",
            pipelines=[{
                "name": example_pipeline.name,
                "parameters": {
                    "Env": "Prod",
                },
            }],
            additional_properties={
                "foo": "foo1",
                "bar": "bar2",
            })
        ```

        ## Import

        Data Factory Custom Event Trigger can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:datafactory/triggerCustomEvent:TriggerCustomEvent example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/triggers/example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] activated: Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] additional_properties: A map of additional properties to associate with the Data Factory Custom Event Trigger.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] annotations: List of tags that can be used for describing the Data Factory Custom Event Trigger.
        :param pulumi.Input[_builtins.str] data_factory_id: The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: The description for the Data Factory Custom Event Trigger.
        :param pulumi.Input[_builtins.str] eventgrid_topic_id: The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] events: List of events that will fire this trigger. At least one event must be specified.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TriggerCustomEventPipelineArgs', 'TriggerCustomEventPipelineArgsDict']]]] pipelines: One or more `pipeline` blocks as defined below.
        :param pulumi.Input[_builtins.str] subject_begins_with: The pattern that event subject starts with for trigger to fire.
        :param pulumi.Input[_builtins.str] subject_ends_with: The pattern that event subject ends with for trigger to fire.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TriggerCustomEventArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Custom Event Trigger inside an Azure Data Factory.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_factory = azure.datafactory.Factory("example",
            name="example",
            location=example.location,
            resource_group_name=example.name)
        example_pipeline = azure.datafactory.Pipeline("example",
            name="example",
            data_factory_id=example_factory.id)
        example_topic = azure.eventgrid.Topic("example",
            name="example-topic",
            location=example.location,
            resource_group_name=example.name)
        example_trigger_custom_event = azure.datafactory.TriggerCustomEvent("example",
            name="example",
            data_factory_id=example_factory.id,
            eventgrid_topic_id=example_topic.id,
            events=[
                "event1",
                "event2",
            ],
            subject_begins_with="abc",
            subject_ends_with="xyz",
            annotations=[
                "example1",
                "example2",
                "example3",
            ],
            description="example description",
            pipelines=[{
                "name": example_pipeline.name,
                "parameters": {
                    "Env": "Prod",
                },
            }],
            additional_properties={
                "foo": "foo1",
                "bar": "bar2",
            })
        ```

        ## Import

        Data Factory Custom Event Trigger can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:datafactory/triggerCustomEvent:TriggerCustomEvent example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/triggers/example
        ```

        :param str resource_name: The name of the resource.
        :param TriggerCustomEventArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TriggerCustomEventArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 activated: Optional[pulumi.Input[_builtins.bool]] = None,
                 additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_id: Optional[pulumi.Input[_builtins.str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 pipelines: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TriggerCustomEventPipelineArgs', 'TriggerCustomEventPipelineArgsDict']]]]] = None,
                 subject_begins_with: Optional[pulumi.Input[_builtins.str]] = None,
                 subject_ends_with: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TriggerCustomEventArgs.__new__(TriggerCustomEventArgs)

            __props__.__dict__["activated"] = activated
            __props__.__dict__["additional_properties"] = additional_properties
            __props__.__dict__["annotations"] = annotations
            if data_factory_id is None and not opts.urn:
                raise TypeError("Missing required property 'data_factory_id'")
            __props__.__dict__["data_factory_id"] = data_factory_id
            __props__.__dict__["description"] = description
            if eventgrid_topic_id is None and not opts.urn:
                raise TypeError("Missing required property 'eventgrid_topic_id'")
            __props__.__dict__["eventgrid_topic_id"] = eventgrid_topic_id
            if events is None and not opts.urn:
                raise TypeError("Missing required property 'events'")
            __props__.__dict__["events"] = events
            __props__.__dict__["name"] = name
            if pipelines is None and not opts.urn:
                raise TypeError("Missing required property 'pipelines'")
            __props__.__dict__["pipelines"] = pipelines
            __props__.__dict__["subject_begins_with"] = subject_begins_with
            __props__.__dict__["subject_ends_with"] = subject_ends_with
        super(TriggerCustomEvent, __self__).__init__(
            'azure:datafactory/triggerCustomEvent:TriggerCustomEvent',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            activated: Optional[pulumi.Input[_builtins.bool]] = None,
            additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            eventgrid_topic_id: Optional[pulumi.Input[_builtins.str]] = None,
            events: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            pipelines: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TriggerCustomEventPipelineArgs', 'TriggerCustomEventPipelineArgsDict']]]]] = None,
            subject_begins_with: Optional[pulumi.Input[_builtins.str]] = None,
            subject_ends_with: Optional[pulumi.Input[_builtins.str]] = None) -> 'TriggerCustomEvent':
        """
        Get an existing TriggerCustomEvent resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] activated: Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] additional_properties: A map of additional properties to associate with the Data Factory Custom Event Trigger.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] annotations: List of tags that can be used for describing the Data Factory Custom Event Trigger.
        :param pulumi.Input[_builtins.str] data_factory_id: The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: The description for the Data Factory Custom Event Trigger.
        :param pulumi.Input[_builtins.str] eventgrid_topic_id: The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] events: List of events that will fire this trigger. At least one event must be specified.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TriggerCustomEventPipelineArgs', 'TriggerCustomEventPipelineArgsDict']]]] pipelines: One or more `pipeline` blocks as defined below.
        :param pulumi.Input[_builtins.str] subject_begins_with: The pattern that event subject starts with for trigger to fire.
        :param pulumi.Input[_builtins.str] subject_ends_with: The pattern that event subject ends with for trigger to fire.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TriggerCustomEventState.__new__(_TriggerCustomEventState)

        __props__.__dict__["activated"] = activated
        __props__.__dict__["additional_properties"] = additional_properties
        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["data_factory_id"] = data_factory_id
        __props__.__dict__["description"] = description
        __props__.__dict__["eventgrid_topic_id"] = eventgrid_topic_id
        __props__.__dict__["events"] = events
        __props__.__dict__["name"] = name
        __props__.__dict__["pipelines"] = pipelines
        __props__.__dict__["subject_begins_with"] = subject_begins_with
        __props__.__dict__["subject_ends_with"] = subject_ends_with
        return TriggerCustomEvent(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def activated(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Specifies if the Data Factory Custom Event Trigger is activated. Defaults to `true`.
        """
        return pulumi.get(self, "activated")

    @_builtins.property
    @pulumi.getter(name="additionalProperties")
    def additional_properties(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A map of additional properties to associate with the Data Factory Custom Event Trigger.
        """
        return pulumi.get(self, "additional_properties")

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        List of tags that can be used for describing the Data Factory Custom Event Trigger.
        """
        return pulumi.get(self, "annotations")

    @_builtins.property
    @pulumi.getter(name="dataFactoryId")
    def data_factory_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of Data Factory in which to associate the Trigger with. Changing this forces a new resource.
        """
        return pulumi.get(self, "data_factory_id")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description for the Data Factory Custom Event Trigger.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="eventgridTopicId")
    def eventgrid_topic_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of Event Grid Topic in which event will be listened. Changing this forces a new resource.
        """
        return pulumi.get(self, "eventgrid_topic_id")

    @_builtins.property
    @pulumi.getter
    def events(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        List of events that will fire this trigger. At least one event must be specified.
        """
        return pulumi.get(self, "events")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Data Factory Custom Event Trigger. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def pipelines(self) -> pulumi.Output[Sequence['outputs.TriggerCustomEventPipeline']]:
        """
        One or more `pipeline` blocks as defined below.
        """
        return pulumi.get(self, "pipelines")

    @_builtins.property
    @pulumi.getter(name="subjectBeginsWith")
    def subject_begins_with(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The pattern that event subject starts with for trigger to fire.
        """
        return pulumi.get(self, "subject_begins_with")

    @_builtins.property
    @pulumi.getter(name="subjectEndsWith")
    def subject_ends_with(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The pattern that event subject ends with for trigger to fire.
        """
        return pulumi.get(self, "subject_ends_with")


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

__all__ = ['EndpointEventGridArgs', 'EndpointEventGrid']

@pulumi.input_type
class EndpointEventGridArgs:
    def __init__(__self__, *,
                 digital_twins_id: pulumi.Input[_builtins.str],
                 eventgrid_topic_endpoint: pulumi.Input[_builtins.str],
                 eventgrid_topic_primary_access_key: pulumi.Input[_builtins.str],
                 eventgrid_topic_secondary_access_key: pulumi.Input[_builtins.str],
                 dead_letter_storage_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a EndpointEventGrid resource.
        :param pulumi.Input[_builtins.str] digital_twins_id: The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        :param pulumi.Input[_builtins.str] eventgrid_topic_endpoint: The endpoint of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] eventgrid_topic_primary_access_key: The primary access key of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] eventgrid_topic_secondary_access_key: The secondary access key of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] dead_letter_storage_secret: The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Digital Twins Eventgrid Endpoint. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        pulumi.set(__self__, "digital_twins_id", digital_twins_id)
        pulumi.set(__self__, "eventgrid_topic_endpoint", eventgrid_topic_endpoint)
        pulumi.set(__self__, "eventgrid_topic_primary_access_key", eventgrid_topic_primary_access_key)
        pulumi.set(__self__, "eventgrid_topic_secondary_access_key", eventgrid_topic_secondary_access_key)
        if dead_letter_storage_secret is not None:
            pulumi.set(__self__, "dead_letter_storage_secret", dead_letter_storage_secret)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="digitalTwinsId")
    def digital_twins_id(self) -> pulumi.Input[_builtins.str]:
        """
        The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        return pulumi.get(self, "digital_twins_id")

    @digital_twins_id.setter
    def digital_twins_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "digital_twins_id", value)

    @_builtins.property
    @pulumi.getter(name="eventgridTopicEndpoint")
    def eventgrid_topic_endpoint(self) -> pulumi.Input[_builtins.str]:
        """
        The endpoint of the Event Grid Topic.
        """
        return pulumi.get(self, "eventgrid_topic_endpoint")

    @eventgrid_topic_endpoint.setter
    def eventgrid_topic_endpoint(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "eventgrid_topic_endpoint", value)

    @_builtins.property
    @pulumi.getter(name="eventgridTopicPrimaryAccessKey")
    def eventgrid_topic_primary_access_key(self) -> pulumi.Input[_builtins.str]:
        """
        The primary access key of the Event Grid Topic.
        """
        return pulumi.get(self, "eventgrid_topic_primary_access_key")

    @eventgrid_topic_primary_access_key.setter
    def eventgrid_topic_primary_access_key(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "eventgrid_topic_primary_access_key", value)

    @_builtins.property
    @pulumi.getter(name="eventgridTopicSecondaryAccessKey")
    def eventgrid_topic_secondary_access_key(self) -> pulumi.Input[_builtins.str]:
        """
        The secondary access key of the Event Grid Topic.
        """
        return pulumi.get(self, "eventgrid_topic_secondary_access_key")

    @eventgrid_topic_secondary_access_key.setter
    def eventgrid_topic_secondary_access_key(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "eventgrid_topic_secondary_access_key", value)

    @_builtins.property
    @pulumi.getter(name="deadLetterStorageSecret")
    def dead_letter_storage_secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        """
        return pulumi.get(self, "dead_letter_storage_secret")

    @dead_letter_storage_secret.setter
    def dead_letter_storage_secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dead_letter_storage_secret", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Digital Twins Eventgrid Endpoint. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _EndpointEventGridState:
    def __init__(__self__, *,
                 dead_letter_storage_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 digital_twins_id: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_primary_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_secondary_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering EndpointEventGrid resources.
        :param pulumi.Input[_builtins.str] dead_letter_storage_secret: The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        :param pulumi.Input[_builtins.str] digital_twins_id: The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        :param pulumi.Input[_builtins.str] eventgrid_topic_endpoint: The endpoint of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] eventgrid_topic_primary_access_key: The primary access key of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] eventgrid_topic_secondary_access_key: The secondary access key of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Digital Twins Eventgrid Endpoint. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        if dead_letter_storage_secret is not None:
            pulumi.set(__self__, "dead_letter_storage_secret", dead_letter_storage_secret)
        if digital_twins_id is not None:
            pulumi.set(__self__, "digital_twins_id", digital_twins_id)
        if eventgrid_topic_endpoint is not None:
            pulumi.set(__self__, "eventgrid_topic_endpoint", eventgrid_topic_endpoint)
        if eventgrid_topic_primary_access_key is not None:
            pulumi.set(__self__, "eventgrid_topic_primary_access_key", eventgrid_topic_primary_access_key)
        if eventgrid_topic_secondary_access_key is not None:
            pulumi.set(__self__, "eventgrid_topic_secondary_access_key", eventgrid_topic_secondary_access_key)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="deadLetterStorageSecret")
    def dead_letter_storage_secret(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        """
        return pulumi.get(self, "dead_letter_storage_secret")

    @dead_letter_storage_secret.setter
    def dead_letter_storage_secret(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dead_letter_storage_secret", value)

    @_builtins.property
    @pulumi.getter(name="digitalTwinsId")
    def digital_twins_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        return pulumi.get(self, "digital_twins_id")

    @digital_twins_id.setter
    def digital_twins_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "digital_twins_id", value)

    @_builtins.property
    @pulumi.getter(name="eventgridTopicEndpoint")
    def eventgrid_topic_endpoint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The endpoint of the Event Grid Topic.
        """
        return pulumi.get(self, "eventgrid_topic_endpoint")

    @eventgrid_topic_endpoint.setter
    def eventgrid_topic_endpoint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "eventgrid_topic_endpoint", value)

    @_builtins.property
    @pulumi.getter(name="eventgridTopicPrimaryAccessKey")
    def eventgrid_topic_primary_access_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The primary access key of the Event Grid Topic.
        """
        return pulumi.get(self, "eventgrid_topic_primary_access_key")

    @eventgrid_topic_primary_access_key.setter
    def eventgrid_topic_primary_access_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "eventgrid_topic_primary_access_key", value)

    @_builtins.property
    @pulumi.getter(name="eventgridTopicSecondaryAccessKey")
    def eventgrid_topic_secondary_access_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The secondary access key of the Event Grid Topic.
        """
        return pulumi.get(self, "eventgrid_topic_secondary_access_key")

    @eventgrid_topic_secondary_access_key.setter
    def eventgrid_topic_secondary_access_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "eventgrid_topic_secondary_access_key", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Digital Twins Eventgrid Endpoint. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.type_token("azure:digitaltwins/endpointEventGrid:EndpointEventGrid")
class EndpointEventGrid(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dead_letter_storage_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 digital_twins_id: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_primary_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_secondary_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Digital Twins Event Grid Endpoint.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example_resources",
            location="West Europe")
        example_instance = azure.digitaltwins.Instance("example",
            name="example-DT",
            resource_group_name=example.name,
            location=example.location)
        example_topic = azure.eventgrid.Topic("example",
            name="example-topic",
            location=example.location,
            resource_group_name=example.name)
        example_endpoint_event_grid = azure.digitaltwins.EndpointEventGrid("example",
            name="example-EG",
            digital_twins_id=example_instance.id,
            eventgrid_topic_endpoint=example_topic.endpoint,
            eventgrid_topic_primary_access_key=example_topic.primary_access_key,
            eventgrid_topic_secondary_access_key=example_topic.secondary_access_key)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DigitalTwins`: 2023-01-31

        ## Import

        Digital Twins Eventgrid Endpoints can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:digitaltwins/endpointEventGrid:EndpointEventGrid example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DigitalTwins/digitalTwinsInstances/dt1/endpoints/ep1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] dead_letter_storage_secret: The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        :param pulumi.Input[_builtins.str] digital_twins_id: The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        :param pulumi.Input[_builtins.str] eventgrid_topic_endpoint: The endpoint of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] eventgrid_topic_primary_access_key: The primary access key of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] eventgrid_topic_secondary_access_key: The secondary access key of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Digital Twins Eventgrid Endpoint. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EndpointEventGridArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Digital Twins Event Grid Endpoint.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example_resources",
            location="West Europe")
        example_instance = azure.digitaltwins.Instance("example",
            name="example-DT",
            resource_group_name=example.name,
            location=example.location)
        example_topic = azure.eventgrid.Topic("example",
            name="example-topic",
            location=example.location,
            resource_group_name=example.name)
        example_endpoint_event_grid = azure.digitaltwins.EndpointEventGrid("example",
            name="example-EG",
            digital_twins_id=example_instance.id,
            eventgrid_topic_endpoint=example_topic.endpoint,
            eventgrid_topic_primary_access_key=example_topic.primary_access_key,
            eventgrid_topic_secondary_access_key=example_topic.secondary_access_key)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.DigitalTwins`: 2023-01-31

        ## Import

        Digital Twins Eventgrid Endpoints can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:digitaltwins/endpointEventGrid:EndpointEventGrid example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DigitalTwins/digitalTwinsInstances/dt1/endpoints/ep1
        ```

        :param str resource_name: The name of the resource.
        :param EndpointEventGridArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EndpointEventGridArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dead_letter_storage_secret: Optional[pulumi.Input[_builtins.str]] = None,
                 digital_twins_id: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_primary_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 eventgrid_topic_secondary_access_key: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EndpointEventGridArgs.__new__(EndpointEventGridArgs)

            __props__.__dict__["dead_letter_storage_secret"] = dead_letter_storage_secret
            if digital_twins_id is None and not opts.urn:
                raise TypeError("Missing required property 'digital_twins_id'")
            __props__.__dict__["digital_twins_id"] = digital_twins_id
            if eventgrid_topic_endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'eventgrid_topic_endpoint'")
            __props__.__dict__["eventgrid_topic_endpoint"] = eventgrid_topic_endpoint
            if eventgrid_topic_primary_access_key is None and not opts.urn:
                raise TypeError("Missing required property 'eventgrid_topic_primary_access_key'")
            __props__.__dict__["eventgrid_topic_primary_access_key"] = eventgrid_topic_primary_access_key
            if eventgrid_topic_secondary_access_key is None and not opts.urn:
                raise TypeError("Missing required property 'eventgrid_topic_secondary_access_key'")
            __props__.__dict__["eventgrid_topic_secondary_access_key"] = eventgrid_topic_secondary_access_key
            __props__.__dict__["name"] = name
        super(EndpointEventGrid, __self__).__init__(
            'azure:digitaltwins/endpointEventGrid:EndpointEventGrid',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dead_letter_storage_secret: Optional[pulumi.Input[_builtins.str]] = None,
            digital_twins_id: Optional[pulumi.Input[_builtins.str]] = None,
            eventgrid_topic_endpoint: Optional[pulumi.Input[_builtins.str]] = None,
            eventgrid_topic_primary_access_key: Optional[pulumi.Input[_builtins.str]] = None,
            eventgrid_topic_secondary_access_key: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None) -> 'EndpointEventGrid':
        """
        Get an existing EndpointEventGrid resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] dead_letter_storage_secret: The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        :param pulumi.Input[_builtins.str] digital_twins_id: The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        :param pulumi.Input[_builtins.str] eventgrid_topic_endpoint: The endpoint of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] eventgrid_topic_primary_access_key: The primary access key of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] eventgrid_topic_secondary_access_key: The secondary access key of the Event Grid Topic.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Digital Twins Eventgrid Endpoint. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EndpointEventGridState.__new__(_EndpointEventGridState)

        __props__.__dict__["dead_letter_storage_secret"] = dead_letter_storage_secret
        __props__.__dict__["digital_twins_id"] = digital_twins_id
        __props__.__dict__["eventgrid_topic_endpoint"] = eventgrid_topic_endpoint
        __props__.__dict__["eventgrid_topic_primary_access_key"] = eventgrid_topic_primary_access_key
        __props__.__dict__["eventgrid_topic_secondary_access_key"] = eventgrid_topic_secondary_access_key
        __props__.__dict__["name"] = name
        return EndpointEventGrid(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="deadLetterStorageSecret")
    def dead_letter_storage_secret(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The storage secret of the dead-lettering, whose format is `https://<storageAccountname>.blob.core.windows.net/<containerName>?<SASToken>`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        """
        return pulumi.get(self, "dead_letter_storage_secret")

    @_builtins.property
    @pulumi.getter(name="digitalTwinsId")
    def digital_twins_id(self) -> pulumi.Output[_builtins.str]:
        """
        The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        return pulumi.get(self, "digital_twins_id")

    @_builtins.property
    @pulumi.getter(name="eventgridTopicEndpoint")
    def eventgrid_topic_endpoint(self) -> pulumi.Output[_builtins.str]:
        """
        The endpoint of the Event Grid Topic.
        """
        return pulumi.get(self, "eventgrid_topic_endpoint")

    @_builtins.property
    @pulumi.getter(name="eventgridTopicPrimaryAccessKey")
    def eventgrid_topic_primary_access_key(self) -> pulumi.Output[_builtins.str]:
        """
        The primary access key of the Event Grid Topic.
        """
        return pulumi.get(self, "eventgrid_topic_primary_access_key")

    @_builtins.property
    @pulumi.getter(name="eventgridTopicSecondaryAccessKey")
    def eventgrid_topic_secondary_access_key(self) -> pulumi.Output[_builtins.str]:
        """
        The secondary access key of the Event Grid Topic.
        """
        return pulumi.get(self, "eventgrid_topic_secondary_access_key")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Digital Twins Eventgrid Endpoint. Changing this forces a new Digital Twins Eventgrid Endpoint to be created.
        """
        return pulumi.get(self, "name")


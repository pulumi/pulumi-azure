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

__all__ = [
    'GetDomainResult',
    'AwaitableGetDomainResult',
    'get_domain',
    'get_domain_output',
]

@pulumi.output_type
class GetDomainResult:
    """
    A collection of values returned by getDomain.
    """
    def __init__(__self__, endpoint=None, id=None, identities=None, inbound_ip_rules=None, input_mapping_default_values=None, input_mapping_fields=None, input_schema=None, location=None, name=None, primary_access_key=None, public_network_access_enabled=None, resource_group_name=None, secondary_access_key=None, tags=None):
        if endpoint and not isinstance(endpoint, str):
            raise TypeError("Expected argument 'endpoint' to be a str")
        pulumi.set(__self__, "endpoint", endpoint)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identities and not isinstance(identities, list):
            raise TypeError("Expected argument 'identities' to be a list")
        pulumi.set(__self__, "identities", identities)
        if inbound_ip_rules and not isinstance(inbound_ip_rules, list):
            raise TypeError("Expected argument 'inbound_ip_rules' to be a list")
        pulumi.set(__self__, "inbound_ip_rules", inbound_ip_rules)
        if input_mapping_default_values and not isinstance(input_mapping_default_values, list):
            raise TypeError("Expected argument 'input_mapping_default_values' to be a list")
        pulumi.set(__self__, "input_mapping_default_values", input_mapping_default_values)
        if input_mapping_fields and not isinstance(input_mapping_fields, list):
            raise TypeError("Expected argument 'input_mapping_fields' to be a list")
        pulumi.set(__self__, "input_mapping_fields", input_mapping_fields)
        if input_schema and not isinstance(input_schema, str):
            raise TypeError("Expected argument 'input_schema' to be a str")
        pulumi.set(__self__, "input_schema", input_schema)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if primary_access_key and not isinstance(primary_access_key, str):
            raise TypeError("Expected argument 'primary_access_key' to be a str")
        pulumi.set(__self__, "primary_access_key", primary_access_key)
        if public_network_access_enabled and not isinstance(public_network_access_enabled, bool):
            raise TypeError("Expected argument 'public_network_access_enabled' to be a bool")
        pulumi.set(__self__, "public_network_access_enabled", public_network_access_enabled)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if secondary_access_key and not isinstance(secondary_access_key, str):
            raise TypeError("Expected argument 'secondary_access_key' to be a str")
        pulumi.set(__self__, "secondary_access_key", secondary_access_key)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter
    def endpoint(self) -> _builtins.str:
        """
        The Endpoint associated with the EventGrid Domain.
        """
        return pulumi.get(self, "endpoint")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def identities(self) -> Sequence['outputs.GetDomainIdentityResult']:
        """
        An `identity` block as documented below.
        """
        return pulumi.get(self, "identities")

    @_builtins.property
    @pulumi.getter(name="inboundIpRules")
    def inbound_ip_rules(self) -> Sequence['outputs.GetDomainInboundIpRuleResult']:
        """
        One or more `inbound_ip_rule` blocks as defined below.
        """
        return pulumi.get(self, "inbound_ip_rules")

    @_builtins.property
    @pulumi.getter(name="inputMappingDefaultValues")
    def input_mapping_default_values(self) -> Sequence['outputs.GetDomainInputMappingDefaultValueResult']:
        """
        A `input_mapping_default_values` block as defined below.
        """
        return pulumi.get(self, "input_mapping_default_values")

    @_builtins.property
    @pulumi.getter(name="inputMappingFields")
    def input_mapping_fields(self) -> Sequence['outputs.GetDomainInputMappingFieldResult']:
        """
        A `input_mapping_fields` block as defined below.
        """
        return pulumi.get(self, "input_mapping_fields")

    @_builtins.property
    @pulumi.getter(name="inputSchema")
    def input_schema(self) -> _builtins.str:
        """
        The schema in which incoming events will be published to this domain. Possible values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`.
        """
        return pulumi.get(self, "input_schema")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        """
        The Azure Region in which this EventGrid Domain exists.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="primaryAccessKey")
    def primary_access_key(self) -> _builtins.str:
        """
        The primary access key associated with the EventGrid Domain.
        """
        return pulumi.get(self, "primary_access_key")

    @_builtins.property
    @pulumi.getter(name="publicNetworkAccessEnabled")
    def public_network_access_enabled(self) -> _builtins.bool:
        """
        Whether or not public network access is allowed for this server.
        """
        return pulumi.get(self, "public_network_access_enabled")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="secondaryAccessKey")
    def secondary_access_key(self) -> _builtins.str:
        """
        The secondary access key associated with the EventGrid Domain.
        """
        return pulumi.get(self, "secondary_access_key")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Mapping[str, _builtins.str]:
        """
        A mapping of tags assigned to the EventGrid Domain.
        """
        return pulumi.get(self, "tags")


class AwaitableGetDomainResult(GetDomainResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDomainResult(
            endpoint=self.endpoint,
            id=self.id,
            identities=self.identities,
            inbound_ip_rules=self.inbound_ip_rules,
            input_mapping_default_values=self.input_mapping_default_values,
            input_mapping_fields=self.input_mapping_fields,
            input_schema=self.input_schema,
            location=self.location,
            name=self.name,
            primary_access_key=self.primary_access_key,
            public_network_access_enabled=self.public_network_access_enabled,
            resource_group_name=self.resource_group_name,
            secondary_access_key=self.secondary_access_key,
            tags=self.tags)


def get_domain(name: Optional[_builtins.str] = None,
               resource_group_name: Optional[_builtins.str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDomainResult:
    """
    Use this data source to access information about an existing EventGrid Domain

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.eventgrid.get_domain(name="my-eventgrid-domain",
        resource_group_name="example-resources")
    pulumi.export("eventgridDomainMappingTopic", example.input_mapping_fields[0].topic)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.EventGrid`: 2022-06-15


    :param _builtins.str name: The name of the EventGrid Domain resource.
    :param _builtins.str resource_group_name: The name of the resource group in which the EventGrid Domain exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:eventgrid/getDomain:getDomain', __args__, opts=opts, typ=GetDomainResult).value

    return AwaitableGetDomainResult(
        endpoint=pulumi.get(__ret__, 'endpoint'),
        id=pulumi.get(__ret__, 'id'),
        identities=pulumi.get(__ret__, 'identities'),
        inbound_ip_rules=pulumi.get(__ret__, 'inbound_ip_rules'),
        input_mapping_default_values=pulumi.get(__ret__, 'input_mapping_default_values'),
        input_mapping_fields=pulumi.get(__ret__, 'input_mapping_fields'),
        input_schema=pulumi.get(__ret__, 'input_schema'),
        location=pulumi.get(__ret__, 'location'),
        name=pulumi.get(__ret__, 'name'),
        primary_access_key=pulumi.get(__ret__, 'primary_access_key'),
        public_network_access_enabled=pulumi.get(__ret__, 'public_network_access_enabled'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        secondary_access_key=pulumi.get(__ret__, 'secondary_access_key'),
        tags=pulumi.get(__ret__, 'tags'))
def get_domain_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                      resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDomainResult]:
    """
    Use this data source to access information about an existing EventGrid Domain

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.eventgrid.get_domain(name="my-eventgrid-domain",
        resource_group_name="example-resources")
    pulumi.export("eventgridDomainMappingTopic", example.input_mapping_fields[0].topic)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.EventGrid`: 2022-06-15


    :param _builtins.str name: The name of the EventGrid Domain resource.
    :param _builtins.str resource_group_name: The name of the resource group in which the EventGrid Domain exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:eventgrid/getDomain:getDomain', __args__, opts=opts, typ=GetDomainResult)
    return __ret__.apply(lambda __response__: GetDomainResult(
        endpoint=pulumi.get(__response__, 'endpoint'),
        id=pulumi.get(__response__, 'id'),
        identities=pulumi.get(__response__, 'identities'),
        inbound_ip_rules=pulumi.get(__response__, 'inbound_ip_rules'),
        input_mapping_default_values=pulumi.get(__response__, 'input_mapping_default_values'),
        input_mapping_fields=pulumi.get(__response__, 'input_mapping_fields'),
        input_schema=pulumi.get(__response__, 'input_schema'),
        location=pulumi.get(__response__, 'location'),
        name=pulumi.get(__response__, 'name'),
        primary_access_key=pulumi.get(__response__, 'primary_access_key'),
        public_network_access_enabled=pulumi.get(__response__, 'public_network_access_enabled'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        secondary_access_key=pulumi.get(__response__, 'secondary_access_key'),
        tags=pulumi.get(__response__, 'tags')))

# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['LiveEvent']


class LiveEvent(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_start_enabled: Optional[pulumi.Input[bool]] = None,
                 cross_site_access_policy: Optional[pulumi.Input[pulumi.InputType['LiveEventCrossSiteAccessPolicyArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 encoding: Optional[pulumi.Input[pulumi.InputType['LiveEventEncodingArgs']]] = None,
                 hostname_prefix: Optional[pulumi.Input[str]] = None,
                 input: Optional[pulumi.Input[pulumi.InputType['LiveEventInputArgs']]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 media_services_account_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 preview: Optional[pulumi.Input[pulumi.InputType['LiveEventPreviewArgs']]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 transcription_languages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 use_static_hostname: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a Live Event.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="GRS")
        example_service_account = azure.media.ServiceAccount("exampleServiceAccount",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            storage_accounts=[azure.media.ServiceAccountStorageAccountArgs(
                id=example_account.id,
                is_primary=True,
            )])
        example_live_event = azure.media.LiveEvent("exampleLiveEvent",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            media_services_account_name=example_service_account.name,
            description="My Event Description",
            input=azure.media.LiveEventInputArgs(
                streaming_protocol="RTMP",
                ip_access_control_allows=[azure.media.LiveEventInputIpAccessControlAllowArgs(
                    name="AllowAll",
                    address="0.0.0.0",
                    subnet_prefix_length=0,
                )],
            ),
            encoding=azure.media.LiveEventEncodingArgs(
                type="Standard",
                preset_name="Default720p",
                stretch_mode="AutoFit",
                key_frame_interval="PT2S",
            ),
            preview=azure.media.LiveEventPreviewArgs(
                ip_access_control_allows=[azure.media.LiveEventPreviewIpAccessControlAllowArgs(
                    name="AllowAll",
                    address="0.0.0.0",
                    subnet_prefix_length=0,
                )],
            ),
            use_static_hostname=True,
            hostname_prefix="special-event",
            transcription_languages=["en-US"])
        ```

        ## Import

        Live Events can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:media/liveEvent:LiveEvent example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Media/mediaservices/account1/liveevents/event1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_start_enabled: The flag indicates if the resource should be automatically started on creation. Default is `false`.
        :param pulumi.Input[pulumi.InputType['LiveEventCrossSiteAccessPolicyArgs']] cross_site_access_policy: A `cross_site_access_policy` block as defined below.
        :param pulumi.Input[str] description: A description for the live event.
        :param pulumi.Input[pulumi.InputType['LiveEventEncodingArgs']] encoding: A `encoding` block as defined below.
        :param pulumi.Input[str] hostname_prefix: When `use_static_hostname` is set to true, the `hostname_prefix` specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
        :param pulumi.Input[pulumi.InputType['LiveEventInputArgs']] input: A `input` block as defined below.
        :param pulumi.Input[str] location: The Azure Region where the Live Event should exist. Changing this forces a new Live Event to be created.
        :param pulumi.Input[str] media_services_account_name: The Media Services account name. Changing this forces a new Live Event to be created.
        :param pulumi.Input[str] name: The name which should be used for this Live Event. Changing this forces a new Live Event to be created.
        :param pulumi.Input[pulumi.InputType['LiveEventPreviewArgs']] preview: A `preview` block as defined below.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Live Event should exist. Changing this forces a new Live Event to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Live Event.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] transcription_languages: Specifies a list of languages (locale) to be used for speech-to-text transcription – it should match the spoken language in the audio track. The value should be in `BCP-47` format (e.g: `en-US`). [See the Microsoft Documentation for more information about the live transcription feature and the list of supported languages](https://go.microsoft.com/fwlink/?linkid=2133742 ).
        :param pulumi.Input[bool] use_static_hostname: Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. Changing this forces a new Live Event to be created.
               ---
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['auto_start_enabled'] = auto_start_enabled
            __props__['cross_site_access_policy'] = cross_site_access_policy
            __props__['description'] = description
            __props__['encoding'] = encoding
            __props__['hostname_prefix'] = hostname_prefix
            if input is None and not opts.urn:
                raise TypeError("Missing required property 'input'")
            __props__['input'] = input
            __props__['location'] = location
            if media_services_account_name is None and not opts.urn:
                raise TypeError("Missing required property 'media_services_account_name'")
            __props__['media_services_account_name'] = media_services_account_name
            __props__['name'] = name
            __props__['preview'] = preview
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__['resource_group_name'] = resource_group_name
            __props__['tags'] = tags
            __props__['transcription_languages'] = transcription_languages
            __props__['use_static_hostname'] = use_static_hostname
        super(LiveEvent, __self__).__init__(
            'azure:media/liveEvent:LiveEvent',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_start_enabled: Optional[pulumi.Input[bool]] = None,
            cross_site_access_policy: Optional[pulumi.Input[pulumi.InputType['LiveEventCrossSiteAccessPolicyArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            encoding: Optional[pulumi.Input[pulumi.InputType['LiveEventEncodingArgs']]] = None,
            hostname_prefix: Optional[pulumi.Input[str]] = None,
            input: Optional[pulumi.Input[pulumi.InputType['LiveEventInputArgs']]] = None,
            location: Optional[pulumi.Input[str]] = None,
            media_services_account_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            preview: Optional[pulumi.Input[pulumi.InputType['LiveEventPreviewArgs']]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            transcription_languages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            use_static_hostname: Optional[pulumi.Input[bool]] = None) -> 'LiveEvent':
        """
        Get an existing LiveEvent resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_start_enabled: The flag indicates if the resource should be automatically started on creation. Default is `false`.
        :param pulumi.Input[pulumi.InputType['LiveEventCrossSiteAccessPolicyArgs']] cross_site_access_policy: A `cross_site_access_policy` block as defined below.
        :param pulumi.Input[str] description: A description for the live event.
        :param pulumi.Input[pulumi.InputType['LiveEventEncodingArgs']] encoding: A `encoding` block as defined below.
        :param pulumi.Input[str] hostname_prefix: When `use_static_hostname` is set to true, the `hostname_prefix` specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
        :param pulumi.Input[pulumi.InputType['LiveEventInputArgs']] input: A `input` block as defined below.
        :param pulumi.Input[str] location: The Azure Region where the Live Event should exist. Changing this forces a new Live Event to be created.
        :param pulumi.Input[str] media_services_account_name: The Media Services account name. Changing this forces a new Live Event to be created.
        :param pulumi.Input[str] name: The name which should be used for this Live Event. Changing this forces a new Live Event to be created.
        :param pulumi.Input[pulumi.InputType['LiveEventPreviewArgs']] preview: A `preview` block as defined below.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Live Event should exist. Changing this forces a new Live Event to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Live Event.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] transcription_languages: Specifies a list of languages (locale) to be used for speech-to-text transcription – it should match the spoken language in the audio track. The value should be in `BCP-47` format (e.g: `en-US`). [See the Microsoft Documentation for more information about the live transcription feature and the list of supported languages](https://go.microsoft.com/fwlink/?linkid=2133742 ).
        :param pulumi.Input[bool] use_static_hostname: Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. Changing this forces a new Live Event to be created.
               ---
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["auto_start_enabled"] = auto_start_enabled
        __props__["cross_site_access_policy"] = cross_site_access_policy
        __props__["description"] = description
        __props__["encoding"] = encoding
        __props__["hostname_prefix"] = hostname_prefix
        __props__["input"] = input
        __props__["location"] = location
        __props__["media_services_account_name"] = media_services_account_name
        __props__["name"] = name
        __props__["preview"] = preview
        __props__["resource_group_name"] = resource_group_name
        __props__["tags"] = tags
        __props__["transcription_languages"] = transcription_languages
        __props__["use_static_hostname"] = use_static_hostname
        return LiveEvent(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoStartEnabled")
    def auto_start_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        The flag indicates if the resource should be automatically started on creation. Default is `false`.
        """
        return pulumi.get(self, "auto_start_enabled")

    @property
    @pulumi.getter(name="crossSiteAccessPolicy")
    def cross_site_access_policy(self) -> pulumi.Output[Optional['outputs.LiveEventCrossSiteAccessPolicy']]:
        """
        A `cross_site_access_policy` block as defined below.
        """
        return pulumi.get(self, "cross_site_access_policy")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description for the live event.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def encoding(self) -> pulumi.Output[Optional['outputs.LiveEventEncoding']]:
        """
        A `encoding` block as defined below.
        """
        return pulumi.get(self, "encoding")

    @property
    @pulumi.getter(name="hostnamePrefix")
    def hostname_prefix(self) -> pulumi.Output[Optional[str]]:
        """
        When `use_static_hostname` is set to true, the `hostname_prefix` specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a combination of this prefix, the media service account name and a short code for the Azure Media Services data center.
        """
        return pulumi.get(self, "hostname_prefix")

    @property
    @pulumi.getter
    def input(self) -> pulumi.Output['outputs.LiveEventInput']:
        """
        A `input` block as defined below.
        """
        return pulumi.get(self, "input")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The Azure Region where the Live Event should exist. Changing this forces a new Live Event to be created.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter(name="mediaServicesAccountName")
    def media_services_account_name(self) -> pulumi.Output[str]:
        """
        The Media Services account name. Changing this forces a new Live Event to be created.
        """
        return pulumi.get(self, "media_services_account_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Live Event. Changing this forces a new Live Event to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def preview(self) -> pulumi.Output['outputs.LiveEventPreview']:
        """
        A `preview` block as defined below.
        """
        return pulumi.get(self, "preview")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        The name of the Resource Group where the Live Event should exist. Changing this forces a new Live Event to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags which should be assigned to the Live Event.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="transcriptionLanguages")
    def transcription_languages(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies a list of languages (locale) to be used for speech-to-text transcription – it should match the spoken language in the audio track. The value should be in `BCP-47` format (e.g: `en-US`). [See the Microsoft Documentation for more information about the live transcription feature and the list of supported languages](https://go.microsoft.com/fwlink/?linkid=2133742 ).
        """
        return pulumi.get(self, "transcription_languages")

    @property
    @pulumi.getter(name="useStaticHostname")
    def use_static_hostname(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether a static hostname would be assigned to the live event preview and ingest endpoints. Changing this forces a new Live Event to be created.
        ---
        """
        return pulumi.get(self, "use_static_hostname")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

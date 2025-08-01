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

__all__ = ['EmailServiceDomainArgs', 'EmailServiceDomain']

@pulumi.input_type
class EmailServiceDomainArgs:
    def __init__(__self__, *,
                 domain_management: pulumi.Input[_builtins.str],
                 email_service_id: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 user_engagement_tracking_enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a EmailServiceDomain resource.
        :param pulumi.Input[_builtins.str] domain_management: Describes how a Domains resource is being managed. Possible values are `AzureManaged`, `CustomerManaged`, `CustomerManagedInExchangeOnline`. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[_builtins.str] email_service_id: The resource ID of the Email Communication Service where the Domain belongs to. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Email Communication Service resource. If `domain_management` is `AzureManaged`, the name must be `AzureManagedDomain`. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Email Communication Service.
        :param pulumi.Input[_builtins.bool] user_engagement_tracking_enabled: Describes user engagement tracking is enabled or disabled. Defaults to `false`.
        """
        pulumi.set(__self__, "domain_management", domain_management)
        pulumi.set(__self__, "email_service_id", email_service_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if user_engagement_tracking_enabled is not None:
            pulumi.set(__self__, "user_engagement_tracking_enabled", user_engagement_tracking_enabled)

    @_builtins.property
    @pulumi.getter(name="domainManagement")
    def domain_management(self) -> pulumi.Input[_builtins.str]:
        """
        Describes how a Domains resource is being managed. Possible values are `AzureManaged`, `CustomerManaged`, `CustomerManagedInExchangeOnline`. Changing this forces a new Email Communication Service to be created.
        """
        return pulumi.get(self, "domain_management")

    @domain_management.setter
    def domain_management(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "domain_management", value)

    @_builtins.property
    @pulumi.getter(name="emailServiceId")
    def email_service_id(self) -> pulumi.Input[_builtins.str]:
        """
        The resource ID of the Email Communication Service where the Domain belongs to. Changing this forces a new Email Communication Service to be created.
        """
        return pulumi.get(self, "email_service_id")

    @email_service_id.setter
    def email_service_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "email_service_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Email Communication Service resource. If `domain_management` is `AzureManaged`, the name must be `AzureManagedDomain`. Changing this forces a new Email Communication Service to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the Email Communication Service.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="userEngagementTrackingEnabled")
    def user_engagement_tracking_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Describes user engagement tracking is enabled or disabled. Defaults to `false`.
        """
        return pulumi.get(self, "user_engagement_tracking_enabled")

    @user_engagement_tracking_enabled.setter
    def user_engagement_tracking_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "user_engagement_tracking_enabled", value)


@pulumi.input_type
class _EmailServiceDomainState:
    def __init__(__self__, *,
                 domain_management: Optional[pulumi.Input[_builtins.str]] = None,
                 email_service_id: Optional[pulumi.Input[_builtins.str]] = None,
                 from_sender_domain: Optional[pulumi.Input[_builtins.str]] = None,
                 mail_from_sender_domain: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 user_engagement_tracking_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 verification_records: Optional[pulumi.Input[Sequence[pulumi.Input['EmailServiceDomainVerificationRecordArgs']]]] = None):
        """
        Input properties used for looking up and filtering EmailServiceDomain resources.
        :param pulumi.Input[_builtins.str] domain_management: Describes how a Domains resource is being managed. Possible values are `AzureManaged`, `CustomerManaged`, `CustomerManagedInExchangeOnline`. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[_builtins.str] email_service_id: The resource ID of the Email Communication Service where the Domain belongs to. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[_builtins.str] from_sender_domain: P2 sender domain that is displayed to the email recipients [RFC 5322].
        :param pulumi.Input[_builtins.str] mail_from_sender_domain: P1 sender domain that is present on the email envelope [RFC 5321].
        :param pulumi.Input[_builtins.str] name: The name of the Email Communication Service resource. If `domain_management` is `AzureManaged`, the name must be `AzureManagedDomain`. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Email Communication Service.
        :param pulumi.Input[_builtins.bool] user_engagement_tracking_enabled: Describes user engagement tracking is enabled or disabled. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input['EmailServiceDomainVerificationRecordArgs']]] verification_records: (Optional) An `verification_records` block as defined below.
        """
        if domain_management is not None:
            pulumi.set(__self__, "domain_management", domain_management)
        if email_service_id is not None:
            pulumi.set(__self__, "email_service_id", email_service_id)
        if from_sender_domain is not None:
            pulumi.set(__self__, "from_sender_domain", from_sender_domain)
        if mail_from_sender_domain is not None:
            pulumi.set(__self__, "mail_from_sender_domain", mail_from_sender_domain)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if user_engagement_tracking_enabled is not None:
            pulumi.set(__self__, "user_engagement_tracking_enabled", user_engagement_tracking_enabled)
        if verification_records is not None:
            pulumi.set(__self__, "verification_records", verification_records)

    @_builtins.property
    @pulumi.getter(name="domainManagement")
    def domain_management(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Describes how a Domains resource is being managed. Possible values are `AzureManaged`, `CustomerManaged`, `CustomerManagedInExchangeOnline`. Changing this forces a new Email Communication Service to be created.
        """
        return pulumi.get(self, "domain_management")

    @domain_management.setter
    def domain_management(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "domain_management", value)

    @_builtins.property
    @pulumi.getter(name="emailServiceId")
    def email_service_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource ID of the Email Communication Service where the Domain belongs to. Changing this forces a new Email Communication Service to be created.
        """
        return pulumi.get(self, "email_service_id")

    @email_service_id.setter
    def email_service_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "email_service_id", value)

    @_builtins.property
    @pulumi.getter(name="fromSenderDomain")
    def from_sender_domain(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        P2 sender domain that is displayed to the email recipients [RFC 5322].
        """
        return pulumi.get(self, "from_sender_domain")

    @from_sender_domain.setter
    def from_sender_domain(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "from_sender_domain", value)

    @_builtins.property
    @pulumi.getter(name="mailFromSenderDomain")
    def mail_from_sender_domain(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        P1 sender domain that is present on the email envelope [RFC 5321].
        """
        return pulumi.get(self, "mail_from_sender_domain")

    @mail_from_sender_domain.setter
    def mail_from_sender_domain(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mail_from_sender_domain", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Email Communication Service resource. If `domain_management` is `AzureManaged`, the name must be `AzureManagedDomain`. Changing this forces a new Email Communication Service to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of tags which should be assigned to the Email Communication Service.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="userEngagementTrackingEnabled")
    def user_engagement_tracking_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Describes user engagement tracking is enabled or disabled. Defaults to `false`.
        """
        return pulumi.get(self, "user_engagement_tracking_enabled")

    @user_engagement_tracking_enabled.setter
    def user_engagement_tracking_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "user_engagement_tracking_enabled", value)

    @_builtins.property
    @pulumi.getter(name="verificationRecords")
    def verification_records(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EmailServiceDomainVerificationRecordArgs']]]]:
        """
        (Optional) An `verification_records` block as defined below.
        """
        return pulumi.get(self, "verification_records")

    @verification_records.setter
    def verification_records(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EmailServiceDomainVerificationRecordArgs']]]]):
        pulumi.set(self, "verification_records", value)


@pulumi.type_token("azure:communication/emailServiceDomain:EmailServiceDomain")
class EmailServiceDomain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_management: Optional[pulumi.Input[_builtins.str]] = None,
                 email_service_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 user_engagement_tracking_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        """
        Manages an Email Communication Service Domain.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_email_service = azure.communication.EmailService("example",
            name="example-emailcommunicationservice",
            resource_group_name=example.name,
            data_location="United States")
        example_email_service_domain = azure.communication.EmailServiceDomain("example",
            name="AzureManagedDomain",
            email_service_id=example_email_service.id,
            domain_management="AzureManaged")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Communication`: 2023-03-31

        ## Import

        Communication Services can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:communication/emailServiceDomain:EmailServiceDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Communication/emailServices/emailCommunicationService1/domains/domain1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] domain_management: Describes how a Domains resource is being managed. Possible values are `AzureManaged`, `CustomerManaged`, `CustomerManagedInExchangeOnline`. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[_builtins.str] email_service_id: The resource ID of the Email Communication Service where the Domain belongs to. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[_builtins.str] name: The name of the Email Communication Service resource. If `domain_management` is `AzureManaged`, the name must be `AzureManagedDomain`. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Email Communication Service.
        :param pulumi.Input[_builtins.bool] user_engagement_tracking_enabled: Describes user engagement tracking is enabled or disabled. Defaults to `false`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailServiceDomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Email Communication Service Domain.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_email_service = azure.communication.EmailService("example",
            name="example-emailcommunicationservice",
            resource_group_name=example.name,
            data_location="United States")
        example_email_service_domain = azure.communication.EmailServiceDomain("example",
            name="AzureManagedDomain",
            email_service_id=example_email_service.id,
            domain_management="AzureManaged")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Communication`: 2023-03-31

        ## Import

        Communication Services can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:communication/emailServiceDomain:EmailServiceDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Communication/emailServices/emailCommunicationService1/domains/domain1
        ```

        :param str resource_name: The name of the resource.
        :param EmailServiceDomainArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailServiceDomainArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_management: Optional[pulumi.Input[_builtins.str]] = None,
                 email_service_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 user_engagement_tracking_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailServiceDomainArgs.__new__(EmailServiceDomainArgs)

            if domain_management is None and not opts.urn:
                raise TypeError("Missing required property 'domain_management'")
            __props__.__dict__["domain_management"] = domain_management
            if email_service_id is None and not opts.urn:
                raise TypeError("Missing required property 'email_service_id'")
            __props__.__dict__["email_service_id"] = email_service_id
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["user_engagement_tracking_enabled"] = user_engagement_tracking_enabled
            __props__.__dict__["from_sender_domain"] = None
            __props__.__dict__["mail_from_sender_domain"] = None
            __props__.__dict__["verification_records"] = None
        super(EmailServiceDomain, __self__).__init__(
            'azure:communication/emailServiceDomain:EmailServiceDomain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_management: Optional[pulumi.Input[_builtins.str]] = None,
            email_service_id: Optional[pulumi.Input[_builtins.str]] = None,
            from_sender_domain: Optional[pulumi.Input[_builtins.str]] = None,
            mail_from_sender_domain: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            user_engagement_tracking_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            verification_records: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EmailServiceDomainVerificationRecordArgs', 'EmailServiceDomainVerificationRecordArgsDict']]]]] = None) -> 'EmailServiceDomain':
        """
        Get an existing EmailServiceDomain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] domain_management: Describes how a Domains resource is being managed. Possible values are `AzureManaged`, `CustomerManaged`, `CustomerManagedInExchangeOnline`. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[_builtins.str] email_service_id: The resource ID of the Email Communication Service where the Domain belongs to. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[_builtins.str] from_sender_domain: P2 sender domain that is displayed to the email recipients [RFC 5322].
        :param pulumi.Input[_builtins.str] mail_from_sender_domain: P1 sender domain that is present on the email envelope [RFC 5321].
        :param pulumi.Input[_builtins.str] name: The name of the Email Communication Service resource. If `domain_management` is `AzureManaged`, the name must be `AzureManagedDomain`. Changing this forces a new Email Communication Service to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: A mapping of tags which should be assigned to the Email Communication Service.
        :param pulumi.Input[_builtins.bool] user_engagement_tracking_enabled: Describes user engagement tracking is enabled or disabled. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EmailServiceDomainVerificationRecordArgs', 'EmailServiceDomainVerificationRecordArgsDict']]]] verification_records: (Optional) An `verification_records` block as defined below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailServiceDomainState.__new__(_EmailServiceDomainState)

        __props__.__dict__["domain_management"] = domain_management
        __props__.__dict__["email_service_id"] = email_service_id
        __props__.__dict__["from_sender_domain"] = from_sender_domain
        __props__.__dict__["mail_from_sender_domain"] = mail_from_sender_domain
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["user_engagement_tracking_enabled"] = user_engagement_tracking_enabled
        __props__.__dict__["verification_records"] = verification_records
        return EmailServiceDomain(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="domainManagement")
    def domain_management(self) -> pulumi.Output[_builtins.str]:
        """
        Describes how a Domains resource is being managed. Possible values are `AzureManaged`, `CustomerManaged`, `CustomerManagedInExchangeOnline`. Changing this forces a new Email Communication Service to be created.
        """
        return pulumi.get(self, "domain_management")

    @_builtins.property
    @pulumi.getter(name="emailServiceId")
    def email_service_id(self) -> pulumi.Output[_builtins.str]:
        """
        The resource ID of the Email Communication Service where the Domain belongs to. Changing this forces a new Email Communication Service to be created.
        """
        return pulumi.get(self, "email_service_id")

    @_builtins.property
    @pulumi.getter(name="fromSenderDomain")
    def from_sender_domain(self) -> pulumi.Output[_builtins.str]:
        """
        P2 sender domain that is displayed to the email recipients [RFC 5322].
        """
        return pulumi.get(self, "from_sender_domain")

    @_builtins.property
    @pulumi.getter(name="mailFromSenderDomain")
    def mail_from_sender_domain(self) -> pulumi.Output[_builtins.str]:
        """
        P1 sender domain that is present on the email envelope [RFC 5321].
        """
        return pulumi.get(self, "mail_from_sender_domain")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Email Communication Service resource. If `domain_management` is `AzureManaged`, the name must be `AzureManagedDomain`. Changing this forces a new Email Communication Service to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A mapping of tags which should be assigned to the Email Communication Service.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="userEngagementTrackingEnabled")
    def user_engagement_tracking_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Describes user engagement tracking is enabled or disabled. Defaults to `false`.
        """
        return pulumi.get(self, "user_engagement_tracking_enabled")

    @_builtins.property
    @pulumi.getter(name="verificationRecords")
    def verification_records(self) -> pulumi.Output[Sequence['outputs.EmailServiceDomainVerificationRecord']]:
        """
        (Optional) An `verification_records` block as defined below.
        """
        return pulumi.get(self, "verification_records")


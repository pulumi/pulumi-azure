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

__all__ = ['CertificateArgs', 'Certificate']

@pulumi.input_type
class CertificateArgs:
    def __init__(__self__, *,
                 automation_account_name: pulumi.Input[_builtins.str],
                 base64: pulumi.Input[_builtins.str],
                 resource_group_name: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 exportable: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Certificate resource.
        :param pulumi.Input[_builtins.str] automation_account_name: The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] base64: Base64 encoded value of the certificate. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] description: The description of this Automation Certificate.
        :param pulumi.Input[_builtins.bool] exportable: The is exportable flag of the certificate.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Certificate. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "automation_account_name", automation_account_name)
        pulumi.set(__self__, "base64", base64)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if exportable is not None:
            pulumi.set(__self__, "exportable", exportable)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="automationAccountName")
    def automation_account_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "automation_account_name")

    @automation_account_name.setter
    def automation_account_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "automation_account_name", value)

    @_builtins.property
    @pulumi.getter
    def base64(self) -> pulumi.Input[_builtins.str]:
        """
        Base64 encoded value of the certificate. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "base64")

    @base64.setter
    def base64(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "base64", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of this Automation Certificate.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def exportable(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The is exportable flag of the certificate.
        """
        return pulumi.get(self, "exportable")

    @exportable.setter
    def exportable(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "exportable", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Certificate. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _CertificateState:
    def __init__(__self__, *,
                 automation_account_name: Optional[pulumi.Input[_builtins.str]] = None,
                 base64: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 exportable: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 thumbprint: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Certificate resources.
        :param pulumi.Input[_builtins.str] automation_account_name: The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] base64: Base64 encoded value of the certificate. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] description: The description of this Automation Certificate.
        :param pulumi.Input[_builtins.bool] exportable: The is exportable flag of the certificate.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Certificate. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] thumbprint: The thumbprint for the certificate.
        """
        if automation_account_name is not None:
            pulumi.set(__self__, "automation_account_name", automation_account_name)
        if base64 is not None:
            pulumi.set(__self__, "base64", base64)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if exportable is not None:
            pulumi.set(__self__, "exportable", exportable)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if thumbprint is not None:
            pulumi.set(__self__, "thumbprint", thumbprint)

    @_builtins.property
    @pulumi.getter(name="automationAccountName")
    def automation_account_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "automation_account_name")

    @automation_account_name.setter
    def automation_account_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "automation_account_name", value)

    @_builtins.property
    @pulumi.getter
    def base64(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Base64 encoded value of the certificate. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "base64")

    @base64.setter
    def base64(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "base64", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of this Automation Certificate.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def exportable(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        The is exportable flag of the certificate.
        """
        return pulumi.get(self, "exportable")

    @exportable.setter
    def exportable(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "exportable", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Certificate. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_group_name", value)

    @_builtins.property
    @pulumi.getter
    def thumbprint(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The thumbprint for the certificate.
        """
        return pulumi.get(self, "thumbprint")

    @thumbprint.setter
    def thumbprint(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "thumbprint", value)


@pulumi.type_token("azure:automation/certificate:Certificate")
class Certificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automation_account_name: Optional[pulumi.Input[_builtins.str]] = None,
                 base64: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 exportable: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an Automation Certificate.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure
        import pulumi_std as std

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.automation.Account("example",
            name="account1",
            location=example.location,
            resource_group_name=example.name,
            sku_name="Basic")
        example_certificate = azure.automation.Certificate("example",
            name="certificate1",
            resource_group_name=example.name,
            automation_account_name=example_account.name,
            description="This is an example certificate",
            base64=std.filebase64(input="certificate.pfx").result,
            exportable=True)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Automation`: 2023-11-01

        ## Import

        Automation Certificates can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:automation/certificate:Certificate certificate1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/certificates/certificate1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] automation_account_name: The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] base64: Base64 encoded value of the certificate. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] description: The description of this Automation Certificate.
        :param pulumi.Input[_builtins.bool] exportable: The is exportable flag of the certificate.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Certificate. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Automation Certificate.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure
        import pulumi_std as std

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.automation.Account("example",
            name="account1",
            location=example.location,
            resource_group_name=example.name,
            sku_name="Basic")
        example_certificate = azure.automation.Certificate("example",
            name="certificate1",
            resource_group_name=example.name,
            automation_account_name=example_account.name,
            description="This is an example certificate",
            base64=std.filebase64(input="certificate.pfx").result,
            exportable=True)
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Automation`: 2023-11-01

        ## Import

        Automation Certificates can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:automation/certificate:Certificate certificate1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/certificates/certificate1
        ```

        :param str resource_name: The name of the resource.
        :param CertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automation_account_name: Optional[pulumi.Input[_builtins.str]] = None,
                 base64: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 exportable: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CertificateArgs.__new__(CertificateArgs)

            if automation_account_name is None and not opts.urn:
                raise TypeError("Missing required property 'automation_account_name'")
            __props__.__dict__["automation_account_name"] = automation_account_name
            if base64 is None and not opts.urn:
                raise TypeError("Missing required property 'base64'")
            __props__.__dict__["base64"] = None if base64 is None else pulumi.Output.secret(base64)
            __props__.__dict__["description"] = description
            __props__.__dict__["exportable"] = exportable
            __props__.__dict__["name"] = name
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["thumbprint"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["base64"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Certificate, __self__).__init__(
            'azure:automation/certificate:Certificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            automation_account_name: Optional[pulumi.Input[_builtins.str]] = None,
            base64: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            exportable: Optional[pulumi.Input[_builtins.bool]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            thumbprint: Optional[pulumi.Input[_builtins.str]] = None) -> 'Certificate':
        """
        Get an existing Certificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] automation_account_name: The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] base64: Base64 encoded value of the certificate. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] description: The description of this Automation Certificate.
        :param pulumi.Input[_builtins.bool] exportable: The is exportable flag of the certificate.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Certificate. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_group_name: The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] thumbprint: The thumbprint for the certificate.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CertificateState.__new__(_CertificateState)

        __props__.__dict__["automation_account_name"] = automation_account_name
        __props__.__dict__["base64"] = base64
        __props__.__dict__["description"] = description
        __props__.__dict__["exportable"] = exportable
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["thumbprint"] = thumbprint
        return Certificate(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="automationAccountName")
    def automation_account_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "automation_account_name")

    @_builtins.property
    @pulumi.getter
    def base64(self) -> pulumi.Output[_builtins.str]:
        """
        Base64 encoded value of the certificate. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "base64")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of this Automation Certificate.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def exportable(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        The is exportable flag of the certificate.
        """
        return pulumi.get(self, "exportable")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Certificate. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter
    def thumbprint(self) -> pulumi.Output[_builtins.str]:
        """
        The thumbprint for the certificate.
        """
        return pulumi.get(self, "thumbprint")


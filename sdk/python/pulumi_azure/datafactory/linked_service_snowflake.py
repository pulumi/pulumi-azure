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

__all__ = ['LinkedServiceSnowflakeArgs', 'LinkedServiceSnowflake']

@pulumi.input_type
class LinkedServiceSnowflakeArgs:
    def __init__(__self__, *,
                 connection_string: pulumi.Input[_builtins.str],
                 data_factory_id: pulumi.Input[_builtins.str],
                 additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 integration_runtime_name: Optional[pulumi.Input[_builtins.str]] = None,
                 key_vault_password: Optional[pulumi.Input['LinkedServiceSnowflakeKeyVaultPasswordArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a LinkedServiceSnowflake resource.
        :param pulumi.Input[_builtins.str] connection_string: The connection string in which to authenticate with Snowflake.
        :param pulumi.Input[_builtins.str] data_factory_id: The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] additional_properties: A map of additional properties to associate with the Data Factory Linked Service.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] annotations: List of tags that can be used for describing the Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] description: The description for the Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] integration_runtime_name: The integration runtime reference to associate with the Data Factory Linked Service.
        :param pulumi.Input['LinkedServiceSnowflakeKeyVaultPasswordArgs'] key_vault_password: A `key_vault_password` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] parameters: A map of parameters to associate with the Data Factory Linked Service.
        """
        pulumi.set(__self__, "connection_string", connection_string)
        pulumi.set(__self__, "data_factory_id", data_factory_id)
        if additional_properties is not None:
            pulumi.set(__self__, "additional_properties", additional_properties)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if integration_runtime_name is not None:
            pulumi.set(__self__, "integration_runtime_name", integration_runtime_name)
        if key_vault_password is not None:
            pulumi.set(__self__, "key_vault_password", key_vault_password)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)

    @_builtins.property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> pulumi.Input[_builtins.str]:
        """
        The connection string in which to authenticate with Snowflake.
        """
        return pulumi.get(self, "connection_string")

    @connection_string.setter
    def connection_string(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "connection_string", value)

    @_builtins.property
    @pulumi.getter(name="dataFactoryId")
    def data_factory_id(self) -> pulumi.Input[_builtins.str]:
        """
        The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        """
        return pulumi.get(self, "data_factory_id")

    @data_factory_id.setter
    def data_factory_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "data_factory_id", value)

    @_builtins.property
    @pulumi.getter(name="additionalProperties")
    def additional_properties(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A map of additional properties to associate with the Data Factory Linked Service.
        """
        return pulumi.get(self, "additional_properties")

    @additional_properties.setter
    def additional_properties(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "additional_properties", value)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of tags that can be used for describing the Data Factory Linked Service.
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description for the Data Factory Linked Service.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="integrationRuntimeName")
    def integration_runtime_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The integration runtime reference to associate with the Data Factory Linked Service.
        """
        return pulumi.get(self, "integration_runtime_name")

    @integration_runtime_name.setter
    def integration_runtime_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "integration_runtime_name", value)

    @_builtins.property
    @pulumi.getter(name="keyVaultPassword")
    def key_vault_password(self) -> Optional[pulumi.Input['LinkedServiceSnowflakeKeyVaultPasswordArgs']]:
        """
        A `key_vault_password` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
        """
        return pulumi.get(self, "key_vault_password")

    @key_vault_password.setter
    def key_vault_password(self, value: Optional[pulumi.Input['LinkedServiceSnowflakeKeyVaultPasswordArgs']]):
        pulumi.set(self, "key_vault_password", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A map of parameters to associate with the Data Factory Linked Service.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "parameters", value)


@pulumi.input_type
class _LinkedServiceSnowflakeState:
    def __init__(__self__, *,
                 additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 connection_string: Optional[pulumi.Input[_builtins.str]] = None,
                 data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 integration_runtime_name: Optional[pulumi.Input[_builtins.str]] = None,
                 key_vault_password: Optional[pulumi.Input['LinkedServiceSnowflakeKeyVaultPasswordArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering LinkedServiceSnowflake resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] additional_properties: A map of additional properties to associate with the Data Factory Linked Service.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] annotations: List of tags that can be used for describing the Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] connection_string: The connection string in which to authenticate with Snowflake.
        :param pulumi.Input[_builtins.str] data_factory_id: The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: The description for the Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] integration_runtime_name: The integration runtime reference to associate with the Data Factory Linked Service.
        :param pulumi.Input['LinkedServiceSnowflakeKeyVaultPasswordArgs'] key_vault_password: A `key_vault_password` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] parameters: A map of parameters to associate with the Data Factory Linked Service.
        """
        if additional_properties is not None:
            pulumi.set(__self__, "additional_properties", additional_properties)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if connection_string is not None:
            pulumi.set(__self__, "connection_string", connection_string)
        if data_factory_id is not None:
            pulumi.set(__self__, "data_factory_id", data_factory_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if integration_runtime_name is not None:
            pulumi.set(__self__, "integration_runtime_name", integration_runtime_name)
        if key_vault_password is not None:
            pulumi.set(__self__, "key_vault_password", key_vault_password)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)

    @_builtins.property
    @pulumi.getter(name="additionalProperties")
    def additional_properties(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A map of additional properties to associate with the Data Factory Linked Service.
        """
        return pulumi.get(self, "additional_properties")

    @additional_properties.setter
    def additional_properties(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "additional_properties", value)

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of tags that can be used for describing the Data Factory Linked Service.
        """
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "annotations", value)

    @_builtins.property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The connection string in which to authenticate with Snowflake.
        """
        return pulumi.get(self, "connection_string")

    @connection_string.setter
    def connection_string(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "connection_string", value)

    @_builtins.property
    @pulumi.getter(name="dataFactoryId")
    def data_factory_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        """
        return pulumi.get(self, "data_factory_id")

    @data_factory_id.setter
    def data_factory_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "data_factory_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description for the Data Factory Linked Service.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="integrationRuntimeName")
    def integration_runtime_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The integration runtime reference to associate with the Data Factory Linked Service.
        """
        return pulumi.get(self, "integration_runtime_name")

    @integration_runtime_name.setter
    def integration_runtime_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "integration_runtime_name", value)

    @_builtins.property
    @pulumi.getter(name="keyVaultPassword")
    def key_vault_password(self) -> Optional[pulumi.Input['LinkedServiceSnowflakeKeyVaultPasswordArgs']]:
        """
        A `key_vault_password` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
        """
        return pulumi.get(self, "key_vault_password")

    @key_vault_password.setter
    def key_vault_password(self, value: Optional[pulumi.Input['LinkedServiceSnowflakeKeyVaultPasswordArgs']]):
        pulumi.set(self, "key_vault_password", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A map of parameters to associate with the Data Factory Linked Service.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "parameters", value)


@pulumi.type_token("azure:datafactory/linkedServiceSnowflake:LinkedServiceSnowflake")
class LinkedServiceSnowflake(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 connection_string: Optional[pulumi.Input[_builtins.str]] = None,
                 data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 integration_runtime_name: Optional[pulumi.Input[_builtins.str]] = None,
                 key_vault_password: Optional[pulumi.Input[Union['LinkedServiceSnowflakeKeyVaultPasswordArgs', 'LinkedServiceSnowflakeKeyVaultPasswordArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Manages a Linked Service (connection) between Snowflake and Azure Data Factory.

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
        example_linked_service_snowflake = azure.datafactory.LinkedServiceSnowflake("example",
            name="example",
            data_factory_id=example_factory.id,
            connection_string="jdbc:snowflake://account.region.snowflakecomputing.com/?user=user&db=db&warehouse=wh")
        ```

        ### With Password In Key Vault

        ```python
        import pulumi
        import pulumi_azure as azure

        current = azure.core.get_client_config()
        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_key_vault = azure.keyvault.KeyVault("example",
            name="example",
            location=example.location,
            resource_group_name=example.name,
            tenant_id=current.tenant_id,
            sku_name="standard")
        example_factory = azure.datafactory.Factory("example",
            name="example",
            location=example.location,
            resource_group_name=example.name)
        example_linked_service_key_vault = azure.datafactory.LinkedServiceKeyVault("example",
            name="kvlink",
            data_factory_id=example_factory.id,
            key_vault_id=example_key_vault.id)
        example_linked_service_snowflake = azure.datafactory.LinkedServiceSnowflake("example",
            name="example",
            data_factory_id=example_factory.id,
            connection_string="jdbc:snowflake://account.region.snowflakecomputing.com/?user=user&db=db&warehouse=wh",
            key_vault_password={
                "linked_service_name": example_linked_service_key_vault.name,
                "secret_name": "secret",
            })
        ```

        ## Import

        Data Factory Snowflake Linked Service's can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:datafactory/linkedServiceSnowflake:LinkedServiceSnowflake example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] additional_properties: A map of additional properties to associate with the Data Factory Linked Service.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] annotations: List of tags that can be used for describing the Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] connection_string: The connection string in which to authenticate with Snowflake.
        :param pulumi.Input[_builtins.str] data_factory_id: The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: The description for the Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] integration_runtime_name: The integration runtime reference to associate with the Data Factory Linked Service.
        :param pulumi.Input[Union['LinkedServiceSnowflakeKeyVaultPasswordArgs', 'LinkedServiceSnowflakeKeyVaultPasswordArgsDict']] key_vault_password: A `key_vault_password` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] parameters: A map of parameters to associate with the Data Factory Linked Service.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LinkedServiceSnowflakeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Linked Service (connection) between Snowflake and Azure Data Factory.

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
        example_linked_service_snowflake = azure.datafactory.LinkedServiceSnowflake("example",
            name="example",
            data_factory_id=example_factory.id,
            connection_string="jdbc:snowflake://account.region.snowflakecomputing.com/?user=user&db=db&warehouse=wh")
        ```

        ### With Password In Key Vault

        ```python
        import pulumi
        import pulumi_azure as azure

        current = azure.core.get_client_config()
        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_key_vault = azure.keyvault.KeyVault("example",
            name="example",
            location=example.location,
            resource_group_name=example.name,
            tenant_id=current.tenant_id,
            sku_name="standard")
        example_factory = azure.datafactory.Factory("example",
            name="example",
            location=example.location,
            resource_group_name=example.name)
        example_linked_service_key_vault = azure.datafactory.LinkedServiceKeyVault("example",
            name="kvlink",
            data_factory_id=example_factory.id,
            key_vault_id=example_key_vault.id)
        example_linked_service_snowflake = azure.datafactory.LinkedServiceSnowflake("example",
            name="example",
            data_factory_id=example_factory.id,
            connection_string="jdbc:snowflake://account.region.snowflakecomputing.com/?user=user&db=db&warehouse=wh",
            key_vault_password={
                "linked_service_name": example_linked_service_key_vault.name,
                "secret_name": "secret",
            })
        ```

        ## Import

        Data Factory Snowflake Linked Service's can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:datafactory/linkedServiceSnowflake:LinkedServiceSnowflake example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
        ```

        :param str resource_name: The name of the resource.
        :param LinkedServiceSnowflakeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LinkedServiceSnowflakeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 connection_string: Optional[pulumi.Input[_builtins.str]] = None,
                 data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 integration_runtime_name: Optional[pulumi.Input[_builtins.str]] = None,
                 key_vault_password: Optional[pulumi.Input[Union['LinkedServiceSnowflakeKeyVaultPasswordArgs', 'LinkedServiceSnowflakeKeyVaultPasswordArgsDict']]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LinkedServiceSnowflakeArgs.__new__(LinkedServiceSnowflakeArgs)

            __props__.__dict__["additional_properties"] = additional_properties
            __props__.__dict__["annotations"] = annotations
            if connection_string is None and not opts.urn:
                raise TypeError("Missing required property 'connection_string'")
            __props__.__dict__["connection_string"] = connection_string
            if data_factory_id is None and not opts.urn:
                raise TypeError("Missing required property 'data_factory_id'")
            __props__.__dict__["data_factory_id"] = data_factory_id
            __props__.__dict__["description"] = description
            __props__.__dict__["integration_runtime_name"] = integration_runtime_name
            __props__.__dict__["key_vault_password"] = key_vault_password
            __props__.__dict__["name"] = name
            __props__.__dict__["parameters"] = parameters
        super(LinkedServiceSnowflake, __self__).__init__(
            'azure:datafactory/linkedServiceSnowflake:LinkedServiceSnowflake',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            additional_properties: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            annotations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            connection_string: Optional[pulumi.Input[_builtins.str]] = None,
            data_factory_id: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            integration_runtime_name: Optional[pulumi.Input[_builtins.str]] = None,
            key_vault_password: Optional[pulumi.Input[Union['LinkedServiceSnowflakeKeyVaultPasswordArgs', 'LinkedServiceSnowflakeKeyVaultPasswordArgsDict']]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None) -> 'LinkedServiceSnowflake':
        """
        Get an existing LinkedServiceSnowflake resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] additional_properties: A map of additional properties to associate with the Data Factory Linked Service.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] annotations: List of tags that can be used for describing the Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] connection_string: The connection string in which to authenticate with Snowflake.
        :param pulumi.Input[_builtins.str] data_factory_id: The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        :param pulumi.Input[_builtins.str] description: The description for the Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] integration_runtime_name: The integration runtime reference to associate with the Data Factory Linked Service.
        :param pulumi.Input[Union['LinkedServiceSnowflakeKeyVaultPasswordArgs', 'LinkedServiceSnowflakeKeyVaultPasswordArgsDict']] key_vault_password: A `key_vault_password` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
        :param pulumi.Input[_builtins.str] name: Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] parameters: A map of parameters to associate with the Data Factory Linked Service.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LinkedServiceSnowflakeState.__new__(_LinkedServiceSnowflakeState)

        __props__.__dict__["additional_properties"] = additional_properties
        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["connection_string"] = connection_string
        __props__.__dict__["data_factory_id"] = data_factory_id
        __props__.__dict__["description"] = description
        __props__.__dict__["integration_runtime_name"] = integration_runtime_name
        __props__.__dict__["key_vault_password"] = key_vault_password
        __props__.__dict__["name"] = name
        __props__.__dict__["parameters"] = parameters
        return LinkedServiceSnowflake(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="additionalProperties")
    def additional_properties(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A map of additional properties to associate with the Data Factory Linked Service.
        """
        return pulumi.get(self, "additional_properties")

    @_builtins.property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        List of tags that can be used for describing the Data Factory Linked Service.
        """
        return pulumi.get(self, "annotations")

    @_builtins.property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> pulumi.Output[_builtins.str]:
        """
        The connection string in which to authenticate with Snowflake.
        """
        return pulumi.get(self, "connection_string")

    @_builtins.property
    @pulumi.getter(name="dataFactoryId")
    def data_factory_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        """
        return pulumi.get(self, "data_factory_id")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description for the Data Factory Linked Service.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="integrationRuntimeName")
    def integration_runtime_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The integration runtime reference to associate with the Data Factory Linked Service.
        """
        return pulumi.get(self, "integration_runtime_name")

    @_builtins.property
    @pulumi.getter(name="keyVaultPassword")
    def key_vault_password(self) -> pulumi.Output[Optional['outputs.LinkedServiceSnowflakeKeyVaultPassword']]:
        """
        A `key_vault_password` block as defined below. Use this argument to store Snowflake password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
        """
        return pulumi.get(self, "key_vault_password")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def parameters(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        A map of parameters to associate with the Data Factory Linked Service.
        """
        return pulumi.get(self, "parameters")


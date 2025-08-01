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

__all__ = ['ContainerArgs', 'Container']

@pulumi.input_type
class ContainerArgs:
    def __init__(__self__, *,
                 container_access_type: Optional[pulumi.Input[_builtins.str]] = None,
                 default_encryption_scope: Optional[pulumi.Input[_builtins.str]] = None,
                 encryption_scope_override_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Container resource.
        :param pulumi.Input[_builtins.str] container_access_type: The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
               
               > **Note:** When updating `container_access_type` for an existing storage container resource, Shared Key authentication will always be used, as AzureAD authentication is not supported.
        :param pulumi.Input[_builtins.str] default_encryption_scope: The default encryption scope to use for blobs uploaded to this container. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] encryption_scope_override_enabled: Whether to allow blobs to override the default encryption scope for this container. Can only be set when specifying `default_encryption_scope`. Defaults to `true`. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of MetaData for this Container. All metadata keys should be lowercase.
        :param pulumi.Input[_builtins.str] name: The name of the Container which should be created within the Storage Account. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] storage_account_id: The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created.
               
               > **Note:** One of `storage_account_name` or `storage_account_id` must be specified. When specifying `storage_account_id` the resource will use the Resource Manager API, rather than the Data Plane API.
        :param pulumi.Input[_builtins.str] storage_account_name: The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created. This property is deprecated in favour of `storage_account_id`.
               
               > **Note:** Migrating from the deprecated `storage_account_name` to `storage_account_id` is supported without recreation. Any other change to either property will result in the resource being recreated.
        """
        if container_access_type is not None:
            pulumi.set(__self__, "container_access_type", container_access_type)
        if default_encryption_scope is not None:
            pulumi.set(__self__, "default_encryption_scope", default_encryption_scope)
        if encryption_scope_override_enabled is not None:
            pulumi.set(__self__, "encryption_scope_override_enabled", encryption_scope_override_enabled)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_account_id is not None:
            pulumi.set(__self__, "storage_account_id", storage_account_id)
        if storage_account_name is not None:
            warnings.warn("""the `storage_account_name` property has been deprecated in favour of `storage_account_id` and will be removed in version 5.0 of the Provider.""", DeprecationWarning)
            pulumi.log.warn("""storage_account_name is deprecated: the `storage_account_name` property has been deprecated in favour of `storage_account_id` and will be removed in version 5.0 of the Provider.""")
        if storage_account_name is not None:
            pulumi.set(__self__, "storage_account_name", storage_account_name)

    @_builtins.property
    @pulumi.getter(name="containerAccessType")
    def container_access_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.

        > **Note:** When updating `container_access_type` for an existing storage container resource, Shared Key authentication will always be used, as AzureAD authentication is not supported.
        """
        return pulumi.get(self, "container_access_type")

    @container_access_type.setter
    def container_access_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "container_access_type", value)

    @_builtins.property
    @pulumi.getter(name="defaultEncryptionScope")
    def default_encryption_scope(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The default encryption scope to use for blobs uploaded to this container. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "default_encryption_scope")

    @default_encryption_scope.setter
    def default_encryption_scope(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_encryption_scope", value)

    @_builtins.property
    @pulumi.getter(name="encryptionScopeOverrideEnabled")
    def encryption_scope_override_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to allow blobs to override the default encryption scope for this container. Can only be set when specifying `default_encryption_scope`. Defaults to `true`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "encryption_scope_override_enabled")

    @encryption_scope_override_enabled.setter
    def encryption_scope_override_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "encryption_scope_override_enabled", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of MetaData for this Container. All metadata keys should be lowercase.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Container which should be created within the Storage Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created.

        > **Note:** One of `storage_account_name` or `storage_account_id` must be specified. When specifying `storage_account_id` the resource will use the Resource Manager API, rather than the Data Plane API.
        """
        return pulumi.get(self, "storage_account_id")

    @storage_account_id.setter
    def storage_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_account_id", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountName")
    @_utilities.deprecated("""the `storage_account_name` property has been deprecated in favour of `storage_account_id` and will be removed in version 5.0 of the Provider.""")
    def storage_account_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created. This property is deprecated in favour of `storage_account_id`.

        > **Note:** Migrating from the deprecated `storage_account_name` to `storage_account_id` is supported without recreation. Any other change to either property will result in the resource being recreated.
        """
        return pulumi.get(self, "storage_account_name")

    @storage_account_name.setter
    def storage_account_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_account_name", value)


@pulumi.input_type
class _ContainerState:
    def __init__(__self__, *,
                 container_access_type: Optional[pulumi.Input[_builtins.str]] = None,
                 default_encryption_scope: Optional[pulumi.Input[_builtins.str]] = None,
                 encryption_scope_override_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 has_immutability_policy: Optional[pulumi.Input[_builtins.bool]] = None,
                 has_legal_hold: Optional[pulumi.Input[_builtins.bool]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_manager_id: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Container resources.
        :param pulumi.Input[_builtins.str] container_access_type: The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
               
               > **Note:** When updating `container_access_type` for an existing storage container resource, Shared Key authentication will always be used, as AzureAD authentication is not supported.
        :param pulumi.Input[_builtins.str] default_encryption_scope: The default encryption scope to use for blobs uploaded to this container. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] encryption_scope_override_enabled: Whether to allow blobs to override the default encryption scope for this container. Can only be set when specifying `default_encryption_scope`. Defaults to `true`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] has_immutability_policy: Is there an Immutability Policy configured on this Storage Container?
        :param pulumi.Input[_builtins.bool] has_legal_hold: Is there a Legal Hold configured on this Storage Container?
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of MetaData for this Container. All metadata keys should be lowercase.
        :param pulumi.Input[_builtins.str] name: The name of the Container which should be created within the Storage Account. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_manager_id: The Resource Manager ID of this Storage Container.
        :param pulumi.Input[_builtins.str] storage_account_id: The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created.
               
               > **Note:** One of `storage_account_name` or `storage_account_id` must be specified. When specifying `storage_account_id` the resource will use the Resource Manager API, rather than the Data Plane API.
        :param pulumi.Input[_builtins.str] storage_account_name: The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created. This property is deprecated in favour of `storage_account_id`.
               
               > **Note:** Migrating from the deprecated `storage_account_name` to `storage_account_id` is supported without recreation. Any other change to either property will result in the resource being recreated.
        """
        if container_access_type is not None:
            pulumi.set(__self__, "container_access_type", container_access_type)
        if default_encryption_scope is not None:
            pulumi.set(__self__, "default_encryption_scope", default_encryption_scope)
        if encryption_scope_override_enabled is not None:
            pulumi.set(__self__, "encryption_scope_override_enabled", encryption_scope_override_enabled)
        if has_immutability_policy is not None:
            pulumi.set(__self__, "has_immutability_policy", has_immutability_policy)
        if has_legal_hold is not None:
            pulumi.set(__self__, "has_legal_hold", has_legal_hold)
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if resource_manager_id is not None:
            warnings.warn("""this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider.""", DeprecationWarning)
            pulumi.log.warn("""resource_manager_id is deprecated: this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider.""")
        if resource_manager_id is not None:
            pulumi.set(__self__, "resource_manager_id", resource_manager_id)
        if storage_account_id is not None:
            pulumi.set(__self__, "storage_account_id", storage_account_id)
        if storage_account_name is not None:
            warnings.warn("""the `storage_account_name` property has been deprecated in favour of `storage_account_id` and will be removed in version 5.0 of the Provider.""", DeprecationWarning)
            pulumi.log.warn("""storage_account_name is deprecated: the `storage_account_name` property has been deprecated in favour of `storage_account_id` and will be removed in version 5.0 of the Provider.""")
        if storage_account_name is not None:
            pulumi.set(__self__, "storage_account_name", storage_account_name)

    @_builtins.property
    @pulumi.getter(name="containerAccessType")
    def container_access_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.

        > **Note:** When updating `container_access_type` for an existing storage container resource, Shared Key authentication will always be used, as AzureAD authentication is not supported.
        """
        return pulumi.get(self, "container_access_type")

    @container_access_type.setter
    def container_access_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "container_access_type", value)

    @_builtins.property
    @pulumi.getter(name="defaultEncryptionScope")
    def default_encryption_scope(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The default encryption scope to use for blobs uploaded to this container. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "default_encryption_scope")

    @default_encryption_scope.setter
    def default_encryption_scope(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_encryption_scope", value)

    @_builtins.property
    @pulumi.getter(name="encryptionScopeOverrideEnabled")
    def encryption_scope_override_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether to allow blobs to override the default encryption scope for this container. Can only be set when specifying `default_encryption_scope`. Defaults to `true`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "encryption_scope_override_enabled")

    @encryption_scope_override_enabled.setter
    def encryption_scope_override_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "encryption_scope_override_enabled", value)

    @_builtins.property
    @pulumi.getter(name="hasImmutabilityPolicy")
    def has_immutability_policy(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is there an Immutability Policy configured on this Storage Container?
        """
        return pulumi.get(self, "has_immutability_policy")

    @has_immutability_policy.setter
    def has_immutability_policy(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "has_immutability_policy", value)

    @_builtins.property
    @pulumi.getter(name="hasLegalHold")
    def has_legal_hold(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Is there a Legal Hold configured on this Storage Container?
        """
        return pulumi.get(self, "has_legal_hold")

    @has_legal_hold.setter
    def has_legal_hold(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "has_legal_hold", value)

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        A mapping of MetaData for this Container. All metadata keys should be lowercase.
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "metadata", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Container which should be created within the Storage Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="resourceManagerId")
    @_utilities.deprecated("""this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider.""")
    def resource_manager_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Resource Manager ID of this Storage Container.
        """
        return pulumi.get(self, "resource_manager_id")

    @resource_manager_id.setter
    def resource_manager_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_manager_id", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created.

        > **Note:** One of `storage_account_name` or `storage_account_id` must be specified. When specifying `storage_account_id` the resource will use the Resource Manager API, rather than the Data Plane API.
        """
        return pulumi.get(self, "storage_account_id")

    @storage_account_id.setter
    def storage_account_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_account_id", value)

    @_builtins.property
    @pulumi.getter(name="storageAccountName")
    @_utilities.deprecated("""the `storage_account_name` property has been deprecated in favour of `storage_account_id` and will be removed in version 5.0 of the Provider.""")
    def storage_account_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created. This property is deprecated in favour of `storage_account_id`.

        > **Note:** Migrating from the deprecated `storage_account_name` to `storage_account_id` is supported without recreation. Any other change to either property will result in the resource being recreated.
        """
        return pulumi.get(self, "storage_account_name")

    @storage_account_name.setter
    def storage_account_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_account_name", value)


@pulumi.type_token("azure:storage/container:Container")
class Container(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_access_type: Optional[pulumi.Input[_builtins.str]] = None,
                 default_encryption_scope: Optional[pulumi.Input[_builtins.str]] = None,
                 encryption_scope_override_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Container within an Azure Storage Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="examplestoraccount",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS",
            tags={
                "environment": "staging",
            })
        example_container = azure.storage.Container("example",
            name="vhds",
            storage_account_id=example_account.id,
            container_access_type="private")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Storage`: 2023-05-01

        ## Import

        Storage Containers can be imported using the `resource manager id`, e.g.

        ```sh
        $ pulumi import azure:storage/container:Container container1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/myaccount/blobServices/default/containers/mycontainer
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] container_access_type: The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
               
               > **Note:** When updating `container_access_type` for an existing storage container resource, Shared Key authentication will always be used, as AzureAD authentication is not supported.
        :param pulumi.Input[_builtins.str] default_encryption_scope: The default encryption scope to use for blobs uploaded to this container. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] encryption_scope_override_enabled: Whether to allow blobs to override the default encryption scope for this container. Can only be set when specifying `default_encryption_scope`. Defaults to `true`. Changing this forces a new resource to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of MetaData for this Container. All metadata keys should be lowercase.
        :param pulumi.Input[_builtins.str] name: The name of the Container which should be created within the Storage Account. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] storage_account_id: The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created.
               
               > **Note:** One of `storage_account_name` or `storage_account_id` must be specified. When specifying `storage_account_id` the resource will use the Resource Manager API, rather than the Data Plane API.
        :param pulumi.Input[_builtins.str] storage_account_name: The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created. This property is deprecated in favour of `storage_account_id`.
               
               > **Note:** Migrating from the deprecated `storage_account_name` to `storage_account_id` is supported without recreation. Any other change to either property will result in the resource being recreated.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ContainerArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Container within an Azure Storage Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_account = azure.storage.Account("example",
            name="examplestoraccount",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS",
            tags={
                "environment": "staging",
            })
        example_container = azure.storage.Container("example",
            name="vhds",
            storage_account_id=example_account.id,
            container_access_type="private")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Storage`: 2023-05-01

        ## Import

        Storage Containers can be imported using the `resource manager id`, e.g.

        ```sh
        $ pulumi import azure:storage/container:Container container1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/myaccount/blobServices/default/containers/mycontainer
        ```

        :param str resource_name: The name of the resource.
        :param ContainerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ContainerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_access_type: Optional[pulumi.Input[_builtins.str]] = None,
                 default_encryption_scope: Optional[pulumi.Input[_builtins.str]] = None,
                 encryption_scope_override_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_account_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ContainerArgs.__new__(ContainerArgs)

            __props__.__dict__["container_access_type"] = container_access_type
            __props__.__dict__["default_encryption_scope"] = default_encryption_scope
            __props__.__dict__["encryption_scope_override_enabled"] = encryption_scope_override_enabled
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["name"] = name
            __props__.__dict__["storage_account_id"] = storage_account_id
            __props__.__dict__["storage_account_name"] = storage_account_name
            __props__.__dict__["has_immutability_policy"] = None
            __props__.__dict__["has_legal_hold"] = None
            __props__.__dict__["resource_manager_id"] = None
        super(Container, __self__).__init__(
            'azure:storage/container:Container',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            container_access_type: Optional[pulumi.Input[_builtins.str]] = None,
            default_encryption_scope: Optional[pulumi.Input[_builtins.str]] = None,
            encryption_scope_override_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            has_immutability_policy: Optional[pulumi.Input[_builtins.bool]] = None,
            has_legal_hold: Optional[pulumi.Input[_builtins.bool]] = None,
            metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            resource_manager_id: Optional[pulumi.Input[_builtins.str]] = None,
            storage_account_id: Optional[pulumi.Input[_builtins.str]] = None,
            storage_account_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'Container':
        """
        Get an existing Container resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] container_access_type: The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.
               
               > **Note:** When updating `container_access_type` for an existing storage container resource, Shared Key authentication will always be used, as AzureAD authentication is not supported.
        :param pulumi.Input[_builtins.str] default_encryption_scope: The default encryption scope to use for blobs uploaded to this container. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] encryption_scope_override_enabled: Whether to allow blobs to override the default encryption scope for this container. Can only be set when specifying `default_encryption_scope`. Defaults to `true`. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.bool] has_immutability_policy: Is there an Immutability Policy configured on this Storage Container?
        :param pulumi.Input[_builtins.bool] has_legal_hold: Is there a Legal Hold configured on this Storage Container?
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] metadata: A mapping of MetaData for this Container. All metadata keys should be lowercase.
        :param pulumi.Input[_builtins.str] name: The name of the Container which should be created within the Storage Account. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] resource_manager_id: The Resource Manager ID of this Storage Container.
        :param pulumi.Input[_builtins.str] storage_account_id: The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created.
               
               > **Note:** One of `storage_account_name` or `storage_account_id` must be specified. When specifying `storage_account_id` the resource will use the Resource Manager API, rather than the Data Plane API.
        :param pulumi.Input[_builtins.str] storage_account_name: The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created. This property is deprecated in favour of `storage_account_id`.
               
               > **Note:** Migrating from the deprecated `storage_account_name` to `storage_account_id` is supported without recreation. Any other change to either property will result in the resource being recreated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ContainerState.__new__(_ContainerState)

        __props__.__dict__["container_access_type"] = container_access_type
        __props__.__dict__["default_encryption_scope"] = default_encryption_scope
        __props__.__dict__["encryption_scope_override_enabled"] = encryption_scope_override_enabled
        __props__.__dict__["has_immutability_policy"] = has_immutability_policy
        __props__.__dict__["has_legal_hold"] = has_legal_hold
        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["name"] = name
        __props__.__dict__["resource_manager_id"] = resource_manager_id
        __props__.__dict__["storage_account_id"] = storage_account_id
        __props__.__dict__["storage_account_name"] = storage_account_name
        return Container(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="containerAccessType")
    def container_access_type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The Access Level configured for this Container. Possible values are `blob`, `container` or `private`. Defaults to `private`.

        > **Note:** When updating `container_access_type` for an existing storage container resource, Shared Key authentication will always be used, as AzureAD authentication is not supported.
        """
        return pulumi.get(self, "container_access_type")

    @_builtins.property
    @pulumi.getter(name="defaultEncryptionScope")
    def default_encryption_scope(self) -> pulumi.Output[_builtins.str]:
        """
        The default encryption scope to use for blobs uploaded to this container. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "default_encryption_scope")

    @_builtins.property
    @pulumi.getter(name="encryptionScopeOverrideEnabled")
    def encryption_scope_override_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether to allow blobs to override the default encryption scope for this container. Can only be set when specifying `default_encryption_scope`. Defaults to `true`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "encryption_scope_override_enabled")

    @_builtins.property
    @pulumi.getter(name="hasImmutabilityPolicy")
    def has_immutability_policy(self) -> pulumi.Output[_builtins.bool]:
        """
        Is there an Immutability Policy configured on this Storage Container?
        """
        return pulumi.get(self, "has_immutability_policy")

    @_builtins.property
    @pulumi.getter(name="hasLegalHold")
    def has_legal_hold(self) -> pulumi.Output[_builtins.bool]:
        """
        Is there a Legal Hold configured on this Storage Container?
        """
        return pulumi.get(self, "has_legal_hold")

    @_builtins.property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Mapping[str, _builtins.str]]:
        """
        A mapping of MetaData for this Container. All metadata keys should be lowercase.
        """
        return pulumi.get(self, "metadata")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Container which should be created within the Storage Account. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceManagerId")
    @_utilities.deprecated("""this property has been deprecated in favour of `id` and will be removed in version 5.0 of the Provider.""")
    def resource_manager_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Resource Manager ID of this Storage Container.
        """
        return pulumi.get(self, "resource_manager_id")

    @_builtins.property
    @pulumi.getter(name="storageAccountId")
    def storage_account_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created.

        > **Note:** One of `storage_account_name` or `storage_account_id` must be specified. When specifying `storage_account_id` the resource will use the Resource Manager API, rather than the Data Plane API.
        """
        return pulumi.get(self, "storage_account_id")

    @_builtins.property
    @pulumi.getter(name="storageAccountName")
    @_utilities.deprecated("""the `storage_account_name` property has been deprecated in favour of `storage_account_id` and will be removed in version 5.0 of the Provider.""")
    def storage_account_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The name of the Storage Account where the Container should be created. Changing this forces a new resource to be created. This property is deprecated in favour of `storage_account_id`.

        > **Note:** Migrating from the deprecated `storage_account_name` to `storage_account_id` is supported without recreation. Any other change to either property will result in the resource being recreated.
        """
        return pulumi.get(self, "storage_account_name")


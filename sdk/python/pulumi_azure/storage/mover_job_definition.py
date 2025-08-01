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

__all__ = ['MoverJobDefinitionArgs', 'MoverJobDefinition']

@pulumi.input_type
class MoverJobDefinitionArgs:
    def __init__(__self__, *,
                 copy_mode: pulumi.Input[_builtins.str],
                 source_name: pulumi.Input[_builtins.str],
                 storage_mover_project_id: pulumi.Input[_builtins.str],
                 target_name: pulumi.Input[_builtins.str],
                 agent_name: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_sub_path: Optional[pulumi.Input[_builtins.str]] = None,
                 target_sub_path: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a MoverJobDefinition resource.
        :param pulumi.Input[_builtins.str] copy_mode: Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        :param pulumi.Input[_builtins.str] source_name: Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] storage_mover_project_id: Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_name: Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] agent_name: Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        :param pulumi.Input[_builtins.str] description: Specifies a description for this Storage Mover Job Definition.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_sub_path: Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_sub_path: Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "copy_mode", copy_mode)
        pulumi.set(__self__, "source_name", source_name)
        pulumi.set(__self__, "storage_mover_project_id", storage_mover_project_id)
        pulumi.set(__self__, "target_name", target_name)
        if agent_name is not None:
            pulumi.set(__self__, "agent_name", agent_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if source_sub_path is not None:
            pulumi.set(__self__, "source_sub_path", source_sub_path)
        if target_sub_path is not None:
            pulumi.set(__self__, "target_sub_path", target_sub_path)

    @_builtins.property
    @pulumi.getter(name="copyMode")
    def copy_mode(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        """
        return pulumi.get(self, "copy_mode")

    @copy_mode.setter
    def copy_mode(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "copy_mode", value)

    @_builtins.property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_name")

    @source_name.setter
    def source_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "source_name", value)

    @_builtins.property
    @pulumi.getter(name="storageMoverProjectId")
    def storage_mover_project_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_mover_project_id")

    @storage_mover_project_id.setter
    def storage_mover_project_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "storage_mover_project_id", value)

    @_builtins.property
    @pulumi.getter(name="targetName")
    def target_name(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "target_name")

    @target_name.setter
    def target_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "target_name", value)

    @_builtins.property
    @pulumi.getter(name="agentName")
    def agent_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        """
        return pulumi.get(self, "agent_name")

    @agent_name.setter
    def agent_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "agent_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a description for this Storage Mover Job Definition.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="sourceSubPath")
    def source_sub_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_sub_path")

    @source_sub_path.setter
    def source_sub_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_sub_path", value)

    @_builtins.property
    @pulumi.getter(name="targetSubPath")
    def target_sub_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "target_sub_path")

    @target_sub_path.setter
    def target_sub_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_sub_path", value)


@pulumi.input_type
class _MoverJobDefinitionState:
    def __init__(__self__, *,
                 agent_name: Optional[pulumi.Input[_builtins.str]] = None,
                 copy_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_sub_path: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_mover_project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 target_name: Optional[pulumi.Input[_builtins.str]] = None,
                 target_sub_path: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering MoverJobDefinition resources.
        :param pulumi.Input[_builtins.str] agent_name: Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        :param pulumi.Input[_builtins.str] copy_mode: Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        :param pulumi.Input[_builtins.str] description: Specifies a description for this Storage Mover Job Definition.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_name: Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_sub_path: Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] storage_mover_project_id: Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_name: Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_sub_path: Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        """
        if agent_name is not None:
            pulumi.set(__self__, "agent_name", agent_name)
        if copy_mode is not None:
            pulumi.set(__self__, "copy_mode", copy_mode)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if source_name is not None:
            pulumi.set(__self__, "source_name", source_name)
        if source_sub_path is not None:
            pulumi.set(__self__, "source_sub_path", source_sub_path)
        if storage_mover_project_id is not None:
            pulumi.set(__self__, "storage_mover_project_id", storage_mover_project_id)
        if target_name is not None:
            pulumi.set(__self__, "target_name", target_name)
        if target_sub_path is not None:
            pulumi.set(__self__, "target_sub_path", target_sub_path)

    @_builtins.property
    @pulumi.getter(name="agentName")
    def agent_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        """
        return pulumi.get(self, "agent_name")

    @agent_name.setter
    def agent_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "agent_name", value)

    @_builtins.property
    @pulumi.getter(name="copyMode")
    def copy_mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        """
        return pulumi.get(self, "copy_mode")

    @copy_mode.setter
    def copy_mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "copy_mode", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a description for this Storage Mover Job Definition.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_name")

    @source_name.setter
    def source_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_name", value)

    @_builtins.property
    @pulumi.getter(name="sourceSubPath")
    def source_sub_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_sub_path")

    @source_sub_path.setter
    def source_sub_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_sub_path", value)

    @_builtins.property
    @pulumi.getter(name="storageMoverProjectId")
    def storage_mover_project_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_mover_project_id")

    @storage_mover_project_id.setter
    def storage_mover_project_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_mover_project_id", value)

    @_builtins.property
    @pulumi.getter(name="targetName")
    def target_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "target_name")

    @target_name.setter
    def target_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_name", value)

    @_builtins.property
    @pulumi.getter(name="targetSubPath")
    def target_sub_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "target_sub_path")

    @target_sub_path.setter
    def target_sub_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_sub_path", value)


@pulumi.type_token("azure:storage/moverJobDefinition:MoverJobDefinition")
class MoverJobDefinition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 agent_name: Optional[pulumi.Input[_builtins.str]] = None,
                 copy_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_sub_path: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_mover_project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 target_name: Optional[pulumi.Input[_builtins.str]] = None,
                 target_sub_path: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Storage Mover Job Definition.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_mover = azure.storage.Mover("example",
            name="example-ssm",
            resource_group_name=example.name,
            location=example.location)
        example_mover_agent = azure.storage.MoverAgent("example",
            name="example-agent",
            storage_mover_id=example_mover.id,
            arc_virtual_machine_id=example.id.apply(lambda id: f"{id}/providers/Microsoft.HybridCompute/machines/examples-hybridComputeName"),
            arc_virtual_machine_uuid="3bb2c024-eba9-4d18-9e7a-1d772fcc5fe9")
        example_account = azure.storage.Account("example",
            name="examplesa",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS",
            allow_nested_items_to_be_public=True)
        example_container = azure.storage.Container("example",
            name="acccontainer",
            storage_account_name=example_account.name,
            container_access_type="blob")
        example_mover_target_endpoint = azure.storage.MoverTargetEndpoint("example",
            name="example-smte",
            storage_mover_id=example_mover.id,
            storage_account_id=example_account.id,
            storage_container_name=example_container.name)
        example_mover_source_endpoint = azure.storage.MoverSourceEndpoint("example",
            name="example-smse",
            storage_mover_id=example_mover.id,
            host="192.168.0.1")
        example_mover_project = azure.storage.MoverProject("example",
            name="example-sp",
            storage_mover_id=example_mover.id)
        example_mover_job_definition = azure.storage.MoverJobDefinition("example",
            name="example-sjd",
            storage_mover_project_id=example_mover_project.id,
            agent_name=example_mover_agent.name,
            copy_mode="Additive",
            source_name=example_mover_source_endpoint.name,
            source_sub_path="/",
            target_name=example_mover_target_endpoint.name,
            target_sub_path="/",
            description="Example Job Definition Description")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.StorageMover`: 2023-03-01

        ## Import

        Storage Mover Job Definition can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/moverJobDefinition:MoverJobDefinition example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StorageMover/storageMovers/storageMover1/projects/project1/jobDefinitions/jobDefinition1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] agent_name: Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        :param pulumi.Input[_builtins.str] copy_mode: Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        :param pulumi.Input[_builtins.str] description: Specifies a description for this Storage Mover Job Definition.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_name: Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_sub_path: Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] storage_mover_project_id: Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_name: Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_sub_path: Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MoverJobDefinitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Storage Mover Job Definition.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_mover = azure.storage.Mover("example",
            name="example-ssm",
            resource_group_name=example.name,
            location=example.location)
        example_mover_agent = azure.storage.MoverAgent("example",
            name="example-agent",
            storage_mover_id=example_mover.id,
            arc_virtual_machine_id=example.id.apply(lambda id: f"{id}/providers/Microsoft.HybridCompute/machines/examples-hybridComputeName"),
            arc_virtual_machine_uuid="3bb2c024-eba9-4d18-9e7a-1d772fcc5fe9")
        example_account = azure.storage.Account("example",
            name="examplesa",
            resource_group_name=example.name,
            location=example.location,
            account_tier="Standard",
            account_replication_type="LRS",
            allow_nested_items_to_be_public=True)
        example_container = azure.storage.Container("example",
            name="acccontainer",
            storage_account_name=example_account.name,
            container_access_type="blob")
        example_mover_target_endpoint = azure.storage.MoverTargetEndpoint("example",
            name="example-smte",
            storage_mover_id=example_mover.id,
            storage_account_id=example_account.id,
            storage_container_name=example_container.name)
        example_mover_source_endpoint = azure.storage.MoverSourceEndpoint("example",
            name="example-smse",
            storage_mover_id=example_mover.id,
            host="192.168.0.1")
        example_mover_project = azure.storage.MoverProject("example",
            name="example-sp",
            storage_mover_id=example_mover.id)
        example_mover_job_definition = azure.storage.MoverJobDefinition("example",
            name="example-sjd",
            storage_mover_project_id=example_mover_project.id,
            agent_name=example_mover_agent.name,
            copy_mode="Additive",
            source_name=example_mover_source_endpoint.name,
            source_sub_path="/",
            target_name=example_mover_target_endpoint.name,
            target_sub_path="/",
            description="Example Job Definition Description")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.StorageMover`: 2023-03-01

        ## Import

        Storage Mover Job Definition can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:storage/moverJobDefinition:MoverJobDefinition example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StorageMover/storageMovers/storageMover1/projects/project1/jobDefinitions/jobDefinition1
        ```

        :param str resource_name: The name of the resource.
        :param MoverJobDefinitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MoverJobDefinitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 agent_name: Optional[pulumi.Input[_builtins.str]] = None,
                 copy_mode: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_sub_path: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_mover_project_id: Optional[pulumi.Input[_builtins.str]] = None,
                 target_name: Optional[pulumi.Input[_builtins.str]] = None,
                 target_sub_path: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MoverJobDefinitionArgs.__new__(MoverJobDefinitionArgs)

            __props__.__dict__["agent_name"] = agent_name
            if copy_mode is None and not opts.urn:
                raise TypeError("Missing required property 'copy_mode'")
            __props__.__dict__["copy_mode"] = copy_mode
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if source_name is None and not opts.urn:
                raise TypeError("Missing required property 'source_name'")
            __props__.__dict__["source_name"] = source_name
            __props__.__dict__["source_sub_path"] = source_sub_path
            if storage_mover_project_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_mover_project_id'")
            __props__.__dict__["storage_mover_project_id"] = storage_mover_project_id
            if target_name is None and not opts.urn:
                raise TypeError("Missing required property 'target_name'")
            __props__.__dict__["target_name"] = target_name
            __props__.__dict__["target_sub_path"] = target_sub_path
        super(MoverJobDefinition, __self__).__init__(
            'azure:storage/moverJobDefinition:MoverJobDefinition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            agent_name: Optional[pulumi.Input[_builtins.str]] = None,
            copy_mode: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            source_name: Optional[pulumi.Input[_builtins.str]] = None,
            source_sub_path: Optional[pulumi.Input[_builtins.str]] = None,
            storage_mover_project_id: Optional[pulumi.Input[_builtins.str]] = None,
            target_name: Optional[pulumi.Input[_builtins.str]] = None,
            target_sub_path: Optional[pulumi.Input[_builtins.str]] = None) -> 'MoverJobDefinition':
        """
        Get an existing MoverJobDefinition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] agent_name: Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        :param pulumi.Input[_builtins.str] copy_mode: Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        :param pulumi.Input[_builtins.str] description: Specifies a description for this Storage Mover Job Definition.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_name: Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] source_sub_path: Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] storage_mover_project_id: Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_name: Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        :param pulumi.Input[_builtins.str] target_sub_path: Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MoverJobDefinitionState.__new__(_MoverJobDefinitionState)

        __props__.__dict__["agent_name"] = agent_name
        __props__.__dict__["copy_mode"] = copy_mode
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["source_name"] = source_name
        __props__.__dict__["source_sub_path"] = source_sub_path
        __props__.__dict__["storage_mover_project_id"] = storage_mover_project_id
        __props__.__dict__["target_name"] = target_name
        __props__.__dict__["target_sub_path"] = target_sub_path
        return MoverJobDefinition(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="agentName")
    def agent_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
        """
        return pulumi.get(self, "agent_name")

    @_builtins.property
    @pulumi.getter(name="copyMode")
    def copy_mode(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
        """
        return pulumi.get(self, "copy_mode")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies a description for this Storage Mover Job Definition.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_name")

    @_builtins.property
    @pulumi.getter(name="sourceSubPath")
    def source_sub_path(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "source_sub_path")

    @_builtins.property
    @pulumi.getter(name="storageMoverProjectId")
    def storage_mover_project_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "storage_mover_project_id")

    @_builtins.property
    @pulumi.getter(name="targetName")
    def target_name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "target_name")

    @_builtins.property
    @pulumi.getter(name="targetSubPath")
    def target_sub_path(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "target_sub_path")


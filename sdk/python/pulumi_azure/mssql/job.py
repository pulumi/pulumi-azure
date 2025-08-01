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

__all__ = ['JobArgs', 'Job']

@pulumi.input_type
class JobArgs:
    def __init__(__self__, *,
                 job_agent_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Job resource.
        :param pulumi.Input[_builtins.str] job_agent_id: The ID of the Elastic Job Agent. Changing this forces a new Elastic Job to be created.
        :param pulumi.Input[_builtins.str] description: The description of the Elastic Job.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Elastic Job. Changing this forces a new Elastic Job to be created.
        """
        pulumi.set(__self__, "job_agent_id", job_agent_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="jobAgentId")
    def job_agent_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Elastic Job Agent. Changing this forces a new Elastic Job to be created.
        """
        return pulumi.get(self, "job_agent_id")

    @job_agent_id.setter
    def job_agent_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "job_agent_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the Elastic Job.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Elastic Job. Changing this forces a new Elastic Job to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _JobState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 job_agent_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Job resources.
        :param pulumi.Input[_builtins.str] description: The description of the Elastic Job.
        :param pulumi.Input[_builtins.str] job_agent_id: The ID of the Elastic Job Agent. Changing this forces a new Elastic Job to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Elastic Job. Changing this forces a new Elastic Job to be created.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if job_agent_id is not None:
            pulumi.set(__self__, "job_agent_id", job_agent_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the Elastic Job.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="jobAgentId")
    def job_agent_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Elastic Job Agent. Changing this forces a new Elastic Job to be created.
        """
        return pulumi.get(self, "job_agent_id")

    @job_agent_id.setter
    def job_agent_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "job_agent_id", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name which should be used for this Elastic Job. Changing this forces a new Elastic Job to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.type_token("azure:mssql/job:Job")
class Job(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 job_agent_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an Elastic Job.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resource-group",
            location="East US")
        example_server = azure.mssql.Server("example",
            name="example-server",
            resource_group_name=example.name,
            location=example.location,
            version="12.0",
            administrator_login="4dm1n157r470r",
            administrator_login_password="4-v3ry-53cr37-p455w0rd")
        example_database = azure.mssql.Database("example",
            name="example-db",
            server_id=example_server.id,
            collation="SQL_Latin1_General_CP1_CI_AS",
            sku_name="S1")
        example_job_agent = azure.mssql.JobAgent("example",
            name="example-job-agent",
            location=example.location,
            database_id=example_database.id)
        example_job_credential = azure.mssql.JobCredential("example",
            name="example-job-credential",
            job_agent_id=example_job_agent.id,
            username="my-username",
            password="MyP4ssw0rd!!!")
        example_job = azure.mssql.Job("example",
            name="example-job",
            job_agent_id=example_job_agent.id,
            description="example description")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Sql`: 2023-08-01-preview

        ## Import

        Elastic Jobs can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mssql/job:Job example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Sql/servers/myserver1/jobAgents/myjobagent1/jobs/myjob1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the Elastic Job.
        :param pulumi.Input[_builtins.str] job_agent_id: The ID of the Elastic Job Agent. Changing this forces a new Elastic Job to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Elastic Job. Changing this forces a new Elastic Job to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: JobArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Elastic Job.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resource-group",
            location="East US")
        example_server = azure.mssql.Server("example",
            name="example-server",
            resource_group_name=example.name,
            location=example.location,
            version="12.0",
            administrator_login="4dm1n157r470r",
            administrator_login_password="4-v3ry-53cr37-p455w0rd")
        example_database = azure.mssql.Database("example",
            name="example-db",
            server_id=example_server.id,
            collation="SQL_Latin1_General_CP1_CI_AS",
            sku_name="S1")
        example_job_agent = azure.mssql.JobAgent("example",
            name="example-job-agent",
            location=example.location,
            database_id=example_database.id)
        example_job_credential = azure.mssql.JobCredential("example",
            name="example-job-credential",
            job_agent_id=example_job_agent.id,
            username="my-username",
            password="MyP4ssw0rd!!!")
        example_job = azure.mssql.Job("example",
            name="example-job",
            job_agent_id=example_job_agent.id,
            description="example description")
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.Sql`: 2023-08-01-preview

        ## Import

        Elastic Jobs can be imported using the `resource id`, e.g.

        ```sh
        $ pulumi import azure:mssql/job:Job example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Sql/servers/myserver1/jobAgents/myjobagent1/jobs/myjob1
        ```

        :param str resource_name: The name of the resource.
        :param JobArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(JobArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 job_agent_id: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = JobArgs.__new__(JobArgs)

            __props__.__dict__["description"] = description
            if job_agent_id is None and not opts.urn:
                raise TypeError("Missing required property 'job_agent_id'")
            __props__.__dict__["job_agent_id"] = job_agent_id
            __props__.__dict__["name"] = name
        super(Job, __self__).__init__(
            'azure:mssql/job:Job',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            job_agent_id: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None) -> 'Job':
        """
        Get an existing Job resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: The description of the Elastic Job.
        :param pulumi.Input[_builtins.str] job_agent_id: The ID of the Elastic Job Agent. Changing this forces a new Elastic Job to be created.
        :param pulumi.Input[_builtins.str] name: The name which should be used for this Elastic Job. Changing this forces a new Elastic Job to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _JobState.__new__(_JobState)

        __props__.__dict__["description"] = description
        __props__.__dict__["job_agent_id"] = job_agent_id
        __props__.__dict__["name"] = name
        return Job(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the Elastic Job.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="jobAgentId")
    def job_agent_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Elastic Job Agent. Changing this forces a new Elastic Job to be created.
        """
        return pulumi.get(self, "job_agent_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name which should be used for this Elastic Job. Changing this forces a new Elastic Job to be created.
        """
        return pulumi.get(self, "name")


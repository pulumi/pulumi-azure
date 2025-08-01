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

__all__ = [
    'GetVirtualMachineConfigurationAssignmentResult',
    'AwaitableGetVirtualMachineConfigurationAssignmentResult',
    'get_virtual_machine_configuration_assignment',
    'get_virtual_machine_configuration_assignment_output',
]

@pulumi.output_type
class GetVirtualMachineConfigurationAssignmentResult:
    """
    A collection of values returned by getVirtualMachineConfigurationAssignment.
    """
    def __init__(__self__, assignment_hash=None, compliance_status=None, content_hash=None, content_uri=None, id=None, last_compliance_status_checked=None, latest_report_id=None, name=None, resource_group_name=None, virtual_machine_name=None):
        if assignment_hash and not isinstance(assignment_hash, str):
            raise TypeError("Expected argument 'assignment_hash' to be a str")
        pulumi.set(__self__, "assignment_hash", assignment_hash)
        if compliance_status and not isinstance(compliance_status, str):
            raise TypeError("Expected argument 'compliance_status' to be a str")
        pulumi.set(__self__, "compliance_status", compliance_status)
        if content_hash and not isinstance(content_hash, str):
            raise TypeError("Expected argument 'content_hash' to be a str")
        pulumi.set(__self__, "content_hash", content_hash)
        if content_uri and not isinstance(content_uri, str):
            raise TypeError("Expected argument 'content_uri' to be a str")
        pulumi.set(__self__, "content_uri", content_uri)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if last_compliance_status_checked and not isinstance(last_compliance_status_checked, str):
            raise TypeError("Expected argument 'last_compliance_status_checked' to be a str")
        pulumi.set(__self__, "last_compliance_status_checked", last_compliance_status_checked)
        if latest_report_id and not isinstance(latest_report_id, str):
            raise TypeError("Expected argument 'latest_report_id' to be a str")
        pulumi.set(__self__, "latest_report_id", latest_report_id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if virtual_machine_name and not isinstance(virtual_machine_name, str):
            raise TypeError("Expected argument 'virtual_machine_name' to be a str")
        pulumi.set(__self__, "virtual_machine_name", virtual_machine_name)

    @_builtins.property
    @pulumi.getter(name="assignmentHash")
    def assignment_hash(self) -> _builtins.str:
        """
        Combined hash of the configuration package and parameters.
        """
        return pulumi.get(self, "assignment_hash")

    @_builtins.property
    @pulumi.getter(name="complianceStatus")
    def compliance_status(self) -> _builtins.str:
        """
        A value indicating compliance status of the machine for the assigned guest configuration. Possible return values are `Compliant`, `NonCompliant` and `Pending`.
        """
        return pulumi.get(self, "compliance_status")

    @_builtins.property
    @pulumi.getter(name="contentHash")
    def content_hash(self) -> _builtins.str:
        """
        The content hash for the Guest Configuration package.
        """
        return pulumi.get(self, "content_hash")

    @_builtins.property
    @pulumi.getter(name="contentUri")
    def content_uri(self) -> _builtins.str:
        """
        The content URI where the Guest Configuration package is stored.
        """
        return pulumi.get(self, "content_uri")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="lastComplianceStatusChecked")
    def last_compliance_status_checked(self) -> _builtins.str:
        """
        Date and time, in RFC3339 format, when the machines compliance status was last checked.
        """
        return pulumi.get(self, "last_compliance_status_checked")

    @_builtins.property
    @pulumi.getter(name="latestReportId")
    def latest_report_id(self) -> _builtins.str:
        """
        The ID of the latest report for the guest configuration assignment.
        """
        return pulumi.get(self, "latest_report_id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> _builtins.str:
        return pulumi.get(self, "resource_group_name")

    @_builtins.property
    @pulumi.getter(name="virtualMachineName")
    def virtual_machine_name(self) -> _builtins.str:
        return pulumi.get(self, "virtual_machine_name")


class AwaitableGetVirtualMachineConfigurationAssignmentResult(GetVirtualMachineConfigurationAssignmentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVirtualMachineConfigurationAssignmentResult(
            assignment_hash=self.assignment_hash,
            compliance_status=self.compliance_status,
            content_hash=self.content_hash,
            content_uri=self.content_uri,
            id=self.id,
            last_compliance_status_checked=self.last_compliance_status_checked,
            latest_report_id=self.latest_report_id,
            name=self.name,
            resource_group_name=self.resource_group_name,
            virtual_machine_name=self.virtual_machine_name)


def get_virtual_machine_configuration_assignment(name: Optional[_builtins.str] = None,
                                                 resource_group_name: Optional[_builtins.str] = None,
                                                 virtual_machine_name: Optional[_builtins.str] = None,
                                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVirtualMachineConfigurationAssignmentResult:
    """
    Use this data source to access information about an existing Guest Configuration Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.policy.get_virtual_machine_configuration_assignment(name="AzureWindowsBaseline",
        resource_group_name="example-RG",
        virtual_machine_name="example-vm")
    pulumi.export("complianceStatus", example.compliance_status)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Compute`: 2020-06-25


    :param _builtins.str name: Specifies the name of the Guest Configuration Assignment.
    :param _builtins.str resource_group_name: Specifies the Name of the Resource Group where the Guest Configuration Assignment exists.
    :param _builtins.str virtual_machine_name: Only retrieve Policy Set Definitions from this Management Group.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['virtualMachineName'] = virtual_machine_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:policy/getVirtualMachineConfigurationAssignment:getVirtualMachineConfigurationAssignment', __args__, opts=opts, typ=GetVirtualMachineConfigurationAssignmentResult).value

    return AwaitableGetVirtualMachineConfigurationAssignmentResult(
        assignment_hash=pulumi.get(__ret__, 'assignment_hash'),
        compliance_status=pulumi.get(__ret__, 'compliance_status'),
        content_hash=pulumi.get(__ret__, 'content_hash'),
        content_uri=pulumi.get(__ret__, 'content_uri'),
        id=pulumi.get(__ret__, 'id'),
        last_compliance_status_checked=pulumi.get(__ret__, 'last_compliance_status_checked'),
        latest_report_id=pulumi.get(__ret__, 'latest_report_id'),
        name=pulumi.get(__ret__, 'name'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        virtual_machine_name=pulumi.get(__ret__, 'virtual_machine_name'))
def get_virtual_machine_configuration_assignment_output(name: Optional[pulumi.Input[_builtins.str]] = None,
                                                        resource_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                                                        virtual_machine_name: Optional[pulumi.Input[_builtins.str]] = None,
                                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetVirtualMachineConfigurationAssignmentResult]:
    """
    Use this data source to access information about an existing Guest Configuration Policy.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.policy.get_virtual_machine_configuration_assignment(name="AzureWindowsBaseline",
        resource_group_name="example-RG",
        virtual_machine_name="example-vm")
    pulumi.export("complianceStatus", example.compliance_status)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.Compute`: 2020-06-25


    :param _builtins.str name: Specifies the name of the Guest Configuration Assignment.
    :param _builtins.str resource_group_name: Specifies the Name of the Resource Group where the Guest Configuration Assignment exists.
    :param _builtins.str virtual_machine_name: Only retrieve Policy Set Definitions from this Management Group.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    __args__['virtualMachineName'] = virtual_machine_name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:policy/getVirtualMachineConfigurationAssignment:getVirtualMachineConfigurationAssignment', __args__, opts=opts, typ=GetVirtualMachineConfigurationAssignmentResult)
    return __ret__.apply(lambda __response__: GetVirtualMachineConfigurationAssignmentResult(
        assignment_hash=pulumi.get(__response__, 'assignment_hash'),
        compliance_status=pulumi.get(__response__, 'compliance_status'),
        content_hash=pulumi.get(__response__, 'content_hash'),
        content_uri=pulumi.get(__response__, 'content_uri'),
        id=pulumi.get(__response__, 'id'),
        last_compliance_status_checked=pulumi.get(__response__, 'last_compliance_status_checked'),
        latest_report_id=pulumi.get(__response__, 'latest_report_id'),
        name=pulumi.get(__response__, 'name'),
        resource_group_name=pulumi.get(__response__, 'resource_group_name'),
        virtual_machine_name=pulumi.get(__response__, 'virtual_machine_name')))

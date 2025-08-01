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
    'GetAdbsNationalCharacterSetsResult',
    'AwaitableGetAdbsNationalCharacterSetsResult',
    'get_adbs_national_character_sets',
    'get_adbs_national_character_sets_output',
]

@pulumi.output_type
class GetAdbsNationalCharacterSetsResult:
    """
    A collection of values returned by getAdbsNationalCharacterSets.
    """
    def __init__(__self__, character_sets=None, id=None, location=None):
        if character_sets and not isinstance(character_sets, list):
            raise TypeError("Expected argument 'character_sets' to be a list")
        pulumi.set(__self__, "character_sets", character_sets)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if location and not isinstance(location, str):
            raise TypeError("Expected argument 'location' to be a str")
        pulumi.set(__self__, "location", location)

    @_builtins.property
    @pulumi.getter(name="characterSets")
    def character_sets(self) -> Sequence['outputs.GetAdbsNationalCharacterSetsCharacterSetResult']:
        """
        A `character_sets` block as defined below.
        """
        return pulumi.get(self, "character_sets")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def location(self) -> _builtins.str:
        return pulumi.get(self, "location")


class AwaitableGetAdbsNationalCharacterSetsResult(GetAdbsNationalCharacterSetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAdbsNationalCharacterSetsResult(
            character_sets=self.character_sets,
            id=self.id,
            location=self.location)


def get_adbs_national_character_sets(location: Optional[_builtins.str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAdbsNationalCharacterSetsResult:
    """
    Gets a list of supported national character sets.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.oracle.get_adbs_character_sets(location="West Europe")
    pulumi.export("example", example_azurerm_oracle_adbs_national_character_sets)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Oracle.Database`: 2024-06-01


    :param _builtins.str location: The Azure Region to query for the national character sets in.
    """
    __args__ = dict()
    __args__['location'] = location
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:oracle/getAdbsNationalCharacterSets:getAdbsNationalCharacterSets', __args__, opts=opts, typ=GetAdbsNationalCharacterSetsResult).value

    return AwaitableGetAdbsNationalCharacterSetsResult(
        character_sets=pulumi.get(__ret__, 'character_sets'),
        id=pulumi.get(__ret__, 'id'),
        location=pulumi.get(__ret__, 'location'))
def get_adbs_national_character_sets_output(location: Optional[pulumi.Input[_builtins.str]] = None,
                                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAdbsNationalCharacterSetsResult]:
    """
    Gets a list of supported national character sets.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.oracle.get_adbs_character_sets(location="West Europe")
    pulumi.export("example", example_azurerm_oracle_adbs_national_character_sets)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Oracle.Database`: 2024-06-01


    :param _builtins.str location: The Azure Region to query for the national character sets in.
    """
    __args__ = dict()
    __args__['location'] = location
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:oracle/getAdbsNationalCharacterSets:getAdbsNationalCharacterSets', __args__, opts=opts, typ=GetAdbsNationalCharacterSetsResult)
    return __ret__.apply(lambda __response__: GetAdbsNationalCharacterSetsResult(
        character_sets=pulumi.get(__response__, 'character_sets'),
        id=pulumi.get(__response__, 'id'),
        location=pulumi.get(__response__, 'location')))

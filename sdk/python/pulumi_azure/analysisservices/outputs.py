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
    'ServerIpv4FirewallRule',
]

@pulumi.output_type
class ServerIpv4FirewallRule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "rangeEnd":
            suggest = "range_end"
        elif key == "rangeStart":
            suggest = "range_start"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ServerIpv4FirewallRule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ServerIpv4FirewallRule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ServerIpv4FirewallRule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: _builtins.str,
                 range_end: _builtins.str,
                 range_start: _builtins.str):
        """
        :param _builtins.str name: Specifies the name of the firewall rule.
        :param _builtins.str range_end: End of the firewall rule range as IPv4 address.
        :param _builtins.str range_start: Start of the firewall rule range as IPv4 address.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "range_end", range_end)
        pulumi.set(__self__, "range_start", range_start)

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Specifies the name of the firewall rule.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="rangeEnd")
    def range_end(self) -> _builtins.str:
        """
        End of the firewall rule range as IPv4 address.
        """
        return pulumi.get(self, "range_end")

    @_builtins.property
    @pulumi.getter(name="rangeStart")
    def range_start(self) -> _builtins.str:
        """
        Start of the firewall rule range as IPv4 address.
        """
        return pulumi.get(self, "range_start")



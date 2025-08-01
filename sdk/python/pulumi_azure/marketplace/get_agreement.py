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
    'GetAgreementResult',
    'AwaitableGetAgreementResult',
    'get_agreement',
    'get_agreement_output',
]

@pulumi.output_type
class GetAgreementResult:
    """
    A collection of values returned by getAgreement.
    """
    def __init__(__self__, id=None, license_text_link=None, offer=None, plan=None, privacy_policy_link=None, publisher=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if license_text_link and not isinstance(license_text_link, str):
            raise TypeError("Expected argument 'license_text_link' to be a str")
        pulumi.set(__self__, "license_text_link", license_text_link)
        if offer and not isinstance(offer, str):
            raise TypeError("Expected argument 'offer' to be a str")
        pulumi.set(__self__, "offer", offer)
        if plan and not isinstance(plan, str):
            raise TypeError("Expected argument 'plan' to be a str")
        pulumi.set(__self__, "plan", plan)
        if privacy_policy_link and not isinstance(privacy_policy_link, str):
            raise TypeError("Expected argument 'privacy_policy_link' to be a str")
        pulumi.set(__self__, "privacy_policy_link", privacy_policy_link)
        if publisher and not isinstance(publisher, str):
            raise TypeError("Expected argument 'publisher' to be a str")
        pulumi.set(__self__, "publisher", publisher)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="licenseTextLink")
    def license_text_link(self) -> _builtins.str:
        return pulumi.get(self, "license_text_link")

    @_builtins.property
    @pulumi.getter
    def offer(self) -> _builtins.str:
        return pulumi.get(self, "offer")

    @_builtins.property
    @pulumi.getter
    def plan(self) -> _builtins.str:
        return pulumi.get(self, "plan")

    @_builtins.property
    @pulumi.getter(name="privacyPolicyLink")
    def privacy_policy_link(self) -> _builtins.str:
        return pulumi.get(self, "privacy_policy_link")

    @_builtins.property
    @pulumi.getter
    def publisher(self) -> _builtins.str:
        return pulumi.get(self, "publisher")


class AwaitableGetAgreementResult(GetAgreementResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAgreementResult(
            id=self.id,
            license_text_link=self.license_text_link,
            offer=self.offer,
            plan=self.plan,
            privacy_policy_link=self.privacy_policy_link,
            publisher=self.publisher)


def get_agreement(offer: Optional[_builtins.str] = None,
                  plan: Optional[_builtins.str] = None,
                  publisher: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAgreementResult:
    """
    Uses this data source to access information about an existing Marketplace Agreement.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    barracuda = azure.marketplace.get_agreement(publisher="barracudanetworks",
        offer="waf",
        plan="hourly")
    pulumi.export("azurermMarketplaceAgreementId", id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.MarketplaceOrdering`: 2015-06-01


    :param _builtins.str offer: The Offer of the Marketplace Image.
    :param _builtins.str plan: The Plan of the Marketplace Image.
    :param _builtins.str publisher: The Publisher of the Marketplace Image.
    """
    __args__ = dict()
    __args__['offer'] = offer
    __args__['plan'] = plan
    __args__['publisher'] = publisher
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:marketplace/getAgreement:getAgreement', __args__, opts=opts, typ=GetAgreementResult).value

    return AwaitableGetAgreementResult(
        id=pulumi.get(__ret__, 'id'),
        license_text_link=pulumi.get(__ret__, 'license_text_link'),
        offer=pulumi.get(__ret__, 'offer'),
        plan=pulumi.get(__ret__, 'plan'),
        privacy_policy_link=pulumi.get(__ret__, 'privacy_policy_link'),
        publisher=pulumi.get(__ret__, 'publisher'))
def get_agreement_output(offer: Optional[pulumi.Input[_builtins.str]] = None,
                         plan: Optional[pulumi.Input[_builtins.str]] = None,
                         publisher: Optional[pulumi.Input[_builtins.str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAgreementResult]:
    """
    Uses this data source to access information about an existing Marketplace Agreement.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    barracuda = azure.marketplace.get_agreement(publisher="barracudanetworks",
        offer="waf",
        plan="hourly")
    pulumi.export("azurermMarketplaceAgreementId", id)
    ```

    ## API Providers

    <!-- This section is generated, changes will be overwritten -->
    This data source uses the following Azure API Providers:

    * `Microsoft.MarketplaceOrdering`: 2015-06-01


    :param _builtins.str offer: The Offer of the Marketplace Image.
    :param _builtins.str plan: The Plan of the Marketplace Image.
    :param _builtins.str publisher: The Publisher of the Marketplace Image.
    """
    __args__ = dict()
    __args__['offer'] = offer
    __args__['plan'] = plan
    __args__['publisher'] = publisher
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('azure:marketplace/getAgreement:getAgreement', __args__, opts=opts, typ=GetAgreementResult)
    return __ret__.apply(lambda __response__: GetAgreementResult(
        id=pulumi.get(__response__, 'id'),
        license_text_link=pulumi.get(__response__, 'license_text_link'),
        offer=pulumi.get(__response__, 'offer'),
        plan=pulumi.get(__response__, 'plan'),
        privacy_policy_link=pulumi.get(__response__, 'privacy_policy_link'),
        publisher=pulumi.get(__response__, 'publisher')))

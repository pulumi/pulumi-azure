# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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
    'GetRecommendationsRecommendationResult',
]

@pulumi.output_type
class GetRecommendationsRecommendationResult(dict):
    def __init__(__self__, *,
                 category: builtins.str,
                 description: builtins.str,
                 impact: builtins.str,
                 recommendation_name: builtins.str,
                 recommendation_type_id: builtins.str,
                 resource_name: builtins.str,
                 resource_type: builtins.str,
                 suppression_names: Sequence[builtins.str],
                 updated_time: builtins.str):
        """
        :param builtins.str category: The category of the recommendation.
        :param builtins.str description: The description of the issue or the opportunity identified by the recommendation.
        :param builtins.str impact: The business impact of the recommendation.
        :param builtins.str recommendation_name: The name of the Advisor Recommendation.
        :param builtins.str recommendation_type_id: The recommendation type id of the Advisor Recommendation.
        :param builtins.str resource_name: The name of the identified resource of the Advisor Recommendation.
        :param builtins.str resource_type: The type of the identified resource of the Advisor Recommendation.
        :param Sequence[builtins.str] suppression_names: A list of Advisor Suppression names of the Advisor Recommendation.
        :param builtins.str updated_time: The most recent time that Advisor checked the validity of the recommendation..
        """
        pulumi.set(__self__, "category", category)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "impact", impact)
        pulumi.set(__self__, "recommendation_name", recommendation_name)
        pulumi.set(__self__, "recommendation_type_id", recommendation_type_id)
        pulumi.set(__self__, "resource_name", resource_name)
        pulumi.set(__self__, "resource_type", resource_type)
        pulumi.set(__self__, "suppression_names", suppression_names)
        pulumi.set(__self__, "updated_time", updated_time)

    @property
    @pulumi.getter
    def category(self) -> builtins.str:
        """
        The category of the recommendation.
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        The description of the issue or the opportunity identified by the recommendation.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def impact(self) -> builtins.str:
        """
        The business impact of the recommendation.
        """
        return pulumi.get(self, "impact")

    @property
    @pulumi.getter(name="recommendationName")
    def recommendation_name(self) -> builtins.str:
        """
        The name of the Advisor Recommendation.
        """
        return pulumi.get(self, "recommendation_name")

    @property
    @pulumi.getter(name="recommendationTypeId")
    def recommendation_type_id(self) -> builtins.str:
        """
        The recommendation type id of the Advisor Recommendation.
        """
        return pulumi.get(self, "recommendation_type_id")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> builtins.str:
        """
        The name of the identified resource of the Advisor Recommendation.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> builtins.str:
        """
        The type of the identified resource of the Advisor Recommendation.
        """
        return pulumi.get(self, "resource_type")

    @property
    @pulumi.getter(name="suppressionNames")
    def suppression_names(self) -> Sequence[builtins.str]:
        """
        A list of Advisor Suppression names of the Advisor Recommendation.
        """
        return pulumi.get(self, "suppression_names")

    @property
    @pulumi.getter(name="updatedTime")
    def updated_time(self) -> builtins.str:
        """
        The most recent time that Advisor checked the validity of the recommendation..
        """
        return pulumi.get(self, "updated_time")



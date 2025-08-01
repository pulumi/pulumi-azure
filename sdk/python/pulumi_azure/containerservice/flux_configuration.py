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

__all__ = ['FluxConfigurationArgs', 'FluxConfiguration']

@pulumi.input_type
class FluxConfigurationArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[_builtins.str],
                 kustomizations: pulumi.Input[Sequence[pulumi.Input['FluxConfigurationKustomizationArgs']]],
                 namespace: pulumi.Input[_builtins.str],
                 blob_storage: Optional[pulumi.Input['FluxConfigurationBlobStorageArgs']] = None,
                 bucket: Optional[pulumi.Input['FluxConfigurationBucketArgs']] = None,
                 continuous_reconciliation_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 git_repository: Optional[pulumi.Input['FluxConfigurationGitRepositoryArgs']] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 scope: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a FluxConfiguration resource.
        :param pulumi.Input[_builtins.str] cluster_id: Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        :param pulumi.Input[Sequence[pulumi.Input['FluxConfigurationKustomizationArgs']]] kustomizations: A `kustomizations` block as defined below.
        :param pulumi.Input[_builtins.str] namespace: Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        :param pulumi.Input['FluxConfigurationBlobStorageArgs'] blob_storage: An `blob_storage` block as defined below.
        :param pulumi.Input['FluxConfigurationBucketArgs'] bucket: A `bucket` block as defined below.
        :param pulumi.Input[_builtins.bool] continuous_reconciliation_enabled: Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        :param pulumi.Input['FluxConfigurationGitRepositoryArgs'] git_repository: A `git_repository` block as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        :param pulumi.Input[_builtins.str] scope: Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        pulumi.set(__self__, "cluster_id", cluster_id)
        pulumi.set(__self__, "kustomizations", kustomizations)
        pulumi.set(__self__, "namespace", namespace)
        if blob_storage is not None:
            pulumi.set(__self__, "blob_storage", blob_storage)
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if continuous_reconciliation_enabled is not None:
            pulumi.set(__self__, "continuous_reconciliation_enabled", continuous_reconciliation_enabled)
        if git_repository is not None:
            pulumi.set(__self__, "git_repository", git_repository)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "cluster_id", value)

    @_builtins.property
    @pulumi.getter
    def kustomizations(self) -> pulumi.Input[Sequence[pulumi.Input['FluxConfigurationKustomizationArgs']]]:
        """
        A `kustomizations` block as defined below.
        """
        return pulumi.get(self, "kustomizations")

    @kustomizations.setter
    def kustomizations(self, value: pulumi.Input[Sequence[pulumi.Input['FluxConfigurationKustomizationArgs']]]):
        pulumi.set(self, "kustomizations", value)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "namespace", value)

    @_builtins.property
    @pulumi.getter(name="blobStorage")
    def blob_storage(self) -> Optional[pulumi.Input['FluxConfigurationBlobStorageArgs']]:
        """
        An `blob_storage` block as defined below.
        """
        return pulumi.get(self, "blob_storage")

    @blob_storage.setter
    def blob_storage(self, value: Optional[pulumi.Input['FluxConfigurationBlobStorageArgs']]):
        pulumi.set(self, "blob_storage", value)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input['FluxConfigurationBucketArgs']]:
        """
        A `bucket` block as defined below.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input['FluxConfigurationBucketArgs']]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter(name="continuousReconciliationEnabled")
    def continuous_reconciliation_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        """
        return pulumi.get(self, "continuous_reconciliation_enabled")

    @continuous_reconciliation_enabled.setter
    def continuous_reconciliation_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "continuous_reconciliation_enabled", value)

    @_builtins.property
    @pulumi.getter(name="gitRepository")
    def git_repository(self) -> Optional[pulumi.Input['FluxConfigurationGitRepositoryArgs']]:
        """
        A `git_repository` block as defined below.
        """
        return pulumi.get(self, "git_repository")

    @git_repository.setter
    def git_repository(self, value: Optional[pulumi.Input['FluxConfigurationGitRepositoryArgs']]):
        pulumi.set(self, "git_repository", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scope", value)


@pulumi.input_type
class _FluxConfigurationState:
    def __init__(__self__, *,
                 blob_storage: Optional[pulumi.Input['FluxConfigurationBlobStorageArgs']] = None,
                 bucket: Optional[pulumi.Input['FluxConfigurationBucketArgs']] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 continuous_reconciliation_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 git_repository: Optional[pulumi.Input['FluxConfigurationGitRepositoryArgs']] = None,
                 kustomizations: Optional[pulumi.Input[Sequence[pulumi.Input['FluxConfigurationKustomizationArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 scope: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering FluxConfiguration resources.
        :param pulumi.Input['FluxConfigurationBlobStorageArgs'] blob_storage: An `blob_storage` block as defined below.
        :param pulumi.Input['FluxConfigurationBucketArgs'] bucket: A `bucket` block as defined below.
        :param pulumi.Input[_builtins.str] cluster_id: Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        :param pulumi.Input[_builtins.bool] continuous_reconciliation_enabled: Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        :param pulumi.Input['FluxConfigurationGitRepositoryArgs'] git_repository: A `git_repository` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input['FluxConfigurationKustomizationArgs']]] kustomizations: A `kustomizations` block as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        :param pulumi.Input[_builtins.str] namespace: Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        :param pulumi.Input[_builtins.str] scope: Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        if blob_storage is not None:
            pulumi.set(__self__, "blob_storage", blob_storage)
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if continuous_reconciliation_enabled is not None:
            pulumi.set(__self__, "continuous_reconciliation_enabled", continuous_reconciliation_enabled)
        if git_repository is not None:
            pulumi.set(__self__, "git_repository", git_repository)
        if kustomizations is not None:
            pulumi.set(__self__, "kustomizations", kustomizations)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)

    @_builtins.property
    @pulumi.getter(name="blobStorage")
    def blob_storage(self) -> Optional[pulumi.Input['FluxConfigurationBlobStorageArgs']]:
        """
        An `blob_storage` block as defined below.
        """
        return pulumi.get(self, "blob_storage")

    @blob_storage.setter
    def blob_storage(self, value: Optional[pulumi.Input['FluxConfigurationBlobStorageArgs']]):
        pulumi.set(self, "blob_storage", value)

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input['FluxConfigurationBucketArgs']]:
        """
        A `bucket` block as defined below.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input['FluxConfigurationBucketArgs']]):
        pulumi.set(self, "bucket", value)

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cluster_id", value)

    @_builtins.property
    @pulumi.getter(name="continuousReconciliationEnabled")
    def continuous_reconciliation_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        """
        return pulumi.get(self, "continuous_reconciliation_enabled")

    @continuous_reconciliation_enabled.setter
    def continuous_reconciliation_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "continuous_reconciliation_enabled", value)

    @_builtins.property
    @pulumi.getter(name="gitRepository")
    def git_repository(self) -> Optional[pulumi.Input['FluxConfigurationGitRepositoryArgs']]:
        """
        A `git_repository` block as defined below.
        """
        return pulumi.get(self, "git_repository")

    @git_repository.setter
    def git_repository(self, value: Optional[pulumi.Input['FluxConfigurationGitRepositoryArgs']]):
        pulumi.set(self, "git_repository", value)

    @_builtins.property
    @pulumi.getter
    def kustomizations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FluxConfigurationKustomizationArgs']]]]:
        """
        A `kustomizations` block as defined below.
        """
        return pulumi.get(self, "kustomizations")

    @kustomizations.setter
    def kustomizations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FluxConfigurationKustomizationArgs']]]]):
        pulumi.set(self, "kustomizations", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "namespace", value)

    @_builtins.property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scope", value)


@pulumi.type_token("azure:containerservice/fluxConfiguration:FluxConfiguration")
class FluxConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 blob_storage: Optional[pulumi.Input[Union['FluxConfigurationBlobStorageArgs', 'FluxConfigurationBlobStorageArgsDict']]] = None,
                 bucket: Optional[pulumi.Input[Union['FluxConfigurationBucketArgs', 'FluxConfigurationBucketArgsDict']]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 continuous_reconciliation_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 git_repository: Optional[pulumi.Input[Union['FluxConfigurationGitRepositoryArgs', 'FluxConfigurationGitRepositoryArgsDict']]] = None,
                 kustomizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FluxConfigurationKustomizationArgs', 'FluxConfigurationKustomizationArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 scope: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Kubernetes Flux Configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_kubernetes_cluster = azure.containerservice.KubernetesCluster("example",
            name="example-aks",
            location="West Europe",
            resource_group_name=example.name,
            dns_prefix="example-aks",
            default_node_pool={
                "name": "default",
                "node_count": 1,
                "vm_size": "Standard_DS2_v2",
            },
            identity={
                "type": "SystemAssigned",
            })
        example_kubernetes_cluster_extension = azure.containerservice.KubernetesClusterExtension("example",
            name="example-ext",
            cluster_id=test["id"],
            extension_type="microsoft.flux")
        example_flux_configuration = azure.containerservice.FluxConfiguration("example",
            name="example-fc",
            cluster_id=test["id"],
            namespace="flux",
            git_repository={
                "url": "https://github.com/Azure/arc-k8s-demo",
                "reference_type": "branch",
                "reference_value": "main",
            },
            kustomizations=[{
                "name": "kustomization-1",
                "post_build": {
                    "substitute": {
                        "example_var": "substitute_with_this",
                    },
                    "substitute_froms": [{
                        "kind": "ConfigMap",
                        "name": "example-configmap",
                    }],
                },
            }],
            opts = pulumi.ResourceOptions(depends_on=[example_kubernetes_cluster_extension]))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.KubernetesConfiguration`: 2023-05-01

        ## Import

        Kubernetes Flux Configuration can be imported using the `resource id` for different `cluster_resource_name`, e.g.

        ```sh
        $ pulumi import azure:containerservice/fluxConfiguration:FluxConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.ContainerService/managedClusters/cluster1/providers/Microsoft.KubernetesConfiguration/fluxConfigurations/fluxConfiguration1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['FluxConfigurationBlobStorageArgs', 'FluxConfigurationBlobStorageArgsDict']] blob_storage: An `blob_storage` block as defined below.
        :param pulumi.Input[Union['FluxConfigurationBucketArgs', 'FluxConfigurationBucketArgsDict']] bucket: A `bucket` block as defined below.
        :param pulumi.Input[_builtins.str] cluster_id: Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        :param pulumi.Input[_builtins.bool] continuous_reconciliation_enabled: Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        :param pulumi.Input[Union['FluxConfigurationGitRepositoryArgs', 'FluxConfigurationGitRepositoryArgsDict']] git_repository: A `git_repository` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input[Union['FluxConfigurationKustomizationArgs', 'FluxConfigurationKustomizationArgsDict']]]] kustomizations: A `kustomizations` block as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        :param pulumi.Input[_builtins.str] namespace: Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        :param pulumi.Input[_builtins.str] scope: Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FluxConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Kubernetes Flux Configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example = azure.core.ResourceGroup("example",
            name="example-resources",
            location="West Europe")
        example_kubernetes_cluster = azure.containerservice.KubernetesCluster("example",
            name="example-aks",
            location="West Europe",
            resource_group_name=example.name,
            dns_prefix="example-aks",
            default_node_pool={
                "name": "default",
                "node_count": 1,
                "vm_size": "Standard_DS2_v2",
            },
            identity={
                "type": "SystemAssigned",
            })
        example_kubernetes_cluster_extension = azure.containerservice.KubernetesClusterExtension("example",
            name="example-ext",
            cluster_id=test["id"],
            extension_type="microsoft.flux")
        example_flux_configuration = azure.containerservice.FluxConfiguration("example",
            name="example-fc",
            cluster_id=test["id"],
            namespace="flux",
            git_repository={
                "url": "https://github.com/Azure/arc-k8s-demo",
                "reference_type": "branch",
                "reference_value": "main",
            },
            kustomizations=[{
                "name": "kustomization-1",
                "post_build": {
                    "substitute": {
                        "example_var": "substitute_with_this",
                    },
                    "substitute_froms": [{
                        "kind": "ConfigMap",
                        "name": "example-configmap",
                    }],
                },
            }],
            opts = pulumi.ResourceOptions(depends_on=[example_kubernetes_cluster_extension]))
        ```

        ## API Providers

        <!-- This section is generated, changes will be overwritten -->
        This resource uses the following Azure API Providers:

        * `Microsoft.KubernetesConfiguration`: 2023-05-01

        ## Import

        Kubernetes Flux Configuration can be imported using the `resource id` for different `cluster_resource_name`, e.g.

        ```sh
        $ pulumi import azure:containerservice/fluxConfiguration:FluxConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.ContainerService/managedClusters/cluster1/providers/Microsoft.KubernetesConfiguration/fluxConfigurations/fluxConfiguration1
        ```

        :param str resource_name: The name of the resource.
        :param FluxConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FluxConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 blob_storage: Optional[pulumi.Input[Union['FluxConfigurationBlobStorageArgs', 'FluxConfigurationBlobStorageArgsDict']]] = None,
                 bucket: Optional[pulumi.Input[Union['FluxConfigurationBucketArgs', 'FluxConfigurationBucketArgsDict']]] = None,
                 cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
                 continuous_reconciliation_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 git_repository: Optional[pulumi.Input[Union['FluxConfigurationGitRepositoryArgs', 'FluxConfigurationGitRepositoryArgsDict']]] = None,
                 kustomizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FluxConfigurationKustomizationArgs', 'FluxConfigurationKustomizationArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 scope: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FluxConfigurationArgs.__new__(FluxConfigurationArgs)

            __props__.__dict__["blob_storage"] = blob_storage
            __props__.__dict__["bucket"] = bucket
            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["continuous_reconciliation_enabled"] = continuous_reconciliation_enabled
            __props__.__dict__["git_repository"] = git_repository
            if kustomizations is None and not opts.urn:
                raise TypeError("Missing required property 'kustomizations'")
            __props__.__dict__["kustomizations"] = kustomizations
            __props__.__dict__["name"] = name
            if namespace is None and not opts.urn:
                raise TypeError("Missing required property 'namespace'")
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["scope"] = scope
        super(FluxConfiguration, __self__).__init__(
            'azure:containerservice/fluxConfiguration:FluxConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            blob_storage: Optional[pulumi.Input[Union['FluxConfigurationBlobStorageArgs', 'FluxConfigurationBlobStorageArgsDict']]] = None,
            bucket: Optional[pulumi.Input[Union['FluxConfigurationBucketArgs', 'FluxConfigurationBucketArgsDict']]] = None,
            cluster_id: Optional[pulumi.Input[_builtins.str]] = None,
            continuous_reconciliation_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            git_repository: Optional[pulumi.Input[Union['FluxConfigurationGitRepositoryArgs', 'FluxConfigurationGitRepositoryArgsDict']]] = None,
            kustomizations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FluxConfigurationKustomizationArgs', 'FluxConfigurationKustomizationArgsDict']]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            namespace: Optional[pulumi.Input[_builtins.str]] = None,
            scope: Optional[pulumi.Input[_builtins.str]] = None) -> 'FluxConfiguration':
        """
        Get an existing FluxConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['FluxConfigurationBlobStorageArgs', 'FluxConfigurationBlobStorageArgsDict']] blob_storage: An `blob_storage` block as defined below.
        :param pulumi.Input[Union['FluxConfigurationBucketArgs', 'FluxConfigurationBucketArgsDict']] bucket: A `bucket` block as defined below.
        :param pulumi.Input[_builtins.str] cluster_id: Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        :param pulumi.Input[_builtins.bool] continuous_reconciliation_enabled: Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        :param pulumi.Input[Union['FluxConfigurationGitRepositoryArgs', 'FluxConfigurationGitRepositoryArgsDict']] git_repository: A `git_repository` block as defined below.
        :param pulumi.Input[Sequence[pulumi.Input[Union['FluxConfigurationKustomizationArgs', 'FluxConfigurationKustomizationArgsDict']]]] kustomizations: A `kustomizations` block as defined below.
        :param pulumi.Input[_builtins.str] name: Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        :param pulumi.Input[_builtins.str] namespace: Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        :param pulumi.Input[_builtins.str] scope: Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FluxConfigurationState.__new__(_FluxConfigurationState)

        __props__.__dict__["blob_storage"] = blob_storage
        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["continuous_reconciliation_enabled"] = continuous_reconciliation_enabled
        __props__.__dict__["git_repository"] = git_repository
        __props__.__dict__["kustomizations"] = kustomizations
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["scope"] = scope
        return FluxConfiguration(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="blobStorage")
    def blob_storage(self) -> pulumi.Output[Optional['outputs.FluxConfigurationBlobStorage']]:
        """
        An `blob_storage` block as defined below.
        """
        return pulumi.get(self, "blob_storage")

    @_builtins.property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[Optional['outputs.FluxConfigurationBucket']]:
        """
        A `bucket` block as defined below.
        """
        return pulumi.get(self, "bucket")

    @_builtins.property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the Cluster ID. Changing this forces a new Kubernetes Cluster Extension to be created.
        """
        return pulumi.get(self, "cluster_id")

    @_builtins.property
    @pulumi.getter(name="continuousReconciliationEnabled")
    def continuous_reconciliation_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether the configuration will keep its reconciliation of its kustomizations and sources with the repository. Defaults to `true`.
        """
        return pulumi.get(self, "continuous_reconciliation_enabled")

    @_builtins.property
    @pulumi.getter(name="gitRepository")
    def git_repository(self) -> pulumi.Output[Optional['outputs.FluxConfigurationGitRepository']]:
        """
        A `git_repository` block as defined below.
        """
        return pulumi.get(self, "git_repository")

    @_builtins.property
    @pulumi.getter
    def kustomizations(self) -> pulumi.Output[Sequence['outputs.FluxConfigurationKustomization']]:
        """
        A `kustomizations` block as defined below.
        """
        return pulumi.get(self, "kustomizations")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the name which should be used for this Kubernetes Flux Configuration. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the namespace to which this configuration is installed to. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        return pulumi.get(self, "namespace")

    @_builtins.property
    @pulumi.getter
    def scope(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the scope at which the operator will be installed. Possible values are `cluster` and `namespace`. Defaults to `namespace`. Changing this forces a new Kubernetes Flux Configuration to be created.
        """
        return pulumi.get(self, "scope")


// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute
{
    public static class GetVirtualMachine
    {
        /// <summary>
        /// Use this data source to access information about an existing Virtual Machine.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Compute.GetVirtualMachine.Invoke(new()
        ///     {
        ///         Name = "production",
        ///         ResourceGroupName = "networking",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["virtualMachineId"] = example.Apply(getVirtualMachineResult =&gt; getVirtualMachineResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Compute`: 2024-03-01
        /// </summary>
        public static Task<GetVirtualMachineResult> InvokeAsync(GetVirtualMachineArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVirtualMachineResult>("azure:compute/getVirtualMachine:getVirtualMachine", args ?? new GetVirtualMachineArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Virtual Machine.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Compute.GetVirtualMachine.Invoke(new()
        ///     {
        ///         Name = "production",
        ///         ResourceGroupName = "networking",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["virtualMachineId"] = example.Apply(getVirtualMachineResult =&gt; getVirtualMachineResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Compute`: 2024-03-01
        /// </summary>
        public static Output<GetVirtualMachineResult> Invoke(GetVirtualMachineInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVirtualMachineResult>("azure:compute/getVirtualMachine:getVirtualMachine", args ?? new GetVirtualMachineInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing Virtual Machine.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Compute.GetVirtualMachine.Invoke(new()
        ///     {
        ///         Name = "production",
        ///         ResourceGroupName = "networking",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["virtualMachineId"] = example.Apply(getVirtualMachineResult =&gt; getVirtualMachineResult.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// ## API Providers
        /// 
        /// &lt;!-- This section is generated, changes will be overwritten --&gt;
        /// This data source uses the following Azure API Providers:
        /// 
        /// * `Microsoft.Compute`: 2024-03-01
        /// </summary>
        public static Output<GetVirtualMachineResult> Invoke(GetVirtualMachineInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVirtualMachineResult>("azure:compute/getVirtualMachine:getVirtualMachine", args ?? new GetVirtualMachineInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVirtualMachineArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Virtual Machine.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the resource group the Virtual Machine is located in.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetVirtualMachineArgs()
        {
        }
        public static new GetVirtualMachineArgs Empty => new GetVirtualMachineArgs();
    }

    public sealed class GetVirtualMachineInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Virtual Machine.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the resource group the Virtual Machine is located in.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetVirtualMachineInvokeArgs()
        {
        }
        public static new GetVirtualMachineInvokeArgs Empty => new GetVirtualMachineInvokeArgs();
    }


    [OutputType]
    public sealed class GetVirtualMachineResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A `identity` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVirtualMachineIdentityResult> Identities;
        public readonly string Location;
        public readonly string Name;
        /// <summary>
        /// The power state of the virtual machine.
        /// </summary>
        public readonly string PowerState;
        /// <summary>
        /// The Primary Private IP Address assigned to this Virtual Machine.
        /// </summary>
        public readonly string PrivateIpAddress;
        /// <summary>
        /// A list of Private IP Addresses assigned to this Virtual Machine.
        /// </summary>
        public readonly ImmutableArray<string> PrivateIpAddresses;
        /// <summary>
        /// The Primary Public IP Address assigned to this Virtual Machine.
        /// </summary>
        public readonly string PublicIpAddress;
        /// <summary>
        /// A list of the Public IP Addresses assigned to this Virtual Machine.
        /// </summary>
        public readonly ImmutableArray<string> PublicIpAddresses;
        public readonly string ResourceGroupName;

        [OutputConstructor]
        private GetVirtualMachineResult(
            string id,

            ImmutableArray<Outputs.GetVirtualMachineIdentityResult> identities,

            string location,

            string name,

            string powerState,

            string privateIpAddress,

            ImmutableArray<string> privateIpAddresses,

            string publicIpAddress,

            ImmutableArray<string> publicIpAddresses,

            string resourceGroupName)
        {
            Id = id;
            Identities = identities;
            Location = location;
            Name = name;
            PowerState = powerState;
            PrivateIpAddress = privateIpAddress;
            PrivateIpAddresses = privateIpAddresses;
            PublicIpAddress = publicIpAddress;
            PublicIpAddresses = publicIpAddresses;
            ResourceGroupName = resourceGroupName;
        }
    }
}

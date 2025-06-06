// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement
{
    /// <summary>
    /// Manages an Api Management Policy Fragment.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleService = new Azure.ApiManagement.Service("example", new()
    ///     {
    ///         Name = "example-apim",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         PublisherName = "pub1",
    ///         PublisherEmail = "pub1@email.com",
    ///         SkuName = "Developer_1",
    ///     });
    /// 
    ///     var examplePolicyFragment = new Azure.ApiManagement.PolicyFragment("example", new()
    ///     {
    ///         ApiManagementId = exampleService.Id,
    ///         Name = "example-policy-fragment",
    ///         Format = "xml",
    ///         Value = Std.File.Invoke(new()
    ///         {
    ///             Input = "policy-fragment-1.xml",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.ApiManagement`: 2022-08-01
    /// 
    /// ## Import
    /// 
    /// Api Management Policy Fragments can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:apimanagement/policyFragment:PolicyFragment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/instance1/policyFragments/policyFragment1
    /// ```
    /// </summary>
    [AzureResourceType("azure:apimanagement/policyFragment:PolicyFragment")]
    public partial class PolicyFragment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The id of the API Management Service. Changing this forces a new Api Management Policy Fragment to be created.
        /// </summary>
        [Output("apiManagementId")]
        public Output<string> ApiManagementId { get; private set; } = null!;

        /// <summary>
        /// The description for the Policy Fragment.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The format of the Policy Fragment. Possible values are `xml` or `rawxml`. Default is `xml`.
        /// 
        /// &gt; **Note:** The `value` property will be updated to reflect the corresponding format when `format` is updated.
        /// </summary>
        [Output("format")]
        public Output<string?> Format { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Api Management Policy Fragment. Changing this forces a new Api Management Policy Fragment to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The value of the Policy Fragment.
        /// 
        /// &gt; **Note:** Be aware of the two format possibilities. If the `value` is not applied and continues to cause a diff the format could be wrong.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a PolicyFragment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PolicyFragment(string name, PolicyFragmentArgs args, CustomResourceOptions? options = null)
            : base("azure:apimanagement/policyFragment:PolicyFragment", name, args ?? new PolicyFragmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PolicyFragment(string name, Input<string> id, PolicyFragmentState? state = null, CustomResourceOptions? options = null)
            : base("azure:apimanagement/policyFragment:PolicyFragment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PolicyFragment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PolicyFragment Get(string name, Input<string> id, PolicyFragmentState? state = null, CustomResourceOptions? options = null)
        {
            return new PolicyFragment(name, id, state, options);
        }
    }

    public sealed class PolicyFragmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the API Management Service. Changing this forces a new Api Management Policy Fragment to be created.
        /// </summary>
        [Input("apiManagementId", required: true)]
        public Input<string> ApiManagementId { get; set; } = null!;

        /// <summary>
        /// The description for the Policy Fragment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The format of the Policy Fragment. Possible values are `xml` or `rawxml`. Default is `xml`.
        /// 
        /// &gt; **Note:** The `value` property will be updated to reflect the corresponding format when `format` is updated.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The name which should be used for this Api Management Policy Fragment. Changing this forces a new Api Management Policy Fragment to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The value of the Policy Fragment.
        /// 
        /// &gt; **Note:** Be aware of the two format possibilities. If the `value` is not applied and continues to cause a diff the format could be wrong.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public PolicyFragmentArgs()
        {
        }
        public static new PolicyFragmentArgs Empty => new PolicyFragmentArgs();
    }

    public sealed class PolicyFragmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the API Management Service. Changing this forces a new Api Management Policy Fragment to be created.
        /// </summary>
        [Input("apiManagementId")]
        public Input<string>? ApiManagementId { get; set; }

        /// <summary>
        /// The description for the Policy Fragment.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The format of the Policy Fragment. Possible values are `xml` or `rawxml`. Default is `xml`.
        /// 
        /// &gt; **Note:** The `value` property will be updated to reflect the corresponding format when `format` is updated.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The name which should be used for this Api Management Policy Fragment. Changing this forces a new Api Management Policy Fragment to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The value of the Policy Fragment.
        /// 
        /// &gt; **Note:** Be aware of the two format possibilities. If the `value` is not applied and continues to cause a diff the format could be wrong.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public PolicyFragmentState()
        {
        }
        public static new PolicyFragmentState Empty => new PolicyFragmentState();
    }
}

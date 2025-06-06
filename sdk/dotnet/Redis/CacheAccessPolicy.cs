// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Redis
{
    /// <summary>
    /// Manages a Redis Cache Access Policy
    /// 
    /// ## Import
    /// 
    /// Redis Cache Access Policy can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:redis/cacheAccessPolicy:CacheAccessPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redis/cache1/accessPolicies/policy1
    /// ```
    /// </summary>
    [AzureResourceType("azure:redis/cacheAccessPolicy:CacheAccessPolicy")]
    public partial class CacheAccessPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Redis Cache Access Policy. Changing this forces a new Redis Cache Access Policy to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Permissions that are going to be assigned to this Redis Cache Access Policy.
        /// </summary>
        [Output("permissions")]
        public Output<string> Permissions { get; private set; } = null!;

        /// <summary>
        /// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy to be created.
        /// </summary>
        [Output("redisCacheId")]
        public Output<string> RedisCacheId { get; private set; } = null!;


        /// <summary>
        /// Create a CacheAccessPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CacheAccessPolicy(string name, CacheAccessPolicyArgs args, CustomResourceOptions? options = null)
            : base("azure:redis/cacheAccessPolicy:CacheAccessPolicy", name, args ?? new CacheAccessPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CacheAccessPolicy(string name, Input<string> id, CacheAccessPolicyState? state = null, CustomResourceOptions? options = null)
            : base("azure:redis/cacheAccessPolicy:CacheAccessPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CacheAccessPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CacheAccessPolicy Get(string name, Input<string> id, CacheAccessPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new CacheAccessPolicy(name, id, state, options);
        }
    }

    public sealed class CacheAccessPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Redis Cache Access Policy. Changing this forces a new Redis Cache Access Policy to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Permissions that are going to be assigned to this Redis Cache Access Policy.
        /// </summary>
        [Input("permissions", required: true)]
        public Input<string> Permissions { get; set; } = null!;

        /// <summary>
        /// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy to be created.
        /// </summary>
        [Input("redisCacheId", required: true)]
        public Input<string> RedisCacheId { get; set; } = null!;

        public CacheAccessPolicyArgs()
        {
        }
        public static new CacheAccessPolicyArgs Empty => new CacheAccessPolicyArgs();
    }

    public sealed class CacheAccessPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Redis Cache Access Policy. Changing this forces a new Redis Cache Access Policy to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Permissions that are going to be assigned to this Redis Cache Access Policy.
        /// </summary>
        [Input("permissions")]
        public Input<string>? Permissions { get; set; }

        /// <summary>
        /// The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy to be created.
        /// </summary>
        [Input("redisCacheId")]
        public Input<string>? RedisCacheId { get; set; }

        public CacheAccessPolicyState()
        {
        }
        public static new CacheAccessPolicyState Empty => new CacheAccessPolicyState();
    }
}

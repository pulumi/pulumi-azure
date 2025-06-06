// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Redis.Inputs
{

    public sealed class EnterpriseDatabaseModuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration options for the module (e.g. `ERROR_RATE 0.00 INITIAL_SIZE 400`). Changing this forces a new resource to be created. Defaults to `""`.
        /// </summary>
        [Input("args")]
        public Input<string>? Args { get; set; }

        /// <summary>
        /// The name which should be used for this module. Possible values are `RedisBloom`, `RedisTimeSeries`, `RediSearch` and `RedisJSON`. Changing this forces a new Redis Enterprise Database to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("version")]
        public Input<string>? Version { get; set; }

        public EnterpriseDatabaseModuleArgs()
        {
        }
        public static new EnterpriseDatabaseModuleArgs Empty => new EnterpriseDatabaseModuleArgs();
    }
}

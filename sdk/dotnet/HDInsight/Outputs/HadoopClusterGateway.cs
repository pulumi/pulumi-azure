// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Outputs
{

    [OutputType]
    public sealed class HadoopClusterGateway
    {
        /// <summary>
        /// The password used for the Ambari Portal.
        /// 
        /// &gt; **Note:** This password must be different from the one used for the `head_node`, `worker_node` and `zookeeper_node` roles.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The username used for the Ambari Portal. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private HadoopClusterGateway(
            string password,

            string username)
        {
            Password = password;
            Username = username;
        }
    }
}

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Outputs
{

    [OutputType]
    public sealed class JobTargetGroupJobTarget
    {
        /// <summary>
        /// The name of the MS SQL Database.
        /// 
        /// &gt; **Note:** This cannot be set in combination with `elastic_pool_name`.
        /// </summary>
        public readonly string? DatabaseName;
        /// <summary>
        /// The name of the MS SQL Elastic Pool.
        /// 
        /// &gt; **Note:** This cannot be set in combination with `database_name`.
        /// </summary>
        public readonly string? ElasticPoolName;
        /// <summary>
        /// The ID of the job credential to use during execution of jobs.
        /// 
        /// &gt; **Note:** This is required when `membership_type` is `Include`, unless `database_name` is set.
        /// </summary>
        public readonly string? JobCredentialId;
        /// <summary>
        /// The membership type for this job target. Possible values are `Include` and `Exclude`. Defaults to `Include`.
        /// </summary>
        public readonly string? MembershipType;
        /// <summary>
        /// The name of the MS SQL Server.
        /// </summary>
        public readonly string ServerName;
        /// <summary>
        /// The job target type. This value is computed based on `server_name`, `database_name`, and `elastic_pool_name`.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private JobTargetGroupJobTarget(
            string? databaseName,

            string? elasticPoolName,

            string? jobCredentialId,

            string? membershipType,

            string serverName,

            string? type)
        {
            DatabaseName = databaseName;
            ElasticPoolName = elasticPoolName;
            JobCredentialId = jobCredentialId;
            MembershipType = membershipType;
            ServerName = serverName;
            Type = type;
        }
    }
}

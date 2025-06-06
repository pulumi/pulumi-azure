// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB.Outputs
{

    [OutputType]
    public sealed class GetSqlDatabaseAutoscaleSettingResult
    {
        /// <summary>
        /// The maximum throughput of the SQL database (RU/s).
        /// </summary>
        public readonly int MaxThroughput;

        [OutputConstructor]
        private GetSqlDatabaseAutoscaleSettingResult(int maxThroughput)
        {
            MaxThroughput = maxThroughput;
        }
    }
}

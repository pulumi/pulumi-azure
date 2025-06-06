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
    public sealed class ManagedDatabasePointInTimeRestore
    {
        /// <summary>
        /// The point in time for the restore from `source_database_id`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string RestorePointInTime;
        /// <summary>
        /// The source database id that will be used to restore from. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string SourceDatabaseId;

        [OutputConstructor]
        private ManagedDatabasePointInTimeRestore(
            string restorePointInTime,

            string sourceDatabaseId)
        {
            RestorePointInTime = restorePointInTime;
            SourceDatabaseId = sourceDatabaseId;
        }
    }
}

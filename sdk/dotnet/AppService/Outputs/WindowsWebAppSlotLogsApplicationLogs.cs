// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class WindowsWebAppSlotLogsApplicationLogs
    {
        /// <summary>
        /// An `azure_blob_storage` block as defined below.
        /// </summary>
        public readonly Outputs.WindowsWebAppSlotLogsApplicationLogsAzureBlobStorage? AzureBlobStorage;
        /// <summary>
        /// Log level. Possible values include: `Verbose`, `Information`, `Warning`, and `Error`.
        /// </summary>
        public readonly string FileSystemLevel;

        [OutputConstructor]
        private WindowsWebAppSlotLogsApplicationLogs(
            Outputs.WindowsWebAppSlotLogsApplicationLogsAzureBlobStorage? azureBlobStorage,

            string fileSystemLevel)
        {
            AzureBlobStorage = azureBlobStorage;
            FileSystemLevel = fileSystemLevel;
        }
    }
}
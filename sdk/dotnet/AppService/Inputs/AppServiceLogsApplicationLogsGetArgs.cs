// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class AppServiceLogsApplicationLogsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `azure_blob_storage` block as defined below.
        /// </summary>
        [Input("azureBlobStorage")]
        public Input<Inputs.AppServiceLogsApplicationLogsAzureBlobStorageGetArgs>? AzureBlobStorage { get; set; }

        /// <summary>
        /// Log level for filesystem based logging. Supported values are `Error`, `Information`, `Verbose`, `Warning` and `Off`. Defaults to `Off`.
        /// </summary>
        [Input("fileSystemLevel")]
        public Input<string>? FileSystemLevel { get; set; }

        public AppServiceLogsApplicationLogsGetArgs()
        {
        }
        public static new AppServiceLogsApplicationLogsGetArgs Empty => new AppServiceLogsApplicationLogsGetArgs();
    }
}

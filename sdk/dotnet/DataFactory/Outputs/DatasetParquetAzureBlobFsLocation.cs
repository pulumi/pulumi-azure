// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Outputs
{

    [OutputType]
    public sealed class DatasetParquetAzureBlobFsLocation
    {
        /// <summary>
        /// Is the `file_system` using dynamic expression, function or system variables? Defaults to `false`.
        /// </summary>
        public readonly bool? DynamicFileSystemEnabled;
        /// <summary>
        /// Is the `filename` using dynamic expression, function or system variables? Defaults to `false`.
        /// </summary>
        public readonly bool? DynamicFilenameEnabled;
        /// <summary>
        /// Is the `path` using dynamic expression, function or system variables? Defaults to `false`.
        /// </summary>
        public readonly bool? DynamicPathEnabled;
        /// <summary>
        /// The container on the Azure Data Lake Storage Account hosting the file.
        /// </summary>
        public readonly string? FileSystem;
        /// <summary>
        /// The filename of the file on the Azure Data Lake Storage Account.
        /// </summary>
        public readonly string? Filename;
        /// <summary>
        /// The folder path to the file on the Azure Data Lake Storage Account.
        /// </summary>
        public readonly string? Path;

        [OutputConstructor]
        private DatasetParquetAzureBlobFsLocation(
            bool? dynamicFileSystemEnabled,

            bool? dynamicFilenameEnabled,

            bool? dynamicPathEnabled,

            string? fileSystem,

            string? filename,

            string? path)
        {
            DynamicFileSystemEnabled = dynamicFileSystemEnabled;
            DynamicFilenameEnabled = dynamicFilenameEnabled;
            DynamicPathEnabled = dynamicPathEnabled;
            FileSystem = fileSystem;
            Filename = filename;
            Path = path;
        }
    }
}

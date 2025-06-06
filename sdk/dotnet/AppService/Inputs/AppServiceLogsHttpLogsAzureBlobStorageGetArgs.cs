// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class AppServiceLogsHttpLogsAzureBlobStorageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of days to retain logs for.
        /// </summary>
        [Input("retentionInDays", required: true)]
        public Input<int> RetentionInDays { get; set; } = null!;

        [Input("sasUrl", required: true)]
        private Input<string>? _sasUrl;

        /// <summary>
        /// The URL to the storage container with a shared access signature token appended.
        /// </summary>
        public Input<string>? SasUrl
        {
            get => _sasUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sasUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public AppServiceLogsHttpLogsAzureBlobStorageGetArgs()
        {
        }
        public static new AppServiceLogsHttpLogsAzureBlobStorageGetArgs Empty => new AppServiceLogsHttpLogsAzureBlobStorageGetArgs();
    }
}

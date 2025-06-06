// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class AppServiceLogsApplicationLogsAzureBlobStorageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The level at which to log. Possible values include `Error`, `Warning`, `Information`, `Verbose` and `Off`. **NOTE:** this field is not available for `http_logs`
        /// </summary>
        [Input("level", required: true)]
        public Input<string> Level { get; set; } = null!;

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

        public AppServiceLogsApplicationLogsAzureBlobStorageArgs()
        {
        }
        public static new AppServiceLogsApplicationLogsAzureBlobStorageArgs Empty => new AppServiceLogsApplicationLogsAzureBlobStorageArgs();
    }
}

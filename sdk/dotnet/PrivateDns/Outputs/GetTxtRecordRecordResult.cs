// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PrivateDns.Outputs
{

    [OutputType]
    public sealed class GetTxtRecordRecordResult
    {
        /// <summary>
        /// The value of the record. Max length: 1024 characters
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetTxtRecordRecordResult(string value)
        {
            Value = value;
        }
    }
}

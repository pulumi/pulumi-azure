// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Dns.Outputs
{

    [OutputType]
    public sealed class TxtRecordRecord
    {
        /// <summary>
        /// The value of the record. Max length: 4096 characters
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private TxtRecordRecord(string value)
        {
            Value = value;
        }
    }
}

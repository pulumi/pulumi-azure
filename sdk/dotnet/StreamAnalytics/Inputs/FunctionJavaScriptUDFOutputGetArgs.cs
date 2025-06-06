// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.StreamAnalytics.Inputs
{

    public sealed class FunctionJavaScriptUDFOutputGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Data Type output from this JavaScript Function. Possible values include `array`, `any`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FunctionJavaScriptUDFOutputGetArgs()
        {
        }
        public static new FunctionJavaScriptUDFOutputGetArgs Empty => new FunctionJavaScriptUDFOutputGetArgs();
    }
}

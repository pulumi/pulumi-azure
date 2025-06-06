// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class FunctionAppFunctionFileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The content of the file. Changing this forces a new resource to be created.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// The filename of the file to be uploaded. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public FunctionAppFunctionFileArgs()
        {
        }
        public static new FunctionAppFunctionFileArgs Empty => new FunctionAppFunctionFileArgs();
    }
}

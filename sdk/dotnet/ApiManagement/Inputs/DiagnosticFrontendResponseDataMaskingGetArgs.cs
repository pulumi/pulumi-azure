// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class DiagnosticFrontendResponseDataMaskingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("headers")]
        private InputList<Inputs.DiagnosticFrontendResponseDataMaskingHeaderGetArgs>? _headers;

        /// <summary>
        /// A `headers` block as defined below.
        /// </summary>
        public InputList<Inputs.DiagnosticFrontendResponseDataMaskingHeaderGetArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.DiagnosticFrontendResponseDataMaskingHeaderGetArgs>());
            set => _headers = value;
        }

        [Input("queryParams")]
        private InputList<Inputs.DiagnosticFrontendResponseDataMaskingQueryParamGetArgs>? _queryParams;

        /// <summary>
        /// A `query_params` block as defined below.
        /// </summary>
        public InputList<Inputs.DiagnosticFrontendResponseDataMaskingQueryParamGetArgs> QueryParams
        {
            get => _queryParams ?? (_queryParams = new InputList<Inputs.DiagnosticFrontendResponseDataMaskingQueryParamGetArgs>());
            set => _queryParams = value;
        }

        public DiagnosticFrontendResponseDataMaskingGetArgs()
        {
        }
        public static new DiagnosticFrontendResponseDataMaskingGetArgs Empty => new DiagnosticFrontendResponseDataMaskingGetArgs();
    }
}

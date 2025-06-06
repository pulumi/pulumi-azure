// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class DiagnosticFrontendRequestDataMaskingArgs : global::Pulumi.ResourceArgs
    {
        [Input("headers")]
        private InputList<Inputs.DiagnosticFrontendRequestDataMaskingHeaderArgs>? _headers;

        /// <summary>
        /// A `headers` block as defined below.
        /// </summary>
        public InputList<Inputs.DiagnosticFrontendRequestDataMaskingHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.DiagnosticFrontendRequestDataMaskingHeaderArgs>());
            set => _headers = value;
        }

        [Input("queryParams")]
        private InputList<Inputs.DiagnosticFrontendRequestDataMaskingQueryParamArgs>? _queryParams;

        /// <summary>
        /// A `query_params` block as defined below.
        /// </summary>
        public InputList<Inputs.DiagnosticFrontendRequestDataMaskingQueryParamArgs> QueryParams
        {
            get => _queryParams ?? (_queryParams = new InputList<Inputs.DiagnosticFrontendRequestDataMaskingQueryParamArgs>());
            set => _queryParams = value;
        }

        public DiagnosticFrontendRequestDataMaskingArgs()
        {
        }
        public static new DiagnosticFrontendRequestDataMaskingArgs Empty => new DiagnosticFrontendRequestDataMaskingArgs();
    }
}

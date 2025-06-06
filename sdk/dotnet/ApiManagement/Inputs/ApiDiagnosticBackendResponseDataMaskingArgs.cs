// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class ApiDiagnosticBackendResponseDataMaskingArgs : global::Pulumi.ResourceArgs
    {
        [Input("headers")]
        private InputList<Inputs.ApiDiagnosticBackendResponseDataMaskingHeaderArgs>? _headers;

        /// <summary>
        /// A `headers` block as defined below.
        /// </summary>
        public InputList<Inputs.ApiDiagnosticBackendResponseDataMaskingHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.ApiDiagnosticBackendResponseDataMaskingHeaderArgs>());
            set => _headers = value;
        }

        [Input("queryParams")]
        private InputList<Inputs.ApiDiagnosticBackendResponseDataMaskingQueryParamArgs>? _queryParams;

        /// <summary>
        /// A `query_params` block as defined below.
        /// </summary>
        public InputList<Inputs.ApiDiagnosticBackendResponseDataMaskingQueryParamArgs> QueryParams
        {
            get => _queryParams ?? (_queryParams = new InputList<Inputs.ApiDiagnosticBackendResponseDataMaskingQueryParamArgs>());
            set => _queryParams = value;
        }

        public ApiDiagnosticBackendResponseDataMaskingArgs()
        {
        }
        public static new ApiDiagnosticBackendResponseDataMaskingArgs Empty => new ApiDiagnosticBackendResponseDataMaskingArgs();
    }
}

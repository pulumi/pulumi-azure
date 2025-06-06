// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Inputs
{

    public sealed class ApiDiagnosticFrontendRequestDataMaskingArgs : global::Pulumi.ResourceArgs
    {
        [Input("headers")]
        private InputList<Inputs.ApiDiagnosticFrontendRequestDataMaskingHeaderArgs>? _headers;

        /// <summary>
        /// A `headers` block as defined below.
        /// </summary>
        public InputList<Inputs.ApiDiagnosticFrontendRequestDataMaskingHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.ApiDiagnosticFrontendRequestDataMaskingHeaderArgs>());
            set => _headers = value;
        }

        [Input("queryParams")]
        private InputList<Inputs.ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs>? _queryParams;

        /// <summary>
        /// A `query_params` block as defined below.
        /// </summary>
        public InputList<Inputs.ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs> QueryParams
        {
            get => _queryParams ?? (_queryParams = new InputList<Inputs.ApiDiagnosticFrontendRequestDataMaskingQueryParamArgs>());
            set => _queryParams = value;
        }

        public ApiDiagnosticFrontendRequestDataMaskingArgs()
        {
        }
        public static new ApiDiagnosticFrontendRequestDataMaskingArgs Empty => new ApiDiagnosticFrontendRequestDataMaskingArgs();
    }
}

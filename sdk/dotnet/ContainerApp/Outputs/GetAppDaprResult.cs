// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class GetAppDaprResult
    {
        /// <summary>
        /// The Dapr Application Identifier.
        /// </summary>
        public readonly string AppId;
        /// <summary>
        /// The port which the application is listening on. This is the same as the `ingress` port.
        /// </summary>
        public readonly int AppPort;
        /// <summary>
        /// The protocol for the app. Possible values include `http` and `grpc`. Defaults to `http`.
        /// </summary>
        public readonly string AppProtocol;

        [OutputConstructor]
        private GetAppDaprResult(
            string appId,

            int appPort,

            string appProtocol)
        {
            AppId = appId;
            AppPort = appPort;
            AppProtocol = appProtocol;
        }
    }
}

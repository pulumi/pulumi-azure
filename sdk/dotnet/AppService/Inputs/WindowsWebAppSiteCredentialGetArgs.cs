// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class WindowsWebAppSiteCredentialGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        private Input<string>? _name;

        /// <summary>
        /// The name which should be used for this Windows Web App. Changing this forces a new Windows Web App to be created.
        /// </summary>
        public Input<string>? Name
        {
            get => _name;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _name = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The Site Credentials Password used for publishing.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public WindowsWebAppSiteCredentialGetArgs()
        {
        }
        public static new WindowsWebAppSiteCredentialGetArgs Empty => new WindowsWebAppSiteCredentialGetArgs();
    }
}

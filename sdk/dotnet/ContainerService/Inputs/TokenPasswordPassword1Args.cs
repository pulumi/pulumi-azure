// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class TokenPasswordPassword1Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The expiration date of the password in RFC3339 format. If not specified, the password never expires. Changing this forces a new resource to be created.
        /// </summary>
        [Input("expiry")]
        public Input<string>? Expiry { get; set; }

        [Input("value")]
        private Input<string>? _value;

        /// <summary>
        /// The value of the password (Sensitive).
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public TokenPasswordPassword1Args()
        {
        }
        public static new TokenPasswordPassword1Args Empty => new TokenPasswordPassword1Args();
    }
}

// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class AccountSharePropertiesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("corsRules")]
        private InputList<Inputs.AccountSharePropertiesCorsRuleGetArgs>? _corsRules;

        /// <summary>
        /// A `cors_rule` block as defined below.
        /// </summary>
        public InputList<Inputs.AccountSharePropertiesCorsRuleGetArgs> CorsRules
        {
            get => _corsRules ?? (_corsRules = new InputList<Inputs.AccountSharePropertiesCorsRuleGetArgs>());
            set => _corsRules = value;
        }

        /// <summary>
        /// A `retention_policy` block as defined below.
        /// </summary>
        [Input("retentionPolicy")]
        public Input<Inputs.AccountSharePropertiesRetentionPolicyGetArgs>? RetentionPolicy { get; set; }

        /// <summary>
        /// A `smb` block as defined below.
        /// </summary>
        [Input("smb")]
        public Input<Inputs.AccountSharePropertiesSmbGetArgs>? Smb { get; set; }

        public AccountSharePropertiesGetArgs()
        {
        }
        public static new AccountSharePropertiesGetArgs Empty => new AccountSharePropertiesGetArgs();
    }
}

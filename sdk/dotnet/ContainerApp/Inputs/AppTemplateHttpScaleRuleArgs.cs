// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Inputs
{

    public sealed class AppTemplateHttpScaleRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("authentications")]
        private InputList<Inputs.AppTemplateHttpScaleRuleAuthenticationArgs>? _authentications;

        /// <summary>
        /// Zero or more `authentication` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AppTemplateHttpScaleRuleAuthenticationArgs> Authentications
        {
            get => _authentications ?? (_authentications = new InputList<Inputs.AppTemplateHttpScaleRuleAuthenticationArgs>());
            set => _authentications = value;
        }

        /// <summary>
        /// The number of concurrent requests to trigger scaling.
        /// </summary>
        [Input("concurrentRequests", required: true)]
        public Input<string> ConcurrentRequests { get; set; } = null!;

        /// <summary>
        /// The name of the Scaling Rule
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public AppTemplateHttpScaleRuleArgs()
        {
        }
        public static new AppTemplateHttpScaleRuleArgs Empty => new AppTemplateHttpScaleRuleArgs();
    }
}

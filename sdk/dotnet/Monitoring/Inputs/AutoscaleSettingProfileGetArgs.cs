// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class AutoscaleSettingProfileGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `capacity` block as defined below.
        /// </summary>
        [Input("capacity", required: true)]
        public Input<Inputs.AutoscaleSettingProfileCapacityGetArgs> Capacity { get; set; } = null!;

        /// <summary>
        /// A `fixed_date` block as defined below. This cannot be specified if a `recurrence` block is specified.
        /// </summary>
        [Input("fixedDate")]
        public Input<Inputs.AutoscaleSettingProfileFixedDateGetArgs>? FixedDate { get; set; }

        /// <summary>
        /// Specifies the name of the profile.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// A `recurrence` block as defined below. This cannot be specified if a `fixed_date` block is specified.
        /// </summary>
        [Input("recurrence")]
        public Input<Inputs.AutoscaleSettingProfileRecurrenceGetArgs>? Recurrence { get; set; }

        [Input("rules")]
        private InputList<Inputs.AutoscaleSettingProfileRuleGetArgs>? _rules;

        /// <summary>
        /// One or more (up to 10) `rule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AutoscaleSettingProfileRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AutoscaleSettingProfileRuleGetArgs>());
            set => _rules = value;
        }

        public AutoscaleSettingProfileGetArgs()
        {
        }
        public static new AutoscaleSettingProfileGetArgs Empty => new AutoscaleSettingProfileGetArgs();
    }
}

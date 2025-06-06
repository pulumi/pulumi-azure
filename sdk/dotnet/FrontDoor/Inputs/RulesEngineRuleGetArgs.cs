// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.FrontDoor.Inputs
{

    public sealed class RulesEngineRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `action` block as defined below.
        /// </summary>
        [Input("action")]
        public Input<Inputs.RulesEngineRuleActionGetArgs>? Action { get; set; }

        [Input("matchConditions")]
        private InputList<Inputs.RulesEngineRuleMatchConditionGetArgs>? _matchConditions;

        /// <summary>
        /// One or more `match_condition` block as defined below.
        /// </summary>
        public InputList<Inputs.RulesEngineRuleMatchConditionGetArgs> MatchConditions
        {
            get => _matchConditions ?? (_matchConditions = new InputList<Inputs.RulesEngineRuleMatchConditionGetArgs>());
            set => _matchConditions = value;
        }

        /// <summary>
        /// The name of the rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Priority of the rule, must be unique per rules engine definition.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        public RulesEngineRuleGetArgs()
        {
        }
        public static new RulesEngineRuleGetArgs Empty => new RulesEngineRuleGetArgs();
    }
}

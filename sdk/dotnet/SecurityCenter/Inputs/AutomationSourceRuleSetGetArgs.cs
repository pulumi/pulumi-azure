// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SecurityCenter.Inputs
{

    public sealed class AutomationSourceRuleSetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("rules", required: true)]
        private InputList<Inputs.AutomationSourceRuleSetRuleGetArgs>? _rules;

        /// <summary>
        /// One or more `rule` blocks as defined below.
        /// 
        /// &gt; **Note:** This automation will trigger when all of the `rule`s in this `rule_set` are evaluated as 'true'. This is equivalent to a logical 'AND'.
        /// </summary>
        public InputList<Inputs.AutomationSourceRuleSetRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.AutomationSourceRuleSetRuleGetArgs>());
            set => _rules = value;
        }

        public AutomationSourceRuleSetGetArgs()
        {
        }
        public static new AutomationSourceRuleSetGetArgs Empty => new AutomationSourceRuleSetGetArgs();
    }
}

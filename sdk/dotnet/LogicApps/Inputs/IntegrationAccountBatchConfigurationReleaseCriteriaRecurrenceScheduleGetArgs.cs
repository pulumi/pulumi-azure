// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogicApps.Inputs
{

    public sealed class IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("hours")]
        private InputList<int>? _hours;

        /// <summary>
        /// A list containing a single item, which specifies the Hour interval at which this recurrence should be triggered.
        /// </summary>
        public InputList<int> Hours
        {
            get => _hours ?? (_hours = new InputList<int>());
            set => _hours = value;
        }

        [Input("minutes")]
        private InputList<int>? _minutes;

        /// <summary>
        /// A list containing a single item which specifies the Minute interval at which this recurrence should be triggered.
        /// </summary>
        public InputList<int> Minutes
        {
            get => _minutes ?? (_minutes = new InputList<int>());
            set => _minutes = value;
        }

        [Input("monthDays")]
        private InputList<int>? _monthDays;

        /// <summary>
        /// A list of days of the month that the job should execute on.
        /// </summary>
        public InputList<int> MonthDays
        {
            get => _monthDays ?? (_monthDays = new InputList<int>());
            set => _monthDays = value;
        }

        [Input("monthlies")]
        private InputList<Inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyGetArgs>? _monthlies;

        /// <summary>
        /// A `monthly` block as documented below.
        /// </summary>
        public InputList<Inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyGetArgs> Monthlies
        {
            get => _monthlies ?? (_monthlies = new InputList<Inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleMonthlyGetArgs>());
            set => _monthlies = value;
        }

        [Input("weekDays")]
        private InputList<string>? _weekDays;

        /// <summary>
        /// A list of days of the week that the job should execute on. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
        /// </summary>
        public InputList<string> WeekDays
        {
            get => _weekDays ?? (_weekDays = new InputList<string>());
            set => _weekDays = value;
        }

        public IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleGetArgs()
        {
        }
        public static new IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleGetArgs Empty => new IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleGetArgs();
    }
}

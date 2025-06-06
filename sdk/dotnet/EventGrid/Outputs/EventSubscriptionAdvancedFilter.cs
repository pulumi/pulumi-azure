// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.EventGrid.Outputs
{

    [OutputType]
    public sealed class EventSubscriptionAdvancedFilter
    {
        /// <summary>
        /// Compares a value of an event using a single boolean value.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterBoolEqual> BoolEquals;
        /// <summary>
        /// Evaluates if a value of an event isn't NULL or undefined.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterIsNotNull> IsNotNulls;
        /// <summary>
        /// Evaluates if a value of an event is NULL or undefined.
        /// 
        /// Each nested block consists of a key and a value(s) element.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterIsNullOrUndefined> IsNullOrUndefineds;
        /// <summary>
        /// Compares a value of an event using a single floating point number.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberGreaterThanOrEqual> NumberGreaterThanOrEquals;
        /// <summary>
        /// Compares a value of an event using a single floating point number.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberGreaterThan> NumberGreaterThans;
        /// <summary>
        /// Compares a value of an event using multiple floating point number ranges.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberInRange> NumberInRanges;
        /// <summary>
        /// Compares a value of an event using multiple floating point numbers.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberIn> NumberIns;
        /// <summary>
        /// Compares a value of an event using a single floating point number.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberLessThanOrEqual> NumberLessThanOrEquals;
        /// <summary>
        /// Compares a value of an event using a single floating point number.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberLessThan> NumberLessThans;
        /// <summary>
        /// Compares a value of an event using multiple floating point number ranges.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberNotInRange> NumberNotInRanges;
        /// <summary>
        /// Compares a value of an event using multiple floating point numbers.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberNotIn> NumberNotIns;
        /// <summary>
        /// Compares a value of an event using multiple string values.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringBeginsWith> StringBeginsWiths;
        /// <summary>
        /// Compares a value of an event using multiple string values.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringContain> StringContains;
        /// <summary>
        /// Compares a value of an event using multiple string values.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringEndsWith> StringEndsWiths;
        /// <summary>
        /// Compares a value of an event using multiple string values.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringIn> StringIns;
        /// <summary>
        /// Compares a value of an event using multiple string values.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringNotBeginsWith> StringNotBeginsWiths;
        /// <summary>
        /// Compares a value of an event using multiple string values.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringNotContain> StringNotContains;
        /// <summary>
        /// Compares a value of an event using multiple string values.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringNotEndsWith> StringNotEndsWiths;
        /// <summary>
        /// Compares a value of an event using multiple string values.
        /// </summary>
        public readonly ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringNotIn> StringNotIns;

        [OutputConstructor]
        private EventSubscriptionAdvancedFilter(
            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterBoolEqual> boolEquals,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterIsNotNull> isNotNulls,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterIsNullOrUndefined> isNullOrUndefineds,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberGreaterThanOrEqual> numberGreaterThanOrEquals,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberGreaterThan> numberGreaterThans,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberInRange> numberInRanges,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberIn> numberIns,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberLessThanOrEqual> numberLessThanOrEquals,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberLessThan> numberLessThans,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberNotInRange> numberNotInRanges,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterNumberNotIn> numberNotIns,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringBeginsWith> stringBeginsWiths,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringContain> stringContains,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringEndsWith> stringEndsWiths,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringIn> stringIns,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringNotBeginsWith> stringNotBeginsWiths,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringNotContain> stringNotContains,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringNotEndsWith> stringNotEndsWiths,

            ImmutableArray<Outputs.EventSubscriptionAdvancedFilterStringNotIn> stringNotIns)
        {
            BoolEquals = boolEquals;
            IsNotNulls = isNotNulls;
            IsNullOrUndefineds = isNullOrUndefineds;
            NumberGreaterThanOrEquals = numberGreaterThanOrEquals;
            NumberGreaterThans = numberGreaterThans;
            NumberInRanges = numberInRanges;
            NumberIns = numberIns;
            NumberLessThanOrEquals = numberLessThanOrEquals;
            NumberLessThans = numberLessThans;
            NumberNotInRanges = numberNotInRanges;
            NumberNotIns = numberNotIns;
            StringBeginsWiths = stringBeginsWiths;
            StringContains = stringContains;
            StringEndsWiths = stringEndsWiths;
            StringIns = stringIns;
            StringNotBeginsWiths = stringNotBeginsWiths;
            StringNotContains = stringNotContains;
            StringNotEndsWiths = stringNotEndsWiths;
            StringNotIns = stringNotIns;
        }
    }
}

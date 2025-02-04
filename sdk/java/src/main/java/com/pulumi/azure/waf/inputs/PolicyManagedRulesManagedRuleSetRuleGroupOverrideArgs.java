// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf.inputs;

import com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs Empty = new PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs();

    /**
     * The name of the Rule Group. Possible values are `BadBots`, `crs_20_protocol_violations`, `crs_21_protocol_anomalies`, `crs_23_request_limits`, `crs_30_http_policy`, `crs_35_bad_robots`, `crs_40_generic_attacks`, `crs_41_sql_injection_attacks`, `crs_41_xss_attacks`, `crs_42_tight_security`, `crs_45_trojans`, `crs_49_inbound_blocking`, `General`, `GoodBots`, `KnownBadBots`, `Known-CVEs`, `REQUEST-911-METHOD-ENFORCEMENT`, `REQUEST-913-SCANNER-DETECTION`, `REQUEST-920-PROTOCOL-ENFORCEMENT`, `REQUEST-921-PROTOCOL-ATTACK`, `REQUEST-930-APPLICATION-ATTACK-LFI`, `REQUEST-931-APPLICATION-ATTACK-RFI`, `REQUEST-932-APPLICATION-ATTACK-RCE`, `REQUEST-933-APPLICATION-ATTACK-PHP`, `REQUEST-941-APPLICATION-ATTACK-XSS`, `REQUEST-942-APPLICATION-ATTACK-SQLI`, `REQUEST-943-APPLICATION-ATTACK-SESSION-FIXATION`, `REQUEST-944-APPLICATION-ATTACK-JAVA`, `UnknownBots`, `METHOD-ENFORCEMENT`, `PROTOCOL-ENFORCEMENT`, `PROTOCOL-ATTACK`, `LFI`, `RFI`, `RCE`, `PHP`, `NODEJS`, `XSS`, `SQLI`, `FIX`, `JAVA`, `MS-ThreatIntel-WebShells`, `MS-ThreatIntel-AppSec`, `MS-ThreatIntel-SQLI` and `MS-ThreatIntel-CVEs`MS-ThreatIntel-WebShells`,.
     * 
     */
    @Import(name="ruleGroupName", required=true)
    private Output<String> ruleGroupName;

    /**
     * @return The name of the Rule Group. Possible values are `BadBots`, `crs_20_protocol_violations`, `crs_21_protocol_anomalies`, `crs_23_request_limits`, `crs_30_http_policy`, `crs_35_bad_robots`, `crs_40_generic_attacks`, `crs_41_sql_injection_attacks`, `crs_41_xss_attacks`, `crs_42_tight_security`, `crs_45_trojans`, `crs_49_inbound_blocking`, `General`, `GoodBots`, `KnownBadBots`, `Known-CVEs`, `REQUEST-911-METHOD-ENFORCEMENT`, `REQUEST-913-SCANNER-DETECTION`, `REQUEST-920-PROTOCOL-ENFORCEMENT`, `REQUEST-921-PROTOCOL-ATTACK`, `REQUEST-930-APPLICATION-ATTACK-LFI`, `REQUEST-931-APPLICATION-ATTACK-RFI`, `REQUEST-932-APPLICATION-ATTACK-RCE`, `REQUEST-933-APPLICATION-ATTACK-PHP`, `REQUEST-941-APPLICATION-ATTACK-XSS`, `REQUEST-942-APPLICATION-ATTACK-SQLI`, `REQUEST-943-APPLICATION-ATTACK-SESSION-FIXATION`, `REQUEST-944-APPLICATION-ATTACK-JAVA`, `UnknownBots`, `METHOD-ENFORCEMENT`, `PROTOCOL-ENFORCEMENT`, `PROTOCOL-ATTACK`, `LFI`, `RFI`, `RCE`, `PHP`, `NODEJS`, `XSS`, `SQLI`, `FIX`, `JAVA`, `MS-ThreatIntel-WebShells`, `MS-ThreatIntel-AppSec`, `MS-ThreatIntel-SQLI` and `MS-ThreatIntel-CVEs`MS-ThreatIntel-WebShells`,.
     * 
     */
    public Output<String> ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * One or more `rule` block defined below.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs>> rules;

    /**
     * @return One or more `rule` block defined below.
     * 
     */
    public Optional<Output<List<PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs() {}

    private PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs(PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs $) {
        this.ruleGroupName = $.ruleGroupName;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs $;

        public Builder() {
            $ = new PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs();
        }

        public Builder(PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs defaults) {
            $ = new PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ruleGroupName The name of the Rule Group. Possible values are `BadBots`, `crs_20_protocol_violations`, `crs_21_protocol_anomalies`, `crs_23_request_limits`, `crs_30_http_policy`, `crs_35_bad_robots`, `crs_40_generic_attacks`, `crs_41_sql_injection_attacks`, `crs_41_xss_attacks`, `crs_42_tight_security`, `crs_45_trojans`, `crs_49_inbound_blocking`, `General`, `GoodBots`, `KnownBadBots`, `Known-CVEs`, `REQUEST-911-METHOD-ENFORCEMENT`, `REQUEST-913-SCANNER-DETECTION`, `REQUEST-920-PROTOCOL-ENFORCEMENT`, `REQUEST-921-PROTOCOL-ATTACK`, `REQUEST-930-APPLICATION-ATTACK-LFI`, `REQUEST-931-APPLICATION-ATTACK-RFI`, `REQUEST-932-APPLICATION-ATTACK-RCE`, `REQUEST-933-APPLICATION-ATTACK-PHP`, `REQUEST-941-APPLICATION-ATTACK-XSS`, `REQUEST-942-APPLICATION-ATTACK-SQLI`, `REQUEST-943-APPLICATION-ATTACK-SESSION-FIXATION`, `REQUEST-944-APPLICATION-ATTACK-JAVA`, `UnknownBots`, `METHOD-ENFORCEMENT`, `PROTOCOL-ENFORCEMENT`, `PROTOCOL-ATTACK`, `LFI`, `RFI`, `RCE`, `PHP`, `NODEJS`, `XSS`, `SQLI`, `FIX`, `JAVA`, `MS-ThreatIntel-WebShells`, `MS-ThreatIntel-AppSec`, `MS-ThreatIntel-SQLI` and `MS-ThreatIntel-CVEs`MS-ThreatIntel-WebShells`,.
         * 
         * @return builder
         * 
         */
        public Builder ruleGroupName(Output<String> ruleGroupName) {
            $.ruleGroupName = ruleGroupName;
            return this;
        }

        /**
         * @param ruleGroupName The name of the Rule Group. Possible values are `BadBots`, `crs_20_protocol_violations`, `crs_21_protocol_anomalies`, `crs_23_request_limits`, `crs_30_http_policy`, `crs_35_bad_robots`, `crs_40_generic_attacks`, `crs_41_sql_injection_attacks`, `crs_41_xss_attacks`, `crs_42_tight_security`, `crs_45_trojans`, `crs_49_inbound_blocking`, `General`, `GoodBots`, `KnownBadBots`, `Known-CVEs`, `REQUEST-911-METHOD-ENFORCEMENT`, `REQUEST-913-SCANNER-DETECTION`, `REQUEST-920-PROTOCOL-ENFORCEMENT`, `REQUEST-921-PROTOCOL-ATTACK`, `REQUEST-930-APPLICATION-ATTACK-LFI`, `REQUEST-931-APPLICATION-ATTACK-RFI`, `REQUEST-932-APPLICATION-ATTACK-RCE`, `REQUEST-933-APPLICATION-ATTACK-PHP`, `REQUEST-941-APPLICATION-ATTACK-XSS`, `REQUEST-942-APPLICATION-ATTACK-SQLI`, `REQUEST-943-APPLICATION-ATTACK-SESSION-FIXATION`, `REQUEST-944-APPLICATION-ATTACK-JAVA`, `UnknownBots`, `METHOD-ENFORCEMENT`, `PROTOCOL-ENFORCEMENT`, `PROTOCOL-ATTACK`, `LFI`, `RFI`, `RCE`, `PHP`, `NODEJS`, `XSS`, `SQLI`, `FIX`, `JAVA`, `MS-ThreatIntel-WebShells`, `MS-ThreatIntel-AppSec`, `MS-ThreatIntel-SQLI` and `MS-ThreatIntel-CVEs`MS-ThreatIntel-WebShells`,.
         * 
         * @return builder
         * 
         */
        public Builder ruleGroupName(String ruleGroupName) {
            return ruleGroupName(Output.of(ruleGroupName));
        }

        /**
         * @param rules One or more `rule` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules One or more `rule` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules One or more `rule` block defined below.
         * 
         * @return builder
         * 
         */
        public Builder rules(PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs build() {
            if ($.ruleGroupName == null) {
                throw new MissingRequiredPropertyException("PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs", "ruleGroupName");
            }
            return $;
        }
    }

}

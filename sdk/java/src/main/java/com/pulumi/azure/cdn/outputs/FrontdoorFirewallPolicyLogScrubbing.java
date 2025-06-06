// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.azure.cdn.outputs.FrontdoorFirewallPolicyLogScrubbingScrubbingRule;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontdoorFirewallPolicyLogScrubbing {
    /**
     * @return Is log scrubbing enabled? Possible values are `true` or `false`. Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return One or more `scrubbing_rule` blocks as defined below.
     * 
     * &gt; **Note:** For more information on masking sensitive data in Azure Front Door please see the [product documentation](https://learn.microsoft.com/azure/web-application-firewall/afds/waf-sensitive-data-protection-configure-frontdoor).
     * 
     */
    private List<FrontdoorFirewallPolicyLogScrubbingScrubbingRule> scrubbingRules;

    private FrontdoorFirewallPolicyLogScrubbing() {}
    /**
     * @return Is log scrubbing enabled? Possible values are `true` or `false`. Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return One or more `scrubbing_rule` blocks as defined below.
     * 
     * &gt; **Note:** For more information on masking sensitive data in Azure Front Door please see the [product documentation](https://learn.microsoft.com/azure/web-application-firewall/afds/waf-sensitive-data-protection-configure-frontdoor).
     * 
     */
    public List<FrontdoorFirewallPolicyLogScrubbingScrubbingRule> scrubbingRules() {
        return this.scrubbingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontdoorFirewallPolicyLogScrubbing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private List<FrontdoorFirewallPolicyLogScrubbingScrubbingRule> scrubbingRules;
        public Builder() {}
        public Builder(FrontdoorFirewallPolicyLogScrubbing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.scrubbingRules = defaults.scrubbingRules;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder scrubbingRules(List<FrontdoorFirewallPolicyLogScrubbingScrubbingRule> scrubbingRules) {
            if (scrubbingRules == null) {
              throw new MissingRequiredPropertyException("FrontdoorFirewallPolicyLogScrubbing", "scrubbingRules");
            }
            this.scrubbingRules = scrubbingRules;
            return this;
        }
        public Builder scrubbingRules(FrontdoorFirewallPolicyLogScrubbingScrubbingRule... scrubbingRules) {
            return scrubbingRules(List.of(scrubbingRules));
        }
        public FrontdoorFirewallPolicyLogScrubbing build() {
            final var _resultValue = new FrontdoorFirewallPolicyLogScrubbing();
            _resultValue.enabled = enabled;
            _resultValue.scrubbingRules = scrubbingRules;
            return _resultValue;
        }
    }
}

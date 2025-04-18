// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerRequests;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppSlotSiteConfigAutoHealSettingTrigger {
    /**
     * @return A `requests` block as defined above.
     * 
     */
    private @Nullable LinuxWebAppSlotSiteConfigAutoHealSettingTriggerRequests requests;
    /**
     * @return A `slow_request` block as defined above.
     * 
     */
    private @Nullable LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest slowRequest;
    /**
     * @return One or more `slow_request_with_path` blocks as defined above.
     * 
     */
    private @Nullable List<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> slowRequestWithPaths;
    /**
     * @return One or more `status_code` blocks as defined above.
     * 
     */
    private @Nullable List<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> statusCodes;

    private LinuxWebAppSlotSiteConfigAutoHealSettingTrigger() {}
    /**
     * @return A `requests` block as defined above.
     * 
     */
    public Optional<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerRequests> requests() {
        return Optional.ofNullable(this.requests);
    }
    /**
     * @return A `slow_request` block as defined above.
     * 
     */
    public Optional<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest> slowRequest() {
        return Optional.ofNullable(this.slowRequest);
    }
    /**
     * @return One or more `slow_request_with_path` blocks as defined above.
     * 
     */
    public List<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> slowRequestWithPaths() {
        return this.slowRequestWithPaths == null ? List.of() : this.slowRequestWithPaths;
    }
    /**
     * @return One or more `status_code` blocks as defined above.
     * 
     */
    public List<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> statusCodes() {
        return this.statusCodes == null ? List.of() : this.statusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppSlotSiteConfigAutoHealSettingTrigger defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LinuxWebAppSlotSiteConfigAutoHealSettingTriggerRequests requests;
        private @Nullable LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest slowRequest;
        private @Nullable List<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> slowRequestWithPaths;
        private @Nullable List<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> statusCodes;
        public Builder() {}
        public Builder(LinuxWebAppSlotSiteConfigAutoHealSettingTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requests = defaults.requests;
    	      this.slowRequest = defaults.slowRequest;
    	      this.slowRequestWithPaths = defaults.slowRequestWithPaths;
    	      this.statusCodes = defaults.statusCodes;
        }

        @CustomType.Setter
        public Builder requests(@Nullable LinuxWebAppSlotSiteConfigAutoHealSettingTriggerRequests requests) {

            this.requests = requests;
            return this;
        }
        @CustomType.Setter
        public Builder slowRequest(@Nullable LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest slowRequest) {

            this.slowRequest = slowRequest;
            return this;
        }
        @CustomType.Setter
        public Builder slowRequestWithPaths(@Nullable List<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> slowRequestWithPaths) {

            this.slowRequestWithPaths = slowRequestWithPaths;
            return this;
        }
        public Builder slowRequestWithPaths(LinuxWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath... slowRequestWithPaths) {
            return slowRequestWithPaths(List.of(slowRequestWithPaths));
        }
        @CustomType.Setter
        public Builder statusCodes(@Nullable List<LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> statusCodes) {

            this.statusCodes = statusCodes;
            return this;
        }
        public Builder statusCodes(LinuxWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }
        public LinuxWebAppSlotSiteConfigAutoHealSettingTrigger build() {
            final var _resultValue = new LinuxWebAppSlotSiteConfigAutoHealSettingTrigger();
            _resultValue.requests = requests;
            _resultValue.slowRequest = slowRequest;
            _resultValue.slowRequestWithPaths = slowRequestWithPaths;
            _resultValue.statusCodes = statusCodes;
            return _resultValue;
        }
    }
}

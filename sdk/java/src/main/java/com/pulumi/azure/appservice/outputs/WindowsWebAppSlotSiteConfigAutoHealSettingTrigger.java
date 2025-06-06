// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerRequests;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotSiteConfigAutoHealSettingTrigger {
    /**
     * @return The amount of Private Memory to be consumed for this rule to trigger. Possible values are between `102400` and `13631488`.
     * 
     */
    private @Nullable Integer privateMemoryKb;
    /**
     * @return A `requests` block as defined above.
     * 
     */
    private @Nullable WindowsWebAppSlotSiteConfigAutoHealSettingTriggerRequests requests;
    /**
     * @return A `slow_request` block as defined above.
     * 
     */
    private @Nullable WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest slowRequest;
    /**
     * @return One or more `slow_request_with_path` blocks as defined above.
     * 
     */
    private @Nullable List<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> slowRequestWithPaths;
    /**
     * @return One or more `status_code` blocks as defined above.
     * 
     */
    private @Nullable List<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> statusCodes;

    private WindowsWebAppSlotSiteConfigAutoHealSettingTrigger() {}
    /**
     * @return The amount of Private Memory to be consumed for this rule to trigger. Possible values are between `102400` and `13631488`.
     * 
     */
    public Optional<Integer> privateMemoryKb() {
        return Optional.ofNullable(this.privateMemoryKb);
    }
    /**
     * @return A `requests` block as defined above.
     * 
     */
    public Optional<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerRequests> requests() {
        return Optional.ofNullable(this.requests);
    }
    /**
     * @return A `slow_request` block as defined above.
     * 
     */
    public Optional<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest> slowRequest() {
        return Optional.ofNullable(this.slowRequest);
    }
    /**
     * @return One or more `slow_request_with_path` blocks as defined above.
     * 
     */
    public List<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> slowRequestWithPaths() {
        return this.slowRequestWithPaths == null ? List.of() : this.slowRequestWithPaths;
    }
    /**
     * @return One or more `status_code` blocks as defined above.
     * 
     */
    public List<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> statusCodes() {
        return this.statusCodes == null ? List.of() : this.statusCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotSiteConfigAutoHealSettingTrigger defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer privateMemoryKb;
        private @Nullable WindowsWebAppSlotSiteConfigAutoHealSettingTriggerRequests requests;
        private @Nullable WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest slowRequest;
        private @Nullable List<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> slowRequestWithPaths;
        private @Nullable List<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> statusCodes;
        public Builder() {}
        public Builder(WindowsWebAppSlotSiteConfigAutoHealSettingTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateMemoryKb = defaults.privateMemoryKb;
    	      this.requests = defaults.requests;
    	      this.slowRequest = defaults.slowRequest;
    	      this.slowRequestWithPaths = defaults.slowRequestWithPaths;
    	      this.statusCodes = defaults.statusCodes;
        }

        @CustomType.Setter
        public Builder privateMemoryKb(@Nullable Integer privateMemoryKb) {

            this.privateMemoryKb = privateMemoryKb;
            return this;
        }
        @CustomType.Setter
        public Builder requests(@Nullable WindowsWebAppSlotSiteConfigAutoHealSettingTriggerRequests requests) {

            this.requests = requests;
            return this;
        }
        @CustomType.Setter
        public Builder slowRequest(@Nullable WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequest slowRequest) {

            this.slowRequest = slowRequest;
            return this;
        }
        @CustomType.Setter
        public Builder slowRequestWithPaths(@Nullable List<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath> slowRequestWithPaths) {

            this.slowRequestWithPaths = slowRequestWithPaths;
            return this;
        }
        public Builder slowRequestWithPaths(WindowsWebAppSlotSiteConfigAutoHealSettingTriggerSlowRequestWithPath... slowRequestWithPaths) {
            return slowRequestWithPaths(List.of(slowRequestWithPaths));
        }
        @CustomType.Setter
        public Builder statusCodes(@Nullable List<WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode> statusCodes) {

            this.statusCodes = statusCodes;
            return this;
        }
        public Builder statusCodes(WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCode... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }
        public WindowsWebAppSlotSiteConfigAutoHealSettingTrigger build() {
            final var _resultValue = new WindowsWebAppSlotSiteConfigAutoHealSettingTrigger();
            _resultValue.privateMemoryKb = privateMemoryKb;
            _resultValue.requests = requests;
            _resultValue.slowRequest = slowRequest;
            _resultValue.slowRequestWithPaths = slowRequestWithPaths;
            _resultValue.statusCodes = statusCodes;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionAppSourceControl {
    /**
     * @return The branch of the remote repository in use.
     * 
     */
    private String branch;
    /**
     * @return Limits to manual integration.
     * 
     */
    private Boolean manualIntegration;
    /**
     * @return The URL of the source code repository.
     * 
     */
    private String repoUrl;
    /**
     * @return Is roll-back enabled for the repository.
     * 
     */
    private Boolean rollbackEnabled;
    /**
     * @return Uses Mercurial if `true`, otherwise uses Git.
     * 
     */
    private Boolean useMercurial;

    private GetFunctionAppSourceControl() {}
    /**
     * @return The branch of the remote repository in use.
     * 
     */
    public String branch() {
        return this.branch;
    }
    /**
     * @return Limits to manual integration.
     * 
     */
    public Boolean manualIntegration() {
        return this.manualIntegration;
    }
    /**
     * @return The URL of the source code repository.
     * 
     */
    public String repoUrl() {
        return this.repoUrl;
    }
    /**
     * @return Is roll-back enabled for the repository.
     * 
     */
    public Boolean rollbackEnabled() {
        return this.rollbackEnabled;
    }
    /**
     * @return Uses Mercurial if `true`, otherwise uses Git.
     * 
     */
    public Boolean useMercurial() {
        return this.useMercurial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionAppSourceControl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String branch;
        private Boolean manualIntegration;
        private String repoUrl;
        private Boolean rollbackEnabled;
        private Boolean useMercurial;
        public Builder() {}
        public Builder(GetFunctionAppSourceControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.manualIntegration = defaults.manualIntegration;
    	      this.repoUrl = defaults.repoUrl;
    	      this.rollbackEnabled = defaults.rollbackEnabled;
    	      this.useMercurial = defaults.useMercurial;
        }

        @CustomType.Setter
        public Builder branch(String branch) {
            if (branch == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppSourceControl", "branch");
            }
            this.branch = branch;
            return this;
        }
        @CustomType.Setter
        public Builder manualIntegration(Boolean manualIntegration) {
            if (manualIntegration == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppSourceControl", "manualIntegration");
            }
            this.manualIntegration = manualIntegration;
            return this;
        }
        @CustomType.Setter
        public Builder repoUrl(String repoUrl) {
            if (repoUrl == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppSourceControl", "repoUrl");
            }
            this.repoUrl = repoUrl;
            return this;
        }
        @CustomType.Setter
        public Builder rollbackEnabled(Boolean rollbackEnabled) {
            if (rollbackEnabled == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppSourceControl", "rollbackEnabled");
            }
            this.rollbackEnabled = rollbackEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder useMercurial(Boolean useMercurial) {
            if (useMercurial == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppSourceControl", "useMercurial");
            }
            this.useMercurial = useMercurial;
            return this;
        }
        public GetFunctionAppSourceControl build() {
            final var _resultValue = new GetFunctionAppSourceControl();
            _resultValue.branch = branch;
            _resultValue.manualIntegration = manualIntegration;
            _resultValue.repoUrl = repoUrl;
            _resultValue.rollbackEnabled = rollbackEnabled;
            _resultValue.useMercurial = useMercurial;
            return _resultValue;
        }
    }
}

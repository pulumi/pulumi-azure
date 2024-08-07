// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPoolAutoScale {
    /**
     * @return The interval to wait before evaluating if the pool needs to be scaled.
     * 
     */
    private String evaluationInterval;
    /**
     * @return The autoscale formula that needs to be used for scaling the Batch pool.
     * 
     */
    private String formula;

    private GetPoolAutoScale() {}
    /**
     * @return The interval to wait before evaluating if the pool needs to be scaled.
     * 
     */
    public String evaluationInterval() {
        return this.evaluationInterval;
    }
    /**
     * @return The autoscale formula that needs to be used for scaling the Batch pool.
     * 
     */
    public String formula() {
        return this.formula;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolAutoScale defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String evaluationInterval;
        private String formula;
        public Builder() {}
        public Builder(GetPoolAutoScale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationInterval = defaults.evaluationInterval;
    	      this.formula = defaults.formula;
        }

        @CustomType.Setter
        public Builder evaluationInterval(String evaluationInterval) {
            if (evaluationInterval == null) {
              throw new MissingRequiredPropertyException("GetPoolAutoScale", "evaluationInterval");
            }
            this.evaluationInterval = evaluationInterval;
            return this;
        }
        @CustomType.Setter
        public Builder formula(String formula) {
            if (formula == null) {
              throw new MissingRequiredPropertyException("GetPoolAutoScale", "formula");
            }
            this.formula = formula;
            return this;
        }
        public GetPoolAutoScale build() {
            final var _resultValue = new GetPoolAutoScale();
            _resultValue.evaluationInterval = evaluationInterval;
            _resultValue.formula = formula;
            return _resultValue;
        }
    }
}

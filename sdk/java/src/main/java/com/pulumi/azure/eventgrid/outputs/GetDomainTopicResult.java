// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainTopicResult {
    /**
     * @return The EventGrid Domain Topic Domain name.
     * 
     */
    private String domainName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String resourceGroupName;

    private GetDomainTopicResult() {}
    /**
     * @return The EventGrid Domain Topic Domain name.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainTopicResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domainName;
        private String id;
        private String name;
        private String resourceGroupName;
        public Builder() {}
        public Builder(GetDomainTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDomainTopicResult build() {
            final var o = new GetDomainTopicResult();
            o.domainName = domainName;
            o.id = id;
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            return o;
        }
    }
}
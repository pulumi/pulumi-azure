// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetPublicIPsPublicIp;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublicIPsResult {
    private @Nullable String allocationType;
    private @Nullable String attachmentStatus;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String namePrefix;
    /**
     * @return A List of `public_ips` blocks as defined below filtered by the criteria above.
     * 
     */
    private List<GetPublicIPsPublicIp> publicIps;
    private String resourceGroupName;

    private GetPublicIPsResult() {}
    public Optional<String> allocationType() {
        return Optional.ofNullable(this.allocationType);
    }
    public Optional<String> attachmentStatus() {
        return Optional.ofNullable(this.attachmentStatus);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }
    /**
     * @return A List of `public_ips` blocks as defined below filtered by the criteria above.
     * 
     */
    public List<GetPublicIPsPublicIp> publicIps() {
        return this.publicIps;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicIPsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String allocationType;
        private @Nullable String attachmentStatus;
        private String id;
        private @Nullable String namePrefix;
        private List<GetPublicIPsPublicIp> publicIps;
        private String resourceGroupName;
        public Builder() {}
        public Builder(GetPublicIPsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationType = defaults.allocationType;
    	      this.attachmentStatus = defaults.attachmentStatus;
    	      this.id = defaults.id;
    	      this.namePrefix = defaults.namePrefix;
    	      this.publicIps = defaults.publicIps;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        @CustomType.Setter
        public Builder allocationType(@Nullable String allocationType) {
            this.allocationType = allocationType;
            return this;
        }
        @CustomType.Setter
        public Builder attachmentStatus(@Nullable String attachmentStatus) {
            this.attachmentStatus = attachmentStatus;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        @CustomType.Setter
        public Builder publicIps(List<GetPublicIPsPublicIp> publicIps) {
            this.publicIps = Objects.requireNonNull(publicIps);
            return this;
        }
        public Builder publicIps(GetPublicIPsPublicIp... publicIps) {
            return publicIps(List.of(publicIps));
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetPublicIPsResult build() {
            final var o = new GetPublicIPsResult();
            o.allocationType = allocationType;
            o.attachmentStatus = attachmentStatus;
            o.id = id;
            o.namePrefix = namePrefix;
            o.publicIps = publicIps;
            o.resourceGroupName = resourceGroupName;
            return o;
        }
    }
}
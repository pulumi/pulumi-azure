// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.blueprint.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPublishedVersionResult {
    private String blueprintName;
    /**
     * @return The description of the Blueprint Published Version
     * 
     */
    private String description;
    /**
     * @return The display name of the Blueprint Published Version
     * 
     */
    private String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String lastModified;
    private String scopeId;
    /**
     * @return The target scope
     * 
     */
    private String targetScope;
    private String timeCreated;
    /**
     * @return The type of the Blueprint
     * 
     */
    private String type;
    private String version;

    private GetPublishedVersionResult() {}
    public String blueprintName() {
        return this.blueprintName;
    }
    /**
     * @return The description of the Blueprint Published Version
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of the Blueprint Published Version
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String lastModified() {
        return this.lastModified;
    }
    public String scopeId() {
        return this.scopeId;
    }
    /**
     * @return The target scope
     * 
     */
    public String targetScope() {
        return this.targetScope;
    }
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The type of the Blueprint
     * 
     */
    public String type() {
        return this.type;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublishedVersionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String blueprintName;
        private String description;
        private String displayName;
        private String id;
        private String lastModified;
        private String scopeId;
        private String targetScope;
        private String timeCreated;
        private String type;
        private String version;
        public Builder() {}
        public Builder(GetPublishedVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprintName = defaults.blueprintName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.scopeId = defaults.scopeId;
    	      this.targetScope = defaults.targetScope;
    	      this.timeCreated = defaults.timeCreated;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder blueprintName(String blueprintName) {
            this.blueprintName = Objects.requireNonNull(blueprintName);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }
        @CustomType.Setter
        public Builder scopeId(String scopeId) {
            this.scopeId = Objects.requireNonNull(scopeId);
            return this;
        }
        @CustomType.Setter
        public Builder targetScope(String targetScope) {
            this.targetScope = Objects.requireNonNull(targetScope);
            return this;
        }
        @CustomType.Setter
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetPublishedVersionResult build() {
            final var o = new GetPublishedVersionResult();
            o.blueprintName = blueprintName;
            o.description = description;
            o.displayName = displayName;
            o.id = id;
            o.lastModified = lastModified;
            o.scopeId = scopeId;
            o.targetScope = targetScope;
            o.timeCreated = timeCreated;
            o.type = type;
            o.version = version;
            return o;
        }
    }
}
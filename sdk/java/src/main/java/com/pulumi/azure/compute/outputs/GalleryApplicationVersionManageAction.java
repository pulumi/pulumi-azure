// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GalleryApplicationVersionManageAction {
    /**
     * @return The command to install the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    private String install;
    /**
     * @return The command to remove the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    private String remove;
    /**
     * @return The command to update the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String update;

    private GalleryApplicationVersionManageAction() {}
    /**
     * @return The command to install the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    public String install() {
        return this.install;
    }
    /**
     * @return The command to remove the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    public String remove() {
        return this.remove;
    }
    /**
     * @return The command to update the Gallery Application. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> update() {
        return Optional.ofNullable(this.update);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryApplicationVersionManageAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String install;
        private String remove;
        private @Nullable String update;
        public Builder() {}
        public Builder(GalleryApplicationVersionManageAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.install = defaults.install;
    	      this.remove = defaults.remove;
    	      this.update = defaults.update;
        }

        @CustomType.Setter
        public Builder install(String install) {
            if (install == null) {
              throw new MissingRequiredPropertyException("GalleryApplicationVersionManageAction", "install");
            }
            this.install = install;
            return this;
        }
        @CustomType.Setter
        public Builder remove(String remove) {
            if (remove == null) {
              throw new MissingRequiredPropertyException("GalleryApplicationVersionManageAction", "remove");
            }
            this.remove = remove;
            return this;
        }
        @CustomType.Setter
        public Builder update(@Nullable String update) {

            this.update = update;
            return this;
        }
        public GalleryApplicationVersionManageAction build() {
            final var _resultValue = new GalleryApplicationVersionManageAction();
            _resultValue.install = install;
            _resultValue.remove = remove;
            _resultValue.update = update;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderFeaturesMachineLearningArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderFeaturesMachineLearningArgs Empty = new ProviderFeaturesMachineLearningArgs();

    @Import(name="purgeSoftDeletedWorkspaceOnDestroy")
    private @Nullable Output<Boolean> purgeSoftDeletedWorkspaceOnDestroy;

    public Optional<Output<Boolean>> purgeSoftDeletedWorkspaceOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeletedWorkspaceOnDestroy);
    }

    private ProviderFeaturesMachineLearningArgs() {}

    private ProviderFeaturesMachineLearningArgs(ProviderFeaturesMachineLearningArgs $) {
        this.purgeSoftDeletedWorkspaceOnDestroy = $.purgeSoftDeletedWorkspaceOnDestroy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderFeaturesMachineLearningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderFeaturesMachineLearningArgs $;

        public Builder() {
            $ = new ProviderFeaturesMachineLearningArgs();
        }

        public Builder(ProviderFeaturesMachineLearningArgs defaults) {
            $ = new ProviderFeaturesMachineLearningArgs(Objects.requireNonNull(defaults));
        }

        public Builder purgeSoftDeletedWorkspaceOnDestroy(@Nullable Output<Boolean> purgeSoftDeletedWorkspaceOnDestroy) {
            $.purgeSoftDeletedWorkspaceOnDestroy = purgeSoftDeletedWorkspaceOnDestroy;
            return this;
        }

        public Builder purgeSoftDeletedWorkspaceOnDestroy(Boolean purgeSoftDeletedWorkspaceOnDestroy) {
            return purgeSoftDeletedWorkspaceOnDestroy(Output.of(purgeSoftDeletedWorkspaceOnDestroy));
        }

        public ProviderFeaturesMachineLearningArgs build() {
            return $;
        }
    }

}

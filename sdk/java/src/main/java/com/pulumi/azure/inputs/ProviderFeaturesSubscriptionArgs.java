// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderFeaturesSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderFeaturesSubscriptionArgs Empty = new ProviderFeaturesSubscriptionArgs();

    @Import(name="preventCancellationOnDestroy")
    private @Nullable Output<Boolean> preventCancellationOnDestroy;

    public Optional<Output<Boolean>> preventCancellationOnDestroy() {
        return Optional.ofNullable(this.preventCancellationOnDestroy);
    }

    private ProviderFeaturesSubscriptionArgs() {}

    private ProviderFeaturesSubscriptionArgs(ProviderFeaturesSubscriptionArgs $) {
        this.preventCancellationOnDestroy = $.preventCancellationOnDestroy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderFeaturesSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderFeaturesSubscriptionArgs $;

        public Builder() {
            $ = new ProviderFeaturesSubscriptionArgs();
        }

        public Builder(ProviderFeaturesSubscriptionArgs defaults) {
            $ = new ProviderFeaturesSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder preventCancellationOnDestroy(@Nullable Output<Boolean> preventCancellationOnDestroy) {
            $.preventCancellationOnDestroy = preventCancellationOnDestroy;
            return this;
        }

        public Builder preventCancellationOnDestroy(Boolean preventCancellationOnDestroy) {
            return preventCancellationOnDestroy(Output.of(preventCancellationOnDestroy));
        }

        public ProviderFeaturesSubscriptionArgs build() {
            return $;
        }
    }

}

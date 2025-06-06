// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cognitive;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountRaiBlocklistArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountRaiBlocklistArgs Empty = new AccountRaiBlocklistArgs();

    /**
     * The ID of the Cognitive Services Account. Changing this forces a new Cognitive Account Rai Blocklist to be created.
     * 
     */
    @Import(name="cognitiveAccountId", required=true)
    private Output<String> cognitiveAccountId;

    /**
     * @return The ID of the Cognitive Services Account. Changing this forces a new Cognitive Account Rai Blocklist to be created.
     * 
     */
    public Output<String> cognitiveAccountId() {
        return this.cognitiveAccountId;
    }

    /**
     * A short description for the Cognitive Account Rai Blocklist.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A short description for the Cognitive Account Rai Blocklist.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Cognitive Account Rai Blocklist. Changing this forces a new Cognitive Account Rai Blocklist to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Cognitive Account Rai Blocklist. Changing this forces a new Cognitive Account Rai Blocklist to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AccountRaiBlocklistArgs() {}

    private AccountRaiBlocklistArgs(AccountRaiBlocklistArgs $) {
        this.cognitiveAccountId = $.cognitiveAccountId;
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountRaiBlocklistArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountRaiBlocklistArgs $;

        public Builder() {
            $ = new AccountRaiBlocklistArgs();
        }

        public Builder(AccountRaiBlocklistArgs defaults) {
            $ = new AccountRaiBlocklistArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cognitiveAccountId The ID of the Cognitive Services Account. Changing this forces a new Cognitive Account Rai Blocklist to be created.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveAccountId(Output<String> cognitiveAccountId) {
            $.cognitiveAccountId = cognitiveAccountId;
            return this;
        }

        /**
         * @param cognitiveAccountId The ID of the Cognitive Services Account. Changing this forces a new Cognitive Account Rai Blocklist to be created.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveAccountId(String cognitiveAccountId) {
            return cognitiveAccountId(Output.of(cognitiveAccountId));
        }

        /**
         * @param description A short description for the Cognitive Account Rai Blocklist.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A short description for the Cognitive Account Rai Blocklist.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the Cognitive Account Rai Blocklist. Changing this forces a new Cognitive Account Rai Blocklist to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cognitive Account Rai Blocklist. Changing this forces a new Cognitive Account Rai Blocklist to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AccountRaiBlocklistArgs build() {
            if ($.cognitiveAccountId == null) {
                throw new MissingRequiredPropertyException("AccountRaiBlocklistArgs", "cognitiveAccountId");
            }
            return $;
        }
    }

}

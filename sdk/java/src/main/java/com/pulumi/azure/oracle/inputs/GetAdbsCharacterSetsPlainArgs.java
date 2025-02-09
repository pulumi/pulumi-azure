// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.oracle.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAdbsCharacterSetsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAdbsCharacterSetsPlainArgs Empty = new GetAdbsCharacterSetsPlainArgs();

    /**
     * The Azure Region to query for the character sets in.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The Azure Region to query for the character sets in.
     * 
     */
    public String location() {
        return this.location;
    }

    private GetAdbsCharacterSetsPlainArgs() {}

    private GetAdbsCharacterSetsPlainArgs(GetAdbsCharacterSetsPlainArgs $) {
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAdbsCharacterSetsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAdbsCharacterSetsPlainArgs $;

        public Builder() {
            $ = new GetAdbsCharacterSetsPlainArgs();
        }

        public Builder(GetAdbsCharacterSetsPlainArgs defaults) {
            $ = new GetAdbsCharacterSetsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region to query for the character sets in.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public GetAdbsCharacterSetsPlainArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetAdbsCharacterSetsPlainArgs", "location");
            }
            return $;
        }
    }

}

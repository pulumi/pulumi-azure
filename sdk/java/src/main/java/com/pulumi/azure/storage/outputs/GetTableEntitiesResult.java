// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.GetTableEntitiesItem;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetTableEntitiesResult {
    private String filter;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of `items` blocks as defined below.
     * 
     */
    private List<GetTableEntitiesItem> items;
    private @Nullable List<String> selects;
    private String storageTableId;

    private GetTableEntitiesResult() {}
    public String filter() {
        return this.filter;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of `items` blocks as defined below.
     * 
     */
    public List<GetTableEntitiesItem> items() {
        return this.items;
    }
    public List<String> selects() {
        return this.selects == null ? List.of() : this.selects;
    }
    public String storageTableId() {
        return this.storageTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableEntitiesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filter;
        private String id;
        private List<GetTableEntitiesItem> items;
        private @Nullable List<String> selects;
        private String storageTableId;
        public Builder() {}
        public Builder(GetTableEntitiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.selects = defaults.selects;
    	      this.storageTableId = defaults.storageTableId;
        }

        @CustomType.Setter
        public Builder filter(String filter) {
            if (filter == null) {
              throw new MissingRequiredPropertyException("GetTableEntitiesResult", "filter");
            }
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTableEntitiesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetTableEntitiesItem> items) {
            if (items == null) {
              throw new MissingRequiredPropertyException("GetTableEntitiesResult", "items");
            }
            this.items = items;
            return this;
        }
        public Builder items(GetTableEntitiesItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder selects(@Nullable List<String> selects) {

            this.selects = selects;
            return this;
        }
        public Builder selects(String... selects) {
            return selects(List.of(selects));
        }
        @CustomType.Setter
        public Builder storageTableId(String storageTableId) {
            if (storageTableId == null) {
              throw new MissingRequiredPropertyException("GetTableEntitiesResult", "storageTableId");
            }
            this.storageTableId = storageTableId;
            return this;
        }
        public GetTableEntitiesResult build() {
            final var _resultValue = new GetTableEntitiesResult();
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.items = items;
            _resultValue.selects = selects;
            _resultValue.storageTableId = storageTableId;
            return _resultValue;
        }
    }
}

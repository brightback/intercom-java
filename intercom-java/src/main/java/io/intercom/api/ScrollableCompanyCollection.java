package io.intercom.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ScrollableCompanyCollection  extends ScrollableTypedDataCollection<Company> {

    @Override
    public ScrollableCompanyCollection scroll(Intercom intercom) {
        return DataResource.scroll(intercom, getScrollParam(), "companies", ScrollableCompanyCollection.class);
    }

    @JsonProperty("companies")
    @Override
    public List<Company> getPage() {
        return super.getPage();
    }
}

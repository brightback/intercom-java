package io.intercom.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ScrollableContactCollection  extends ScrollableTypedDataCollection<Contact> {

    @Override
    public ScrollableContactCollection scroll(Intercom intercom) {
        return DataResource.scroll(intercom, getScrollParam(), "contacts", ScrollableContactCollection.class);
    }

    @JsonProperty("contacts")
    @Override
    public List<Contact> getPage() {
        return super.getPage();
    }
}

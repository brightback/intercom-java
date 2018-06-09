package io.intercom.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ScrollableUserCollection extends ScrollableTypedDataCollection<User> {

    @Override
    public ScrollableUserCollection scroll(Intercom intercom) {
        return DataResource.scroll(intercom, getScrollParam(), "users", ScrollableUserCollection.class);
    }

    @JsonProperty("users")
    @Override
    public List<User> getPage() {
        return super.getPage();
    }

}

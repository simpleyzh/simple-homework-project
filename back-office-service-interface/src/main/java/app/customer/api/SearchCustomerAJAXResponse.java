package app.customer.api;

import core.framework.api.json.Property;

import java.util.List;

public class SearchCustomerAJAXResponse {
    @Property(name = "views")
    public List<CustomerAJAXView> customerViews;
}

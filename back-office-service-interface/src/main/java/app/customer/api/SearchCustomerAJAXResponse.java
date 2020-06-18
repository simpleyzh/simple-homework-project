package app.customer.api;

import core.framework.api.json.Property;

import java.util.List;

public class SearchCustomerAJAXResponse {
    @Property(name = "customers")
    public List<CustomerView> customerViews;
}

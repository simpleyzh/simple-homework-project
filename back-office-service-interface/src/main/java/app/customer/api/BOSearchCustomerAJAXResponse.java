package app.customer.api;

import core.framework.api.json.Property;

import java.util.List;

public class BOSearchCustomerAJAXResponse {
    @Property(name = "views")
    public List<BOCustomerAJAXView> customerViews;
}

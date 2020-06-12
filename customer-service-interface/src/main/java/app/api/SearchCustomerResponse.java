package app.api;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author simple
 */
public class SearchCustomerResponse {
    @Property(name = "views")
    public List<CustomerView> customerViews;
}

package app.customer.api;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author simple
 */
public class SearchCustomerAJAXResponse {
    @Property(name = "list")
    public List<CustomerAJAXView> list;
}

package app.customer.api;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author simple
 */
public class BOSearchCustomerResponse {
    @Property(name = "customers")
    public List<CustomerView> customerViews;
}

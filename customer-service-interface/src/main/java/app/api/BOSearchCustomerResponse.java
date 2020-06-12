package app.api;

import core.framework.api.json.Property;

import java.util.List;

/**
 * @author simple
 */
public class BOSearchCustomerResponse {
    @Property(name = "views")
    public List<BOCustomerView> customerViews;
}

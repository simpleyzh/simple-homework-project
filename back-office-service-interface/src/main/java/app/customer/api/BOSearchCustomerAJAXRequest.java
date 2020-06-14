package app.customer.api;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

public class BOSearchCustomerAJAXRequest {
    @NotBlank
    @NotNull
    @Property(name = "name")
    public String name;
}

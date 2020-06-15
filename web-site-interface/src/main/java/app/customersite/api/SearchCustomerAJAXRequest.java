package app.customersite.api;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

public class SearchCustomerAJAXRequest {
    @NotBlank
    @NotNull
    @Property(name = "name")
    public String name;
}

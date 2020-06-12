package app.api;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author simple
 */
public class BOSearchCustomerRequest {
    @NotBlank
    @NotNull
    @Property(name = "name")
    public String name;
}

package app.customersite.api;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author simple
 */
public class UpdateCustomerAJAXRequest {
    @NotBlank
    @NotNull
    @Property(name = "id")
    public String id;

    @NotBlank
    @NotNull
    @Property(name = "email")
    public String email;

    @NotBlank
    @NotNull
    @Property(name = "name")
    public String name;
}

package app.demo.api.product;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;


/**
 * @author simple
 */
public class CreateProductRequest {
    @NotBlank
    @NotNull
    @Property(name = "id")
    public String id;

    @NotBlank
    @NotNull
    @Property(name = "name")
    public String name;

    @NotBlank
    @NotNull
    @Property(name = "desc")
    public String desc;
}

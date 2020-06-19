package app.demo.api.product.kafka;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

import java.time.LocalDateTime;

/**
 * @author simple
 */
public class ProductCreatedMessage {
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

    @NotNull
    @Property(name = "created_time")
    public LocalDateTime createdTime;
}

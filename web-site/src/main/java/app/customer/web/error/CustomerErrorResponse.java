package app.customer.web.error;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author simple
 */
public class CustomerErrorResponse {
    @NotBlank
    @NotNull
    @Property(name = "message")
    public String message;

    @NotBlank
    @NotNull
    @Property(name = "code")
    public String code;
}

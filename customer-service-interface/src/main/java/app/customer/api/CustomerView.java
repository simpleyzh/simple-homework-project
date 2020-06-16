package app.customer.api;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author simple
 */
public class CustomerView {
    @NotBlank
    @NotNull
    @Property(name = "id")
    public String id;

    @NotBlank
    @NotNull
    @Property(name = "name")
    public String name;

    @NotNull
    @Property(name = "age")
    public Integer age;

    @NotBlank
    @NotNull
    @Property(name = "email")
    public String email;

    @NotNull
    @Property(name = "gender")
    public Gender gender;

    public enum Gender {
        @Property(name = "MALE")
        MALE,
        @Property(name = "FEMALE")
        FEMALE
    }
}

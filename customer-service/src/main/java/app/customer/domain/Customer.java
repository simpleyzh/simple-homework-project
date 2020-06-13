package app.customer.domain;

import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.db.Column;
import core.framework.db.PrimaryKey;
import core.framework.db.Table;

/**
 * @author simple
 */
@Table(name = "customers")
public class Customer {
    @NotBlank
    @PrimaryKey
    @Column(name = "id")
    public String id;

    @NotNull
    @NotBlank
    @Column(name = "name")
    public String name;

    @NotNull
    @NotBlank
    @Column(name = "email")
    public String email;

    @NotNull
    @NotBlank
    @Column(name = "sex")
    public String sex;

    @NotNull
    @Column(name = "age")
    public Integer age;
}

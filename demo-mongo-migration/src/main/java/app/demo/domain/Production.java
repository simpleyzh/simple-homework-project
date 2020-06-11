package app.demo.domain;

import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.mongo.Collection;
import core.framework.mongo.Field;
import core.framework.mongo.Id;

import java.time.LocalDateTime;

/**
 * @author simple
 */
@Collection(name = "productions")
public class Production {
    @Id
    public String id;

    @NotBlank
    @Field(name = "status")
    public String status;

    @NotNull
    @Field(name = "price")
    public Double price;

    @Field(name = "updated_time")
    public LocalDateTime updateTime;

    @Field(name = "updated_By")
    public String updateBy;

    @NotNull
    @Field(name = "created_time")
    public LocalDateTime createdTime;

    @NotNull
    @Field(name = "created_By")
    public String createdBy;
}

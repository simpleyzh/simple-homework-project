package app.db.mongo.domain;

import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.mongo.Collection;
import core.framework.mongo.Field;
import core.framework.mongo.Id;
import core.framework.mongo.MongoEnumValue;

import java.time.LocalDateTime;

/**
 * @author simple
 */
@Collection(name = "productions")
public class Production {
    @Id
    public String id;

    @NotNull
    @Field(name = "status")
    public Status status;

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

    public enum Status {
        @MongoEnumValue("ACTIVE")
        ACTIVE,

        @MongoEnumValue("INACTIVE")
        INACTIVE
    }
}

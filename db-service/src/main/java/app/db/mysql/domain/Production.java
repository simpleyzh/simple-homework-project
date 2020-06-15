package app.db.mysql.domain;



import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;
import core.framework.db.Column;
import core.framework.db.PrimaryKey;
import core.framework.db.Table;

import java.time.LocalDateTime;

/**
 * @author simple
 */
@Table(name = "productions")
public class Production {
    @PrimaryKey
    @Column(name = "id")
    public String id;

    @NotBlank
    @Column(name = "status")
    public Status status;

    @NotNull
    @Column(name = "price")
    public Double price;

    @Column(name = "updated_time")
    public LocalDateTime updateTime;

    @Column(name = "updated_By")
    public String updateBy;

    @NotNull
    @Column(name = "created_time")
    public LocalDateTime createdTime;

    @NotNull
    @Column(name = "created_By")
    public String createdBy;
}

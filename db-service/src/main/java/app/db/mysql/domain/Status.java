package app.db.mysql.domain;

import core.framework.api.json.Property;

/**
 * @author simple
 */
public enum Status {
    @Property(name = "active")
    ACTIVE,

    @Property(name = "unactive")
    UNACTIVE
}

package app.db.mongo.domain;

import core.framework.mongo.MongoEnumValue;

/**
 * @author simple
 */
public enum Status {
    @MongoEnumValue("active")
    ACTIVE,

    @MongoEnumValue("unactive")
    UNACTIVE
}

package app.customer.domain;

import core.framework.db.DBEnumValue;

/**
 * @author simple
 */
public enum Sex {
    @DBEnumValue("男")
    MAN,
    @DBEnumValue("女")
    WOMAN
}

package app.customer.api;

import core.framework.db.DBEnumValue;

/**
 * @author simple
 */
public enum CustomerSexView {
    @DBEnumValue("男")
    MAN,
    @DBEnumValue("女")
    WOMAN
}

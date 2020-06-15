package app.customer.api;

import core.framework.api.json.Property;
import core.framework.db.DBEnumValue;

/**
 * @author simple
 */
public enum CustomerSexView {
    @Property(name = "男")
    MAN,
    @Property(name = "女")
    WOMAN
}

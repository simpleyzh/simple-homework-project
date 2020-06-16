package app.customer.api;

import core.framework.api.json.Property;
import core.framework.db.DBEnumValue;

/**
 * @author simple
 */
public enum CustomerSexAJAXView {
    @Property(name = "male")
    MAN,
    @Property(name = "female")
    WOMAN
}

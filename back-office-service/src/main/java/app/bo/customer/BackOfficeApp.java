package app.bo.customer;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author simple
 */
public class BackOfficeApp extends App {
    @Override
    protected void initialize() {
//        load(new SystemModule("sys.properties"));
        load(new CustomerModule());
    }
}

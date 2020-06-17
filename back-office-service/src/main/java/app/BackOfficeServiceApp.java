package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author simple
 */
public class BackOfficeServiceApp extends App {
    @Override
    protected void initialize() {
//        load(new SystemModule("sys.properties"));
        loadProperties("app.properties");
        load(new CustomerModule());
        http().httpPort(8081);
    }
}

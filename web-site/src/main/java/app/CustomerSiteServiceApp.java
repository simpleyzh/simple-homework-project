package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @Author simple
 */
public class CustomerSiteServiceApp extends App {
    @Override
    protected void initialize() {
        http().httpPort(8082);
        load(new SystemModule("sys.properties"));
        load(new CustomerSiteModule());
    }
}

package app;

import app.customer.web.interceptor.CustomerInterceptor;
import core.framework.module.App;

/**
 * @Author simple
 */
public class WebSiteApp extends App {
    @Override
    protected void initialize() {
        http().httpPort(8082);
        http().intercept(bind(CustomerInterceptor.class));

//        load(new SystemModule("sys.properties"));
        loadProperties("app.properties");
        load(new CustomerModule());
    }
}

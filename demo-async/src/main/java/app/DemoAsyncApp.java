package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author simple
 */
public class DemoAsyncApp extends App {
    @Override
    protected void initialize() {
        http().httpPort(8080);
        load(new SystemModule("sys.properties"));
//        load(new JobModule());
//        load(new ExecutorModule());
        load(new ProductModule());
        load(new CustomerModule());
    }
}

package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author simple
 */
public class DBServiceApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
//        load(new MongoModule());
        load(new MysqlModule());
    }
}

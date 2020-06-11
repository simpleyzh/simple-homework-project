package app;

import core.framework.module.App;

/**
 * @author simple
 */
public class DemoMongoMigrationApp extends App {

    @Override
    protected void initialize() {
        load(new DemoModule());
    }
}

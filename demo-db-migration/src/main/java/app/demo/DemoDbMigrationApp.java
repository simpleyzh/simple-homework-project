package app.demo;

import core.framework.module.App;
import core.framework.module.DBConfig;


/**
 * @author simple
 */
public class DemoDbMigrationApp extends App {
    @Override
    protected void initialize() {
        DBConfig config = config(DBConfig.class);
        config.url("jdbc:mysql://localhost:3306/demo?verifyServerCertificate=false&useSSL=true");
        config.user("root");
        config.password("root");
        //load(new SystemModule("sys.properties"));
        load(new DemoModule());
    }
}

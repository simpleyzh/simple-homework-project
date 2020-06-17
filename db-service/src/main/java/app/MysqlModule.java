package app;

import app.db.mysql.domain.Production;
import app.db.mysql.service.ProductionService;
import core.framework.module.Module;

/**
 * @author simple
 */
public class MysqlModule extends Module {
    @Override
    protected void initialize() {
//        cache().local();
//        cache().remote(Production.class, Duration.ofSeconds(60));

        db().repository(Production.class);
        bind(ProductionService.class);
    }
}

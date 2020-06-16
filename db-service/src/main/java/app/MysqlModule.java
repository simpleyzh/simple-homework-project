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
        db().repository(Production.class);
        bind(ProductionService.class);

        ProductionService service = bean(ProductionService.class);
        service.insert();
        service.query();
        service.update();
        service.partialUpdate();
    }
}

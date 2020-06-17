package app.db;

import app.DBServiceApp;
import app.db.mysql.service.ProductionService;
import core.framework.test.module.AbstractTestModule;

/**
 * @author neo
 */
public class TestModule extends AbstractTestModule {
    @Override
    protected void initialize() {
        load(new DBServiceApp());
        initDB().createSchema();
        ProductionService service = bean(ProductionService.class);
//        service.insert();
        service.query();
        service.update();
        service.partialUpdate();
    }
}

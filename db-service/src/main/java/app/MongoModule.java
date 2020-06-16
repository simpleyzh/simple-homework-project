package app;

import app.db.mongo.domain.Production;
import app.db.mongo.service.ProductionService;
import core.framework.module.Module;
import core.framework.mongo.module.MongoConfig;

/**
 * @author simple
 */
public class MongoModule extends Module {
    @Override
    protected void initialize() {
        MongoConfig config = config(MongoConfig.class);
        config.uri(requiredProperty("sys.mongo.url"));
        config.collection(Production.class);

        bind(ProductionService.class);

        ProductionService service = bean(ProductionService.class);
        service.insert();
        service.query();
        service.replace();
        service.update();
    }
}

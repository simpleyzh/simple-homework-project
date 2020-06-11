package app;

import app.demo.domain.Production;
import app.demo.service.ProductionService;
import com.mongodb.client.model.Indexes;
import core.framework.module.Module;
import core.framework.mongo.Mongo;
import core.framework.mongo.module.MongoConfig;

/**
 * @author simple
 */
public class DemoModule extends Module {
    @Override
    protected void initialize() {
        MongoConfig config = config(MongoConfig.class);
        config.uri("mongodb://localhost:27017/test");
        config.collection(Production.class);
        bind(ProductionService.class);
        bean(Mongo.class).createIndex("productions", Indexes.ascending("price"));

        ProductionService bean = bean(ProductionService.class);

//        bean.insert();
//        bean.replace();
//        bean.query();
        bean.update();
    }
}

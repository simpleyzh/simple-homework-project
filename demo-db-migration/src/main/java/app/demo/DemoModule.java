package app.demo;

import app.demo.domain.Production;
import app.demo.service.ProductionService;

import core.framework.module.Module;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author simple
 */
public class DemoModule extends Module {
    private final Logger logger = LoggerFactory.getLogger(DemoModule.class);

    @Override
    protected void initialize() {
        db().repository(Production.class);
        bind(ProductionService.class);


        ProductionService service = bean(ProductionService.class);
//        service.query();
//        service.insert();
//        service.update();
//        service.partialUpdate();
        try {
            service.transaction();
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }

    }
}

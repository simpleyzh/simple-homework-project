package app;

import app.demo.demo.Brush;
import app.demo.demo.Painter;
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
        bind(Brush.class);
        bind(Painter.class);
        logger.info("UserModule init ....");

        Painter painter = bean(Painter.class);
        painter.draw();
    }
}

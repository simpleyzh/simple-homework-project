package app;

import app.demo.executor.PrintTime;
import core.framework.module.Module;

/**
 * @author simple
 */
public class ExecutorModule extends Module {
    @Override
    protected void initialize() {
        executor().add();
        PrintTime bind = bind(PrintTime.class);
        bind.print();
    }
}

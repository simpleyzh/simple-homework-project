package app;

import core.framework.module.App;

/**
 * @author simple
 */
public class UserServiceApp extends App {
    @Override
    protected void initialize() {
        load(new UserModule());
    }
}

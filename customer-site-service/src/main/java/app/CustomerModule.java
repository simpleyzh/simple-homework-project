package app;

import app.web.CustomerCotroller;
import core.framework.module.Module;
import static core.framework.http.HTTPMethod.GET;


/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        var controller = bind(CustomerCotroller.class);
        http().route(GET, "/customer/:id", controller::get);
    }
}

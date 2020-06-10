package app;

import app.user.demo.Brush;
import app.user.demo.Painter;
import app.user.domain.User;
import app.user.service.UserService;
import app.user.web.UserWebServiceImpl;
import core.framework.module.Module;

/**
 * @author simple
 */
public class UserModule extends Module {
    @Override
    protected void initialize() {
        bind(User.class);
        bind(UserService.class);
        bind(UserWebServiceImpl.class);
        bind(Brush.class);
        bind(Painter.class);
        System.out.println("UserModule init ....");

        Painter painter = bean(Painter.class);
        painter.draw();

        UserWebServiceImpl service = bean(UserWebServiceImpl.class);
        service.createUser();
        service.createUser();
    }
}

package app.user.web;

import app.user.service.UserService;
import core.framework.inject.Inject;

/**
 * @author simple
 */
public class UserWebServiceImpl {
    @Inject
    UserService userService;

    public void createUser() {
        userService.createUser();
    }

    public void printUser() {
        userService.printUser();
    }
}

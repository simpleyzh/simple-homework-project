package app.user.service;

import app.user.domain.User;
import core.framework.inject.Inject;

/**
 * @author simple
 */
public class UserService {
    @Inject
    User user;

    public void createUser() {
        user.age = 10;
        user.name = "simple";
        System.out.println("create user success!!");
    }

    public void printUser() {
        System.out.println(user.toString());
    }
}

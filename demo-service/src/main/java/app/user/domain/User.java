package app.user.domain;

/**
 * @author simple
 */
public class User {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

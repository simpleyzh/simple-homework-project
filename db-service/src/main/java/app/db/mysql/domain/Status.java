package app.db.mysql.domain;

/**
 * @author simple
 */
public enum Status {
    ACTIVE("active"), UNACTIVE("unactive");

    String name;

    Status(String name) {
        this.name = name;
    }

    public String value() {
        return this.name;
    }
}

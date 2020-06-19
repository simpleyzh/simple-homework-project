import com.mongodb.client.model.Indexes;
import core.framework.mongo.MongoMigration;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        MongoMigration mongoMigration = new MongoMigration("app.properties", "sys.mongo.adminURI");
        mongoMigration.migrate(mongo -> {
            mongo.runCommand(new Document().append("setParameter", 1).append("notablescan", 1));
        });

        mongoMigration = new MongoMigration("app.properties");

        mongoMigration.migrate(mongo -> {
            mongo.createIndex("books", Indexes.ascending("price", "name"));
//            mongo.createIndex("books", (Bson) new IndexOptions().background(true));
        });
    }
}

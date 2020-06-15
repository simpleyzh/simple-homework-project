package app.db.mongo.service;



import app.db.mongo.domain.Production;
import app.db.mongo.domain.Status;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import core.framework.inject.Inject;
import core.framework.mongo.MongoCollection;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author simple
 */
public class ProductionService {
    private final Logger logger = LoggerFactory.getLogger(ProductionService.class);
    @Inject
    MongoCollection<Production> mongo;

    public void insert() {
        Production production = new Production();
        production.id = UUID.randomUUID().toString();
        production.price = 299d;
        production.status = Status.UNACTIVE;
        production.createdTime = LocalDateTime.now();
        production.createdBy = "ProductionService";
        production.updateTime = LocalDateTime.now();
        production.updateBy = "";
        mongo.insert(production);
    }

    public void update() {
        mongo.update(Filters.eq("_id", "9ba13744-7e01-4ca2-9ebd-da983c5ac8ed"),
            Updates.combine(Updates.set("price", 233333d),
                Updates.set("status", "yes")));
    }


    public void query() {
        logger.info(String.valueOf(mongo.findOne(new Document().append("status", "active"))));
    }

    public void replace() {
        Production production = new Production();
        production.id = "9ba13744-7e01-4ca2-9ebd-da983c5ac8ed";
        production.price = 3666d;
        production.status = Status.ACTIVE;
        production.updateBy = "ProductionService";
        production.createdTime = LocalDateTime.now();
        production.createdBy = "ProductionService";
        production.updateTime = LocalDateTime.now();
        mongo.replace(production);
    }

}

package app.demo.service;

import app.demo.domain.Production;
import app.demo.domain.Status;
import core.framework.db.Database;
import core.framework.db.Repository;
import core.framework.db.Transaction;
import core.framework.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

/**
 * @author simple
 */
public class ProductionService {
    private final Logger logger = LoggerFactory.getLogger(ProductionService.class);
    @Inject
    Repository<Production> repository;
    @Inject
    Database database;

    public void insert() {
        Production production = new Production();
        production.id = UUID.randomUUID().toString();
        production.price = 299d;
        production.status = Status.UNACTIVE.value();
        production.createdTime = LocalDateTime.now();
        production.createdBy = "ProductionService";
        production.updateTime = LocalDateTime.now();
        production.updateBy = "";
        repository.insert(production);
    }

    public void update() {
        Production production = new Production();
        production.id = "6c53152f-4eda-42f6-b584-ec3469e144e2";
        production.price = 299d;
        production.status = Status.ACTIVE.value();
        production.updateBy = "ProductionService";
        production.createdTime = LocalDateTime.now();
        production.createdBy = "ProductionService";
        production.updateTime = LocalDateTime.now();
        repository.update(production);
    }

    public void partialUpdate() {
        Production production = new Production();
        production.id = "6c53152f-4eda-42f6-b584-ec3469e144e2";
        production.price = 333d;
        production.createdTime = LocalDateTime.now();
        production.createdBy = "ProductionService";
        production.updateBy = "ProductionService";
        production.updateTime = LocalDateTime.now();
        repository.partialUpdate(production);
    }

    public void query() {
        Optional<Production> production = repository.selectOne("id = ?", "6c53152f-4eda-42f6-b584-ec3469e144e2");
        logger.info(String.valueOf(production.stream().iterator().next()));
    }

    public void replace() {

    }

    public void transaction() throws Exception {
        try (Transaction transaction = database.beginTransaction()) {
            int flag = 0;
            for (int i = 0; i < 5; i++) {
                insert();
                flag = 1;
            }
            if (flag == 1) {
                throw new Exception("exception");
            }
            transaction.commit();
        }
    }
}

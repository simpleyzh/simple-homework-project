CREATE TABLE IF NOT EXISTS `books` (
    `id`      INT           NOT NULL,
    `name`    VARCHAR(30)   NOT NULL,
    `author`  VARCHAR(30)   NOT NUll,
    `price`   DECIMAL       NOT NULL,
    `type`    VARCHAR(30)   NOT NULL,
    PRIMARY KEY (`id`)
);

--INSERT IGNORE INTO `books` VALUES("1", "books1", "barde", 299, "romance");

SELECT COUNT(*) INTO @index FROM information_schema.`COLUMNS` WHERE table_schema=DATABASE() AND column_name='type' AND table_name='books';
SET @SQL=IF(@index<1,'ALTER TABLE `books` ADD COLUMN type VARCHAR(100) AFTER `price`','select \'Exist Column\';');
PREPARE statement FROM @SQL;
EXECUTE statement;
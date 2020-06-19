CREATE TABLE IF NOT EXISTS `phone` (
    `id`      INT           NOT NULL,
    `name`    VARCHAR(30)   NOT NULL,
    `memory`  VARCHAR(30)   NOT NUll,
    `price`   DECIMAL       NOT NULL,
    PRIMARY KEY (`id`)
);
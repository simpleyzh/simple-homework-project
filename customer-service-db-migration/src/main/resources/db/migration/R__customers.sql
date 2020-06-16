CREATE TABLE IF NOT EXISTS `customers` (
  `id`           VARCHAR(50)                 NOT NULL,
  `name`         VARCHAR(20)                 NOT NULL,
  `age`          INT                         NOT NULL,
  `email`        VARCHAR(20)                 NOT NULL,
  `gender`       VARCHAR(10)                 NOT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB;
CREATE TABLE IF NOT EXISTS `productions` (
  `id`           VARCHAR(50)                 NOT NULL,
  `status`       VARCHAR(20)                 NOT NULL,
  `price`        DECIMAL                     NOT NULL,
  `created_time` TIMESTAMP                   NOT NULL,
  `updated_time` TIMESTAMP,
  `created_by`   VARCHAR(50)                 NOT NULL,
  `updated_by`   VARCHAR(50),
  PRIMARY KEY (`id`)
)ENGINE=InnoDB;

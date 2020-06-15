CREATE TABLE IF NOT EXISTS `customers` (
  `id`           VARCHAR(50)                 NOT NULL,
  `name`         VARCHAR(20)                 NOT NULL,
  `age`          INT                         NOT NULL,
  `email`        VARCHAR(20)                 NOT NULL,
  `sex`          VARCHAR(4)                  NOT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '消费者表';
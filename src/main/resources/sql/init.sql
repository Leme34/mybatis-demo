CREATE TABLE `test_one` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;



CREATE TABLE `test_two` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) NOT NULL,
  `one_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `test_two_ibfk_1` (`one_id`),
  CONSTRAINT `test_two_ibfk_1` FOREIGN KEY (`one_id`) REFERENCES `test_one` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


INSERT INTO `mybatis_one2many`.`test_one`(`id`, `nickname`) VALUES (1, 'one1');
INSERT INTO `mybatis_one2many`.`test_one`(`id`, `nickname`) VALUES (2, 'one2');


INSERT INTO `mybatis_one2many`.`test_two`(`id`, `nickname`, `one_id`) VALUES (1, 'two1', 1);
INSERT INTO `mybatis_one2many`.`test_two`(`id`, `nickname`, `one_id`) VALUES (2, 'two2', 1);
INSERT INTO `mybatis_one2many`.`test_two`(`id`, `nickname`, `one_id`) VALUES (3, 'two3', 1);
INSERT INTO `mybatis_one2many`.`test_two`(`id`, `nickname`, `one_id`) VALUES (4, 'two4', 2);
INSERT INTO `mybatis_one2many`.`test_two`(`id`, `nickname`, `one_id`) VALUES (5, 'two5', 2);

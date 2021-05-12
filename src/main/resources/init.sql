CREATE DATABASE IF NOT EXISTS bankdb;
USE bankdb;
CREATE TABLE `transaction` (
  `id` bigint NOT NULL,
  `account_number` bigint DEFAULT NULL,
  `amount` decimal(19,2) DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `merchant_logo` varchar(255) DEFAULT NULL,
  `merchant_name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `transaction` VALUES
(1,100,5.00,'USD','2021-05-08','nike.png','nike','cr'),
(2,100,10.00,'USD','2021-05-08','t.logo','nike','cr'),
(3,100,5.00,'USD','2021-05-08','nike.png','nike','cr'),
(4,100,10.00,'USD','2021-05-08','t.logo','nike','cr'),
(5,100,5.00,'USD','2021-05-08','nike.png','nike','cr'),
(6,100,10.00,'USD','2021-05-08','t.logo','nike','cr'),
(7,100,5.00,'USD','2021-05-08','nike.png','nike','cr'),
(8,100,10.00,'USD','2021-05-08','t.logo','nike','cr'),
(9,100,5.00,'USD','2021-05-08','nike.png','nike','cr'),
(10,100,10.00,'USD','2021-05-08','t.logo','nike','cr');
CREATE TABLE `agencia`.`hotel` (
  `id_hotel` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(255) NOT NULL,
  `categoria` VARCHAR(255) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `disponible` TINYINT NOT NULL,
  PRIMARY KEY (`id_hotel`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;
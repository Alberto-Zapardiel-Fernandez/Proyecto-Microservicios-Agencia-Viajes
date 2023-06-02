CREATE TABLE `agencia`.`vuelos` (
  `id_vuelo` INT NOT NULL AUTO_INCREMENT,
  `compania` VARCHAR(255) NOT NULL,
  `fecha_vuelo` DATETIME NOT NULL,
  `precio` DOUBLE NOT NULL,
  `plazas` INT NOT NULL,
  PRIMARY KEY (`id_vuelo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;
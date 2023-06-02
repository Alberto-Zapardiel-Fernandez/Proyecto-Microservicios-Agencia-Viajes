CREATE TABLE `agencia`.`reserva` (
  `id_reserva` INT NOT NULL AUTO_INCREMENT,
  `nombre_cliente` VARCHAR(255) NOT NULL,
  `dni` VARCHAR(9) NOT NULL,
  `id_hotel` INT NOT NULL,
  `id_vuelo` INT NOT NULL,
  PRIMARY KEY (`id_reserva`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;
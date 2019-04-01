-- MySQL Script generated by MySQL Workbench
-- Thu Mar 14 10:35:35 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema securepay
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema securepay
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `securepay` DEFAULT CHARACTER SET utf8 ;
USE `securepay` ;

-- -----------------------------------------------------
-- Table `securepay`.`wallet`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securepay`.`walletsecure` ;

CREATE TABLE IF NOT EXISTS `securepay`.`walletsecure` (
  `wallet_id` BIGINT NOT NULL AUTO_INCREMENT,
  `wallet_address` VARCHAR(255) NOT NULL,
  `private_key` VARCHAR(255) NOT NULL,
  `create_time` DATETIME NULL,
  `create_user` VARCHAR(30) NULL,
  `update_time` DATETIME NULL,
  `update_user` VARCHAR(30) NULL,
  PRIMARY KEY (`wallet_id`),
  UNIQUE INDEX `wallet_address_UNIQUE` (`wallet_address` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `securepay`.`clientsecure`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securepay`.`clientsecure` ;

CREATE TABLE IF NOT EXISTS `securepay`.`clientsecure` (
  `client_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `organization_id` VARCHAR(45) NOT NULL,
  `client_name` VARCHAR(127) NOT NULL,
  `contact_email` VARCHAR(255) NOT NULL,
  `wallet_id` BIGINT UNSIGNED NOT NULL,
  `user_initial_coin` INT UNSIGNED NULL,
  `recognise_coin` INT UNSIGNED NOT NULL,
  `coin_reset_interval` VARCHAR(10) NULL,
  `coin_reset_type` VARCHAR(50) NULL,
  `delete_type` VARCHAR(50) NULL,
  `create_user` VARCHAR(30) NULL,
  `create_time` DATETIME NULL,
  `update_user` VARCHAR(30) NULL,
  `update_time` DATETIME NULL,
  PRIMARY KEY (`client_id`),
  UNIQUE INDEX `organization_id_UNIQUE` (`organization_id` ASC),
  INDEX `client_wallet_id_fk` (`wallet_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `securepay`.`usersecure`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securepay`.`usersecure` ;

CREATE TABLE IF NOT EXISTS `securepay`.`usersecure` (
  `user_id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `client_id` INT UNSIGNED NOT NULL,
  `wallet_id` BIGINT UNSIGNED NULL,
  `role_type` VARCHAR(50) NULL,
  `delete_type` VARCHAR(50) NULL,
  `create_user` VARCHAR(30) NULL,
  `create_time` DATETIME NULL,
  `update_user` VARCHAR(30) NULL,
  `update_time` DATETIME NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_client_id_UNIQUE` (`client_id` ASC),
  INDEX `user_client_id_fk` (`client_id` ASC),
  INDEX `user_wallet_id_fk` (`wallet_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `securepay`.`recognisesecure`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securepay`.`recognisesecure` ;

CREATE TABLE IF NOT EXISTS `securepay`.`recognisesecure` (
  `recognise_id` VARCHAR(30) NOT NULL,
  `sender_user_id` BIGINT UNSIGNED NOT NULL,
  `recipient_user_id` BIGINT UNSIGNED NOT NULL,
  `behavior_id` BIGINT UNSIGNED NOT NULL,
  `recognise_coin` INT UNSIGNED NULL,
  `message` TEXT NULL,
  `create_user` VARCHAR(30) NULL,
  `create_time` DATETIME NULL,
  `update_user` VARCHAR(30) NULL,
  `update_time` DATETIME NULL,
  PRIMARY KEY (`recognise_id`),
  INDEX `recognise_sender_user_id_fk` (`sender_user_id` ASC),
  INDEX `recognise_recipient_user_id_fk` (`recipient_user_id` ASC),
  INDEX `recognize_behavior_id_fk` (`behavior_id` ASC))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `securepay`.`redeemsecure`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securepay`.`redeemsecure` ;

CREATE TABLE IF NOT EXISTS `securepay`.`redeemsecure` (
  `redeem_id` VARCHAR(30) NOT NULL,
  `user_id` BIGINT UNSIGNED NOT NULL,
  `product_id` BIGINT UNSIGNED NOT NULL,
  `redeem_coin` INT UNSIGNED NULL,
  `status_type` VARCHAR(50) NULL,
  `create_user` VARCHAR(30) NULL,
  `create_time` DATETIME NULL,
  `update_user` VARCHAR(30) NULL,
  `update_time` DATETIME NULL,
  PRIMARY KEY (`redeem_id`),
  INDEX `redeem_user_id_fk` (`user_id` ASC),
  INDEX `redeem_product_id_fk` (`product_id` ASC))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `securepay`.`behaviorsecure`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securepay`.`behaviorsecure` ;

CREATE TABLE IF NOT EXISTS `securepay`.`behaviorsecure` (
  `behavior_id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `client_id` INT UNSIGNED NOT NULL,
  `category_name` VARCHAR(45) NOT NULL,
  `subcategory_name` VARCHAR(127) NULL,
  `delete_type` VARCHAR(50) NULL,
  `create_user` VARCHAR(30) NULL,
  `create_time` DATETIME NULL,
  `update_user` VARCHAR(30) NULL,
  `update_time` DATETIME NULL,
  PRIMARY KEY (`behavior_id`),
  INDEX `behavior_client_id_fk` (`client_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `securepay`.`transaction_logsecure`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `securepay`.`transaction_logsecure` ;

CREATE TABLE IF NOT EXISTS `securepay`.`transaction_logsecure` (
  `transaction_id` VARCHAR(255) NOT NULL,
  `from_wallet_id` BIGINT NOT NULL,
  `to_wallet_id` BIGINT NOT NULL,
  `asset_name` VARCHAR(50) NOT NULL,
  `asset_qty` INT NOT NULL,
  `create_time` DATETIME NULL,
  `create_user` VARCHAR(30) NULL,
  PRIMARY KEY (`transaction_id`),
  INDEX `transactions_from_wallet_id_fk` (`from_wallet_id` ASC),
  INDEX `transactions_to_wallet_id_fk` (`to_wallet_id` ASC))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
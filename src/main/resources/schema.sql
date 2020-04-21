CREATE SCHEMA IF NOT EXISTS `patientregsys` DEFAULT CHARACTER SET utf8 ;
USE `patientregsys` ;

CREATE TABLE IF NOT EXISTS `patientregsys`.`Patient` (
  `Patientcol_ID` INT NOT NULL AUTO_INCREMENT,
  `Patientcol_name` VARCHAR(45) NOT NULL,
  `Patientcol_surname` VARCHAR(45) NOT NULL,
  `Patientcol_otchestvo` VARCHAR(45) NULL,
  `Patientcol_sex` ENUM('man', 'woman') NOT NULL,
  `Patientcol_dateOfBirth` DATE NULL,
  `Patientcol_post` VARCHAR(45) NULL,
  `Patientcol_pasportData` TEXT NULL,
  `Patientcol_numberMedPolis` TEXT NULL,
  `Patientcol_dateOutPolis` DATE NULL,
  `Patientcol_address` TEXT NULL,
  `Patientcol_phone` VARCHAR(13) NULL,
  `Patientcol_email` VARCHAR(45) NULL,
  `Patientcol_alergies` TEXT NULL,
  `Patientcol_discription` TEXT NULL,
  PRIMARY KEY (`Patientcol_ID`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `patientregsys`.`PositionBuild` (
  `PositionBuildcol_Id` INT NOT NULL AUTO_INCREMENT,
  `PositionBuildcol_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`PositionBuildcol_Id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `patientregsys`.`Doctor` (
  `Doctorcol_ID` INT NOT NULL AUTO_INCREMENT,
  `Doctorcol_name` VARCHAR(45) NOT NULL,
  `Doctorcol_surname` VARCHAR(45) NOT NULL,
  `Doctorcol_otchestvo` VARCHAR(45) NULL,
  `Doctorcol_dateOfBirth` DATE NULL,
  `Doctorcol_discription` TEXT NULL,
  `Doctorcol_specialnost` VARCHAR(45) NOT NULL,
  `Doctorcol_university` VARCHAR(45) NULL,
  `Doctorcol_address` TEXT NULL,
  `Doctorcol_phone` VARCHAR(13) NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `type` VARCHAR(45) NOT NULL DEFAULT 'doctor' COMMENT 'doctor - for doctors\n admin - for administator of sistem',
  PRIMARY KEY (`Doctorcol_ID`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `patientregsys`.`status` (
  `statuscol_ID` INT NOT NULL AUTO_INCREMENT,
  `statuscol_name` VARCHAR(45) NOT NULL,
  `statuscol_description` TEXT NULL,
  PRIMARY KEY (`statuscol_ID`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `patientregsys`.`MedicalSession` (
  `MedicalSessioncol_ID` INT NOT NULL AUTO_INCREMENT,
  `Patient_Patientcol_ID` INT NULL,
  `MedicalSessioncol_dateRegistration` DATETIME NOT NULL,
  `MedicalSessioncol_dateRegistrationDown` DATE NULL,
  `MedicalSessioncol_diagnoz` LONGTEXT NULL,
  `MedicalSessioncol_medicaments` TEXT NULL,
  `MedicalSessioncol_discriptions` LONGTEXT NULL,
  `MedicalSessioncol_positionfloor` INT NULL,
  `MedicalSessioncol_possitionward` INT NULL,
  `MedicalSessioncol__possitionbad` INT NULL,
  `PositionBuild_PositionBuildcol_Id` INT NULL,
  `Doctor_Doctorcol_ID` INT NOT NULL,
  `status_statuscol_ID` INT NOT NULL,
  PRIMARY KEY (`MedicalSessioncol_ID`),
  CONSTRAINT `fk_MedicalSession_Patient`
    FOREIGN KEY (`Patient_Patientcol_ID`)
    REFERENCES `patientregsys`.`Patient` (`Patientcol_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MedicalSession_PositionBuild1`
    FOREIGN KEY (`PositionBuild_PositionBuildcol_Id`)
    REFERENCES `patientregsys`.`PositionBuild` (`PositionBuildcol_Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MedicalSession_Doctor1`
    FOREIGN KEY (`Doctor_Doctorcol_ID`)
    REFERENCES `patientregsys`.`Doctor` (`Doctorcol_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MedicalSession_status1`
    FOREIGN KEY (`status_statuscol_ID`)
    REFERENCES `patientregsys`.`status` (`statuscol_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

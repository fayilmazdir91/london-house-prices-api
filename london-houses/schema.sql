CREATE TABLE `data`.`london_houses` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `PROPERTY_NAME` VARCHAR(45) NULL,
  `PRICE` INT NULL,
  `HOUSE_TYPE` VARCHAR(45) NULL,
  `AREA_IN_SQ_FT` BIGINT NULL,
  `NO_OF_BEDROOMS` INT NULL,
  `NO_OF_BATHROOMS` INT NULL,
  `NO_OF_RECEPTIONS` INT NULL,
  `LOCATION` VARCHAR(45) NULL,
  `CITYCOUNTY` VARCHAR(45) NULL,
  `POSTAL_CODE` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`));

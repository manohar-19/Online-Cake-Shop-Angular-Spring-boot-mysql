-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: cake
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `custId` int NOT NULL AUTO_INCREMENT,
  `custName` varchar(45) NOT NULL,
  `custDob` varchar(10) NOT NULL,
  `custUserName` varchar(45) NOT NULL,
  `custPassword` varchar(45) NOT NULL,
  `custPhone` varchar(10) NOT NULL,
  `custEmail` varchar(45) NOT NULL,
  `custAddress` varchar(255) NOT NULL,
  `securityQuestion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`custId`),
  UNIQUE KEY `custUserName_UNIQUE` (`custUserName`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Manohar','1999-08-08','manu','1234','8543789573','manu@gmail.com','Davangere','red'),(2,'Chandu M','2000-05-06','chandu','1234','8867957745','chandu@gmail.com','Kadur',NULL),(8,'roidan','1999-10-10','roidan','1234','887579975','roidan@gmail.com','Bangalore',NULL),(28,'aftab','1999-10-15','aftab','1234','99999','aftab@gmail.com','bgm',NULL),(54,'vasu','2021-11-09','vasu','1234','46543534','vasu@gmail.com','rnr',NULL),(55,'vedhanth','2021-11-17','ved','1234','9746293876','ved@gmail.com','dvg',NULL),(58,'manu','1999-09-08','manohar','5678','765472341','manu@gmail.com','Davangere',NULL),(59,'Deepanjali M P','1999-08-05','deepu','1234','8762727421','deepanjali.masarur.p@gmail.com','Lalitha krupa, A block, 7th cross, Sharavathi nagar, Davangere',NULL),(60,'Vasu','1999-12-06','vasumsv','1234','7090167375','contact@iamvasu.in','dvg',NULL),(61,'Shilpa','1996-02-21','shilpa','1234','9498373927','shilpa@gmail.com','nittuvalli Davangere 577004',NULL),(62,'Deeksha','2007-03-12','deeksha','1234','8762727421','deeksha@gmail.com','shimoga ',NULL),(63,'Divya patel','1999-10-04','Divu','4444','7865345678','div@gmail.com','Bangalore','black'),(64,'chinmay','1996-02-21','chinmay','1234','9837459834','chin@gmail.com','Davangere','brown'),(65,'Harshith','1999-03-26','h4rsh','1234','9742890380','harshithprasad@protonmail.com','No. 20, Maruthinagar 1st Cross Road, Nagarbhavi Main Road, Bengaluru 560072','blue'),(66,'rashmi','2000-02-20','rash123','pink','8660510906','rash@gmail.com','dwarakanagar','blue');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-26 18:07:44

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
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `orderId` int NOT NULL AUTO_INCREMENT,
  `orderDate` varchar(20) NOT NULL,
  `custId` int NOT NULL,
  `total` int NOT NULL,
  PRIMARY KEY (`orderId`),
  KEY `custId` (`custId`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`custId`) REFERENCES `customer` (`custId`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (79,'2021-11-21',58,1100),(80,'2021-11-21',1,2197),(81,'2021-11-21',58,1199),(82,'2021-11-21',61,1098),(83,'2021-11-21',61,0),(84,'2021-11-21',1,2596),(85,'2021-11-21',1,2098),(86,'2021-11-22',62,1298),(87,'2021-11-22',1,2347),(89,'2021-11-22',1,2897),(90,'2021-11-22',58,0),(91,'2021-11-23',1,1499),(92,'2021-11-23',1,0),(93,'2021-11-23',1,0),(94,'2021-11-23',58,3646),(95,'2021-11-23',1,3594),(96,'2021-11-23',1,1298),(97,'2021-11-23',1,1298),(98,'2021-11-23',1,998),(99,'2021-11-23',1,3496),(100,'2021-11-23',1,1298),(101,'2021-11-23',1,998),(102,'2021-11-23',1,0),(103,'2021-11-23',1,998),(104,'2021-11-23',1,0),(105,'2021-11-23',1,998),(106,'2021-11-23',1,0),(107,'2021-11-23',58,998),(108,'2021-11-23',58,0),(109,'2021-11-23',1,0),(110,'2021-11-23',1,0),(111,'2021-11-23',1,0),(112,'2021-11-23',1,0),(113,'2021-11-23',63,2299),(114,'2021-11-23',63,0),(115,'2021-11-23',63,0),(116,'2021-11-23',1,0),(117,'2021-11-23',1,0),(118,'2021-11-23',1,0),(119,'2021-11-23',1,0),(120,'2021-11-23',1,1098),(121,'2021-11-23',1,0),(122,'2021-11-23',1,0),(123,'2021-11-23',1,1298),(124,'2021-11-23',58,2798),(125,'2021-11-23',58,0),(126,'2021-11-23',1,0),(127,'2021-11-23',1,0),(128,'2021-11-24',1,0),(129,'2021-11-24',1,0),(130,'2021-11-24',54,0),(131,'2021-11-24',65,0),(132,'2021-11-24',1,1298),(133,'2021-11-24',1,0),(134,'2021-11-24',63,0),(135,'2021-11-24',1,0),(136,'2021-11-24',1,0),(137,'2021-11-25',1,3094),(138,'2021-11-25',66,4494),(139,'2021-11-25',66,0),(140,'2021-11-26',1,0);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-26 18:07:46
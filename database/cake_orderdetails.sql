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
-- Table structure for table `orderdetails`
--

DROP TABLE IF EXISTS `orderdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderdetails` (
  `orderId` int NOT NULL,
  `prodId` int NOT NULL,
  `custId` int NOT NULL,
  `orderQuantity` int NOT NULL,
  `orderPrice` int NOT NULL,
  `message` varchar(200) DEFAULT NULL,
  KEY `custId` (`custId`),
  KEY `orderdetails_ibfk_1_idx` (`prodId`),
  CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`prodId`) REFERENCES `products` (`ProdId`),
  CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`custId`) REFERENCES `customer` (`custId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetails`
--

LOCK TABLES `orderdetails` WRITE;
/*!40000 ALTER TABLE `orderdetails` DISABLE KEYS */;
INSERT INTO `orderdetails` VALUES (80,3,1,1,998,'happy Birthday'),(80,10,1,1,1199,'happy Birthday'),(81,10,58,1,1199,'happy Birthday'),(82,1,61,1,1098,'happy Birthday'),(84,2,1,1,1298,'happy Birthday'),(84,2,1,1,1298,'happy Birthday'),(85,1,1,1,1098,'happy Birthday'),(85,15,1,1,1000,'happy Birthday'),(86,2,62,1,1298,'happy Birthday'),(87,1,1,1,1098,'happy Birthday'),(87,17,1,1,1249,'happy Birthday'),(89,5,1,1,1599,'happy Birthday'),(89,2,1,1,1298,'happy Birthday'),(91,7,1,1,1499,'happy Birthday'),(94,1,58,1,1098,'happy Birthday'),(94,2,58,1,1298,'happy Birthday'),(94,11,58,1,1250,'happy Birthday'),(95,1,1,1,1098,'happy Birthday'),(95,4,1,1,1498,'happy Birthday'),(95,3,1,1,998,'happy Birthday'),(96,2,1,1,1298,'happy Birthday'),(97,2,1,1,1298,'happy Birthday'),(98,6,1,1,998,'happy Birthday'),(98,3,1,1,998,'happy Birthday'),(99,3,1,1,998,'happy Birthday'),(99,3,1,1,998,'happy Birthday'),(99,16,1,1,1500,'happy Birthday'),(100,2,1,1,1298,'happy Birthday'),(101,6,1,1,998,'happy Birthday'),(103,3,1,1,998,'happy Birthday'),(105,6,1,1,998,'happy Birthday'),(107,3,58,1,998,'happy Birthday'),(113,10,63,1,1199,'happy Birthday'),(113,12,63,1,1100,'happy Birthday'),(120,1,1,1,1098,'happy Birthday'),(123,2,1,1,1298,'happy Birthday'),(124,10,58,1,1199,'happy Birthday'),(124,5,58,1,1599,'happy Birthday'),(132,2,1,1,1298,'happy Birthday'),(137,1,1,1,1098,'happy Birthday'),(137,3,1,2,1996,'happy Birthday'),(138,4,66,3,4494,'happy Birthday');
/*!40000 ALTER TABLE `orderdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-26 18:07:45

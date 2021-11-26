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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `ProdId` int NOT NULL AUTO_INCREMENT,
  `ProdName` varchar(100) NOT NULL,
  `pricePerkg` int NOT NULL,
  `description` varchar(400) DEFAULT NULL,
  `catId` int NOT NULL,
  `image` varchar(200) NOT NULL,
  PRIMARY KEY (`ProdId`),
  KEY `catId_idx` (`catId`),
  CONSTRAINT `catId` FOREIGN KEY (`catId`) REFERENCES `category` (`catId`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'black Forest cake',1098,'Black forest cake needs no introduction. A most-sought-after, this indulgent pick is sure to open the gateway of the sweetest symphony that is so well-embellished with chocolate shavings, fresh whipped cream with cherries on top. Don\'t hold up any longer, cut the right forest with us, no matter if it is a birthday, anniversary or a promotion party.',1,'../../assets/images/prod/1.png'),(2,'Dainty Black Forest Cake',1298,'Black forest cake needs no introduction. A most-sought-after, this indulgent pick is sure to open the gateway of the sweetest symphony that is so well-embellished with chocolate shavings, fresh whipped cream with cherries on top. Don\'t hold up any longer, cut the right forest with us, no matter if it is a birthday, anniversary or a promotion party.',1,'../../assets/images/prod/2.png'),(3,'Black Forest Gateau',998,'Black forest cake needs no introduction. A most-sought-after, this indulgent pick is sure to open the gateway of the sweetest symphony that is so well-embellished with chocolate shavings, fresh whipped cream with cherries on top. Don\'t hold up any longer, cut the right forest with us, no matter if it is a birthday, anniversary or a promotion party.',1,'../../assets/images/prod/3.png'),(4,'Luxuriant Black Forest Cake',1498,'Black forest cake needs no introduction. A most-sought-after, this indulgent pick is sure to open the gateway of the sweetest symphony that is so well-embellished with chocolate shavings, fresh whipped cream with cherries on top. Don\'t hold up any longer, cut the right forest with us, no matter if it is a birthday, anniversary or a promotion party.',1,'../../assets/images/prod/4.png'),(5,'Black Forest Pinata Cake',1599,'Black forest cake needs no introduction. A most-sought-after, this indulgent pick is sure to open the gateway of the sweetest symphony that is so well-embellished with chocolate shavings, fresh whipped cream with cherries on top. Don\'t hold up any longer, cut the right forest with us, no matter if it is a birthday, anniversary or a promotion party.',1,'../../assets/images/prod/5.png'),(6,'Delectable Black Forest Treat',998,'Black forest cake needs no introduction. A most-sought-after, this indulgent pick is sure to open the gateway of the sweetest symphony that is so well-embellished with chocolate shavings, fresh whipped cream with cherries on top. Don\'t hold up any longer, cut the right forest with us, no matter if it is a birthday, anniversary or a promotion party.',1,'../../assets/images/prod/6.png'),(7,'Chocolicious Black Forest Gateau',1499,'Black forest cake needs no introduction. A most-sought-after, this indulgent pick is sure to open the gateway of the sweetest symphony that is so well-embellished with chocolate shavings, fresh whipped cream with cherries on top. Don\'t hold up any longer, cut the right forest with us, no matter if it is a birthday, anniversary or a promotion party.',1,'../../assets/images/prod/7.png'),(8,'Heart-Shape Black Forest Cake',1199,'Black forest cake needs no introduction. A most-sought-after, this indulgent pick is sure to open the gateway of the sweetest symphony that is so well-embellished with chocolate shavings, fresh whipped cream with cherries on top. Don\'t hold up any longer, cut the right forest with us, no matter if it is a birthday, anniversary or a promotion party.',1,'../../assets/images/prod/8.png'),(10,'Satiating Butterscotch Cake',1199,'A most requested pick, Butterscotch cakes are the ones to die for. Crunchy chunks of butterscotch, this deliciousness is perfectly enveloped in caramel drizzle, white chocolate, and butterscotch ganache. Relished by all age groups, this beauty has been topping the charts with its flavorsome nougat and nutty bites. Don\'t just keep dreaming about it, order a butterscotch beauty right away!',2,'../../assets/images/cat2/satiating-butterscotch-cake -b.jpg'),(11,'Simply Sinful Butterscotch Cake',1250,'A most requested pick, Butterscotch cakes are the ones to die for. Crunchy chunks of butterscotch, this deliciousness is perfectly enveloped in caramel drizzle, white chocolate, and butterscotch ganache. Relished by all age groups, this beauty has been topping the charts with its flavorsome nougat and nutty bites. Don\'t just keep dreaming about it, order a butterscotch beauty right away!',2,'../../assets/images/cat2/simply-sinful-butterscotch-cake-9871050ca-A_0.jpg'),(12,'Savory Butterscotch Cake',1100,'A most requested pick, Butterscotch cakes are the ones to die for. Crunchy chunks of butterscotch, this deliciousness is perfectly enveloped in caramel drizzle, white chocolate, and butterscotch ganache. Relished by all age groups, this beauty has been topping the charts with its flavorsome nougat and nutty bites. Don\'t just keep dreaming about it, order a butterscotch beauty right away!',2,'../../assets/images/cat2/savory butterscotch.jpg'),(13,'Butterscotch Hazelnut Mix',1250,'A most requested pick, Butterscotch cakes are the ones to die for. Crunchy chunks of butterscotch, this deliciousness is perfectly enveloped in caramel drizzle, white chocolate, and butterscotch ganache. Relished by all age groups, this beauty has been topping the charts with its flavorsome nougat and nutty bites. Don\'t just keep dreaming about it, order a butterscotch beauty right away!',2,'../../assets/images/cat2/butterscotch-hazelnut-mix-a.jpg'),(14,'Butterscotch Cake',1100,'A most requested pick, Butterscotch cakes are the ones to die for. Crunchy chunks of butterscotch, this deliciousness is perfectly enveloped in caramel drizzle, white chocolate, and butterscotch ganache. Relished by all age groups, this beauty has been topping the charts with its flavorsome nougat and nutty bites. Don\'t just keep dreaming about it, order a butterscotch beauty right away!',2,'../../assets/images/cat2/butterscotch-cake.jpg'),(15,'Butterscotch Reverie',1000,'A most requested pick, Butterscotch cakes are the ones to die for. Crunchy chunks of butterscotch, this deliciousness is perfectly enveloped in caramel drizzle, white chocolate, and butterscotch ganache. Relished by all age groups, this beauty has been topping the charts with its flavorsome nougat and nutty bites. Don\'t just keep dreaming about it, order a butterscotch beauty right away!',2,'../../assets/images/cat2/butterscotch-reverie-a.jpg'),(16,'Flavorsome Love',1500,'A most requested pick, Butterscotch cakes are the ones to die for. Crunchy chunks of butterscotch, this deliciousness is perfectly enveloped in caramel drizzle, white chocolate, and butterscotch ganache. Relished by all age groups, this beauty has been topping the charts with its flavorsome nougat and nutty bites. Don\'t just keep dreaming about it, order a butterscotch beauty right away!',2,'../../assets/images/cat2/flavorsome-love-a_0.jpg'),(17,'Choco-Butterscotch Treat',1249,'A most requested pick, Butterscotch cakes are the ones to die for. Crunchy chunks of butterscotch, this deliciousness is perfectly enveloped in caramel drizzle, white chocolate, and butterscotch ganache. Relished by all age groups, this beauty has been topping the charts with its flavorsome nougat and nutty bites. Don\'t just keep dreaming about it, order a butterscotch beauty right away!',2,'../../assets/images/cat2/choco-butterscotch-treat-a.jpg');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
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

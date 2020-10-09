-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: bdcityclinics
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
-- Table structure for table `clinica`
--

DROP TABLE IF EXISTS `clinica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clinica` (
  `Id` bigint NOT NULL AUTO_INCREMENT,
  `HorarioMedico` varchar(255) DEFAULT NULL,
  `aberta` bit(1) NOT NULL,
  `convenio` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `dadosClinicos` varchar(255) DEFAULT NULL,
  `dataConsulta` datetime DEFAULT NULL,
  `dataDeCadastro` date DEFAULT NULL,
  `dataNascimento` datetime DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `finalizada` bit(1) NOT NULL,
  `horarioFuncionamento` varchar(255) DEFAULT NULL,
  `idade` int NOT NULL,
  `imagemClinica` varchar(255) DEFAULT NULL,
  `imagemMedico` varchar(255) DEFAULT NULL,
  `nomeClinica` varchar(255) DEFAULT NULL,
  `nomeMedico` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `telefoneClinica` varchar(255) DEFAULT NULL,
  `horario_medico` varchar(255) DEFAULT NULL,
  `dados_clinicos` varchar(255) DEFAULT NULL,
  `data_consulta` datetime DEFAULT NULL,
  `data_de_cadastro` date DEFAULT NULL,
  `data_nascimento` datetime DEFAULT NULL,
  `horario_funcionamento` varchar(255) DEFAULT NULL,
  `imagem_clinica` varchar(255) DEFAULT NULL,
  `imagem_medico` varchar(255) DEFAULT NULL,
  `nome_clinica` varchar(255) DEFAULT NULL,
  `nome_medico` varchar(255) DEFAULT NULL,
  `telefone_clinica` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clinica`
--

LOCK TABLES `clinica` WRITE;
/*!40000 ALTER TABLE `clinica` DISABLE KEYS */;
INSERT INTO `clinica` VALUES (2,NULL,_binary '\0',NULL,NULL,'Dados Clínicos','2020-09-13 11:23:15',NULL,NULL,NULL,_binary '\0',NULL,0,'c:/imagens/foto1.png',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,NULL,_binary '\0',NULL,NULL,NULL,NULL,'2020-09-13',NULL,' Rua Paissandú, 1862, 64001-120 Teresina, PI, Brazil ',_binary '\0','Abre às seis horas',0,'c:/home/ifpi/Downloads/med-imagem.jpeg',NULL,'Med Imagem',NULL,NULL,'(86) 3131-1234',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `clinica` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-09 10:45:15

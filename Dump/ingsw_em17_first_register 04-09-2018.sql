-- phpMyAdmin SQL Dump
-- version 3.3.7deb6
-- http://www.phpmyadmin.net
--
-- Host: hostingmysql330
-- Generato il: 04 set, 2018 at 06:01 PM
-- Versione MySQL: 5.5.52
-- Versione PHP: 5.2.6-1+lenny16



/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ingsw_em17`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `addsicurezza`
--

DROP TABLE IF EXISTS `addsicurezza`;
CREATE TABLE IF NOT EXISTS `addsicurezza` (
  `IDSICUREZZA` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(64) NOT NULL,
  `EMAIL` varchar(40) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `SURNAME` varchar(25) NOT NULL,
  `TAX_CODE` varchar(16) NOT NULL,
  `PHONE` varchar(10) NOT NULL,
  `SALARY` double DEFAULT NULL,
  `BIRTH` date DEFAULT NULL,
  PRIMARY KEY (`IDSICUREZZA`),
  UNIQUE KEY `USER_UNICO` (`USERNAME`),
  UNIQUE KEY `TAX_CODE_UNIQUE` (`TAX_CODE`),
  UNIQUE KEY `EMAIL_UNIQUE` (`EMAIL`)
) ENGINE = Innodb  AUTO_INCREMENT=24 ;

--
-- Dump dei dati per la tabella `addsicurezza`
--

INSERT INTO `addsicurezza` (`IDSICUREZZA`, `USERNAME`, `PASSWORD`, `EMAIL`, `NAME`, `SURNAME`, `TAX_CODE`, `PHONE`, `SALARY`, `BIRTH`) VALUES
(1, 'CANON', '1cf2f9df0199b671d084d15f77fd161eaae7793266aa3bc948c7314b68894744', 'tommasopirozzi@hotmail.it', 'TOMMASO', 'PIROZZI', 'PRZTMS92P04G309L', '3343942027', 6000, '1992-05-25'),
(2, 'MARC', 'ed15e4316ccf0ee77ecab16e4670a93fd98f128d75acba2bed362415d404149a', 'marcelloquattromani@gmail.com', 'MARCELLO', 'QUATTROMANI', 'MRCQTT95Q00T606L', '3354548484', 25000, '1995-12-10'),
(3, 'GIU', 'ecedca8326ddfd11147f3fdaafbb832f2a778aff617dc2e5d3ab8c0885ae12ca', 'vanesio@live.com', 'GIULIANO', 'VANESIO', 'VNSGLN93D02F839M', '3405117062', 30000, '1993-04-02'),
(5, 'VINTOR', '54696cd20981df2e52d2be8d2bea16dd459d27273915ceb550e31d3cb88bc021', 'vinc@hotmail.it', 'VINCENZO', 'TORINO', 'VINTOR92P04G301P', '0810000000', 3000, '1992-06-19'),
(7, 'D10S', '7152e6ec048e24fadb1076257daa655ab198bc310e44f5531b5a02e544613d49', 'diego@hotmail.it', 'DIEGO', 'MARADONA', 'DIGMAR92P04G301P', '3391010010', 2000, '1980-06-05'),
(8, 'GREEN', '018fa96a44715c90bf93be148069cb28dd45d398f2cc75aa1565311f6e55d174', 'verdi@live.it', 'CIRO', 'VERDI', 'VERCIR92P04G301P', '3405252633', 3500, '1985-10-12'),
(10, 'HANRY', 'df46219531cb5d522d0845901978dccfa286a5b0437f4f9cd4e485064f6b632c', 'hanry@ok.it', 'HANRY', 'RADRIZ', 'RYEIWO12I34U567H', '3323344887', 1250, '1993-07-02'),
(13, 'PINTO', 'd014737671a9a00237e6d3c6f4bd755c818fde83bac7da35342ee57271e8e66f', 'angelo.pintus@gmail.com', 'ANGELO', 'PINTUS', 'PNTNGL79E05U381A', '3285485119', 3000, '1979-05-05'),
(18, 'PROVE', '52dabec3560592b39f9415c8caf022b1953da960c59de8d40300709fbe4c5077', 'marc@hotmail.it', 'MARCELLO', 'QUATTROMANI', 'PRZTMS92P01G309L', '0000000002', 4000, '2018-08-02'),
(19, 'TOMMI', 'fda967f6624b8732fce465b0ec7d8018e56217652c5d822a1f0c0cfed2895a4b', 'dsf@hotmail.it', 'TOMMASO', 'PEREL', 'PRZTMS92P04G307P', '0000000003', 5000, '2018-01-01'),
(20, 'PROVATO1', '81a2a0b93feea3914ed3e97953daabd969146665bae0cfa1be87ef5e71b7a6ca', 'falso@hotmail.it', 'TOMMASO', 'TOM', 'PRZTMS92P04G300P', '0000000008', 4000, '1993-08-06');

--
-- Triggers `addsicurezza`
--
DROP TRIGGER IF EXISTS `addsicurezza_BEFORE_INSERT`;
DELIMITER //
CREATE TRIGGER `addsicurezza_BEFORE_INSERT` BEFORE INSERT ON `addsicurezza`
 FOR EACH ROW BEGIN
 
	IF(NOT NEW.NAME REGEXP '^[a-zA-Z]+(['']?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z ]+)*$')
	THEN
		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'Error : Invalid name format ';
	END IF;

	IF(NOT NEW.SURNAME REGEXP '^[a-zA-Z]+(['' -]?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z ]+)*$')
	THEN
		SIGNAL SQLSTATE '45001'
		SET MESSAGE_TEXT = 'Error : Invalid surname format ';
	END IF;

	IF(NOT NEW.TAX_CODE REGEXP '[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]$')
	THEN
		SIGNAL SQLSTATE '45002'
		SET MESSAGE_TEXT = 'Error : Invalid tax code format ';
	END IF;

	IF(NOT NEW.EMAIL REGEXP '^[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9]{1}[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9._%-]{0,62}[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9_%-]{1}@[a-zA-Z0-9]{1}[a-zA-Z0-9._%-]{1,252}.[a-zA-Z]{2,4}$')
	THEN
		SIGNAL SQLSTATE '45003'
		SET MESSAGE_TEXT = 'Error : Invalid email format ';
	END IF;

	IF(NOT NEW.PHONE REGEXP '^([+]{1}[0-9]{1,3}[/ ]{1})?[0-9]{3,6}[ -]?[0-9]{7,}$')
	THEN
		SIGNAL SQLSTATE '45004'
		SET MESSAGE_TEXT = 'Error : Invalid phone format ';
	END IF;
    
    IF(NOT NEW.USERNAME REGEXP'^([A-Za-z0-9_-]{1,30})$')
	THEN
		SIGNAL SQLSTATE '45005'
		SET MESSAGE_TEXT = 'Error : Invalid username format ';
	END IF;
    
    
    SET NEW.USERNAME = UPPER(NEW.USERNAME);
    SET NEW.EMAIL = LOWER(NEW.EMAIL);
    SET NEW.NAME = UPPER(NEW.NAME);
    SET NEW.SURNAME = UPPER(NEW.SURNAME);
    SET NEW.TAX_CODE = UPPER(NEW.TAX_CODE);
    SET NEW.PASSWORD = SHA2(NEW.PASSWORD, 256);
END
//
DELIMITER ;
DROP TRIGGER IF EXISTS `addsicurezza_BEFORE_UPDATE`;
DELIMITER //
CREATE TRIGGER `addsicurezza_BEFORE_UPDATE` BEFORE UPDATE ON `addsicurezza`
 FOR EACH ROW BEGIN
 
	IF(NOT NEW.NAME REGEXP '^[a-zA-Z]+(['']?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z ]+)*$')
	THEN
		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'Error : Invalid name format ';
	END IF;

	IF(NOT NEW.SURNAME REGEXP '^[a-zA-Z]+(['' -]?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z ]+)*$')
	THEN
		SIGNAL SQLSTATE '45001'
		SET MESSAGE_TEXT = 'Error : Invalid surname format ';
	END IF;

	IF(NOT NEW.TAX_CODE REGEXP '[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]$')
	THEN
		SIGNAL SQLSTATE '45002'
		SET MESSAGE_TEXT = 'Error : Invalid tax code format ';
	END IF;

	IF(NOT NEW.EMAIL REGEXP '^[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9]{1}[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9._%-]{0,62}[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9_%-]{1}@[a-zA-Z0-9]{1}[a-zA-Z0-9._%-]{1,252}.[a-zA-Z]{2,4}$')
	THEN
		SIGNAL SQLSTATE '45003'
		SET MESSAGE_TEXT = 'Error : Invalid email format ';
	END IF;

	IF(NOT NEW.PHONE REGEXP '^([+]{1}[0-9]{1,3}[/ ]{1})?[0-9]{3,6}[ -]?[0-9]{7,}$')
	THEN
		SIGNAL SQLSTATE '45004'
		SET MESSAGE_TEXT = 'Error : Invalid phone format ';
	END IF;
    
    IF(NOT NEW.USERNAME REGEXP'^([A-Za-z0-9_-]{1,30})$')
	THEN
		SIGNAL SQLSTATE '45005'
		SET MESSAGE_TEXT = 'Error : Invalid username format ';
	END IF;
    
    SET NEW.USERNAME = UPPER(NEW.USERNAME);
    SET NEW.EMAIL = LOWER(NEW.EMAIL);
    SET NEW.NAME = UPPER(NEW.NAME);
    SET NEW.SURNAME = UPPER(NEW.SURNAME);
    SET NEW.TAX_CODE = UPPER(NEW.TAX_CODE);
    SET NEW.PASSWORD = SHA2(NEW.PASSWORD, 256);
END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Struttura della tabella `amministratore`
--

DROP TABLE IF EXISTS `amministratore`;
CREATE TABLE IF NOT EXISTS `amministratore` (
  `IDAMM` varchar(20) NOT NULL,
  `NOME` varchar(20) NOT NULL,
  `COGNOME` varchar(30) NOT NULL,
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(64) NOT NULL,
  `CF` varchar(16) NOT NULL,
  `EMAIL` varchar(40) NOT NULL,
  `TEL` varchar(10) NOT NULL,
  PRIMARY KEY (`IDAMM`),
  UNIQUE KEY `AMM_UNICO` (`USERNAME`)
) ENGINE = Innodb;

--
-- Dump dei dati per la tabella `amministratore`
--

INSERT INTO `amministratore` (`IDAMM`, `NOME`, `COGNOME`, `USERNAME`, `PASSWORD`, `CF`, `EMAIL`, `TEL`) VALUES
('1', 'TOMMASO', 'PIROZZI', 'CANON21', 'TOMMI', 'PRZTMS92P04G309L', 'TOMPIR@LIVE,IT', '3335020696'),
('12345', 'General', 'Administrator', 'ok', 'ok', 'GNLDNT90T15E313X', 'admin@em17.it', '3391234567'),
('2', 'Giuliano', 'Vanesio', 'giuEgiu', 'giuli', 'VNSGLN93D02F839M', 'GIUVAN@HOTMAIL.IT', '3405588633'),
('3', 'Marcello', 'Quattromani', 'quatt', 'marci', 'MARQTT90T15E313X', 'marc@live.com', '3335245878'),
('4', 'Vincenzo', 'Torino', 'vintor', 'vinci', 'VINTOR90T15E313X', 'vinc@hotmail.it', '3205051423');

--
-- Triggers `amministratore`
--
DROP TRIGGER IF EXISTS `amministratore_BEFORE_INSERT`;
DELIMITER //
CREATE TRIGGER `amministratore_BEFORE_INSERT` BEFORE INSERT ON `amministratore`
 FOR EACH ROW BEGIN
  
	SET NEW.USERNAME = UPPER(NEW.USERNAME);
    SET NEW.EMAIL = LOWER(NEW.EMAIL);
    SET NEW.NOME = UPPER(NEW.NOME);
    SET NEW.COGNOME = UPPER(NEW.COGNOME);
    SET NEW.CF = UPPER(NEW.CF);
    SET NEW.PASSWORD = SHA2(NEW.PASSWORD, 256);
END
//
DELIMITER ;
DROP TRIGGER IF EXISTS `amministratore_BEFORE_UPDATE`;
DELIMITER //
CREATE TRIGGER `amministratore_BEFORE_UPDATE` BEFORE UPDATE ON `amministratore`
 FOR EACH ROW BEGIN
  
	SET NEW.USERNAME = UPPER(NEW.USERNAME);
    SET NEW.EMAIL = LOWER(NEW.EMAIL);
    SET NEW.NOME = UPPER(NEW.NOME);
    SET NEW.COGNOME = UPPER(NEW.COGNOME);
    SET NEW.CF = UPPER(NEW.CF);
    SET NEW.PASSWORD = SHA2(NEW.PASSWORD, 256);
END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Struttura della tabella `biglietto`
--

DROP TABLE IF EXISTS `biglietto`;
CREATE TABLE IF NOT EXISTS `biglietto` (
  `IDBIGLIETTO` varchar(20) NOT NULL,
  `BARCODE` varchar(200) DEFAULT NULL,
  `PREZZO` double DEFAULT NULL,
  `NOMEPOSTO` varchar(10) DEFAULT NULL,
  `REPARTO` varchar(20) DEFAULT NULL,
  `DATAEVENTO` date NOT NULL,
  `EVENTO` int(11) DEFAULT NULL,
  `CLIENTE` int(11) DEFAULT NULL,
  `TITOLOEVENTO` varchar(30) DEFAULT NULL,
  `ADDSICUREZZA` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDBIGLIETTO`),
  KEY `EVENTO` (`EVENTO`),
  KEY `biglietto_clientefk_idx` (`CLIENTE`),
  KEY `biglietto_addsicurezzafk_idx` (`ADDSICUREZZA`)
) ENGINE = Innodb;

--
-- Dump dei dati per la tabella `biglietto`
--

INSERT INTO `biglietto` (`IDBIGLIETTO`, `BARCODE`, `PREZZO`, `NOMEPOSTO`, `REPARTO`, `DATAEVENTO`, `EVENTO`, `CLIENTE`, `TITOLOEVENTO`, `ADDSICUREZZA`) VALUES
('1', 'PROVA2', 30, 'EEF', 'CXJCN', '2018-03-12', 4, 5, '', NULL),
('10', 'PROVA3', 40, 'WEWFEEFSD', 'AGRT', '2018-10-11', 8, 8, '', NULL),
('11', 'PROVA4', 40, 'WEUJFSD', 'GRHY5T', '2018-10-11', 8, 9, '', NULL),
('12', 'ATHESF', 40, 'WERJAFSD', 'GRF42', '2018-10-11', 8, 10, '', NULL),
('13', 'ARHESF', 40, 'WERBVEFSD', 'F34RT', '2018-10-11', 8, 16, '', NULL),
('14', 'AEBSF', 40, 'QWEFWEFSD', '3G45RT', '2018-10-11', 8, 12, '', NULL),
('15', 'AESFDF', 39, '5GWEFSD', 'H54T', '2018-09-15', 10, 5, '', NULL),
('16', 'AQDEESF', 39, '6HJWEFSD', 'V3WT', '2018-09-15', 10, 9, '', NULL),
('17', 'AHTESF', 39, 'K8WEFSD', 'GRGRGE', '2018-09-15', 10, 4, '', NULL),
('18', 'DBAESF', 39, 'WEFEBTSD', 'GRERG34', '2018-09-15', 10, 15, '', NULL),
('19', 'AESZSWF', 39, 'WEFSRNAD', 'VR3T', '2018-09-15', 10, 16, '', NULL),
('2', 'JWDNJN', 10, 'DKMW', 'EKK', '2018-03-12', 4, 4, '', NULL),
('20', 'AEZDCSF', 39, 'AE4DFWEFSD', 'GVV3WT', '2018-09-15', 10, 8, '', NULL),
('21', 'BFAESF', 15, 'WESDFVFSD', 'SRV4RT', '2018-07-31', 29, 4, '', NULL),
('22', 'ATRWESF', 15, 'WSFVXEFSD', 'V3VSDF6', '2018-07-31', 29, 8, '', NULL),
('23', 'AYJTESF', 15, 'WEAFWEFSD', 'SRJY', '2018-07-31', 29, 5, '', NULL),
('24', 'AK8ESF', 15, 'WEFSD', 'GRT', '2018-07-31', 29, 6, '', NULL),
('25', 'A65JESF', 15, 'WEFSSEF4D', 'SH6', '2018-07-31', 29, 7, '', NULL),
('26', 'A3G4ESF', 15, 'W32WEFSD', 'ZWW3', '2018-07-31', 29, 9, '', NULL),
('27', 'AG2WESF', 50, 'ASF4WEFSD', 'BTHRD', '2018-08-06', 28, 8, '', NULL),
('28', 'AEEU6SF', 50, 'WSEF4EFSD', 'LUI9', '2018-08-06', 28, 4, '', NULL),
('29', 'AEEUJR64SF', 50, 'WEF234FSD', 'JYG6', '0000-00-00', 28, 5, '', NULL),
('3', 'EFEF', 20, 'WD', 'EFE', '2018-03-12', 5, 5, '', NULL),
('30', 'AZE5ESF', 50, 'AD2WEFSD', 'VGD4', '2018-08-06', 28, 6, '', NULL),
('31', 'AEFR4SF', 50, 'WASEFG53EF', 'SFG6', '2018-08-06', 28, 7, '', NULL),
('32', 'ADF3ESF', 50, 'W67KLEFSD', 'F43E', '2018-08-06', 28, 9, '', NULL),
('33', 'AED31SF', 50, '8LTEFSD', 'SCV6', '2018-08-06', 28, 10, '', NULL),
('34', 'AEF3WSF', 50, 'WYKKTEFSD', 'ZRH7', '2018-08-06', 28, 13, '', NULL),
('35', 'AEF4ESF', 50, 'KKT77WEFSD', 'L9RC', '2018-08-06', 28, 12, '', NULL),
('4', 'DW', 50, 'DW', 'FE', '2018-03-12', 5, 4, '', NULL),
('40', 'ADGR2ESF', 50, 'J6RDSD', 'RSZGR4', '2018-11-20', 7, 10, '', NULL),
('41', 'ASY5ESF', 50, 'WZEF3S', 'J74FE', '2018-11-20', 7, 15, '', NULL),
('42', 'AESH6J7F', 50, 'AD33QD', 'A3W4ER', '2018-11-20', 7, 12, '', NULL),
('43', 'AF2DSESF', 50, 'WEFSF4WQA', 'GD5HH', '2018-11-20', 7, 16, '', NULL),
('5', 'SFRRF', 15, 'RFE', 'G5E', '2018-07-11', 3, 6, '', NULL),
('51', 'MCKDMC', 10, 'KFMDKN', 'FMDKN', '2018-10-11', 8, 5, NULL, NULL),
('6', 'AESSF', 25, 'WEAFSD', 'AGRT', '2018-08-09', 2, 4, '', NULL),
('7', 'AEXSF', 25, 'WECDFSD', 'GCERRT', '2018-08-09', 2, 5, '', NULL),
('8', 'ACESF', 25, 'WEAWDFSD', 'GACERT', '2018-08-09', 2, 6, '', NULL),
('9', 'AQESF', 25, 'WQWEFSD', 'GRRT', '2018-08-09', 2, 7, '', NULL);

--
-- Triggers `biglietto`
--
DROP TRIGGER IF EXISTS `biglietto_BEFORE_INSERT`;
DELIMITER //
CREATE TRIGGER `biglietto_BEFORE_INSERT` BEFORE INSERT ON `biglietto`
 FOR EACH ROW BEGIN
  
	SET NEW.BARCODE = UPPER(NEW.BARCODE);
    SET NEW.NOMEPOSTO = UPPER(NEW.NOMEPOSTO);
    SET NEW.REPARTO = UPPER(NEW.REPARTO);
    SET NEW.TITOLOEVENTO = UPPER(NEW.TITOLOEVENTO);
END
//
DELIMITER ;
DROP TRIGGER IF EXISTS `biglietto_AFTER_INSERT`;
DELIMITER //
CREATE TRIGGER `biglietto_AFTER_INSERT` AFTER INSERT ON `biglietto`
 FOR EACH ROW BEGIN
	DECLARE  BIGLIETTI INTEGER;
     
	SELECT COUNT(*) FROM BIGLIETTO WHERE CLIENTE= NEW.CLIENTE INTO BIGLIETTI;
    UPDATE CLIENTE SET ACQUISTI = BIGLIETTI WHERE IDCLIENTE = NEW.CLIENTE;
END
//
DELIMITER ;
DROP TRIGGER IF EXISTS `biglietto_BEFORE_UPDATE`;
DELIMITER //
CREATE TRIGGER `biglietto_BEFORE_UPDATE` BEFORE UPDATE ON `biglietto`
 FOR EACH ROW BEGIN
  
	SET NEW.BARCODE = UPPER(NEW.BARCODE);
    SET NEW.NOMEPOSTO = UPPER(NEW.NOMEPOSTO);
    SET NEW.REPARTO = UPPER(NEW.REPARTO);
    SET NEW.TITOLOEVENTO = UPPER(NEW.TITOLOEVENTO);
END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Struttura della tabella `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `IDCLIENTE` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(64) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `SURNAME` varchar(20) NOT NULL,
  `EMAIL` varchar(40) NOT NULL,
  `TAX_CODE` varchar(16) NOT NULL,
  `PHONE` varchar(10) DEFAULT NULL,
  `BIRTH` date NOT NULL,
  `ACQUISTI` int(11) DEFAULT NULL,
  PRIMARY KEY (`IDCLIENTE`),
  UNIQUE KEY `CLIENTE_UNICO` (`USERNAME`)
) ENGINE = Innodb  AUTO_INCREMENT=17 ;

--
-- Dump dei dati per la tabella `cliente`
--

INSERT INTO `cliente` (`IDCLIENTE`, `USERNAME`, `PASSWORD`, `NAME`, `SURNAME`, `EMAIL`, `TAX_CODE`, `PHONE`, `BIRTH`, `ACQUISTI`) VALUES
(4, 'TOMMI', '0cdd482cfbba8fb398da6776ded56c89d91855c88d2492dfe074e4a9a8db2ead', 'TOMMASO', 'PIROZZI', 'tom@xxx.itf', 'PRZTMS92P04G309L', '0810000000', '1992-06-21', 7),
(5, 'KEFMEKM', '1707d0ddb4c6f41f50930c6099ce962f8db0a719a846553c90b27e511a6b894e', 'GIULIANO', 'VANESIO', 'giu@gg.it', 'GRNVNS93D02F839M', '0810000000', '1993-04-17', 7),
(6, 'BESTIA', 'b39d42bf776199dfc59b27ab67f98673f7819e59012f3578465e61ef51ffc3be', 'HANK', 'MCCOY', 'han@xmen.com', 'FNDTLB85T18A964V', '0810000000', '1984-05-12', 5),
(7, 'WOLVERINE', '33537daaffb7dab71a9e3313cc4906ed1f490480e3a54159d1992a97711e130c', 'LOGAN', 'WOLVERS', 'log@xmen.com', 'DDVKNB74H69L738K', '0819999999', '1912-04-15', 4),
(8, 'FENICE', '4188d75a7e2556103832158815c32364618ef739ddb3ea428fca6bd5f2b1d8b7', 'JEAN ', 'GREY', 'jean@xmen.com', 'DHLDTP90C24C104U', '0819090909', '1979-11-01', 5),
(9, 'CICLOPE', '05367b715f3add8a100d140f766a3b454b56727e1aafa8a86fc8452c33842aa2', 'SCOTT', 'SUMMERS', 'scott@xmen.com', 'PHDWTF30T07L569R', '0819090909', '1978-12-08', 4),
(10, 'ARCANGELO', 'eaf75f524de576c636e02c923ba908012211cd50d4441699fabdd78f8407814e', 'WARREN ', 'WORTHINGTON ', 'warren@xmen.com', 'MPXJFP87M05L156B', '0819090909', '1982-12-16', 3),
(12, 'UOMOGHIACCIO', 'ff2acd3f37a1b42f6fd342c2881372bb2f7c287e03492974c7016e1dc7b450f7', 'ROBERT ', 'DRAKE', 'robert@xmen.com', 'CFVJYF56R28C555J', '0819090909', '1988-02-08', 3),
(13, 'PROFESSORX', '0c101e25c865483e068db63045ba73b82a60dc98120c4b254c5e51c7f84d4c88', 'CHARLES', 'XAVIER', 'charles@xmen.com', 'MGVTFM63B07B875X', '0819090909', '1948-09-18', 1),
(14, 'MAGNETO', 'bdee4e423463f72b85258a965fc865299480a5c8ced13c77cbbfca5739da0a4f', 'MAX', 'EISENHARDT', 'max@xmen.com', 'MKSDXD86C50L107F', '0819090909', '1949-03-13', 0),
(15, 'TEMPESTA', '8bc5bf0c34c6ccba67de6d6d7777df0207fc0c54ca7a6e23ed30e65c81bbd5eb', 'ORORO', 'MUNROE', 'ororo@xmen.com', 'BGGSMS88M64L191Z', '0819090909', '1985-11-10', 2),
(16, 'COLOSSO', 'b2e09c0477e177a77dbc53522f88227357708783b89cedab485d0c338ebfd535', 'PIOTR ', 'NIKOLAIEVITCH ', 'piotr@xmen.com', 'NRTQZT77B63L771Z', '0819090909', '1970-06-21', 3);

--
-- Triggers `cliente`
--
DROP TRIGGER IF EXISTS `cliente_BEFORE_INSERT`;
DELIMITER //
CREATE TRIGGER `cliente_BEFORE_INSERT` BEFORE INSERT ON `cliente`
 FOR EACH ROW BEGIN
  
	IF(NOT NEW.NAME REGEXP '^[a-zA-Z]+(['']?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z ]+)*$')
	THEN
		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'Error : Invalid name format ';
	END IF;

	IF(NOT NEW.SURNAME REGEXP '^[a-zA-Z]+(['' -]?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z ]+)*$')
	THEN
		SIGNAL SQLSTATE '45001'
		SET MESSAGE_TEXT = 'Error : Invalid surname format ';
	END IF;

	IF(NOT NEW.TAX_CODE REGEXP '[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]$')
	THEN
		SIGNAL SQLSTATE '45002'
		SET MESSAGE_TEXT = 'Error : Invalid tax code format ';
	END IF;

	IF(NOT NEW.EMAIL REGEXP'^[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9]{1}[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9._%-]{0,62}[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9_%-]{1}@[a-zA-Z0-9]{1}[a-zA-Z0-9._%-]{1,252}.[a-zA-Z]{2,4}$')
	THEN
		SIGNAL SQLSTATE '45003'
		SET MESSAGE_TEXT = 'Error : Invalid email format ';
	END IF;

	IF(NOT NEW.PHONE REGEXP '^([+]{1}[0-9]{1,3}[/ ]{1})?[0-9]{3,6}[ -]?[0-9]{7,}$')
	THEN
		SIGNAL SQLSTATE '45004'
		SET MESSAGE_TEXT = 'Error : Invalid phone format ';
	END IF;
		
    IF(NOT NEW.USERNAME REGEXP'^([A-Za-z0-9_-]{1,30})$')
	THEN
		SIGNAL SQLSTATE '45005'
		SET MESSAGE_TEXT = 'Error : Invalid username format ';
	END IF;
    
	SET NEW.USERNAME = UPPER(NEW.USERNAME);
    SET NEW.EMAIL = LOWER(NEW.EMAIL);
    SET NEW.NAME = UPPER(NEW.NAME);
    SET NEW.SURNAME = UPPER(NEW.SURNAME);
    SET NEW.TAX_CODE = UPPER(NEW.TAX_CODE);
    SET NEW.PASSWORD = SHA2(NEW.PASSWORD, 256);
    SET NEW.ACQUISTI = 0;
END
//
DELIMITER ;
DROP TRIGGER IF EXISTS `cliente_BEFORE_UPDATE`;
DELIMITER //
CREATE TRIGGER `cliente_BEFORE_UPDATE` BEFORE UPDATE ON `cliente`
 FOR EACH ROW BEGIN
DECLARE BIGLIETTI INTEGER;
 
    IF(NOT NEW.NAME REGEXP '^[a-zA-Z]+(['']?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z ]+)*$')
	THEN
		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'Error : Invalid name format ';
	END IF;

	IF(NOT NEW.SURNAME REGEXP '^[a-zA-Z]+(['' -]?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z ]+)*$')
	THEN
		SIGNAL SQLSTATE '45001'
		SET MESSAGE_TEXT = 'Error : Invalid surname format ';
	END IF;

	IF(NOT NEW.TAX_CODE REGEXP '[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]$')
	THEN
		SIGNAL SQLSTATE '45002'
		SET MESSAGE_TEXT = 'Error : Invalid tax code format ';
	END IF;

	IF(NOT NEW.EMAIL REGEXP'^[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9]{1}[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9._%-]{0,62}[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9_%-]{1}@[a-zA-Z0-9]{1}[a-zA-Z0-9._%-]{1,252}.[a-zA-Z]{2,4}$')
	THEN
		SIGNAL SQLSTATE '45003'
		SET MESSAGE_TEXT = 'Error : Invalid email format ';
	END IF;

	IF(NOT NEW.PHONE REGEXP '^([+]{1}[0-9]{1,3}[/ ]{1})?[0-9]{3,6}[ -]?[0-9]{7,}$')
	THEN
		SIGNAL SQLSTATE '45004'
		SET MESSAGE_TEXT = 'Error : Invalid phone format ';
	END IF;
    
    IF(NOT NEW.USERNAME REGEXP'^([A-Za-z0-9_-]{1,30})$')
	THEN
		SIGNAL SQLSTATE '45005'
		SET MESSAGE_TEXT = 'Error : Invalid username format ';
	END IF;
    
	SELECT COUNT(*) FROM BIGLIETTO WHERE CLIENTE= NEW.IDCLIENTE INTO BIGLIETTI;
    IF(BIGLIETTI != NEW.ACQUISTI)
    THEN
       SIGNAL SQLSTATE '45006'
	   SET MESSAGE_TEXT = 'Error : That column is automatically calculated, you cant update it ';
	END IF;

	SET NEW.USERNAME = UPPER(NEW.USERNAME);
    SET NEW.EMAIL = LOWER(NEW.EMAIL);
    SET NEW.NAME = UPPER(NEW.NAME);
    SET NEW.SURNAME = UPPER(NEW.SURNAME);
    SET NEW.TAX_CODE = UPPER(NEW.TAX_CODE);
    SET NEW.PASSWORD = SHA2(NEW.PASSWORD, 256);

END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Struttura della tabella `evento`
--

DROP TABLE IF EXISTS `evento`;
CREATE TABLE IF NOT EXISTS `evento` (
  `IDEVENTO` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(50) NOT NULL,
  `DESCRIPTION` varchar(1000) NOT NULL,
  `EVENT_TYPE` enum('SPORT','CONCERT','THEATER','CINEMA','OTHER') NOT NULL,
  `KIND_TYPE` enum('FOOTBALL','TENNIS','BASKET','VOLLEYBALL','SWIMMING','POP AND ROCK','METAL','MUSICAL','CABARET','COMEDY','DRAMATIC','HORROR','OTHER') NOT NULL,
  `DATE` date NOT NULL,
  `ZIP_CODE` varchar(5) DEFAULT NULL,
  `PLACE_NAME` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`IDEVENTO`),
  KEY `FK_LUOGO` (`ZIP_CODE`)
) ENGINE = Innodb  AUTO_INCREMENT=77 ;

--
-- Dump dei dati per la tabella `evento`
--

INSERT INTO `evento` (`IDEVENTO`, `TITLE`, `DESCRIPTION`, `EVENT_TYPE`, `KIND_TYPE`, `DATE`, `ZIP_CODE`, `PLACE_NAME`) VALUES
(1, 'DA PAURA', 'BELLO E BUONO', 'CINEMA', 'HORROR', '2017-12-05', '80019', 'StadioQualiano'),
(2, 'Harry Potter', 'Film fantasy adatto a tutti', 'CINEMA', 'OTHER', '2018-08-09', NULL, 'UCICINEMAS,NAPOLI'),
(3, 'Pokemon', 'Film per bambini', 'CINEMA', 'OTHER', '2018-07-11', NULL, 'MED Maxicinema'),
(4, 'Vasco in Tour', 'Vasco Rossi in tour per l''Italia', 'CONCERT', 'OTHER', '2018-07-12', NULL, 'Stadio San Paolo Napoli'),
(5, 'BALLANDO COI LUPI', 'SUPER EVENTO', 'CINEMA', 'COMEDY', '2018-06-18', '80019', 'STADIOQUALIANOO'),
(6, 'VASCO IN TOUR', 'Vasco Rossi in tour per l''Italia', 'CONCERT', 'OTHER', '2018-08-20', NULL, 'Stadio San Siro Milano'),
(7, 'INTER-LAZIO', 'PARTITA DI CAMPIONATO', 'SPORT', 'FOOTBALL', '2018-11-20', NULL, 'STADIO SAN SIRO MILANO'),
(8, 'Legnano-Monza', 'Partita di volley', 'SPORT', 'VOLLEYBALL', '2018-10-11', NULL, 'PALABORSANI Castellenza VA'),
(9, 'PROVA2', 'SUPER EVENTO', 'SPORT', 'FOOTBALL', '2018-06-18', '80019', 'STAD QUAL'),
(10, 'Vasco in Tour', 'Vasco Rossi in tour per l''Italia', 'CONCERT', 'OTHER', '2018-09-15', NULL, 'Stadio Olimpico Roma'),
(11, 'A CASA 1', 'OK', 'CINEMA', 'COMEDY', '2018-07-11', NULL, 'asd'),
(14, 'SMALL', '\naf', 'CINEMA', 'COMEDY', '2018-07-06', NULL, 'aef'),
(23, 'Napoli-Juve', 'test', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'test'),
(27, 'ZAINO IN SPALLA', 'IN GIRO PER L''ITALIA CON ZAINO IN SPALLA', 'SPORT', 'OTHER', '2018-07-27', NULL, 'DA CATANIA A MILANO'),
(28, 'PARTITA DEL CUORE', 'PARTITA DI BENEFICENZA', 'SPORT', 'FOOTBALL', '2018-08-06', NULL, 'STADIO SAN PAOLO'),
(29, 'BELLA LÌ', 'DIVERTENTE', 'THEATER', 'OTHER', '2018-07-31', '80124', 'TEATRO NUOVO'),
(33, 'PROVA5', 'VIENI AL TEATRO', 'THEATER', 'CABARET', '2018-07-29', NULL, 'NAPOLI'),
(34, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(35, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(36, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(37, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(38, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(39, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(40, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(41, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(42, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(43, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(44, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(45, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(46, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(47, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(48, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(49, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(50, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(51, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(52, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(53, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(54, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(55, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(56, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(57, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(58, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(59, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(60, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(61, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(62, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(63, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(64, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(65, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(66, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(67, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(68, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(69, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(70, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(71, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(72, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(73, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(74, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST'),
(75, 'HARRY POTTER 3', 'TEST', 'CINEMA', 'OTHER', '2020-06-07', NULL, 'TEST'),
(76, 'NAPOLI-JUVE', 'TEST', 'SPORT', 'FOOTBALL', '2019-03-06', NULL, 'TEST');

--
-- Triggers `evento`
--
DROP TRIGGER IF EXISTS `evento_BEFORE_INSERT`;
DELIMITER //
CREATE TRIGGER `evento_BEFORE_INSERT` BEFORE INSERT ON `evento`
 FOR EACH ROW BEGIN
  
	IF(NOT NEW.DESCRIPTION REGEXP '^[''ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9 ,.;"/_#?!-]+$')
	THEN
		SIGNAL SQLSTATE '45007'
		SET MESSAGE_TEXT = 'Error : Invalid description format ';
	END IF;

	IF(NOT NEW.ZIP_CODE REGEXP '^[0-9]{3}[0-9xX]{2}$')
	THEN
		SIGNAL SQLSTATE '45008'
		SET MESSAGE_TEXT = 'Error : Invalid zip code format ';
	END IF;

	IF(NOT NEW.PLACE_NAME REGEXP '^(([a-zA-Z]{1}[°]?)|([0-9]+[°]?))((['' ,."/-]{1}(([ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z]{1}[°]?)|([0-9]+[°]?)))*[''"]?[,./-]?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z 0-9]+)*[.]?$')
	THEN
		SIGNAL SQLSTATE '45009'
		SET MESSAGE_TEXT = 'Error : Invalid place name format ';
	END IF;
	IF(NOT NEW.TITLE REGEXP '^[''ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9 ,.;"/_#?!-]+$')
	THEN
		SIGNAL SQLSTATE '45010'
		SET MESSAGE_TEXT = 'Error : Invalid title format ';
	END IF;
    IF(NEW.KIND_TYPE != 'OTHER' AND NEW.KIND_TYPE != 'FOOTBALL' AND NEW.KIND_TYPE != 'TENNIS' AND NEW.KIND_TYPE != 'BASKET' AND NEW.KIND_TYPE != 'VOLLEYBALL' AND NEW.KIND_TYPE != 'SWIMMING' AND NEW.EVENT_TYPE = 'SPORT')
    THEN
		SIGNAL SQLSTATE '45011'
		SET MESSAGE_TEXT = 'Error : The kind inserted is not of the type Sport ';
	END IF;
    IF(NEW.KIND_TYPE != 'OTHER' AND NEW.KIND_TYPE != 'POP AND ROCK' AND NEW.KIND_TYPE != 'METAL' AND NEW.EVENT_TYPE = 'CONCERT')
    THEN
		SIGNAL SQLSTATE '45012'
		SET MESSAGE_TEXT = 'Error : The kind inserted is not of the type Concert ';
	END IF;
    IF(NEW.KIND_TYPE != 'OTHER' AND NEW.KIND_TYPE != 'COMEDY' AND NEW.KIND_TYPE != 'MUSICAL' AND NEW.KIND_TYPE != 'CABARET' AND NEW.EVENT_TYPE = 'THEATER')
    THEN
		SIGNAL SQLSTATE '45013'
		SET MESSAGE_TEXT = 'Error : The kind inserted is not of the type Theater ';
	END IF;
    IF(NEW.KIND_TYPE != 'OTHER' AND NEW.KIND_TYPE != 'COMEDY' AND NEW.KIND_TYPE != 'DRAMATIC' AND NEW.KIND_TYPE != 'HORROR' AND NEW.EVENT_TYPE = 'CINEMA')
    THEN
		SIGNAL SQLSTATE '45014'
		SET MESSAGE_TEXT = 'Error : The kind inserted is not of the type Cinema ';
	END IF;
    IF(NEW.DATE <= DATE(NOW())) THEN
		SIGNAL SQLSTATE '45015'
		SET MESSAGE_TEXT = 'Error : the entered date has already passed ';
	END IF;
    SET NEW.TITLE = UPPER(NEW.TITLE);
    SET NEW.DESCRIPTION = UPPER(NEW.DESCRIPTION);
    SET NEW.EVENT_TYPE = UPPER(NEW.EVENT_TYPE);
    SET NEW.KIND_TYPE = UPPER(NEW.KIND_TYPE);
    SET NEW.PLACE_NAME = UPPER(NEW.PLACE_NAME);
END
//
DELIMITER ;
DROP TRIGGER IF EXISTS `evento_BEFORE_UPDATE`;
DELIMITER //
CREATE TRIGGER `evento_BEFORE_UPDATE` BEFORE UPDATE ON `evento`
 FOR EACH ROW BEGIN
	 
	IF(NOT NEW.DESCRIPTION REGEXP '^[''ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9 ,.;"/_#?!-]+$')
	THEN
		SIGNAL SQLSTATE '45007'
		SET MESSAGE_TEXT = 'Error : Invalid description format ';
	END IF;

	IF(NOT NEW.ZIP_CODE REGEXP '^[0-9]{3}[0-9xX]{2}$')
	THEN
		SIGNAL SQLSTATE '45008'
		SET MESSAGE_TEXT = 'Error : Invalid zip code format ';
	END IF;

	IF(NOT NEW.PLACE_NAME REGEXP '^(([a-zA-Z]{1}[°]?)|([0-9]+[°]?))((['' ,."/-]{1}(([ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z]{1}[°]?)|([0-9]+[°]?)))*[''"]?[,./-]?[ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z 0-9]+)*[.]?$')
	THEN
		SIGNAL SQLSTATE '45009'
		SET MESSAGE_TEXT = 'Error : Invalid place name format ';
	END IF;
	IF(NOT NEW.TITLE REGEXP '^[''ÀÁÈÉÌÍÒÓÙÚàáèéìíòóùúa-zA-Z0-9 ,.;"/_#?!-]+$')
	THEN
		SIGNAL SQLSTATE '45010'
		SET MESSAGE_TEXT = 'Error : Invalid title format ';
	END IF;
    IF(NEW.EVENT_TYPE != OLD.EVENT_TYPE)
    THEN
        SET NEW.KIND_TYPE = 'OTHER';
        
    END IF;
    IF(NEW.KIND_TYPE != 'OTHER' AND NEW.KIND_TYPE != 'FOOTBALL' AND NEW.KIND_TYPE != 'TENNIS' AND NEW.KIND_TYPE != 'BASKET' AND NEW.KIND_TYPE != 'VOLLEYBALL' AND NEW.KIND_TYPE != 'SWIMMING' AND NEW.EVENT_TYPE = 'SPORT')
    THEN
		SIGNAL SQLSTATE '45011'
		SET MESSAGE_TEXT = 'Error : The kind inserted is not of the type Sport ';
	END IF;
    IF(NEW.KIND_TYPE != 'OTHER' AND NEW.KIND_TYPE != 'POP AND ROCK' AND NEW.KIND_TYPE != 'METAL' AND NEW.EVENT_TYPE = 'CONCERT')
    THEN
		SIGNAL SQLSTATE '45012'
		SET MESSAGE_TEXT = 'Error : The kind inserted is not of the type Concert ';
	END IF;
    IF(NEW.KIND_TYPE != 'OTHER' AND NEW.KIND_TYPE != 'COMEDY' AND NEW.KIND_TYPE != 'MUSICAL' AND NEW.KIND_TYPE != 'CABARET' AND NEW.EVENT_TYPE = 'THEATER')
    THEN
		SIGNAL SQLSTATE '45013'
		SET MESSAGE_TEXT = 'Error : The kind inserted is not of the type Theater ';
	END IF;
    IF(NEW.KIND_TYPE != 'OTHER' AND NEW.KIND_TYPE != 'COMEDY' AND NEW.KIND_TYPE != 'DRAMATIC' AND NEW.KIND_TYPE != 'HORROR' AND NEW.EVENT_TYPE = 'CINEMA')
    THEN
		SIGNAL SQLSTATE '45014'
		SET MESSAGE_TEXT = 'Error : The kind inserted is not of the type Cinema ';
	END IF;
    SET NEW.TITLE = UPPER(NEW.TITLE);
    SET NEW.DESCRIPTION = UPPER(NEW.DESCRIPTION);
    SET NEW.EVENT_TYPE = UPPER(NEW.EVENT_TYPE);
    SET NEW.KIND_TYPE = UPPER(NEW.KIND_TYPE);
    SET NEW.PLACE_NAME = UPPER(NEW.PLACE_NAME);
END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Struttura della tabella `gestione_cliente`
--

DROP TABLE IF EXISTS `gestione_cliente`;
CREATE TABLE IF NOT EXISTS `gestione_cliente` (
  `CLIENTE` int(11) DEFAULT NULL,
  `AMMINISTRATORE` varchar(20) DEFAULT NULL,
  `OPERATION` varchar(20) DEFAULT NULL,
  KEY `AMMINISTRATORE` (`AMMINISTRATORE`),
  KEY `gestione_cliente_clientefk_idx` (`CLIENTE`)
) ENGINE = Innodb;

--
-- Dump dei dati per la tabella `gestione_cliente`
--


--
-- Triggers `gestione_cliente`
--
DROP TRIGGER IF EXISTS `gestione_cliente_BEFORE_INSERT`;
DELIMITER //
CREATE TRIGGER `gestione_cliente_BEFORE_INSERT` BEFORE INSERT ON `gestione_cliente`
 FOR EACH ROW BEGIN
  
	SET NEW.OPERATION = UPPER(NEW.OPERATION);
END
//
DELIMITER ;
DROP TRIGGER IF EXISTS `gestione_cliente_BEFORE_UPDATE`;
DELIMITER //
CREATE TRIGGER `gestione_cliente_BEFORE_UPDATE` BEFORE UPDATE ON `gestione_cliente`
 FOR EACH ROW BEGIN
  
	SET NEW.OPERATION = UPPER(NEW.OPERATION);
END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Struttura della tabella `gestione_evento`
--

DROP TABLE IF EXISTS `gestione_evento`;
CREATE TABLE IF NOT EXISTS `gestione_evento` (
  `EVENTO` int(11) DEFAULT NULL,
  `AMMINISTRATORE` varchar(20) DEFAULT NULL,
  `OPERATION` varchar(15) DEFAULT NULL,
  KEY `AMMINISTRATORE` (`AMMINISTRATORE`),
  KEY `gestione_evento_eventofk_idx` (`EVENTO`)
) ENGINE = Innodb;

--
-- Dump dei dati per la tabella `gestione_evento`
--


--
-- Triggers `gestione_evento`
--
DROP TRIGGER IF EXISTS `gestione_evento_BEFORE_INSERT`;
DELIMITER //
CREATE TRIGGER `gestione_evento_BEFORE_INSERT` BEFORE INSERT ON `gestione_evento`
 FOR EACH ROW BEGIN
  
	SET NEW.OPERATION = UPPER(NEW.OPERATION);
END
//
DELIMITER ;
DROP TRIGGER IF EXISTS `gestione_evento_BEFORE_UPDATE`;
DELIMITER //
CREATE TRIGGER `gestione_evento_BEFORE_UPDATE` BEFORE UPDATE ON `gestione_evento`
 FOR EACH ROW BEGIN
  
	SET NEW.OPERATION = UPPER(NEW.OPERATION);
END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Struttura della tabella `gestione_turno`
--

DROP TABLE IF EXISTS `gestione_turno`;
CREATE TABLE IF NOT EXISTS `gestione_turno` (
  `EVENTO` int(11) DEFAULT NULL,
  `ADDSICUREZZA` int(11) DEFAULT NULL,
  `START` time NOT NULL,
  `END` time NOT NULL,
  `TURN_NUMBER` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`TURN_NUMBER`),
  KEY `gestione_turno_sicurezzafk_idx` (`ADDSICUREZZA`),
  KEY `gestione_turno_eventofk_idx` (`EVENTO`)
) ENGINE = Innodb  AUTO_INCREMENT=31 ;

--
-- Dump dei dati per la tabella `gestione_turno`
--

INSERT INTO `gestione_turno` (`EVENTO`, `ADDSICUREZZA`, `START`, `END`, `TURN_NUMBER`) VALUES
(1, 2, '00:00:00', '00:00:00', 6),
(5, 1, '17:00:00', '18:00:00', 11),
(5, 1, '01:00:00', '02:00:00', 22),
(8, 1, '01:00:00', '02:00:00', 24),
(9, 10, '01:00:00', '02:00:00', 25),
(6, 3, '17:00:00', '00:00:00', 26),
(1, 3, '16:00:00', '00:00:00', 27),
(6, 1, '01:00:00', '02:00:00', 28),
(7, 19, '16:00:00', '00:00:00', 29),
(9, 3, '08:00:00', '18:00:00', 30);

--
-- Triggers `gestione_turno`
--
DROP TRIGGER IF EXISTS `gestione_turno_BEFORE_INSERT`;
DELIMITER //
CREATE TRIGGER `gestione_turno_BEFORE_INSERT` BEFORE INSERT ON `gestione_turno`
 FOR EACH ROW BEGIN
	DECLARE DATE_TURN DATE;
	DECLARE CHECK_TURN INTEGER;
 
	IF(NEW.END < NEW.START) THEN
		IF((24 - (TIME_TO_SEC(NEW.START)/3600)) + (TIME_TO_SEC(NEW.END)/3600) > 12) THEN
			SIGNAL SQLSTATE '45016'
			SET MESSAGE_TEXT = 'Error : It isn''t possible to work for more than 12 hours';
		END IF;
	ELSEIF(NEW.END > NEW.START) THEN
		IF(TIME_TO_SEC(TIMEDIFF(NEW.END, NEW.START))/3600 > 12) THEN
			SIGNAL SQLSTATE '45016'
			SET MESSAGE_TEXT = 'Error : It isn''t possible to work for more than 12 hours';
		END IF;
	ELSE
		SIGNAL SQLSTATE '45017'
		SET MESSAGE_TEXT = 'Error : The start time can''t be the same as the end time';
    END IF;
    SELECT EVENTO.DATE FROM EVENTO WHERE EVENTO.IDEVENTO = NEW.EVENTO INTO DATE_TURN; -- prendo la data del turno che sto inserendo
    SELECT COUNT(*) FROM EVENTO WHERE EVENTO.DATE = DATE_TURN AND NEW.ADDSICUREZZA IN (SELECT ADDSICUREZZA FROM GESTIONE_TURNO WHERE GESTIONE_TURNO.EVENTO = EVENTO.IDEVENTO) INTO CHECK_TURN; -- controllo se esistono già turni di quell'addetto per quella data
    IF(CHECK_TURN > 0) THEN
		SIGNAL SQLSTATE '45018'
		SET MESSAGE_TEXT = 'Error : Thise security officer already has a turn this day';
    END IF;
END
//
DELIMITER ;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `biglietto`
--
ALTER TABLE `biglietto`
  ADD CONSTRAINT `biglietto_eventofk` FOREIGN KEY (`EVENTO`) REFERENCES `evento` (`IDEVENTO`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `biglietto_addsicurezzafk` FOREIGN KEY (`ADDSICUREZZA`) REFERENCES `addsicurezza` (`IDSICUREZZA`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `biglietto_clientefk` FOREIGN KEY (`CLIENTE`) REFERENCES `cliente` (`IDCLIENTE`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limiti per la tabella `gestione_cliente`
--
ALTER TABLE `gestione_cliente`
  ADD CONSTRAINT `gestione_cliente_clientefk` FOREIGN KEY (`CLIENTE`) REFERENCES `cliente` (`IDCLIENTE`),
  ADD CONSTRAINT `gestione_cliente_ibfk_2` FOREIGN KEY (`AMMINISTRATORE`) REFERENCES `amministratore` (`IDAMM`);

--
-- Limiti per la tabella `gestione_evento`
--
ALTER TABLE `gestione_evento`
  ADD CONSTRAINT `gestione_evento_eventofk` FOREIGN KEY (`EVENTO`) REFERENCES `evento` (`IDEVENTO`),
  ADD CONSTRAINT `gestione_evento_ibfk_2` FOREIGN KEY (`AMMINISTRATORE`) REFERENCES `amministratore` (`IDAMM`);

--
-- Limiti per la tabella `gestione_turno`
--
ALTER TABLE `gestione_turno`
  ADD CONSTRAINT `gestione_turno_eventofk` FOREIGN KEY (`EVENTO`) REFERENCES `evento` (`IDEVENTO`),
  ADD CONSTRAINT `gestione_turno_sicurezzafk` FOREIGN KEY (`ADDSICUREZZA`) REFERENCES `addsicurezza` (`IDSICUREZZA`);

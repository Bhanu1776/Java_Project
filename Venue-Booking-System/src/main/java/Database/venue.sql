-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Dec 06, 2021 at 05:11 PM
-- Server version: 8.0.18
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `venue`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
CREATE TABLE IF NOT EXISTS `booking` (
  `Name` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Pno` varchar(12) NOT NULL,
  `Vname` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`Name`, `Email`, `Pno`, `Vname`) VALUES
('Bhanu', 'sunkabhanu', '215151515', 'Hotel'),
('Ishika', 'Ishika@gamil.com', '984826292', 'Taj Hotel');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `Cid` int(10) NOT NULL,
  `Cname` char(20) NOT NULL,
  `Cemail` char(30) NOT NULL,
  PRIMARY KEY (`Cid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `dealer`
--

DROP TABLE IF EXISTS `dealer`;
CREATE TABLE IF NOT EXISTS `dealer` (
  `Did` int(10) NOT NULL,
  `Dname` char(15) NOT NULL,
  `Demail` char(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `Name` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `Role` varchar(8) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Name`, `Email`, `password`, `Role`) VALUES
('Bhanu', 'Bhanu', '12345', 'Dealer'),
('Bunny', 'Bunny', '12345678', 'Customer'),
('Bhanu', 'hmmm', '12345', 'Customer'),
('Aradhana', 'aradhana', '12345', 'Customer'),
('Ishika', 'ishika', '12345', 'Customer'),
('Ishika', 'Ishika', 'pagal', 'Customer'),
('Kishan', 'kishan', '12345678', 'Dealer'),
('Bhanu ', 'Bhanu@gmail.com', '12345678', 'Dealer');

-- --------------------------------------------------------

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
CREATE TABLE IF NOT EXISTS `message` (
  `Msg` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `message`
--

INSERT INTO `message` (`Msg`) VALUES
('Dealer Accepted Your Request'),
('Dealer Accepted Your Request'),
('Dealer Accepted Your Request');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `Pid` int(10) NOT NULL,
  `Poption` char(20) NOT NULL,
  `Price` int(6) NOT NULL,
  PRIMARY KEY (`Pid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `venue`
--

DROP TABLE IF EXISTS `venue`;
CREATE TABLE IF NOT EXISTS `venue` (
  `Vname` varchar(30) NOT NULL,
  `Food` varchar(5) NOT NULL,
  `Location` varchar(30) NOT NULL,
  `Price` varchar(7) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `venue`
--

INSERT INTO `venue` (`Vname`, `Food`, `Location`, `Price`) VALUES
('Taj Hotel ', 'Yes', 'Mumbai', '60000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

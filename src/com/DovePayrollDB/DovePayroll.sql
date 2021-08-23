-- phpMyAdmin SQL Dump
-- version 4.9.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: May 16, 2021 at 10:49 AM
-- Server version: 5.7.26
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `DovePayroll`
--

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `companyId` int(11) NOT NULL,
  `regionId` int(11) DEFAULT NULL,
  `companyName` varchar(50) DEFAULT NULL,
  `registrationNumber` int(11) DEFAULT NULL,
  `businessAdress` varchar(50) DEFAULT NULL,
  `companyPhone` varchar(12) DEFAULT NULL,
  `companyEmail` varchar(50) DEFAULT NULL,
  `businessType` int(11) DEFAULT NULL,
  `numberOfEmployee` int(11) DEFAULT NULL,
  `paymentMethod` int(11) DEFAULT NULL,
  `paymentTerms` int(11) DEFAULT NULL,
  `subscriptionType` int(11) DEFAULT NULL,
  `accountingPeriodStart` varchar(15) DEFAULT NULL,
  `annualReportDate` varchar(15) DEFAULT NULL,
  `dateCreated` varchar(15) DEFAULT NULL,
  `lastUpdated` varchar(15) DEFAULT NULL,
  `salesAgentCode` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `companyBenefits`
--

CREATE TABLE `companyBenefits` (
  `benefitId` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employeeId` int(11) NOT NULL,
  `employeeName` varchar(50) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `birthdate` varchar(15) DEFAULT NULL,
  `employeePhone` varchar(12) DEFAULT NULL,
  `employeeEmail` varchar(50) DEFAULT NULL,
  `employeeIdNumber` int(11) DEFAULT NULL,
  `positionStartDate` varchar(15) DEFAULT NULL,
  `positionEndDate` varchar(15) DEFAULT NULL,
  `workLocation` varchar(20) DEFAULT NULL,
  `inkindVehicle` tinyint(1) DEFAULT NULL,
  `inkindHouse` tinyint(1) DEFAULT NULL,
  `employerType` int(11) DEFAULT NULL,
  `pensionNumber` varchar(12) DEFAULT NULL,
  `medicalInsuranceNumber` varchar(12) DEFAULT NULL,
  `nextofKinIdentifier` varchar(15) DEFAULT NULL,
  `salaryProfileIdentifier` varchar(15) DEFAULT NULL,
  `companyId` int(11) DEFAULT NULL,
  `profileStatus` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `employeeBenefits`
--

CREATE TABLE `employeeBenefits` (
  `employeeBenefitId` int(11) NOT NULL,
  `employeeId` int(11) DEFAULT NULL,
  `benefitId` int(11) DEFAULT NULL,
  `dateCreated` varchar(15) DEFAULT NULL,
  `lastUpdated` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `nextOfKin`
--

CREATE TABLE `nextOfKin` (
  `nextOfKinId` int(11) NOT NULL,
  `employeeId` int(11) DEFAULT NULL,
  `fullName` varchar(50) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `dateCreated` varchar(15) DEFAULT NULL,
  `lastUpdated` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `payCheques`
--

CREATE TABLE `payCheques` (
  `chequeId` int(11) NOT NULL,
  `employeeId` int(11) DEFAULT NULL,
  `dateCreated` varchar(15) DEFAULT NULL,
  `lastUpdated` varchar(15) DEFAULT NULL,
  `salaryCalcRslt` int(11) DEFAULT NULL,
  `chequeStatus` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `paye`
--

CREATE TABLE `paye` (
  `payeId` int(11) NOT NULL,
  `regionId` int(11) NOT NULL,
  `upperScheme` int(11) DEFAULT NULL,
  `middleScheme` int(11) DEFAULT NULL,
  `lowerScheme` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `paymentMethod`
--

CREATE TABLE `paymentMethod` (
  `payMethodId` int(11) DEFAULT NULL,
  `paymentMethodIdentifier` int(11) DEFAULT NULL,
  `paymentMethodName` varchar(15) DEFAULT NULL,
  `profOfPayment` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `payPeriod`
--

CREATE TABLE `payPeriod` (
  `payChequeID` int(11) DEFAULT NULL,
  `periodName` char(1) DEFAULT NULL,
  `dateFrom` date DEFAULT NULL,
  `dateTo` date DEFAULT NULL,
  `dateCreated` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `salaryAdvance`
--

CREATE TABLE `salaryAdvance` (
  `employeeID` int(11) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `salaryAdvanceStatus` int(11) DEFAULT NULL,
  `dateCreated` varchar(15) DEFAULT NULL,
  `lastUpdated` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `salaryProfile`
--

CREATE TABLE `salaryProfile` (
  `salaryInfoId` int(11) NOT NULL,
  `employeeId` int(11) DEFAULT NULL,
  `benefitId` int(11) DEFAULT NULL,
  `salaryStructure` int(11) DEFAULT NULL,
  `basicSalary` int(11) DEFAULT NULL,
  `netSalary` int(11) DEFAULT NULL,
  `pensionRate` int(11) DEFAULT NULL,
  `medicalInsurance` int(11) DEFAULT NULL,
  `privateMedicalInsurance` int(11) DEFAULT NULL,
  `monthlyWage` int(11) DEFAULT NULL,
  `profileStatus` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `subscriptions`
--

CREATE TABLE `subscriptions` (
  `subscriptionId` int(11) NOT NULL,
  `subscriptionTypeId` int(11) DEFAULT NULL,
  `subscriptionStatus` int(11) DEFAULT NULL,
  `timeRemaining` varchar(15) DEFAULT NULL,
  `dateCreated` varchar(15) DEFAULT NULL,
  `lastUpdated` varchar(15) DEFAULT NULL,
  `companyID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `subscriptionTypes`
--

CREATE TABLE `subscriptionTypes` (
  `subscriptionId` int(11) NOT NULL,
  `type` int(11) DEFAULT NULL,
  `subscriptionCost` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `taxRegion`
--

CREATE TABLE `taxRegion` (
  `regionId` int(11) NOT NULL,
  `regionName` varchar(50) NOT NULL,
  `pensionRate` int(11) DEFAULT NULL,
  `medicalInsuranceRate` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`companyId`);

--
-- Indexes for table `companyBenefits`
--
ALTER TABLE `companyBenefits`
  ADD PRIMARY KEY (`benefitId`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employeeId`);

--
-- Indexes for table `employeeBenefits`
--
ALTER TABLE `employeeBenefits`
  ADD PRIMARY KEY (`employeeBenefitId`);

--
-- Indexes for table `nextOfKin`
--
ALTER TABLE `nextOfKin`
  ADD PRIMARY KEY (`nextOfKinId`);

--
-- Indexes for table `payCheques`
--
ALTER TABLE `payCheques`
  ADD PRIMARY KEY (`chequeId`);

--
-- Indexes for table `paye`
--
ALTER TABLE `paye`
  ADD PRIMARY KEY (`payeId`);

--
-- Indexes for table `salaryProfile`
--
ALTER TABLE `salaryProfile`
  ADD PRIMARY KEY (`salaryInfoId`);

--
-- Indexes for table `subscriptions`
--
ALTER TABLE `subscriptions`
  ADD PRIMARY KEY (`subscriptionId`);

--
-- Indexes for table `subscriptionTypes`
--
ALTER TABLE `subscriptionTypes`
  ADD PRIMARY KEY (`subscriptionId`);

--
-- Indexes for table `taxRegion`
--
ALTER TABLE `taxRegion`
  ADD PRIMARY KEY (`regionId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `companyBenefits`
--
ALTER TABLE `companyBenefits`
  MODIFY `benefitId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `employeeId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `employeeBenefits`
--
ALTER TABLE `employeeBenefits`
  MODIFY `employeeBenefitId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `nextOfKin`
--
ALTER TABLE `nextOfKin`
  MODIFY `nextOfKinId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `payCheques`
--
ALTER TABLE `payCheques`
  MODIFY `chequeId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `salaryProfile`
--
ALTER TABLE `salaryProfile`
  MODIFY `salaryInfoId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `subscriptions`
--
ALTER TABLE `subscriptions`
  MODIFY `subscriptionId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `subscriptionTypes`
--
ALTER TABLE `subscriptionTypes`
  MODIFY `subscriptionId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `taxRegion`
--
ALTER TABLE `taxRegion`
  MODIFY `regionId` int(11) NOT NULL AUTO_INCREMENT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

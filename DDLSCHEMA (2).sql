-- Create Database
CREATE DATABASE IF NOT EXISTS BankingManagementSystem;

-- Use the created database
USE BankingManagementSystem;

-- ============================================
-- Table: Customer
-- Stores personal details of customers.
-- ============================================
CREATE TABLE Customer (
    customerId VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(20),
    address VARCHAR(255),
    dateOfBirth DATE,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- ============================================
-- Table: BankAccount
-- Stores bank account details for each customer.
-- ============================================
CREATE TABLE BankAccount (
    accountId VARCHAR(50) PRIMARY KEY,
    accountHolderName VARCHAR(100),
    balance DOUBLE,
    accountType VARCHAR(50),
    branchName VARCHAR(100),
    bankName VARCHAR(100),
    accountStatus BOOLEAN,
    customerId VARCHAR(50),
    FOREIGN KEY (customerId) REFERENCES Customer(customerId)
);

-- ============================================
-- Table: BankTransaction
-- Records transactions related to bank accounts.
-- ============================================
CREATE TABLE BankTransaction (
    transactionId VARCHAR(50) PRIMARY KEY,
    accountId VARCHAR(50),
    type VARCHAR(50),
    amount DOUBLE,
    date TIMESTAMP,
    status VARCHAR(50),
    FOREIGN KEY (accountId) REFERENCES BankAccount(accountId)
);

-- ============================================
-- Table: Loan
-- Records loan details for customers.
-- ============================================
CREATE TABLE Loan (
    loanId VARCHAR(50) PRIMARY KEY,
    customerId VARCHAR(50),
    loanType VARCHAR(50),
    loanAmount DOUBLE,
    interestRate DOUBLE,
    durationMonths INT,
    loanStatus VARCHAR(50),
    issueDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (customerId) REFERENCES Customer(customerId)
);

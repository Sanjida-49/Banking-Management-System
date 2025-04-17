-- Select the database to use
USE BankingManagementSystem;

-- Insert records into Customer table
INSERT INTO Customer (customerId, name, email, phone, address, dateOfBirth) VALUES
('CUST001', 'Customer_1', 'customer1@bank.com', '9876590491', '17 Main Street', '1989-06-21'),
('CUST002', 'Customer_2', 'customer2@bank.com', '9876519843', '66 Main Street', '1999-11-27'),
('CUST003', 'Customer_3', 'customer3@bank.com', '9876535936', '59 Main Street', '1997-12-23'),
('CUST004', 'Customer_4', 'customer4@bank.com', '9876524367', '45 Oak Street', '1985-02-14'),
('CUST005', 'Customer_5', 'customer5@bank.com', '9876543210', '34 Maple Street', '1991-08-19'),
('CUST006', 'Customer_6', 'customer6@bank.com', '9876598321', '87 Pine Street', '2000-05-30'),
('CUST007', 'Customer_7', 'customer7@bank.com', '9876549876', '23 Elm Street', '1992-12-15'),
('CUST008', 'Customer_8', 'customer8@bank.com', '9876591234', '56 Birch Street', '1995-07-25'),
('CUST009', 'Customer_9', 'customer9@bank.com', '9876532198', '12 Cedar Street', '1993-11-01'),
('CUST010', 'Customer_10', 'customer10@bank.com', '9876514789', '19 Oak Street', '1987-10-05'),
('CUST011', 'Customer_11', 'customer11@bank.com', '9876573210', '76 Pine Street', '1988-04-12');

-- Insert records into BankAccount table (customerId references Customer)
INSERT INTO BankAccount (accountId, accountHolderName, balance, accountType, branchName, bankName, accountStatus, customerId) VALUES
('ACC001', 'Customer_1', 10000.00, 'Savings', 'Branch_1', 'Global Bank', TRUE, 'CUST001'),
('ACC002', 'Customer_2', 15000.00, 'Current', 'Branch_2', 'Global Bank', TRUE, 'CUST002'),
('ACC003', 'Customer_3', 12000.00, 'Savings', 'Branch_3', 'Global Bank', FALSE, 'CUST003'),
('ACC004', 'Customer_4', 25000.00, 'Current', 'Branch_1', 'Global Bank', TRUE, 'CUST004'),
('ACC005', 'Customer_5', 18000.00, 'Savings', 'Branch_2', 'Global Bank', TRUE, 'CUST005'),
('ACC006', 'Customer_6', 20000.00, 'Current', 'Branch_3', 'Global Bank', FALSE, 'CUST006'),
('ACC007', 'Customer_7', 22000.00, 'Savings', 'Branch_4', 'Global Bank', TRUE, 'CUST007'),
('ACC008', 'Customer_8', 13000.00, 'Current', 'Branch_5', 'Global Bank', TRUE, 'CUST008'),
('ACC009', 'Customer_9', 17000.00, 'Savings', 'Branch_1', 'Global Bank', FALSE, 'CUST009'),
('ACC010', 'Customer_10', 19000.00, 'Current', 'Branch_2', 'Global Bank', TRUE, 'CUST010'),
('ACC011', 'Customer_11', 21000.00, 'Savings', 'Branch_3', 'Global Bank', FALSE, 'CUST011');

-- Insert records into BankTransaction table (accountId references BankAccount)
INSERT INTO BankTransaction (transactionId, accountId, type, amount, date, status) VALUES
('TXN001', 'ACC001', 'Deposit', 5000.00, '2024-04-01', 'Success'),
('TXN002', 'ACC002', 'Withdrawal', 3000.00, '2024-04-02', 'Success'),
('TXN003', 'ACC003', 'Deposit', 2000.00, '2024-04-03', 'Failed'),
('TXN004', 'ACC004', 'Deposit', 7000.00, '2024-04-04', 'Pending'),
('TXN005', 'ACC005', 'Withdrawal', 4000.00, '2024-04-05', 'Success'),
('TXN006', 'ACC006', 'Deposit', 6000.00, '2024-04-06', 'Success'),
('TXN007', 'ACC007', 'Withdrawal', 2500.00, '2024-04-07', 'Success'),
('TXN008', 'ACC008', 'Transfer', 5000.00, '2024-04-08', 'Success'),
('TXN009', 'ACC009', 'Deposit', 3000.00, '2024-04-09', 'Failed'),
('TXN010', 'ACC010', 'Withdrawal', 6000.00, '2024-04-10', 'Pending'),
('TXN011', 'ACC011', 'Deposit', 8000.00, '2024-04-11', 'Success');

-- Insert records into Loan table (customerId references Customer)
INSERT INTO Loan (loanId, customerId, loanType, loanAmount, interestRate, durationMonths, loanStatus, issueDate) VALUES
('LOAN001', 'CUST001', 'Home', 150000.00, 5.5, 360, 'Approved', '2023-04-01'),
('LOAN002', 'CUST002', 'Personal', 25000.00, 7.5, 60, 'Pending', '2023-04-02'),
('LOAN003', 'CUST003', 'Auto', 20000.00, 6.0, 48, 'Approved', '2023-04-03'),
('LOAN004', 'CUST004', 'Home', 180000.00, 5.0, 180, 'Rejected', '2023-04-04'),
('LOAN005', 'CUST005', 'Personal', 30000.00, 8.0, 36, 'Approved', '2023-04-05'),
('LOAN006', 'CUST006', 'Home', 220000.00, 5.2, 240, 'Pending', '2023-04-06'),
('LOAN007', 'CUST007', 'Personal', 15000.00, 6.5, 48, 'Approved', '2023-04-07'),
('LOAN008', 'CUST008', 'Auto', 12000.00, 5.5, 36, 'Pending', '2023-04-08'),
('LOAN009', 'CUST009', 'Home', 250000.00, 4.8, 180, 'Rejected', '2023-04-09'),
('LOAN010', 'CUST010', 'Personal', 35000.00, 6.9, 60, 'Approved', '2023-04-10'),
('LOAN011', 'CUST011', 'Auto', 22000.00, 7.2, 48, 'Pending', '2023-04-11');

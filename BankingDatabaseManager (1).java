
/*****************************************************************************************************************************************************
   The BankingDatabaseManager class represents database operations for the BankingManagementSystem using JDBC. It supports insert, deletion and updation
   operations for Customer, BankAccount, BankTransaction, and Loan tables.
 **************************************************************************************************************************************************/

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankingDatabaseManager 
{

    private Connection connection;

    public BankingDatabaseManager(String url, String user, String password) throws SQLException 
    {
        connection = DriverManager.getConnection(url, user, password);
    }

    // ========================= Customer Methods =========================

    public void insertCustomer(Customer customer) throws SQLException 
    {
        String sql = "INSERT INTO Customer VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) 
        {
            stmt.setString(1, customer.getCustomerId());
            stmt.setString(2, customer.getName());
            stmt.setString(3, customer.getEmail());
            stmt.setString(4, customer.getPhone());
            stmt.setString(5, customer.getAddress());
            stmt.setString(6, customer.getDateOfBirth());
            stmt.setString(7, customer.getCreatedAt());
            stmt.executeUpdate();
        }
    }

    public void updateCustomerEmail(String customerId, String newEmail) throws SQLException 
    {
        String sql = "UPDATE Customer SET email = ? WHERE customerId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) 
        {
            stmt.setString(1, newEmail);
            stmt.setString(2, customerId);
            stmt.executeUpdate();
        }
    }

    public void deleteCustomer(String customerId) throws SQLException 
    {
        String sql = "DELETE FROM Customer WHERE customerId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) 
        {
            stmt.setString(1, customerId);
            stmt.executeUpdate();
        }
    }

    // ========================= BankAccount Methods =========================

    public void insertBankAccount(BankAccount account) throws SQLException 
    {
        String sql = "INSERT INTO BankAccount VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) 
        {
            stmt.setString(1, account.getAccountId());
            stmt.setString(2, account.getAccountHolderName());
            stmt.setDouble(3, account.getBalance());
            stmt.setString(4, account.getAccountType());
            stmt.setString(5, account.getBranchName());
            stmt.setString(6, account.getBankName());
            stmt.setBoolean(7, account.isAccountStatus());
            stmt.executeUpdate();
        }
    }

    public void updateBankAccountBalance(String accountId, double newBalance) throws SQLException 
    {
        String sql = "UPDATE BankAccount SET balance = ? WHERE accountId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDouble(1, newBalance);
            stmt.setString(2, accountId);
            stmt.executeUpdate();
        }
    }

    public void deleteBankAccount(String accountId) throws SQLException 
    {
        String sql = "DELETE FROM BankAccount WHERE accountId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) 
        {
            stmt.setString(1, accountId);
            stmt.executeUpdate();
        }
    }

    // ========================= BankTransaction Methods =========================

    public void insertTransaction(BankTransaction transaction) throws SQLException 
    {
        String sql = "INSERT INTO BankTransaction VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, transaction.getTransactionId());
            stmt.setString(2, transaction.getAccountId());
            stmt.setString(3, transaction.getType());
            stmt.setDouble(4, transaction.getAmount());
            stmt.setDate(5, transaction.getDate());
            stmt.setString(6, transaction.getStatus());
            stmt.executeUpdate();
        }
    }

    public void updateTransactionStatus(String transactionId, String newStatus) throws SQLException {
        String sql = "UPDATE BankTransaction SET status = ? WHERE transactionId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, newStatus);
            stmt.setString(2, transactionId);
            stmt.executeUpdate();
        }
    }

    public void deleteTransaction(String transactionId) throws SQLException 
    {
        String sql = "DELETE FROM BankTransaction WHERE transactionId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) 
        {
            stmt.setString(1, transactionId);
            stmt.executeUpdate();
        }
    }

    // ========================= Loan Methods =========================

    public void insertLoan(Loan loan) throws SQLException 
    {
        String sql = "INSERT INTO Loan VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) 
        {
            stmt.setString(1, loan.getLoanId());
            stmt.setString(2, loan.getCustomerId());
            stmt.setString(3, loan.getLoanType());
            stmt.setDouble(4, loan.getLoanAmount());
            stmt.setDouble(5, loan.getInterestRate());
            stmt.setInt(6, loan.getDurationMonths());
            stmt.setString(7, loan.getLoanStatus());
            stmt.setString(8, loan.getIssueDate());
            stmt.executeUpdate();
        }
    }

    public void updateLoanStatus(String loanId, String newStatus) throws SQLException 
    {
        String sql = "UPDATE Loan SET loanStatus = ? WHERE loanId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) 
        {
            stmt.setString(1, newStatus);
            stmt.setString(2, loanId);
            stmt.executeUpdate();
        }
    }

    public void deleteLoan(String loanId) throws SQLException 
    {
        String sql = "DELETE FROM Loan WHERE loanId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) 
        {
            stmt.setString(1, loanId);
            stmt.executeUpdate();
        }
    }
}



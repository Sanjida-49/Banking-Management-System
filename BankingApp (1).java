import java.util.Scanner;
import java.sql.*;

public class BankingApp 
{
  private static BankingDatabaseManager dbManager;

    public static void main(String[] args) 
    {
        // Set up the database connection
        try {
            dbManager = new BankingDatabaseManager("jdbc:mysql://localhost:3306/BankingManagementSystem", "root","Riya2003#");
            Scanner scanner = new Scanner(System.in);
            int option;

            // Main menu for the app
            do {
                    System.out.println("\n===== Banking Management System =====");
                System.out.println("1. Add Customer");
                System.out.println("2. Update Customer Email");
                System.out.println("3. Delete Customer");
                System.out.println("4. Add Bank Account");
                System.out.println("5. Update Bank Account Balance");
                System.out.println("6. Delete Bank Account");
                System.out.println("7. Add Transaction");
                System.out.println("8. Update Transaction Status");
                System.out.println("9. Delete Transaction");
                System.out.println("10. Add Loan");
                System.out.println("11. Update Loan Status");
                System.out.println("12. Delete Loan");
                System.out.println("13. Exit");
                System.out.print("Choose an option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        addCustomer(scanner);
                        break;
                    case 2:
                        updateCustomerEmail(scanner);
                        break;
                    case 3:
                        deleteCustomer(scanner);
                        break;
                    case 4:
                        addBankAccount(scanner);
                        break;
                    case 5:
                        updateBankAccountBalance(scanner);
                        break;
                    case 6:
                        deleteBankAccount(scanner);
                        break;
                    case 7:
                        addTransaction(scanner);
                        break;
                    case 8:
                        updateTransactionStatus(scanner);
                        break;
                    case 9:
                        deleteTransaction(scanner);
                        break;
                    case 10:
                        addLoan(scanner);
                        break;
                    case 11:
                        updateLoanStatus(scanner);
                        break;
                    case 12:
                        deleteLoan(scanner);
                        break;
                    case 13:
                        System.out.println("Exiting... Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option, please try again.");
                        break;
                }
            } while (option != 13);
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }

    // Method to add a customer
    private static void addCustomer(Scanner scanner) {
        System.out.println("Enter customer details:");
        System.out.print("Customer ID: ");
        String customerId = scanner.next();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Phone: ");
        String phone = scanner.next();
        System.out.print("Address: ");
        String address = scanner.next();
        System.out.print("Date of Birth (YYYY-MM-DD): ");
        String dateOfBirth = scanner.next();
        System.out.print("Created At (YYYY-MM-DD): ");
        String createdAt = scanner.next();

        Customer customer = new Customer(customerId, name, email, phone, address, dateOfBirth, createdAt);
        try {
            dbManager.insertCustomer(customer);
            System.out.println("Customer added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding customer: " + e.getMessage());
        }
    }

    // Method to update customer email
    private static void updateCustomerEmail(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.next();
        System.out.print("Enter new email: ");
        String newEmail = scanner.next();
        try {
            dbManager.updateCustomerEmail(customerId, newEmail);
            System.out.println("Customer email updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating customer email: " + e.getMessage());
        }
    }

    // Method to delete a customer
    private static void deleteCustomer(Scanner scanner) {
        System.out.print("Enter customer ID to delete: ");
        String customerId = scanner.next();
        try {
            dbManager.deleteCustomer(customerId);
            System.out.println("Customer deleted successfully!");
        } catch (SQLException e) {
            System.out.println("Error deleting customer: " + e.getMessage());
        }
    }

    // Method to add a bank account
    private static void addBankAccount(Scanner scanner) {
        System.out.println("Enter bank account details:");
        System.out.print("Account ID: ");
        String accountId = scanner.next();
        System.out.print("Account Holder Name: ");
        String accountHolderName = scanner.next();
        System.out.print("Balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Account Type: ");
        String accountType = scanner.next();
        System.out.print("Branch Name: ");
        String branchName = scanner.next();
        System.out.print("Bank Name: ");
        String bankName = scanner.next();
        System.out.print("Account Status (true/false): ");
        boolean accountStatus = scanner.nextBoolean();

        BankAccount bankAccount = new BankAccount(accountId, accountHolderName, balance, accountType, branchName, bankName, accountStatus);
        try {
            dbManager.insertBankAccount(bankAccount);
            System.out.println("Bank account added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding bank account: " + e.getMessage());
        }
    }

    // Method to update bank account balance
    private static void updateBankAccountBalance(Scanner scanner) {
        System.out.print("Enter account ID: ");
        String accountId = scanner.next();
        System.out.print("Enter new balance: ");
        double newBalance = scanner.nextDouble();
        try {
            dbManager.updateBankAccountBalance(accountId, newBalance);
            System.out.println("Bank account balance updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating bank account balance: " + e.getMessage());
        }
    }

    // Method to delete a bank account
    private static void deleteBankAccount(Scanner scanner) {
        System.out.print("Enter account ID to delete: ");
        String accountId = scanner.next();
        try {
            dbManager.deleteBankAccount(accountId);
            System.out.println("Bank account deleted successfully!");
        } catch (SQLException e) {
            System.out.println("Error deleting bank account: " + e.getMessage());
        }
    }

    // Method to add a bank transaction
    private static void addTransaction(Scanner scanner) {
        System.out.println("Enter bank transaction details:");
        System.out.print("Transaction ID: ");
        String transactionId = scanner.next();
        System.out.print("Account ID: ");
        String accountId = scanner.next();
        System.out.print("Type (Deposit/Withdraw): ");
        String type = scanner.next();
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Date (YYYY-MM-DD): ");
        String date = scanner.next();
        System.out.print("Status (Completed/Failed): ");
        String status = scanner.next();

        BankTransaction transaction = new BankTransaction(transactionId, accountId, type, amount, Date.valueOf(date), status);
        try {
            dbManager.insertTransaction(transaction);
            System.out.println("Transaction added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding transaction: " + e.getMessage());
        }
    }

    // Method to update transaction status
    private static void updateTransactionStatus(Scanner scanner) {
        System.out.print("Enter transaction ID: ");
        String transactionId = scanner.next();
        System.out.print("Enter new status: ");
        String newStatus = scanner.next();
        try {
            dbManager.updateTransactionStatus(transactionId, newStatus);
            System.out.println("Transaction status updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating transaction status: " + e.getMessage());
        }
    }

    // Method to delete a transaction
    private static void deleteTransaction(Scanner scanner) {
        System.out.print("Enter transaction ID to delete: ");
        String transactionId = scanner.next();
        try {
            dbManager.deleteTransaction(transactionId);
            System.out.println("Transaction deleted successfully!");
        } catch (SQLException e) {
            System.out.println("Error deleting transaction: " + e.getMessage());
        }
    }

    // Method to add a loan
    private static void addLoan(Scanner scanner) {
        System.out.println("Enter loan details:");
        System.out.print("Loan ID: ");
        String loanId = scanner.next();
        System.out.print("Customer ID: ");
        String customerId = scanner.next();
        System.out.print("Loan Type: ");
        String loanType = scanner.next();
        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Interest Rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Duration (months): ");
        int durationMonths = scanner.nextInt();
        System.out.print("Loan Status: ");
        String loanStatus = scanner.next();
        System.out.print("Issue Date (YYYY-MM-DD): ");
        String issueDate = scanner.next();

        Loan loan = new Loan(loanId, customerId, loanType, loanAmount, interestRate, durationMonths, loanStatus, issueDate);
        try {
            dbManager.insertLoan(loan);
            System.out.println("Loan added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding loan: " + e.getMessage());
        }
    }

    // Method to update loan status
    private static void updateLoanStatus(Scanner scanner) {
        System.out.print("Enter loan ID: ");
        String loanId = scanner.next();
        System.out.print("Enter new loan status: ");
        String newStatus = scanner.next();
        try {
            dbManager.updateLoanStatus(loanId, newStatus);
            System.out.println("Loan status updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating loan status: " + e.getMessage());
        }
    }

    // Method to delete a loan
    private static void deleteLoan(Scanner scanner) {
        System.out.print("Enter loan ID to delete: ");
        String loanId = scanner.next();
        try {
            dbManager.deleteLoan(loanId);
            System.out.println("Loan deleted successfully!");
        } catch (SQLException e) {
            System.out.println("Error deleting loan: " + e.getMessage());
        }
    }
}

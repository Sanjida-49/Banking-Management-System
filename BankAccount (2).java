
/******************************************************************************************************************************************************
   The BankAccount class represents a bank account, including attributes such as account ID, account holder's name, balance, account type, and status, 
   with methods for deposit, withdrawal, and managing account details. 
 *******************************************************************************************************************************************************/


public class BankAccount
{
    private String accountId;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private String branchName;
    private String bankName;
    private boolean accountStatus;

    public BankAccount(String accountId, String accountHolderName, double balance, String accountType, 
                       String branchName, String bankName, boolean accountStatus) 
    {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.branchName = branchName;
        this.bankName = bankName;
        this.accountStatus = accountStatus;
    }

    // Getters and setters
    public String getAccountId() 
    {
        return accountId;
    }

    public void setAccountId(String accountId) 
    {
        this.accountId = accountId;
    }

    public String getAccountHolderName() 
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public String getAccountType() 
    {
        return accountType;
    }

    public void setAccountType(String accountType) 
    {
        this.accountType = accountType;
    }

    public String getBranchName() 
    {
        return branchName;
    }

    public void setBranchName(String branchName) 
    {
        this.branchName = branchName;
    }

    public String getBankName() 
    {
        return bankName;
    }

    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public boolean isAccountStatus() 
    {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) 
    {
        this.accountStatus = accountStatus;
    }

    // Method to deposit money into the account
    public void deposit(double amount) 
    {
        this.balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) 
    {
        if (this.balance >= amount)
        {
            this.balance -= amount;
        } 
        else 
        {
            System.out.println("Insufficient funds.");

        }  
    }
}  
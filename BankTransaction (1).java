/*****************************************************************************************************************************************************
 The BankTransaction class represents a financial transaction associated with a bank account, including attributes such as transaction ID, account ID,
 transaction type (e.g., deposit or withdrawal), amount, date, and status (e.g., completed or failed).
 *****************************************************************************************************************************************************/

import java.sql.Date;

public class BankTransaction 
{
    private String transactionId;
    private String accountId;
    private String type; // e.g., "Deposit", "Withdraw"
    private double amount;
    private Date date;
    private String status; // e.g., "Completed", "Failed"

    public BankTransaction(String transactionId, String accountId, String type, double amount, Date date, String status)
    {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    // Getters
    public String getTransactionId() 
    {
        return transactionId;
    }

    public String getAccountId() 
    {
        return accountId;
    }

    public String getType() 
    {
        return type;
    }

    public double getAmount() 
    {
        return amount;
    }

    public Date getDate() 
    {
        return date;
    }

    public String getStatus() 
    {
        return status;
    }

    // Setters
    public void setStatus(String status) 
    {
        this.status = status;
    }
}

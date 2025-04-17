
/******************************************************************************************************************************************
  The Loan class represents a loan issued to a customer, including  attributes like loan ID, loan amount, type, interest rate, and status,
  supporting loan tracking and repayment management.
 *****************************************************************************************************************************************/
public class Loan 
{
    private String loanId;
    private String customerId;
    private String loanType;
    private double loanAmount;
    private double interestRate;
    private int durationMonths;
    private String loanStatus;
    private String issueDate;

    // Constructor
    public Loan(String loanId, String customerId, String loanType, double loanAmount, double interestRate, int durationMonths, String loanStatus, String issueDate) {
        this.loanId = loanId;
        this.customerId = customerId;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.durationMonths = durationMonths;
        this.loanStatus = loanStatus;
        this.issueDate = issueDate;
    }

    // Getters and Setters
    public String getLoanId() 
    {    
        return loanId; 
    }
    public void setLoanId(String loanId) 
    {   
        this.loanId = loanId; 
    }
    public String getCustomerId()
    {    
        return customerId; 
    }
    public void setCustomerId(String customerId) 
    {   
        this.customerId = customerId; 
    }
    public String getLoanType() 
    {    
        return loanType; 
    }
    public void setLoanType(String loanType) 
    {    
        this.loanType = loanType;
    }
    public double getLoanAmount() 
    {   
        return loanAmount; 
    }
    public void setLoanAmount(double loanAmount) 
    {   
        this.loanAmount = loanAmount; 
    }
    public double getInterestRate() 
    {   
        return interestRate;
    }
    public void setInterestRate(double interestRate) 
    {   
        this.interestRate = interestRate; 
    }
    public int getDurationMonths() 
    {   
        return durationMonths; 
    }
    public void setDurationMonths(int durationMonths) 
    {   
        this.durationMonths = durationMonths; 
    }
    public String getLoanStatus() 
    {   
        return loanStatus; 
    }
    public void setLoanStatus(String loanStatus) 
    {   
        this.loanStatus = loanStatus;
    }
    public String getIssueDate() 
    {    
        return issueDate; 
    }
    public void setIssueDate(String issueDate) 
    {   
        this.issueDate = issueDate; 
    }
}

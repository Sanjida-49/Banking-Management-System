/****************************************************************************************************************************************************
  The Customer class represents a bank customer, including attributes such as customer ID, name, contact information, address, and date 
  of birth, used for identifying and managing customer records.
 ***************************************************************************************************************************************************/
 
public class Customer 
{
    private String customerId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String dateOfBirth;
    private String createdAt;

    // Constructor
    public Customer(String customerId, String name, String email, String phone, String address, String dateOfBirth, String createdAt) 
    {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public String getCustomerId() 
    {  
        return customerId; 
    }
    public void setCustomerId(String customerId) 
    {   
        this.customerId = customerId; 
    }
    public String getName() 
    {   
        return name; 
    }
    public void setName(String name) 
    {   
        this.name = name; 
    }
    public String getEmail() 
    {   
        return email; 
    }
    public void setEmail(String email) 
    {  
        this.email = email; 
    }
    public String getPhone() 
    {   
        return phone; 
    }
    public void setPhone(String phone) 
    {   
        this.phone = phone;
    }
    public String getAddress() 
    {   
        return address; 
    }
    public void setAddress(String address) 
    {   
        this.address = address; 
    }
    public String getDateOfBirth() 
    {   
        return dateOfBirth; 
    }
    public void setDateOfBirth(String dateOfBirth) 
    {  
        this.dateOfBirth = dateOfBirth; 
    }
    public String getCreatedAt() 
    {   
        return createdAt; 
    }
    public void setCreatedAt(String createdAt) 
    {   
        this.createdAt = createdAt; 
    }
}

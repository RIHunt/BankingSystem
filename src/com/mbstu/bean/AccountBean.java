
package com.mbstu.bean;


public class AccountBean {
   
    private String AccNo;
    private String AccName;
    private String custName;
    private String Balance;
    private String Address;
    private String secCode;
    private String MobileNo;
    private String EmailID;
    private String Image;

    public AccountBean(String AccNo, String AccName, String custName, String Balance, String Address, String secCode, String MobileNo, String EmailID, String Image) {
        this.AccNo = AccNo;
        this.AccName = AccName;
        this.custName = custName;
        this.Balance = Balance;
        this.Address = Address;
        this.secCode = secCode;
        this.MobileNo = MobileNo;
        this.EmailID = EmailID;
        this.Image = Image;
    }



    public AccountBean() {
       
    }





    public String getAccName() {
        return AccName;
    }

    public void setAccName(String AccName) {
        this.AccName = AccName;
    }

    public String getAccNo() {
    
        
        return AccNo;
    }

    public void setAccNo(String AccNo) {
       
             this.AccNo = AccNo;
        
      
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

   
   



}

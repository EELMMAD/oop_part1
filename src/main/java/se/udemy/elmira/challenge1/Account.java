package se.udemy.elmira.challenge1;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customersPhoneNumber;

    public Account() {
        this("56789", 2.50,"Default name", "Default adress", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customersPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customersPhoneNumber = customersPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customersPhoneNumber) {
        this("99999", 100.55, customerName, customerEmailAddress, customersPhoneNumber);
    }

    public void deposit(double depositAmount){
       this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
      if(this.balance - withdrawalAmount < 0){
          System.out.println("Only " + this.balance + " available. Withdrawal not processed");
      }else{
         this.balance -= withdrawalAmount;
          System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
      }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomersPhoneNumber() {
        return customersPhoneNumber;
    }

    public void setCustomersPhoneNumber(String customersPhoneNumber) {
        this.customersPhoneNumber = customersPhoneNumber;
    }
}

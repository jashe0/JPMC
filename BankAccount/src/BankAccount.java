public class BankAccount {

    private String customerName;
    private String accountNumber;
    private double accountBalance;
    private String emailAddress;
    private String phoneNumber;

    public BankAccount(){
        this("56789",2.50,"Default name","Default address","Default phone");
        System.out.println("Empty constructor called");

    }

    public BankAccount(String accountNumber,double accountBalance, String customerName, String emailAddress, String phoneNumber){
        System.out.println("Constructor with parameters called");
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String emailAddress, String phoneNumber) {
        this("99999", 100.55, customerName, emailAddress,phoneNumber);
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public  void depositFunds (double depositAmount){
        accountBalance+=depositAmount;
        System.out.println("Deposit amount = "+depositAmount+" new balance is "+accountBalance);
    }

    public void withdrawFunds (double withdrawalAmount){
        if(accountBalance - withdrawalAmount < 0){
            System.out.println("Insufficient funds");
        }else{
            accountBalance-=withdrawalAmount;
            System.out.println("Withdrawal amount = "+withdrawalAmount+" new balance is "+accountBalance);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /*
    public void setAccountNumber(int accountNumber) {
          this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance) {
      this.accountBalance = accountBalance;
    }
    public void setEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
    }
    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }
    */


}

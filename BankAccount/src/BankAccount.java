public class BankAccount {

    private String customerName;
    private int accountNumber;
    private double accountBalance;
    private String emailAddress;
    private String phoneNumber;

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

    public int getAccountNumber() {
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


}

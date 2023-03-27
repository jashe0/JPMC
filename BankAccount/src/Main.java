public class Main {
    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(1000);
        bobsAccount.withdrawFunds(50);
    }
}

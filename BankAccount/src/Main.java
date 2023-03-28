public class Main {
    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount("123452", 500, "Bob Brown","bobbrown@email.com","(087)1234567)");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());
        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(1000);
        bobsAccount.withdrawFunds(50);

        BankAccount timsAccount = new BankAccount("Tim","tim@email.com","12345");
        System.out.println("account no:"+timsAccount.getAccountNumber());
    }
}

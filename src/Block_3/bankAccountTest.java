package Block_3;


public class bankAccountTest {
    public static void main(String[] args) {
        bankAccount bankAccount = new bankAccount("12345");
        bankAccount bankAccount2 = new bankAccount("678910", 500);

        System.out.println(bankAccount.getAccountNumber() + " " + bankAccount.getBalance());
        System.out.println(bankAccount2.getAccountNumber() + " " + bankAccount2.getBalance());

        bankAccount.deposit(500);
        bankAccount2.withdraw(250);

        System.out.println(bankAccount.getAccountNumber() + " " + bankAccount.getBalance());
        System.out.println(bankAccount2.getAccountNumber() + " " + bankAccount2.getBalance());

        bankAccount.deposit( -500);
        bankAccount2.withdraw(350);

        System.out.println(bankAccount.getAccountNumber() + " " + bankAccount.getBalance());
        System.out.println(bankAccount2.getAccountNumber() + " " + bankAccount2.getBalance());
    }
}

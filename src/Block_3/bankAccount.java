package Block_3;

public class bankAccount {
    private final String accountNumber;
    private double balance;
    public bankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public bankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        } else{
            System.out.println("Einzahlung darf nicht negativ sein");
        }
    }

    public void withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
        } else{
            System.out.println("Kontostand zu gering");
        }
    }

}

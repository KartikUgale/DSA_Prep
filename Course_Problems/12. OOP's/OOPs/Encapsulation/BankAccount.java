package OOPs.Encapsulation;

public class BankAccount {
    private String accountHolderName;       // Data hiding
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String newName, String pass) {
        if (pass == "Pass@123") {
            accountHolderName = newName;
            System.out.println("Password Change");
            return;
        }
        System.out.println("Password Error!");
    }

    public double getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.println("Balance : "+ balance);
    }

    public void deposit(double money) {
        balance += money;
        System.out.println("Successfully Deposited : " + money);
    }

    public void withdraw(double money) {
        if (money > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= money;
        System.out.println("Successfully Withdraw : " + money);
    }
}

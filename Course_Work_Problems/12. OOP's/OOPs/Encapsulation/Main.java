package OOPs.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Kartik", 500);
        b1.deposit(9000);
        b1.withdraw(2000);
        System.out.println(b1.getBalance());

        BankAccount b2 = new BankAccount("Sham", 500);
        b2.deposit(400);
        b2.printBalance();

        b1.setAccountHolderName("Kartik U.", "pass@12345");
        System.out.println(b1.getAccountHolderName());

        b1.setAccountHolderName("Kartik Ugale", "Pass@123");
        System.out.println(b1.getAccountHolderName());
    }
}

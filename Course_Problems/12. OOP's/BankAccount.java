public class BankAccount {
    public static void main(String[] args) {
        BankAcc acc1 = new BankAcc();

        acc1.name = "Kartik Ambadas Ugale";
        System.out.println(acc1.name);

        // acc1.pass = "kar1234556"; <-- Not changable due to "private"
        // modifier/specifier.
        acc1.setPass("Kar12345678"); // <-- we can it change because of function(setPass) but it can not access due
                                     // to "Private".
        // System.out.println(acc1.pass); <-- Not Accesable

    }
}

class BankAcc {
    public String name;
    private String pass;

    void setPass(String newPass) {
        pass = newPass;
    }
}

import java.util.*;

public class IncomeTaxCal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income");
        int Income = sc.nextInt();

        if (Income < 500000 && Income > 0) {
            System.out.println("Your Tax amount is 0");
        } else if (Income > 500000 && Income < 1000000) {
            System.out.println("Your Tax Amount is " + (int) (Income * 0.2F) + " /- RS");
        } else if (Income > 1000000) {
            System.out.println("Your Tax Amount is " + (int) (Income * 0.3F) + " /- RS");
        } else if (Income < 0) {
            System.out.println("$ You are in Debt $");
        } else {
            System.out.println("Something Wrong :(");
        }
        sc.close();
    }
}
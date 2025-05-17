import java.util.*;

public class Q2_Fever {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Your Temperature in F");
        float YourTemp = sc.nextFloat();

        if (YourTemp >= 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You dont have a fever");
        }

        sc.close();
    }
}

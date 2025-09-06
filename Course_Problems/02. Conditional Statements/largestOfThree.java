import java.util.*;

public class largestOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3 Numbers");

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a <= c && b <= c) {
            System.out.println(c + " is larger");
        } else if (a <= b && b >= c) {
            System.out.println(b + " is larger");
        } else if (a >= b && a >= c) {
            System.out.println(a + " is larger");
        }
        sc.close();
    }
}
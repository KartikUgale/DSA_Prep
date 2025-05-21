import java.util.*;

public class Revers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        while (num > 0) {
            int LastDigit = num % 10;
            System.out.print(LastDigit);
            num /= 10;
        }
    }
}
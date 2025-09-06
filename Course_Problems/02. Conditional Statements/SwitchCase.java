import java.util.*;

public class SwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value 1");
        float N1 = sc.nextFloat();

        System.out.println("Enter Value 2 ");
        float N2 = sc.nextFloat();

        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(N1 + N2);
                break;
            case '-':
                System.out.println(N1 - N2);
                break;
            case '*':
                System.out.println(N1 * N2);
                break;
            case '/':
                System.out.println(N1 / N2);
                break;
        }

        sc.close();
    }
}
import java.util.*;

public class factorialOfn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
        int factorial = 1;
        if (num < 0) {
            System.out.print("Number is -ve");
        } else {
            for (int i = 0; num > i; i++) {
                factorial *= (num - i);
            }
            System.out.println(num + "! = " + factorial);
        }
    }
}
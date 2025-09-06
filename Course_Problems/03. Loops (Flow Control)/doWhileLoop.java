import java.util.*;

public class doWhileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int i = 1;
        do {
            System.out.println("Hello java");
            i++;
        } while (i <= num);

        sc.close();
    }
}
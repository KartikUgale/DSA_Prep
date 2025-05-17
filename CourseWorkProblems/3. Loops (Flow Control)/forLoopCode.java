import java.util.*;

public class forLoopCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = sc.nextLine();

        System.out.println("How many times you want to print");
        int num = sc.nextInt();

        for (int i = 1; i<=num;i++) {
            System.out.println(i+" - "+name);
        }
    }
}

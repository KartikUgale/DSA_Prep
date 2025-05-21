import java.util.*;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int Num = sc.nextInt();

        int i = 1;
        do {
            System.out.println(Num + "x" + i + "= " + i * Num);
            i++;
        } while (i <= 10);

        sc.close();
    }
}

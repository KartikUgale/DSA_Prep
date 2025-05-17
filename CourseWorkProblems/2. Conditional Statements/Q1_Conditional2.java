import java.util.Scanner;

public class Q1_Conditional2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Value : ");
        int value = sc.nextInt();

        System.out.println((value < 0) ? "-ve Number" : "+ve Number");
        sc.close();
    }
}
import java.util.Scanner;

public class CharPattern{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        char alphabet = 'A';
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println();
        }

        sc.close();
    }
}
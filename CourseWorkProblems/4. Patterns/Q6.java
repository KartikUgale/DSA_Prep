import java.util.Scanner;

public class Q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int num = sc.nextInt();

        for (int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for (int k=i; k<num;k++) {
                System.out.print("    ");
            }
            for (int l=1; l<=i;l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=num; i++) {
            for (int j=i; j<=num; j++) {
                System.out.print("* ");
            }
            for (int k=1; k<i;k++) {
                System.out.print("    ");
            }
            for (int l=1;l<=(num+1)-i;l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

import java.util.*;

public class NumberPyramid {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        palindromic(num);
        sc.close();
    }
    // public static void numPatternPyramid(int rows) {
    //     for (int i = 1; i<=rows; i++) {
    //         for (int j = 1; j<=rows-i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int k = 1; k<=i; k++) {
    //             System.out.print(i+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void palindromic(int row) {
        for (int i = 1; i<=row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            } int a = i;
            for (int k = 1; k <= i; k++ ) {
                System.out.print(a+" ");
                a--;
            }
            for (int l=1; l<i; l++) {
                System.out.print(l+1+" ");
            }
            System.out.println();
        }
    }
}
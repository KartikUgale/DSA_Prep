import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Rows: ");
        // int row = sc.nextInt();
        // System.out.print("Enter Column: ");
        // int column = sc.nextInt();
        // hollow_Pattern(row, column);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        bin_Triangle(num);

        sc.close();
    }

    public static void hollow_Pattern(int totRows, int totColumn) { //  Q1 Hollow Pattern
        for (int i = 1; i <= totColumn; i++) {
            for (int j = 1; j <= totRows; j++) {
                if (i == 1 || j == 1 || j == totRows || i == totColumn) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_Rotated_halfPyramid(int num) { //   Q2 Inverted Rotated Half Pyramid
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverted_Half_Pyramid(int num) { //  Q3 Inverted half Pyramid
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num + 1) - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyds_Tri(int num) { // Q4 Floyds Triangle
        int n = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }

    public static void bin_Triangle(int num) {  // Q5 Bin Triangle
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        solid_rhombus(num);
        hollow_rhombus(num);
        sc.close();
    }

    public static void solid_rhombus(int column) { // Q1 Solid
        for (int i = 1; i <= column; i++) {
            for (int j = 1; j <= column - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= column; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void hollow_rhombus(int totCols) { // Q2  Hollow
        for (int i = 1; i <= totCols; i++) {
            for (int j = 1; j <= totCols - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= totCols; k++) {
                if (i == 1 || i == totCols || k == 1 || k == totCols) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

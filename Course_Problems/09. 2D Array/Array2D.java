import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }

        sc.close();
    }
}
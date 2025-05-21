import java.util.Scanner;           // Dont Use..

public class SearchIn2DArray {
    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found at cell no, (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not Found :(");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number which you want to search: ");
        int num = sc.nextInt();

        search(matrix, num);

        sc.close();
    }
}

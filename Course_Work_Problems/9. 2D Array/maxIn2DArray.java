import java.util.*;

public class maxIn2DArray {
    public static void maxNum(int arr[][]) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                maxNum = Math.max(maxNum, arr[i][j]);
            }
        }
        System.out.println("Max Number: " + maxNum);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        maxNum(matrix);
        sc.close();
    }
}

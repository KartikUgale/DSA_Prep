public class Q1countNum {
    public static void countNum(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 7 }, { 4, 7, 6 }, { 7, 8, 9 }, { 10, 7, 12 } };
        int num = 7;
        countNum(matrix, num);
    }
}

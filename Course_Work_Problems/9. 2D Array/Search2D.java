public class Search2D {
    public static boolean stairCase(int arr[][], int key) { // binary search only works when array is in sp.order
        int row = 0, col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("found at Index: (" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Not Found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 9, 10, 11, 12, 13, 14, 15, 16 },
                { 20, 21, 22, 23, 24, 25, 26, 27 } };
        int num = 20;
        stairCase(matrix, num);
    }
}

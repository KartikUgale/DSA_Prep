public class search {
    public static boolean find(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col > 0) {
            if (arr[row][col] == key) {
                System.out.println("found at Index: (" + row + "," + col + ")");
                return true;
            } else if (arr[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("Not Found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 11, 12, 13, 14 },
                { 15, 16, 17, 18 },
                { 19, 20, 21, 22 },
                { 23, 24, 25, 26 } };
        int num = 26;
        find(matrix, num);
    }
}
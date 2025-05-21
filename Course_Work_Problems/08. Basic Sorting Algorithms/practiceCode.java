
public class practiceCode {
    public static void bubbleSort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] < num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

        }
    }

    public static void selectionSort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    small = j;
                }
            }
            if (!(num[i] == num[small])) {
                int temp = num[i];
                num[i] = num[small];
                num[small] = temp;
                System.out.println(i);
            }
        }
    }

    public static void insertionSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int curr = num[i];
            int prev = i - 1;
            while (prev >= 0 && num[prev] < curr) {
                num[prev + 1] = num[prev];
                prev--;
            }
            num[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1, 6, 7, 8, 9, 12 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
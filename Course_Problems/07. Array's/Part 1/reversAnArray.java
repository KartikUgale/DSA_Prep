public class reversAnArray {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        revers_Array(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void revers_Array(int num[]) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
    }
}
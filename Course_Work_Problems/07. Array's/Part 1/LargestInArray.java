public class LargestInArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 60, 8, 10, 20 };
        System.out.println("Largest number = " + searchMax(numbers));
    }

    public static int searchMax(int num[]) {
        int largest = Integer.MIN_VALUE; // +infinity
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }
}

public class numbers {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        num(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void num(int num[]) {
        for (int i = 0; i < num.length; i++) {
            num[i] += 1;
        }
    }
}
public class subArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        sub_Arrays(numbers);
    }

    public static void sub_Arrays(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + "+");
                    sum += num[k];
                }
                System.out.print("  ");
            }
            System.out.print("=" + sum);
            System.out.println();
        }
    }
}

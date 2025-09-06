public class Recursion1stCode {
    public static void printNums(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printNums(n - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        printNums(num);
    }
}
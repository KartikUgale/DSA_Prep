public class BinaryStrings {
    public static void binString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            binString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        binString(4, 0, " ");
    }
}

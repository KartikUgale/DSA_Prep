public class OddEven01 {
    public static void bitWiseOddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        bitWiseOddEven(1);
        bitWiseOddEven(5);
        bitWiseOddEven(2);
        bitWiseOddEven(44);
    }
}
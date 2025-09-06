public class ClearBitInRange {
    public static int clear_bitsInRange(int num, int i, int j) {
        int a = ((~0) << j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return bitMask & num;
    }

    public static void main(String[] args) {
        System.out.println(clear_bitsInRange(10, 2, 4));
    }
}
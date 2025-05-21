public class Clear_ithPosnBit {
    public static void clearBitAt_ith(int num, int i) {
        int bitMask = ~(1 << i);
        System.out.println(bitMask & num);
    }

    public static void main(String[] args) {
        clearBitAt_ith(10, 1);
    }
}
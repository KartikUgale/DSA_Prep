public class ClearLast_iBits {
    public static int clearFrom_ithBit(int num, int i) {
        int bitMask = ~(0) << i;
        return (bitMask & num);
    }

    public static void main(String[] args) {
        System.out.println(clearFrom_ithBit(15, 2));
    }
}

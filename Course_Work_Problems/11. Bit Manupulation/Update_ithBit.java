public class Update_ithBit { // aproach 1
    public static int set_ithBit(int num, int i) {
        int bitMask = (1 << i);
        return (bitMask | num);
    }

    public static int clear_ithBit(int num, int i) {
        int bitMask = ~(1 << i);
        return (bitMask & num);
    }

    public static int update_ithBit(int num, int i, int newBit) {
        if (newBit == 0) {
            return clear_ithBit(num, i);
        } else {
            return set_ithBit(num, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(update_ithBit(10, 2, 1));
    }
}

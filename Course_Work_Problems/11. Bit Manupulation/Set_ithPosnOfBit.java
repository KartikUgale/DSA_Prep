public class Set_ithPosnOfBit {
    public static void set_ithPosn(int num, int i) {
        int bitMask = (1 << i);
        System.out.println((bitMask | num));
    }

    public static void main(String[] args) {
        set_ithPosn(10, 2);
    }
}

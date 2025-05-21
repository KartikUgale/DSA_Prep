public class Get_ithPosnOfBit {
    public static void print_ithPosn(int n, int i) {
        int bitMask = (1 << i);
        if ((bitMask & n) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        print_ithPosn(10, 1);
    }
}

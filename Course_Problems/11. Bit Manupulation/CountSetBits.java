public class CountSetBits {
    public static int countBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((1 & num) != 0) {
                count++;
            }
            num >>= 1; // num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(16));
    }
}

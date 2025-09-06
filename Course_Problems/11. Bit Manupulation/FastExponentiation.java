public class FastExponentiation {
    public static int fastExpo(int num, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) != 0) {
                ans *= num;
            }
            num *= num;
            power >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
    }
}

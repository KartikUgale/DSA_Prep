public class PowerOf2 {
    public static boolean isPowerOf2(int num) {
        return (num & num - 1) == 0;
    }

    public static void main(String[] args) {
        if (isPowerOf2(2)) {
            System.out.println("is Power of 2");
        } else {
            System.out.println("Not power of 2");
        }
    }
}
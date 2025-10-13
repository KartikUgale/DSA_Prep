public class Inheritance2 {
    public static void main(String[] args) {
        System.out.println(Math.min(10, 11));
    }
}

class Math {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static double min(double a, double b) {
        return (a < b) ? a : b;
    }
}

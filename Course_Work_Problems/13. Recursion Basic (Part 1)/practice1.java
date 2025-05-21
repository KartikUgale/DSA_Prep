public class practice1 {
    public static int factOfnum(int num) {
        if (num == 1) {
            return num;
        }
        return factOfnum(num - 1) * num;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factOfnum(num));
    }
}

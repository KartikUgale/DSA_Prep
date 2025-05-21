public class Q1 {
    public static boolean findRepeat(int[] value) {
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] == value[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4 };
        if (findRepeat(num)) {
            System.out.println("Repeat Number found");
        } else {
            System.out.println("Reapet Number Not found");
        }
    }
}

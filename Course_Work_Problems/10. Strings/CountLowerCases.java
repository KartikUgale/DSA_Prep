import java.util.*;

public class CountLowerCases {
    public static int lowerCaseCounter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (str.charAt(i) == ' ') {
                continue;
            }
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Write Something:");
        String str = new Scanner(System.in).nextLine();

        System.out.println("Total Lower Cases: " + lowerCaseCounter(str));
    }
}

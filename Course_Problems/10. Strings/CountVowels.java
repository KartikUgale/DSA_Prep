import java.util.*;

public class CountVowels {
    public static int vowelsCounter(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Write Something");
        String str = new Scanner(System.in).nextLine();

        System.out.println("number of Vowels: " + vowelsCounter(str));
    }
}
